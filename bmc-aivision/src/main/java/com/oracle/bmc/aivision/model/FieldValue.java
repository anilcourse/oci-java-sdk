/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The value of a form field.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "valueType",
    defaultImpl = FieldValue.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueTime.class, name = "TIME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ValueInteger.class,
        name = "INTEGER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueDate.class, name = "DATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueNumber.class, name = "NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueString.class, name = "STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ValuePhoneNumber.class,
        name = "PHONE_NUMBER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueArray.class, name = "ARRAY")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FieldValue {

    /**
     * The detected text of a field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    String text;

    /**
     * The confidence score between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Float confidence;

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    BoundingPolygon boundingPolygon;

    /**
     * The indexes of the words in the field value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
    java.util.List<Integer> wordIndexes;

    /**
     * The type of data detected.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ValueType {
        String("STRING"),
        Date("DATE"),
        Time("TIME"),
        PhoneNumber("PHONE_NUMBER"),
        Number("NUMBER"),
        Integer("INTEGER"),
        Array("ARRAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ValueType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueType v : ValueType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValueType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValueType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
