/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.HybridRunbookWorkerGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing HybridRunbookWorkerGroups.
 */
public interface HybridRunbookWorkerGroups extends HasInner<HybridRunbookWorkerGroupsInner> {
    /**
     * Retrieve a hybrid runbook worker group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HybridRunbookWorkerGroup> getAsync(String resourceGroupName, String automationAccountName, String hybridRunbookWorkerGroupName);

    /**
     * Retrieve a list of hybrid runbook worker groups.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HybridRunbookWorkerGroup> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName);

    /**
     * Delete a hybrid runbook worker group.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param hybridRunbookWorkerGroupName The hybrid runbook worker group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String automationAccountName, String hybridRunbookWorkerGroupName);

}
