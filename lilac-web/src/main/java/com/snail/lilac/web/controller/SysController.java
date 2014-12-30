package com.snail.lilac.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andy
 * @since 2013-7-6
 */
@Controller
@RequestMapping(value = "/sys")
public abstract class SysController extends AbstractController {

    protected String VIEW_PREFIX = "sys/";
}
