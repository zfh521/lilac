package com.snail.lilac.logging.slf4j;

/**
 * Andy
 */
public class Slf4jImpl implements com.snail.lilac.logging.Logger {

    private org.slf4j.Logger log;

    public Slf4jImpl(Class<?> clazz){
        log = org.slf4j.LoggerFactory.getLogger(clazz);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isTraceEnabled()
     */
    @Override
    public boolean isTraceEnabled() {
        return log.isTraceEnabled();
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String)
     */
    @Override
    public void trace(String msg) {
        log.trace(msg);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String, java.lang.Object[])
     */
    @Override
    public void trace(String format, Object... arguments) {
        log.trace(format, arguments);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#trace(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void trace(String msg, Throwable t) {
        log.trace(msg, t);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isDebugEnabled()
     */
    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String)
     */
    @Override
    public void debug(String msg) {
        log.debug(msg);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String, java.lang.Object[])
     */
    @Override
    public void debug(String format, Object... arguments) {
        log.debug(format, arguments);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#debug(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void debug(String msg, Throwable t) {
        log.debug(msg, t);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isInfoEnabled()
     */
    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String)
     */
    @Override
    public void info(String msg) {
        log.info(msg);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String, java.lang.Object[])
     */
    @Override
    public void info(String format, Object... arguments) {
        log.info(format, arguments);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#info(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void info(String msg, Throwable t) {
        log.info(msg, t);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isWarnEnabled()
     */
    @Override
    public boolean isWarnEnabled() {
        return log.isWarnEnabled();
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String)
     */
    @Override
    public void warn(String msg) {
        log.warn(msg);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String, java.lang.Object[])
     */
    @Override
    public void warn(String format, Object... arguments) {
        log.warn(format, arguments);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#warn(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void warn(String msg, Throwable t) {
        log.warn(msg, t);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#isErrorEnabled()
     */
    @Override
    public boolean isErrorEnabled() {
        return log.isErrorEnabled();
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String)
     */
    @Override
    public void error(String msg) {
        log.error(msg);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String, java.lang.Object[])
     */
    @Override
    public void error(String format, Object... arguments) {
        log.error(format, arguments);
    }

    /*
     * (non-Javadoc)
     * @see com.snail.lilac.core.logging.Log#error(java.lang.String, java.lang.Throwable)
     */
    @Override
    public void error(String msg, Throwable t) {
        log.error(msg, t);
    }

}
