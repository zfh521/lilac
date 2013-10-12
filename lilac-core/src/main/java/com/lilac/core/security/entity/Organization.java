package com.lilac.core.security.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.lilac.core.entity.BaseEntity;

/**
 * @author andy
 * @since 2013-5-7
 */
@Entity
public class Organization extends BaseEntity {

    /**
     * 
     */
    private static final long  serialVersionUID = 2142164655550206359L;
    private String             organizationId;
    private String             organizationName;
    private String             dateFormat;
    private String             organizationCode;
    private String             parentCode;
    @ManyToOne
    private Organization       parentOrganization;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "parentOrganization")
    private List<Organization> childOrganization;
    @OneToMany
    private List<UserInfo>     users;

    /**
     * @return the parentCode
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * @param parentCode the parentCode to set
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * @return the organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * @param organizationId the organizationId to set
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * @return the dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * @param dateFormat the dateFormat to set
     */
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * @return the organizationCode
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * @param organizationCode the organizationCode to set
     */
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    /**
     * @return the parentOrganization
     */
    public Organization getParentOrganization() {
        return parentOrganization;
    }

    /**
     * @param parentOrganization the parentOrganization to set
     */
    public void setParentOrganization(Organization parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    /**
     * @return the childOrganization
     */
    public List<Organization> getChildOrganization() {
        return childOrganization;
    }

    /**
     * @param childOrganization the childOrganization to set
     */
    public void setChildOrganization(List<Organization> childOrganization) {
        this.childOrganization = childOrganization;
    }

    /**
     * @return the organizationName
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * @param organizationName the organizationName to set
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * @return the users
     */
    public List<UserInfo> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(List<UserInfo> users) {
        this.users = users;
    }

}
