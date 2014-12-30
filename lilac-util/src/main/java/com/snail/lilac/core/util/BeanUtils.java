package com.snail.lilac.core.util;

/**
 * @author Andy
 * @since 2013-5-10
 */
public class BeanUtils extends org.springframework.beans.BeanUtils {

    @SuppressWarnings("unchecked")
    public static <T> T getObject(Object obj, Class<T> clazz) {
        if (obj == null) {
            return BeanUtils.instantiate(clazz);
        } else {
            return (T) obj;
        }

    }
}
