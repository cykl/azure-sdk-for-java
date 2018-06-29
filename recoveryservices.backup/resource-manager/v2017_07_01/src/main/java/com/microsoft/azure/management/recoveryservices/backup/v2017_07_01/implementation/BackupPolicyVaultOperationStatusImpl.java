/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.BackupPolicyVaultOperationStatus;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.OperationStatusError;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.OperationStatusExtendedInfo;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.OperationStatusValues;

class BackupPolicyVaultOperationStatusImpl extends IndexableRefreshableWrapperImpl<BackupPolicyVaultOperationStatus, OperationStatusInner> implements BackupPolicyVaultOperationStatus {
    private final RecoveryServicesManager manager;
    private String vaultName;
    private String resourceGroupName;
    private String policyName;
    private String operationId;

    BackupPolicyVaultOperationStatusImpl(OperationStatusInner inner,  RecoveryServicesManager manager) {
        super(null, inner);
        this.manager = manager;
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.policyName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupPolicies");
        this.operationId = IdParsingUtils.getValueFromIdByName(inner.id(), "operations");
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<OperationStatusInner> getInnerAsync() {
        ProtectionPolicyOperationStatusesInner client = this.manager().inner().protectionPolicyOperationStatuses();
        return client.getAsync(this.vaultName, this.resourceGroupName, this.policyName, this.operationId);
    }



    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public OperationStatusError error() {
        return this.inner().error();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OperationStatusExtendedInfo properties() {
        return this.inner().properties();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public OperationStatusValues status() {
        return this.inner().status();
    }

}
