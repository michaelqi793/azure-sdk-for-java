// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * An environment is a set of time-series data available for query, and is the top level Azure Time Series Insights
 * resource. Gen1 environments have data retention limits.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Gen1")
@JsonFlatten
@Fluent
public class Gen1EnvironmentResource extends EnvironmentResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Gen1EnvironmentResource.class);

    /*
     * ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     */
    @JsonProperty(value = "properties.dataRetentionTime", required = true)
    private Duration dataRetentionTime;

    /*
     * The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is
     * specified, new events will not be read from the event source. If
     * "PurgeOldData" is specified, new events will continue to be read and old
     * events will be deleted from the environment. The default behavior is
     * PurgeOldData.
     */
    @JsonProperty(value = "properties.storageLimitExceededBehavior")
    private StorageLimitExceededBehavior storageLimitExceededBehavior;

    /*
     * The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is
     * supported.
     */
    @JsonProperty(value = "properties.partitionKeyProperties")
    private List<TimeSeriesIdProperty> partitionKeyProperties;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * An id used to access the environment data, e.g. to query the
     * environment's events or upload reference data for the environment.
     */
    @JsonProperty(value = "properties.dataAccessId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataAccessId;

    /*
     * The fully qualified domain name used to access the environment data,
     * e.g. to query the environment's events or upload reference data for the
     * environment.
     */
    @JsonProperty(value = "properties.dataAccessFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dataAccessFqdn;

    /*
     * An object that represents the status of the environment, and its
     * internal state in the Time Series Insights service.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private EnvironmentStatus status;

    /**
     * Get the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     *
     * @return the dataRetentionTime value.
     */
    public Duration dataRetentionTime() {
        return this.dataRetentionTime;
    }

    /**
     * Set the dataRetentionTime property: ISO8601 timespan specifying the minimum number of days the environment's
     * events will be available for query.
     *
     * @param dataRetentionTime the dataRetentionTime value to set.
     * @return the Gen1EnvironmentResource object itself.
     */
    public Gen1EnvironmentResource withDataRetentionTime(Duration dataRetentionTime) {
        this.dataRetentionTime = dataRetentionTime;
        return this;
    }

    /**
     * Get the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     *
     * @return the storageLimitExceededBehavior value.
     */
    public StorageLimitExceededBehavior storageLimitExceededBehavior() {
        return this.storageLimitExceededBehavior;
    }

    /**
     * Set the storageLimitExceededBehavior property: The behavior the Time Series Insights service should take when the
     * environment's capacity has been exceeded. If "PauseIngress" is specified, new events will not be read from the
     * event source. If "PurgeOldData" is specified, new events will continue to be read and old events will be deleted
     * from the environment. The default behavior is PurgeOldData.
     *
     * @param storageLimitExceededBehavior the storageLimitExceededBehavior value to set.
     * @return the Gen1EnvironmentResource object itself.
     */
    public Gen1EnvironmentResource withStorageLimitExceededBehavior(
        StorageLimitExceededBehavior storageLimitExceededBehavior) {
        this.storageLimitExceededBehavior = storageLimitExceededBehavior;
        return this;
    }

    /**
     * Get the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     *
     * @return the partitionKeyProperties value.
     */
    public List<TimeSeriesIdProperty> partitionKeyProperties() {
        return this.partitionKeyProperties;
    }

    /**
     * Set the partitionKeyProperties property: The list of event properties which will be used to partition data in the
     * environment. Currently, only a single partition key property is supported.
     *
     * @param partitionKeyProperties the partitionKeyProperties value to set.
     * @return the Gen1EnvironmentResource object itself.
     */
    public Gen1EnvironmentResource withPartitionKeyProperties(List<TimeSeriesIdProperty> partitionKeyProperties) {
        this.partitionKeyProperties = partitionKeyProperties;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationTime property: The time the resource was created.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the dataAccessId property: An id used to access the environment data, e.g. to query the environment's events
     * or upload reference data for the environment.
     *
     * @return the dataAccessId value.
     */
    public UUID dataAccessId() {
        return this.dataAccessId;
    }

    /**
     * Get the dataAccessFqdn property: The fully qualified domain name used to access the environment data, e.g. to
     * query the environment's events or upload reference data for the environment.
     *
     * @return the dataAccessFqdn value.
     */
    public String dataAccessFqdn() {
        return this.dataAccessFqdn;
    }

    /**
     * Get the status property: An object that represents the status of the environment, and its internal state in the
     * Time Series Insights service.
     *
     * @return the status value.
     */
    public EnvironmentStatus status() {
        return this.status;
    }

    /** {@inheritDoc} */
    @Override
    public Gen1EnvironmentResource withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen1EnvironmentResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen1EnvironmentResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (dataRetentionTime() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataRetentionTime in model Gen1EnvironmentResource"));
        }
        if (partitionKeyProperties() != null) {
            partitionKeyProperties().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
    }
}
