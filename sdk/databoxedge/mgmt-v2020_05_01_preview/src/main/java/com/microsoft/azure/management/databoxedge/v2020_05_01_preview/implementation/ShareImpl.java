/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview.implementation;

import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.Share;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ShareStatus;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.MonitoringStatus;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.AzureContainerInfo;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ShareAccessProtocol;
import java.util.List;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.UserAccessRight;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.ClientAccessRight;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.RefreshDetails;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.MountPointMap;
import com.microsoft.azure.management.databoxedge.v2020_05_01_preview.DataPolicy;

class ShareImpl extends CreatableUpdatableImpl<Share, ShareInner, ShareImpl> implements Share, Share.Definition, Share.Update {
    private final DataBoxEdgeManager manager;
    private String deviceName;
    private String name;
    private String resourceGroupName;

    ShareImpl(String name, DataBoxEdgeManager manager) {
        super(name, new ShareInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    ShareImpl(ShareInner inner, DataBoxEdgeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.deviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataBoxEdgeDevices");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "shares");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        //
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Share> createResourceAsync() {
        SharesInner client = this.manager().inner().shares();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Share> updateResourceAsync() {
        SharesInner client = this.manager().inner().shares();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ShareInner> getInnerAsync() {
        SharesInner client = this.manager().inner().shares();
        return client.getAsync(this.deviceName, this.name, this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ShareAccessProtocol accessProtocol() {
        return this.inner().accessProtocol();
    }

    @Override
    public AzureContainerInfo azureContainerInfo() {
        return this.inner().azureContainerInfo();
    }

    @Override
    public List<ClientAccessRight> clientAccessRights() {
        return this.inner().clientAccessRights();
    }

    @Override
    public DataPolicy dataPolicy() {
        return this.inner().dataPolicy();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public MonitoringStatus monitoringStatus() {
        return this.inner().monitoringStatus();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RefreshDetails refreshDetails() {
        return this.inner().refreshDetails();
    }

    @Override
    public List<MountPointMap> shareMappings() {
        return this.inner().shareMappings();
    }

    @Override
    public ShareStatus shareStatus() {
        return this.inner().shareStatus();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public List<UserAccessRight> userAccessRights() {
        return this.inner().userAccessRights();
    }

    @Override
    public ShareImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public ShareImpl withAccessProtocol(ShareAccessProtocol accessProtocol) {
        this.inner().withAccessProtocol(accessProtocol);
        return this;
    }

    @Override
    public ShareImpl withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.inner().withMonitoringStatus(monitoringStatus);
        return this;
    }

    @Override
    public ShareImpl withShareStatus(ShareStatus shareStatus) {
        this.inner().withShareStatus(shareStatus);
        return this;
    }

    @Override
    public ShareImpl withAzureContainerInfo(AzureContainerInfo azureContainerInfo) {
        this.inner().withAzureContainerInfo(azureContainerInfo);
        return this;
    }

    @Override
    public ShareImpl withClientAccessRights(List<ClientAccessRight> clientAccessRights) {
        this.inner().withClientAccessRights(clientAccessRights);
        return this;
    }

    @Override
    public ShareImpl withDataPolicy(DataPolicy dataPolicy) {
        this.inner().withDataPolicy(dataPolicy);
        return this;
    }

    @Override
    public ShareImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public ShareImpl withRefreshDetails(RefreshDetails refreshDetails) {
        this.inner().withRefreshDetails(refreshDetails);
        return this;
    }

    @Override
    public ShareImpl withUserAccessRights(List<UserAccessRight> userAccessRights) {
        this.inner().withUserAccessRights(userAccessRights);
        return this;
    }

}