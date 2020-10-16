/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.TriggerInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databoxedge.v2019_08_01.implementation.DataBoxEdgeManager;

/**
 * Type representing Trigger.
 */
public interface Trigger extends HasInner<TriggerInner>, Indexable, Refreshable<Trigger>, Updatable<Trigger.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Trigger definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Trigger definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Trigger definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the trigger definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName Creates or updates a trigger
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithCreate withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Trigger> {
        }
    }
    /**
     * The template for a Trigger update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Trigger> {
    }

    /**
     * Grouping of Trigger update stages.
     */
    interface UpdateStages {
    }
}