package com.snail.lilac.web.controller.security;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snail.lilac.web.controller.AbstractController;

/**
 * @author andy
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
