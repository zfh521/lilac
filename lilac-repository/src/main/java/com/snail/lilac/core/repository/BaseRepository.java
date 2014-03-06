package com.snail.lilac.core.repository;

import java.io.Serializable;

/**
 * @author andy
 * @since 2013-5-9
 */
public interface BaseRepository<T, ID extends Serializable> extends PagingRepository<T, ID> {

}
