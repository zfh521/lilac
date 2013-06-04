/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.security.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilac.core.security.entity.UserInfo;
import com.lilac.core.security.repository.UserRepository;
import com.lilac.core.service.AbstractService;
import com.lilac.core.util.EncodeUtils;
import com.lilac.core.util.StringUtils;
import com.lilac.core.util.security.DigestUtils;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
@Service
@Transactional
public class UserService extends AbstractService<UserRepository, UserInfo, String> {

    public static final int  HASH_INTERATIONS = 1024;
    private static final int SALT_SIZE        = 8;

    /*
     * (non-Javadoc)
     * @see com.lilac.core.service.BaseService#save(java.lang.Object)
     */
    @Override
    public UserInfo save(UserInfo entity) {
        if (StringUtils.isBlank(entity.getId())) {
            entryptPassword(entity);
        }
        return super.save(entity);
    }

    /**
     * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(UserInfo user) {
        user.setPlainPassword(user.getPassword());

        byte[] salt = DigestUtils.generateSalt(SALT_SIZE);
        user.setSalt(EncodeUtils.encodeHex(salt));

        byte[] hashPassword = DigestUtils.sha1(user.getPassword().getBytes(), salt, HASH_INTERATIONS);
        user.setPassword(EncodeUtils.encodeHex(hashPassword));
    }

    public UserInfo findOneByInstanceId(String userId) {
        return repository.findUserByInstanceId(userId);
    }

}
