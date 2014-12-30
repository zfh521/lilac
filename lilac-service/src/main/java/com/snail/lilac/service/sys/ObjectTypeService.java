package com.snail.lilac.service.sys;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.model.sys.ObjectType;
import com.snail.lilac.repository.sys.ObjectTypeRepository;
import com.snail.lilac.service.AbstractService;

/**
 * @author Andy
 * @since 2013-5-16
 */
@Service
@Transactional
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {
}
