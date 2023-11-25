package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.ChallengeLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvideChallengeLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvideChallengeLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvideChallengeLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvideChallengeLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static ChallengeLocalRepository provideChallengeLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (ChallengeLocalRepository) b.d(userRepositoryModule.provideChallengeLocalRepository(o0Var));
    }

    @Override // cc.a
    public ChallengeLocalRepository get() {
        return provideChallengeLocalRepository(this.module, this.realmProvider.get());
    }
}
