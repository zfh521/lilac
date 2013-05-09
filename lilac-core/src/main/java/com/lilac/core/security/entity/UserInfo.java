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

package com.lilac.core.security.entity;

import javax.persistence.Entity;

import com.lilac.core.entity.BaseEntity;

/**
 * @author Jimmy Leung
 * @since 2013-4-26
 */
@Entity
public class UserInfo extends BaseEntity {

    private String instanceDesc;

    /**
     * @return the instanceDesc
     */
    public String getInstanceDesc() {
        return instanceDesc;
    }

    /**
     * @param instanceDesc the instanceDesc to set
     */
    public void setInstanceDesc(String instanceDesc) {
        this.instanceDesc = instanceDesc;
    }

}
