/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.sys.repository;

import com.lilac.core.repository.BaseRepository;
import com.lilac.core.sys.entity.TransactionLog;

/**
 * @author Jimmy Leung
 * @since 2013-5-10
 */
public interface ObjectHistoryRepository extends BaseRepository<TransactionLog, String> {

}
