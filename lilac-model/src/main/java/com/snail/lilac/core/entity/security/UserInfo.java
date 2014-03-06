package com.snail.lilac.core.entity.security;

import com.snail.lilac.core.entity.BaseEntity;
import com.snail.lilac.core.entity.i18n.annotation.I18NMessage;

/**
 * @author andy
 * @since 2013-4-26
 */
public class UserInfo extends BaseEntity {

    private static final long serialVersionUID = 7700972394252108235L;
    @I18NMessage(code = "LBL_USER_NAME", defaultMsg = "用户名")
    private String            userName;
    private String            instanceDesc;
    private String            plainPassword;
    private String            password;
    private String            salt;

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
