package com.snail.lilac.batch.sample;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

/**
 * @author andy
 */
@Component("helloWordTasklet")
public class HelloWordTasklet implements Tasklet {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.springframework.batch.core.StepContribution,
     * org.springframework.batch.core.scope.context.ChunkContext)
     */
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("Job Parameters {}", chunkContext.getStepContext().getJobParameters());
        log.info(contribution.toString() + chunkContext.toString());

        ExecutionContext executionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();
        executionContext.put("Tasklet", "HelloWordTasklet");
        return RepeatStatus.FINISHED;
    }

}
