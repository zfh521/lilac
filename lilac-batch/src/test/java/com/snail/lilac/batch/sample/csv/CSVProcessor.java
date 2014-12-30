package com.snail.lilac.batch.sample.csv;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.item.adapter.ItemProcessorAdapter;
import org.springframework.stereotype.Component;

/**
 * @author Andy
 */
@Component("csvProcessor")
public class CSVProcessor extends ItemProcessorAdapter<CSVData, CSVData> {

    private static final Logger log    = LoggerFactory.getLogger(CSVProcessor.class);

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.item.adapter.ItemProcessorAdapter#process(java.lang.Object)
     */
    @Override
    public CSVData process(CSVData item) throws Exception {
        log.info("process item:" + item);
        return super.process(item);
    }

}
