package com.snail.lilac.batch.sample.csv;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

/**
 * @author andy
 */
public class CSVDataBuilder {

    private static final Logger log = LoggerFactory.getLogger(CSVDataBuilder.class);

    public CSVData doProcess(CSVData item) {
        log.info("doProcess item:" + item);
        return item;
    }

}
