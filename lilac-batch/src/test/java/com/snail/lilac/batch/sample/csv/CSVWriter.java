package com.snail.lilac.batch.sample.csv;

import java.util.List;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.support.RetryTemplate;

/**
 * @author Andy
 */
public class CSVWriter extends FlatFileItemWriter<CSVData> {

    private static final Logger log = LoggerFactory.getLogger(CSVWriter.class);

    @Autowired
    private RetryTemplate       retryTimeOutTemplate;

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.item.file.FlatFileItemWriter#write(java.util.List)
     */
    @Override
    public void write(List<? extends CSVData> items) throws Exception {

        log.info("write items:" + items);

        for (CSVData csvData : items) {
            final CSVData curCsvData = csvData;
            retryTimeOutTemplate.execute(new RetryCallback<CSVData>() {

                @Override
                public CSVData doWithRetry(RetryContext context) throws Exception {
                    log.info("doWithRetry item:{}", curCsvData);
                    return curCsvData;
                }
            });
        }
        super.write(items);
    }

}
