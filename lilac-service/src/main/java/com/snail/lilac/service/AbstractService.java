package com.snail.lilac.service;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.IdModel;
import com.snail.lilac.repository.BaseRepository;
import com.snail.lilac.service.id.UUIDHexGenerator;

/**
 * @author Andy
 * @since 2013-5-16
 */
@Transactional
public abstract class AbstractService<R extends BaseRepository<T, ID>, T extends IdModel<ID>, ID extends Serializable> implements Service<T, ID> {

    protected Logger         log = LoggerFactory.getLogger(getClass());

    private UUIDHexGenerator uuidHexGenerator;

    /**
     * @return the uuidHexGenerator
     */
    public UUIDHexGenerator getUuidHexGenerator() {
        return uuidHexGenerator;
    }

    /**
     * @param uuidHexGenerator the uuidHexGenerator to set
     */
    public void setUuidHexGenerator(UUIDHexGenerator uuidHexGenerator) {
        this.uuidHexGenerator = uuidHexGenerator;
    }

}
