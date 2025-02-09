/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.applicationmigration.model;

/**
 * Credentials to access the Oracle Java Cloud Service application in the source environment. When you create and update a migration,
 * Application Migration connects to the application in the source environment with the supplied credentials and exports the domain
 * configuration.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JcsDiscoveryDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JcsDiscoveryDetails extends DiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("weblogicUser")
        private String weblogicUser;

        public Builder weblogicUser(String weblogicUser) {
            this.weblogicUser = weblogicUser;
            this.__explicitlySet__.add("weblogicUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weblogicPassword")
        private String weblogicPassword;

        public Builder weblogicPassword(String weblogicPassword) {
            this.weblogicPassword = weblogicPassword;
            this.__explicitlySet__.add("weblogicPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JcsDiscoveryDetails build() {
            JcsDiscoveryDetails __instance__ =
                    new JcsDiscoveryDetails(weblogicUser, weblogicPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JcsDiscoveryDetails o) {
            Builder copiedBuilder =
                    weblogicUser(o.getWeblogicUser()).weblogicPassword(o.getWeblogicPassword());

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
    public JcsDiscoveryDetails(String weblogicUser, String weblogicPassword) {
        super();
        this.weblogicUser = weblogicUser;
        this.weblogicPassword = weblogicPassword;
    }

    /**
     * WebLogic administrator username for the Oracle Java Cloud Service application in the source environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicUser")
    String weblogicUser;

    /**
     * The password of the WebLogic administrator for the Oracle Java Cloud Service application in the source environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weblogicPassword")
    String weblogicPassword;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
