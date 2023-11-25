package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.res.Resources;
import bb.b;
import cc.a;

/* loaded from: classes4.dex */
public final class AppModule_ProvidesResourcesFactory implements a {
    private final a<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvidesResourcesFactory(AppModule appModule, a<Context> aVar) {
        this.module = appModule;
        this.contextProvider = aVar;
    }

    public static AppModule_ProvidesResourcesFactory create(AppModule appModule, a<Context> aVar) {
        return new AppModule_ProvidesResourcesFactory(appModule, aVar);
    }

    public static Resources providesResources(AppModule appModule, Context context) {
        return (Resources) b.d(appModule.providesResources(context));
    }

    @Override // cc.a
    public Resources get() {
        return providesResources(this.module, this.contextProvider.get());
    }
}
