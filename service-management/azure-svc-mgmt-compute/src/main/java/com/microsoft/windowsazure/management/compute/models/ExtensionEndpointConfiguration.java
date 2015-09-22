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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* Optional. Declared endpoints to automatically add to each deployment with
* this extension added.
*/
public class ExtensionEndpointConfiguration {
    private ArrayList<ExtensionEndpointConfiguration.InputEndpoint> inputEndpoints;
    
    /**
    * Optional. Optional. A list of input endpoints required by this extension.
    * Supported on WebRole or WorkerRole, but ignored on VmRole. Each input
    * endpoint will be automatically added to the service definition of the
    * deployment utilizing this extension.
    * @return The InputEndpoints value.
    */
    public ArrayList<ExtensionEndpointConfiguration.InputEndpoint> getInputEndpoints() {
        return this.inputEndpoints;
    }
    
    /**
    * Optional. Optional. A list of input endpoints required by this extension.
    * Supported on WebRole or WorkerRole, but ignored on VmRole. Each input
    * endpoint will be automatically added to the service definition of the
    * deployment utilizing this extension.
    * @param inputEndpointsValue The InputEndpoints value.
    */
    public void setInputEndpoints(final ArrayList<ExtensionEndpointConfiguration.InputEndpoint> inputEndpointsValue) {
        this.inputEndpoints = inputEndpointsValue;
    }
    
    private ArrayList<ExtensionEndpointConfiguration.InstanceInputEndpoint> instanceInputEndpoints;
    
    /**
    * Optional. Optional. A list of instance input endpoints required by this
    * extension. Supported on WebRole or WorkerRole, but ignored on VmRole.
    * Each instance input endpoint will be automatically added to the service
    * definition of the deployment utilizing this extension.
    * @return The InstanceInputEndpoints value.
    */
    public ArrayList<ExtensionEndpointConfiguration.InstanceInputEndpoint> getInstanceInputEndpoints() {
        return this.instanceInputEndpoints;
    }
    
    /**
    * Optional. Optional. A list of instance input endpoints required by this
    * extension. Supported on WebRole or WorkerRole, but ignored on VmRole.
    * Each instance input endpoint will be automatically added to the service
    * definition of the deployment utilizing this extension.
    * @param instanceInputEndpointsValue The InstanceInputEndpoints value.
    */
    public void setInstanceInputEndpoints(final ArrayList<ExtensionEndpointConfiguration.InstanceInputEndpoint> instanceInputEndpointsValue) {
        this.instanceInputEndpoints = instanceInputEndpointsValue;
    }
    
    private ArrayList<ExtensionEndpointConfiguration.InternalEndpoint> internalEndpoints;
    
    /**
    * Optional. Optional. A list of internal endpoints required by this
    * extension. Supported on WebRole or WorkerRole, but ignored on VmRole.
    * Each internal endpoint will be automatically added to the service
    * definition of the deployment utilizing this extension.
    * @return The InternalEndpoints value.
    */
    public ArrayList<ExtensionEndpointConfiguration.InternalEndpoint> getInternalEndpoints() {
        return this.internalEndpoints;
    }
    
    /**
    * Optional. Optional. A list of internal endpoints required by this
    * extension. Supported on WebRole or WorkerRole, but ignored on VmRole.
    * Each internal endpoint will be automatically added to the service
    * definition of the deployment utilizing this extension.
    * @param internalEndpointsValue The InternalEndpoints value.
    */
    public void setInternalEndpoints(final ArrayList<ExtensionEndpointConfiguration.InternalEndpoint> internalEndpointsValue) {
        this.internalEndpoints = internalEndpointsValue;
    }
    
    /**
    * Initializes a new instance of the ExtensionEndpointConfiguration class.
    *
    */
    public ExtensionEndpointConfiguration() {
        this.setInputEndpoints(new LazyArrayList<ExtensionEndpointConfiguration.InputEndpoint>());
        this.setInstanceInputEndpoints(new LazyArrayList<ExtensionEndpointConfiguration.InstanceInputEndpoint>());
        this.setInternalEndpoints(new LazyArrayList<ExtensionEndpointConfiguration.InternalEndpoint>());
    }
    
