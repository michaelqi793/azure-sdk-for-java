// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.fluent.LocationsClient;
import com.azure.resourcemanager.hdinsight.fluent.models.BillingResponseListResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.CapabilitiesResultInner;
import com.azure.resourcemanager.hdinsight.fluent.models.UsagesListResultInner;
import com.azure.resourcemanager.hdinsight.models.BillingResponseListResult;
import com.azure.resourcemanager.hdinsight.models.CapabilitiesResult;
import com.azure.resourcemanager.hdinsight.models.Locations;
import com.azure.resourcemanager.hdinsight.models.UsagesListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LocationsImpl implements Locations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationsImpl.class);

    private final LocationsClient innerClient;

    private final HDInsightManager serviceManager;

    public LocationsImpl(LocationsClient innerClient, HDInsightManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public CapabilitiesResult getCapabilities(String location) {
        CapabilitiesResultInner inner = this.serviceClient().getCapabilities(location);
        if (inner != null) {
            return new CapabilitiesResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CapabilitiesResult> getCapabilitiesWithResponse(String location, Context context) {
        Response<CapabilitiesResultInner> inner = this.serviceClient().getCapabilitiesWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CapabilitiesResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public UsagesListResult listUsages(String location) {
        UsagesListResultInner inner = this.serviceClient().listUsages(location);
        if (inner != null) {
            return new UsagesListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UsagesListResult> listUsagesWithResponse(String location, Context context) {
        Response<UsagesListResultInner> inner = this.serviceClient().listUsagesWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UsagesListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BillingResponseListResult listBillingSpecs(String location) {
        BillingResponseListResultInner inner = this.serviceClient().listBillingSpecs(location);
        if (inner != null) {
            return new BillingResponseListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BillingResponseListResult> listBillingSpecsWithResponse(String location, Context context) {
        Response<BillingResponseListResultInner> inner =
            this.serviceClient().listBillingSpecsWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BillingResponseListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LocationsClient serviceClient() {
        return this.innerClient;
    }

    private HDInsightManager manager() {
        return this.serviceManager;
    }
}
