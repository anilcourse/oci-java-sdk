/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Instance Group Blue-Green deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateComputeInstanceGroupBlueGreenDeployStageDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateComputeInstanceGroupBlueGreenDeployStageDetails
        extends UpdateDeployStageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessorCollection")
        private DeployStagePredecessorCollection deployStagePredecessorCollection;

        public Builder deployStagePredecessorCollection(
                DeployStagePredecessorCollection deployStagePredecessorCollection) {
            this.deployStagePredecessorCollection = deployStagePredecessorCollection;
            this.__explicitlySet__.add("deployStagePredecessorCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
        private String deploymentSpecDeployArtifactId;

        public Builder deploymentSpecDeployArtifactId(String deploymentSpecDeployArtifactId) {
            this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
            this.__explicitlySet__.add("deploymentSpecDeployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
        private java.util.List<String> deployArtifactIds;

        public Builder deployArtifactIds(java.util.List<String> deployArtifactIds) {
            this.deployArtifactIds = deployArtifactIds;
            this.__explicitlySet__.add("deployArtifactIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
        private ComputeInstanceGroupRolloutPolicy rolloutPolicy;

        public Builder rolloutPolicy(ComputeInstanceGroupRolloutPolicy rolloutPolicy) {
            this.rolloutPolicy = rolloutPolicy;
            this.__explicitlySet__.add("rolloutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
        private ComputeInstanceGroupFailurePolicy failurePolicy;

        public Builder failurePolicy(ComputeInstanceGroupFailurePolicy failurePolicy) {
            this.failurePolicy = failurePolicy;
            this.__explicitlySet__.add("failurePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
        private LoadBalancerConfig testLoadBalancerConfig;

        public Builder testLoadBalancerConfig(LoadBalancerConfig testLoadBalancerConfig) {
            this.testLoadBalancerConfig = testLoadBalancerConfig;
            this.__explicitlySet__.add("testLoadBalancerConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateComputeInstanceGroupBlueGreenDeployStageDetails build() {
            UpdateComputeInstanceGroupBlueGreenDeployStageDetails __instance__ =
                    new UpdateComputeInstanceGroupBlueGreenDeployStageDetails(
                            description,
                            displayName,
                            deployStagePredecessorCollection,
                            freeformTags,
                            definedTags,
                            deploymentSpecDeployArtifactId,
                            deployArtifactIds,
                            rolloutPolicy,
                            failurePolicy,
                            testLoadBalancerConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateComputeInstanceGroupBlueGreenDeployStageDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .deployStagePredecessorCollection(
                                    o.getDeployStagePredecessorCollection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .deploymentSpecDeployArtifactId(o.getDeploymentSpecDeployArtifactId())
                            .deployArtifactIds(o.getDeployArtifactIds())
                            .rolloutPolicy(o.getRolloutPolicy())
                            .failurePolicy(o.getFailurePolicy())
                            .testLoadBalancerConfig(o.getTestLoadBalancerConfig());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public UpdateComputeInstanceGroupBlueGreenDeployStageDetails(
            String description,
            String displayName,
            DeployStagePredecessorCollection deployStagePredecessorCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String deploymentSpecDeployArtifactId,
            java.util.List<String> deployArtifactIds,
            ComputeInstanceGroupRolloutPolicy rolloutPolicy,
            ComputeInstanceGroupFailurePolicy failurePolicy,
            LoadBalancerConfig testLoadBalancerConfig) {
        super(
                description,
                displayName,
                deployStagePredecessorCollection,
                freeformTags,
                definedTags);
        this.deploymentSpecDeployArtifactId = deploymentSpecDeployArtifactId;
        this.deployArtifactIds = deployArtifactIds;
        this.rolloutPolicy = rolloutPolicy;
        this.failurePolicy = failurePolicy;
        this.testLoadBalancerConfig = testLoadBalancerConfig;
    }

    /**
     * The OCID of the artifact that contains the deployment specification.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentSpecDeployArtifactId")
    String deploymentSpecDeployArtifactId;

    /**
     * The list of file artifact OCIDs to deploy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactIds")
    java.util.List<String> deployArtifactIds;

    @com.fasterxml.jackson.annotation.JsonProperty("rolloutPolicy")
    ComputeInstanceGroupRolloutPolicy rolloutPolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("failurePolicy")
    ComputeInstanceGroupFailurePolicy failurePolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("testLoadBalancerConfig")
    LoadBalancerConfig testLoadBalancerConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
