package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.local.ChallengeLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesChallengeRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<ChallengeLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesChallengeRepositoryFactory(UserRepositoryModule userRepositoryModule, a<ChallengeLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesChallengeRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<ChallengeLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesChallengeRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static ChallengeRepository providesChallengeRepository(UserRepositoryModule userRepositoryModule, ChallengeLocalRepository challengeLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (ChallengeRepository) b.d(userRepositoryModule.providesChallengeRepository(challengeLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public ChallengeRepository get() {
        return providesChallengeRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
