/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for BackupManagementType.
 */
public enum BackupManagementType {
    /** Enum value Invalid. */
    INVALID("Invalid"),

    /** Enum value AzureIaasVM. */
    AZURE_IAAS_VM("AzureIaasVM"),

    /** Enum value MAB. */
    MAB("MAB"),

    /** Enum value DPM. */
    DPM("DPM"),

    /** Enum value AzureBackupServer. */
    AZURE_BACKUP_SERVER("AzureBackupServer"),

    /** Enum value AzureSql. */
    AZURE_SQL("AzureSql");

    /** The actual serialized value for a BackupManagementType instance. */
    private String value;

    BackupManagementType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BackupManagementType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed BackupManagementType object, or null if unable to parse.
     */
    @JsonCreator
    public static BackupManagementType fromString(String value) {
        BackupManagementType[] items = BackupManagementType.values();
        for (BackupManagementType item : items) {
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
