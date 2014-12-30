// Created on 2015年4月1日
// $Id$

package com.snail.lilac.core.json;

import java.io.Serializable;

/**
 * @author Andy
 */
public class ResponseJSON implements Serializable {

    private static final long serialVersionUID = 7140527918901241973L;
    private boolean           success;
    private Serializable      msg;

    /**
     * 
     */
    public ResponseJSON(){
        super();
    }

    /**
     * @param success
     * @param msg
     */
    public ResponseJSON(boolean success, Serializable msg){
        super();
        this.success = success;
        this.msg = msg;
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return the msg
     */
    public Serializable getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(Serializable msg) {
        this.msg = msg;
    }

}
