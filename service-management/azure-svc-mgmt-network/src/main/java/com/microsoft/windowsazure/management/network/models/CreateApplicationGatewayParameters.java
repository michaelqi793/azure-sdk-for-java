/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.network.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* The parameters of a create application gateway request.
*/
public class CreateApplicationGatewayParameters {
    private String description;
    
    /**
    * Optional. Gateway Description.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. Gateway Description.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private String gatewaySize;
    
    /**
    * Optional. The size of each gateway instance.
    * @return The GatewaySize value.
    */
    public String getGatewaySize() {
        return this.gatewaySize;
    }
    
    /**
    * Optional. The size of each gateway instance.
    * @param gatewaySizeValue The GatewaySize value.
    */
    public void setGatewaySize(final String gatewaySizeValue) {
        this.gatewaySize = gatewaySizeValue;
    }
    
    private long instanceCount;
    
    /**
    * Optional. The number of instances to create for this gateway.
    * @return The InstanceCount value.
    */
    public long getInstanceCount() {
        return this.instanceCount;
    }
    
    /**
    * Optional. The number of instances to create for this gateway.
    * @param instanceCountValue The InstanceCount value.
    */
    public void setInstanceCount(final long instanceCountValue) {
        this.instanceCount = instanceCountValue;
    }
    
    private String name;
    
    /**
    * Optional. Friendly Name of the gateway.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Friendly Name of the gateway.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private ArrayList<String> subnets;
    
    /**
    * Optional. Subnets in the vnet to which the gateway belongs.
    * @return The Subnets value.
    */
    public ArrayList<String> getSubnets() {
        return this.subnets;
    }
    
    /**
    * Optional. Subnets in the vnet to which the gateway belongs.
    * @param subnetsValue The Subnets value.
    */
    public void setSubnets(final ArrayList<String> subnetsValue) {
        this.subnets = subnetsValue;
    }
    
    private String vnetName;
    
    /**
    * Optional. The vnet to which the gateway belongs.
    * @return The VnetName value.
    */
    public String getVnetName() {
        return this.vnetName;
    }
    
    /**
    * Optional. The vnet to which the gateway belongs.
    * @param vnetNameValue The VnetName value.
    */
    public void setVnetName(final String vnetNameValue) {
        this.vnetName = vnetNameValue;
    }
    
    /**
    * Initializes a new instance of the CreateApplicationGatewayParameters
    * class.
    *
    */
    public CreateApplicationGatewayParameters() {
        this.setSubnets(new LazyArrayList<String>());
    }
}
