/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.lilac.core.entity.IdEntity;
import com.lilac.core.repository.BaseRepository;

/**
 * @author Jimmy Leung
 * @since 2013-5-16
 */
public abstract class AbstractService<R extends BaseRepository<T, ID>, T extends IdEntity<ID>, ID extends Serializable> implements Service<T, ID> {

    protected Class<T> entityClass;

    protected R        repository;

    /**
     * @param repository the repository to set
     */
    @Autowired
    public void setRepository(R repository) {
        this.repository = repository;
    }

    /**
     * 
     */
    @SuppressWarnings("unchecked")
    public AbstractService(){
        Type type = getClass().getGenericSuperclass();
        if (type != null && type instanceof ParameterizedType) {
            entityClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[1];
        }
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.Service#save(java.lang.Object)
     */
    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    /*
     * (non-Javadoc)`
     * @see com.lilac.core.service.Service#delete(java.io.Serializable)
     */
    @Override
    public void delete(ID id) {
        Assert.notNull(id);
        repository.delete(id);
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.Service#findOne(java.io.Serializable)
     */
    @Override
    public T findOne(ID id) {
        return repository.findOne(id);
    }
}
