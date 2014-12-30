package com.snail.lilac.web.tags;

import org.springframework.web.servlet.tags.ArgumentTag;
import org.springframework.web.servlet.tags.HtmlEscapeTag;

/**
 * Custom JSP tag to look up a message in the scope of this page. Messages are resolved using the ApplicationContext and
 * thus support internationalization.
 * <p>
 * Detects an HTML escaping setting, either on this tag instance, the page level, or the {@code web.xml} level. Can also
 * apply JavaScript escaping.
 * <p>
 * If "code" isn't set or cannot be resolved, "text" will be used as default message. Thus, this tag can also be used
 * for HTML escaping of any texts.
 * <p>
 * Message arguments can be specified via the {@link #setArguments(Object) arguments} attribute or by using nested
 * {@code <spring:argument>} tags.
 * 
 * @author Andy Leung
 * @see #setCode
 * @see #setText
 * @see #setHtmlEscape
 * @see #setJavaScriptEscape
 * @see HtmlEscapeTag#setDefaultHtmlEscape
 * @see org.springframework.web.util.WebUtils#HTML_ESCAPE_CONTEXT_PARAM
 * @see ArgumentTag
 */
@SuppressWarnings({ "serial" })
public class MessageTag extends org.springframework.web.servlet.tags.MessageTag {

    private String defaultMsg;

    /**
     * @return the defaultMsg
     */
    public String getDefaultMsg() {
        return this.defaultMsg;
    }

    /**
     * @param defaultMsg the defaultMsg to set
     */
    public void setDefaultMsg(String defaultMsg) {
        this.setText(defaultMsg);
        this.defaultMsg = defaultMsg;
    }

}
