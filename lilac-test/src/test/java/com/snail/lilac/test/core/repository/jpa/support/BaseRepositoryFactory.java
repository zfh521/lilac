package com.snail.lilac.test.core.repository.jpa.support;

import static org.springframework.data.querydsl.QueryDslUtils.QUERY_DSL_PRESENT;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.LockModeRepositoryPostProcessor;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.core.RepositoryMetadata;

/**
 * @author Andy
 * @since 2013-5-10
 */
public class BaseRepositoryFactory<T, ID extends Serializable> extends JpaRepositoryFactory {

    private EntityManager                         entityManager;
    private final LockModeRepositoryPostProcessor lockModePostProcessor;

    /**
     * @param entityManager
     */
    public BaseRepositoryFactory(EntityManager entityManager){
        super(entityManager);
        this.entityManager = entityManager;
        this.lockModePostProcessor = LockModeRepositoryPostProcessor.INSTANCE;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.data.jpa.repository.support.JpaRepositoryFactory#getTargetRepository(org.springframework.
     * data.repository.core.RepositoryMetadata)
     */
    @SuppressWarnings("unchecked")
    @Override
    protected Object getTargetRepository(RepositoryMetadata metadata) {
        return new BaseRepositoryImpl<T, ID>((Class<T>) metadata.getDomainType(), entityManager);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.data.jpa.repository.support.JpaRepositoryFactory#getTargetRepository(org.springframework.
     * data.repository.core.RepositoryMetadata, javax.persistence.EntityManager)
     */
    @Override
    @SuppressWarnings({ "unchecked", "rawtypes", "hiding" })
    protected <T, ID extends Serializable> JpaRepository<?, ?> getTargetRepository(RepositoryMetadata metadata,
                                                                                   EntityManager entityManager) {

        Class<?> repositoryInterface = metadata.getRepositoryInterface();
        JpaEntityInformation<?, Serializable> entityInformation = getEntityInformation(metadata.getDomainType());
        SimpleJpaRepository<?, ?> repo = null;
        if (isQueryDslExecutor(repositoryInterface)) {
            repo = new QueryDslJpaRepository(entityInformation, entityManager);
        } else {
            repo = new BaseRepositoryImpl(entityInformation, entityManager);
        }
        repo.setLockMetadataProvider(lockModePostProcessor.getLockMetadataProvider());
        return repo;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.data.jpa.repository.support.JpaRepositoryFactory#getRepositoryBaseClass(org.springframework
     * .data.repository.core.RepositoryMetadata)
     */
    @Override
    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
        if (isQueryDslExecutor(metadata.getRepositoryInterface())) {
            return QueryDslJpaRepository.class;
        } else {
            return BaseRepositoryImpl.class;
        }
    }

    /**
     * Returns whether the given repository interface requires a QueryDsl specific implementation to be chosen.
     * 
     * @param repositoryInterface
     * @return
     */
    private boolean isQueryDslExecutor(Class<?> repositoryInterface) {

        return QUERY_DSL_PRESENT && QueryDslPredicateExecutor.class.isAssignableFrom(repositoryInterface);
    }

}
