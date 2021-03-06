/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_08_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the container instance. Only valid in response.
 */
public class ContainerPropertiesInstanceView {
    /**
     * The number of times that the container instance has been restarted.
     */
    @JsonProperty(value = "restartCount")
    private Integer restartCount;

    /**
     * Current container instance state.
     */
    @JsonProperty(value = "currentState")
    private ContainerState currentState;

    /**
     * Previous container instance state.
     */
    @JsonProperty(value = "previousState")
    private ContainerState previousState;

    /**
     * The events of the container instance.
     */
    @JsonProperty(value = "events")
    private List<ContainerEvent> events;

    /**
     * Get the number of times that the container instance has been restarted.
     *
     * @return the restartCount value
     */
    public Integer restartCount() {
        return this.restartCount;
    }

    /**
     * Set the number of times that the container instance has been restarted.
     *
     * @param restartCount the restartCount value to set
     * @return the ContainerPropertiesInstanceView object itself.
     */
    public ContainerPropertiesInstanceView withRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * Get current container instance state.
     *
     * @return the currentState value
     */
    public ContainerState currentState() {
        return this.currentState;
    }

    /**
     * Set current container instance state.
     *
     * @param currentState the currentState value to set
     * @return the ContainerPropertiesInstanceView object itself.
     */
    public ContainerPropertiesInstanceView withCurrentState(ContainerState currentState) {
        this.currentState = currentState;
        return this;
    }

    /**
     * Get previous container instance state.
     *
     * @return the previousState value
     */
    public ContainerState previousState() {
        return this.previousState;
    }

    /**
     * Set previous container instance state.
     *
     * @param previousState the previousState value to set
     * @return the ContainerPropertiesInstanceView object itself.
     */
    public ContainerPropertiesInstanceView withPreviousState(ContainerState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the events of the container instance.
     *
     * @return the events value
     */
    public List<ContainerEvent> events() {
        return this.events;
    }

    /**
     * Set the events of the container instance.
     *
     * @param events the events value to set
     * @return the ContainerPropertiesInstanceView object itself.
     */
    public ContainerPropertiesInstanceView withEvents(List<ContainerEvent> events) {
        this.events = events;
        return this;
    }

}
