package com.snail.lilac.web.tags.form;

import javax.servlet.jsp.JspException;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.util.Assert;
import org.springframework.web.servlet.tags.form.AbstractHtmlElementTag;
import org.springframework.web.servlet.tags.form.TagWriter;

import com.snail.lilac.AppContext;
import com.snail.lilac.core.util.StringUtils;
import com.snail.lilac.service.i18n.I18NService;

/**
 * @author Andy
 * @since 2013-6-28
 */
@SuppressWarnings("serial")
public class LabelTag extends AbstractHtmlElementTag {

    /**
     * The HTML '{@code label}' tag.
     */
    private static final String LABEL_TAG     = "label";

    /**
     * The name of the '{@code for}' attribute.
     */
    private static final String FOR_ATTRIBUTE = "for";

    private static final String LBL_PREFIX    = "LBL_";

    /**
     * label code
     */
    private String              code;

    /**
     * defaultMsg
     */
    private String              defaultMsg;

    /**
     * The {@link TagWriter} instance being used.
     * <p>
     * Stored so we can close the tag on {@link #doEndTag()}.
     */
    private TagWriter           tagWriter;

    /**
     * The value of the '{@code for}' attribute.
     */
    private String              forId;

    private I18NService         i18NService;

    /**
     * 
     */
    public LabelTag(){
        super();
        i18NService = AppContext.getBean("i18NService", I18NService.class);
    }

    /**
     * Set the value of the '{@code for}' attribute.
     * <p>
     * Defaults to the value of {@link #getPath}; may be a runtime expression.
     * 
     * @throws IllegalArgumentException if the supplied value is {@code null}
     */
    public void setFor(String forId) {
        Assert.notNull(forId, "'forId' must not be null");
        this.forId = forId;
    }

    /**
     * Get the value of the '{@code id}' attribute.
     * <p>
     * May be a runtime expression.
     */
    public String getFor() {
        return this.forId;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return StringUtils.upperCase(code);
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the defaultMsg
     */
    public String getDefaultMsg() {
        return defaultMsg;
    }

    /**
     * @param defaultMsg the defaultMsg to set
     */
    public void setDefaultMsg(String defaultMsg) {
        this.defaultMsg = defaultMsg;
    }

    /**
     * Writes the opening '{@code label}' tag and forces a block tag so that body content is written correctly.
     * 
     * @return {@link javax.servlet.jsp.tagext.Tag#EVAL_BODY_INCLUDE}
     */
    @Override
    protected int writeTagContent(TagWriter tagWriter) throws JspException {
        tagWriter.startTag(LABEL_TAG);
        tagWriter.writeAttribute(FOR_ATTRIBUTE, resolveFor());
        writeDefaultAttributes(tagWriter);
        tagWriter.appendValue(resolveMessage());
        tagWriter.forceBlock();
        this.tagWriter = tagWriter;
        return EVAL_BODY_INCLUDE;
    }

    /**
     * Resolve the specified message into a concrete message String. The returned message String should be unescaped.
     * 
     * @throws JspException
     */
    protected String resolveMessage() throws JspException {
        String labelValue = null;
        if (StringUtils.isNotBlank(getCode())) {
            labelValue = i18NService.getMessage(getCode(), getDefaultMsg(),
                                                LocaleContextHolder.getLocale());
        } else {
            labelValue = i18NService.getMessage(LBL_PREFIX
                                                        + StringUtils.toUnderScoreCase(this.getPath()),
                                                getDefaultMsg(), LocaleContextHolder.getLocale());
        }
        return labelValue;
    }

    /**
     * Overrides {@link #getName()} to always return {@code null}, because the '{@code name}' attribute is not supported
     * by the '{@code label}' tag.
     * 
     * @return the value for the HTML '{@code name}' attribute
     */
    @Override
    protected String getName() throws JspException {
        // This also suppresses the 'id' attribute (which is okay for a <label/>)
        return null;
    }

    /**
     * Determine the '{@code for}' attribute value for this tag, autogenerating one if none specified.
     * 
     * @see #getFor()
     * @see #autogenerateFor()
     */
    protected String resolveFor() throws JspException {
        if (StringUtils.hasText(this.forId)) {
            return getDisplayString(evaluate(FOR_ATTRIBUTE, this.forId));
        } else {
            return autogenerateFor();
        }
    }

    /**
     * Autogenerate the '{@code for}' attribute value for this tag.
     * <p>
     * The default implementation delegates to {@link #getPropertyPath()}, deleting invalid characters (such as "[" or
     * "]").
     */
    protected String autogenerateFor() throws JspException {
        return StringUtils.deleteAny(getPropertyPath(), "[]");
    }

    /**
     * Close the '{@code label}' tag.
     */
    @Override
    public int doEndTag() throws JspException {
        this.tagWriter.endTag();
        return EVAL_PAGE;
    }

    /**
     * Disposes of the {@link TagWriter} instance.
     */
    @Override
    public void doFinally() {
        super.doFinally();
        this.tagWriter = null;
    }

}
