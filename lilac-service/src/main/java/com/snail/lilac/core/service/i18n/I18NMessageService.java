package com.snail.lilac.core.service.i18n;

import org.springframework.stereotype.Service;

import com.snail.lilac.core.entity.i18n.I18NMessage;
import com.snail.lilac.core.repository.i18n.I18NMessageRepository;
import com.snail.lilac.core.service.AbstractService;

/**
 * @author andy
 * @since 2013-5-22
 */
@Service
public class I18NMessageService extends AbstractService<I18NMessageRepository, I18NMessage, String> {

    /**
     * @param code
     * @param language
     * @return
     */
    public String findOne(String code, String language) {
        return this.repository.findContentTextByCodeAndLanguage(code, language);
    }
}
