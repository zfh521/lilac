package com.snail.lilac.core.util;

/**
 * @author Andy
 * @since 2013-5-14
 */
public final class StdOutUtils {

    public void error(String s, Throwable e) {
        System.err.println(s);
        e.printStackTrace(System.err);
    }

    public static void error(String s) {
        System.err.println(s);
    }

    public static void debug(String s) {
        System.out.println(s);
    }

    public static void trace(String s) {
        System.out.println(s);
    }

    public static void info(String s) {
        System.out.println(s);
    }

    public static void warn(String s) {
        System.out.println(s);
    }
}
