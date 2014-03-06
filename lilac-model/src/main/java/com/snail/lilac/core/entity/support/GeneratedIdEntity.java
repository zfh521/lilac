package com.snail.lilac.core.entity.support;

import com.snail.lilac.core.entity.IdEntity;

/**
 * @author andy
 * @since 2013-5-11
 */
@SuppressWarnings("serial")
public abstract class GeneratedIdEntity implements IdEntity<Long> {

    protected Long instanceRrn;

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IdEntity#getInstanceRrn()
     */
    @Override
    public Long getInstanceRrn() {
        return this.instanceRrn;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.entity.IdEntity#setInstanceRrn(java.lang.Object)
     */
    @Override
    public void setInstanceRrn(Long instanceRrn) {
        this.instanceRrn = instanceRrn;
    }

}
