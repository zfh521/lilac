package com.snail.lilac.batch;

import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Andy
 */
public class CSVJobTest extends AbstractBatchTests {

    @Autowired
    private Job csvJob;

    @Test
    public void testCsvJob() throws Exception {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString("inputFilePath", "in/data.csv");
        jobParametersBuilder.addString("outFilePath", "out/data.csv");

        jobLauncher.run(csvJob, jobParametersBuilder.toJobParameters());
    }
}
