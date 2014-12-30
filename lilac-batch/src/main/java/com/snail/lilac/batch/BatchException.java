package com.snail.lilac.batch;

import org.springframework.remoting.RemoteAccessException;

/**
 * @author Andy
 */
public class BatchException extends RemoteAccessException {

    /**
     * 
     */
    private static final long serialVersionUID = 2552486244248963267L;

    /**
     * Constructor for BatchException.
     * 
     * @param msg the detail message
     */
    public BatchException(String msg){
        super(msg);
    }

    /**
     * Constructor for BatchException.
     * 
     * @param msg the detail message
     * @param cause the root cause
     */
    public BatchException(String msg, Throwable cause){
        super(msg, cause);
    }

}
