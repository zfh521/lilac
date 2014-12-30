package com.snail.lilac.test.repository.security;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.repository.security.UserRepository;
import com.snail.lilac.test.AbstractRepositoryTests;

/**
 * @author Andy
 */
public class UserRepositoryTest extends AbstractRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testInsert() {
        Assert.assertNotNull(userRepository);
        UserInfo userInfo = new UserInfo();
        userInfo.setInstanceRrn(System.currentTimeMillis() + "");
        userInfo.setInstanceId("ID");
        userInfo.setCreatedUser(getCurrentUser());
        userInfo.setLastUpdatedUser(getCurrentUser());
        // userRepository.insert(userInfo);
    }
}
