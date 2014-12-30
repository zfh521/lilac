package com.snail.lilac.batch;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author Andy
 */
@ActiveProfiles("test")
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-batch.xml" })
public class AbstractBatchTests extends AbstractJUnit4SpringContextTests {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected JobLauncher  jobLauncher;

}
