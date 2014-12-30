package com.snail.lilac.test.core.repository.jpa.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaEntityInformationSupport;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.IEntity;
import com.snail.lilac.model.support.EntityStatus;
import com.snail.lilac.repository.BaseRepository;

/**
 * @author Andy
 * @since 2013-5-10
 */
@Transactional(readOnly = true)
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements BaseRepository<T, ID> {

    protected final Logger      log = LoggerFactory.getLogger(getClass());

    @SuppressWarnings("unused")
    private final EntityManager em;

    /**
     * @param domainClass
     * @param em
     */
    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em){
        this(JpaEntityInformationSupport.getMetadata(domainClass, em), em);
    }

    public BaseRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager){

        super(entityInformation, entityManager);
        this.em = entityManager;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.data.jpa.repository.support.SimpleJpaRepository#save(java.lang.Object)
     */
    @Override
    @Transactional
    public <S extends T> S save(S entity) {
        return super.save(entity);
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.data.jpa.repository.support.SimpleJpaRepository#delete(java.lang.Object)
     */
    @Override
    @Transactional
    public void delete(T entity) {
        if (entity instanceof IEntity<?>) {
            ((IEntity<?>) entity).setEntityStatus(EntityStatus.DELETED);
            this.save(entity);
        } else {
            super.delete(entity);
        }
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.repository.CrudRepository#insert(java.lang.Object)
     */
    @Override
    public int insert(T record) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.repository.CrudRepository#insertBatch(java.lang.Iterable)
     */
    @Override
    public <S extends T> Iterable<S> insertBatch(Iterable<S> records) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.repository.CrudRepository#updateById(java.lang.Object)
     */
    @Override
    public int updateById(T record) {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.repository.CrudRepository#deleteById(java.io.Serializable)
     */
    @Override
    public int deleteById(ID id) {
        // TODO Auto-generated method stub
        return 0;
    }

}
