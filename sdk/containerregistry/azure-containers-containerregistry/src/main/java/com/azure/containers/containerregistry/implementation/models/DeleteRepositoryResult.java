// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Deleted repository. */
@Immutable
public final class DeleteRepositoryResult {
    /*
     * SHA of the deleted image
     */
    @JsonProperty(value = "manifestsDeleted", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> deletedRegistryArtifactDigests;

    /*
     * Tag of the deleted image
     */
    @JsonProperty(value = "tagsDeleted", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> deletedTags;

    /**
     * Get the deletedRegistryArtifactDigests property: SHA of the deleted image.
     *
     * @return the deletedRegistryArtifactDigests value.
     */
    public List<String> getDeletedRegistryArtifactDigests() {
        return this.deletedRegistryArtifactDigests;
    }

    /**
     * Get the deletedTags property: Tag of the deleted image.
     *
     * @return the deletedTags value.
     */
    public List<String> getDeletedTags() {
        return this.deletedTags;
    }
}
