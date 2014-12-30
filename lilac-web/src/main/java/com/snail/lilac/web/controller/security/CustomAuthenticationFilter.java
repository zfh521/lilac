package com.snail.lilac.web.controller.security;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import com.snail.lilac.service.security.shiro.realm.UserToken;

/**
 * @author Andy
 * @since 2013-6-27
 */
public class CustomAuthenticationFilter extends FormAuthenticationFilter {

    public static final String DEFAULT_ORG_PARAM = "orgId";

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        boolean rememberMe = isRememberMe(request);
        String host = getHost(request);
        return new UserToken(username, password, rememberMe, host);
    }

    /*
     * (non-Javadoc)
     * @see org.apache.shiro.web.filter.authc.FormAuthenticationFilter#setFailureAttribute(javax.servlet.ServletRequest,
     * org.apache.shiro.authc.AuthenticationException)
     */
    @Override
    protected void setFailureAttribute(ServletRequest request, AuthenticationException ae) {
        request.setAttribute(getFailureKeyAttribute(), ae.getMessage());
    }

}
