/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lilac.core.service.AbstractService;
import com.lilac.core.sys.entity.ObjectType;
import com.lilac.core.sys.repository.ObjectTypeRepository;

/**
 * @author Jimmy Leung
 * @since 2013-5-16
 */
@Service
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {

    /*
     * (non-Javadoc)
     * @see com.lilac.core.security.service.AbstractService#setRepository(com.lilac.core.repository.BaseRepository)
     */
    @Override
    @Autowired
    public void setRepository(ObjectTypeRepository repository) {
        this.repository = repository;
    }

    /**
     * @param className
     * @return
     */
    public ObjectType findByClassName(String className) {
        return repository.findByClassName(className);
    }

}
