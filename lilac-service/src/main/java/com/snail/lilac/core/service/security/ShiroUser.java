package com.snail.lilac.core.service.security;

import java.io.Serializable;

import com.snail.lilac.core.entity.security.UserInfo;


/**
 * @author andy
 * @since 2013-5-15
 */
public class ShiroUser implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -3801134735205895939L;
    public UserInfo           user;
    public String             url;

    /**
     * @param user
     */
    public ShiroUser(UserInfo user){
        super();
        this.user = user;
    }

    /**
     * @return the user
     */
    public UserInfo getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserInfo user) {
        this.user = user;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
