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

package com.lilac.core.i18n;

import org.springframework.context.support.MessageSourceAccessor;

/**
 * @author Jimmy Leung
 * @since 2013-5-7
 */
public final class MessageHelper {

    private static MessageSourceAccessor messageSourceAccessor;

    private MessageHelper(){
    }

    /**
     * @param messageSourceAccessor the messageSourceAccessor to set
     */
    public static void setMessageSourceAccessor(MessageSourceAccessor messageSourceAccessor) {
        MessageHelper.messageSourceAccessor = messageSourceAccessor;
    }

    /**
     * @param code
     * @return
     */
    public static String getMessage(String code) {
        return messageSourceAccessor.getMessage(code);
    }

}
