package com.snail.lilac.test.core;

import org.junit.AfterClass;
import org.junit.Before;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * Spring profile:test development production
 * 
 * @author Andy
 * @since 2013-4-22
 */
public abstract class AbstractUtilTests {

    protected Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Before
    public void init() {
    }

    @AfterClass
    public static void destory() {
    }

}
