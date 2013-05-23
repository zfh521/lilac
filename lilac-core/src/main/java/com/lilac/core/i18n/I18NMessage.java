/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.i18n;

import javax.persistence.Entity;

import com.lilac.core.entity.BaseEntity;

/**
 * @author Jimmy Leung
 * @since 2013-5-7
 */
@SuppressWarnings("serial")
@Entity
public class I18NMessage extends BaseEntity {

    private String code;
    private String language;
    private String contentText;
    private String fullContent;
    private String helpText;
    private String fullLanguage;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the contentText
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * @param contentText the contentText to set
     */
    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    /**
     * @return the fullContent
     */
    public String getFullContent() {
        return fullContent;
    }

    /**
     * @param fullContent the fullContent to set
     */
    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }

    /**
     * @return the helpText
     */
    public String getHelpText() {
        return helpText;
    }

    /**
     * @param helpText the helpText to set
     */
    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    /**
     * @return the fullLanguage
     */
    public String getFullLanguage() {
        return fullLanguage;
    }

    /**
     * @param fullLanguage the fullLanguage to set
     */
    public void setFullLanguage(String fullLanguage) {
        this.fullLanguage = fullLanguage;
    }

}
