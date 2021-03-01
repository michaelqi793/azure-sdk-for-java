// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.resourcemanager.iothub.fluent.models.JobResponseInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of JobResponse. */
public interface JobResponse {
    /**
     * Gets the jobId property: The job identifier.
     *
     * @return the jobId value.
     */
    String jobId();

    /**
     * Gets the startTimeUtc property: The start time of the job.
     *
     * @return the startTimeUtc value.
     */
    OffsetDateTime startTimeUtc();

    /**
     * Gets the endTimeUtc property: The time the job stopped processing.
     *
     * @return the endTimeUtc value.
     */
    OffsetDateTime endTimeUtc();

    /**
     * Gets the type property: The type of the job.
     *
     * @return the type value.
     */
    JobType type();

    /**
     * Gets the status property: The status of the job.
     *
     * @return the status value.
     */
    JobStatus status();

    /**
     * Gets the failureReason property: If status == failed, this string containing the reason for the failure.
     *
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * Gets the statusMessage property: The status message for the job.
     *
     * @return the statusMessage value.
     */
    String statusMessage();

    /**
     * Gets the parentJobId property: The job identifier of the parent job, if any.
     *
     * @return the parentJobId value.
     */
    String parentJobId();

    /**
     * Gets the inner com.azure.resourcemanager.iothub.fluent.models.JobResponseInner object.
     *
     * @return the inner object.
     */
    JobResponseInner innerModel();
}
