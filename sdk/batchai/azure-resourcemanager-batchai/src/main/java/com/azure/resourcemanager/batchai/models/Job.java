// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.batchai.fluent.models.JobInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Job. */
public interface Job {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the schedulingPriority property: Scheduling priority associated with the job.
     *
     * @return the schedulingPriority value.
     */
    JobPriority schedulingPriority();

    /**
     * Gets the cluster property: Resource ID of the cluster associated with the job.
     *
     * @return the cluster value.
     */
    ResourceId cluster();

    /**
     * Gets the mountVolumes property: Collection of mount volumes available to the job during execution. These volumes
     * are mounted before the job execution and unmounted after the job completion. The volumes are mounted at location
     * specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
     *
     * @return the mountVolumes value.
     */
    MountVolumes mountVolumes();

    /**
     * Gets the nodeCount property: The job will be gang scheduled on that many compute nodes.
     *
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * Gets the containerSettings property: If the container was downloaded as part of cluster setup then the same
     * container image will be used. If not provided, the job will run on the VM.
     *
     * @return the containerSettings value.
     */
    ContainerSettings containerSettings();

    /**
     * Gets the toolType property: Possible values are: cntk, tensorflow, caffe, caffe2, chainer, pytorch, custom,
     * custommpi, horovod.
     *
     * @return the toolType value.
     */
    ToolType toolType();

    /**
     * Gets the cntkSettings property: CNTK (aka Microsoft Cognitive Toolkit) job settings.
     *
     * @return the cntkSettings value.
     */
    CntKsettings cntkSettings();

    /**
     * Gets the pyTorchSettings property: pyTorch job settings.
     *
     * @return the pyTorchSettings value.
     */
    PyTorchSettings pyTorchSettings();

    /**
     * Gets the tensorFlowSettings property: TensorFlow job settings.
     *
     * @return the tensorFlowSettings value.
     */
    TensorFlowSettings tensorFlowSettings();

    /**
     * Gets the caffeSettings property: Caffe job settings.
     *
     * @return the caffeSettings value.
     */
    CaffeSettings caffeSettings();

    /**
     * Gets the caffe2Settings property: Caffe2 job settings.
     *
     * @return the caffe2Settings value.
     */
    Caffe2Settings caffe2Settings();

    /**
     * Gets the chainerSettings property: Chainer job settings.
     *
     * @return the chainerSettings value.
     */
    ChainerSettings chainerSettings();

    /**
     * Gets the customToolkitSettings property: Custom tool kit job settings.
     *
     * @return the customToolkitSettings value.
     */
    CustomToolkitSettings customToolkitSettings();

    /**
     * Gets the customMpiSettings property: Custom MPI job settings.
     *
     * @return the customMpiSettings value.
     */
    CustomMpiSettings customMpiSettings();

    /**
     * Gets the horovodSettings property: Specifies the settings for Horovod job.
     *
     * @return the horovodSettings value.
     */
    HorovodSettings horovodSettings();

    /**
     * Gets the jobPreparation property: The specified actions will run on all the nodes that are part of the job.
     *
     * @return the jobPreparation value.
     */
    JobPreparation jobPreparation();

    /**
     * Gets the jobOutputDirectoryPathSegment property: A segment of job's output directories path created by Batch AI.
     * Batch AI creates job's output directories under an unique path to avoid conflicts between jobs. This value
     * contains a path segment generated by Batch AI to make the path unique and can be used to find the output
     * directory on the node or mounted filesystem.
     *
     * @return the jobOutputDirectoryPathSegment value.
     */
    String jobOutputDirectoryPathSegment();

    /**
     * Gets the stdOutErrPathPrefix property: The path where the Batch AI service stores stdout, stderror and execution
     * log of the job.
     *
     * @return the stdOutErrPathPrefix value.
     */
    String stdOutErrPathPrefix();

    /**
     * Gets the inputDirectories property: A list of input directories for the job.
     *
     * @return the inputDirectories value.
     */
    List<InputDirectory> inputDirectories();

    /**
     * Gets the outputDirectories property: A list of output directories for the job.
     *
     * @return the outputDirectories value.
     */
    List<OutputDirectory> outputDirectories();

    /**
     * Gets the environmentVariables property: A collection of user defined environment variables to be setup for the
     * job.
     *
     * @return the environmentVariables value.
     */
    List<EnvironmentVariable> environmentVariables();

