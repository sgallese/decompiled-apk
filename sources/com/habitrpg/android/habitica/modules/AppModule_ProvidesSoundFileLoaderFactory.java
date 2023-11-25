package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.helpers.SoundFileLoader;

/* loaded from: classes4.dex */
public final class AppModule_ProvidesSoundFileLoaderFactory implements a {
    private final a<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvidesSoundFileLoaderFactory(AppModule appModule, a<Context> aVar) {
        this.module = appModule;
        this.contextProvider = aVar;
    }

    public static AppModule_ProvidesSoundFileLoaderFactory create(AppModule appModule, a<Context> aVar) {
        return new AppModule_ProvidesSoundFileLoaderFactory(appModule, aVar);
    }

    public static SoundFileLoader providesSoundFileLoader(AppModule appModule, Context context) {
        return (SoundFileLoader) b.d(appModule.providesSoundFileLoader(context));
    }

    @Override // cc.a
    public SoundFileLoader get() {
        return providesSoundFileLoader(this.module, this.contextProvider.get());
    }
}
