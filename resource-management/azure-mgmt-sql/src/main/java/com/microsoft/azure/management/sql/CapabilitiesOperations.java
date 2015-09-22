/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.sql.responses.LocationCapabilitiesGetResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.Future;

/**
* Represents all the operations for determining the set of capabilites
* available in a specified region.
*/
public interface CapabilitiesOperations {
    /**
    * Returns information about the Azure SQL capabilities available for the
    * specified region.
    *
    * @param locationName Required. The name of the region for which the Azure
    * SQL capabilities are retrieved.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Represents the response to a Get Azure Sql capabilities request
    */
    LocationCapabilitiesGetResponse get(String locationName) throws IOException, ServiceException;
    
    /**
    * Returns information about the Azure SQL capabilities available for the
    * specified region.
    *
    * @param locationName Required. The name of the region for which the Azure
    * SQL capabilities are retrieved.
    * @return Represents the response to a Get Azure Sql capabilities request
    */
    Future<LocationCapabilitiesGetResponse> getAsync(String locationName);
}
