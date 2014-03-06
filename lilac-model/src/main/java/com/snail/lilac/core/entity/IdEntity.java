package com.snail.lilac.core.entity;

import java.io.Serializable;

/**
 * @author andy
 * @since 2013-5-2
 */
public interface IdEntity<T> extends Serializable {

    /**
     * @return the instanceRrn
     */
    public T getInstanceRrn();

    /**
     * @param instanceRrn the instanceRrn to set
     */
    public void setInstanceRrn(T instanceRrn);

}
