// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.List;

/** Resource collection API of IotDpsResources. */
public interface IotDpsResources {
    /**
     * Get the metadata of the provisioning service without SAS keys.
     *
     * @param resourceGroupName Resource group name.
     * @param provisioningServiceName Name of the provisioning service to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of the provisioning service without SAS keys.
     */
    ProvisioningServiceDescription getByResourceGroup(String resourceGroupName, String provisioningServiceName);

    /**
     * Get the metadata of the provisioning service without SAS keys.
     *
     * @param resourceGroupName Resource group name.
     * @param provisioningServiceName Name of the provisioning service to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of the provisioning service without SAS keys.
     */
    Response<ProvisioningServiceDescription> getByResourceGroupWithResponse(
        String resourceGroupName, String provisioningServiceName, Context context);

    /**
     * Deletes the Provisioning Service.
     *
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of provisioning service to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String provisioningServiceName);

    /**
     * Deletes the Provisioning Service.
     *
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of provisioning service to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String provisioningServiceName, Context context);

    /**
     * List all the provisioning services for a given subscription id.
     *
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of provisioning service descriptions.
     */
    PagedIterable<ProvisioningServiceDescription> list();

    /**
     * List all the provisioning services for a given subscription id.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of provisioning service descriptions.
     */
    PagedIterable<ProvisioningServiceDescription> list(Context context);

    /**
     * Get a list of all provisioning services in the given resource group.
     *
     * @param resourceGroupName Resource group identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all provisioning services in the given resource group.
     */
    PagedIterable<ProvisioningServiceDescription> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of all provisioning services in the given resource group.
     *
     * @param resourceGroupName Resource group identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all provisioning services in the given resource group.
     */
    PagedIterable<ProvisioningServiceDescription> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the status of a long running operation, such as create, update or delete a provisioning service.
     *
     * @param operationId Operation id corresponding to long running operation. Use this to poll for the status.
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of provisioning service that the operation is running on.
     * @param asyncinfo Async header used to poll on the status of the operation, obtained while creating the long
     *     running operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running operation, such as create, update or delete a provisioning service.
     */
    AsyncOperationResult getOperationResult(
        String operationId, String resourceGroupName, String provisioningServiceName, String asyncinfo);

    /**
     * Gets the status of a long running operation, such as create, update or delete a provisioning service.
     *
     * @param operationId Operation id corresponding to long running operation. Use this to poll for the status.
     * @param resourceGroupName Resource group identifier.
     * @param provisioningServiceName Name of provisioning service that the operation is running on.
     * @param asyncinfo Async header used to poll on the status of the operation, obtained while creating the long
     *     running operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a long running operation, such as create, update or delete a provisioning service.
     */
    Response<AsyncOperationResult> getOperationResultWithResponse(
        String operationId,
        String resourceGroupName,
        String provisioningServiceName,
        String asyncinfo,
        Context context);

    /**
     * Gets the list of valid SKUs and tiers for a provisioning service.
     *
     * @param provisioningServiceName Name of provisioning service.
     * @param resourceGroupName Name of resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of valid SKUs and tiers for a provisioning service.
     */
    PagedIterable<IotDpsSkuDefinition> listValidSkus(String provisioningServiceName, String resourceGroupName);

    /**
     * Gets the list of valid SKUs and tiers for a provisioning service.
     *
     * @param provisioningServiceName Name of provisioning service.
     * @param resourceGroupName Name of resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of valid SKUs and tiers for a provisioning service.
     */
    PagedIterable<IotDpsSkuDefinition> listValidSkus(
        String provisioningServiceName, String resourceGroupName, Context context);

    /**
     * Check if a provisioning service name is available. This will validate if the name is syntactically valid and if
     * the name is usable.
     *
     * @param arguments Set the name parameter in the OperationInputs structure to the name of the provisioning service
     *     to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of name availability.
     */
    NameAvailabilityInfo checkProvisioningServiceNameAvailability(OperationInputs arguments);

    /**
     * Check if a provisioning service name is available. This will validate if the name is syntactically valid and if
     * the name is usable.
     *
     * @param arguments Set the name parameter in the OperationInputs structure to the name of the provisioning service
     *     to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of name availability.
     */
    Response<NameAvailabilityInfo> checkProvisioningServiceNameAvailabilityWithResponse(
        OperationInputs arguments, Context context);

