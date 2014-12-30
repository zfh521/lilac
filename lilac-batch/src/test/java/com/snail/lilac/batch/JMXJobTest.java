package com.snail.lilac.batch;

import org.junit.Test;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Andy
 */
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-jmx.xml" })
public class JMXJobTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void testJmxJob() throws Exception {
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }

}
