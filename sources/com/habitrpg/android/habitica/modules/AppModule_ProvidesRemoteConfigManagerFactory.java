package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class AppModule_ProvidesRemoteConfigManagerFactory implements a {
    private final a<ContentRepository> contentRepositoryProvider;
    private final AppModule module;

    public AppModule_ProvidesRemoteConfigManagerFactory(AppModule appModule, a<ContentRepository> aVar) {
        this.module = appModule;
        this.contentRepositoryProvider = aVar;
    }

    public static AppModule_ProvidesRemoteConfigManagerFactory create(AppModule appModule, a<ContentRepository> aVar) {
        return new AppModule_ProvidesRemoteConfigManagerFactory(appModule, aVar);
    }

    public static AppConfigManager providesRemoteConfigManager(AppModule appModule, ContentRepository contentRepository) {
        return (AppConfigManager) b.d(appModule.providesRemoteConfigManager(contentRepository));
    }

    @Override // cc.a
    public AppConfigManager get() {
        return providesRemoteConfigManager(this.module, this.contentRepositoryProvider.get());
    }
}