    /**
     * List the primary and secondary keys for a provisioning service.
     *
     * @param provisioningServiceName The provisioning service name to get the shared access keys for.
     * @param resourceGroupName resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of shared access keys.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(
        String provisioningServiceName, String resourceGroupName);

    /**
     * List the primary and secondary keys for a provisioning service.
     *
     * @param provisioningServiceName The provisioning service name to get the shared access keys for.
     * @param resourceGroupName resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of shared access keys.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(
        String provisioningServiceName, String resourceGroupName, Context context);

    /**
     * List primary and secondary keys for a specific key name.
     *
     * @param provisioningServiceName Name of the provisioning service.
     * @param keyName Logical key name to get key-values for.
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the shared access key.
     */
    SharedAccessSignatureAuthorizationRule listKeysForKeyName(
        String provisioningServiceName, String keyName, String resourceGroupName);

    /**
     * List primary and secondary keys for a specific key name.
     *
     * @param provisioningServiceName Name of the provisioning service.
     * @param keyName Logical key name to get key-values for.
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return description of the shared access key.
     */
    Response<SharedAccessSignatureAuthorizationRule> listKeysForKeyNameWithResponse(
        String provisioningServiceName, String keyName, String resourceGroupName, Context context);

    /**
     * List private link resources for the given provisioning service.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a provisioning service.
     */
    PrivateLinkResources listPrivateLinkResources(String resourceGroupName, String resourceName);

    /**
     * List private link resources for the given provisioning service.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available private link resources for a provisioning service.
     */
    Response<PrivateLinkResources> listPrivateLinkResourcesWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified private link resource for the given provisioning service.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param groupId The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given provisioning service.
     */
    GroupIdInformation getPrivateLinkResources(String resourceGroupName, String resourceName, String groupId);

    /**
     * Get the specified private link resource for the given provisioning service.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param groupId The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link resource for the given provisioning service.
     */
    Response<GroupIdInformation> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String resourceName, String groupId, Context context);

    /**
     * List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of private endpoint connections for a provisioning service.
     */
    List<PrivateEndpointConnection> listPrivateEndpointConnections(String resourceGroupName, String resourceName);

    /**
     * List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of private endpoint connections for a provisioning service.
     */
    Response<List<PrivateEndpointConnection>> listPrivateEndpointConnectionsWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Get private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties.
     */
    PrivateEndpointConnection getPrivateEndpointConnection(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Get private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties.
     */
    Response<PrivateEndpointConnection> getPrivateEndpointConnectionWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a provisioning service.
     */
    PrivateEndpointConnection deletePrivateEndpointConnection(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the provisioning service.
     * @param resourceName The name of the provisioning service.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a provisioning service.
     */
    PrivateEndpointConnection deletePrivateEndpointConnection(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Get the metadata of the provisioning service without SAS keys.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of the provisioning service without SAS keys.
     */
    ProvisioningServiceDescription getById(String id);

    /**
     * Get the metadata of the provisioning service without SAS keys.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the metadata of the provisioning service without SAS keys.
     */
    Response<ProvisioningServiceDescription> getByIdWithResponse(String id, Context context);

    /**
     * Get private endpoint connection properties.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties.
     */
    PrivateEndpointConnection getPrivateEndpointConnectionById(String id);

    /**
     * Get private endpoint connection properties.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties.
     */
    Response<PrivateEndpointConnection> getPrivateEndpointConnectionByIdWithResponse(String id, Context context);

    /**
     * Deletes the Provisioning Service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the Provisioning Service.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a provisioning service.
     */
    PrivateEndpointConnection deletePrivateEndpointConnectionById(String id);

    /**
     * Delete private endpoint connection with the specified name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of a provisioning service.
     */
    PrivateEndpointConnection deletePrivateEndpointConnectionByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ProvisioningServiceDescription resource.
     *
     * @param name resource name.
     * @return the first stage of the new ProvisioningServiceDescription definition.
     */
    ProvisioningServiceDescription.DefinitionStages.Blank define(String name);

    /**
     * Begins definition for a new PrivateEndpointConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnection definition.
     */
    PrivateEndpointConnection.DefinitionStages.Blank definePrivateEndpointConnection(String name);
}
