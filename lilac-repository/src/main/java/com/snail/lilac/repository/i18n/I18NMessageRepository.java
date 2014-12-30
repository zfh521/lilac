package com.snail.lilac.repository.i18n;

import com.snail.lilac.model.i18n.I18NMessage;
import com.snail.lilac.repository.BaseRepository;

/**
 * @author Andy
 * @since 2013-5-22
 */
public interface I18NMessageRepository extends BaseRepository<I18NMessage, String> {

    /**
     * @param code
     * @param language
     * @return contentText
     */
    // @Query("SELECT contentText FROM com.snail.lilac.core.i18n.I18NMessage WHERE code=?1 and language=?2")
    String findContentTextByCodeAndLanguage(String code, String language);

}
