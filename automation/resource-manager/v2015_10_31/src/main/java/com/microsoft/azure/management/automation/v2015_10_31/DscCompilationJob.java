/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.DscCompilationJobInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.automation.v2015_10_31.implementation.AutomationManager;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTime;

/**
 * Type representing DscCompilationJob.
 */
public interface DscCompilationJob extends HasInner<DscCompilationJobInner>, Indexable, Refreshable<DscCompilationJob>, Updatable<DscCompilationJob.Update>, HasManager<AutomationManager> {
    /**
     * @return the configuration value.
     */
    DscConfigurationAssociationProperty configuration();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the exception value.
     */
    String exception();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the jobId value.
     */
    UUID jobId();

    /**
     * @return the lastModifiedTime value.
     */
    DateTime lastModifiedTime();

    /**
     * @return the lastStatusModifiedTime value.
     */
    DateTime lastStatusModifiedTime();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parameters value.
     */
    Map<String, String> parameters();

    /**
     * @return the provisioningState value.
     */
    JobProvisioningState provisioningState();

    /**
     * @return the runOn value.
     */
    String runOn();

    /**
     * @return the startedBy value.
     */
    String startedBy();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    JobStatus status();

    /**
     * @return the statusDetails value.
     */
    String statusDetails();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DscCompilationJob definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithAutomationAccount, DefinitionStages.WithConfiguration, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DscCompilationJob definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DscCompilationJob definition.
         */
        interface Blank extends WithAutomationAccount {
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify AutomationAccount.
         */
        interface WithAutomationAccount {
           /**
            * Specifies resourceGroupName, automationAccountName.
            */
            WithConfiguration withExistingAutomationAccount(String resourceGroupName, String automationAccountName);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify Configuration.
         */
        interface WithConfiguration {
           /**
            * Specifies configuration.
            */
            WithCreate withConfiguration(DscConfigurationAssociationProperty configuration);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify IncrementNodeConfigurationBuild.
         */
        interface WithIncrementNodeConfigurationBuild {
            /**
             * Specifies incrementNodeConfigurationBuild.
             */
            WithCreate withIncrementNodeConfigurationBuild(Boolean incrementNodeConfigurationBuild);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            WithCreate withParameters(Map<String, String> parameters);
        }

        /**
         * The stage of the dsccompilationjob definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DscCompilationJob>, DefinitionStages.WithIncrementNodeConfigurationBuild, DefinitionStages.WithLocation, DefinitionStages.WithName, DefinitionStages.WithParameters, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a DscCompilationJob update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DscCompilationJob>, UpdateStages.WithIncrementNodeConfigurationBuild, UpdateStages.WithLocation, UpdateStages.WithName, UpdateStages.WithParameters, UpdateStages.WithTags {
    }

    /**
     * Grouping of DscCompilationJob update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the dsccompilationjob update allowing to specify IncrementNodeConfigurationBuild.
         */
        interface WithIncrementNodeConfigurationBuild {
            /**
             * Specifies incrementNodeConfigurationBuild.
             */
            Update withIncrementNodeConfigurationBuild(Boolean incrementNodeConfigurationBuild);
        }

        /**
         * The stage of the dsccompilationjob update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the dsccompilationjob update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the dsccompilationjob update allowing to specify Parameters.
         */
        interface WithParameters {
            /**
             * Specifies parameters.
             */
            Update withParameters(Map<String, String> parameters);
        }

        /**
         * The stage of the dsccompilationjob update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
