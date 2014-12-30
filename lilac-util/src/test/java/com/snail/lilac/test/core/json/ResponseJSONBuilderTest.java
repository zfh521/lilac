// Created on 2015年4月1日
// $Id$

package com.snail.lilac.test.core.json;

import org.junit.Test;

import com.snail.lilac.core.json.ResponseJSONBuilder;
import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * @author Andy
 */
public class ResponseJSONBuilderTest {

    private static final Logger log = LoggerFactory.getLogger(ResponseJSONBuilderTest.class);

    /**
     * Test method for {@link com.snail.lilac.core.json.ResponseJSONBuilder#testBuildSuccessMsg(java.io.Serializable)}.
     */
    @Test
    public void testBuildSuccessMsg() {
        String json = ResponseJSONBuilder.buildSuccessMsg("Test JSON");
        log.info(json);
    }
}
