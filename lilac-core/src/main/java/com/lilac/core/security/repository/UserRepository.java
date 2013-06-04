/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.security.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.lilac.core.repository.BaseRepository;
import com.lilac.core.security.entity.UserInfo;

/**
 * @author Jimmy Leung
 * @since 2013-5-2
 */
public interface UserRepository extends BaseRepository<UserInfo, String> {

    /**
     * @param id
     */
    @Modifying
    @Query("UPDATE UserInfo SET entityStatus = com.lilac.core.entity.support.EntityStatus.OBSOLETED WHERE id = ?1")
    void deleteById(String id);

    /**
     * @param userId
     * @return userInfo
     */
    UserInfo findUserByInstanceId(String userId);

}

/**
 * @author Jimmy Leung
 * @since 2013-5-25
 */
interface UserRepositoryCustom {
}
