package com.snail.lilac.service.i18n;

import java.util.Locale;

import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * @author Andy
 * @since 2013-5-7
 */
@Service
public class I18NService {

    private static final Logger   log = LoggerFactory.getLogger(I18NService.class);

    private MessageSourceAccessor messageSourceAccessor;

    /**
     * @param messageSourceAccessor the messageSourceAccessor to set
     */
    public void setMessageSourceAccessor(MessageSourceAccessor messageSourceAccessor) {
        this.messageSourceAccessor = messageSourceAccessor;
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @param defaultMessage String to return if the lookup fails
     * @return the message
     */
    public String getMessage(String code, String defaultMessage) {
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
    public String getMessage(String code, String defaultMessage, Locale locale) {
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
    public String getMessage(String code, Object[] args, String defaultMessage) {
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
    public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
        return messageSourceAccessor.getMessage(code, args, defaultMessage, locale);
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @return the message
     */
    public String getMessage(String code) {
        return messageSourceAccessor.getMessage(code);
    }

    /**
     * Retrieve the message for the given code and the given Locale.
     * 
     * @param code code of the message
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public String getMessage(String code, Locale locale) {
        return messageSourceAccessor.getMessage(code, locale);
    }

    /**
     * Retrieve the message for the given code and the default Locale.
     * 
     * @param code code of the message
     * @param args arguments for the message, or <code>null</code> if none
     * @return the message
     */
    public String getMessage(String code, Object[] args) {
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
    public String getMessage(String code, Object[] args, Locale locale) {
        return messageSourceAccessor.getMessage(code, args, locale);
    }

    /**
     * Retrieve the given MessageSourceResolvable (e.g. an ObjectError instance) in the default Locale.
     * 
     * @param resolvable the MessageSourceResolvable
     * @return the message
     */
    public String getMessage(MessageSourceResolvable resolvable) {
        return messageSourceAccessor.getMessage(resolvable, LocaleContextHolder.getLocale());
    }

    /**
     * Retrieve the given MessageSourceResolvable (e.g. an ObjectError instance) in the given Locale.
     * 
     * @param resolvable the MessageSourceResolvable
     * @param locale Locale in which to do lookup
     * @return the message
     */
    public String getMessage(MessageSourceResolvable resolvable, Locale locale) {
        return messageSourceAccessor.getMessage(resolvable, locale);
    }

}
