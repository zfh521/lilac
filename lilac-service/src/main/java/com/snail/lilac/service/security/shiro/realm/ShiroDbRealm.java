package com.snail.lilac.service.security.shiro.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.util.Assert;

import com.snail.lilac.core.util.ArrayUtils;
import com.snail.lilac.core.util.EncodeUtils;
import com.snail.lilac.core.util.StringUtils;
import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.i18n.ErrorCodes;
import com.snail.lilac.model.i18n.LabelCodes;
import com.snail.lilac.model.security.ShiroUser;
import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.service.i18n.I18NService;
import com.snail.lilac.service.security.UserService;

/**
 * @author Andy
 * @since 2013-5-15
 */
public class ShiroDbRealm extends AuthorizingRealm {

    private static final Logger log = LoggerFactory.getLogger(ShiroDbRealm.class);

    private I18NService         i18NService;

    private UserService         userService;

    public void setI18NService(I18NService i18nService) {
        i18NService = i18nService;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
     * .shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        log.info("Get authorization info.");
        return null;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org
     * .apache.shiro.authc.AuthenticationToken)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
                                                                                   throws AuthenticationException {

        UserToken authcToken = (UserToken) token;

        String username = StringUtils.trimToUpperCase(authcToken.getUsername());
        if (StringUtils.isBlank(username)) {
            throw new AuthenticationException(
                                              i18NService.getMessage(ErrorCodes.INVALID_ARGUMENT,
                                                                     new String[] { i18NService.getMessage(LabelCodes.LBL_USERNAME) }));
        }
        char[] password = authcToken.getPassword();
        if (ArrayUtils.isEmpty(password)) {
            throw new AuthenticationException(
                                              i18NService.getMessage(ErrorCodes.INVALID_ARGUMENT,
                                                                     new String[] { i18NService.getMessage("LBL_PASSWORD") }));
        }

        Assert.notNull(authcToken.getUsername(),
                       i18NService.getMessage(ErrorCodes.INVALID_ARGUMENT,
                                              new String[] { i18NService.getMessage(LabelCodes.LBL_USERNAME) }));
        Assert.notNull(authcToken.getPassword(),
                       i18NService.getMessage(ErrorCodes.INVALID_ARGUMENT,
                                              new String[] { i18NService.getMessage(LabelCodes.LBL_PASSWORD) }));
        UserInfo user = userService.findOneByInstanceId(StringUtils.upperCase(username));
        if (user == null || StringUtils.isEmpty(user.getInstanceRrn())) {
            throw new UnknownAccountException(
                                              i18NService.getMessage(ErrorCodes.INVALID_USERNAME_OR_PASSWORD,
                                                                     "Please sign in with your username and password."));
        } else {

            log.info("The user {} login successful.", user.getInstanceId());

            byte[] salt = EncodeUtils.decodeHex(user.getSalt());

            return new SimpleAuthenticationInfo(new ShiroUser(user.getInstanceId()),
                                                user.getPassword(), ByteSource.Util.bytes(salt),
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
