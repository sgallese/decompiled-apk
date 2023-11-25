package com.habitrpg.android.habitica.modules;

import android.content.Context;
import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory implements a {
    private final a<Context> contextProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory(UserRepositoryModule userRepositoryModule, a<Context> aVar) {
        this.module = userRepositoryModule;
        this.contextProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<Context> aVar) {
        return new UserRepositoryModule_ProvidesSetupCustomizationRepositoryFactory(userRepositoryModule, aVar);
    }

    public static SetupCustomizationRepository providesSetupCustomizationRepository(UserRepositoryModule userRepositoryModule, Context context) {
        return (SetupCustomizationRepository) b.d(userRepositoryModule.providesSetupCustomizationRepository(context));
    }

    @Override // cc.a
    public SetupCustomizationRepository get() {
        return providesSetupCustomizationRepository(this.module, this.contextProvider.get());
    }
}
