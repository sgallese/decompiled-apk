package com.habitrpg.android.habitica.modules;

import android.content.Context;
import android.content.SharedPreferences;
import cc.a;
import com.habitrpg.common.habitica.helpers.KeyHelper;
import java.security.KeyStore;

/* loaded from: classes4.dex */
public final class AppModule_ProvideKeyHelperFactory implements a {
    private final a<Context> contextProvider;
    private final a<KeyStore> keyStoreProvider;
    private final AppModule module;
    private final a<SharedPreferences> sharedPreferencesProvider;

    public AppModule_ProvideKeyHelperFactory(AppModule appModule, a<Context> aVar, a<SharedPreferences> aVar2, a<KeyStore> aVar3) {
        this.module = appModule;
        this.contextProvider = aVar;
        this.sharedPreferencesProvider = aVar2;
        this.keyStoreProvider = aVar3;
    }

    public static AppModule_ProvideKeyHelperFactory create(AppModule appModule, a<Context> aVar, a<SharedPreferences> aVar2, a<KeyStore> aVar3) {
        return new AppModule_ProvideKeyHelperFactory(appModule, aVar, aVar2, aVar3);
    }

    public static KeyHelper provideKeyHelper(AppModule appModule, Context context, SharedPreferences sharedPreferences, KeyStore keyStore) {
        return appModule.provideKeyHelper(context, sharedPreferences, keyStore);
    }

    @Override // cc.a
    public KeyHelper get() {
        return provideKeyHelper(this.module, this.contextProvider.get(), this.sharedPreferencesProvider.get(), this.keyStoreProvider.get());
    }
}
