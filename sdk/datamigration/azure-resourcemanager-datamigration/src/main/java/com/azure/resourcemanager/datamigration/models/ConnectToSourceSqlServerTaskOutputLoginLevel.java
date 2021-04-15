// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Login level output for the task that validates connection to SQL Server and also validates source server
 * requirements.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resultType")
@JsonTypeName("LoginLevelOutput")
@Immutable
public final class ConnectToSourceSqlServerTaskOutputLoginLevel extends ConnectToSourceSqlServerTaskOutput {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ConnectToSourceSqlServerTaskOutputLoginLevel.class);

    /*
     * Login name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type of login.
     */
    @JsonProperty(value = "loginType", access = JsonProperty.Access.WRITE_ONLY)
    private LoginType loginType;

    /*
     * The default database for the login.
     */
    @JsonProperty(value = "defaultDatabase", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultDatabase;

    /*
     * The state of the login.
     */
    @JsonProperty(value = "isEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEnabled;

    /*
     * Information about eligibility of login for migration.
     */
    @JsonProperty(value = "migrationEligibility", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationEligibilityInfo migrationEligibility;

    /**
     * Get the name property: Login name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the loginType property: The type of login.
     *
     * @return the loginType value.
     */
    public LoginType loginType() {
        return this.loginType;
    }

    /**
     * Get the defaultDatabase property: The default database for the login.
     *
     * @return the defaultDatabase value.
     */
    public String defaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * Get the isEnabled property: The state of the login.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Get the migrationEligibility property: Information about eligibility of login for migration.
     *
     * @return the migrationEligibility value.
     */
    public MigrationEligibilityInfo migrationEligibility() {
        return this.migrationEligibility;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (migrationEligibility() != null) {
            migrationEligibility().validate();
        }
    }
}
