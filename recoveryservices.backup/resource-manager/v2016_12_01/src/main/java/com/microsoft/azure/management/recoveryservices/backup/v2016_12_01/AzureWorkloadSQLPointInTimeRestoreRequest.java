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

/**
 * AzureWorkload SQL -specific restore. Specifically for PointInTime/Log
 * restore.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("AzureWorkloadSQLPointInTimeRestoreRequest")
public class AzureWorkloadSQLPointInTimeRestoreRequest extends AzureWorkloadSQLRestoreRequest {
    /**
     * PointInTime value.
     */
    @JsonProperty(value = "pointInTime")
    private DateTime pointInTime;

    /**
     * Get pointInTime value.
     *
     * @return the pointInTime value
     */
    public DateTime pointInTime() {
        return this.pointInTime;
    }

    /**
     * Set pointInTime value.
     *
     * @param pointInTime the pointInTime value to set
     * @return the AzureWorkloadSQLPointInTimeRestoreRequest object itself.
     */
    public AzureWorkloadSQLPointInTimeRestoreRequest withPointInTime(DateTime pointInTime) {
        this.pointInTime = pointInTime;
        return this;
    }

}
