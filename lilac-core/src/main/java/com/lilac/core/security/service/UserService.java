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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.repository.UserDao;
import com.lilac.core.service.BaseService;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
@Service
@Transactional
public class UserService implements BaseService<UserInfo, String> {

    @Autowired
    private UserDao userDao;

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.BaseService#save(java.lang.Object)
     */
    @Override
    public UserInfo save(UserInfo entity) {
        return userDao.save(entity);
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.BaseService#delete(java.io.Serializable)
     */
    @Override
    public void delete(String id) {
        userDao.delete(id);
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.BaseService#deleteById(java.io.Serializable)
     */
    @Override
    public void deleteById(String id) {
        userDao.deleteById(id);
    }

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.BaseService#findOne(java.io.Serializable)
     */
    @Override
    public UserInfo findOne(String id) {
        return userDao.findOne(id);
    }

}
