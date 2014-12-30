package com.snail.lilac.test.service.security.shiro.realm;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.snail.lilac.test.AbstractTransactionalTests;

/**
 * @author Andy
 * @since 2013-5-15
 */
public class ShiroTest extends AbstractTransactionalTests {

    @Test
    public void testLogin() {
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("ADMIN", "ADMIN");
        currentUser.login(token);
        currentUser.logout();
    }
}
