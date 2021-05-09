// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.models.VaultProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Resource information with extended details. */
@Fluent
public final class VaultInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultInner.class);

    /*
     * Properties of the vault
     */
    @JsonProperty(value = "properties", required = true)
    private VaultProperties properties;

    /**
     * Get the properties property: Properties of the vault.
     *
     * @return the properties value.
     */
    public VaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     *
     * @param properties the properties value to set.
     * @return the VaultInner object itself.
     */
    public VaultInner withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VaultInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VaultInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property properties in model VaultInner"));
        } else {
            properties().validate();
        }
    }
}
