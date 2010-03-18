// $Id$
/*
* JBoss, Home of Professional Open Source
* Copyright 2009, Red Hat, Inc. and/or its affiliates, and individual contributors
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
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
package org.hibernate.validator.engine.groups;

import javax.validation.GroupSequence;
import javax.validation.constraints.NotNull;

/**
 * @author Hardy Ferentschik
 */
public class Try {
	@NotNull(message = "field1", groups = BaseComponent.class)
	public String field1;

	@NotNull(message = "field2", groups = Component.class)
	public String field2;

	@NotNull(message = "field3", groups = OtherComponent.class)
	public String field3;

	public interface BaseComponent {
	}

	public interface Component extends BaseComponent {
	}

	public interface OtherComponent {
	}

	@GroupSequence({ Component.class, OtherComponent.class })
	public interface GlobalCheck {
	}
}


