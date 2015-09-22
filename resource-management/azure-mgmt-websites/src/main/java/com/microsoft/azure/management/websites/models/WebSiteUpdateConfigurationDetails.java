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
import com.microsoft.windowsazure.core.LazyHashMap;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* The Update Web Site Configuration parameters.
*/
public class WebSiteUpdateConfigurationDetails {
    private Boolean alwaysOn;
    
    /**
    * Optional. True if Always On functionality is enabled for the site;
    * otherwise, false.
    * @return The AlwaysOn value.
    */
    public Boolean isAlwaysOn() {
        return this.alwaysOn;
    }
    
    /**
    * Optional. True if Always On functionality is enabled for the site;
    * otherwise, false.
    * @param alwaysOnValue The AlwaysOn value.
    */
    public void setAlwaysOn(final Boolean alwaysOnValue) {
        this.alwaysOn = alwaysOnValue;
    }
    
    private HashMap<String, String> appSettings;
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a site.
    * @return The AppSettings value.
    */
    public HashMap<String, String> getAppSettings() {
        return this.appSettings;
    }
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a site.
    * @param appSettingsValue The AppSettings value.
    */
    public void setAppSettings(final HashMap<String, String> appSettingsValue) {
        this.appSettings = appSettingsValue;
    }
    
    private String autoSwapSlotName;
    
    /**
    * Optional. Sets the slot name to swap with after successful deployment.
    * @return The AutoSwapSlotName value.
    */
    public String getAutoSwapSlotName() {
        return this.autoSwapSlotName;
    }
    
    /**
    * Optional. Sets the slot name to swap with after successful deployment.
    * @param autoSwapSlotNameValue The AutoSwapSlotName value.
    */
    public void setAutoSwapSlotName(final String autoSwapSlotNameValue) {
        this.autoSwapSlotName = autoSwapSlotNameValue;
    }
    
    private ArrayList<ConnectionStringInfo> connectionStrings;
    
    /**
    * Optional. Contains connection strings for database and other external
    * resources.
    * @return The ConnectionStrings value.
    */
    public ArrayList<ConnectionStringInfo> getConnectionStrings() {
        return this.connectionStrings;
    }
    
    /**
    * Optional. Contains connection strings for database and other external
    * resources.
    * @param connectionStringsValue The ConnectionStrings value.
    */
    public void setConnectionStrings(final ArrayList<ConnectionStringInfo> connectionStringsValue) {
        this.connectionStrings = connectionStringsValue;
    }
    
    private ArrayList<String> defaultDocuments;
    
    /**
    * Optional. Contains one or more string elements that list, in order of
    * preference, the name of the file that a web site returns when the web
    * site's domain name is requested by itself. For example, if the default
    * document for http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @return The DefaultDocuments value.
    */
    public ArrayList<String> getDefaultDocuments() {
        return this.defaultDocuments;
    }
    
    /**
    * Optional. Contains one or more string elements that list, in order of
    * preference, the name of the file that a web site returns when the web
    * site's domain name is requested by itself. For example, if the default
    * document for http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @param defaultDocumentsValue The DefaultDocuments value.
    */
    public void setDefaultDocuments(final ArrayList<String> defaultDocumentsValue) {
        this.defaultDocuments = defaultDocumentsValue;
    }
    
    private Boolean detailedErrorLoggingEnabled;
    
