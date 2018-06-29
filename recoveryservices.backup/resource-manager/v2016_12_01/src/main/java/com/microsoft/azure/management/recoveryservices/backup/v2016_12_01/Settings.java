/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Common settings field for backup management.
 */
public class Settings {
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific
     * Standard Time".
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /**
     * SQL compression flag.
     */
    @JsonProperty(value = "issqlcompression")
    private Boolean issqlcompression;

    /**
     * Workload compression flag. This has been added so that
     * 'isSqlCompression'
     * will be deprecated once clients upgrade to consider this flag.
     */
    @JsonProperty(value = "isCompression")
    private Boolean isCompression;

    /**
     * Get timeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @return the timeZone value
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set timeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     *
     * @param timeZone the timeZone value to set
     * @return the Settings object itself.
     */
    public Settings withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get sQL compression flag.
     *
     * @return the issqlcompression value
     */
    public Boolean issqlcompression() {
        return this.issqlcompression;
    }

    /**
     * Set sQL compression flag.
     *
     * @param issqlcompression the issqlcompression value to set
     * @return the Settings object itself.
     */
    public Settings withIssqlcompression(Boolean issqlcompression) {
        this.issqlcompression = issqlcompression;
        return this;
    }

    /**
     * Get workload compression flag. This has been added so that 'isSqlCompression'
                 will be deprecated once clients upgrade to consider this flag.
     *
     * @return the isCompression value
     */
    public Boolean isCompression() {
        return this.isCompression;
    }

    /**
     * Set workload compression flag. This has been added so that 'isSqlCompression'
                 will be deprecated once clients upgrade to consider this flag.
     *
     * @param isCompression the isCompression value to set
     * @return the Settings object itself.
     */
    public Settings withIsCompression(Boolean isCompression) {
        this.isCompression = isCompression;
        return this;
    }

}
