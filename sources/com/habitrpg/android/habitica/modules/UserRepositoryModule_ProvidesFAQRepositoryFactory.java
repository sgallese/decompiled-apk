package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.local.FAQLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesFAQRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<FAQLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesFAQRepositoryFactory(UserRepositoryModule userRepositoryModule, a<FAQLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesFAQRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<FAQLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesFAQRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static FAQRepository providesFAQRepository(UserRepositoryModule userRepositoryModule, FAQLocalRepository fAQLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (FAQRepository) b.d(userRepositoryModule.providesFAQRepository(fAQLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public FAQRepository get() {
        return providesFAQRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
