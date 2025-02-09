/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Sighting Impacted Resource summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SightingImpactedResourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SightingImpactedResourceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
        private String sightingId;

        public Builder sightingId(String sightingId) {
            this.sightingId = sightingId;
            this.__explicitlySet__.add("sightingId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
        private java.util.Date timeIdentified;

        public Builder timeIdentified(java.util.Date timeIdentified) {
            this.timeIdentified = timeIdentified;
            this.__explicitlySet__.add("timeIdentified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SightingImpactedResourceSummary build() {
            SightingImpactedResourceSummary __instance__ =
                    new SightingImpactedResourceSummary(
                            id,
                            resourceId,
                            sightingId,
                            problemId,
                            compartmentId,
                            resourceName,
                            resourceType,
                            region,
                            timeIdentified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SightingImpactedResourceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .resourceId(o.getResourceId())
                            .sightingId(o.getSightingId())
                            .problemId(o.getProblemId())
                            .compartmentId(o.getCompartmentId())
                            .resourceName(o.getResourceName())
                            .resourceType(o.getResourceType())
                            .region(o.getRegion())
                            .timeIdentified(o.getTimeIdentified());

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

    /**
     * Unique identifier for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Impacted resource Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * Sighting Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sightingId")
    String sightingId;

    /**
     * Problem Id for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Compartment Id for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Resource name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * Resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;

    /**
     * Region for impacted resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;

    /**
     * Time when the impacted resource is identified for given sighting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeIdentified")
    java.util.Date timeIdentified;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
