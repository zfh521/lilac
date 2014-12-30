package com.snail.lilac.batch.sample.csv;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;

/**
 * @author Andy
 */
@Component("csvJobListener")
public class CSVJobListener extends JobExecutionListenerSupport {

    private static final Logger log = LoggerFactory.getLogger(CSVJobListener.class);

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.core.listener.JobExecutionListenerSupport#afterJob(org.springframework.batch.core.
     * JobExecution)
     */
    @Override
    public void afterJob(JobExecution jobExecution) {
        log.info("afterJob {}", jobExecution.toString());
    }

    /*
     * (non-Javadoc)
     * @see
     * org.springframework.batch.core.listener.JobExecutionListenerSupport#beforeJob(org.springframework.batch.core.
     * JobExecution)
     */
    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("beforeJob {}", jobExecution.toString());
    }

}
