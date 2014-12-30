package com.snail.lilac;

/**
 * @author Andy
 * @since 2013-5-16
 */
@SuppressWarnings("serial")
public class RepositoryException extends RuntimeException {

    public RepositoryException(){
        super();
    }

    public RepositoryException(String message){
        super(message);
    }

    public RepositoryException(Throwable cause){
        super(cause);
    }

    public RepositoryException(String message, Throwable cause){
        super(message, cause);
    }
}
