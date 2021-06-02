// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.fluent.models.ProvisioningServiceDescriptionInner;
import java.util.Map;

/** An immutable client-side representation of ProvisioningServiceDescription. */
public interface ProvisioningServiceDescription {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: The Etag field is *not* required. If it is provided in the response body, it must also be
     * provided as a header per the normal ETag convention.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the properties property: Service specific properties for a provisioning service.
     *
     * @return the properties value.
     */
    IotDpsPropertiesDescription properties();

    /**
     * Gets the sku property: Sku info for a provisioning Service.
     *
     * @return the sku value.
     */
    IotDpsSkuInfo sku();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner
     * com.azure.resourcemanager.deviceprovisioningservices.fluent.models.ProvisioningServiceDescriptionInner object.
     *
     * @return the inner object.
     */
    ProvisioningServiceDescriptionInner innerModel();

    /** The entirety of the ProvisioningServiceDescription definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithProperties,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The ProvisioningServiceDescription definition stages. */
    interface DefinitionStages {
        /** The first stage of the ProvisioningServiceDescription definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName Resource group identifier.
             * @return the next definition stage.
             */
            WithProperties withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify properties. */
        interface WithProperties {
            /**
             * Specifies the properties property: Service specific properties for a provisioning service.
             *
             * @param properties Service specific properties for a provisioning service.
             * @return the next definition stage.
             */
            WithSku withProperties(IotDpsPropertiesDescription properties);
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: Sku info for a provisioning Service..
             *
             * @param sku Sku info for a provisioning Service.
             * @return the next definition stage.
             */
            WithCreate withSku(IotDpsSkuInfo sku);
        }
        /**
         * The stage of the ProvisioningServiceDescription definition which contains all the minimum required properties
         * for the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithEtag {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            ProvisioningServiceDescription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProvisioningServiceDescription create(Context context);
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the ProvisioningServiceDescription definition allowing to specify etag. */
        interface WithEtag {
            /**
             * Specifies the etag property: The Etag field is *not* required. If it is provided in the response body, it
             * must also be provided as a header per the normal ETag convention..
             *
             * @param etag The Etag field is *not* required. If it is provided in the response body, it must also be
             *     provided as a header per the normal ETag convention.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }
    }
    /**
     * Begins update for the ProvisioningServiceDescription resource.
     *
     * @return the stage of resource update.
     */
    ProvisioningServiceDescription.Update update();

    /** The template for ProvisioningServiceDescription update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        ProvisioningServiceDescription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        ProvisioningServiceDescription apply(Context context);
    }
    /** The ProvisioningServiceDescription update stages. */
    interface UpdateStages {
        /** The stage of the ProvisioningServiceDescription update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    ProvisioningServiceDescription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProvisioningServiceDescription refresh(Context context);

    /**
     * List the primary and secondary keys for a provisioning service.
     *
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of shared access keys.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys();

    /**
     * List the primary and secondary keys for a provisioning service.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.deviceprovisioningservices.models.ErrorDetailsException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of shared access keys.
     */
    PagedIterable<SharedAccessSignatureAuthorizationRule> listKeys(Context context);
}
