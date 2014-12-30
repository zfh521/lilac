package com.snail.lilac.logging.nologging;

import com.snail.lilac.logging.Logger;

/**
 * @author Andy
 */
public class NoLoggingImpl implements Logger {

    public NoLoggingImpl(Class<?> clazz){
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isTraceEnabled()
     */
    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String)
     */
    @Override
    public void trace(String msg) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String, java.lang.Object[])
     */
    @Override
    public void trace(String format, Object... arguments) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void trace(String msg, Throwable t) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isDebugEnabled()
     */
    @Override
    public boolean isDebugEnabled() {

        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String)
     */
    @Override
    public void debug(String msg) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String, java.lang.Object[])
     */
    @Override
    public void debug(String format, Object... arguments) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void debug(String msg, Throwable t) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isInfoEnabled()
     */
    @Override
    public boolean isInfoEnabled() {

        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String)
     */
    @Override
    public void info(String msg) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String, java.lang.Object[])
     */
    @Override
    public void info(String format, Object... arguments) {

    }
    
    /* (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void info(String msg, Throwable t) {
    }
    
    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isWarnEnabled()
     */
    @Override
    public boolean isWarnEnabled() {

        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String)
     */
    @Override
    public void warn(String msg) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String, java.lang.Object[])
     */
    @Override
    public void warn(String format, Object... arguments) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void warn(String msg, Throwable t) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isErrorEnabled()
     */
    @Override
    public boolean isErrorEnabled() {

        return false;
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String)
     */
    @Override
    public void error(String msg) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String, java.lang.Object[])
     */
    @Override
    public void error(String format, Object... arguments) {

    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void error(String msg, Throwable t) {

    }
}
