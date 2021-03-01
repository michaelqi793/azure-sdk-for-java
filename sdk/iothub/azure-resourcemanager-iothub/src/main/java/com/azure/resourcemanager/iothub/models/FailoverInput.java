// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Use to provide failover region when requesting manual Failover for a hub. */
@Fluent
public final class FailoverInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FailoverInput.class);

    /*
     * Region the hub will be failed over to
     */
    @JsonProperty(value = "failoverRegion", required = true)
    private String failoverRegion;

    /**
     * Get the failoverRegion property: Region the hub will be failed over to.
     *
     * @return the failoverRegion value.
     */
    public String failoverRegion() {
        return this.failoverRegion;
    }

    /**
     * Set the failoverRegion property: Region the hub will be failed over to.
     *
     * @param failoverRegion the failoverRegion value to set.
     * @return the FailoverInput object itself.
     */
    public FailoverInput withFailoverRegion(String failoverRegion) {
        this.failoverRegion = failoverRegion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failoverRegion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property failoverRegion in model FailoverInput"));
        }
    }
}
