package com.snail.lilac.core.util;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * @author Andy
 * @since 2013-5-3
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    public final static String DEFAULT_DATE_PATTERN      = "yyyy-MM-dd";
    public final static String DEFAULT_TIME_PATTERN      = "HH:mm:ss";
    public final static String DEFAULT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * @return current time
     */
    public static String getCurrentDateTime() {
        return format(new Date());
    }

    /**
     * @return current time
     */
    public static Date getCurrentDate() {
        return new Date();
    }

    public static String format(Date date, String... pattern) {
        String formatDate = null;
        if (pattern != null && pattern.length > 0) {
            formatDate = DateFormatUtils.format(date, pattern[0]);
        } else {
            formatDate = DateFormatUtils.format(date, DEFAULT_DATE_TIME_PATTERN);
        }
        return formatDate;
    }
}
