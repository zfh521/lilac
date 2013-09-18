/*
 * Copyright 2013 Jimmy Leung
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lilac.web.sys.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilac.core.sys.entity.ObjectType;
import com.lilac.core.sys.service.ObjectTypeService;
import com.lilac.web.controller.SysController;

/**
 * @author Jimmy Leung
 * @since 2013-7-6
 */
@Controller
@RequestMapping(value = "/sys/objecttypes")
public class ObjectTypeController extends SysController {

    @Autowired
    private ObjectTypeService objectTypeService;

    @RequestMapping(method = RequestMethod.GET, value = "/new")
    public String objectType(@ModelAttribute ObjectType objectType) {
        return VIEW_PREFIX + "objecttype/objecttype";
    }

    @RequestMapping(method = RequestMethod.GET, value = "")
    public String qryObjectTypes(@ModelAttribute ObjectType objectType) {
        return VIEW_PREFIX + "objecttype/objecttypes";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public String createObjectType(@Valid ObjectType objectType, BindingResult result) {
        log.debug("createObjectType", objectType);
        if (result.hasErrors()) {
            return VIEW_PREFIX + "objecttype/objecttype";
        } else {
            objectTypeService.save(objectType);
        }
        return VIEW_PREFIX + "objecttype/objecttypes";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String getObjectType(@PathVariable String id, @ModelAttribute ObjectType objectType) {
        return VIEW_PREFIX + "objecttype/objecttype";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public String updateObjectType(@PathVariable String id, @ModelAttribute ObjectType objectType) {
        return VIEW_PREFIX + "objecttype/objecttype";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public String removeObjectType(@PathVariable String id, Model model) {
        return VIEW_PREFIX + "objecttype/objecttype";
    }

}
