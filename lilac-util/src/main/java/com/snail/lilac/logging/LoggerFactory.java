package com.snail.lilac.logging;

import java.lang.reflect.Constructor;

import com.snail.lilac.logging.nologging.NoLoggingImpl;
import com.snail.lilac.logging.slf4j.Slf4jImpl;

/**
 * @author Andy
 */
public final class LoggerFactory {

    private static Constructor<? extends Logger> logConstructor;

    static {
        tryImplementation(new Runnable() {

            public void run() {
                useSlf4jLogging();
            }
        });
        tryImplementation(new Runnable() {

            public void run() {
                useNoLogging();
            }
        });
    }

    private LoggerFactory(){
    }

    public static Logger getLogger(Class<?> clazz) {
        try {
            return logConstructor.newInstance(new Object[] { clazz });
        } catch (Throwable t) {
            throw new LogException("Error creating logger for logger " + clazz + ".  Cause: " + t, t);
        }
    }

    public static synchronized void useSlf4jLogging() {
         setImplementation(Slf4jImpl.class);
    }

    public static synchronized void useNoLogging() {
        setImplementation(NoLoggingImpl.class);
    }

    private static void tryImplementation(Runnable runnable) {
        if (logConstructor == null) {
            try {
                runnable.run();
            } catch (Throwable t) {
                // ignore
            }
        }
    }

    private static void setImplementation(Class<? extends Logger> implClass) {
        try {
            Constructor<? extends Logger> candidate = implClass.getConstructor(new Class[] { Class.class });
            Logger log = candidate.newInstance(new Object[] { Class.class});
            log.debug("Logging initialized using '" + implClass + "' adapter.");
            logConstructor = candidate;
        } catch (Throwable t) {
            throw new LogException("Error setting Log implementation.  Cause: " + t, t);
        }
    }

}
