/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.sys.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilac.core.service.AbstractService;
import com.lilac.core.sys.entity.ObjectType;
import com.lilac.core.sys.repository.ObjectTypeRepository;

/**
 * @author Jimmy Leung
 * @since 2013-5-16
 */
@Service
@Transactional
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {

    /**
     * @param className
     * @return
     */
    public ObjectType findByClassName(String className) {
        return repository.findByClassName(className);
    }

}
