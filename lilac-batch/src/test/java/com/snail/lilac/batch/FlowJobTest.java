package com.snail.lilac.batch;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Andy
 */
public class FlowJobTest extends AbstractBatchTests {

    @Autowired
    private Job flowJob;

    @Test
    public void testFlowJob() throws Exception {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("key", "parameter");
        jobLauncher.run(flowJob, jobParametersBuilder.toJobParameters());
    }

}
