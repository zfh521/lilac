package com.snail.lilac.service.cache;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.util.Assert;

import com.snail.lilac.core.util.BeanUtils;
import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * @author Andy
 * @since 2013-5-22
 */
public final class CacheHolder implements InitializingBean {

    private static final Logger        log = LoggerFactory.getLogger(CacheHolder.class);
    protected static EhCacheCacheManager ehCacheManager;

    /**
     * @param ehCacheManager the ehCacheManager to set
     */
    public void setEhCacheManager(EhCacheCacheManager ehCacheManager) {
        Assert.isNull(CacheHolder.ehCacheManager, "ehCacheManager should be null");
        CacheHolder.ehCacheManager = ehCacheManager;
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

    /*
     * (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(ehCacheManager, "ehCacheManager should not be null");
        log.info("ehCacheManager has registered,CacheHolder has been initialized successfully");
    }

}
