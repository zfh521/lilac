package com.snail.lilac.test.core.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Assert;
import org.junit.Test;

import com.snail.lilac.model.security.Organization;
import com.snail.lilac.model.sys.ObjectType;
import com.snail.lilac.test.AbstractRepositoryTests;

public class EntityManagerTest extends AbstractRepositoryTests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void testEntityManager() {
        Query query = em.createNativeQuery("SELECT 1 FROM DUAL");
        int result = Integer.parseInt(String.valueOf(query.getSingleResult()));
        log.debug("query result:" + result);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testCriteriaQuery() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ObjectType> criteriaQuery = cb.createQuery(ObjectType.class);
        Root<ObjectType> root = criteriaQuery.from(ObjectType.class);
        Predicate predicate = cb.equal(root.get("objectTypeId"), "objectTypeId");
        Predicate predicate1 = cb.equal(root.get("createdUser"), "ADMIN");
        Predicate[] predicates = new Predicate[] { predicate, predicate1 };
        criteriaQuery.select(root).where(predicates);

        TypedQuery<ObjectType> typeQuery = em.createQuery(criteriaQuery);
        List<ObjectType> objectTypes = typeQuery.getResultList();
        log.info(objectTypes.toString());

    }

    @Test
    public void testCriteriaByParameter() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Organization> cq = cb.createQuery(Organization.class);
        Root<Organization> orgRoot = cq.from(Organization.class);
        cq.select(orgRoot);

        List<Predicate> criteria = new ArrayList<Predicate>();
        Expression<String> expressionOrgId = cb.parameter(String.class, "organizationId");
        Predicate predicateOrgId = cb.equal(orgRoot.get("organizationId"), expressionOrgId);
        criteria.add(predicateOrgId);

        Expression<String> expressionOrgName = cb.parameter(String.class, "organizationName");
        Expression<String> pathOrgName = orgRoot.get("organizationName");
        Predicate predicateOrgName = cb.like(pathOrgName, expressionOrgName);
        criteria.add(predicateOrgName);

        if (criteria.isEmpty()) {
            criteria.add(cb.disjunction());
        }

        if (criteria.size() == 1) {
            cq.where(criteria.get(0));
        } else {
            cq.where(criteria.toArray(new Predicate[0]));
        }

        TypedQuery<Organization> typedQuery = em.createQuery(cq);
        typedQuery.setParameter("organizationId", "id");
        typedQuery.setParameter("organizationName", "name%");
        log.debug(typedQuery.getResultList().toString());
    }

    @Test
    public void testCriteriaByValue() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Organization> cq = cb.createQuery(Organization.class);
        Root<Organization> orgRoot = cq.from(Organization.class);
        cq.select(orgRoot);

        List<Predicate> criteria = new ArrayList<Predicate>();
        criteria.add(cb.equal(orgRoot.get("organizationName"), "organizationName"));
        Expression<Integer> currentVersionExpression = orgRoot.get("currentVersion");
        criteria.add(cb.lessThan(currentVersionExpression, 1));

        if (criteria.isEmpty()) {
            criteria.add(cb.disjunction());
        }

        if (criteria.size() == 1) {
            cq.where(criteria.get(0));
        } else {
            cq.where(criteria.toArray(new Predicate[0]));
        }

        TypedQuery<Organization> typedQuery = em.createQuery(cq);
        log.debug(typedQuery.getResultList().toString());
    }
}
