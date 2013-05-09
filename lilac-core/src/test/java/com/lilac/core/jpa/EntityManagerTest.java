/*
 * Copyright 2013 Jimmy Leung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lilac.core.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
