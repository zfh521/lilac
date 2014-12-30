package com.snail.lilac.model;

import java.io.Serializable;

/**
 * @author Andy
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
