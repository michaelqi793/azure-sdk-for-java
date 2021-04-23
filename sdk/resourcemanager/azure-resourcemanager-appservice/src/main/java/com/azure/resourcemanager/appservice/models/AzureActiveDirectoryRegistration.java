// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureActiveDirectoryRegistration model. */
@JsonFlatten
@Fluent
public class AzureActiveDirectoryRegistration extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureActiveDirectoryRegistration.class);

    /*
     * The openIdIssuer property.
     */
    @JsonProperty(value = "properties.openIdIssuer")
    private String openIdIssuer;

    /*
     * The clientId property.
     */
    @JsonProperty(value = "properties.clientId")
    private String clientId;

    /*
     * The clientSecretSettingName property.
     */
    @JsonProperty(value = "properties.clientSecretSettingName")
    private String clientSecretSettingName;

    /*
     * The clientSecretCertificateThumbprint property.
     */
    @JsonProperty(value = "properties.clientSecretCertificateThumbprint")
    private String clientSecretCertificateThumbprint;

    /**
     * Get the openIdIssuer property: The openIdIssuer property.
     *
     * @return the openIdIssuer value.
     */
    public String openIdIssuer() {
        return this.openIdIssuer;
    }

    /**
     * Set the openIdIssuer property: The openIdIssuer property.
     *
     * @param openIdIssuer the openIdIssuer value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withOpenIdIssuer(String openIdIssuer) {
        this.openIdIssuer = openIdIssuer;
        return this;
    }

    /**
     * Get the clientId property: The clientId property.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The clientId property.
     *
     * @param clientId the clientId value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecretSettingName property: The clientSecretSettingName property.
     *
     * @return the clientSecretSettingName value.
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }

    /**
     * Set the clientSecretSettingName property: The clientSecretSettingName property.
     *
     * @param clientSecretSettingName the clientSecretSettingName value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretSettingName(String clientSecretSettingName) {
        this.clientSecretSettingName = clientSecretSettingName;
        return this;
    }

    /**
     * Get the clientSecretCertificateThumbprint property: The clientSecretCertificateThumbprint property.
     *
     * @return the clientSecretCertificateThumbprint value.
     */
    public String clientSecretCertificateThumbprint() {
        return this.clientSecretCertificateThumbprint;
    }

    /**
     * Set the clientSecretCertificateThumbprint property: The clientSecretCertificateThumbprint property.
     *
     * @param clientSecretCertificateThumbprint the clientSecretCertificateThumbprint value to set.
     * @return the AzureActiveDirectoryRegistration object itself.
     */
    public AzureActiveDirectoryRegistration withClientSecretCertificateThumbprint(
        String clientSecretCertificateThumbprint) {
        this.clientSecretCertificateThumbprint = clientSecretCertificateThumbprint;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureActiveDirectoryRegistration withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
