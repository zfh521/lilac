/*
 * Copyright 2013 Jimmy Leung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lilac.core.security.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lilac.core.AbstractTransactionalTests;
import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.service.UserService;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
public class UserServiceTest extends AbstractTransactionalTests {

    @Autowired
    UserService         userService;

    private static UserInfo user = null;

    @Before
    public void initData() {
        user = new UserInfo();
        user.setCreatedUser(user);
        userService.save(user);
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#save(com.lilac.core.security.entity.UserInfo)}.
     */
    @Test
    public void testSave() {
        UserInfo user2 = new UserInfo();
        user2.setCreatedUser(user);
        userService.save(user2);

        assertNotNull(user2.getId());

        user2.setInstanceDesc("instanceDesc");
        user2.setLastUpdateUser(user);
        userService.save(user2);
        assertNotNull(user2.getLastUpdateTime());
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#delete(java.lang.String)}.
     */
    @Test
    public void testDelete() {
        userService.delete(user.getId());
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#deleteById(java.lang.String)}.
     */
    @Test
    public void testDeleteById() {
        userService.deleteById(user.getId());
    }

    /**
     * Test method for {@link com.lilac.core.security.service.UserService#findOne(java.lang.String)}.
     */
    @Test
    public void testFindOne() {
        user = userService.findOne(user.getId());
        assertEquals(user.getId(), user.getId());
    }

}
