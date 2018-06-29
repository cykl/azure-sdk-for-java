/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.ObjectDataTypeModuleAutomationAccountTypeField;

/**
 * Type representing ObjectDataTypes.
 */
public interface ObjectDataTypes {
    /**
     * Retrieve a list of fields of a given type identified by module name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param moduleName The name of module.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ObjectDataTypeModuleAutomationAccountTypeField> listFieldsByModuleAndTypeAsync(String resourceGroupName, String automationAccountName, String moduleName, String typeName);

    /**
     * Retrieve a list of fields of a given type across all accessible modules.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param typeName The name of type.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ObjectDataTypeModuleAutomationAccountTypeField> listFieldsByTypeAsync(String resourceGroupName, String automationAccountName, String typeName);

}
