package com.snail.lilac.service.security;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.service.security.support.ShiroUtils;

/**
 * @author Andy
 * @since 2013-5-16
 */
public final class UserHolder {

    private static final Logger log = LoggerFactory.getLogger(UserHolder.class);

    public static UserInfo getCurrentLoginUser() {
        return ShiroUtils.getCurrentUser();
    }
}
