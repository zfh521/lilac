package com.snail.lilac.core;

import org.junit.AfterClass;
import org.junit.Before;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

/**
 * Spring profile:test development production
 * 
 * @author andy
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
