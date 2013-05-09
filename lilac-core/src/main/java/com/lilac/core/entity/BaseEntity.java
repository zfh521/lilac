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

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lilac.core.annotation.I18NMessage;
import com.lilac.core.entity.sys.SpaceDefinition;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.util.DateUtils;

/**
 * @author Jimmy Leung
 * @since 2013-4-26
 */

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseEntity extends UUIDEntity {

    @Transient
    protected static final Logger log            = LoggerFactory.getLogger(BaseEntity.class);

    @Column(insertable = true, updatable = false)
    @I18NMessage(code = "LBL_SPACE_DEFINITION")
    protected SpaceDefinition     spaceDefinition;

    @Column(insertable = true, updatable = false)
    protected Date                createdTime    = DateUtils.getCurrentDate();
    @ManyToOne(optional = false)
    @JoinColumn(insertable = true, updatable = false)
    protected UserInfo            createdUser;
    @Column(insertable = false, updatable = true)
    protected Date                lastUpdateTime = DateUtils.getCurrentDate();
    @ManyToOne
    @JoinColumn(insertable = false, updatable = true)
    protected UserInfo            lastUpdateUser;
    protected Integer             currentVersion = new Integer(1);
    protected Integer             activeVersion  = new Integer(1);
    @Version
    protected Integer             version;
    protected EntityStatus        entityStatus   = EntityStatus.ENABLED;

    private String                attribute1;
    private String                attribute2;
    private String                attribute3;
    private String                attribute4;
    private String                attribute5;

    /**
     * @return the createdTime
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * @param createdTime the createdTime to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * @return the createdUser
     */
    public UserInfo getCreatedUser() {
        return createdUser;
    }

    /**
     * @param createdUser the createdUser to set
     */
    public void setCreatedUser(UserInfo createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * @return the lastUpdateTime
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * @return the lastUpdateUser
     */
    public UserInfo getLastUpdateUser() {
        return lastUpdateUser;
    }

    /**
     * @param lastUpdateUser the lastUpdateUser to set
     */
    public void setLastUpdateUser(UserInfo lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /**
     * @return the currentVersion
     */
    public Integer getCurrentVersion() {
        return currentVersion;
    }

    /**
     * @param currentVersion the currentVersion to set
     */
    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * @return the activeVersion
     */
    public Integer getActiveVersion() {
        return activeVersion;
    }

    /**
     * @param activeVersion the activeVersion to set
     */
    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    /**
     * @return the entityStatus
     */
    public EntityStatus getEntityStatus() {
        return entityStatus;
    }

    /**
     * @param entityStatus the entityStatus to set
     */
    public void setEntityStatus(EntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return the attribute1
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * @param attribute1 the attribute1 to set
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /**
     * @return the attribute2
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * @param attribute2 the attribute2 to set
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /**
     * @return the attribute3
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * @param attribute3 the attribute3 to set
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /**
     * @return the attribute4
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * @param attribute4 the attribute4 to set
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /**
     * @return the attribute5
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * @param attribute5 the attribute5 to set
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
