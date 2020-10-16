/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.UsersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Users.
 */
public interface Users extends SupportsCreating<User.DefinitionStages.Blank>, HasInner<UsersInner> {
    /**
     * Gets the properties of the specified user.
     *
     * @param deviceName The device name.
     * @param name The user name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<User> getAsync(String deviceName, String name, String resourceGroupName);

    /**
     * Gets all the users registered on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<User> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

    /**
     * Deletes the user on a databox edge/gateway device.
     *
     * @param deviceName The device name.
     * @param name The user name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String name, String resourceGroupName);

}