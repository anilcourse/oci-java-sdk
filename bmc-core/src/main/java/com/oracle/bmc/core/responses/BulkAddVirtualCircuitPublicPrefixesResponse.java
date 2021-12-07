/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class BulkAddVirtualCircuitPublicPrefixesResponse
        extends com.oracle.bmc.responses.BmcResponse {

    @java.beans.ConstructorProperties({"__httpStatusCode__"})
    private BulkAddVirtualCircuitPublicPrefixesResponse(int __httpStatusCode__) {
        super(__httpStatusCode__);
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(BulkAddVirtualCircuitPublicPrefixesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());

            return this;
        }

        public BulkAddVirtualCircuitPublicPrefixesResponse build() {
            return new BulkAddVirtualCircuitPublicPrefixesResponse(__httpStatusCode__);
        }
    }
}
