package com.lilac.core.security.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lilac.core.security.entity.UserInfo;

/**
 * @author andy
 * @since 2013-5-16
 */
public final class UserHolder {

    protected static final Logger log = LoggerFactory.getLogger(UserHolder.class);

    public static UserInfo getCurrentLoginUser() {
        Subject subject = SecurityUtils.getSubject();
        Object prinicpal = subject.getPrincipal();
        if (prinicpal instanceof ShiroUser) {
            ShiroUser shiroUser = (ShiroUser) subject.getPrincipal();
            return shiroUser.getUser();
        }
        return null;
    }

}
