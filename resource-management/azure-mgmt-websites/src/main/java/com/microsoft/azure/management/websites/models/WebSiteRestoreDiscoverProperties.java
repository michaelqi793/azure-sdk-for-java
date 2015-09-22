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

package com.microsoft.azure.management.websites.models;

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;

/**
* The information gathered about a backup storaged in a storage account.
*/
public class WebSiteRestoreDiscoverProperties {
    private boolean adjustConnectionStrings;
    
    /**
    * Optional. If the restore operation also restores a database along with
    * the website and the database is on a different server than when the
    * original site h
    * @return The AdjustConnectionStrings value.
    */
    public boolean isAdjustConnectionStrings() {
        return this.adjustConnectionStrings;
    }
    
    /**
    * Optional. If the restore operation also restores a database along with
    * the website and the database is on a different server than when the
    * original site h
    * @param adjustConnectionStringsValue The AdjustConnectionStrings value.
    */
    public void setAdjustConnectionStrings(final boolean adjustConnectionStringsValue) {
        this.adjustConnectionStrings = adjustConnectionStringsValue;
    }
    
    private String blobName;
    
    /**
    * Optional. The blob name where the backup is stored, e.g.
    * mysite1_20140506.zip
    * @return The BlobName value.
    */
    public String getBlobName() {
        return this.blobName;
    }
    
    /**
    * Optional. The blob name where the backup is stored, e.g.
    * mysite1_20140506.zip
    * @param blobNameValue The BlobName value.
    */
    public void setBlobName(final String blobNameValue) {
        this.blobName = blobNameValue;
    }
    
    private ArrayList<DatabaseBackupSetting> databases;
    
    /**
    * Optional. Database settings for backup.
    * @return The Databases value.
    */
    public ArrayList<DatabaseBackupSetting> getDatabases() {
        return this.databases;
    }
    
    /**
    * Optional. Database settings for backup.
    * @param databasesValue The Databases value.
    */
    public void setDatabases(final ArrayList<DatabaseBackupSetting> databasesValue) {
        this.databases = databasesValue;
    }
    
    private boolean ignoreConflictingHostNames;
    
    /**
    * Optional. When restoring a site, custom domains might conflict with other
    * site in the same datacenter. If this value is true, such hostnames will
    * be ignored during restore. If this is false, the restore operation will
    * fail on such conflict.
    * @return The IgnoreConflictingHostNames value.
    */
    public boolean isIgnoreConflictingHostNames() {
        return this.ignoreConflictingHostNames;
    }
    
    /**
    * Optional. When restoring a site, custom domains might conflict with other
    * site in the same datacenter. If this value is true, such hostnames will
    * be ignored during restore. If this is false, the restore operation will
    * fail on such conflict.
    * @param ignoreConflictingHostNamesValue The IgnoreConflictingHostNames
    * value.
    */
    public void setIgnoreConflictingHostNames(final boolean ignoreConflictingHostNamesValue) {
        this.ignoreConflictingHostNames = ignoreConflictingHostNamesValue;
    }
    
    private boolean overwrite;
    
    /**
    * Optional. True if the restore operation will be used for overwrite an
    * existing site; false otherwise.
    * @return The Overwrite value.
    */
    public boolean isOverwrite() {
        return this.overwrite;
    }
    
    /**
    * Optional. True if the restore operation will be used for overwrite an
    * existing site; false otherwise.
    * @param overwriteValue The Overwrite value.
    */
    public void setOverwrite(final boolean overwriteValue) {
        this.overwrite = overwriteValue;
    }
    
    private String storageAccountUrl;
    
    /**
    * Optional. SAS URL for a container in a storage account. E.g.
    * https://NAME.blob.core.windows.net/CONTAINERNAME/?sv=2012-02-12&st=2013-12-05T19%3A30%3A45Z&se=2017-12-04T19%3A30%3A45Z&sr=c&sp=rwdl&sig=abcdefABCDEFabcdef0123456789
    * @return The StorageAccountUrl value.
    */
    public String getStorageAccountUrl() {
        return this.storageAccountUrl;
    }
    
    /**
    * Optional. SAS URL for a container in a storage account. E.g.
    * https://NAME.blob.core.windows.net/CONTAINERNAME/?sv=2012-02-12&st=2013-12-05T19%3A30%3A45Z&se=2017-12-04T19%3A30%3A45Z&sr=c&sp=rwdl&sig=abcdefABCDEFabcdef0123456789
    * @param storageAccountUrlValue The StorageAccountUrl value.
    */
    public void setStorageAccountUrl(final String storageAccountUrlValue) {
        this.storageAccountUrl = storageAccountUrlValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteRestoreDiscoverProperties class.
    *
    */
    public WebSiteRestoreDiscoverProperties() {
        this.setDatabases(new LazyArrayList<DatabaseBackupSetting>());
    }
}
