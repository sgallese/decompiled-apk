package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class ApiModule_ProvidesPopupNotificationsManagerFactory implements a {
    private final ApiModule module;

    public ApiModule_ProvidesPopupNotificationsManagerFactory(ApiModule apiModule) {
        this.module = apiModule;
    }

    public static ApiModule_ProvidesPopupNotificationsManagerFactory create(ApiModule apiModule) {
        return new ApiModule_ProvidesPopupNotificationsManagerFactory(apiModule);
    }

    public static NotificationsManager providesPopupNotificationsManager(ApiModule apiModule) {
        return (NotificationsManager) b.d(apiModule.providesPopupNotificationsManager());
    }

    @Override // cc.a
    public NotificationsManager get() {
        return providesPopupNotificationsManager(this.module);
    }
}
