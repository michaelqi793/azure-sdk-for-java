/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings for the CORS configuration of the service instance.
 */
public class ServiceCorsConfigurationInfo {
    /**
     * The origins to be allowed via CORS.
     */
    @JsonProperty(value = "origins")
    private List<String> origins;

    /**
     * The headers to be allowed via CORS.
     */
    @JsonProperty(value = "headers")
    private List<String> headers;

    /**
     * The methods to be allowed via CORS.
     */
    @JsonProperty(value = "methods")
    private List<String> methods;

    /**
     * The max age to be allowed via CORS.
     */
    @JsonProperty(value = "maxAge")
    private Integer maxAge;

    /**
     * If credentials are allowed via CORS.
     */
    @JsonProperty(value = "allowCredentials")
    private Boolean allowCredentials;

    /**
     * Get the origins to be allowed via CORS.
     *
     * @return the origins value
     */
    public List<String> origins() {
        return this.origins;
    }

    /**
     * Set the origins to be allowed via CORS.
     *
     * @param origins the origins value to set
     * @return the ServiceCorsConfigurationInfo object itself.
     */
    public ServiceCorsConfigurationInfo withOrigins(List<String> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the headers to be allowed via CORS.
     *
     * @return the headers value
     */
    public List<String> headers() {
        return this.headers;
    }

    /**
     * Set the headers to be allowed via CORS.
     *
     * @param headers the headers value to set
     * @return the ServiceCorsConfigurationInfo object itself.
     */
    public ServiceCorsConfigurationInfo withHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the methods to be allowed via CORS.
     *
     * @return the methods value
     */
    public List<String> methods() {
        return this.methods;
    }

    /**
     * Set the methods to be allowed via CORS.
     *
     * @param methods the methods value to set
     * @return the ServiceCorsConfigurationInfo object itself.
     */
    public ServiceCorsConfigurationInfo withMethods(List<String> methods) {
        this.methods = methods;
        return this;
    }

    /**
     * Get the max age to be allowed via CORS.
     *
     * @return the maxAge value
     */
    public Integer maxAge() {
        return this.maxAge;
    }

    /**
     * Set the max age to be allowed via CORS.
     *
     * @param maxAge the maxAge value to set
     * @return the ServiceCorsConfigurationInfo object itself.
     */
    public ServiceCorsConfigurationInfo withMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get if credentials are allowed via CORS.
     *
     * @return the allowCredentials value
     */
    public Boolean allowCredentials() {
        return this.allowCredentials;
    }

    /**
     * Set if credentials are allowed via CORS.
     *
     * @param allowCredentials the allowCredentials value to set
     * @return the ServiceCorsConfigurationInfo object itself.
     */
    public ServiceCorsConfigurationInfo withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

}