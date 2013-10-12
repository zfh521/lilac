package com.lilac.core.i18n.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.lilac.core.cache.CacheNames;
import com.lilac.core.i18n.I18NMessage;
import com.lilac.core.i18n.repository.I18NMessageRepository;
import com.lilac.core.service.AbstractService;

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
    @Cacheable(value = CacheNames.COM_LILAC_CORE_I18N_I18N_MESSAGE)
    public String findOne(String code, String language) {
        return this.repository.findContentTextByCodeAndLanguage(code, language);
    }
}
