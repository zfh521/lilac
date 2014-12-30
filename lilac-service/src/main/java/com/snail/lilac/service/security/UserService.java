package com.snail.lilac.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.snail.lilac.core.util.EncodeUtils;
import com.snail.lilac.core.util.StringUtils;
import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.repository.security.UserRepository;
import com.snail.lilac.service.AbstractService;
import com.snail.lilac.util.security.DigestUtils;

/**
 * @author Andy
 * @since 2013-5-2
 */
@Service
@Transactional
public class UserService extends AbstractService<UserRepository, UserInfo, String> {

    public static final int  HASH_INTERATIONS = 1024;
    private static final int SALT_SIZE        = 8;

    @Autowired
    private UserRepository   userRepository;

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.service.BaseService#save(java.lang.Object)
     */
    public UserInfo save(UserInfo entity) {
        if (StringUtils.isBlank(entity.getInstanceRrn())) {
            entryptPassword(entity);
            entity.setInstanceRrn((String) this.getUuidHexGenerator().generate());
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

        byte[] hashPassword = DigestUtils.sha1(user.getPassword().getBytes(), salt,
                                               HASH_INTERATIONS);
        user.setPassword(EncodeUtils.encodeHex(hashPassword));
    }

    public UserInfo findOneByInstanceId(String userId) {
        UserInfo userInfo = new UserInfo();
        userInfo.setInstanceRrn("ADMIN");
        userInfo.setInstanceId("ADMIN");
        userInfo.setPassword("cd94a2472d627606a47e09ca21ad17a3fdde9c25");
        userInfo.setSalt("6ec2ded84af0399a");
        return userInfo;
    }

}
