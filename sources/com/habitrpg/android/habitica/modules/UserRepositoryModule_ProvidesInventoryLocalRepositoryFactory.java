package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesInventoryLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static InventoryLocalRepository providesInventoryLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (InventoryLocalRepository) b.d(userRepositoryModule.providesInventoryLocalRepository(o0Var));
    }

    @Override // cc.a
    public InventoryLocalRepository get() {
        return providesInventoryLocalRepository(this.module, this.realmProvider.get());
    }
}
