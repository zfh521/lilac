package com.snail.lilac.batch.sample;

import java.util.Random;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

/**
 * @author Andy
 */
public class RandomDecider implements JobExecutionDecider {

    private Random random = new Random();

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.core.job.flow.JobExecutionDecider#decide(org.springframework.batch.core.JobExecution,
     * org.springframework.batch.core.StepExecution)
     */
    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
        if (random.nextBoolean()) {
            return FlowExecutionStatus.COMPLETED;
        }
        return FlowExecutionStatus.FAILED;
    }

}
