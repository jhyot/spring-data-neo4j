/*
 * Copyright 2010 the original author or authors.
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

package org.springframework.datastore.graph.neo4j.fieldaccess;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.datastore.graph.api.NodeBacked;
import org.springframework.datastore.graph.api.RelationshipBacked;
import org.springframework.datastore.graph.neo4j.support.GraphDatabaseContext;

public class RelationshipEntityStateAccessorsFactory {
	@Autowired
	private GraphDatabaseContext graphDatabaseContext;

	public EntityStateAccessors<RelationshipBacked, Relationship> getEntityStateAccessors(final RelationshipBacked entity) {
		return new RelationshipEntityStateAccessors<RelationshipBacked>(null,entity,entity.getClass(), graphDatabaseContext);
	}
}
