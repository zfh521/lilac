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

import com.lilac.core.i18n.MessageHolder;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.service.UserService;
import com.lilac.core.security.shiro.ShiroUser;
import com.lilac.core.util.ArrayUtils;
import com.lilac.core.util.EncodeUtils;
import com.lilac.core.util.StringUtils;

/**
 * @author andy
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

        String username = authcToken.getUsername();
        if (StringUtils.isBlank(username)) {
            throw new AuthenticationException(
                                              MessageHolder.getMessage("INVALID_ARGUMENT",
                                                                       new String[] { MessageHolder.getMessage("LBL_USERNAME") }));
        }
        char[] password = authcToken.getPassword();
        if (ArrayUtils.isEmpty(password)) {
            throw new AuthenticationException(
                                              MessageHolder.getMessage("INVALID_ARGUMENT",
                                                                       new String[] { MessageHolder.getMessage("LBL_PASSWORD") }));
        }

        Assert.notNull(authcToken.getUsername(),
                       MessageHolder.getMessage("INVALID_ARGUMENT",
                                                new String[] { MessageHolder.getMessage("LBL_USERNAME") }));
        Assert.notNull(authcToken.getPassword(),
                       MessageHolder.getMessage("INVALID_ARGUMENT",
                                                new String[] { MessageHolder.getMessage("LBL_PASSWORD") }));
        UserInfo user = userService.findOneByInstanceId(StringUtils.upperCase(authcToken.getUsername()));
        if (user == null) {
            throw new UnknownAccountException(MessageHolder.getMessage("INVALID_USERNAME_OR_PASSWORD",
                                                                       "Please login with your Username and Password."));
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
