package com.snail.lilac.repository;

import java.io.Serializable;

/**
 * @author Andy
 */
public interface CrudRepository<T, ID extends Serializable> extends Repository {

    int insert(T record);

    <S extends T> Iterable<S> insertBatch(Iterable<S> records);

    int updateById(T record);

    int deleteById(ID id);

    void deleteInBatch(Iterable<T> records);

    T findOne(ID id);

    boolean exists(ID id);

    Iterable<T> findAll();

    Iterable<T> findAll(Iterable<ID> ids);

    long count();

}
