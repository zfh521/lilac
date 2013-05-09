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

package com.lilac.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Jimmy Leung
 * @since 2013-5-9
 */
public class CollectionUtils extends org.springframework.util.CollectionUtils {

    /**
     * Null-safe check if the specified collection is not empty.
     * <p>
     * Null returns false.
     * 
     * @param coll the collection to check, may be null
     * @return true if non-null and non-empty
     * @since Commons Collections 3.2
     */
    public static boolean isNotEmpty(Collection coll) {
        return !CollectionUtils.isEmpty(coll);
    }

    /**
     * Adds all elements in the iteration to the given collection.
     * 
     * @param collection the collection to add to, must not be null
     * @param iterator the iterator of elements to add, must not be null
     * @throws NullPointerException if the collection or iterator is null
     */
    public static void addAll(Collection collection, Iterator iterator) {
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
    }

    /**
     * Adds all elements in the enumeration to the given collection.
     * 
     * @param collection the collection to add to, must not be null
     * @param enumeration the enumeration of elements to add, must not be null
     * @throws NullPointerException if the collection or enumeration is null
     */
    public static void addAll(Collection collection, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            collection.add(enumeration.nextElement());
        }
    }

    /**
     * Adds all elements in the array to the given collection.
     * 
     * @param collection the collection to add to, must not be null
     * @param elements the array of elements to add, must not be null
     * @throws NullPointerException if the collection or array is null
     */
    public static void addAll(Collection collection, Object[] elements) {
        for (int i = 0, size = elements.length; i < size; i++) {
            collection.add(elements[i]);
        }
    }

    /**
     * Null-safe check if the specified collection is empty.
     * <p>
     * Null returns true.
     * 
     * @param coll the collection to check, may be null
     * @return true if empty or null
     * @since Commons Collections 3.2
     */
    public static boolean isEmpty(Collection coll) {
        return (coll == null || coll.isEmpty());
    }

    /**
     * 提取集合中的对象的属性(通过Getter函数), 组合成Map.
     * 
     * @param collection 来源集合.
     * @param keyPropertyName 要提取为Map中的Key值的属性名.
     * @param valuePropertyName 要提取为Map中的Value值的属性名.
     */
    public static Map extractToMap(Collection collection, String keyPropertyName, String valuePropertyName) {
        Map map = new HashMap();

        try {
            for (Object obj : collection) {
                map.put(PropertyUtils.getProperty(obj, keyPropertyName),
                        PropertyUtils.getProperty(obj, valuePropertyName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }

    /**
     * 提取集合中的对象的属性(通过Getter函数), 组合成List.
     * 
     * @param collection 来源集合.
     * @param propertyName 要提取的属性名.
     * @return List
     */
    public static <T> List<T> extractToList(Collection collection, String propertyName) {

        return extractToList(collection, propertyName, false);
    }

    /**
     * 提取集合中的对象的属性(通过Getter函数), 组合成List.
     * 
     * @param collection 来源集合.
     * @param propertyName 要提取的属性名.
     * @param ignoreEmptyValue 是否过滤null值和""值
     * @return List
     */
    public static <T> List<T> extractToList(Collection collection, String propertyName, boolean ignoreEmptyValue) {
        if (collection == null) {
            return null;
        }
        List list = new ArrayList();

        try {
            for (Object obj : collection) {
                T value = (T) PropertyUtils.getProperty(obj, propertyName);
                if (ignoreEmptyValue && value == null || value.toString().equals("")) {
                    continue;
                }
                list.add(PropertyUtils.getProperty(obj, propertyName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    /**
     * 提取集合中的对象的属性(通过Getter函数), 组合成由分割符分隔的字符串.
     * 
     * @param collection 来源集合.
     * @param propertyName 要提取的属性名.
     * @param separator 分隔符.
     */
    public static String extractToString(Collection collection, String propertyName, String separator) {
        List list = extractToList(collection, propertyName);
        return StringUtils.join(list, separator);
    }

}
