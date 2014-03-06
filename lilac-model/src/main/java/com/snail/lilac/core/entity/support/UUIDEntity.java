package com.snail.lilac.core.entity.support;

import com.snail.lilac.core.entity.IdEntity;
import com.snail.lilac.core.util.StringUtils;

/**
 * @author andy
 * @since 2013-5-3
 */
@SuppressWarnings("serial")
public abstract class UUIDEntity implements IdEntity<String> {

    protected String instanceRrn;

    /**
     * 
     */
    public UUIDEntity(){
        super();
    }

    /**
     * @param instanceRrn
     */
    public UUIDEntity(String instanceRrn){
        super();
        this.instanceRrn = instanceRrn;
    }

    /**
     * @return the instanceRrn
     */
    @Override
    public String getInstanceRrn() {
        if (StringUtils.isEmpty(instanceRrn)) {
            return null;
        }
        return this.instanceRrn;
    }

    /**
     * @param instanceRrn the instanceRrn to set
     */
    @Override
    public void setInstanceRrn(String instanceRrn) {
        if (StringUtils.isEmpty(instanceRrn)) {
            this.instanceRrn = null;
        } else {
            this.instanceRrn = instanceRrn;
        }
    }

}
