// Created on 2015年4月3日
// $Id$

package com.snail.lilac.model.security;

import java.util.List;

import com.snail.lilac.model.BaseEntity;

/**
 * @author Andy
 */
public class Enterprise extends BaseEntity {

    /**
     * 
     */
    private static final long  serialVersionUID = -4259098586489606551L;

    private String             enterpriseId;
    private String             enterpriseName;
    private String             legalPerson;
    private List<Organization> organizations;

    /**
     * @return the enterpriseId
     */
    public String getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * @param enterpriseId the enterpriseId to set
     */
    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * @return the enterpriseName
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * @param enterpriseName the enterpriseName to set
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    /**
     * @return the legalPerson
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * @param legalPerson the legalPerson to set
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * @return the organizations
     */
    public List<Organization> getOrganizations() {
        return organizations;
    }

    /**
     * @param organizations the organizations to set
     */
    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

}
