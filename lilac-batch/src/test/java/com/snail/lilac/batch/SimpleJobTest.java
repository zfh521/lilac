package com.snail.lilac.batch;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.support.CommandLineJobRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

/**
 * @author Andy
 */
public class SimpleJobTest extends AbstractBatchTests {

    @Autowired
    private Job simpleJob;
    @Autowired
    private Job simpleJob2;

    @Test
    public void testCommandLineJobRunner() throws Exception {
        String[] args = new String[] { "spring/applicationContext-batch.xml", "simpleJob" };
        CommandLineJobRunner.main(args);
    }

    @Test
    public void testSimpleJob() throws Exception {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("key", "parameter");
        jobLauncher.run(simpleJob, jobParametersBuilder.toJobParameters());
    }

    @Test
    public void testSimpleJob2() throws Exception {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("key", "parameter");
        jobLauncher.run(simpleJob2, jobParametersBuilder.toJobParameters());
    }
    
}
