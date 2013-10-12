package com.lilac.core.entity;

import java.io.Serializable;
import java.util.Date;

import com.lilac.core.entity.support.EntityStatus;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.sys.entity.SpaceDefinition;

/**
 * @author andy
 * @since 2013-5-12
 */
public interface IEntity<T extends Serializable> extends IdEntity<T> {

    /**
     * @return the instanceId
     */
    public String getInstanceId();

    /**
     * @param instanceId the instanceId to set
     */
    public void setInstanceId(String instanceId);

    /**
     * @return the spaceDefinition
     */
    public SpaceDefinition getSpaceDefinition();

    /**
     * @param spaceDefinition the spaceDefinition to set
     */
    public void setSpaceDefinition(SpaceDefinition spaceDefinition);

    /**
     * @return the createdTime
     */
    public Date getCreatedTime();

    /**
     * @param createdTime the createdTime to set
     */
    public void setCreatedTime(Date createdTime);

    /**
     * @return the createdUser
     */
    public UserInfo getCreatedUser();

    /**
     * @param createdUser the createdUser to set
     */
    public void setCreatedUser(UserInfo createdUser);

    /**
     * @return the lastUpdateTime
     */
    public Date getLastUpdateTime();

    /**
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(Date lastUpdateTime);

    /**
     * @return the lastUpdateUser
     */
    public UserInfo getLastUpdateUser();

    /**
     * @param lastUpdateUser the lastUpdateUser to set
     */
    public void setLastUpdateUser(UserInfo lastUpdateUser);

    /**
     * @return the currentVersion
     */
    public Integer getCurrentVersion();

    /**
     * @param currentVersion the currentVersion to set
     */
    public void setCurrentVersion(Integer currentVersion);

    /**
     * @return the activeVersion
     */
    public Integer getActiveVersion();

    /**
     * @param activeVersion the activeVersion to set
     */
    public void setActiveVersion(Integer activeVersion);

    /**
     * @return the entityStatus
     */
    public EntityStatus getEntityStatus();

    /**
     * @param entityStatus the entityStatus to set
     */
    public void setEntityStatus(EntityStatus entityStatus);

    /**
     * @return the version
     */
    public Integer getVersion();

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version);

    /**
     * @return the attribute1
     */
    public String getAttribute1();

    /**
     * @param attribute1 the attribute1 to set
     */
    public void setAttribute1(String attribute1);

    /**
     * @return the attribute2
     */
    public String getAttribute2();

    /**
     * @param attribute2 the attribute2 to set
     */
    public void setAttribute2(String attribute2);

    /**
     * @return the attribute3
     */
    public String getAttribute3();

    /**
     * @param attribute3 the attribute3 to set
     */
    public void setAttribute3(String attribute3);

    /**
     * @return the attribute4
     */
    public String getAttribute4();

    /**
     * @param attribute4 the attribute4 to set
     */
    public void setAttribute4(String attribute4);

    /**
     * @return the attribute5
     */
    public String getAttribute5();

    /**
     * @param attribute5 the attribute5 to set
     */
    public void setAttribute5(String attribute5);

    /**
     * @return the json string
     */
    public String toJSONString();

}
