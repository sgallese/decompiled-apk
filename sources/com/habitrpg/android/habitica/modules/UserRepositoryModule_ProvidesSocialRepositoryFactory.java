package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.local.SocialLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesSocialRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<SocialLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesSocialRepositoryFactory(UserRepositoryModule userRepositoryModule, a<SocialLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesSocialRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<SocialLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesSocialRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static SocialRepository providesSocialRepository(UserRepositoryModule userRepositoryModule, SocialLocalRepository socialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (SocialRepository) b.d(userRepositoryModule.providesSocialRepository(socialLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public SocialRepository get() {
        return providesSocialRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
