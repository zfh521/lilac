package com.lilac.web.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilac.web.controller.AbstractController;

/**
 * @author andy
 * @since 2013-5-6
 */
@Controller
@RequestMapping(value = "/")
public class IndexController extends AbstractController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
