package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.local.TutorialLocalRepository;
import io.realm.o0;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory implements a {
    private final UserRepositoryModule module;
    private final a<o0> realmProvider;

    public UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        this.module = userRepositoryModule;
        this.realmProvider = aVar;
    }

    public static UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<o0> aVar) {
        return new UserRepositoryModule_ProvidesTutorialLocalRepositoryFactory(userRepositoryModule, aVar);
    }

    public static TutorialLocalRepository providesTutorialLocalRepository(UserRepositoryModule userRepositoryModule, o0 o0Var) {
        return (TutorialLocalRepository) b.d(userRepositoryModule.providesTutorialLocalRepository(o0Var));
    }

    @Override // cc.a
    public TutorialLocalRepository get() {
        return providesTutorialLocalRepository(this.module, this.realmProvider.get());
    }
}
