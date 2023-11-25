package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTaskLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesTaskLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesTaskLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesTaskLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static TaskLocalRepository providesTaskLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (TaskLocalRepository) b.d(userRepositoryModule.providesTaskLocalRepository(o0Var));
    }

    @Override // cc.a
    public TaskLocalRepository get() {
        return providesTaskLocalRepository(this.module, this.realmProvider.get());
    }
}
