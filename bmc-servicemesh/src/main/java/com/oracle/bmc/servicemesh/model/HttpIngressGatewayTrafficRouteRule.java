/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming ingress gateway traffic with HTTP protocol
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HttpIngressGatewayTrafficRouteRule.Builder.class
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
public class HttpIngressGatewayTrafficRouteRule extends IngressGatewayTrafficRouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ingressGatewayHost")
        private IngressGatewayHostRef ingressGatewayHost;

        public Builder ingressGatewayHost(IngressGatewayHostRef ingressGatewayHost) {
            this.ingressGatewayHost = ingressGatewayHost;
            this.__explicitlySet__.add("ingressGatewayHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destinations")
        private java.util.List<VirtualServiceTrafficRuleTarget> destinations;

        public Builder destinations(java.util.List<VirtualServiceTrafficRuleTarget> destinations) {
            this.destinations = destinations;
            this.__explicitlySet__.add("destinations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathType")
        private PathType pathType;

        public Builder pathType(PathType pathType) {
            this.pathType = pathType;
            this.__explicitlySet__.add("pathType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
        private Boolean isGrpc;

        public Builder isGrpc(Boolean isGrpc) {
            this.isGrpc = isGrpc;
            this.__explicitlySet__.add("isGrpc");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHostRewriteEnabled")
        private Boolean isHostRewriteEnabled;

        public Builder isHostRewriteEnabled(Boolean isHostRewriteEnabled) {
            this.isHostRewriteEnabled = isHostRewriteEnabled;
            this.__explicitlySet__.add("isHostRewriteEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPathRewriteEnabled")
        private Boolean isPathRewriteEnabled;

        public Builder isPathRewriteEnabled(Boolean isPathRewriteEnabled) {
            this.isPathRewriteEnabled = isPathRewriteEnabled;
            this.__explicitlySet__.add("isPathRewriteEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HttpIngressGatewayTrafficRouteRule build() {
            HttpIngressGatewayTrafficRouteRule __instance__ =
                    new HttpIngressGatewayTrafficRouteRule(
                            ingressGatewayHost,
                            destinations,
                            path,
                            pathType,
                            isGrpc,
                            isHostRewriteEnabled,
                            isPathRewriteEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HttpIngressGatewayTrafficRouteRule o) {
            Builder copiedBuilder =
                    ingressGatewayHost(o.getIngressGatewayHost())
                            .destinations(o.getDestinations())
                            .path(o.getPath())
                            .pathType(o.getPathType())
                            .isGrpc(o.getIsGrpc())
                            .isHostRewriteEnabled(o.getIsHostRewriteEnabled())
                            .isPathRewriteEnabled(o.getIsPathRewriteEnabled());

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
    public HttpIngressGatewayTrafficRouteRule(
            IngressGatewayHostRef ingressGatewayHost,
            java.util.List<VirtualServiceTrafficRuleTarget> destinations,
            String path,
            PathType pathType,
            Boolean isGrpc,
            Boolean isHostRewriteEnabled,
            Boolean isPathRewriteEnabled) {
        super(ingressGatewayHost, destinations);
        this.path = path;
        this.pathType = pathType;
        this.isGrpc = isGrpc;
        this.isHostRewriteEnabled = isHostRewriteEnabled;
        this.isPathRewriteEnabled = isPathRewriteEnabled;
    }

    /**
     * Route to match
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;
    /**
     * Match type for the route
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PathType {
        Prefix("PREFIX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PathType> map;

        static {
            map = new java.util.HashMap<>();
            for (PathType v : PathType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PathType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PathType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PathType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Match type for the route
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathType")
    PathType pathType;

    /**
     * If true, the rule will check that the content-type header has a application/grpc
     * or one of the various application/grpc+ values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGrpc")
    Boolean isGrpc;

    /**
     * If true, the hostname will be rewritten to the target virtual deployment's DNS hostname.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHostRewriteEnabled")
    Boolean isHostRewriteEnabled;

    /**
     * If true, the matched path prefix will be rewritten to '/' before being directed to the target virtual deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPathRewriteEnabled")
    Boolean isPathRewriteEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
