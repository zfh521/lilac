package com.snail.lilac.core.util;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author Andy
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
    public static boolean isNotEmpty(Collection<?> coll) {
        return !CollectionUtils.isEmpty(coll);
    }

    /**
     * Adds all elements in the iteration to the given collection.
     * 
     * @param collection the collection to add to, must not be null
     * @param iterator the iterator of elements to add, must not be null
     * @throws NullPointerException if the collection or iterator is null
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
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
    @SuppressWarnings({ "rawtypes", "unchecked" })
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
    @SuppressWarnings({ "rawtypes", "unchecked" })
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
    @SuppressWarnings({ "rawtypes" })
    public static boolean isEmpty(Collection coll) {
        return (coll == null || coll.isEmpty());
    }
}
