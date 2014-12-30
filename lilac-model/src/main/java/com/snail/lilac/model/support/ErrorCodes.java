package com.snail.lilac.model.support;

/**
 * @author Andy
 * @since 2013-5-9
 */
public enum ErrorCodes {

    DATABASE("", "", "");

    private final String code;
    private final String description;
    private final String solution;

    /**
     * @param code
     * @param description
     * @param solution
     */
    private ErrorCodes(String code, String description, String solution){
        this.code = code;
        this.description = description;
        this.solution = solution;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the solution
     */
    public String getSolution() {
        return solution;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return code + " : " + description;
    }

}
