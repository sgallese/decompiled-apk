package com.habitrpg.android.habitica;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.helpers.notifications.PushNotificationManager;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;

/* loaded from: classes4.dex */
public final class HabiticaBaseApplication_MembersInjector implements qa.a<HabiticaBaseApplication> {
    private final cc.a<AuthenticationHandler> authenticationHandlerProvider;
    private final cc.a<ApiClient> lazyApiHelperProvider;
    private final cc.a<PushNotificationManager> pushNotificationManagerProvider;
    private final cc.a<SharedPreferences> sharedPrefsProvider;

    public HabiticaBaseApplication_MembersInjector(cc.a<ApiClient> aVar, cc.a<SharedPreferences> aVar2, cc.a<PushNotificationManager> aVar3, cc.a<AuthenticationHandler> aVar4) {
        this.lazyApiHelperProvider = aVar;
        this.sharedPrefsProvider = aVar2;
        this.pushNotificationManagerProvider = aVar3;
        this.authenticationHandlerProvider = aVar4;
    }

    public static qa.a<HabiticaBaseApplication> create(cc.a<ApiClient> aVar, cc.a<SharedPreferences> aVar2, cc.a<PushNotificationManager> aVar3, cc.a<AuthenticationHandler> aVar4) {
        return new HabiticaBaseApplication_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectAuthenticationHandler(HabiticaBaseApplication habiticaBaseApplication, AuthenticationHandler authenticationHandler) {
        habiticaBaseApplication.authenticationHandler = authenticationHandler;
    }

    public static void injectLazyApiHelper(HabiticaBaseApplication habiticaBaseApplication, ApiClient apiClient) {
        habiticaBaseApplication.lazyApiHelper = apiClient;
    }

    public static void injectPushNotificationManager(HabiticaBaseApplication habiticaBaseApplication, PushNotificationManager pushNotificationManager) {
        habiticaBaseApplication.pushNotificationManager = pushNotificationManager;
    }

    public static void injectSharedPrefs(HabiticaBaseApplication habiticaBaseApplication, SharedPreferences sharedPreferences) {
        habiticaBaseApplication.sharedPrefs = sharedPreferences;
    }

    public void injectMembers(HabiticaBaseApplication habiticaBaseApplication) {
        injectLazyApiHelper(habiticaBaseApplication, this.lazyApiHelperProvider.get());
        injectSharedPrefs(habiticaBaseApplication, this.sharedPrefsProvider.get());
        injectPushNotificationManager(habiticaBaseApplication, this.pushNotificationManagerProvider.get());
        injectAuthenticationHandler(habiticaBaseApplication, this.authenticationHandlerProvider.get());
    }
}
