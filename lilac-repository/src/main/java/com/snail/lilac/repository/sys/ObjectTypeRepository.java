package com.snail.lilac.repository.sys;

import com.snail.lilac.model.sys.ObjectType;
import com.snail.lilac.repository.BaseRepository;

/**
 * @author Andy
 * @since 2013-5-13
 */
public interface ObjectTypeRepository extends BaseRepository<ObjectType, String> {

    public ObjectType findByClassName(String className);
}
