package com.lilac.core.sys.entity;

import java.io.Serializable;

import org.hibernate.envers.EntityTrackingRevisionListener;
import org.hibernate.envers.RevisionType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lilac.core.SpringContextHolder;
import com.lilac.core.security.shiro.UserHolder;
import com.lilac.core.sys.service.ObjectTypeService;
import com.lilac.core.util.DateUtils;

/**
 * @author andy
 * @since 2013-5-15
 */
public class CustomRevisionListener implements EntityTrackingRevisionListener {

    private static final Logger log = LoggerFactory.getLogger(CustomRevisionListener.class);

    /*
     * (non-Javadoc)
     * @see org.hibernate.envers.RevisionListener#newRevision(java.lang.Object)
     */
    @Override
    public void newRevision(Object revisionEntity) {
        TransactionLog transactionLog = (TransactionLog) revisionEntity;
        transactionLog.setCreatedUser(UserHolder.getCurrentLoginUser());
    }

    /*
     * (non-Javadoc)
     * @see org.hibernate.envers.EntityTrackingRevisionListener#entityChanged(java.lang.Class, java.lang.String,
     * java.io.Serializable, org.hibernate.envers.RevisionType, java.lang.Object)
     */
    @Override
    public void entityChanged(Class entityClass, String entityName, Serializable entityId, RevisionType revisionType,
                              Object revisionEntity) {
        TransactionLog transactionLog = (TransactionLog) revisionEntity;
        transactionLog.setInstanceId(String.valueOf(entityId));
        transactionLog.setRevisionType(revisionType.name());
        transactionLog.setTransEndTime(DateUtils.getCurrentDate());
        ObjectTypeService objectTypeService = SpringContextHolder.getBean("objectTypeService", ObjectTypeService.class);
        ObjectType objectType = objectTypeService.findByClassName(entityName);
        transactionLog.setObjectType(objectType);
    }

}
