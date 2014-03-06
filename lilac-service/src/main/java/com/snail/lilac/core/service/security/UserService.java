package com.snail.lilac.core.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.core.entity.security.UserInfo;
import com.snail.lilac.core.repository.security.UserRepository;
import com.snail.lilac.core.service.AbstractService;
import com.snail.lilac.core.util.EncodeUtils;
import com.snail.lilac.core.util.StringUtils;
import com.snail.lilac.core.util.security.DigestUtils;

/**
 * @author andy
 * @since 2013-5-2
 */
@Service
@Transactional
public class UserService extends AbstractService<UserRepository, UserInfo, String> {

    public static final int  HASH_INTERATIONS = 1024;
    private static final int SALT_SIZE        = 8;
    
    @Autowired
    private UserRepository userRepository;
    
    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.service.BaseService#save(java.lang.Object)
     */
    @Override
    public UserInfo save(UserInfo entity) {
        if (StringUtils.isBlank(entity.getInstanceRrn())) {
            entryptPassword(entity);
            entity.setInstanceRrn((String)this.getUuidHexGenerator().generate());
        }
        userRepository.insert(entity);
        return entity;
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
        return null;
    }

}
