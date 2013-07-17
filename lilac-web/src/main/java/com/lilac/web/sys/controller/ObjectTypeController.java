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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lilac.core.sys.entity.ObjectType;
import com.lilac.web.controller.SysController;

/**
 * @author Jimmy Leung
 * @since 2013-7-6
 */
@Controller
public class ObjectTypeController extends SysController {

    @RequestMapping(method = RequestMethod.POST, value = "/objectType")
    public String addObjectType(@ModelAttribute ObjectType objectType) {
        return "";
    }

    @RequestMapping(method = RequestMethod.GET, value = "objectType")
    public String index() {
        return VIEW_PREFIX + "objectType";
    }
}
