// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** A copy activity Rest service source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("RestSource")
@Fluent
public final class RestSource extends CopySource {
    /*
     * The HTTP method used to call the RESTful API. The default is GET. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestMethod")
    private Object requestMethod;

    /*
     * The HTTP request body to the RESTful API if requestMethod is POST. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "requestBody")
    private Object requestBody;

    /*
     * The additional HTTP headers in the request to the RESTful API. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "additionalHeaders")
    private Object additionalHeaders;

    /*
     * The pagination rules to compose next page requests. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "paginationRules")
    private Object paginationRules;

    /*
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get
     * a response, not the timeout to read response data. Default value:
     * 00:01:40. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "httpRequestTimeout")
    private Object httpRequestTimeout;

    /*
     * The time to await before sending next page request.
     */
    @JsonProperty(value = "requestInterval")
    private Object requestInterval;

    /*
     * Specifies the additional columns to be added to source data. Type: array
     * of objects (or Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private List<AdditionalColumns> additionalColumns;

    /**
     * Get the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @return the requestMethod value.
     */
    public Object getRequestMethod() {
        return this.requestMethod;
    }

    /**
     * Set the requestMethod property: The HTTP method used to call the RESTful API. The default is GET. Type: string
     * (or Expression with resultType string).
     *
     * @param requestMethod the requestMethod value to set.
     * @return the RestSource object itself.
     */
    public RestSource setRequestMethod(Object requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * Get the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @return the requestBody value.
     */
    public Object getRequestBody() {
        return this.requestBody;
    }

    /**
     * Set the requestBody property: The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or
     * Expression with resultType string).
     *
     * @param requestBody the requestBody value to set.
     * @return the RestSource object itself.
     */
    public RestSource setRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Get the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @return the additionalHeaders value.
     */
    public Object getAdditionalHeaders() {
        return this.additionalHeaders;
    }

    /**
     * Set the additionalHeaders property: The additional HTTP headers in the request to the RESTful API. Type: string
     * (or Expression with resultType string).
     *
     * @param additionalHeaders the additionalHeaders value to set.
     * @return the RestSource object itself.
     */
    public RestSource setAdditionalHeaders(Object additionalHeaders) {
        this.additionalHeaders = additionalHeaders;
        return this;
    }

    /**
     * Get the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @return the paginationRules value.
     */
    public Object getPaginationRules() {
        return this.paginationRules;
    }

    /**
     * Set the paginationRules property: The pagination rules to compose next page requests. Type: string (or Expression
     * with resultType string).
     *
     * @param paginationRules the paginationRules value to set.
     * @return the RestSource object itself.
     */
    public RestSource setPaginationRules(Object paginationRules) {
        this.paginationRules = paginationRules;
        return this;
    }

    /**
     * Get the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the httpRequestTimeout value.
     */
    public Object getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    /**
     * Set the httpRequestTimeout property: The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a
     * response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param httpRequestTimeout the httpRequestTimeout value to set.
     * @return the RestSource object itself.
     */
    public RestSource setHttpRequestTimeout(Object httpRequestTimeout) {
        this.httpRequestTimeout = httpRequestTimeout;
        return this;
    }

    /**
     * Get the requestInterval property: The time to await before sending next page request.
     *
     * @return the requestInterval value.
     */
    public Object getRequestInterval() {
        return this.requestInterval;
    }

    /**
     * Set the requestInterval property: The time to await before sending next page request.
     *
     * @param requestInterval the requestInterval value to set.
     * @return the RestSource object itself.
     */
    public RestSource setRequestInterval(Object requestInterval) {
        this.requestInterval = requestInterval;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @return the additionalColumns value.
     */
    public List<AdditionalColumns> getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects (or Expression with resultType array of objects).
     *
     * @param additionalColumns the additionalColumns value to set.
     * @return the RestSource object itself.
     */
    public RestSource setAdditionalColumns(List<AdditionalColumns> additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }
}
