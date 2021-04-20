// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define the source location where the artifacts are located. */
@Fluent
public class ArtifactSourcePropertiesAutoGenerated {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ArtifactSourcePropertiesAutoGenerated.class);

    /*
     * The type of artifact source used.
     */
    @JsonProperty(value = "sourceType", required = true)
    private String sourceType;

    /*
     * The path from the location that the 'authentication' property [say, a
     * SAS URI to the blob container] refers to, to the location of the
     * artifacts. This can be used to differentiate different versions of the
     * artifacts. Or, different types of artifacts like binaries or templates.
     * The location referenced by the authentication property concatenated with
     * this optional artifactRoot path forms the artifact source location where
     * the artifacts are expected to be found.
     */
    @JsonProperty(value = "artifactRoot")
    private String artifactRoot;

    /*
     * The authentication method to use to access the artifact source.
     */
    @JsonProperty(value = "authentication", required = true)
    private Authentication authentication;

    /**
     * Get the sourceType property: The type of artifact source used.
     *
     * @return the sourceType value.
     */
    public String sourceType() {
        return this.sourceType;
    }

    /**
     * Set the sourceType property: The type of artifact source used.
     *
     * @param sourceType the sourceType value to set.
     * @return the ArtifactSourcePropertiesAutoGenerated object itself.
     */
    public ArtifactSourcePropertiesAutoGenerated withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * Get the artifactRoot property: The path from the location that the 'authentication' property [say, a SAS URI to
     * the blob container] refers to, to the location of the artifacts. This can be used to differentiate different
     * versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced
     * by the authentication property concatenated with this optional artifactRoot path forms the artifact source
     * location where the artifacts are expected to be found.
     *
     * @return the artifactRoot value.
     */
    public String artifactRoot() {
        return this.artifactRoot;
    }

    /**
     * Set the artifactRoot property: The path from the location that the 'authentication' property [say, a SAS URI to
     * the blob container] refers to, to the location of the artifacts. This can be used to differentiate different
     * versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced
     * by the authentication property concatenated with this optional artifactRoot path forms the artifact source
     * location where the artifacts are expected to be found.
     *
     * @param artifactRoot the artifactRoot value to set.
     * @return the ArtifactSourcePropertiesAutoGenerated object itself.
     */
    public ArtifactSourcePropertiesAutoGenerated withArtifactRoot(String artifactRoot) {
        this.artifactRoot = artifactRoot;
        return this;
    }

    /**
     * Get the authentication property: The authentication method to use to access the artifact source.
     *
     * @return the authentication value.
     */
    public Authentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: The authentication method to use to access the artifact source.
     *
     * @param authentication the authentication value to set.
     * @return the ArtifactSourcePropertiesAutoGenerated object itself.
     */
    public ArtifactSourcePropertiesAutoGenerated withAuthentication(Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceType in model ArtifactSourcePropertiesAutoGenerated"));
        }
        if (authentication() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authentication in model ArtifactSourcePropertiesAutoGenerated"));
        } else {
            authentication().validate();
        }
    }
}
