package com.snail.lilac.core.entity.sys;


import com.snail.lilac.core.entity.BaseEntity;

/**
 * @author andy
 * @since 2013-5-7
 */
public class ObjectType extends BaseEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -7754934275159150169L;

    private String            objectTypeId;
    private String            className;
    private String            description;
    private boolean           isDeleteState;
    private boolean           isLog;
    private boolean           isCache;

    /**
     * @return the objectTypeId
     */
    public String getObjectTypeId() {
        return objectTypeId;
    }

    /**
     * @param objectTypeId the objectTypeId to set
     */
    public void setObjectTypeId(String objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the isDeleteState
     */
    public boolean getIsDeleteState() {
        return isDeleteState;
    }

    /**
     * @param isDeleteState the isDeleteState to set
     */
    public void setDeleteState(boolean isDeleteState) {
        this.isDeleteState = isDeleteState;
    }

    /**
     * @return the isLog
     */
    public boolean getIsLog() {
        return isLog;
    }

    /**
     * @param isLog the isLog to set
     */
    public void setLog(boolean isLog) {
        this.isLog = isLog;
    }

    /**
     * @return the isCache
     */
    public boolean getIsCache() {
        return isCache;
    }

    /**
     * @param isCache the isCache to set
     */
    public void setCache(boolean isCache) {
        this.isCache = isCache;
    }

}
