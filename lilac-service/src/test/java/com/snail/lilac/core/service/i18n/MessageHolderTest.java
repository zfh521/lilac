package com.snail.lilac.core.service.i18n;

import java.util.Locale;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.snail.lilac.core.AbstractTransactionalTests;
import com.snail.lilac.core.id.UUIDHexGenerator;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;

import static org.junit.Assert.*;

/**
 * @author andy
 * @since 2013-5-23
 */
public class MessageHolderTest extends AbstractTransactionalTests {
    
    protected static final Logger   log = LoggerFactory.getLogger(MessageHolderTest.class);
    
    @Autowired
    UUIDHexGenerator uuidHexGenerator;
    
    @Test
    public void testGen() {
        while(true) {
            log.info("the uuid is:{}",uuidHexGenerator.generate());            
        }
    }
    
    /**
     * Test method for {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testGetMessageStringString() {
        assertEquals("user name", MessageHolder.getMessage("LBL_USERNAME", "user name"));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.String, java.util.Locale)}.
     */
    @Test
    public void testGetMessageStringStringLocale() {
        assertEquals("user name", MessageHolder.getMessage("LBL_USERNAME", "user name", Locale.ENGLISH));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.Object[], java.lang.String)}.
     */
    @Test
    public void testGetMessageStringObjectArrayString() {
        assertEquals("LBL_USERNAME should not be null", MessageHolder.getMessage("INVID_ARGUMENT",
                                                                                 new String[] { "LBL_USERNAME" },
                                                                                 "{0} should not be null"));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.Object[], java.lang.String, java.util.Locale)}
     * .
     */
    @Test
    public void testGetMessageStringObjectArrayStringLocale() {
        assertEquals("LBL_USERNAME should not be null", MessageHolder.getMessage("INVID_ARGUMENT",
                                                                                 new String[] { "LBL_USERNAME" },
                                                                                 "{0} should not be null",
                                                                                 Locale.ENGLISH));
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String)}.
     */
    @Test
    public void testGetMessageString() {
        assertEquals("LBL_USERNAME", MessageHolder.getMessage("LBL_USERNAME"));
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.util.Locale)}.
     */
    @Test
    public void testGetMessageStringLocale() {
        assertEquals("LBL_USERNAME", MessageHolder.getMessage("LBL_USERNAME", Locale.ENGLISH));
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.Object[])}.
     */
    @Test
    public void testGetMessageStringObjectArray() {
        assertEquals("INVID_ARGUMENT", MessageHolder.getMessage("INVID_ARGUMENT", new String[] { "LBL_USERNAME" }));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.MessageHolder#getMessage(java.lang.String, java.lang.Object[], java.util.Locale)}.
     */
    @Test
    public void testGetMessageStringObjectArrayLocale() {
        assertEquals("INVID_ARGUMENT",
                     MessageHolder.getMessage("INVID_ARGUMENT", new String[] { "LBL_USERNAME" }, Locale.ENGLISH));
    }

}
