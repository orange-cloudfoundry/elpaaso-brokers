/**
 * Copyright (C) 2015 Orange
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.orange.clara.cloud.cf.servicebroker.log.domain;

import org.junit.Test;

/**
 * Created by sbortolussi on 20/04/2015.
 */
public class SyslogDrainUrlTest {

    @Test(expected = IllegalArgumentException.class)
    public void syslog_drain_url_should_not_be_empty() {
        new SyslogDrainUrl("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void syslog_drain_url_should_start_with_syslog_colon_slash_slash() {
        new SyslogDrainUrl("syslog_drain_url");
    }

}