    /**
    * The extension's input endpoint configuration.
    */
    public static class InputEndpoint {
        private String localPort;
        
        /**
        * Required. Required for each input endpoint. Specifies a port used for
        * internal connections on the endpoint. Its value has to be between
        * 1-65535 inclusive, or '*' indicating any port number automatically
        * allocated by Windows Azure.
        * @return The LocalPort value.
        */
        public String getLocalPort() {
            return this.localPort;
        }
        
        /**
        * Required. Required for each input endpoint. Specifies a port used for
        * internal connections on the endpoint. Its value has to be between
        * 1-65535 inclusive, or '*' indicating any port number automatically
        * allocated by Windows Azure.
        * @param localPortValue The LocalPort value.
        */
        public void setLocalPort(final String localPortValue) {
            this.localPort = localPortValue;
        }
        
        private String name;
        
        /**
        * Required. Required for each input endpoint. A unique name for the
        * external endpoint.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Required. Required for each input endpoint. A unique name for the
        * external endpoint.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private int port;
        
        /**
        * Required. Required for each input endpoint. The port for the external
        * endpoint. You can specify any port number you choose, but the port
        * number specified must not collide with port numbers occupied by
        * roles in the service. Possible values range between 1 and 65535,
        * inclusive
        * @return The Port value.
        */
        public int getPort() {
            return this.port;
        }
        
        /**
        * Required. Required for each input endpoint. The port for the external
        * endpoint. You can specify any port number you choose, but the port
        * number specified must not collide with port numbers occupied by
        * roles in the service. Possible values range between 1 and 65535,
        * inclusive
        * @param portValue The Port value.
        */
        public void setPort(final int portValue) {
            this.port = portValue;
        }
        
        private String protocol;
        
        /**
        * Required. Required for each input endpoint. Transport protocol for
        * the endpoint. Its value has to be one of the following: 'tcp',
        * 'udp', 'http', 'https'.
        * @return The Protocol value.
        */
        public String getProtocol() {
            return this.protocol;
        }
        
        /**
        * Required. Required for each input endpoint. Transport protocol for
        * the endpoint. Its value has to be one of the following: 'tcp',
        * 'udp', 'http', 'https'.
        * @param protocolValue The Protocol value.
        */
        public void setProtocol(final String protocolValue) {
            this.protocol = protocolValue;
        }
    }
    
    /**
    * The extension's instance input endpoint configuration.
    */
    public static class InstanceInputEndpoint {
        private int fixedPortMax;
        
        /**
        * Required. Required for each instance input endpoint. Specifies a max
        * port valuefor the instance input endpoint port range used for
        * instance endpointdistribution by. Its value has to be between
        * 1-65535 inclusiveand should be unique range that can be injected
        * without conflict.Should also be equal or higher than FixedPortMin.
        * @return The FixedPortMax value.
        */
        public int getFixedPortMax() {
            return this.fixedPortMax;
        }
        
        /**
        * Required. Required for each instance input endpoint. Specifies a max
        * port valuefor the instance input endpoint port range used for
        * instance endpointdistribution by. Its value has to be between
        * 1-65535 inclusiveand should be unique range that can be injected
        * without conflict.Should also be equal or higher than FixedPortMin.
        * @param fixedPortMaxValue The FixedPortMax value.
        */
        public void setFixedPortMax(final int fixedPortMaxValue) {
            this.fixedPortMax = fixedPortMaxValue;
        }
        
        private int fixedPortMin;
        
        /**
        * Required. Required for each instance input endpoint. Specifies a min
        * port valuefor the instance input endpoint port range used for
        * instance endpointdistribution by. Its value has to be between
        * 1-65535 inclusiveand should be unique range that can be injected
        * without conflict.
        * @return The FixedPortMin value.
        */
        public int getFixedPortMin() {
            return this.fixedPortMin;
        }
        
        /**
        * Required. Required for each instance input endpoint. Specifies a min
        * port valuefor the instance input endpoint port range used for
        * instance endpointdistribution by. Its value has to be between
        * 1-65535 inclusiveand should be unique range that can be injected
        * without conflict.
        * @param fixedPortMinValue The FixedPortMin value.
        */
        public void setFixedPortMin(final int fixedPortMinValue) {
            this.fixedPortMin = fixedPortMinValue;
        }
        
