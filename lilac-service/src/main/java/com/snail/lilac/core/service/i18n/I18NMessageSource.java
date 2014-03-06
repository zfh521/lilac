package com.snail.lilac.core.service.i18n;

import java.text.MessageFormat;
import java.util.Locale;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.context.support.AbstractMessageSource;

/**
 * @author andy
 * @since 2013-5-7
 */
public class I18NMessageSource extends AbstractMessageSource {

    private static final Logger log = LoggerFactory.getLogger(I18NMessageSource.class);

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
