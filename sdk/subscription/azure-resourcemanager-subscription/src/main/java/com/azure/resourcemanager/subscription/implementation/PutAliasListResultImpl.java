// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.implementation;

import com.azure.resourcemanager.subscription.fluent.models.PutAliasListResultInner;
import com.azure.resourcemanager.subscription.fluent.models.PutAliasResponseInner;
import com.azure.resourcemanager.subscription.models.PutAliasListResult;
import com.azure.resourcemanager.subscription.models.PutAliasResponse;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PutAliasListResultImpl implements PutAliasListResult {
    private PutAliasListResultInner innerObject;

    private final com.azure.resourcemanager.subscription.SubscriptionManager serviceManager;

    PutAliasListResultImpl(
        PutAliasListResultInner innerObject,
        com.azure.resourcemanager.subscription.SubscriptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PutAliasResponse> value() {
        List<PutAliasResponseInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PutAliasResponseImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PutAliasListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.subscription.SubscriptionManager manager() {
        return this.serviceManager;
    }
}
