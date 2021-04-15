// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeallocationOption. */
public final class DeallocationOption extends ExpandableStringEnum<DeallocationOption> {
    /** Static value requeue for DeallocationOption. */
    public static final DeallocationOption REQUEUE = fromString("requeue");

    /** Static value terminate for DeallocationOption. */
    public static final DeallocationOption TERMINATE = fromString("terminate");

    /** Static value waitforjobcompletion for DeallocationOption. */
    public static final DeallocationOption WAITFORJOBCOMPLETION = fromString("waitforjobcompletion");

    /**
     * Creates or finds a DeallocationOption from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeallocationOption.
     */
    @JsonCreator
    public static DeallocationOption fromString(String name) {
        return fromString(name, DeallocationOption.class);
    }

    /** @return known DeallocationOption values. */
    public static Collection<DeallocationOption> values() {
        return values(DeallocationOption.class);
    }
}
