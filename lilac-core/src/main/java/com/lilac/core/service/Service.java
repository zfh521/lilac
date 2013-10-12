package com.lilac.core.service;

import java.io.Serializable;

/**
 * @author andy
 * @since 2013-5-2
 */
public interface Service<T, ID extends Serializable> {

    T save(T entity);

    void delete(ID id);

    T findOne(ID id);

}
