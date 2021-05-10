// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Role assignment properties with scope. */
@Fluent
public final class RoleAssignmentPropertiesWithScope {
    /*
     * The role scope.
     */
    @JsonProperty(value = "scope")
    private RoleScope scope;

    /*
     * The role definition ID.
     */
    @JsonProperty(value = "roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The principal ID.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Get the scope property: The role scope.
     *
     * @return the scope value.
     */
    public RoleScope getScope() {
        return this.scope;
    }

    /**
     * Set the scope property: The role scope.
     *
     * @param scope the scope value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setScope(RoleScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentPropertiesWithScope object itself.
     */
    public RoleAssignmentPropertiesWithScope setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
}
