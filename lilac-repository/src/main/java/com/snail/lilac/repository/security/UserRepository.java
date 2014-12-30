package com.snail.lilac.repository.security;

import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.repository.BaseRepository;

/**
 * @author Andy
 * @since 2013-5-2
 */
public interface UserRepository extends BaseRepository<UserInfo, String> {

    /**
     * @param userId
     * @return
     */
    UserInfo findOneByInstanceId(String userId);
}
