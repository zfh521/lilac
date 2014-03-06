package com.snail.lilac.core.repository.security;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.snail.lilac.core.AbstractRepositoryTests;
import com.snail.lilac.core.entity.security.UserInfo;

/**
 * @author andy
 */
public class UserRepositoryTest extends AbstractRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testInsert() {
        Assert.assertNotNull(userRepository);
        UserInfo userInfo = new UserInfo();
        userInfo.setInstanceRrn("IDXXX12345");
        userInfo.setInstanceId("ID");
        userInfo.setCreatedUser(getCurrentUser());
        userInfo.setLastUpdateUser(getCurrentUser());
        userRepository.insert(userInfo);
    }
}
