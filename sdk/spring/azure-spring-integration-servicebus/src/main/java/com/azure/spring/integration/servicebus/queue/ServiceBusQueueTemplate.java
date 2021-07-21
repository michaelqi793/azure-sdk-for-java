// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.queue;

import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.tracing.ProcessKind;
import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.spring.integration.core.api.CheckpointMode;
import com.azure.spring.integration.servicebus.ServiceBusReceivedMessageContext;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.spring.integration.servicebus.DefaultServiceBusMessageProcessor;
import com.azure.spring.integration.servicebus.ServiceBusClientConfig;
import com.azure.spring.integration.servicebus.ServiceBusRuntimeException;
import com.azure.spring.integration.servicebus.ServiceBusTemplate;
import com.azure.spring.integration.servicebus.converter.ServiceBusMessageConverter;
import com.azure.spring.integration.servicebus.converter.ServiceBusMessageHeaders;
import com.azure.spring.integration.servicebus.factory.ServiceBusQueueClientFactory;
import com.google.common.collect.Sets;
import org.reactivestreams.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.messaging.Message;
import org.springframework.util.Assert;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Signal;
import reactor.core.scheduler.Schedulers;

import java.util.*;
import java.util.function.Consumer;

import static com.azure.core.util.tracing.Tracer.*;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.AZ_TRACING_NAMESPACE_VALUE;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.AZ_TRACING_SERVICE_NAME;

/**
 * Default implementation of {@link ServiceBusQueueOperation}.
 */
