package com.snail.lilac.batch.sample.jmx;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.NoSuchJobException;

/**
 * @author Andy
 */
public class JmxJobRunnerImpl implements JmxJobRunner {

    private JobOperator jobOperator;

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.batch.sample.jmx.JmxJobRunner#runJob(java.lang.String, java.lang.String)
     */
    @Override
    public void runJob(String jobName, String parameters) throws NoSuchJobException, JobInstanceAlreadyExistsException,
                                                         JobParametersInvalidException {
        jobOperator.start(jobName, parameters);
    }

    /**
     * @param jobOperator the jobOperator to set
     */
    public void setJobOperator(JobOperator jobOperator) {
        this.jobOperator = jobOperator;
    }

}
