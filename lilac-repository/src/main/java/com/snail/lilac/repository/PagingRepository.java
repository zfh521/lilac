package com.snail.lilac.repository;

import java.io.Serializable;

/**
 * @author Andy
 */
public interface PagingRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
