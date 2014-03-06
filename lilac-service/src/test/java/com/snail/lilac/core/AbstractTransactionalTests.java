package com.snail.lilac.core;

import org.junit.AfterClass;
import org.junit.Before;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.snail.lilac.core.entity.security.UserInfo;

/**
 * Spring profile:test development production
 * 
 * @author andy
 * @since 2013-4-22
 */
@ActiveProfiles("development")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-repository.xml",
                                   "/spring/applicationContext-service.xml" })
public abstract class AbstractTransactionalTests extends AbstractJUnit4SpringContextTests {

    protected UserInfo currentUser;

    @Before
    public void init() {
        currentUser = new UserInfo();
        currentUser.setInstanceRrn("ADMIN");
    }

    @AfterClass
    public static void destory() {
    }

}
