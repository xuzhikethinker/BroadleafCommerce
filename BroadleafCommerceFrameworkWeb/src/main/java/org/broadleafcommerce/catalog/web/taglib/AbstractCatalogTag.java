/*
 * Copyright 2008-2009 the original author or authors.
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
package org.broadleafcommerce.catalog.web.taglib;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.broadleafcommerce.catalog.service.CatalogService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public abstract class AbstractCatalogTag extends SimpleTagSupport {
    private static final long serialVersionUID = 1L;

    //TODO scc: test if @Resource will somehow work with this reference
    protected CatalogService catalogService;

    protected CatalogService getCatalogService() {
        if (catalogService == null) {
            PageContext pageContext = (PageContext)getJspContext();
            WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext());
            catalogService = (CatalogService) applicationContext.getBean("blCatalogService");
        }
        return catalogService;
    }

    public void setCatalogService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public static String toVariableName(String key) {
        return key.replace('.', '_');
    }
}
