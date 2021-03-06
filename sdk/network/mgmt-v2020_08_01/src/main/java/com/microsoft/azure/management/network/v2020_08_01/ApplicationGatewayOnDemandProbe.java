/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of on demand test probe request.
 */
public class ApplicationGatewayOnDemandProbe {
    /**
     * The protocol used for the probe. Possible values include: 'Http',
     * 'Https'.
     */
    @JsonProperty(value = "protocol")
    private ApplicationGatewayProtocol protocol;

    /**
     * Host name to send the probe to.
     */
    @JsonProperty(value = "host")
    private String host;

    /**
     * Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The probe timeout in seconds. Probe marked as failed if valid response
     * is not received with this timeout period. Acceptable values are from 1
     * second to 86400 seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /**
     * Whether the host header should be picked from the backend http settings.
     * Default value is false.
     */
    @JsonProperty(value = "pickHostNameFromBackendHttpSettings")
    private Boolean pickHostNameFromBackendHttpSettings;

    /**
     * Criterion for classifying a healthy probe response.
     */
    @JsonProperty(value = "match")
    private ApplicationGatewayProbeHealthResponseMatch match;

    /**
     * Reference to backend pool of application gateway to which probe request
     * will be sent.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Reference to backend http setting of application gateway to be used for
     * test probe.
     */
    @JsonProperty(value = "backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Get the protocol used for the probe. Possible values include: 'Http', 'Https'.
     *
     * @return the protocol value
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol used for the probe. Possible values include: 'Http', 'Https'.
     *
     * @param protocol the protocol value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get host name to send the probe to.
     *
     * @return the host value
     */
    public String host() {
        return this.host;
    }

    /**
     * Set host name to send the probe to.
     *
     * @param host the host value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get relative path of probe. Valid path starts from '/'. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set relative path of probe. Valid path starts from '/'. Probe is sent to &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @param path the path value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the probe timeout in seconds. Probe marked as failed if valid response is not received with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param timeout the timeout value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get whether the host header should be picked from the backend http settings. Default value is false.
     *
     * @return the pickHostNameFromBackendHttpSettings value
     */
    public Boolean pickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings;
    }

    /**
     * Set whether the host header should be picked from the backend http settings. Default value is false.
     *
     * @param pickHostNameFromBackendHttpSettings the pickHostNameFromBackendHttpSettings value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withPickHostNameFromBackendHttpSettings(Boolean pickHostNameFromBackendHttpSettings) {
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        return this;
    }

    /**
     * Get criterion for classifying a healthy probe response.
     *
     * @return the match value
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.match;
    }

    /**
     * Set criterion for classifying a healthy probe response.
     *
     * @param match the match value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        this.match = match;
        return this;
    }

    /**
     * Get reference to backend pool of application gateway to which probe request will be sent.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set reference to backend pool of application gateway to which probe request will be sent.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get reference to backend http setting of application gateway to be used for test probe.
     *
     * @return the backendHttpSettings value
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set reference to backend http setting of application gateway to be used for test probe.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     * @return the ApplicationGatewayOnDemandProbe object itself.
     */
    public ApplicationGatewayOnDemandProbe withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

}
