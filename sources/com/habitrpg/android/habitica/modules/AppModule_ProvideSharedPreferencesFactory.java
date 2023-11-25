package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import bb.b;
import cc.a;

/* loaded from: classes4.dex */
public final class AppModule_ProvideSharedPreferencesFactory implements a {
    private final a<Context> contextProvider;
    private final AppModule module;

    public AppModule_ProvideSharedPreferencesFactory(AppModule appModule, a<Context> aVar) {
        this.module = appModule;
        this.contextProvider = aVar;
    }

    public static AppModule_ProvideSharedPreferencesFactory create(AppModule appModule, a<Context> aVar) {
        return new AppModule_ProvideSharedPreferencesFactory(appModule, aVar);
    }

    public static SharedPreferences provideSharedPreferences(AppModule appModule, Context context) {
        return (SharedPreferences) b.d(appModule.provideSharedPreferences(context));
    }

    @Override // cc.a
    public SharedPreferences get() {
        return provideSharedPreferences(this.module, this.contextProvider.get());
    }
}
