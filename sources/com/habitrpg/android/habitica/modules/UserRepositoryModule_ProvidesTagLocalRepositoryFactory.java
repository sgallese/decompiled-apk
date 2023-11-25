package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.TagLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTagLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesTagLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesTagLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesTagLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static TagLocalRepository providesTagLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (TagLocalRepository) b.d(userRepositoryModule.providesTagLocalRepository(o0Var));
    }

    @Override // cc.a
    public TagLocalRepository get() {
        return providesTagLocalRepository(this.module, this.realmProvider.get());
    }
}
