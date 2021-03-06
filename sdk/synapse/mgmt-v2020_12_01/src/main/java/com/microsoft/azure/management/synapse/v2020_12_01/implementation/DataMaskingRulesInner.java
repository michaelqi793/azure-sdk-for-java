/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.synapse.v2020_12_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DataMaskingRules.
 */
public class DataMaskingRulesInner {
    /** The Retrofit service to perform REST calls. */
    private DataMaskingRulesService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of DataMaskingRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DataMaskingRulesInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(DataMaskingRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DataMaskingRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DataMaskingRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.DataMaskingRules createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/dataMaskingPolicies/{dataMaskingPolicyName}/rules/{dataMaskingRuleName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("dataMaskingPolicyName") String dataMaskingPolicyName, @Path("dataMaskingRuleName") String dataMaskingRuleName, @Query("api-version") String apiVersion, @Body DataMaskingRuleInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.DataMaskingRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/dataMaskingPolicies/{dataMaskingPolicyName}/rules/{dataMaskingRuleName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("dataMaskingPolicyName") String dataMaskingPolicyName, @Path("dataMaskingRuleName") String dataMaskingRuleName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2020_12_01.DataMaskingRules listBySqlPool" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/dataMaskingPolicies/{dataMaskingPolicyName}/rules")
        Observable<Response<ResponseBody>> listBySqlPool(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Path("dataMaskingPolicyName") String dataMaskingPolicyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataMaskingRuleInner object if successful.
     */
    public DataMaskingRuleInner createOrUpdate(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataMaskingRuleInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName, DataMaskingRuleInner parameters, final ServiceCallback<DataMaskingRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataMaskingRuleInner object
     */
    public Observable<DataMaskingRuleInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName, parameters).map(new Func1<ServiceResponse<DataMaskingRuleInner>, DataMaskingRuleInner>() {
            @Override
            public DataMaskingRuleInner call(ServiceResponse<DataMaskingRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataMaskingRuleInner object
     */
    public Observable<ServiceResponse<DataMaskingRuleInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName, DataMaskingRuleInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (dataMaskingRuleName == null) {
            throw new IllegalArgumentException("Parameter dataMaskingRuleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String dataMaskingPolicyName = "Default";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, dataMaskingPolicyName, dataMaskingRuleName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataMaskingRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<DataMaskingRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataMaskingRuleInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataMaskingRuleInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataMaskingRuleInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataMaskingRuleInner>() { }.getType())
                .register(201, new TypeToken<DataMaskingRuleInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DataMaskingRuleInner object if successful.
     */
    public DataMaskingRuleInner get(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName).toBlocking().single().body();
    }

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DataMaskingRuleInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName, final ServiceCallback<DataMaskingRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName), serviceCallback);
    }

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataMaskingRuleInner object
     */
    public Observable<DataMaskingRuleInner> getAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName, dataMaskingRuleName).map(new Func1<ServiceResponse<DataMaskingRuleInner>, DataMaskingRuleInner>() {
            @Override
            public DataMaskingRuleInner call(ServiceResponse<DataMaskingRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specific Sql pool data masking rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param dataMaskingRuleName The name of the data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DataMaskingRuleInner object
     */
    public Observable<ServiceResponse<DataMaskingRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName, String dataMaskingRuleName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (dataMaskingRuleName == null) {
            throw new IllegalArgumentException("Parameter dataMaskingRuleName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String dataMaskingPolicyName = "Default";
        return service.get(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, dataMaskingPolicyName, dataMaskingRuleName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DataMaskingRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<DataMaskingRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DataMaskingRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DataMaskingRuleInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DataMaskingRuleInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DataMaskingRuleInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;DataMaskingRuleInner&gt; object if successful.
     */
    public List<DataMaskingRuleInner> listBySqlPool(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return listBySqlPoolWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single().body();
    }

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DataMaskingRuleInner>> listBySqlPoolAsync(String resourceGroupName, String workspaceName, String sqlPoolName, final ServiceCallback<List<DataMaskingRuleInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listBySqlPoolWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName), serviceCallback);
    }

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DataMaskingRuleInner&gt; object
     */
    public Observable<List<DataMaskingRuleInner>> listBySqlPoolAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        return listBySqlPoolWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName).map(new Func1<ServiceResponse<List<DataMaskingRuleInner>>, List<DataMaskingRuleInner>>() {
            @Override
            public List<DataMaskingRuleInner> call(ServiceResponse<List<DataMaskingRuleInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;DataMaskingRuleInner&gt; object
     */
    public Observable<ServiceResponse<List<DataMaskingRuleInner>>> listBySqlPoolWithServiceResponseAsync(String resourceGroupName, String workspaceName, String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String dataMaskingPolicyName = "Default";
        return service.listBySqlPool(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, dataMaskingPolicyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<DataMaskingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<DataMaskingRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<DataMaskingRuleInner>> result = listBySqlPoolDelegate(response);
                        List<DataMaskingRuleInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<DataMaskingRuleInner>> clientResponse = new ServiceResponse<List<DataMaskingRuleInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<DataMaskingRuleInner>> listBySqlPoolDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<DataMaskingRuleInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<DataMaskingRuleInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
