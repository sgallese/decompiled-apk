package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesFAQLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesFAQLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesFAQLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesFAQLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static FAQLocalRepository providesFAQLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (FAQLocalRepository) b.d(userRepositoryModule.providesFAQLocalRepository(o0Var));
    }

    @Override // cc.a
    public FAQLocalRepository get() {
        return providesFAQLocalRepository(this.module, this.realmProvider.get());
    }
}
