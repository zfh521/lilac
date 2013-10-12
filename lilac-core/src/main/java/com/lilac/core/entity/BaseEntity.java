package com.lilac.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.envers.Audited;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.lilac.core.annotation.I18NMessage;
import com.lilac.core.entity.support.EntityListener;
import com.lilac.core.entity.support.EntityStatus;
import com.lilac.core.entity.support.UUIDEntity;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.sys.entity.SpaceDefinition;

/**
 * @author andy
 * @since 2013-4-26
 */

@SuppressWarnings("serial")
@EntityListeners(value = EntityListener.class)
@MappedSuperclass
@Audited
public abstract class BaseEntity extends UUIDEntity implements IEntity<String> {

    @Transient
    protected static final Logger log = LoggerFactory.getLogger(BaseEntity.class);

    protected String              instanceId;

    @Column(insertable = true, updatable = false)
    @I18NMessage(code = "LBL_SPACE_DEFINITION")
    protected SpaceDefinition     spaceDefinition;

    @Column(insertable = true, updatable = false)
    protected Date                createdTime;
    @ManyToOne
    @JoinColumn(insertable = true, updatable = false)
    protected UserInfo            createdUser;
    @Column(insertable = true, updatable = true)
    protected Date                lastUpdateTime;
    @ManyToOne
    @JoinColumn(insertable = true, updatable = true)
    protected UserInfo            lastUpdateUser;
    protected Integer             currentVersion;
    protected Integer             activeVersion;
    @Version
    protected Integer             version;
    protected EntityStatus        entityStatus;

    protected String              attribute1;
    protected String              attribute2;
    protected String              attribute3;
    protected String              attribute4;
    protected String              attribute5;

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.s#getInstanceId()
     */
    @Override
    public String getInstanceId() {
        return instanceId;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.s#setInstanceId(java.lang.String)
     */
    @Override
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.s#getSpaceDefinition()
     */
    @Override
    public SpaceDefinition getSpaceDefinition() {
        return spaceDefinition;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.s#setSpaceDefinition(com.lilac.core.entity.sys.SpaceDefinition)
     */
    @Override
    public void setSpaceDefinition(SpaceDefinition spaceDefinition) {
        this.spaceDefinition = spaceDefinition;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getCreatedTime()
     */
    @Override
    public Date getCreatedTime() {
        return createdTime;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setCreatedTime(java.util.Date)
     */
    @Override
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getCreatedUser()
     */
    @Override
    public UserInfo getCreatedUser() {
        return createdUser;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setCreatedUser(com.lilac.core.security.entity.UserInfo)
     */
    @Override
    public void setCreatedUser(UserInfo createdUser) {
        this.createdUser = createdUser;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getLastUpdateTime()
     */
    @Override
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setLastUpdateTime(java.util.Date)
     */
    @Override
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getLastUpdateUser()
     */
    @Override
    public UserInfo getLastUpdateUser() {
        return lastUpdateUser;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setLastUpdateUser(com.lilac.core.security.entity.UserInfo)
     */
    @Override
    public void setLastUpdateUser(UserInfo lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getCurrentVersion()
     */
    @Override
    public Integer getCurrentVersion() {
        return currentVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setCurrentVersion(java.lang.Integer)
     */
    @Override
    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getActiveVersion()
     */
    @Override
    public Integer getActiveVersion() {
        return activeVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setActiveVersion(java.lang.Integer)
     */
    @Override
    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getEntityStatus()
     */
    @Override
    public EntityStatus getEntityStatus() {
        return entityStatus;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setEntityStatus(com.lilac.core.entity.EntityStatus)
     */
    @Override
    public void setEntityStatus(EntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getVersion()
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setVersion(java.lang.Integer)
     */
    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getAttribute1()
     */
    @Override
    public String getAttribute1() {
        return attribute1;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setAttribute1(java.lang.String)
     */
    @Override
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getAttribute2()
     */
    @Override
    public String getAttribute2() {
        return attribute2;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setAttribute2(java.lang.String)
     */
    @Override
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getAttribute3()
     */
    @Override
    public String getAttribute3() {
        return attribute3;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setAttribute3(java.lang.String)
     */
    @Override
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getAttribute4()
     */
    @Override
    public String getAttribute4() {
        return attribute4;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setAttribute4(java.lang.String)
     */
    @Override
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#getAttribute5()
     */
    @Override
    public String getAttribute5() {
        return attribute5;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#setAttribute5(java.lang.String)
     */
    @Override
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IEntity#toJSONString()
     */
    @Override
    public String toJSONString() {
        return JSON.toJSONString(this);
    }

}
