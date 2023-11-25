package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes4.dex */
public final class ApiModule_ProvidesMaintenanceApiServiceFactory implements a {
    private final a<GsonConverterFactory> gsonConverterProvider;
    private final ApiModule module;

    public ApiModule_ProvidesMaintenanceApiServiceFactory(ApiModule apiModule, a<GsonConverterFactory> aVar) {
        this.module = apiModule;
        this.gsonConverterProvider = aVar;
    }

    public static ApiModule_ProvidesMaintenanceApiServiceFactory create(ApiModule apiModule, a<GsonConverterFactory> aVar) {
        return new ApiModule_ProvidesMaintenanceApiServiceFactory(apiModule, aVar);
    }

    public static MaintenanceApiService providesMaintenanceApiService(ApiModule apiModule, GsonConverterFactory gsonConverterFactory) {
        return (MaintenanceApiService) b.d(apiModule.providesMaintenanceApiService(gsonConverterFactory));
    }

    @Override // cc.a
    public MaintenanceApiService get() {
        return providesMaintenanceApiService(this.module, this.gsonConverterProvider.get());
    }
}
