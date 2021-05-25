// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectionContainerRefreshOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionContainerRefreshOperationResults;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProtectionContainerRefreshOperationResultsImpl
    implements ProtectionContainerRefreshOperationResults {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(ProtectionContainerRefreshOperationResultsImpl.class);

    private final ProtectionContainerRefreshOperationResultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public ProtectionContainerRefreshOperationResultsImpl(
        ProtectionContainerRefreshOperationResultsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void get(String vaultName, String resourceGroupName, String fabricName, String operationId) {
        this.serviceClient().get(vaultName, resourceGroupName, fabricName, operationId);
    }

    public Response<Void> getWithResponse(
        String vaultName, String resourceGroupName, String fabricName, String operationId, Context context) {
        return this.serviceClient().getWithResponse(vaultName, resourceGroupName, fabricName, operationId, context);
    }

    private ProtectionContainerRefreshOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
