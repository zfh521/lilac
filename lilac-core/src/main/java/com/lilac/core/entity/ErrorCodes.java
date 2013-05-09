/*
 * Copyright 2013 Jimmy Leung
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

package com.lilac.core.entity;

/**
 * @author Jimmy Leung
 * @since 2013-5-9
 */
public enum ErrorCodes {

    DATABASE("", "", "");

    private final String code;
    private final String description;
    private final String solution;

    /**
     * @param code
     * @param description
     * @param solution
     */
    private ErrorCodes(String code, String description, String solution){
        this.code = code;
        this.description = description;
        this.solution = solution;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the solution
     */
    public String getSolution() {
        return solution;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return code + " : " + description;
    }

}
