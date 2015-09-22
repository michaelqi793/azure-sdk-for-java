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

import com.microsoft.azure.management.sql.models.RestorePoint;
import com.microsoft.azure.management.sql.models.RestorePointListResponse;
import com.microsoft.azure.management.sql.models.RestorePointProperties;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.utils.CollectionStringBuilder;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.tracing.CloudTracing;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.NullNode;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
* Represents all the operations for operating on Azure SQL Database restore
* points. Contains operations to: List restore points.
*/
public class DatabaseBackupOperationsImpl implements ServiceOperations<SqlManagementClientImpl>, DatabaseBackupOperations {
    /**
    * Initializes a new instance of the DatabaseBackupOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    DatabaseBackupOperationsImpl(SqlManagementClientImpl client) {
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
    * Returns a list of Azure SQL Database restore points.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database from
    * which to retrieve available restore points.
    * @return Represents the response to a List Azure Sql Database restore
    * points request.
    */
    @Override
    public Future<RestorePointListResponse> listRestorePointsAsync(final String resourceGroupName, final String serverName, final String databaseName) {
        return this.getClient().getExecutorService().submit(new Callable<RestorePointListResponse>() { 
            @Override
            public RestorePointListResponse call() throws Exception {
                return listRestorePoints(resourceGroupName, serverName, databaseName);
            }
         });
    }
    
    /**
    * Returns a list of Azure SQL Database restore points.
    *
    * @param resourceGroupName Required. The name of the Resource Group to
    * which the server belongs.
    * @param serverName Required. The name of the Azure SQL Database Server on
    * which the database is hosted.
    * @param databaseName Required. The name of the Azure SQL Database from
    * which to retrieve available restore points.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a List Azure Sql Database restore
    * points request.
    */
    @Override
    public RestorePointListResponse listRestorePoints(String resourceGroupName, String serverName, String databaseName) throws IOException, ServiceException {
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
            CloudTracing.enter(invocationId, this, "listRestorePointsAsync", tracingParameters);
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
        url = url + "/restorePoints";
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
            RestorePointListResponse result = null;
            // Deserialize Response
            if (statusCode == HttpStatus.SC_OK) {
                InputStream responseContent = httpResponse.getEntity().getContent();
                result = new RestorePointListResponse();
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode responseDoc = null;
                if (responseContent == null == false) {
                    responseDoc = objectMapper.readTree(responseContent);
                }
                
                if (responseDoc != null && responseDoc instanceof NullNode == false) {
                    JsonNode valueArray = responseDoc.get("value");
                    if (valueArray != null && valueArray instanceof NullNode == false) {
                        for (JsonNode valueValue : ((ArrayNode) valueArray)) {
                            RestorePoint restorePointInstance = new RestorePoint();
                            result.getRestorePoints().add(restorePointInstance);
                            
                            JsonNode propertiesValue = valueValue.get("properties");
                            if (propertiesValue != null && propertiesValue instanceof NullNode == false) {
                                RestorePointProperties propertiesInstance = new RestorePointProperties();
                                restorePointInstance.setProperties(propertiesInstance);
                                
                                JsonNode restorePointTypeValue = propertiesValue.get("restorePointType");
                                if (restorePointTypeValue != null && restorePointTypeValue instanceof NullNode == false) {
                                    String restorePointTypeInstance;
                                    restorePointTypeInstance = restorePointTypeValue.getTextValue();
                                    propertiesInstance.setRestorePointType(restorePointTypeInstance);
                                }
                                
                                JsonNode restorePointCreationDateValue = propertiesValue.get("restorePointCreationDate");
                                if (restorePointCreationDateValue != null && restorePointCreationDateValue instanceof NullNode == false) {
                                    Calendar restorePointCreationDateInstance;
                                    restorePointCreationDateInstance = DatatypeConverter.parseDateTime(restorePointCreationDateValue.getTextValue());
                                    propertiesInstance.setRestorePointCreationDate(restorePointCreationDateInstance);
                                }
                                
                                JsonNode earliestRestoreDateValue = propertiesValue.get("earliestRestoreDate");
                                if (earliestRestoreDateValue != null && earliestRestoreDateValue instanceof NullNode == false) {
                                    Calendar earliestRestoreDateInstance;
                                    earliestRestoreDateInstance = DatatypeConverter.parseDateTime(earliestRestoreDateValue.getTextValue());
                                    propertiesInstance.setEarliestRestoreDate(earliestRestoreDateInstance);
                                }
                            }
                            
                            JsonNode idValue = valueValue.get("id");
                            if (idValue != null && idValue instanceof NullNode == false) {
                                String idInstance;
                                idInstance = idValue.getTextValue();
                                restorePointInstance.setId(idInstance);
                            }
                            
                            JsonNode nameValue = valueValue.get("name");
                            if (nameValue != null && nameValue instanceof NullNode == false) {
                                String nameInstance;
                                nameInstance = nameValue.getTextValue();
                                restorePointInstance.setName(nameInstance);
                            }
                            
                            JsonNode typeValue = valueValue.get("type");
                            if (typeValue != null && typeValue instanceof NullNode == false) {
                                String typeInstance;
                                typeInstance = typeValue.getTextValue();
                                restorePointInstance.setType(typeInstance);
                            }
                            
                            JsonNode locationValue = valueValue.get("location");
                            if (locationValue != null && locationValue instanceof NullNode == false) {
                                String locationInstance;
                                locationInstance = locationValue.getTextValue();
                                restorePointInstance.setLocation(locationInstance);
                            }
                            
                            JsonNode tagsSequenceElement = ((JsonNode) valueValue.get("tags"));
                            if (tagsSequenceElement != null && tagsSequenceElement instanceof NullNode == false) {
                                Iterator<Map.Entry<String, JsonNode>> itr = tagsSequenceElement.getFields();
                                while (itr.hasNext()) {
                                    Map.Entry<String, JsonNode> property = itr.next();
                                    String tagsKey = property.getKey();
                                    String tagsValue = property.getValue().getTextValue();
                                    restorePointInstance.getTags().put(tagsKey, tagsValue);
                                }
                            }
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
