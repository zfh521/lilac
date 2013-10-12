package com.lilac.core.entity.support;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import com.lilac.core.entity.IdEntity;

/**
 * @author andy
 * @since 2013-5-3
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class UUIDEntity implements IdEntity<String> {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Column(length = 32, nullable = false)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    protected String id;

    /**
     * @return the id
     */
    @Override
    public String getId() {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        return this.id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(String id) {
        if (StringUtils.isEmpty(id)) {
            this.id = null;
        } else {
            this.id = id;
        }
    }

}
