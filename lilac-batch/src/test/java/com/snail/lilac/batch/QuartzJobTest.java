package com.snail.lilac.batch;

import org.junit.Test;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Andy
 */
@ActiveProfiles("development")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-batch.xml", "/spring/applicationContext-quartz.xml" })
public class QuartzJobTest extends AbstractJUnit4SpringContextTests {

    @Test
    public void testQuartzJob() throws Exception {
        Object lock = new Object();
        synchronized (lock) {
            lock.wait();
        }
    }

}