    /**
     * Gets the secrets property: A collection of user defined environment variables with secret values to be setup for
     * the job. Server will never report values of these variables back.
     *
     * @return the secrets value.
     */
    List<EnvironmentVariableWithSecretValue> secrets();

    /**
     * Gets the constraints property: Constraints associated with the Job.
     *
     * @return the constraints value.
     */
    JobPropertiesConstraints constraints();

    /**
     * Gets the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    OffsetDateTime creationTime();

    /**
     * Gets the provisioningState property: The provisioned state of the Batch AI job.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the provisioningStateTransitionTime property: The time at which the job entered its current provisioning
     * state.
     *
     * @return the provisioningStateTransitionTime value.
     */
    OffsetDateTime provisioningStateTransitionTime();

    /**
     * Gets the executionState property: The current state of the job. Possible values are: queued - The job is queued
     * and able to run. A job enters this state when it is created, or when it is awaiting a retry after a failed run.
     * running - The job is running on a compute cluster. This includes job-level preparation such as downloading
     * resource files or set up container specified on the job - it does not necessarily mean that the job command line
     * has started executing. terminating - The job is terminated by the user, the terminate operation is in progress.
     * succeeded - The job has completed running successfully and exited with exit code 0. failed - The job has finished
     * unsuccessfully (failed with a non-zero exit code) and has exhausted its retry limit. A job is also marked as
     * failed if an error occurred launching the job.
     *
     * @return the executionState value.
     */
    ExecutionState executionState();

    /**
     * Gets the executionStateTransitionTime property: The time at which the job entered its current execution state.
     *
     * @return the executionStateTransitionTime value.
     */
    OffsetDateTime executionStateTransitionTime();

    /**
     * Gets the executionInfo property: Information about the execution of a job.
     *
     * @return the executionInfo value.
     */
    JobPropertiesExecutionInfo executionInfo();

    /**
     * Gets the inner com.azure.resourcemanager.batchai.fluent.models.JobInner object.
     *
     * @return the inner object.
     */
    JobInner innerModel();

