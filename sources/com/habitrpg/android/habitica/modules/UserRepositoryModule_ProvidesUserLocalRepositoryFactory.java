package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesUserLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesUserLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesUserLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesUserLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static UserLocalRepository providesUserLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (UserLocalRepository) b.d(userRepositoryModule.providesUserLocalRepository(o0Var));
    }

    @Override // cc.a
    public UserLocalRepository get() {
        return providesUserLocalRepository(this.module, this.realmProvider.get());
    }
}
