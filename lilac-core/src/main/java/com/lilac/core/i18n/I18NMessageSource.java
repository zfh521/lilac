/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.i18n;

import java.text.MessageFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractMessageSource;

import com.lilac.core.i18n.service.I18NMessageService;

/**
 * @author Jimmy Leung
 * @since 2013-5-7
 */
public class I18NMessageSource extends AbstractMessageSource {

    protected static final Logger log = LoggerFactory.getLogger(I18NMessageSource.class);

    private I18NMessageService    messageService;

    /**
     * @param messageService the messageService to set
     */
    public void setMessageService(I18NMessageService messageService) {
        this.messageService = messageService;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.context.support.AbstractMessageSource#resolveCode(java.lang.String, java.util.Locale)
     */
    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        MessageFormat messageFormat = null;
        String msg = messageService.findOne(code, locale.toString());
        if (msg != null) {
            messageFormat = createMessageFormat(msg, locale);
        }
        return messageFormat;
    }

}
