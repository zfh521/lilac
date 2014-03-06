package com.snail.lilac.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * @author andy
 * @since 2013-5-6
 */
public abstract class AbstractController {

    protected final Logger     log       = LoggerFactory.getLogger(getClass());

    public final static String PAGE_SIZE = "50";

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
