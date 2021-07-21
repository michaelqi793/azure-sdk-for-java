// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus;

import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient;
import com.azure.messaging.servicebus.models.AbandonOptions;
import com.azure.messaging.servicebus.models.CompleteOptions;
import com.azure.messaging.servicebus.models.DeadLetterOptions;
import com.azure.messaging.servicebus.models.DeferOptions;

import java.util.Objects;

/**
 * The Service Bus processor message context that holds a received message and additional methods to settle the message.
 */
public final class ServiceBusReceivedMessageContext {
    private final ServiceBusReceivedMessage serviceBusReceivedMessage;
    private final ServiceBusReceiverAsyncClient receiverClient;

    public ServiceBusReceivedMessageContext(
        ServiceBusReceivedMessage serviceBusReceivedMessage,
        ServiceBusReceiverAsyncClient receiverClient) {
        this.serviceBusReceivedMessage = Objects.requireNonNull(serviceBusReceivedMessage,
            "'receivedMessageContext' cannot be null");
        this.receiverClient = Objects.requireNonNull(receiverClient, "'receiverClient' cannot be null");
    }

    /**
     * Gets the message received from Service Bus.
     *
     * @return The message received from Service Bus.
     */
    public ServiceBusReceivedMessage getMessage() {
        return serviceBusReceivedMessage;
    }

    /**
     * Abandons the {@link #getMessage() message} in this context.
     */
    public void abandon() {
        receiverClient.abandon(serviceBusReceivedMessage).block();
    }

    /**
     * Abandons the {@link #getMessage() message} in this context.
     *
     * @param options Additional options for abandoning the message.
     */
    public void abandon(AbandonOptions options) {
        receiverClient.abandon(serviceBusReceivedMessage, options).block();
    }

    /**
     * Completes the {@link #getMessage() message} in this context.
     */
    public void complete() {
        receiverClient.complete(serviceBusReceivedMessage).block();
    }

    /**
     * Completes the {@link #getMessage() message} in this context.
     *
     * @param options Additional options for completing the message.
     * @throws NullPointerException if {@code options} are null.
     */
    public void complete(CompleteOptions options) {
        receiverClient.complete(serviceBusReceivedMessage, options).block();
    }

    /**
     * Defers the {@link #getMessage() message} in this context.
     */
    public void defer() {
        receiverClient.defer(serviceBusReceivedMessage).block();
    }

    /**
     * Defers the {@link #getMessage() message} in this context.
     *
     * @param options Additional options for deferring the message.
     * @throws NullPointerException if {@code options} are null.
     */
    public void defer(DeferOptions options) {
        receiverClient.defer(serviceBusReceivedMessage, options).block();
    }

    /**
     * Dead-letters the {@link #getMessage() message} in this context.
     */
    public void deadLetter() {
        receiverClient.deadLetter(serviceBusReceivedMessage).block();
    }

    /**
     * Dead-letters the {@link #getMessage() message} in this context.
     *
     * @param options Additional options for dead-lettering the message.
     *
     * @throws NullPointerException if {@code options} are null.
     */
    public void deadLetter(DeadLetterOptions options) {
        receiverClient.deadLetter(serviceBusReceivedMessage, options).block();
    }

    public String getEntityPath() {
        return receiverClient.getEntityPath();
    }

    public String getFullyQualifiedNamespace() {
        return receiverClient.getFullyQualifiedNamespace();
    }
}
