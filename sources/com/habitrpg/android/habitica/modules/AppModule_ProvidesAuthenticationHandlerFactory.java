package com.habitrpg.android.habitica.modules;

import android.content.SharedPreferences;
import bb.b;
import cc.a;

/* loaded from: classes4.dex */
public final class AppModule_ProvidesAuthenticationHandlerFactory implements a {
    private final AppModule module;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public AppModule_ProvidesAuthenticationHandlerFactory(AppModule appModule, a<SharedPreferences> aVar) {
        this.module = appModule;
        this.sharedPreferencesProvider = aVar;
    }

    public static AppModule_ProvidesAuthenticationHandlerFactory create(AppModule appModule, a<SharedPreferences> aVar) {
        return new AppModule_ProvidesAuthenticationHandlerFactory(appModule, aVar);
    }

    public static AuthenticationHandler providesAuthenticationHandler(AppModule appModule, SharedPreferences sharedPreferences) {
        return (AuthenticationHandler) b.d(appModule.providesAuthenticationHandler(sharedPreferences));
    }

    @Override // cc.a
    public AuthenticationHandler get() {
        return providesAuthenticationHandler(this.module, this.sharedPreferencesProvider.get());
    }
}
