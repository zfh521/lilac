package com.lilac.core;

import javax.sql.DataSource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.AfterClass;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Spring profile:test development production
 * 
 * @author andy
 * @since 2013-4-22
 */
@ActiveProfiles("test")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-*.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public abstract class AbstractTransactionalTests extends AbstractTransactionalJUnit4SpringContextTests {

    protected final Logger   log = LoggerFactory.getLogger(this.getClass());

    protected DataSource     dataSource;
    protected static Subject subject;

    @Before
    public void init() {
        subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("ADMIN", "ADMIN");
        subject.login(token);
    }

    @AfterClass
    public static void destory() {
        subject.logout();
    }

    @Override
    @Autowired
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
        this.dataSource = dataSource;
    }

}
