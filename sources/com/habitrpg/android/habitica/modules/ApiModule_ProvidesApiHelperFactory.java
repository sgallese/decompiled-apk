package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.common.habitica.api.HostConfig;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes4.dex */
public final class ApiModule_ProvidesApiHelperFactory implements a {
    private final a<Context> contextProvider;
    private final a<GsonConverterFactory> gsonConverterProvider;
    private final a<HostConfig> hostConfigProvider;
    private final ApiModule module;
    private final a<NotificationsManager> notificationsManagerProvider;

    public ApiModule_ProvidesApiHelperFactory(ApiModule apiModule, a<GsonConverterFactory> aVar, a<HostConfig> aVar2, a<NotificationsManager> aVar3, a<Context> aVar4) {
        this.module = apiModule;
        this.gsonConverterProvider = aVar;
        this.hostConfigProvider = aVar2;
        this.notificationsManagerProvider = aVar3;
        this.contextProvider = aVar4;
    }

    public static ApiModule_ProvidesApiHelperFactory create(ApiModule apiModule, a<GsonConverterFactory> aVar, a<HostConfig> aVar2, a<NotificationsManager> aVar3, a<Context> aVar4) {
        return new ApiModule_ProvidesApiHelperFactory(apiModule, aVar, aVar2, aVar3, aVar4);
    }

    public static ApiClient providesApiHelper(ApiModule apiModule, GsonConverterFactory gsonConverterFactory, HostConfig hostConfig, NotificationsManager notificationsManager, Context context) {
        return (ApiClient) b.d(apiModule.providesApiHelper(gsonConverterFactory, hostConfig, notificationsManager, context));
    }

    @Override // cc.a
    public ApiClient get() {
        return providesApiHelper(this.module, this.gsonConverterProvider.get(), this.hostConfigProvider.get(), this.notificationsManagerProvider.get(), this.contextProvider.get());
    }
}
