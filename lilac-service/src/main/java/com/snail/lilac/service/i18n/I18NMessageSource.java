package com.snail.lilac.service.i18n;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.context.support.AbstractMessageSource;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * @author Andy
 * @since 2013-5-7
 */
public class I18NMessageSource extends AbstractMessageSource {

    private static final Logger log = LoggerFactory.getLogger(I18NMessageSource.class);

    private I18NMessageService  i18NMessageService;

    /**
     * @param i18nMessageService the i18NMessageService to set
     */
    public void setI18NMessageService(I18NMessageService i18nMessageService) {
        i18NMessageService = i18nMessageService;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.context.support.AbstractMessageSource#resolveCode(java.lang.String, java.util.Locale)
     */
    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        MessageFormat messageFormat = null;
        String msg = i18NMessageService.findOne(code, locale.toString());
        if (msg != null) {
            messageFormat = createMessageFormat(msg, locale);
        }
        return messageFormat;
    }

}
