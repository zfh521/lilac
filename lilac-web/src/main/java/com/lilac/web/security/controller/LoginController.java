/*
 * Copyright 2013 Jimmy Leung
 */

package com.lilac.web.security.controller;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilac.web.controller.AbstractController;

/**
 * @author Jimmy Leung
 * @since 2013-5-27
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends AbstractController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(@ModelAttribute UsernamePasswordToken usernamePasswordToken) {
        return "security/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String fail(@ModelAttribute UsernamePasswordToken usernamePasswordToken) {
        return "security/login";
    }

}
