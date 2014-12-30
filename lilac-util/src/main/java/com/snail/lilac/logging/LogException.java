package com.snail.lilac.logging;

/**
 * @author Andy
 */
public class LogException extends RuntimeException {

    private static final long serialVersionUID = 7385086466866627571L;

    public LogException(){
        super();
    }

    public LogException(String message){
        super(message);
    }

    public LogException(String message, Throwable cause){
        super(message, cause);
    }

    public LogException(Throwable cause){
        super(cause);
    }

}
