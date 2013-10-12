package com.lilac.core.security.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lilac.core.AbstractTransactionalTests;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.shiro.UserHolder;

/**
 * @author andy
 * @since 2013-5-2
 */
public class UserServiceTest extends AbstractTransactionalTests {

    @Autowired
    UserService userService;

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#save(com.lilac.core.security.entity.UserInfo)}
     * .
     */
    @Test
    public void testSave() {
        UserInfo user = new UserInfo();
        user.setInstanceId("user");
        user.setPassword("password");
        user.setInstanceDesc("common user");
        user.setUserName("user name");
        userService.save(user);

        assertNotNull(user.getId());

        user = userService.findOne(user.getId());
        user.setInstanceDesc("instanceDesc");
        user = userService.save(user);

        user = userService.findOne(user.getId());
        user.setInstanceDesc(user.getInstanceDesc() + " instanceDesc");
        user = userService.save(user);
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#delete(java.lang.String)}.
     */
    @Test
    public void testDelete() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        userService.delete(user.getId());
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#findOne(java.lang.String)}.
     */
    @Test
    public void testFindOne() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        user = userService.findOne(user.getId());
        assertEquals(user.getId(), user.getId());
    }

    @Test
    public void testFindUserByCache() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        user = userService.findOne(user.getId());
        user.setInstanceDesc("cache");
        userService.save(user);
        user = userService.findOne(user.getId());
        assertEquals("SYSTEM", user.getId());
        user = userService.findOne(user.getId());
        assertEquals("SYSTEM", user.getId());
    }

    @Test
    public void testUserValidate() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        UserInfo user = new UserInfo();
        Set<ConstraintViolation<UserInfo>> constraintViolations = validator.validate(user);
        for (ConstraintViolation<UserInfo> constraintViolation : constraintViolations) {
            log.error(constraintViolation.getMessage());
        }
    }
}
