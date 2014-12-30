package com.snail.lilac.web.controller.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snail.lilac.core.json.JSONUtils;
import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;
import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.service.security.UserHolder;
import com.snail.lilac.service.security.shiro.realm.UserToken;
import com.snail.lilac.web.controller.AbstractController;
import com.snail.lilac.web.util.WebUtils;

/**
 * @author Andy
 * @since 2013-5-27
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String doInit(Model model) {
        List<Map<String, String>> orgs = new ArrayList<Map<String, String>>();
        Map<String, String> org = new HashMap<String, String>();
        org.put("id", "org");
        org.put("name", "orgName");
        orgs.add(org);
        org = new HashMap<String, String>();
        org.put("id", "org1");
        org.put("name", "orgName1");
        orgs.add(org);

        Map<String, Object> reponseData = new HashMap<>();
        reponseData.put("optionDataOrg", orgs);
        String reponseStr = JSONUtils.toJson(reponseData);

        model.addAttribute(WebUtils.PAGE_DATA, reponseStr);
        return "security/login";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request, @ModelAttribute UserToken userToken) {
        String msg = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
        UserInfo userInfo = UserHolder.getCurrentLoginUser();
        if (userInfo != null) {
            return "index";
        }
        return "security/login";
    }
}
