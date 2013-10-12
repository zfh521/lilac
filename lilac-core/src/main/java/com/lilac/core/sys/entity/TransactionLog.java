package com.lilac.core.sys.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import com.lilac.core.entity.support.GeneratedIdEntity;
import com.lilac.core.security.entity.UserInfo;

/**
 * @author andy
 * @since 2013-5-10
 */
@Entity
@RevisionEntity(CustomRevisionListener.class)
public class TransactionLog extends GeneratedIdEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 1514562218494873186L;
    @ManyToOne
    private ObjectType        objectType;
    private String            instanceId;
    private String            revisionType;
    @Column(insertable = true, updatable = false)
    @RevisionTimestamp
    private Date              transStartTime;

    @Column(insertable = false, updatable = true)
    private Date              transEndTime;

    @ManyToOne
    @JoinColumn(insertable = true, updatable = false)
    private UserInfo          createdUser;

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.support.GeneratedIdEntity#getId()
     */
    @RevisionNumber
    @Override
    public Long getId() {
        return super.getId();
    }

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
