package com.snail.lilac.model.sys;

import java.util.Date;

import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.model.support.GeneratedIdEntity;

/**
 * @author Andy
 * @since 2013-5-10
 */
public class TransactionLog extends GeneratedIdEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1514562218494873186L;
    private ObjectType        objectType;
    private String            instanceId;
    private String            revisionType;
    private Date              transStartTime;

    private Date              transEndTime;
    private UserInfo          createdUser;

    /**
     * @return the instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * @param instanceId the instanceId to set
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * @return the revisionType
     */
    public String getRevisionType() {
        return revisionType;
    }

    /**
     * @param revisionType the revisionType to set
     */
    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    /**
     * @return the objectType
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * @param objectType the objectType to set
     */
    public void setObjectType(ObjectType objectType) {
        this.objectType = objectType;
    }

    /**
     * @return the transStartTime
     */
    public Date getTransStartTime() {
        return transStartTime;
    }

    /**
     * @param transStartTime the transStartTime to set
     */
    public void setTransStartTime(Date transStartTime) {
        this.transStartTime = transStartTime;
    }

    /**
     * @return the transEndTime
     */
    public Date getTransEndTime() {
        return transEndTime;
    }

    /**
     * @param transEndTime the transEndTime to set
     */
    public void setTransEndTime(Date transEndTime) {
        this.transEndTime = transEndTime;
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

}
