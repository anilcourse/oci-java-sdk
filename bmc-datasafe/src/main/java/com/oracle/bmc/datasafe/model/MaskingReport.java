/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A masking report contains information about a completed masking request. It includes details such as the target database masked,
 * masking policy used, masking start and finish time, total number of schemas, tables, columns and values masked, masked columns, and the masking formats used.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskingReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskingReport {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
        private String maskingWorkRequestId;

        public Builder maskingWorkRequestId(String maskingWorkRequestId) {
            this.maskingWorkRequestId = maskingWorkRequestId;
            this.__explicitlySet__.add("maskingWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSensitiveTypes")
        private Long totalMaskedSensitiveTypes;

        public Builder totalMaskedSensitiveTypes(Long totalMaskedSensitiveTypes) {
            this.totalMaskedSensitiveTypes = totalMaskedSensitiveTypes;
            this.__explicitlySet__.add("totalMaskedSensitiveTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSchemas")
        private Long totalMaskedSchemas;

        public Builder totalMaskedSchemas(Long totalMaskedSchemas) {
            this.totalMaskedSchemas = totalMaskedSchemas;
            this.__explicitlySet__.add("totalMaskedSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedObjects")
        private Long totalMaskedObjects;

        public Builder totalMaskedObjects(Long totalMaskedObjects) {
            this.totalMaskedObjects = totalMaskedObjects;
            this.__explicitlySet__.add("totalMaskedObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedColumns")
        private Long totalMaskedColumns;

        public Builder totalMaskedColumns(Long totalMaskedColumns) {
            this.totalMaskedColumns = totalMaskedColumns;
            this.__explicitlySet__.add("totalMaskedColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
        private Long totalMaskedValues;

        public Builder totalMaskedValues(Long totalMaskedValues) {
            this.totalMaskedValues = totalMaskedValues;
            this.__explicitlySet__.add("totalMaskedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStarted")
        private java.util.Date timeMaskingStarted;

        public Builder timeMaskingStarted(java.util.Date timeMaskingStarted) {
            this.timeMaskingStarted = timeMaskingStarted;
            this.__explicitlySet__.add("timeMaskingStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinished")
        private java.util.Date timeMaskingFinished;

        public Builder timeMaskingFinished(java.util.Date timeMaskingFinished) {
            this.timeMaskingFinished = timeMaskingFinished;
            this.__explicitlySet__.add("timeMaskingFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingReport build() {
            MaskingReport __instance__ =
                    new MaskingReport(
                            id,
                            compartmentId,
                            maskingWorkRequestId,
                            maskingPolicyId,
                            targetId,
                            totalMaskedSensitiveTypes,
                            totalMaskedSchemas,
                            totalMaskedObjects,
                            totalMaskedColumns,
                            totalMaskedValues,
                            timeMaskingStarted,
                            timeMaskingFinished);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingReport o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .maskingWorkRequestId(o.getMaskingWorkRequestId())
                            .maskingPolicyId(o.getMaskingPolicyId())
                            .targetId(o.getTargetId())
                            .totalMaskedSensitiveTypes(o.getTotalMaskedSensitiveTypes())
                            .totalMaskedSchemas(o.getTotalMaskedSchemas())
                            .totalMaskedObjects(o.getTotalMaskedObjects())
                            .totalMaskedColumns(o.getTotalMaskedColumns())
                            .totalMaskedValues(o.getTotalMaskedValues())
                            .timeMaskingStarted(o.getTimeMaskingStarted())
                            .timeMaskingFinished(o.getTimeMaskingFinished());

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
     * The OCID of the masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains the masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the masking work request that resulted in this masking report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingWorkRequestId")
    String maskingWorkRequestId;

    /**
     * The OCID of the masking policy used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    String maskingPolicyId;

    /**
     * The OCID of the target database masked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The total number of unique sensitive types associated with the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSensitiveTypes")
    Long totalMaskedSensitiveTypes;

    /**
     * The total number of unique schemas that contain the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedSchemas")
    Long totalMaskedSchemas;

    /**
     * The total number of unique objects (tables and editioning views) that contain the masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedObjects")
    Long totalMaskedObjects;

    /**
     * The total number of masked columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedColumns")
    Long totalMaskedColumns;

    /**
     * The total number of masked values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMaskedValues")
    Long totalMaskedValues;

    /**
     * The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStarted")
    java.util.Date timeMaskingStarted;

    /**
     * The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinished")
    java.util.Date timeMaskingFinished;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
