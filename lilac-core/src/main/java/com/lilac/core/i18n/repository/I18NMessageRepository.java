package com.lilac.core.i18n.repository;

import org.springframework.data.jpa.repository.Query;

import com.lilac.core.i18n.I18NMessage;
import com.lilac.core.repository.BaseRepository;

/**
 * @author andy
 * @since 2013-5-22
 */
public interface I18NMessageRepository extends BaseRepository<I18NMessage, String> {

    /**
     * @param code
     * @param language
     * @return contentText
     */
    @Query("SELECT contentText FROM com.lilac.core.i18n.I18NMessage WHERE code=?1 and language=?2")
    String findContentTextByCodeAndLanguage(String code, String language);

    /**
     * @param code
     */
    @Query("SELECT contentText FROM com.lilac.core.i18n.I18NMessage WHERE language=?1")
    void findContentTextByCode(String code);

}
