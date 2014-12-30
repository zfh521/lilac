// Created on 2015年4月3日
// $Id$

package com.snail.lilac.service.security.support;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.snail.lilac.model.security.ShiroUser;
import com.snail.lilac.model.security.UserInfo;

/**
 * @author Andy
 */
public class ShiroUtils {

    /**
     * Get the subject prinicpal
     * 
     * @return
     */
    public static ShiroUser getShiroUser() {
        Subject subject = SecurityUtils.getSubject();
        Object prinicpal = subject.getPrincipal();
        if (prinicpal instanceof ShiroUser) {
            ShiroUser shiroUser = (ShiroUser) subject.getPrincipal();
            UserInfo userInfo = new UserInfo();
            userInfo.setUserId(shiroUser.getUserId());
            return shiroUser;
        }
        return null;
    }

    /**
     * 获取当前登录用户
     * 
     * @return
     */
    public static UserInfo getCurrentUser() {
        ShiroUser shiroUser = ShiroUtils.getShiroUser();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(shiroUser.getUserId());
        return userInfo;
    }

}
