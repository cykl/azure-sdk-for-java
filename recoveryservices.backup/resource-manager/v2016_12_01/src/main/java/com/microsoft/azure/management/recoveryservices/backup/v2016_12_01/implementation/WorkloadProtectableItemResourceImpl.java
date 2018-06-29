/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.WorkloadProtectableItemResource;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.WorkloadProtectableItem;
import java.util.Map;

class WorkloadProtectableItemResourceImpl extends WrapperImpl<WorkloadProtectableItemResourceInner> implements WorkloadProtectableItemResource {
    private final RecoveryServicesManager manager;

    WorkloadProtectableItemResourceImpl(WorkloadProtectableItemResourceInner inner,  RecoveryServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }



    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public WorkloadProtectableItem properties() {
        return this.inner().properties();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
