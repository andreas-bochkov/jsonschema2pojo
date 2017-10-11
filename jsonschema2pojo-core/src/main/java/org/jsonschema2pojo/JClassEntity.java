/**
 * Copyright © 2010-2017 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jsonschema2pojo;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JPackage;

public class JClassEntity {

    private JDefinedClass jClass;
    private JsonNode jsonNode;
    JPackage jPackage;

    /**
     * This class represents those entities that are 
     * @param jClass
     * @param jsonNode
     * @param jPackage
     */
    public JClassEntity(JDefinedClass jClass, JsonNode jsonNode, JPackage jPackage) {
        this.jClass = jClass;
        this.jsonNode = jsonNode;
        this.jPackage = jPackage;
    }

    /**
     * @return the jsonNode
     */
    public JsonNode getJsonNode() {
        return jsonNode;
    }

    /**
     * @param jsonNode
     *            the jsonNode to set
     */
    public void setJsonNode(JsonNode jsonNode) {
        this.jsonNode = jsonNode;
    }

    /**
     * @return the jPackage
     */
    public JPackage getJPackage() {
        return jPackage;
    }

    /**
     * @param jPackage
     *            the jPackage to set
     */
    public void setJPackage(JPackage jPackage) {
        this.jPackage = jPackage;
    }

    /**
     * @return the jClass
     */
    public JDefinedClass getJClass() {
        return jClass;
    }

    /**
     * @param jClass
     *            the jClass to set
     */
    public void setJClass(JDefinedClass jClass) {
        this.jClass = jClass;
    }

}
