package com.snail.lilac.test.service.i18n;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.service.i18n.I18NService;
import com.snail.lilac.test.AbstractTransactionalTests;

/**
 * @author Andy
 * @since 2013-5-23
 */
public class I18NServiceTest extends AbstractTransactionalTests {

    protected static final Logger log = LoggerFactory.getLogger(I18NServiceTest.class);

    @Autowired
    private I18NService           i18NService;

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.String)}.
     */
    @Test
    public void testGetMessageStringString() {
        assertEquals("user name", i18NService.getMessage("LBL_USERNAME", "user name"));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.String, java.util.Locale)}
     * .
     */
    @Test
    public void testGetMessageStringStringLocale() {
        assertEquals("user name",
                     i18NService.getMessage("LBL_USERNAME", "user name", Locale.ENGLISH));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.Object[], java.lang.String)}
     * .
     */
    @Test
    public void testGetMessageStringObjectArrayString() {
        assertEquals("LBL_USERNAME should not be null",
                     i18NService.getMessage("INVID_ARGUMENT", new String[] { "LBL_USERNAME" },
                                            "{0} should not be null"));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.Object[], java.lang.String, java.util.Locale)}
     * .
     */
    @Test
    public void testGetMessageStringObjectArrayStringLocale() {
        assertEquals("LBL_USERNAME should not be null",
                     i18NService.getMessage("INVID_ARGUMENT", new String[] { "LBL_USERNAME" },
                                            "{0} should not be null", Locale.ENGLISH));
    }

    /**
     * Test method for {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String)}.
     */
    @Test
    public void testGetMessageString() {
        assertEquals("LBL_USERNAME", i18NService.getMessage("LBL_USERNAME"));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.util.Locale)}.
     */
    @Test
    public void testGetMessageStringLocale() {
        assertEquals("LBL_USERNAME", i18NService.getMessage("LBL_USERNAME", Locale.ENGLISH));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.Object[])}.
     */
    @Test
    public void testGetMessageStringObjectArray() {
        assertEquals("INVID_ARGUMENT",
                     i18NService.getMessage("INVID_ARGUMENT", new String[] { "LBL_USERNAME" }));
    }

    /**
     * Test method for
     * {@link com.snail.lilac.core.service.i18n.i18NHelper#getMessage(java.lang.String, java.lang.Object[], java.util.Locale)}
     * .
     */
    @Test
    public void testGetMessageStringObjectArrayLocale() {
        assertEquals("INVID_ARGUMENT", i18NService.getMessage("INVID_ARGUMENT",
                                                              new String[] { "LBL_USERNAME" },
                                                              Locale.ENGLISH));
    }

}
