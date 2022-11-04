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

/**
 * Service Component Runtime Data Transfer Objects Package Version 1.5.
 * <p>
 * Bundles wishing to use this package must list the package in the
 * Import-Package header of the bundle's manifest. This package has two types of
 * users: the consumers that use the API in this package and the providers that
 * implement the API in this package.
 * <p>
 * Example import for consumers using the API in this package:
 * <p>
 * {@code  Import-Package: org.osgi.service.component.runtime.dto; version="[1.5,2.0)"}
 * <p>
 * Example import for providers implementing the API in this package:
 * <p>
 * {@code  Import-Package: org.osgi.service.component.runtime.dto; version="[1.5,1.6)"}
 *
 * @author $Id: f796735dcf4a5ad318e4fdd4bd2795d3deef7614 $
 */

@Version(COMPONENT_SPECIFICATION_VERSION)
package org.osgi.service.component.runtime.dto;

import static org.osgi.service.component.ComponentConstants.COMPONENT_SPECIFICATION_VERSION;

import org.osgi.annotation.versioning.Version;

