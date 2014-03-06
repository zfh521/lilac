package com.snail.lilac.core.repository.sys;

import com.snail.lilac.core.entity.sys.ObjectType;
import com.snail.lilac.core.repository.BaseRepository;

/**
 * @author andy
 * @since 2013-5-13
 */
public interface ObjectTypeRepository extends BaseRepository<ObjectType, String> {

    public ObjectType findByClassName(String className);
}
