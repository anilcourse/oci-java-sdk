/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the source object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Source.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Source extends Operator {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<TypedObject> outputPorts;

        public Builder outputPorts(java.util.List<TypedObject> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entity")
        private DataEntity entity;

        public Builder entity(DataEntity entity) {
            this.entity = entity;
            this.__explicitlySet__.add("entity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
        private Boolean isReadAccess;

        public Builder isReadAccess(Boolean isReadAccess) {
            this.isReadAccess = isReadAccess;
            this.__explicitlySet__.add("isReadAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
        private Boolean isCopyFields;

        public Builder isCopyFields(Boolean isCopyFields) {
            this.isCopyFields = isCopyFields;
            this.__explicitlySet__.add("isCopyFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
        private Boolean isPredefinedShape;

        public Builder isPredefinedShape(Boolean isPredefinedShape) {
            this.isPredefinedShape = isPredefinedShape;
            this.__explicitlySet__.add("isPredefinedShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaDriftConfig")
        private SchemaDriftConfig schemaDriftConfig;

        public Builder schemaDriftConfig(SchemaDriftConfig schemaDriftConfig) {
            this.schemaDriftConfig = schemaDriftConfig;
            this.__explicitlySet__.add("schemaDriftConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fixedDataShape")
        private Shape fixedDataShape;

        public Builder fixedDataShape(Shape fixedDataShape) {
            this.fixedDataShape = fixedDataShape;
            this.__explicitlySet__.add("fixedDataShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
        private ReadOperationConfig readOperationConfig;

        public Builder readOperationConfig(ReadOperationConfig readOperationConfig) {
            this.readOperationConfig = readOperationConfig;
            this.__explicitlySet__.add("readOperationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Source build() {
            Source __instance__ =
                    new Source(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            inputPorts,
                            outputPorts,
                            objectStatus,
                            identifier,
                            parameters,
                            opConfigValues,
                            entity,
                            isReadAccess,
                            isCopyFields,
                            isPredefinedShape,
                            schemaDriftConfig,
                            fixedDataShape,
                            readOperationConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Source o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .entity(o.getEntity())
                            .isReadAccess(o.getIsReadAccess())
                            .isCopyFields(o.getIsCopyFields())
                            .isPredefinedShape(o.getIsPredefinedShape())
                            .schemaDriftConfig(o.getSchemaDriftConfig())
                            .fixedDataShape(o.getFixedDataShape())
                            .readOperationConfig(o.getReadOperationConfig());

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
    public Source(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<TypedObject> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            DataEntity entity,
            Boolean isReadAccess,
            Boolean isCopyFields,
            Boolean isPredefinedShape,
            SchemaDriftConfig schemaDriftConfig,
            Shape fixedDataShape,
            ReadOperationConfig readOperationConfig) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.entity = entity;
        this.isReadAccess = isReadAccess;
        this.isCopyFields = isCopyFields;
        this.isPredefinedShape = isPredefinedShape;
        this.schemaDriftConfig = schemaDriftConfig;
        this.fixedDataShape = fixedDataShape;
        this.readOperationConfig = readOperationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    DataEntity entity;

    /**
     * Specifies the read access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
    Boolean isReadAccess;

    /**
     * Specifies the copy fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
    Boolean isCopyFields;

    /**
     * Specifies if this uses a predefined shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
    Boolean isPredefinedShape;

    @com.fasterxml.jackson.annotation.JsonProperty("schemaDriftConfig")
    SchemaDriftConfig schemaDriftConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("fixedDataShape")
    Shape fixedDataShape;

    @com.fasterxml.jackson.annotation.JsonProperty("readOperationConfig")
    ReadOperationConfig readOperationConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
