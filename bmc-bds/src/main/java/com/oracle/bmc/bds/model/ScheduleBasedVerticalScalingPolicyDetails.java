/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of a schedule based vertical autoscaling policy.
 * <p>
 * In a schedule-based autoscaling policy, an autoscaling action is triggered at the scheduled execution time.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduleBasedVerticalScalingPolicyDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ScheduleBasedVerticalScalingPolicyDetails extends AutoScalePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
        private TriggerType triggerType;

        public Builder triggerType(TriggerType triggerType) {
            this.triggerType = triggerType;
            this.__explicitlySet__.add("triggerType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private java.util.List<VerticalScalingScheduleDetails> scheduleDetails;

        public Builder scheduleDetails(
                java.util.List<VerticalScalingScheduleDetails> scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleBasedVerticalScalingPolicyDetails build() {
            ScheduleBasedVerticalScalingPolicyDetails __instance__ =
                    new ScheduleBasedVerticalScalingPolicyDetails(
                            triggerType, actionType, timezone, scheduleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleBasedVerticalScalingPolicyDetails o) {
            Builder copiedBuilder =
                    triggerType(o.getTriggerType())
                            .actionType(o.getActionType())
                            .timezone(o.getTimezone())
                            .scheduleDetails(o.getScheduleDetails());

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
    public ScheduleBasedVerticalScalingPolicyDetails(
            TriggerType triggerType,
            ActionType actionType,
            String timezone,
            java.util.List<VerticalScalingScheduleDetails> scheduleDetails) {
        super(triggerType, actionType);
        this.timezone = timezone;
        this.scheduleDetails = scheduleDetails;
    }

    /**
     * The time zone of the execution schedule, in IANA time zone database name format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    String timezone;

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
    java.util.List<VerticalScalingScheduleDetails> scheduleDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
