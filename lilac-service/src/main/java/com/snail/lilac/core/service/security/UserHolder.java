package com.snail.lilac.core.service.security;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

import com.snail.lilac.core.entity.security.UserInfo;

/**
 * @author andy
 * @since 2013-5-16
 */
public final class UserHolder {

    private static final Logger log = LoggerFactory.getLogger(UserHolder.class);

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
