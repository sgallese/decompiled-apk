package com.habitrpg.android.habitica.receivers;

import com.habitrpg.common.habitica.api.HostConfig;
import qa.a;

/* loaded from: classes4.dex */
public final class DeviceCommunicationService_MembersInjector implements a<DeviceCommunicationService> {
    private final cc.a<HostConfig> hostConfigProvider;

    public DeviceCommunicationService_MembersInjector(cc.a<HostConfig> aVar) {
        this.hostConfigProvider = aVar;
    }

    public static a<DeviceCommunicationService> create(cc.a<HostConfig> aVar) {
        return new DeviceCommunicationService_MembersInjector(aVar);
    }

    public static void injectHostConfig(DeviceCommunicationService deviceCommunicationService, HostConfig hostConfig) {
        deviceCommunicationService.hostConfig = hostConfig;
    }

    public void injectMembers(DeviceCommunicationService deviceCommunicationService) {
        injectHostConfig(deviceCommunicationService, this.hostConfigProvider.get());
    }
}
