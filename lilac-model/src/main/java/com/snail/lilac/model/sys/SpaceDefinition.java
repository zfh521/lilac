package com.snail.lilac.model.sys;

import com.snail.lilac.model.BaseModel;
import com.snail.lilac.model.security.Organization;

/**
 * @author Andy
 * @since 2013-5-7
 */
public class SpaceDefinition extends BaseModel {

    /**
     * 
     */
    private static final long serialVersionUID = -173660791128587988L;
    private String            spaceId;
    private Organization      organization;
    private String            object;
    private String            namedSpace;
    private boolean           controlFlag;

    /**
     * @return the spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    /**
     * @param spaceId the spaceId to set
     */
    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    /**
     * @return the controlFlag
     */
    public boolean isControlFlag() {
        return controlFlag;
    }

    /**
     * @param controlFlag the controlFlag to set
     */
    public void setControlFlag(boolean controlFlag) {
        this.controlFlag = controlFlag;
    }

    /**
     * @return the organization
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * @return the object
     */
    public String getObject() {
        return object;
    }

    /**
     * @param object the object to set
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * @return the namedSpace
     */
    public String getNamedSpace() {
        return namedSpace;
    }

    /**
     * @param namedSpace the namedSpace to set
     */
    public void setNamedSpace(String namedSpace) {
        this.namedSpace = namedSpace;
    }

}
