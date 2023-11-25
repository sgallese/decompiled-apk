package com.habitrpg.android.habitica.modules;

import cc.a;
import java.security.KeyStore;

/* loaded from: classes4.dex */
public final class AppModule_ProvideKeyStoreFactory implements a {
    private final AppModule module;

    public AppModule_ProvideKeyStoreFactory(AppModule appModule) {
        this.module = appModule;
    }

    public static AppModule_ProvideKeyStoreFactory create(AppModule appModule) {
        return new AppModule_ProvideKeyStoreFactory(appModule);
    }

    public static KeyStore provideKeyStore(AppModule appModule) {
        return appModule.provideKeyStore();
    }

    @Override // cc.a
    public KeyStore get() {
        return provideKeyStore(this.module);
    }
}
