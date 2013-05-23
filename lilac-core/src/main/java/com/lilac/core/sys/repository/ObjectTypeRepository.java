/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.sys.repository;

import com.lilac.core.repository.BaseRepository;
import com.lilac.core.sys.entity.ObjectType;

/**
 * @author Jimmy Leung
 * @since 2013-5-13
 */
public interface ObjectTypeRepository extends BaseRepository<ObjectType, String> {

    public ObjectType findByClassName(String className);
}
