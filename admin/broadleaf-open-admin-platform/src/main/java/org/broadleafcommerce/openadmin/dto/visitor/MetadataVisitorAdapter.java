/*
 * Copyright 2008-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.dto.visitor;

import org.broadleafcommerce.openadmin.dto.AdornedTargetCollectionMetadata;
import org.broadleafcommerce.openadmin.dto.BasicCollectionMetadata;
import org.broadleafcommerce.openadmin.dto.BasicFieldMetadata;
import org.broadleafcommerce.openadmin.dto.MapMetadata;

import java.io.Serializable;

/**
 * @author Jeff Fischer
 */
public class MetadataVisitorAdapter implements MetadataVisitor, Serializable {

    @Override
    public void visit(AdornedTargetCollectionMetadata metadata) {
        throw new IllegalArgumentException("Not supported in this context");
    }

    @Override
    public void visit(BasicFieldMetadata metadata) {
        throw new IllegalArgumentException("Not supported in this context");
    }

    @Override
    public void visit(BasicCollectionMetadata metadata) {
        throw new IllegalArgumentException("Not supported in this context");
    }

    @Override
    public void visit(MapMetadata metadata) {
        throw new IllegalArgumentException("Not supported in this context");
    }
}
