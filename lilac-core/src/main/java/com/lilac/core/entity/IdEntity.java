/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.entity;

import java.io.Serializable;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
public interface IdEntity<T> extends Serializable {

    /**
     * @return the id
     */
    public T getId();

    /**
     * @param id the id to set
     */
    public void setId(T id);

}
