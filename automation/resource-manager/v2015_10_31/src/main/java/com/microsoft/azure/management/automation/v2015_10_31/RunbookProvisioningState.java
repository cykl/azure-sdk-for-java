/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RunbookProvisioningState.
 */
public enum RunbookProvisioningState {
    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded");

    /** The actual serialized value for a RunbookProvisioningState instance. */
    private String value;

    RunbookProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RunbookProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RunbookProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static RunbookProvisioningState fromString(String value) {
        RunbookProvisioningState[] items = RunbookProvisioningState.values();
        for (RunbookProvisioningState item : items) {
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