    /**
    * Optional. True if detailed error logging is enabled; otherwise, false.
    * @return The DetailedErrorLoggingEnabled value.
    */
    public Boolean isDetailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    
    /**
    * Optional. True if detailed error logging is enabled; otherwise, false.
    * @param detailedErrorLoggingEnabledValue The DetailedErrorLoggingEnabled
    * value.
    */
    public void setDetailedErrorLoggingEnabled(final Boolean detailedErrorLoggingEnabledValue) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabledValue;
    }
    
    private String documentRoot;
    
    /**
    * Optional. The document root.
    * @return The DocumentRoot value.
    */
    public String getDocumentRoot() {
        return this.documentRoot;
    }
    
    /**
    * Optional. The document root.
    * @param documentRootValue The DocumentRoot value.
    */
    public void setDocumentRoot(final String documentRootValue) {
        this.documentRoot = documentRootValue;
    }
    
    private ArrayList<WebSiteUpdateConfigurationDetails.HandlerMapping> handlerMappings;
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @return The HandlerMappings value.
    */
    public ArrayList<WebSiteUpdateConfigurationDetails.HandlerMapping> getHandlerMappings() {
        return this.handlerMappings;
    }
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @param handlerMappingsValue The HandlerMappings value.
    */
    public void setHandlerMappings(final ArrayList<WebSiteUpdateConfigurationDetails.HandlerMapping> handlerMappingsValue) {
        this.handlerMappings = handlerMappingsValue;
    }
    
    private Boolean httpLoggingEnabled;
    
    /**
    * Optional. True if HTTP error logging is enabled; otherwise, false.
    * @return The HttpLoggingEnabled value.
    */
    public Boolean isHttpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }
    
    /**
    * Optional. True if HTTP error logging is enabled; otherwise, false.
    * @param httpLoggingEnabledValue The HttpLoggingEnabled value.
    */
    public void setHttpLoggingEnabled(final Boolean httpLoggingEnabledValue) {
        this.httpLoggingEnabled = httpLoggingEnabledValue;
    }
    
    private SiteLimits limits;
    
    /**
    * Optional. The per site limits.
    * @return The Limits value.
    */
    public SiteLimits getLimits() {
        return this.limits;
    }
    
    /**
    * Optional. The per site limits.
    * @param limitsValue The Limits value.
    */
    public void setLimits(final SiteLimits limitsValue) {
        this.limits = limitsValue;
    }
    
    private Integer logsDirectorySizeLimit;
    
    /**
    * Optional. The limit of the logs directory.
    * @return The LogsDirectorySizeLimit value.
    */
    public Integer getLogsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }
    
    /**
    * Optional. The limit of the logs directory.
    * @param logsDirectorySizeLimitValue The LogsDirectorySizeLimit value.
    */
    public void setLogsDirectorySizeLimit(final Integer logsDirectorySizeLimitValue) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimitValue;
    }
    
    private ManagedPipelineMode managedPipelineMode;
    
    /**
    * Optional. Managed pipeline modes.
    * @return The ManagedPipelineMode value.
    */
    public ManagedPipelineMode getManagedPipelineMode() {
        return this.managedPipelineMode;
    }
    
    /**
    * Optional. Managed pipeline modes.
    * @param managedPipelineModeValue The ManagedPipelineMode value.
    */
    public void setManagedPipelineMode(final ManagedPipelineMode managedPipelineModeValue) {
        this.managedPipelineMode = managedPipelineModeValue;
    }
    
    private HashMap<String, String> metadata;
    
    /**
    * Optional. Contains name/value pairs for source control or other
    * information.
    * @return The Metadata value.
    */
    public HashMap<String, String> getMetadata() {
        return this.metadata;
    }
    
    /**
    * Optional. Contains name/value pairs for source control or other
    * information.
    * @param metadataValue The Metadata value.
    */
    public void setMetadata(final HashMap<String, String> metadataValue) {
        this.metadata = metadataValue;
    }
    
    private String netFrameworkVersion;
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0, v4.0 and
    * v4.5.
    * @return The NetFrameworkVersion value.
    */
    public String getNetFrameworkVersion() {
        return this.netFrameworkVersion;
    }
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0, v4.0 and
    * v4.5.
    * @param netFrameworkVersionValue The NetFrameworkVersion value.
    */
    public void setNetFrameworkVersion(final String netFrameworkVersionValue) {
        this.netFrameworkVersion = netFrameworkVersionValue;
    }
    
    private Integer numberOfWorkers;
    
    /**
    * Optional. The number of web workers allotted to the web site. If the site
    * mode is Free, this value is 1. If the site mode is Shared, this value
    * can range from 1 through 6. If the site mode is Standard, this value can
    * range from 1 through 10.
    * @return The NumberOfWorkers value.
    */
    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    /**
    * Optional. The number of web workers allotted to the web site. If the site
    * mode is Free, this value is 1. If the site mode is Shared, this value
    * can range from 1 through 6. If the site mode is Standard, this value can
    * range from 1 through 10.
    * @param numberOfWorkersValue The NumberOfWorkers value.
    */
    public void setNumberOfWorkers(final Integer numberOfWorkersValue) {
        this.numberOfWorkers = numberOfWorkersValue;
    }
    
    private String phpVersion;
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * PHP), 5.3, 5.4, 5.5 and 5.6.
    * @return The PhpVersion value.
    */
    public String getPhpVersion() {
        return this.phpVersion;
    }
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * PHP), 5.3, 5.4, 5.5 and 5.6.
    * @param phpVersionValue The PhpVersion value.
    */
    public void setPhpVersion(final String phpVersionValue) {
        this.phpVersion = phpVersionValue;
    }
    
    private String pythonVersion;
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * Python), 2.7 and 3.4.
    * @return The PythonVersion value.
    */
    public String getPythonVersion() {
        return this.pythonVersion;
    }
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * Python), 2.7 and 3.4.
    * @param pythonVersionValue The PythonVersion value.
    */
    public void setPythonVersion(final String pythonVersionValue) {
        this.pythonVersion = pythonVersionValue;
    }
    
    private Boolean remoteDebuggingEnabled;
    
    /**
    * Optional. True remote debugging is enabled; otherwise, false.
    * @return The RemoteDebuggingEnabled value.
    */
    public Boolean isRemoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    
    /**
    * Optional. True remote debugging is enabled; otherwise, false.
    * @param remoteDebuggingEnabledValue The RemoteDebuggingEnabled value.
    */
    public void setRemoteDebuggingEnabled(final Boolean remoteDebuggingEnabledValue) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabledValue;
    }
    
    private RemoteDebuggingVersion remoteDebuggingVersion;
    
    /**
    * Optional. True remote debugging version.
    * @return The RemoteDebuggingVersion value.
    */
    public RemoteDebuggingVersion getRemoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    
    /**
    * Optional. True remote debugging version.
    * @param remoteDebuggingVersionValue The RemoteDebuggingVersion value.
    */
    public void setRemoteDebuggingVersion(final RemoteDebuggingVersion remoteDebuggingVersionValue) {
        this.remoteDebuggingVersion = remoteDebuggingVersionValue;
    }
    
    private Boolean requestTracingEnabled;
    
    /**
    * Optional. True if request tracing is enabled; otherwise, false.
    * @return The RequestTracingEnabled value.
    */
    public Boolean isRequestTracingEnabled() {
        return this.requestTracingEnabled;
    }
    
    /**
    * Optional. True if request tracing is enabled; otherwise, false.
    * @param requestTracingEnabledValue The RequestTracingEnabled value.
    */
    public void setRequestTracingEnabled(final Boolean requestTracingEnabledValue) {
        this.requestTracingEnabled = requestTracingEnabledValue;
    }
    
    private Calendar requestTracingExpirationTime;
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @return The RequestTracingExpirationTime value.
    */
    public Calendar getRequestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @param requestTracingExpirationTimeValue The RequestTracingExpirationTime
    * value.
    */
    public void setRequestTracingExpirationTime(final Calendar requestTracingExpirationTimeValue) {
        this.requestTracingExpirationTime = requestTracingExpirationTimeValue;
    }
    
    private String scmType;
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @return The ScmType value.
    */
    public String getScmType() {
        return this.scmType;
    }
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @param scmTypeValue The ScmType value.
    */
    public void setScmType(final String scmTypeValue) {
        this.scmType = scmTypeValue;
    }
    
    private Boolean use32BitWorkerProcess;
    
    /**
    * Optional. True if 32-bit mode is enabled; otherwise, false.
    * @return The Use32BitWorkerProcess value.
    */
    public Boolean isUse32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }
    
    /**
    * Optional. True if 32-bit mode is enabled; otherwise, false.
    * @param use32BitWorkerProcessValue The Use32BitWorkerProcess value.
    */
    public void setUse32BitWorkerProcess(final Boolean use32BitWorkerProcessValue) {
        this.use32BitWorkerProcess = use32BitWorkerProcessValue;
    }
    
    private Boolean webSocketsEnabled;
    
    /**
    * Optional. True if Web Sockets are enabled; otherwise, false.
    * @return The WebSocketsEnabled value.
    */
    public Boolean isWebSocketsEnabled() {
        return this.webSocketsEnabled;
    }
    
    /**
    * Optional. True if Web Sockets are enabled; otherwise, false.
    * @param webSocketsEnabledValue The WebSocketsEnabled value.
    */
    public void setWebSocketsEnabled(final Boolean webSocketsEnabledValue) {
        this.webSocketsEnabled = webSocketsEnabledValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteUpdateConfigurationDetails class.
    *
    */
    public WebSiteUpdateConfigurationDetails() {
        this.setAppSettings(new LazyHashMap<String, String>());
        this.setConnectionStrings(new LazyArrayList<ConnectionStringInfo>());
        this.setDefaultDocuments(new LazyArrayList<String>());
        this.setHandlerMappings(new LazyArrayList<WebSiteUpdateConfigurationDetails.HandlerMapping>());
        this.setMetadata(new LazyHashMap<String, String>());
    }
    
    /**
    * Specifies a custom executable program for handling requests for specific
    * file name extensions.
    */
    public static class HandlerMapping {
        private String arguments;
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @return The Arguments value.
        */
        public String getArguments() {
            return this.arguments;
        }
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @param argumentsValue The Arguments value.
        */
        public void setArguments(final String argumentsValue) {
            this.arguments = argumentsValue;
        }
        
        private String extension;
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @return The Extension value.
        */
        public String getExtension() {
            return this.extension;
        }
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @param extensionValue The Extension value.
        */
        public void setExtension(final String extensionValue) {
            this.extension = extensionValue;
        }
        
        private String scriptProcessor;
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @return The ScriptProcessor value.
        */
        public String getScriptProcessor() {
            return this.scriptProcessor;
        }
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @param scriptProcessorValue The ScriptProcessor value.
        */
        public void setScriptProcessor(final String scriptProcessorValue) {
            this.scriptProcessor = scriptProcessorValue;
        }
    }
}
