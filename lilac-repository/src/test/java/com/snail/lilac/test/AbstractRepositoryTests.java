package com.snail.lilac.test;

import org.junit.AfterClass;
import org.junit.Before;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.security.UserInfo;

/**
 * Spring profile:test development production
 * 
 * @author Andy
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
