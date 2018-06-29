/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.RecoveryPointInner;

/**
 * Workload specific recoverypoint, specifcally encaspulates full/diff
 * recoverypoint.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadRecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadSQLRecoveryPoint", value = AzureWorkloadSQLRecoveryPoint.class)
})
public class AzureWorkloadRecoveryPoint extends RecoveryPointInner {
    /**
     * UTC time at which recoverypoint was created.
     */
    @JsonProperty(value = "recoveryPointTimeInUTC")
    private DateTime recoveryPointTimeInUTC;

    /**
     * Type of restore point. Possible values include: 'Invalid', 'Full',
     * 'Log', 'Differential'.
     */
    @JsonProperty(value = "type")
    private RestorePointType type;

    /**
     * Get uTC time at which recoverypoint was created.
     *
     * @return the recoveryPointTimeInUTC value
     */
    public DateTime recoveryPointTimeInUTC() {
        return this.recoveryPointTimeInUTC;
    }

    /**
     * Set uTC time at which recoverypoint was created.
     *
     * @param recoveryPointTimeInUTC the recoveryPointTimeInUTC value to set
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withRecoveryPointTimeInUTC(DateTime recoveryPointTimeInUTC) {
        this.recoveryPointTimeInUTC = recoveryPointTimeInUTC;
        return this;
    }

    /**
     * Get type of restore point. Possible values include: 'Invalid', 'Full', 'Log', 'Differential'.
     *
     * @return the type value
     */
    public RestorePointType type() {
        return this.type;
    }

    /**
     * Set type of restore point. Possible values include: 'Invalid', 'Full', 'Log', 'Differential'.
     *
     * @param type the type value to set
     * @return the AzureWorkloadRecoveryPoint object itself.
     */
    public AzureWorkloadRecoveryPoint withType(RestorePointType type) {
        this.type = type;
        return this;
    }

}
