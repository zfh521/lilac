/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.repository.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.lilac.core.entity.IEntity;
import com.lilac.core.entity.support.EntityStatus;
import com.lilac.core.repository.BaseRepository;

/**
 * @author Jimmy Leung
 * @since 2013-5-10
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    protected final Logger      log = LoggerFactory.getLogger(getClass());

    private final EntityManager em;

    /**
     * @param domainClass
     * @param em
     */
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em){
        this(JpaEntityInformationSupport.getMetadata(domainClass, em), em);
    }

    public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager){

        super(entityInformation, entityManager);
        this.em = entityManager;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.data.jpa.repository.support.SimpleJpaRepository#save(java.lang.Object)
     */
    @Override
    public <S extends T> S save(S entity) {
        return super.save(entity);
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.data.jpa.repository.support.SimpleJpaRepository#delete(java.lang.Object)
     */
    @Override
    public void delete(T entity) {
        if (entity instanceof IEntity<?>) {
            ((IEntity<?>) entity).setEntityStatus(EntityStatus.DELETED);
            this.save(entity);
        } else {
            super.delete(entity);
        }
    }

}
