package com.lilac.core.sys.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilac.core.service.AbstractService;
import com.lilac.core.sys.entity.ObjectType;
import com.lilac.core.sys.repository.ObjectTypeRepository;

/**
 * @author andy
 * @since 2013-5-16
 */
@Service
@Transactional
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {

    public Page<ObjectType> findAll(Specification<ObjectType> spec, Pageable pageable) {
        return repository.findAll(spec, pageable);
    }

    /**
     * @param className
     * @return
     */
    public ObjectType findByClassName(String className) {
        return repository.findByClassName(className);
    }

}
