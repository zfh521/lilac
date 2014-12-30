package com.snail.lilac.batch.resources;

import org.springframework.core.io.Resource;

/**
 * @author Andy
 */
public class ImageResource {

    private Resource[] resources;

    /**
     * @return the resources
     */
    public Resource[] getResources() {
        return resources;
    }

    /**
     * @param resources the resources to set
     */
    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

}
