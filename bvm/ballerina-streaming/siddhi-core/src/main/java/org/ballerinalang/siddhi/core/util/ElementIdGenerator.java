/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.siddhi.core.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * unique id generator for elements inside a given siddhi app.
 */
public class ElementIdGenerator {

    private String siddhiAppName;
    private AtomicLong id = new AtomicLong(0);

    public ElementIdGenerator(String siddhiAppName) {
        this.siddhiAppName = siddhiAppName;
    }

    public String createNewId() {
        return siddhiAppName + "-" + id.incrementAndGet();
    }
}
