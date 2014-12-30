package com.snail.lilac.model.i18n.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Andy
 * @since 2013-5-8
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface I18NMessage {

    public String code();

    public String defaultMsg() default "";

    public String locale() default "zh_CN";

}
