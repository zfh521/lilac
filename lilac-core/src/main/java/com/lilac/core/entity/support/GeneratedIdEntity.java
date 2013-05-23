/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.entity.support;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.lilac.core.entity.IdEntity;

/**
 * @author Jimmy Leung
 * @since 2013-5-11
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class GeneratedIdEntity implements IdEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IdEntity#getId()
     */
    @Override
    public Long getId() {
        return this.id;
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.entity.IdEntity#setId(java.lang.Object)
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
