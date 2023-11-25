package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import com.habitrpg.android.habitica.api.MaintenanceApiService;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.implementation.ApiClientImpl;
import com.habitrpg.android.habitica.helpers.MainNotificationsManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import java.lang.ref.WeakReference;
import qc.q;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: ApiModule.kt */
/* loaded from: classes4.dex */
public class ApiModule {
    public static final int $stable = 0;

    public final ApiClient providesApiHelper(GsonConverterFactory gsonConverterFactory, HostConfig hostConfig, NotificationsManager notificationsManager, Context context) {
        q.i(gsonConverterFactory, "gsonConverter");
        q.i(hostConfig, "hostConfig");
        q.i(notificationsManager, "notificationsManager");
        q.i(context, "context");
        ApiClientImpl apiClientImpl = new ApiClientImpl(gsonConverterFactory, hostConfig, notificationsManager, context);
        notificationsManager.setApiClient(new WeakReference<>(apiClientImpl));
        return apiClientImpl;
    }

    public final GsonConverterFactory providesGsonConverterFactory() {
        return ApiClientImpl.Companion.createGsonFactory();
    }

    public final HostConfig providesHostConfig(SharedPreferences sharedPreferences, KeyHelper keyHelper, Context context) {
        q.i(sharedPreferences, "sharedPreferences");
        q.i(context, "context");
        return new HostConfig(sharedPreferences, keyHelper, context);
    }

    public final MaintenanceApiService providesMaintenanceApiService(GsonConverterFactory gsonConverterFactory) {
        q.i(gsonConverterFactory, "gsonConverter");
        Object create = new Retrofit.Builder().baseUrl("https://habitica-assets.s3.amazonaws.com/mobileApp/endpoint/").addConverterFactory(gsonConverterFactory).build().create(MaintenanceApiService.class);
        q.h(create, "create(...)");
        return (MaintenanceApiService) create;
    }

    public final NotificationsManager providesPopupNotificationsManager() {
        return new MainNotificationsManager();
    }
}
