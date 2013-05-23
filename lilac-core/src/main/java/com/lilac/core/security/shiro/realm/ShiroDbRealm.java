/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.security.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.lilac.core.i18n.MessageHelper;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.service.UserService;
import com.lilac.core.security.shiro.ShiroUser;
import com.lilac.core.util.EncodeUtils;

/**
 * @author Jimmy Leung
 * @since 2013-5-15
 */
public class ShiroDbRealm extends AuthorizingRealm {

    protected static final Logger log = LoggerFactory.getLogger(ShiroDbRealm.class);

    private UserService           userService;

    /*
     * (non-Javadoc)
     * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        UsernamePasswordToken authcToken = (UsernamePasswordToken) token;
        Assert.notNull(authcToken.getUsername(),
                       MessageHelper.getMessage("INVALID_ARGUMENT",
                                                new String[] { MessageHelper.getMessage("LBL_USERNAME") }));
        Assert.notNull(authcToken.getPassword(),
                       MessageHelper.getMessage("INVALID_ARGUMENT",
                                                new String[] { MessageHelper.getMessage("LBL_PASSWORD") }));
        UserInfo user = userService.findOneByInstanceId(authcToken.getUsername());
        if (user == null) {
            throw new UnknownAccountException(MessageHelper.getMessage("INVALID_USER_NAME"));
        } else {

            byte[] salt = EncodeUtils.decodeHex(user.getSalt());
            return new SimpleAuthenticationInfo(new ShiroUser(user), user.getPassword(), ByteSource.Util.bytes(salt),
                                                getName());
        }
    }

    /**
     * @param userService the userService to set
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
