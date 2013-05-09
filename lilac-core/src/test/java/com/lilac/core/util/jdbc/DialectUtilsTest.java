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

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.dialect.H2Dialect;
import org.hibernate.dialect.MySQL5InnoDBDialect;
import org.hibernate.dialect.Oracle10gDialect;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author Jimmy Leung
 * @since 2013-4-25
 */
public class DialectUtilsTest {

    /**
     * Test method for {@link com.lilac.core.util.jdbc.DialectUtils#getDialect(javax.sql.DataSource)}.
     * 
     * @throws SQLException
     */
    @Test
    public void testGetDialect() throws SQLException {

        DataSource mockDataSource = Mockito.mock(DataSource.class);
        Connection mockConnection = Mockito.mock(Connection.class);
        DatabaseMetaData mockMetaData = Mockito.mock(DatabaseMetaData.class);

        Mockito.when(mockDataSource.getConnection()).thenReturn(mockConnection);
        Mockito.when(mockConnection.getMetaData()).thenReturn(mockMetaData);

        Mockito.when(mockMetaData.getURL()).thenReturn("jdbc:h2:file:~/test;AUTO_SERVER=TRUE");
        String dialect = DialectUtils.getDialect(mockDataSource);
        assertEquals(H2Dialect.class.getName(), dialect);

        Mockito.when(mockMetaData.getURL()).thenReturn("jdbc:mysql://localhost:3306/test");
        dialect = DialectUtils.getDialect(mockDataSource);
        assertEquals(MySQL5InnoDBDialect.class.getName(), dialect);

        Mockito.when(mockMetaData.getURL()).thenReturn("jdbc:oracle:thin:@127.0.0.1:1521:XE");
        dialect = DialectUtils.getDialect(mockDataSource);
        assertEquals(Oracle10gDialect.class.getName(), dialect);

    }

}
