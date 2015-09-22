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

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.models.DatabaseSecureConnectionPolicy;
import com.microsoft.azure.management.sql.models.DatabaseSecureConnectionPolicyCreateOrUpdateParameters;
import com.microsoft.azure.management.sql.models.DatabaseSecureConnectionPolicyGetResponse;
import com.microsoft.azure.management.sql.models.DatabaseSecureConnectionPolicyProperties;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.NullNode;
import org.codehaus.jackson.node.ObjectNode;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
* Represents all the operations for managing Azure SQL Database secure
* connection.  Contains operations to: Create, Retrieve and Update secure
* connection policy .
*/
public class SecureConnectionPolicyOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, SecureConnectionPolicyOperations {
    /**
    * Initializes a new instance of the SecureConnectionPolicyOperationsImpl
    * class.
    *
    * @param client Reference to the service client.
    */
    SecureConnectionPolicyOperationsImpl(SqlManagementClientImpl client) {
        this.client = client;
    }
    
    private SqlManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.azure.management.sql.SqlManagementClientImpl.
    * @return The Client value.
    */
    public SqlManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * Creates or updates an Azure SQL Database Server Firewall rule.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the policy applies.
    * @param parameters Required. The required parameters for createing or
    * updating a secure connection policy.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> createOrUpdateDatabasePolicyAsync(final String resourceGroupName, final String serverName, final String databaseName, final DatabaseSecureConnectionPolicyCreateOrUpdateParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception {
                return createOrUpdateDatabasePolicy(resourceGroupName, serverName, databaseName, parameters);
            }
         });
    }
    
    /**
    * Creates or updates an Azure SQL Database Server Firewall rule.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the policy applies.
    * @param parameters Required. The required parameters for createing or
    * updating a secure connection policy.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse createOrUpdateDatabasePolicy(String resourceGroupName, String serverName, String databaseName, DatabaseSecureConnectionPolicyCreateOrUpdateParameters parameters) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        if (parameters.getProperties() == null) {
            throw new NullPointerException("parameters.Properties");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "createOrUpdateDatabasePolicyAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/databases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        url = url + "/connectionPolicies/Default";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPut httpRequest = new HttpPut(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Serialize Request
        String requestContent = null;
        JsonNode requestDoc = null;
        
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode databaseSecureConnectionPolicyCreateOrUpdateParametersValue = objectMapper.createObjectNode();
        requestDoc = databaseSecureConnectionPolicyCreateOrUpdateParametersValue;
        
        ObjectNode propertiesValue = objectMapper.createObjectNode();
        ((ObjectNode) databaseSecureConnectionPolicyCreateOrUpdateParametersValue).put("properties", propertiesValue);
        
        if (parameters.getProperties().getSecurityEnabledAccess() != null) {
            ((ObjectNode) propertiesValue).put("securityEnabledAccess", parameters.getProperties().getSecurityEnabledAccess());
        }
        
        StringWriter stringWriter = new StringWriter();
        objectMapper.writeValue(stringWriter, requestDoc);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/json; charset=utf-8");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK && statusCode != HttpStatus.SC_CREATED) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationResponse result = null;
            // Deserialize Response
            result = new OperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * Returns an Azure SQL Database secure connection policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the secure connection policy applies.
    * @return Represents the response to a Get database secure connection
    * request.
    */
    @Override
    public Future<DatabaseSecureConnectionPolicyGetResponse> getDatabasePolicyAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<DatabaseSecureConnectionPolicyGetResponse>() { 
            @Override
            public DatabaseSecureConnectionPolicyGetResponse call() throws Exception {
                return getDatabasePolicy(resourceGroupName, serverName, databaseName);
            }
         });
    }
    
    /**
    * Returns an Azure SQL Database secure connection policy.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database for
    * which the secure connection policy applies.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get database secure connection
    * request.
    */
    @Override
    public DatabaseSecureConnectionPolicyGetResponse getDatabasePolicy(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException {
        // Validate
        if (resourceGroupName == null) {
            throw new NullPointerException("resourceGroupName");
        }
        if (serverName == null) {
            throw new NullPointerException("serverName");
        }
        if (databaseName == null) {
            throw new NullPointerException("databaseName");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("resourceGroupName", resourceGroupName);
            tracingParameters.put("serverName", serverName);
            tracingParameters.put("databaseName", databaseName);
            CloudTracing.enter(invocationId, this, "getDatabasePolicyAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "";
        url = url + "/subscriptions/";
        if (this.getClient().getCredentials().getSubscriptionId() != null) {
            url = url + URLEncoder.encode(this.getClient().getCredentials().getSubscriptionId(), "UTF-8");
        }
        url = url + "/resourceGroups/";
        url = url + URLEncoder.encode(resourceGroupName, "UTF-8");
        url = url + "/providers/";
        url = url + "Microsoft.Sql";
        url = url + "/servers/";
        url = url + URLEncoder.encode(serverName, "UTF-8");
        url = url + "/databases/";
        url = url + URLEncoder.encode(databaseName, "UTF-8");
        url = url + "/connectionPolicies/Default";
        ArrayList<String> queryParameters = new ArrayList<String>();
        queryParameters.add("api-version=" + "2014-04-01");
        if (queryParameters.size() > 0) {
            url = url + "?" + CollectionStringBuilder.join(queryParameters, "&");
        }
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            DatabaseSecureConnectionPolicyGetResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new DatabaseSecureConnectionPolicyGetResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                if (responseContent == null == false) {
                    responseDoc = objectMapper.readTree(responseContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    DatabaseSecureConnectionPolicy secureConnectionPolicyInstance = new DatabaseSecureConnectionPolicy();
                    result.setSecureConnectionPolicy(secureConnectionPolicyInstance);
                    
                    JsonNode propertiesValue = responseDoc.get("properties");
                    if (propertiesValue != null && propertiesValue instanceof NullNode == false) {
                        DatabaseSecureConnectionPolicyProperties propertiesInstance = new DatabaseSecureConnectionPolicyProperties();
                        secureConnectionPolicyInstance.setProperties(propertiesInstance);
                        
                        JsonNode proxyDnsNameValue = propertiesValue.get("proxyDnsName");
                        if (proxyDnsNameValue != null && proxyDnsNameValue instanceof NullNode == false) {
                            String proxyDnsNameInstance;
                            proxyDnsNameInstance = proxyDnsNameValue.getTextValue();
                            propertiesInstance.setProxyDnsName(proxyDnsNameInstance);
                        }
                        
                        JsonNode proxyPortValue = propertiesValue.get("proxyPort");
                        if (proxyPortValue != null && proxyPortValue instanceof NullNode == false) {
                            String proxyPortInstance;
                            proxyPortInstance = proxyPortValue.getTextValue();
                            propertiesInstance.setProxyPort(proxyPortInstance);
                        }
                        
                        JsonNode securityEnabledAccessValue = propertiesValue.get("securityEnabledAccess");
                        if (securityEnabledAccessValue != null && securityEnabledAccessValue instanceof NullNode == false) {
                            String securityEnabledAccessInstance;
                            securityEnabledAccessInstance = securityEnabledAccessValue.getTextValue();
                            propertiesInstance.setSecurityEnabledAccess(securityEnabledAccessInstance);
                        }
                    }
                    
                    JsonNode idValue = responseDoc.get("id");
                    if (idValue != null && idValue instanceof NullNode == false) {
                        String idInstance;
                        idInstance = idValue.getTextValue();
                        secureConnectionPolicyInstance.setId(idInstance);
                    }
                    
                    JsonNode nameValue = responseDoc.get("name");
                    if (nameValue != null && nameValue instanceof NullNode == false) {
                        String nameInstance;
                        nameInstance = nameValue.getTextValue();
                        secureConnectionPolicyInstance.setName(nameInstance);
                    }
                    
                    JsonNode typeValue = responseDoc.get("type");
                    if (typeValue != null && typeValue instanceof NullNode == false) {
                        String typeInstance;
                        typeInstance = typeValue.getTextValue();
                        secureConnectionPolicyInstance.setType(typeInstance);
                    }
                    
                    JsonNode locationValue = responseDoc.get("location");
                    if (locationValue != null && locationValue instanceof NullNode == false) {
                        String locationInstance;
                        locationInstance = locationValue.getTextValue();
                        secureConnectionPolicyInstance.setLocation(locationInstance);
                    }
                    
                    JsonNode tagsSequenceElement = ((JsonNode) responseDoc.get("tags"));
                    if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                        Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                        while (itr.hasNext()) {
                            Map.Entry<String, JsonNode> property = itr.next();
                            String tagsKey = property.getKey();
                            String tagsValue = property.getValue().getTextValue();
                            secureConnectionPolicyInstance.getTags().put(tagsKey, tagsValue);
                        }
                    }
                }
                
            }
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
