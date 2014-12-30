package com.snail.lilac.web.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snail.lilac.model.security.UserInfo;
import com.snail.lilac.web.controller.SysController;

/**
 * @author Andy
 * @since 2013-7-6
 */
@Controller
@RequestMapping(value = "/sys/objecttypes")
public class ObjectTypeController extends SysController {/*
                                                          * @Autowired private ObjectTypeService objectTypeService;
                                                          * @RequestMapping(method = RequestMethod.GET, value = "/new")
                                                          * public String objectType(@ModelAttribute ObjectType
                                                          * objectType) { return VIEW_PREFIX + "objecttype/objecttype";
                                                          * }
                                                          * @RequestMapping(method = RequestMethod.GET, value = "")
                                                          * public String qryObjectTypes(@RequestParam(value = "page",
                                                          * defaultValue = "0") int page,
                                                          * @RequestParam(value = "size", defaultValue = PAGE_SIZE) int
                                                          * size, Model model, ServletRequest request) { Map<String,
                                                          * Object> searchParams =
                                                          * WebUtils.getParametersStartingWith(request, ""); Pageable
                                                          * pageRequest = new PageRequest(page, size); Page<ObjectType>
                                                          * objectTypePage = objectTypeService.findAll(searchParams,
                                                          * pageRequest); model.addAttribute("objectTypePage",
                                                          * objectTypePage); model.addAttribute("searchParams",
                                                          * WebUtils.encodeParameterStringWithPrefix(searchParams,
                                                          * "q_")); return VIEW_PREFIX + "objecttype/objecttypes"; }
                                                          * @RequestMapping(method = RequestMethod.POST, value = "/")
                                                          * public String createObjectType(@Valid ObjectType objectType,
                                                          * BindingResult result) { log.debug("createObjectType",
                                                          * objectType); if (result.hasErrors()) { return VIEW_PREFIX +
                                                          * "objecttype/objecttype"; } else { UserInfo userInfo =
                                                          * UserHolder.getCurrentLoginUser();
                                                          * objectType.setCreatedUser(userInfo);
                                                          * objectType.setLastUpdatedUser(userInfo);
                                                          * objectTypeService.save(objectType); } return VIEW_PREFIX +
                                                          * "objecttype/objecttypes"; }
                                                          * @RequestMapping(method = RequestMethod.GET, value = "/{id}")
                                                          * public @ResponseBody ObjectType getObjectType(@PathVariable
                                                          * String id, @ModelAttribute ObjectType objectType) {
                                                          * objectType = objectTypeService.findOne(id); return
                                                          * objectType; }
                                                          * @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
                                                          * public String updateObjectType(@PathVariable String id,
                                                          * @ModelAttribute ObjectType objectType) { return VIEW_PREFIX
                                                          * + "objecttype/objecttype"; }
                                                          * @RequestMapping(method = RequestMethod.DELETE, value =
                                                          * "/{id}") public String removeObjectType(@PathVariable String
                                                          * id, Model model) { return VIEW_PREFIX +
                                                          * "objecttype/objecttype"; }
                                                          */

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public UserInfo doSuccessfulLogin() {
        return new UserInfo();
    }

}
