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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author Jimmy Leung
 * @since 2013-5-3
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class UUIDEntity implements IdEntity<String> {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Column(length = 32, nullable = false)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    protected String id;

    /**
     * @return the id
     */
    @Override
    public String getId() {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        return this.id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(String id) {
        if (StringUtils.isEmpty(id)) {
            this.id = null;
        } else {
            this.id = id;
        }
    }

}
