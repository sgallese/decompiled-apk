package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.CustomizationLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesCustomizationLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static CustomizationLocalRepository providesCustomizationLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (CustomizationLocalRepository) b.d(userRepositoryModule.providesCustomizationLocalRepository(o0Var));
    }

    @Override // cc.a
    public CustomizationLocalRepository get() {
        return providesCustomizationLocalRepository(this.module, this.realmProvider.get());
    }
}
