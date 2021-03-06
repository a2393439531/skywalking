/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.agent.core.jvm.memorypool;

import java.lang.management.MemoryPoolMXBean;
import java.util.List;

/**
 * @author wusheng
 */
public class CMSCollectorModule extends MemoryPoolModule {
    public CMSCollectorModule(List<MemoryPoolMXBean> beans) {
        super(beans);
    }

    @Override protected String getPermName() {
        return "CMS Perm Gen";
    }

    @Override protected String getCodeCacheName() {
        return "Code Cache";
    }

    @Override protected String getEdenName() {
        return "Par Eden Space";
    }

    @Override protected String getOldName() {
        return "CMS Old Gen";
    }

    @Override protected String getSurvivorName() {
        return "Par Survivor Space";
    }

    @Override protected String getMetaspaceName() {
        return "Metaspace";
    }
}
