/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Simple policy retention.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "retentionPolicyType")
@JsonTypeName("SimpleRetentionPolicy")
public class SimpleRetentionPolicy extends RetentionPolicy {
    /**
     * Retention duration of the protection policy.
     */
    @JsonProperty(value = "retentionDuration")
    private RetentionDuration retentionDuration;

    /**
     * Get retention duration of the protection policy.
     *
     * @return the retentionDuration value
     */
    public RetentionDuration retentionDuration() {
        return this.retentionDuration;
    }

    /**
     * Set retention duration of the protection policy.
     *
     * @param retentionDuration the retentionDuration value to set
     * @return the SimpleRetentionPolicy object itself.
     */
    public SimpleRetentionPolicy withRetentionDuration(RetentionDuration retentionDuration) {
        this.retentionDuration = retentionDuration;
        return this;
    }

}