    /** The entirety of the Job definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Job definition stages. */
    interface DefinitionStages {
        /** The first stage of the Job definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Job definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, experimentName.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param workspaceName The name of the workspace. Workspace names can only contain a combination of
             *     alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
             *     characters long.
             * @param experimentName The name of the experiment. Experiment names can only contain a combination of
             *     alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64
             *     characters long.
             * @return the next definition stage.
             */
            WithCreate withExistingExperiment(String resourceGroupName, String workspaceName, String experimentName);
        }
        /**
         * The stage of the Job definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithSchedulingPriority,
                DefinitionStages.WithCluster,
                DefinitionStages.WithMountVolumes,
                DefinitionStages.WithNodeCount,
                DefinitionStages.WithContainerSettings,
                DefinitionStages.WithCntkSettings,
                DefinitionStages.WithPyTorchSettings,
                DefinitionStages.WithTensorFlowSettings,
                DefinitionStages.WithCaffeSettings,
                DefinitionStages.WithCaffe2Settings,
                DefinitionStages.WithChainerSettings,
                DefinitionStages.WithCustomToolkitSettings,
                DefinitionStages.WithCustomMpiSettings,
                DefinitionStages.WithHorovodSettings,
                DefinitionStages.WithJobPreparation,
                DefinitionStages.WithStdOutErrPathPrefix,
                DefinitionStages.WithInputDirectories,
                DefinitionStages.WithOutputDirectories,
                DefinitionStages.WithEnvironmentVariables,
                DefinitionStages.WithSecrets,
                DefinitionStages.WithConstraints {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Job create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Job create(Context context);
        }
        /** The stage of the Job definition allowing to specify schedulingPriority. */
        interface WithSchedulingPriority {
            /**
             * Specifies the schedulingPriority property: Scheduling priority associated with the job. Possible values:
             * low, normal, high..
             *
             * @param schedulingPriority Scheduling priority associated with the job. Possible values: low, normal,
             *     high.
             * @return the next definition stage.
             */
            WithCreate withSchedulingPriority(JobPriority schedulingPriority);
        }
        /** The stage of the Job definition allowing to specify cluster. */
        interface WithCluster {
            /**
             * Specifies the cluster property: Resource ID of the cluster on which this job will run..
             *
             * @param cluster Resource ID of the cluster on which this job will run.
             * @return the next definition stage.
             */
            WithCreate withCluster(ResourceId cluster);
        }
        /** The stage of the Job definition allowing to specify mountVolumes. */
        interface WithMountVolumes {
            /**
             * Specifies the mountVolumes property: Information on mount volumes to be used by the job. These volumes
             * will be mounted before the job execution and will be unmounted after the job completion. The volumes will
             * be mounted at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable..
             *
             * @param mountVolumes Information on mount volumes to be used by the job. These volumes will be mounted
             *     before the job execution and will be unmounted after the job completion. The volumes will be mounted
             *     at location specified by $AZ_BATCHAI_JOB_MOUNT_ROOT environment variable.
             * @return the next definition stage.
             */
            WithCreate withMountVolumes(MountVolumes mountVolumes);
        }
        /** The stage of the Job definition allowing to specify nodeCount. */
        interface WithNodeCount {
            /**
             * Specifies the nodeCount property: Number of compute nodes to run the job on. The job will be gang
             * scheduled on that many compute nodes..
             *
             * @param nodeCount Number of compute nodes to run the job on. The job will be gang scheduled on that many
             *     compute nodes.
             * @return the next definition stage.
             */
            WithCreate withNodeCount(Integer nodeCount);
        }
        /** The stage of the Job definition allowing to specify containerSettings. */
        interface WithContainerSettings {
            /**
             * Specifies the containerSettings property: Docker container settings for the job. If not provided, the job
             * will run directly on the node..
             *
             * @param containerSettings Docker container settings for the job. If not provided, the job will run
             *     directly on the node.
             * @return the next definition stage.
             */
            WithCreate withContainerSettings(ContainerSettings containerSettings);
        }
        /** The stage of the Job definition allowing to specify cntkSettings. */
        interface WithCntkSettings {
            /**
             * Specifies the cntkSettings property: Settings for CNTK (aka Microsoft Cognitive Toolkit) job..
             *
             * @param cntkSettings Settings for CNTK (aka Microsoft Cognitive Toolkit) job.
             * @return the next definition stage.
             */
            WithCreate withCntkSettings(CntKsettings cntkSettings);
        }
        /** The stage of the Job definition allowing to specify pyTorchSettings. */
        interface WithPyTorchSettings {
            /**
             * Specifies the pyTorchSettings property: Settings for pyTorch job..
             *
             * @param pyTorchSettings Settings for pyTorch job.
             * @return the next definition stage.
             */
            WithCreate withPyTorchSettings(PyTorchSettings pyTorchSettings);
        }
        /** The stage of the Job definition allowing to specify tensorFlowSettings. */
        interface WithTensorFlowSettings {
            /**
             * Specifies the tensorFlowSettings property: Settings for Tensor Flow job..
             *
             * @param tensorFlowSettings Settings for Tensor Flow job.
             * @return the next definition stage.
             */
            WithCreate withTensorFlowSettings(TensorFlowSettings tensorFlowSettings);
        }
        /** The stage of the Job definition allowing to specify caffeSettings. */
        interface WithCaffeSettings {
            /**
             * Specifies the caffeSettings property: Settings for Caffe job..
             *
             * @param caffeSettings Settings for Caffe job.
             * @return the next definition stage.
             */
            WithCreate withCaffeSettings(CaffeSettings caffeSettings);
        }
        /** The stage of the Job definition allowing to specify caffe2Settings. */
        interface WithCaffe2Settings {
            /**
             * Specifies the caffe2Settings property: Settings for Caffe2 job..
             *
             * @param caffe2Settings Settings for Caffe2 job.
             * @return the next definition stage.
             */
            WithCreate withCaffe2Settings(Caffe2Settings caffe2Settings);
        }
        /** The stage of the Job definition allowing to specify chainerSettings. */
        interface WithChainerSettings {
            /**
             * Specifies the chainerSettings property: Settings for Chainer job..
             *
             * @param chainerSettings Settings for Chainer job.
             * @return the next definition stage.
             */
            WithCreate withChainerSettings(ChainerSettings chainerSettings);
        }
        /** The stage of the Job definition allowing to specify customToolkitSettings. */
        interface WithCustomToolkitSettings {
            /**
             * Specifies the customToolkitSettings property: Settings for custom tool kit job..
             *
             * @param customToolkitSettings Settings for custom tool kit job.
             * @return the next definition stage.
             */
            WithCreate withCustomToolkitSettings(CustomToolkitSettings customToolkitSettings);
        }
        /** The stage of the Job definition allowing to specify customMpiSettings. */
        interface WithCustomMpiSettings {
            /**
             * Specifies the customMpiSettings property: Settings for custom MPI job..
             *
             * @param customMpiSettings Settings for custom MPI job.
             * @return the next definition stage.
             */
            WithCreate withCustomMpiSettings(CustomMpiSettings customMpiSettings);
        }
        /** The stage of the Job definition allowing to specify horovodSettings. */
        interface WithHorovodSettings {
            /**
             * Specifies the horovodSettings property: Settings for Horovod job..
             *
             * @param horovodSettings Settings for Horovod job.
             * @return the next definition stage.
             */
            WithCreate withHorovodSettings(HorovodSettings horovodSettings);
        }
        /** The stage of the Job definition allowing to specify jobPreparation. */
        interface WithJobPreparation {
            /**
             * Specifies the jobPreparation property: A command line to be executed on each node allocated for the job
             * before tool kit is launched..
             *
             * @param jobPreparation A command line to be executed on each node allocated for the job before tool kit is
             *     launched.
             * @return the next definition stage.
             */
            WithCreate withJobPreparation(JobPreparation jobPreparation);
        }
        /** The stage of the Job definition allowing to specify stdOutErrPathPrefix. */
        interface WithStdOutErrPathPrefix {
            /**
             * Specifies the stdOutErrPathPrefix property: The path where the Batch AI service will store stdout,
             * stderror and execution log of the job..
             *
             * @param stdOutErrPathPrefix The path where the Batch AI service will store stdout, stderror and execution
             *     log of the job.
             * @return the next definition stage.
             */
            WithCreate withStdOutErrPathPrefix(String stdOutErrPathPrefix);
        }
        /** The stage of the Job definition allowing to specify inputDirectories. */
        interface WithInputDirectories {
            /**
             * Specifies the inputDirectories property: A list of input directories for the job..
             *
             * @param inputDirectories A list of input directories for the job.
             * @return the next definition stage.
             */
            WithCreate withInputDirectories(List<InputDirectory> inputDirectories);
        }
        /** The stage of the Job definition allowing to specify outputDirectories. */
        interface WithOutputDirectories {
            /**
             * Specifies the outputDirectories property: A list of output directories for the job..
             *
             * @param outputDirectories A list of output directories for the job.
             * @return the next definition stage.
             */
            WithCreate withOutputDirectories(List<OutputDirectory> outputDirectories);
        }
        /** The stage of the Job definition allowing to specify environmentVariables. */
        interface WithEnvironmentVariables {
            /**
             * Specifies the environmentVariables property: A list of user defined environment variables which will be
             * setup for the job..
             *
             * @param environmentVariables A list of user defined environment variables which will be setup for the job.
             * @return the next definition stage.
             */
            WithCreate withEnvironmentVariables(List<EnvironmentVariable> environmentVariables);
        }
        /** The stage of the Job definition allowing to specify secrets. */
        interface WithSecrets {
            /**
             * Specifies the secrets property: A list of user defined environment variables with secret values which
             * will be setup for the job. Server will never report values of these variables back..
             *
             * @param secrets A list of user defined environment variables with secret values which will be setup for
             *     the job. Server will never report values of these variables back.
             * @return the next definition stage.
             */
            WithCreate withSecrets(List<EnvironmentVariableWithSecretValue> secrets);
        }
        /** The stage of the Job definition allowing to specify constraints. */
        interface WithConstraints {
            /**
             * Specifies the constraints property: Constraints associated with the Job..
             *
             * @param constraints Constraints associated with the Job.
             * @return the next definition stage.
             */
            WithCreate withConstraints(JobBasePropertiesConstraints constraints);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Job refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Job refresh(Context context);

    /**
     * Gets a list of currently existing nodes which were used for the Job execution. The returned information contains
     * the node ID, its public IP and SSH port.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of currently existing nodes which were used for the Job execution.
     */
    PagedIterable<RemoteLoginInformation> listRemoteLoginInformation();

    /**
     * Gets a list of currently existing nodes which were used for the Job execution. The returned information contains
     * the node ID, its public IP and SSH port.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of currently existing nodes which were used for the Job execution.
     */
    PagedIterable<RemoteLoginInformation> listRemoteLoginInformation(Context context);

    /**
     * Terminates a job.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void terminate();

    /**
     * Terminates a job.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void terminate(Context context);
}
