package com.snail.lilac.model.support;

/**
 * @author Andy
 * @since 2013-4-26
 */
public enum EntityStatus {
    DELETED("-1", "deleted"), OBSOLETED("0", "obsoleted"), DISABLED("1", "disabled"), ENABLED("2", "enabled");

    private String code;
    private String description;

    /**
     * @param code
     * @param description
     */
    private EntityStatus(String code, String description){
        this.code = code;
        this.description = description;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return this.code;
    }

}
