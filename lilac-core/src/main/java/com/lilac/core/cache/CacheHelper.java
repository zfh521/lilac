/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.core.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.util.Assert;

import com.lilac.core.util.BeanUtils;

/**
 * @author Jimmy Leung
 * @since 2013-5-22
 */
public final class CacheHelper {

    protected static EhCacheCacheManager ehCacheManager;

    /**
     * @param ehCacheManager the ehCacheManager to set
     */
    public static void setEhCacheManager(EhCacheCacheManager ehCacheManager) {
        CacheHelper.ehCacheManager = ehCacheManager;
    }

    protected Cache getDefaultCache() {
        return getCache(CacheNames.DEFAULT_CACHE);
    }

    public static Cache getCache(String name) {
        return ehCacheManager.getCache(name);
    }

    /**
     * @param key
     * @param clazz
     * @return
     */
    public static <T> T get(Object key, Class<T> clazz) {

        Assert.notNull(key, "[Assertion failed] - the key argument must be not null");
        Assert.notNull(clazz, "[Assertion failed] - the clazz argument must be not null");

        T entity = null;
        ValueWrapper valueWrapper = getCache(clazz.getName()).get(key);
        if (valueWrapper != null) {
            entity = BeanUtils.getObject(valueWrapper.get(), clazz);
        }
        return entity;
    }

    /**
     * @param key
     * @param value
     * @param clazz
     */
    public static void put(Object key, Object value, Class<?> clazz) {
        getCache(clazz.getName()).put(key, value);
    }

    /**
     * @param key
     * @param clazz
     */
    public static void remove(Object key, Class<?> clazz) {
        getCache(clazz.getName()).evict(key);
    }

    /**
     * @param clazz
     */
    public static void clear(Class<?> clazz) {
        getCache(clazz.getName()).clear();
    }

    public <T> String buildDefaultCacheKey(Object id, Class<T> clazz) {
        return clazz.getName() + "_" + id;
    }

}
