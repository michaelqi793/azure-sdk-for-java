// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountAgreementInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of integration account agreements. */
@Fluent
public final class IntegrationAccountAgreementListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IntegrationAccountAgreementListResult.class);

    /*
     * The list of integration account agreements.
     */
    @JsonProperty(value = "value")
    private List<IntegrationAccountAgreementInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of integration account agreements.
     *
     * @return the value value.
     */
    public List<IntegrationAccountAgreementInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of integration account agreements.
     *
     * @param value the value value to set.
     * @return the IntegrationAccountAgreementListResult object itself.
     */
    public IntegrationAccountAgreementListResult withValue(List<IntegrationAccountAgreementInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the IntegrationAccountAgreementListResult object itself.
     */
    public IntegrationAccountAgreementListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
