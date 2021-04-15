// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.fluent.EnvironmentsClient;
import com.azure.resourcemanager.devtestlabs.fluent.models.DtlEnvironmentInner;
import com.azure.resourcemanager.devtestlabs.models.DtlEnvironment;
import com.azure.resourcemanager.devtestlabs.models.Environments;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EnvironmentsImpl implements Environments {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentsImpl.class);

    private final EnvironmentsClient innerClient;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    public EnvironmentsImpl(
        EnvironmentsClient innerClient, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DtlEnvironment> list(String resourceGroupName, String labName, String username) {
        PagedIterable<DtlEnvironmentInner> inner = this.serviceClient().list(resourceGroupName, labName, username);
        return Utils.mapPage(inner, inner1 -> new DtlEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<DtlEnvironment> list(
        String resourceGroupName,
        String labName,
        String username,
        String expand,
        String filter,
        Integer top,
        String orderby,
        Context context) {
        PagedIterable<DtlEnvironmentInner> inner =
            this.serviceClient().list(resourceGroupName, labName, username, expand, filter, top, orderby, context);
        return Utils.mapPage(inner, inner1 -> new DtlEnvironmentImpl(inner1, this.manager()));
    }

    public DtlEnvironment get(String resourceGroupName, String labName, String username, String name) {
        DtlEnvironmentInner inner = this.serviceClient().get(resourceGroupName, labName, username, name);
        if (inner != null) {
            return new DtlEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DtlEnvironment> getWithResponse(
        String resourceGroupName, String labName, String username, String name, String expand, Context context) {
        Response<DtlEnvironmentInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, labName, username, name, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DtlEnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String labName, String username, String name) {
        this.serviceClient().delete(resourceGroupName, labName, username, name);
    }

    public void delete(String resourceGroupName, String labName, String username, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, labName, username, name, context);
    }

    public DtlEnvironment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, labName, username, name, localExpand, Context.NONE).getValue();
    }

    public Response<DtlEnvironment> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, labName, username, name, expand, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String labName = Utils.getValueFromIdByName(id, "labs");
        if (labName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'labs'.", id)));
        }
        String username = Utils.getValueFromIdByName(id, "users");
        if (username == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'users'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "environments");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'environments'.", id)));
        }
        this.delete(resourceGroupName, labName, username, name, context);
    }

    private EnvironmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }

    public DtlEnvironmentImpl define(String name) {
        return new DtlEnvironmentImpl(name, this.manager());
    }
}
