package com.snail.lilac.model.support;

import com.snail.lilac.model.IdModel;

/**
 * @author Andy
 * @since 2013-5-11
 */
@SuppressWarnings("serial")
public abstract class GeneratedIdEntity implements IdModel<Long> {

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