public class ServiceBusQueueTemplate extends ServiceBusTemplate<ServiceBusQueueClientFactory>
    implements ServiceBusQueueOperation {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceBusQueueTemplate.class);

    private static final String MSG_FAIL_CHECKPOINT = "Failed to checkpoint %s in queue '%s'";

    private static final String MSG_SUCCESS_CHECKPOINT = "Checkpointed %s in queue '%s' in %s mode";

    private final Set<String> subscribedQueues = Sets.newConcurrentHashSet();

    private final ClientLogger logger = new ClientLogger(ServiceBusQueueTemplate.class);

    public ServiceBusQueueTemplate(ServiceBusQueueClientFactory clientFactory) {
        super(clientFactory);
    }

    public ServiceBusQueueTemplate(ServiceBusQueueClientFactory clientFactory,
                                   ServiceBusMessageConverter messageConverter) {
        super(clientFactory, messageConverter);
    }

    /**
     * Register a message handler to receive message from the queue. A session handler will be registered if session is
     * enabled.
     *
     * @param name The queue name.
     * @param consumer The consumer method.
     * @param payloadType The type of the message payload.
     * @throws ServiceBusRuntimeException If fail to register the queue message handler.
     */
    protected void internalSubscribe(String name, Consumer<Message<?>> consumer, Class<?> payloadType) {
        final DefaultServiceBusMessageProcessor messageProcessor = new DefaultServiceBusMessageProcessor(
            this.checkpointConfig, payloadType, consumer, this.messageConverter) {

            @Override
            protected String buildCheckpointFailMessage(Message<?> message) {
                return String.format(MSG_FAIL_CHECKPOINT, message, name);
            }

            @Override
            protected String buildCheckpointSuccessMessage(Message<?> message) {
                return String.format(MSG_SUCCESS_CHECKPOINT, message, name, getCheckpointConfig().getCheckpointMode());
            }
        };
        Consumer<ServiceBusReceivedMessageContext> serviceBusMessageConsumer = messageProcessor.processMessage();
        ServiceBusReceiverAsyncClient asyncReceiverClient = this.clientFactory.getOrCreateClient(name, clientConfig);
        Flux<ServiceBusReceivedMessageContext> fluxMessages = asyncReceiverClient.receiveMessages().map(x -> new ServiceBusReceivedMessageContext(x, asyncReceiverClient));
        @SuppressWarnings({"unchecked", "rawtypes"})
        CoreSubscriber<ServiceBusReceivedMessageContext>[] subscribers = new CoreSubscriber[clientConfig.getConcurrency()];

        for (int i = 0; i < clientConfig.getConcurrency(); i++) {
            subscribers[i] = new CoreSubscriber<ServiceBusReceivedMessageContext>() {
                private Subscription subscription = null;

                @Override
                public void onSubscribe(Subscription subscription) {
                    this.subscription = subscription;
                    subscription.request(1);
                }

                @Override
                public void onNext(ServiceBusReceivedMessageContext serviceBusReceivedMessageContext) {

                        Context processSpanContext = null;
                        try {
                            processSpanContext =
                                startProcessTracingSpan(serviceBusReceivedMessageContext.getMessage(),
                                    serviceBusReceivedMessageContext.getEntityPath(), serviceBusReceivedMessageContext.getFullyQualifiedNamespace());
                            serviceBusMessageConsumer.accept(serviceBusReceivedMessageContext);
                            if (checkpointConfig.getCheckpointMode() == CheckpointMode.RECORD) {
                                serviceBusReceivedMessageContext.complete();
                            }
                            endProcessTracingSpan(processSpanContext, Signal.complete());
                        } catch (Exception ex) {
                            endProcessTracingSpan(processSpanContext, Signal.error(ex));
                            if (checkpointConfig.getCheckpointMode() == CheckpointMode.RECORD) {
                                logger.warning("Error when processing message. Abandoning message.", ex);
                                serviceBusReceivedMessageContext.abandon();
                            }
                        }
                    logger.verbose("Requesting 1 more message from upstream");
                    subscription.request(1);
                    }


                @Override
                public void onError(Throwable throwable) {
                    logger.info("Error receiving messages.", throwable);

                }

                @Override
                public void onComplete() {
                    logger.info("Completed receiving messages.");
                }
            };
        }
       /*  fluxMessages.parallel(clientConfig.getConcurrency(), 1)
            .runOn(Schedulers.boundedElastic(), 1)
            .subscribe(subscribers);
*/
        fluxMessages.subscribe(subscribers[0]);

    }

    private Context startProcessTracingSpan(ServiceBusReceivedMessage receivedMessage, String entityPath,
                                            String fullyQualifiedNamespace) {

        Object diagnosticId = receivedMessage.getApplicationProperties().get(DIAGNOSTIC_ID_KEY);
        if (diagnosticId == null || !tracerProvider.isEnabled()) {
            return Context.NONE;
        }

        Context spanContext = tracerProvider.extractContext(diagnosticId.toString(), Context.NONE);

        spanContext = spanContext
            .addData(ENTITY_PATH_KEY, entityPath)
            .addData(HOST_NAME_KEY, fullyQualifiedNamespace)
            .addData(AZ_TRACING_NAMESPACE_KEY, AZ_TRACING_NAMESPACE_VALUE);
        spanContext = receivedMessage.getEnqueuedTime() == null
            ? spanContext
            : spanContext.addData(MESSAGE_ENQUEUED_TIME,
            receivedMessage.getEnqueuedTime().toInstant().getEpochSecond());

        return tracerProvider.startSpan(AZ_TRACING_SERVICE_NAME, spanContext, ProcessKind.PROCESS);
    }

    private void endProcessTracingSpan(Context processSpanContext, Signal<Void> signal) {
        if (processSpanContext == null) {
            return;
        }

        Optional<Object> spanScope = processSpanContext.getData(SCOPE_KEY);
        // Disposes of the scope when the trace span closes.
        if (!spanScope.isPresent() || !tracerProvider.isEnabled()) {
            return;
        }
        if (spanScope.get() instanceof AutoCloseable) {
            AutoCloseable close = (AutoCloseable) processSpanContext.getData(SCOPE_KEY).get();
            try {
                close.close();
            } catch (Exception exception) {
                logger.error("endTracingSpan().close() failed with an error %s", exception);
            }

        } else {
            logger.warning(String.format(Locale.US,
                "Process span scope type is not of type AutoCloseable, but type: %s. Not closing the scope"
                    + " and span", spanScope.get() != null ? spanScope.getClass() : "null"));
        }
        tracerProvider.endSpan(processSpanContext, signal);
    }

    @Override
    public void setClientConfig(@NonNull ServiceBusClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    @Override
    public <T> void deadLetter(String destination,
                               Message<T> message,
                               String deadLetterReason,
                               String deadLetterErrorDescription) {
        Assert.hasText(destination, "destination can't be null or empty");


        final ServiceBusReceivedMessageContext messageContext = (ServiceBusReceivedMessageContext) message.getHeaders()
                                                                                                          .get(
                                                                                                              ServiceBusMessageHeaders.RECEIVED_MESSAGE_CONTEXT);

        if (messageContext != null) {
            messageContext.deadLetter();
        }
    }

    @Override
    public <T> void abandon(String destination, Message<T> message) {
        Assert.hasText(destination, "destination can't be null or empty");


        final ServiceBusReceivedMessageContext messageContext = (ServiceBusReceivedMessageContext) message.getHeaders()
                                                                                                          .get(
                                                                                                              ServiceBusMessageHeaders.RECEIVED_MESSAGE_CONTEXT);

        if (messageContext != null) {
            messageContext.abandon();
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean subscribe(String destination,
                             @NonNull Consumer<Message<?>> consumer,
                             @NonNull Class<?> targetPayloadClass) {
        Assert.hasText(destination, "destination can't be null or empty");

        if (subscribedQueues.contains(destination)) {
            return false;
        }

        subscribedQueues.add(destination);

        internalSubscribe(destination, consumer, targetPayloadClass);

        return true;
    }

    @Override
    public boolean unsubscribe(String destination) {
        // TODO: unregister message handler but service bus sdk unsupported
        return subscribedQueues.remove(destination);
    }

}
