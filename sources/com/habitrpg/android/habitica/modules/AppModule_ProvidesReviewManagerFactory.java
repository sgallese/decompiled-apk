package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;

/* loaded from: classes4.dex */
public final class AppModule_ProvidesReviewManagerFactory implements a {
    private final a<AppConfigManager> configManagerProvider;
    private final a<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvidesReviewManagerFactory(AppModule appModule, a<Context> aVar, a<AppConfigManager> aVar2) {
        this.module = appModule;
        this.contextProvider = aVar;
        this.configManagerProvider = aVar2;
    }

    public static AppModule_ProvidesReviewManagerFactory create(AppModule appModule, a<Context> aVar, a<AppConfigManager> aVar2) {
        return new AppModule_ProvidesReviewManagerFactory(appModule, aVar, aVar2);
    }

    public static ReviewManager providesReviewManager(AppModule appModule, Context context, AppConfigManager appConfigManager) {
        return (ReviewManager) b.d(appModule.providesReviewManager(context, appConfigManager));
    }

    @Override // cc.a
    public ReviewManager get() {
        return providesReviewManager(this.module, this.contextProvider.get(), this.configManagerProvider.get());
    }
}
