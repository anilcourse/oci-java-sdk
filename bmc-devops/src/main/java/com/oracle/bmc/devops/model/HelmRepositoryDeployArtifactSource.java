/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Helm chart source details.
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
    builder = HelmRepositoryDeployArtifactSource.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployArtifactSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HelmRepositoryDeployArtifactSource extends DeployArtifactSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
        private String chartUrl;

        public Builder chartUrl(String chartUrl) {
            this.chartUrl = chartUrl;
            this.__explicitlySet__.add("chartUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactVersion")
        private String deployArtifactVersion;

        public Builder deployArtifactVersion(String deployArtifactVersion) {
            this.deployArtifactVersion = deployArtifactVersion;
            this.__explicitlySet__.add("deployArtifactVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HelmRepositoryDeployArtifactSource build() {
            HelmRepositoryDeployArtifactSource __instance__ =
                    new HelmRepositoryDeployArtifactSource(chartUrl, deployArtifactVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HelmRepositoryDeployArtifactSource o) {
            Builder copiedBuilder =
                    chartUrl(o.getChartUrl()).deployArtifactVersion(o.getDeployArtifactVersion());

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
    public HelmRepositoryDeployArtifactSource(String chartUrl, String deployArtifactVersion) {
        super();
        this.chartUrl = chartUrl;
        this.deployArtifactVersion = deployArtifactVersion;
    }

    /**
     * The URL of an OCIR repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chartUrl")
    String chartUrl;

    /**
     * Users can set this as a placeholder value that refers to a pipeline parameter, for example, ${appVersion}.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactVersion")
    String deployArtifactVersion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
