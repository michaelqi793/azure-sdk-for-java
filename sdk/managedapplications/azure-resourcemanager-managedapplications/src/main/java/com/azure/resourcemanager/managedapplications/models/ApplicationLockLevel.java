// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ApplicationLockLevel. */
public enum ApplicationLockLevel {
    /** Enum value CanNotDelete. */
    CAN_NOT_DELETE("CanNotDelete"),

    /** Enum value ReadOnly. */
    READ_ONLY("ReadOnly"),

    /** Enum value None. */
    NONE("None");

    /** The actual serialized value for a ApplicationLockLevel instance. */
    private final String value;

    ApplicationLockLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ApplicationLockLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ApplicationLockLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static ApplicationLockLevel fromString(String value) {
        ApplicationLockLevel[] items = ApplicationLockLevel.values();
        for (ApplicationLockLevel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
