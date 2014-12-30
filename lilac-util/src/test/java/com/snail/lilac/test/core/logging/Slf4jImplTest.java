package com.snail.lilac.test.core.logging;

import org.junit.Test;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.test.core.AbstractUtilTests;

/**
 * @author Andy
 */
public class Slf4jImplTest extends AbstractUtilTests {

    private static final Logger log = LoggerFactory.getLogger(Slf4jImplTest.class);

    @Test
    public void testLogging() {
        log.info("the method name is {}", "testIsDebugEnabled");
        log.info("Whart is marker ?");
    }

}
