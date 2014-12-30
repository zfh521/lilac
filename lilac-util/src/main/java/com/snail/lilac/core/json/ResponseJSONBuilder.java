// Created on 2015年4月1日
// $Id$

package com.snail.lilac.core.json;

import java.io.Serializable;

import com.snail.lilac.core.util.ExceptionUtils;

/**
 * @author Andy
 */
public class ResponseJSONBuilder {

    public static String buildErrorMsg(Serializable msg) {
        return JSONUtils.toJson(buildErrorResponse(msg));
    }

    public static ResponseJSON buildErrorResponse(Serializable msg) {
        return buildResponse(false, msg);
    }

    public static String buildErrorMsg(Throwable e) {
        return JSONUtils.toJson(buildErrorResponse(e));
    }

    public static ResponseJSON buildErrorResponse(Throwable e) {
        return buildResponse(false, ExceptionUtils.getStackTrace(e));
    }

    public static ResponseJSON buildResponse(boolean success, Serializable msg) {
        return new ResponseJSON(success, msg);
    }

    public static String buildResponseJSON(boolean success, Serializable msg) {
        return JSONUtils.toJson(buildResponse(success, msg));
    }

    public static String buildSuccessMsg(Serializable msg) {
        return JSONUtils.toJson(buildSuccessResponse(msg));
    }

    public static ResponseJSON buildSuccessResponse(Serializable msg) {
        return buildResponse(true, msg);
    }

}
