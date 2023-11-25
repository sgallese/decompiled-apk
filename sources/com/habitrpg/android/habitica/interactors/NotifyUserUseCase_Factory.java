package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.data.UserRepository;

/* loaded from: classes4.dex */
public final class NotifyUserUseCase_Factory implements a {
    private final a<LevelUpUseCase> levelUpUseCaseProvider;
    private final a<UserRepository> userRepositoryProvider;

    public NotifyUserUseCase_Factory(a<LevelUpUseCase> aVar, a<UserRepository> aVar2) {
        this.levelUpUseCaseProvider = aVar;
        this.userRepositoryProvider = aVar2;
    }

    public static NotifyUserUseCase_Factory create(a<LevelUpUseCase> aVar, a<UserRepository> aVar2) {
        return new NotifyUserUseCase_Factory(aVar, aVar2);
    }

    public static NotifyUserUseCase newInstance(LevelUpUseCase levelUpUseCase, UserRepository userRepository) {
        return new NotifyUserUseCase(levelUpUseCase, userRepository);
    }

    @Override // cc.a
    public NotifyUserUseCase get() {
        return newInstance(this.levelUpUseCaseProvider.get(), this.userRepositoryProvider.get());
    }
}
