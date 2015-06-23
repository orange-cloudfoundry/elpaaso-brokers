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
package com.orange.clara.cloud.cf.servicebroker.dbaas.domain;

/**
 * Created by sbortolussi on 14/04/2015.
 */

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DbaasServiceInstance {

    @Id
    private String id;

    private String databaseUid;

    @Embedded
    private DBaasUser owner;

    protected DbaasServiceInstance() {
    }

    public DbaasServiceInstance(String id, String databaseUid) {
        this.databaseUid = databaseUid;
        this.id = id;
    }

    public String getDatabaseUid() {
        return databaseUid;
    }

    public String getId() {
        return id;
    }

    public DbaasServiceInstance withOwner(DBaasUser owner) {
        this.owner = owner;
        return this;
    }

    public DBaasUser getOwner() {
        return owner;
    }
}
