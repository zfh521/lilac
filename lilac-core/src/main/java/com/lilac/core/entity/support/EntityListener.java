package com.lilac.core.entity.support;

import java.io.Serializable;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import com.lilac.core.entity.IEntity;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.shiro.UserHolder;
import com.lilac.core.util.DateUtils;

/**
 * @author andy
 * @since 2013-5-12
 */

public class EntityListener {

    @PrePersist
    public <T extends Serializable> void prePersist(IEntity<T> entity) {
        UserInfo createdUser = UserHolder.getCurrentLoginUser();
        entity.setCreatedUser(createdUser);
        entity.setCreatedTime(DateUtils.getCurrentDate());
        entity.setEntityStatus(EntityStatus.ENABLED);
        entity.setActiveVersion(new Integer(1));
        entity.setCurrentVersion(new Integer(1));
    }

    @PostPersist
    public <T extends Serializable> void postPersist(IEntity<T> entity) {
    }

    @PreUpdate
    public <T extends Serializable> void preUpdate(IEntity<T> entity) {
        UserInfo lastUpdateUser = UserHolder.getCurrentLoginUser();
        entity.setLastUpdateUser(lastUpdateUser);
        entity.setLastUpdateTime(DateUtils.getCurrentDate());
        entity.setActiveVersion(entity.getActiveVersion() + 1);
        entity.setCurrentVersion(entity.getCurrentVersion() + 1);
    }

    @PostUpdate
    public <T extends Serializable> void postUpdate(IEntity<T> entity) {
    }

    @PreRemove
    public <T extends Serializable> void preRemove(IEntity<T> entity) {
    }

    @PostRemove
    public <T extends Serializable> void postRemove(IEntity<T> entity) {
    }

}
