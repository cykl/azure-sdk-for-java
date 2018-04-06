/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a
 * Microsoft.Resources.ResourceWriteFailure event. This is raised when a
 * resource create or update operation fails.
 */
public class ResourceWriteFailureData {
    /**
     * The tenant ID of the resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The subscription ID of the resource.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /**
     * The resource group of the resource.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /**
     * The resource provider performing the operation.
     */
    @JsonProperty(value = "resourceProvider")
    private String resourceProvider;

    /**
     * The URI of the resource in the operation.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /**
     * The operation that was performed.
     */
    @JsonProperty(value = "operationName")
    private String operationName;

    /**
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The requested authorization for the operation.
     */
    @JsonProperty(value = "authorization")
    private String authorization;

    /**
     * The properties of the claims.
     */
    @JsonProperty(value = "claims")
    private String claims;

    /**
     * An operation ID used for troubleshooting.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /**
     * The details of the operation.
     */
    @JsonProperty(value = "httpRequest")
    private String httpRequest;

    /**
     * Get the tenantId value.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId value.
     *
     * @param tenantId the tenantId value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscriptionId value.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId value.
     *
     * @param subscriptionId the subscriptionId value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the resourceProvider value.
     *
     * @return the resourceProvider value
     */
    public String resourceProvider() {
        return this.resourceProvider;
    }

    /**
     * Set the resourceProvider value.
     *
     * @param resourceProvider the resourceProvider value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * Get the resourceUri value.
     *
     * @return the resourceUri value
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri value.
     *
     * @param resourceUri the resourceUri value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the operationName value.
     *
     * @return the operationName value
     */
    public String operationName() {
        return this.operationName;
    }

    /**
     * Set the operationName value.
     *
     * @param operationName the operationName value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the authorization value.
     *
     * @return the authorization value
     */
    public String authorization() {
        return this.authorization;
    }

    /**
     * Set the authorization value.
     *
     * @param authorization the authorization value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get the claims value.
     *
     * @return the claims value
     */
    public String claims() {
        return this.claims;
    }

    /**
     * Set the claims value.
     *
     * @param claims the claims value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withClaims(String claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Get the correlationId value.
     *
     * @return the correlationId value
     */
    public String correlationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId value.
     *
     * @param correlationId the correlationId value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the httpRequest value.
     *
     * @return the httpRequest value
     */
    public String httpRequest() {
        return this.httpRequest;
    }

    /**
     * Set the httpRequest value.
     *
     * @param httpRequest the httpRequest value to set
     * @return the ResourceWriteFailureData object itself.
     */
    public ResourceWriteFailureData withHttpRequest(String httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }

}