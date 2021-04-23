// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties that are associated with an input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = InputProperties.class)
@JsonTypeName("InputProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stream", value = StreamInputProperties.class),
    @JsonSubTypes.Type(name = "Reference", value = ReferenceInputProperties.class)
})
@Fluent
public class InputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InputProperties.class);

    /*
     * Describes how data from an input is serialized or how data is serialized
     * when written to an output. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "serialization")
    private Serialization serialization;

    /*
     * Describes conditions applicable to the Input, Output, or the job
     * overall, that warrant customer attention.
     */
    @JsonProperty(value = "diagnostics", access = JsonProperty.Access.WRITE_ONLY)
    private Diagnostics diagnostics;

    /*
     * The current entity tag for the input. This is an opaque string. You can
     * use it to detect whether the resource has changed between requests. You
     * can also use it in the If-Match or If-None-Match headers for write
     * operations for optimistic concurrency.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Describes how input data is compressed
     */
    @JsonProperty(value = "compression")
    private Compression compression;

    /*
     * partitionKey Describes a key in the input data which is used for
     * partitioning the input data
     */
    @JsonProperty(value = "partitionKey")
    private String partitionKey;

    /**
     * Get the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     *
     * @return the serialization value.
     */
    public Serialization serialization() {
        return this.serialization;
    }

    /**
     * Set the serialization property: Describes how data from an input is serialized or how data is serialized when
     * written to an output. Required on PUT (CreateOrReplace) requests.
     *
     * @param serialization the serialization value to set.
     * @return the InputProperties object itself.
     */
    public InputProperties withSerialization(Serialization serialization) {
        this.serialization = serialization;
        return this;
    }

    /**
     * Get the diagnostics property: Describes conditions applicable to the Input, Output, or the job overall, that
     * warrant customer attention.
     *
     * @return the diagnostics value.
     */
    public Diagnostics diagnostics() {
        return this.diagnostics;
    }

    /**
     * Get the etag property: The current entity tag for the input. This is an opaque string. You can use it to detect
     * whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers
     * for write operations for optimistic concurrency.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the compression property: Describes how input data is compressed.
     *
     * @return the compression value.
     */
    public Compression compression() {
        return this.compression;
    }

    /**
     * Set the compression property: Describes how input data is compressed.
     *
     * @param compression the compression value to set.
     * @return the InputProperties object itself.
     */
    public InputProperties withCompression(Compression compression) {
        this.compression = compression;
        return this;
    }

    /**
     * Get the partitionKey property: partitionKey Describes a key in the input data which is used for partitioning the
     * input data.
     *
     * @return the partitionKey value.
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the partitionKey property: partitionKey Describes a key in the input data which is used for partitioning the
     * input data.
     *
     * @param partitionKey the partitionKey value to set.
     * @return the InputProperties object itself.
     */
    public InputProperties withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serialization() != null) {
            serialization().validate();
        }
        if (diagnostics() != null) {
            diagnostics().validate();
        }
        if (compression() != null) {
            compression().validate();
        }
    }
}
