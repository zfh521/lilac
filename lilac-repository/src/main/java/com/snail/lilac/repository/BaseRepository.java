package com.snail.lilac.repository;

import java.io.Serializable;

/**
 * @author Andy
 * @since 2013-5-9
 */
public interface BaseRepository<T, ID extends Serializable> extends PagingRepository<T, ID> {

}
