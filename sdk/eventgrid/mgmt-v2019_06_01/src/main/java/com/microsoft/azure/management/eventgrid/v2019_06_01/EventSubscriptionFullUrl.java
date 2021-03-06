/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2019_06_01.implementation.EventGridManager;
import com.microsoft.azure.management.eventgrid.v2019_06_01.implementation.EventSubscriptionFullUrlInner;

/**
 * Type representing EventSubscriptionFullUrl.
 */
public interface EventSubscriptionFullUrl extends HasInner<EventSubscriptionFullUrlInner>, HasManager<EventGridManager> {
    /**
     * @return the endpointUrl value.
     */
    String endpointUrl();

}
