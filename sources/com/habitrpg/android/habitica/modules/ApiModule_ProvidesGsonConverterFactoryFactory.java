package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes4.dex */
public final class ApiModule_ProvidesGsonConverterFactoryFactory implements a {
    private final ApiModule module;

    public ApiModule_ProvidesGsonConverterFactoryFactory(ApiModule apiModule) {
        this.module = apiModule;
    }

    public static ApiModule_ProvidesGsonConverterFactoryFactory create(ApiModule apiModule) {
        return new ApiModule_ProvidesGsonConverterFactoryFactory(apiModule);
    }

    public static GsonConverterFactory providesGsonConverterFactory(ApiModule apiModule) {
        return (GsonConverterFactory) b.d(apiModule.providesGsonConverterFactory());
    }

    @Override // cc.a
    public GsonConverterFactory get() {
        return providesGsonConverterFactory(this.module);
    }
}
