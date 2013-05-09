/*
 * Copyright 2013 Jimmy Leung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lilac.core.util;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * @author Jimmy Leung
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
