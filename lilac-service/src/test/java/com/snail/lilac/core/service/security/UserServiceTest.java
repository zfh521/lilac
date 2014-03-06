package com.snail.lilac.core.service.security;

import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.snail.lilac.core.AbstractTransactionalTests;
import com.snail.lilac.core.entity.security.UserInfo;
import com.snail.lilac.core.entity.support.EntityStatus;
import com.snail.lilac.core.entity.sys.SpaceDefinition;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

import static org.junit.Assert.*;

/**
 * @author andy
 * @since 2013-5-2
 */
public class UserServiceTest extends AbstractTransactionalTests {

    private static final Logger LOG = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    UserService                 userService;

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.security.UserService#save(com.snail.lilac.core.security.entity.UserInfo)} .
     */
    @Test
    public void testSave() {
        while (true) {
            UserInfo user = buildUserInfo();
            userService.save(user);
            LOG.info(user.toString());
            assertNotNull(user.getInstanceRrn());
        }
    }

    /**
     * @return
     */
    private UserInfo buildUserInfo() {
        UserInfo user = new UserInfo();
        user.setInstanceId("user");
        user.setPassword("password");
        user.setInstanceDesc("common user");
        user.setUserName("user name");
        SpaceDefinition spaceDefinition = new SpaceDefinition();
        spaceDefinition.setInstanceId("LILAC");
        user.setSpaceDefinition(spaceDefinition);
        user.setActiveVersion(1);
        user.setCurrentVersion(1);
        user.setEntityStatus(EntityStatus.ENABLED);
        user.setPassword("password");
        user.setPlainPassword("plainPassword");
        user.setCreatedUser(currentUser);
        user.setCreatedTime(new Date());
        user.setLastUpdateUser(currentUser);
        user.setLastUpdateTime(new Date());
        user.setAttribute1("attribute1");
        user.setAttribute2("attribute2");
        user.setAttribute3("attribute3");
        user.setAttribute4("attribute4");
        user.setAttribute5("attribute5");
        return user;
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.security.UserService#delete(java.lang.String)}.
     */
    @Test
    public void testDelete() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        userService.delete(user.getInstanceRrn());
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.security.UserService#findOne(java.lang.String)}.
     */
    @Test
    public void testFindOne() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        user = userService.findOne(user.getInstanceRrn());
        assertEquals(user.getInstanceRrn(), user.getInstanceRrn());
    }

    @Test
    public void testFindUserByCache() {
        UserInfo user = UserHolder.getCurrentLoginUser();
        user = userService.findOne(user.getInstanceRrn());
        user.setInstanceDesc("cache");
        userService.save(user);
        user = userService.findOne(user.getInstanceRrn());
        assertEquals("SYSTEM", user.getInstanceRrn());
        user = userService.findOne(user.getInstanceRrn());
        assertEquals("SYSTEM", user.getInstanceRrn());
    }

    @Test
    public void testUserValidate() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        UserInfo user = new UserInfo();
        Set<ConstraintViolation<UserInfo>> constraintViolations = validator.validate(user);
        for (ConstraintViolation<UserInfo> constraintViolation : constraintViolations) {
            // log.error(constraintViolation.getMessage());
        }
    }
}
