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

package com.lilac.core.util.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.dialect.H2Dialect;
import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.hibernate.dialect.Oracle10gDialect;

public class DialectUtils {

    /**
     * 从DataSoure中取出connection, 根据connection的metadata中的jdbcUrl判断Dialect类型. 仅支持Oracle, H2, MySql，如需更多数据库类型，请仿照此类自行编写。
     */
    public static String getDialect(DataSource dataSource) {
        String jdbcUrl = getJdbcUrlFromDataSource(dataSource);

        // 根据jdbc url判断dialect
        if (org.apache.commons.lang3.StringUtils.contains(jdbcUrl, ":h2:")) {
            return H2Dialect.class.getName();
        } else if (org.apache.commons.lang3.StringUtils.contains(jdbcUrl, ":mysql:")) {
            return MySQL5InnoDBDialect.class.getName();
        } else if (org.apache.commons.lang3.StringUtils.contains(jdbcUrl, ":oracle:")) {
            return Oracle10gDialect.class.getName();
        } else {
            throw new IllegalArgumentException("Unknown Database of " + jdbcUrl);
        }
    }

    private static String getJdbcUrlFromDataSource(DataSource dataSource) {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            if (connection == null) {
                throw new IllegalStateException("Connection returned by DataSource [" + dataSource + "] was null");
            }
            return connection.getMetaData().getURL();
        } catch (SQLException e) {
            throw new RuntimeException("Could not get database url", e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}