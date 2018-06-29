/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.VaultProtectionPolicyResourceModel;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;

class VaultProtectionPolicyResourceModelImpl extends CreatableUpdatableImpl<VaultProtectionPolicyResourceModel, ProtectionPolicyResourceInner, VaultProtectionPolicyResourceModelImpl> implements VaultProtectionPolicyResourceModel, VaultProtectionPolicyResourceModel.Definition, VaultProtectionPolicyResourceModel.Update {
    private final RecoveryServicesManager manager;
    private String vaultName;
    private String resourceGroupName;
    private String policyName;

    VaultProtectionPolicyResourceModelImpl(String name, RecoveryServicesManager manager) {
        super(name, new ProtectionPolicyResourceInner());
        this.manager = manager;
        // Set resource name
        this.policyName = name;
        //
    }

    VaultProtectionPolicyResourceModelImpl(ProtectionPolicyResourceInner inner, RecoveryServicesManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.policyName = inner.name();
        // resource ancestor names
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.policyName = IdParsingUtils.getValueFromIdByName(inner.id(), "backupPolicies");
        //
    }

    @Override
    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VaultProtectionPolicyResourceModel> createResourceAsync() {
        ProtectionPoliciesInner client = this.manager().inner().protectionPolicies();
        return client.createOrUpdateAsync(this.vaultName, this.resourceGroupName, this.policyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VaultProtectionPolicyResourceModel> updateResourceAsync() {
        ProtectionPoliciesInner client = this.manager().inner().protectionPolicies();
        return client.createOrUpdateAsync(this.vaultName, this.resourceGroupName, this.policyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ProtectionPolicyResourceInner> getInnerAsync() {
        ProtectionPoliciesInner client = this.manager().inner().protectionPolicies();
        return client.getAsync(this.vaultName, this.resourceGroupName, this.policyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
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
    public ProtectionPolicyInner properties() {
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

    @Override
    public VaultProtectionPolicyResourceModelImpl withExistingVault(String vaultName, String resourceGroupName) {
        this.vaultName = vaultName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public VaultProtectionPolicyResourceModelImpl withETag(String eTag) {
        this.inner().withETag(eTag);
        return this;
    }

    @Override
    public VaultProtectionPolicyResourceModelImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public VaultProtectionPolicyResourceModelImpl withProperties(ProtectionPolicyInner properties) {
        this.inner().withProperties(properties);
        return this;
    }

    @Override
    public VaultProtectionPolicyResourceModelImpl withTags(Map<String, String> tags) {
        this.inner().withTags(tags);
        return this;
    }

}
