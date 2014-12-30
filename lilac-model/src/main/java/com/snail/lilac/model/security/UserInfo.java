package com.snail.lilac.model.security;

import com.snail.lilac.model.BaseModel;

/**
 * @author Andy
 * @since 2013-4-26
 */
public class UserInfo extends BaseModel {

    private static final long serialVersionUID = 7700972394252108235L;
    private String            userName;
    private String            instanceDesc;
    private String            plainPassword;
    private String            password;
    private String            salt;

    /**
     * @return the userId
     */
    public String getUserId() {
        return this.getInstanceId();
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.setInstanceId(userId);
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
     * @return the plainPassword
     */
    public String getPlainPassword() {
        return plainPassword;
    }

    /**
     * @param plainPassword the plainPassword to set
     */
    public void setPlainPassword(String plainPassword) {
        this.plainPassword = plainPassword;
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
     * @return the salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt the salt to set
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * @return the instanceDesc
     */
    public String getInstanceDesc() {
        return instanceDesc;
    }

    /**
     * @param instanceDesc the instanceDesc to set
     */
    public void setInstanceDesc(String instanceDesc) {
        this.instanceDesc = instanceDesc;
    }

}
