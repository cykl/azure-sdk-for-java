/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.ProtectionPolicyInner;

/**
 * Azure VM (Mercury) workload-specific backup policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("AzureWorkload")
public class AzureVmWorkloadProtectionPolicy extends ProtectionPolicyInner {
    /**
     * Type of workload for the backup management.
     */
    @JsonProperty(value = "workLoadType")
    private String workLoadType;

    /**
     * Common settings for the backup management.
     */
    @JsonProperty(value = "settings")
    private Settings settings;

    /**
     * List of sub-protection policies which includes schedule and retention.
     */
    @JsonProperty(value = "subProtectionPolicy")
    private List<SubProtectionPolicy> subProtectionPolicy;

    /**
     * Get type of workload for the backup management.
     *
     * @return the workLoadType value
     */
    public String workLoadType() {
        return this.workLoadType;
    }

    /**
     * Set type of workload for the backup management.
     *
     * @param workLoadType the workLoadType value to set
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withWorkLoadType(String workLoadType) {
        this.workLoadType = workLoadType;
        return this;
    }

    /**
     * Get common settings for the backup management.
     *
     * @return the settings value
     */
    public Settings settings() {
        return this.settings;
    }

    /**
     * Set common settings for the backup management.
     *
     * @param settings the settings value to set
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withSettings(Settings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get list of sub-protection policies which includes schedule and retention.
     *
     * @return the subProtectionPolicy value
     */
    public List<SubProtectionPolicy> subProtectionPolicy() {
        return this.subProtectionPolicy;
    }

    /**
     * Set list of sub-protection policies which includes schedule and retention.
     *
     * @param subProtectionPolicy the subProtectionPolicy value to set
     * @return the AzureVmWorkloadProtectionPolicy object itself.
     */
    public AzureVmWorkloadProtectionPolicy withSubProtectionPolicy(List<SubProtectionPolicy> subProtectionPolicy) {
        this.subProtectionPolicy = subProtectionPolicy;
        return this;
    }

}
