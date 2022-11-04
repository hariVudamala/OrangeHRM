/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
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
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.service.cm;


/**
 * Defines standard constants for the Configuration Admin service.
 * 
 * @author $Id: 965e89a042b8cf8bc63bccc4f7671f190e742329 $
 */
public final class ConfigurationConstants {
	private ConfigurationConstants() {
		// non-instantiable
	}


	/**
	 * The name of the implementation capability for the Configuration Admin
	 * specification
	 * 
	 * @since 1.6
	 */
	public static final String	CONFIGURATION_ADMIN_IMPLEMENTATION			= "osgi.cm";

	/**
	 * The version of the implementation capability for the Configuration Admin
	 * specification
	 * 
	 * @since 1.6
	 */
	public static final String	CONFIGURATION_ADMIN_SPECIFICATION_VERSION	= "1.6";
}
