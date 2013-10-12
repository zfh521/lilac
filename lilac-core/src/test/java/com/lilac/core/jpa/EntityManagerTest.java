package com.lilac.core.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;

import com.lilac.core.AbstractTransactionalTests;

public class EntityManagerTest extends AbstractTransactionalTests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void testEntityManager() {
        Query query = em.createNativeQuery("SELECT 1 FROM DUAL");
        int result = Integer.parseInt(String.valueOf(query.getSingleResult()));
        log.debug("query result:" + result);
        Assert.assertEquals(1, result);
    }
}
