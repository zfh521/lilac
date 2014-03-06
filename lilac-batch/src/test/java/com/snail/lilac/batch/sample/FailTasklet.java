package com.snail.lilac.batch.sample;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

/**
 * @author andy
 */
@Component("failTasklet")
public class FailTasklet implements Tasklet {

    protected static final Logger log = LoggerFactory.getLogger(FailTasklet.class);

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.springframework.batch.core.StepContribution,
     * org.springframework.batch.core.scope.context.ChunkContext)
     */
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        log.info("fail tasklet is finished");
        return RepeatStatus.FINISHED;
    }

}
