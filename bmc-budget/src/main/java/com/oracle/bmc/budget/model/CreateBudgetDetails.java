/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The create budget details.
 * <p>
 * Clients should use 'targetType' and 'targets' to specify the target type and list of targets on which the budget is applied.
 * <p>
 * For backwards compatibility, 'targetCompartmentId' is still supported for all existing clients.
 * This is considered deprecated, however, and all clients are upgraded to use 'targetType' and 'targets'.
 * <p>
 * Specifying both 'targetCompartmentId' and 'targets' causes a Bad Request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBudgetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateBudgetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("amount")
        private java.math.BigDecimal amount;

        public Builder amount(java.math.BigDecimal amount) {
            this.amount = amount;
            this.__explicitlySet__.add("amount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
        private ResetPeriod resetPeriod;

        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            this.__explicitlySet__.add("resetPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
        private Integer budgetProcessingPeriodStartOffset;

        public Builder budgetProcessingPeriodStartOffset(
                Integer budgetProcessingPeriodStartOffset) {
            this.budgetProcessingPeriodStartOffset = budgetProcessingPeriodStartOffset;
            this.__explicitlySet__.add("budgetProcessingPeriodStartOffset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
        private ProcessingPeriodType processingPeriodType;

        public Builder processingPeriodType(ProcessingPeriodType processingPeriodType) {
            this.processingPeriodType = processingPeriodType;
            this.__explicitlySet__.add("processingPeriodType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<String> targets;

        public Builder targets(java.util.List<String> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBudgetDetails build() {
            CreateBudgetDetails __instance__ =
                    new CreateBudgetDetails(
                            compartmentId,
                            targetCompartmentId,
                            displayName,
                            description,
                            amount,
                            resetPeriod,
                            budgetProcessingPeriodStartOffset,
                            processingPeriodType,
                            targetType,
                            targets,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBudgetDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .targetCompartmentId(o.getTargetCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .amount(o.getAmount())
                            .resetPeriod(o.getResetPeriod())
                            .budgetProcessingPeriodStartOffset(
                                    o.getBudgetProcessingPeriodStartOffset())
                            .processingPeriodType(o.getProcessingPeriodType())
                            .targetType(o.getTargetType())
                            .targets(o.getTargets())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * This is DEPRECATED. Set the target compartment ID in targets instead.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    String targetCompartmentId;

    /**
     * The displayName of the budget. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The description of the budget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The amount of the budget expressed as a whole number in the currency of the customer's rate card.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("amount")
    java.math.BigDecimal amount;

    /**
     * The reset period for the budget.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resetPeriod")
    ResetPeriod resetPeriod;

    /**
     * The number of days offset from the first day of the month, at which the budget processing period starts. In months that have fewer days than this value, processing will begin on the last day of that month. For example, for a value of 12, processing starts every month on the 12th at midnight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("budgetProcessingPeriodStartOffset")
    Integer budgetProcessingPeriodStartOffset;

    /**
     * The type of the budget processing period. Valid values are INVOICE and MONTH.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("processingPeriodType")
    ProcessingPeriodType processingPeriodType;

    /**
     * The type of target on which the budget is applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    TargetType targetType;

    /**
     * The list of targets on which the budget is applied.
     *   If targetType is "COMPARTMENT", the targets contain the list of compartment OCIDs.
     *   If targetType is "TAG", the targets contain the list of cost tracking tag identifiers in the form of "{tagNamespace}.{tagKey}.{tagValue}".
     * Curerntly, the array should contain exactly one item.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    java.util.List<String> targets;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
