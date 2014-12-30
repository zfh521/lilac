package com.snail.lilac.model.security;

import java.io.Serializable;

/**
 * @author Andy
 * @since 2013-5-15
 */
public class ShiroUser implements Serializable {

    private static final long serialVersionUID = -3801134735205895939L;

    private String            userId;

    private String            userName;

    private String            password;

    private String            host;

    private String            orgId;

    private boolean           rememberMe;

    private int               rememberMeValue;

    /**
     * 
     */
    public ShiroUser(){
        super();
    }

    /**
     * @param userId
     */
    public ShiroUser(String userId){
        super();
        this.userId = userId;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }

    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * @return the orgId
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId the orgId to set
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return the rememberMe
     */
    public boolean isRememberMe() {
        return rememberMe;
    }

    /**
     * @param rememberMe the rememberMe to set
     */
    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    /**
     * @return the rememberMeValue
     */
    public int getRememberMeValue() {
        return rememberMeValue;
    }

    /**
     * @param rememberMeValue the rememberMeValue to set
     */
    public void setRememberMeValue(int rememberMeValue) {
        this.rememberMeValue = rememberMeValue;
    }

}
