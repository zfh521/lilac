package com.snail.lilac.batch.schedule.support;

import java.util.List;
import java.util.Map;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobInstance;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.JobParametersNotFoundException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Andy
 */
public class QuartzJobLauncher extends QuartzJobBean {

    private final Logger        log      = LoggerFactory.getLogger(QuartzJobBean.class);

    private JobLauncher         jobLauncher;
    private JobLocator          jobLocator;
    private JobExplorer         jobExplorer;
    private Map<String, String> jobParameters;
    public static final String  JOB_NAME = "jobName";

    /*
     * (non-Javadoc)
     * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        try {
            Map<String, Object> jobDataMap = context.getMergedJobDataMap();
            String jobName = (String) jobDataMap.get(JOB_NAME);
            Job job = jobLocator.getJob(jobName);
            JobParameters allParams = translateParams(job, jobParameters);
            jobLauncher.run(job, allParams);
        } catch (Exception e) {
            log.error("can not exceute job", e);
        }
    }

    private JobParameters translateParams(Job job, Map<String, String> params) throws Exception {
        JobParametersBuilder builder = new JobParametersBuilder();
        JobParameters incrementedParams = getNextJobParameters(job);

        for (Map.Entry<String, JobParameter> param : incrementedParams.getParameters().entrySet()) {
            builder.addParameter(param.getKey(), param.getValue());
        }

        for (Map.Entry<String, String> param : params.entrySet()) {
            builder.addString(param.getKey(), param.getValue());
        }

        return builder.toJobParameters();
    }

    private JobParameters getNextJobParameters(Job job) throws JobParametersNotFoundException {

        String jobIdentifier = job.getName();
        JobParameters jobParameters = new JobParameters();

        List<JobInstance> lastJobInstances = jobExplorer.getJobInstances(jobIdentifier, 0, 1);
        JobParametersIncrementer incrementer = job.getJobParametersIncrementer();
        if (incrementer == null) {
            log.warn("No job paramters incrementer found for job=" + jobIdentifier);
        }

        if (lastJobInstances.isEmpty()) {
            jobParameters = incrementer.getNext(jobParameters);
            if (jobParameters == null) {
                throw new JobParametersNotFoundException("No bootstrap paramters incrementer found for job="
                                                         + jobIdentifier);
            }
        } else {
            jobParameters = incrementer.getNext(findExecutionById(lastJobInstances.get(0).getId()).getJobParameters());
        }

        return jobParameters;
    }

    private JobExecution findExecutionById(Long executionId) {
        JobExecution jobExecution = jobExplorer.getJobExecution(executionId);
        return jobExecution;
    }

    /**
     * @param jobLauncher the jobLauncher to set
     */
    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }

    /**
     * @param jobLocator the jobLocator to set
     */
    public void setJobLocator(JobLocator jobLocator) {
        this.jobLocator = jobLocator;
    }

    /**
     * @param jobExplorer the jobExplorer to set
     */
    public void setJobExplorer(JobExplorer jobExplorer) {
        this.jobExplorer = jobExplorer;
    }

    /**
     * @param jobParameters the jobParameters to set
     */
    public void setJobParameters(Map<String, String> jobParameters) {
        this.jobParameters = jobParameters;
    }

}
