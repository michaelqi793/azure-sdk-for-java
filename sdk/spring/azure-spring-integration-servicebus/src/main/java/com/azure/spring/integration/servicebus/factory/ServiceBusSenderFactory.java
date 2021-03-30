// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.integration.servicebus.factory;


/**
 * Factory to return functional creator of service bus sender
 *
 * @author Warren Zhu
 */
public interface ServiceBusSenderFactory {
    /**
     * Return a function which accepts service bus topic or queue name, then returns {@link IMessageSender}
     * @param name sender name
     * @return message sender implement instance
     */
    //IMessageSender getOrCreateSender(String name); // TODO may need to be replaced with a method that returns a ServiceBusSenderClient
}
