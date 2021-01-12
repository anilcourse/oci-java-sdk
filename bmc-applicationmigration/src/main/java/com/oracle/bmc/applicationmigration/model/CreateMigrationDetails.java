/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * While creating a migration, specify the source and the application that you want migrate.
 * Each migration moves a single application from a specified source to a specified Oracle Cloud Infrastructure tenancy.
 * If required, provide the credentials of the application administrator in the source environment.
 * Application Migration uses this information to access the application, as well as discover application artifacts,
 * such as the complete domain configuration along with data sources and other dependencies.
 * <p>
 * You must also assign a name and provide a description for the migration.
 * This helps you to identify the appropriate source environment when you have multiple sources defined.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191031")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMigrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateMigrationDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
        private DiscoveryDetails discoveryDetails;

        public Builder discoveryDetails(DiscoveryDetails discoveryDetails) {
            this.discoveryDetails = discoveryDetails;
            this.__explicitlySet__.add("discoveryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
        private TargetDatabaseTypes preCreatedTargetDatabaseType;

        public Builder preCreatedTargetDatabaseType(
                TargetDatabaseTypes preCreatedTargetDatabaseType) {
            this.preCreatedTargetDatabaseType = preCreatedTargetDatabaseType;
            this.__explicitlySet__.add("preCreatedTargetDatabaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
        private java.util.Map<String, ConfigurationField> serviceConfig;

        public Builder serviceConfig(java.util.Map<String, ConfigurationField> serviceConfig) {
            this.serviceConfig = serviceConfig;
            this.__explicitlySet__.add("serviceConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
        private java.util.Map<String, ConfigurationField> applicationConfig;

        public Builder applicationConfig(
                java.util.Map<String, ConfigurationField> applicationConfig) {
            this.applicationConfig = applicationConfig;
            this.__explicitlySet__.add("applicationConfig");
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

        public CreateMigrationDetails build() {
            CreateMigrationDetails __instance__ =
                    new CreateMigrationDetails(
                            compartmentId,
                            displayName,
                            description,
                            sourceId,
                            applicationName,
                            discoveryDetails,
                            preCreatedTargetDatabaseType,
                            serviceConfig,
                            applicationConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMigrationDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .sourceId(o.getSourceId())
                            .applicationName(o.getApplicationName())
                            .discoveryDetails(o.getDiscoveryDetails())
                            .preCreatedTargetDatabaseType(o.getPreCreatedTargetDatabaseType())
                            .serviceConfig(o.getServiceConfig())
                            .applicationConfig(o.getApplicationConfig())
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * User-friendly name of the application. This will be the name of the migrated application in Oracle Cloud Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the application that you are migrating.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * Name of the application that you want to migrate from the source environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    String applicationName;

    @com.fasterxml.jackson.annotation.JsonProperty("discoveryDetails")
    DiscoveryDetails discoveryDetails;

    /**
     * The pre-existing database type to be used in this migration. Currently, Application migration only supports Oracle Cloud
     * Infrastrure databases and this option is currently available only for `JAVA_CLOUD_SERVICE` and `WEBLOGIC_CLOUD_SERVICE` target instance types.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preCreatedTargetDatabaseType")
    TargetDatabaseTypes preCreatedTargetDatabaseType;

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConfig")
    java.util.Map<String, ConfigurationField> serviceConfig;

    /**
     * Configuration required to migrate the application. In addition to the key and value, additional fields are provided
     * to describe type type and purpose of each field. Only the value for each key is required when passing configuration to the
     * CreateMigration operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationConfig")
    java.util.Map<String, ConfigurationField> applicationConfig;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
