/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Query parameters to fetch list of backup engines.
 */
public class BMSBackupEnginesQueryObject {
    /**
     * Backup management type for the backup engine. Possible values include:
     * 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql',
     * 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     */
    @JsonProperty(value = "backupManagementType")
    private BackupManagementType backupManagementType;

    /**
     * Friendly name of the backup engine.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Attribute to add extended info.
     */
    @JsonProperty(value = "expand")
    private String expand;

    /**
     * Get backup management type for the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @return the backupManagementType value
     */
    public BackupManagementType backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Set backup management type for the backup engine. Possible values include: 'Invalid', 'AzureIaasVM', 'MAB', 'DPM', 'AzureBackupServer', 'AzureSql', 'AzureStorage', 'AzureWorkload', 'DefaultBackup'.
     *
     * @param backupManagementType the backupManagementType value to set
     * @return the BMSBackupEnginesQueryObject object itself.
     */
    public BMSBackupEnginesQueryObject withBackupManagementType(BackupManagementType backupManagementType) {
        this.backupManagementType = backupManagementType;
        return this;
    }

    /**
     * Get friendly name of the backup engine.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of the backup engine.
     *
     * @param friendlyName the friendlyName value to set
     * @return the BMSBackupEnginesQueryObject object itself.
     */
    public BMSBackupEnginesQueryObject withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get attribute to add extended info.
     *
     * @return the expand value
     */
    public String expand() {
        return this.expand;
    }

    /**
     * Set attribute to add extended info.
     *
     * @param expand the expand value to set
     * @return the BMSBackupEnginesQueryObject object itself.
     */
    public BMSBackupEnginesQueryObject withExpand(String expand) {
        this.expand = expand;
        return this;
    }

}
