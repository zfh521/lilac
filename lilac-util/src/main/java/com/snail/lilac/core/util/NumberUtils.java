package com.snail.lilac.core.util;

/**
 * @author andy
 */
public class NumberUtils extends org.apache.commons.lang3.math.NumberUtils {

    /**
     * Custom algorithm used to generate an int from a series of bytes.
     * <p/>
     * NOTE : this is different than interpreting the incoming bytes as an int value!
     * 
     * @param bytes The bytes to use in generating the int.
     * @return The generated int.
     */
    public static int toInt(byte[] bytes) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = (result << 8) - Byte.MIN_VALUE + (int) bytes[i];
        }
        return result;
    }

}
