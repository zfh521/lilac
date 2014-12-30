// Created on 2015年3月31日
// $Id$

package com.snail.lilac.service.security.shiro.realm;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @author Andy
 */
public class UserToken extends UsernamePasswordToken {

    private static final long serialVersionUID = -6996636816160095211L;

    public UserToken(){
        super();
    }

    /**
     * @param username
     * @param password
     * @param rememberMe
     * @param host
     */
    public UserToken(final String username, final String password, final boolean rememberMe,
                     final String host){
        super(username, password, rememberMe, host);
    }

    @Override
    public void clear() {
        super.clear();
    }

}
