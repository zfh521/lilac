package com.snail.lilac.batch.sample.jmx;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobInstanceAlreadyExistsException;
import org.springframework.batch.core.launch.NoSuchJobException;

/**
 * @author Andy
 */
public interface JmxJobRunner {

    public abstract void runJob(String jobName, String parameters) throws NoSuchJobException,
                                                                  JobInstanceAlreadyExistsException,
                                                                  JobParametersInvalidException;

}
