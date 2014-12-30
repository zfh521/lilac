package com.snail.lilac.model;

import java.util.Date;

import com.snail.lilac.model.i18n.annotation.I18NMessage;
import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.model.support.EntityStatus;
import com.snail.lilac.model.support.UUIDEntity;
import com.snail.lilac.model.sys.SpaceDefinition;

/**
 * @author Andy
 * @since 2013-4-26
 */

@SuppressWarnings("serial")
public abstract class BaseEntity extends UUIDEntity implements IEntity<String> {

    protected String          instanceId;

    @I18NMessage(code = "LBL_SPACE_DEFINITION")
    protected SpaceDefinition spaceDefinition;

    protected Date            createdTime;
    protected UserInfo        createdUser;
    protected Date            lastUpdatedTime;
    protected UserInfo        lastUpdatedUser;
    protected Integer         currentVersion;
    protected Integer         activeVersion;
    protected Integer         version;
    protected EntityStatus    entityStatus;

    protected String          attribute1;
    protected String          attribute2;
    protected String          attribute3;
    protected String          attribute4;
    protected String          attribute5;

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.s#getInstanceId()
     */
    @Override
    public String getInstanceId() {
        return instanceId;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.s#setInstanceId(java.lang.String)
     */
    @Override
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.s#getSpaceDefinition()
     */
    @Override
    public SpaceDefinition getSpaceDefinition() {
        return spaceDefinition;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.s#setSpaceDefinition(com.snail.lilac.core.entity.sys.SpaceDefinition)
     */
    @Override
    public void setSpaceDefinition(SpaceDefinition spaceDefinition) {
        this.spaceDefinition = spaceDefinition;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getCreatedTime()
     */
    @Override
    public Date getCreatedTime() {
        return createdTime;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setCreatedTime(java.util.Date)
     */
    @Override
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getCreatedUser()
     */
    @Override
    public UserInfo getCreatedUser() {
        return createdUser;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setCreatedUser(com.snail.lilac.core.security.entity.UserInfo)
     */
    @Override
    public void setCreatedUser(UserInfo createdUser) {
        this.createdUser = createdUser;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getLastUpdatedTime()
     */
    @Override
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setLastUpdatedTime(java.util.Date)
     */
    @Override
    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getLastUpdatedUser()
     */
    @Override
    public UserInfo getLastUpdatedUser() {
        return lastUpdatedUser;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setLastUpdatedUser(com.snail.lilac.core.security.entity.UserInfo)
     */
    @Override
    public void setLastUpdatedUser(UserInfo lastUpdatedUser) {
        this.lastUpdatedUser = lastUpdatedUser;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getCurrentVersion()
     */
    @Override
    public Integer getCurrentVersion() {
        return currentVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setCurrentVersion(java.lang.Integer)
     */
    @Override
    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getActiveVersion()
     */
    @Override
    public Integer getActiveVersion() {
        return activeVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setActiveVersion(java.lang.Integer)
     */
    @Override
    public void setActiveVersion(Integer activeVersion) {
        this.activeVersion = activeVersion;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getEntityStatus()
     */
    @Override
    public EntityStatus getEntityStatus() {
        return entityStatus;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setEntityStatus(com.snail.lilac.core.entity.EntityStatus)
     */
    @Override
    public void setEntityStatus(EntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getVersion()
     */
    @Override
    public Integer getVersion() {
        return version;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setVersion(java.lang.Integer)
     */
    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getAttribute1()
     */
    @Override
    public String getAttribute1() {
        return attribute1;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setAttribute1(java.lang.String)
     */
    @Override
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getAttribute2()
     */
    @Override
    public String getAttribute2() {
        return attribute2;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setAttribute2(java.lang.String)
     */
    @Override
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getAttribute3()
     */
    @Override
    public String getAttribute3() {
        return attribute3;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setAttribute3(java.lang.String)
     */
    @Override
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getAttribute4()
     */
    @Override
    public String getAttribute4() {
        return attribute4;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setAttribute4(java.lang.String)
     */
    @Override
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#getAttribute5()
     */
    @Override
    public String getAttribute5() {
        return attribute5;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#setAttribute5(java.lang.String)
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
     * @see com.snail.lilac.core.entity.IEntity#toString()
     */
    @Override
    public String toString() {
        return "";
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IEntity#toJSONString()
     */
    @Override
    public String toJSONString() {
        return "";
    }

}