        private String localPort;
        
        /**
        * Required. Required for each instance input endpoint. Specifies a port
        * used for internal connections on the endpoint. Its value has to be
        * between 1-65535 inclusive, or '*' indicating any port number
        * automatically allocated by Windows Azure.
        * @return The LocalPort value.
        */
        public String getLocalPort() {
            return this.localPort;
        }
        
        /**
        * Required. Required for each instance input endpoint. Specifies a port
        * used for internal connections on the endpoint. Its value has to be
        * between 1-65535 inclusive, or '*' indicating any port number
        * automatically allocated by Windows Azure.
        * @param localPortValue The LocalPort value.
        */
        public void setLocalPort(final String localPortValue) {
            this.localPort = localPortValue;
        }
        
        private String name;
        
        /**
        * Required. Required for each instance input endpoint. A unique name
        * for the instance input endpoint.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Required. Required for each instance input endpoint. A unique name
        * for the instance input endpoint.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String protocol;
        
        /**
        * Required. Required for each instance input endpoint. Transport
        * protocol for the endpoint. Its value has to be one of the following:
        * 'tcp', 'udp', 'http', 'https'.
        * @return The Protocol value.
        */
        public String getProtocol() {
            return this.protocol;
        }
        
        /**
        * Required. Required for each instance input endpoint. Transport
        * protocol for the endpoint. Its value has to be one of the following:
        * 'tcp', 'udp', 'http', 'https'.
        * @param protocolValue The Protocol value.
        */
        public void setProtocol(final String protocolValue) {
            this.protocol = protocolValue;
        }
    }
    
    /**
    * The extension's internal endpoint configuration.
    */
    public static class InternalEndpoint {
        private String name;
        
        /**
        * Required. Required for each internal endpoint. A unique name for the
        * external endpoint.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Required. Required for each internal endpoint. A unique name for the
        * external endpoint.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private int port;
        
        /**
        * Required. Required for each internal endpoint. The port for the
        * external endpoint. You can specify any port number you choose, but
        * the port number specified must not collide with port numbers
        * occupied by roles in the service. Possible values range between 1
        * and 65535, inclusive
        * @return The Port value.
        */
        public int getPort() {
            return this.port;
        }
        
        /**
        * Required. Required for each internal endpoint. The port for the
        * external endpoint. You can specify any port number you choose, but
        * the port number specified must not collide with port numbers
        * occupied by roles in the service. Possible values range between 1
        * and 65535, inclusive
        * @param portValue The Port value.
        */
        public void setPort(final int portValue) {
            this.port = portValue;
        }
        
        private String protocol;
        
        /**
        * Required. Required for each internal endpoint. Transport protocol for
        * the endpoint. Its value has to be one of the following: 'tcp',
        * 'udp', 'http', 'https'.
        * @return The Protocol value.
        */
        public String getProtocol() {
            return this.protocol;
        }
        
        /**
        * Required. Required for each internal endpoint. Transport protocol for
        * the endpoint. Its value has to be one of the following: 'tcp',
        * 'udp', 'http', 'https'.
        * @param protocolValue The Protocol value.
        */
        public void setProtocol(final String protocolValue) {
            this.protocol = protocolValue;
        }
        
        /**
        * Initializes a new instance of the InternalEndpoint class.
        *
        */
        public InternalEndpoint() {
        }
        
        /**
        * Initializes a new instance of the InternalEndpoint class with
        * required arguments.
        *
        * @param name Required for each internal endpoint. A unique name for
        * the external endpoint.
        * @param protocol Required for each internal endpoint. Transport
        * protocol for the endpoint. Its value has to be one of the following:
        * 'tcp', 'udp', 'http', 'https'.
        * @param port Required for each internal endpoint. The port for the
        * external endpoint. You can specify any port number you choose, but
        * the port number specified must not collide with port numbers
        * occupied by roles in the service. Possible values range between 1
        * and 65535, inclusive
        */
        public InternalEndpoint(String name, String protocol, int port) {
            if (name == null) {
                throw new NullPointerException("name");
            }
            if (protocol == null) {
                throw new NullPointerException("protocol");
            }
            this.setName(name);
            this.setProtocol(protocol);
            this.setPort(port);
        }
    }
}
