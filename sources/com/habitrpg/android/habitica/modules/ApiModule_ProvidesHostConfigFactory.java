package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import bb.b;
import cc.a;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.KeyHelper;

/* loaded from: classes4.dex */
public final class ApiModule_ProvidesHostConfigFactory implements a {
    private final a<Context> contextProvider;
    private final a<KeyHelper> keyHelperProvider;
    private final ApiModule module;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public ApiModule_ProvidesHostConfigFactory(ApiModule apiModule, a<SharedPreferences> aVar, a<KeyHelper> aVar2, a<Context> aVar3) {
        this.module = apiModule;
        this.sharedPreferencesProvider = aVar;
        this.keyHelperProvider = aVar2;
        this.contextProvider = aVar3;
    }

    public static ApiModule_ProvidesHostConfigFactory create(ApiModule apiModule, a<SharedPreferences> aVar, a<KeyHelper> aVar2, a<Context> aVar3) {
        return new ApiModule_ProvidesHostConfigFactory(apiModule, aVar, aVar2, aVar3);
    }

    public static HostConfig providesHostConfig(ApiModule apiModule, SharedPreferences sharedPreferences, KeyHelper keyHelper, Context context) {
        return (HostConfig) b.d(apiModule.providesHostConfig(sharedPreferences, keyHelper, context));
    }

    @Override // cc.a
    public HostConfig get() {
        return providesHostConfig(this.module, this.sharedPreferencesProvider.get(), this.keyHelperProvider.get(), this.contextProvider.get());
    }
}
