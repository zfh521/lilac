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

package com.lilac.core.entity.sys;

import javax.persistence.OneToMany;

import com.lilac.core.entity.BaseEntity;
import com.lilac.core.security.entity.Organization;

/**
 * @author Jimmy Leung
 * @since 2013-5-7
 */
public class SpaceDefinition extends BaseEntity {

    private String       spaceId;
    @OneToMany
    private Organization organization;
    private String       object;
    private String       namedSpace;
    private boolean      controlFlag;

    /**
     * @return the spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    /**
     * @param spaceId the spaceId to set
     */
    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * @return the controlFlag
     */
    public boolean isControlFlag() {
        return controlFlag;
    }

    /**
     * @param controlFlag the controlFlag to set
     */
    public void setControlFlag(boolean controlFlag) {
        this.controlFlag = controlFlag;
    }

    /**
     * @return the organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * @return the object
     */
    public String getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * @return the namedSpace
     */
    public String getNamedSpace() {
        return namedSpace;
    }

    /**
     * @param namedSpace the namedSpace to set
     */
    public void setNamedSpace(String namedSpace) {
        this.namedSpace = namedSpace;
    }

}
