package com.snail.lilac.core;

import org.junit.AfterClass;
import org.junit.Before;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.snail.lilac.core.entity.security.UserInfo;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

/**
 * Spring profile:test development production
 * 
 * @author andy
 * @since 2013-4-22
 */
@ActiveProfiles("development")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-repository.xml" })
public abstract class AbstractRepositoryTests extends AbstractJUnit4SpringContextTests {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());
    private UserInfo       currentUser;

    @Before
    public void init() {
        currentUser = new UserInfo();
        currentUser.setInstanceRrn("ADMIN");
    }

    @AfterClass
    public static void destory() {
    }

    /**
     * @return the currentUser
     */
    public UserInfo getCurrentUser() {
        return currentUser;
    }

}
