package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;

/* loaded from: classes4.dex */
public final class AppModule_PushNotificationManagerFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<Context> contextProvider;
    private final AppModule module;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public AppModule_PushNotificationManagerFactory(AppModule appModule, a<ApiClient> aVar, a<SharedPreferences> aVar2, a<Context> aVar3) {
        this.module = appModule;
        this.apiClientProvider = aVar;
        this.sharedPreferencesProvider = aVar2;
        this.contextProvider = aVar3;
    }

    public static AppModule_PushNotificationManagerFactory create(AppModule appModule, a<ApiClient> aVar, a<SharedPreferences> aVar2, a<Context> aVar3) {
        return new AppModule_PushNotificationManagerFactory(appModule, aVar, aVar2, aVar3);
    }

    public static PushNotificationManager pushNotificationManager(AppModule appModule, ApiClient apiClient, SharedPreferences sharedPreferences, Context context) {
        return (PushNotificationManager) b.d(appModule.pushNotificationManager(apiClient, sharedPreferences, context));
    }

    @Override // cc.a
    public PushNotificationManager get() {
        return pushNotificationManager(this.module, this.apiClientProvider.get(), this.sharedPreferencesProvider.get(), this.contextProvider.get());
    }
}
