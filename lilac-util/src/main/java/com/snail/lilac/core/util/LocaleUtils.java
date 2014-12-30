package com.snail.lilac.core.util;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Andy
 * @since 2013-5-23
 */
public final class LocaleUtils {

    private final static ConcurrentHashMap<Locale, String> cache = new ConcurrentHashMap<Locale, String>(32);

    /**
     * @param locale
     * @return
     */
    public static String resolveLanguage(Locale locale) {

        String language = cache.get(locale);
        if (language == null) {
            language = locale.getCountry() + "_" + locale.getLanguage();
            cache.put(locale, language);
        }
        return language;
    }
}
