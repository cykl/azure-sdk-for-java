/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.NetworkStatusInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NetworkStatus.
 */
public interface NetworkStatus extends HasInner<NetworkStatusInner> {
    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkStatusContractByLocation> listByServiceAsync(String resourceGroupName, String serviceName);

    /**
     * Gets the Connectivity Status to the external resources on which the Api Management service depends from inside the Cloud Service. This also returns the DNS Servers as visible to the CloudService.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param locationName Location in which the API Management service is deployed. This is one of the Azure Regions like West US, East US, South Central US.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NetworkStatusContract> listByLocationAsync(String resourceGroupName, String serviceName, String locationName);

}
