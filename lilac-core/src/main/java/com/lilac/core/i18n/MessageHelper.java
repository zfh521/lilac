/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.i18n;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;

/**
 * @author Jimmy Leung
 * @since 2013-5-7
 */
public final class MessageHelper {

    private static MessageSourceAccessor messageSourceAccessor;

    private MessageHelper(){
    }

    /**
     * @param messageSourceAccessor the messageSourceAccessor to set
     */
    public static void setMessageSourceAccessor(MessageSourceAccessor messageSourceAccessor) {
        MessageHelper.messageSourceAccessor = messageSourceAccessor;
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @param defaultMessage String to return if the lookup fails
     * @return the message
     */
    public static String getMessage(String code, String defaultMessage) {
        return messageSourceAccessor.getMessage(code, defaultMessage);
    }

    /**
     * Retrieve the message for the given code and the given Locale.
     * 
     * @param code code of the message
     * @param defaultMessage String to return if the lookup fails
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public static String getMessage(String code, String defaultMessage, Locale locale) {
        return messageSourceAccessor.getMessage(code, defaultMessage, locale);
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @param defaultMessage String to return if the lookup fails
     * @return the message
     */
    public static String getMessage(String code, Object[] args, String defaultMessage) {
        return messageSourceAccessor.getMessage(code, args, defaultMessage);
    }

    /**
     * Retrieve the message for the given code and the given Locale.
     * 
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @param defaultMessage String to return if the lookup fails
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public static String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSourceAccessor.getMessage(code, args, defaultMessage, locale);
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @return the message
     */
    public static String getMessage(String code) {
        return messageSourceAccessor.getMessage(code);
    }

    /**
     * Retrieve the message for the given code and the given Locale.
     * 
     * @param code code of the message
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public static String getMessage(String code, Locale locale) {
        return messageSourceAccessor.getMessage(code, locale);
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @return the message
     */
    public static String getMessage(String code, Object[] args) {
        return messageSourceAccessor.getMessage(code, args);
    }

    /**
     * Retrieve the message for the given code and the given Locale.
     * 
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public static String getMessage(String code, Object[] args, Locale locale) {
        return messageSourceAccessor.getMessage(code, args, locale);
    }

}
