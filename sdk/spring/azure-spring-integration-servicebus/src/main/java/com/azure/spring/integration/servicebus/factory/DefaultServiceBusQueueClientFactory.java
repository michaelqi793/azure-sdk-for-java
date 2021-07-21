// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.factory;


import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.*;
import com.azure.messaging.servicebus.implementation.ServiceBusConstants;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.spring.integration.servicebus.ServiceBusClientConfig;
import com.azure.spring.integration.servicebus.ServiceBusMessageProcessor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Default implementation of {@link ServiceBusQueueClientFactory}. Client will be cached to improve performance
 *
 * @author Warren Zhu
 */
public class DefaultServiceBusQueueClientFactory extends AbstractServiceBusSenderFactory
    implements ServiceBusQueueClientFactory {

    private final Map<String, ServiceBusProcessorClient> processorClientMap = new ConcurrentHashMap<>();
    private final Map<String, ServiceBusReceiverAsyncClient> clientMap = new ConcurrentHashMap<>();
    private final Map<String, ServiceBusSenderAsyncClient> senderClientMap = new ConcurrentHashMap<>();

    // TODO (xiada) whether will this reuse the underlying connection?
    private final ServiceBusClientBuilder serviceBusClientBuilder;

    public DefaultServiceBusQueueClientFactory(String connectionString) {
        this(connectionString, AmqpTransportType.AMQP);
    }

    public DefaultServiceBusQueueClientFactory(String connectionString, AmqpTransportType amqpTransportType) {
        super(connectionString);
        this.serviceBusClientBuilder = new ServiceBusClientBuilder().connectionString(connectionString);
        this.serviceBusClientBuilder.transportType(amqpTransportType);
    }

    @Override
    public ServiceBusProcessorClient getOrCreateProcessor(
        String name,
        ServiceBusClientConfig clientConfig,
        ServiceBusMessageProcessor<ServiceBusReceivedMessageContext, ServiceBusErrorContext> messageProcessor) {
        return this.processorClientMap.computeIfAbsent(name,
                                                       n -> createProcessorClient(n, clientConfig, messageProcessor));
    }


    @Override
    public ServiceBusReceiverAsyncClient getOrCreateClient(
        String name,
        ServiceBusClientConfig clientConfig) {
        return this.clientMap.computeIfAbsent(name,
            n -> createAsyncClient(n, clientConfig));
    }

    @Override
    public ServiceBusSenderAsyncClient getOrCreateSender(String name) {
        return this.senderClientMap.computeIfAbsent(name, this::createQueueSender);
    }

    private ServiceBusProcessorClient createProcessorClient(
        String name,
        ServiceBusClientConfig clientConfig,
        ServiceBusMessageProcessor<ServiceBusReceivedMessageContext, ServiceBusErrorContext> messageProcessor) {
        if (clientConfig.isSessionsEnabled()) {
            return serviceBusClientBuilder.sessionProcessor()
                                          .queueName(name)
                                          .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                                          .maxConcurrentCalls(1)
                                          // TODO, make it a constant or get it from clientConfig. And it looks like
                                          //  max auto renew duration is not exposed
                                          .maxConcurrentSessions(clientConfig.getConcurrency())
                                          .prefetchCount(clientConfig.getPrefetchCount())
                                          .disableAutoComplete()
                                          .processMessage(messageProcessor.processMessage())
                                          .processError(messageProcessor.processError())
                                          .buildProcessorClient();

        } else {
            return serviceBusClientBuilder.processor()
                                          .queueName(name)
                                          .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                                          .maxConcurrentCalls(clientConfig.getConcurrency())
                                          .prefetchCount(clientConfig.getPrefetchCount())
                                          .disableAutoComplete()
                                          .processMessage(messageProcessor.processMessage())
                                          .processError(messageProcessor.processError())
                                          .buildProcessorClient();
        }

    }

    private ServiceBusSenderAsyncClient createQueueSender(String name) {
        return serviceBusClientBuilder.sender().queueName(name).buildAsyncClient();
    }


    private ServiceBusReceiverAsyncClient createAsyncClient( String name,
                                                             ServiceBusClientConfig clientConfig){
        return serviceBusClientBuilder.retryOptions(new AmqpRetryOptions().setTryTimeout(ServiceBusConstants.OPERATION_TIMEOUT))
                                      .receiver()
                                      .disableAutoComplete()
                                      .queueName(name)
                                      .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                                      .prefetchCount(clientConfig.getPrefetchCount())
                                      .buildAsyncClient();


    }
}
