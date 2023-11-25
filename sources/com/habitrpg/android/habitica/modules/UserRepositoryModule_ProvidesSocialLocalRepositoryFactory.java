package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesSocialLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesSocialLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesSocialLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesSocialLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static SocialLocalRepository providesSocialLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (SocialLocalRepository) b.d(userRepositoryModule.providesSocialLocalRepository(o0Var));
    }

    @Override // cc.a
    public SocialLocalRepository get() {
        return providesSocialLocalRepository(this.module, this.realmProvider.get());
    }
}
