package com.snail.lilac.core.repository.security;

import org.springframework.stereotype.Repository;

import com.snail.lilac.core.entity.security.UserInfo;
import com.snail.lilac.core.repository.BaseRepository;

/**
 * @author andy
 * @since 2013-5-2
 */
@Repository
public interface UserRepository extends BaseRepository<UserInfo, String> {
}
