package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.local.TutorialLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTutorialRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<TutorialLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesTutorialRepositoryFactory(UserRepositoryModule userRepositoryModule, a<TutorialLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesTutorialRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<TutorialLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesTutorialRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static TutorialRepository providesTutorialRepository(UserRepositoryModule userRepositoryModule, TutorialLocalRepository tutorialLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (TutorialRepository) b.d(userRepositoryModule.providesTutorialRepository(tutorialLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public TutorialRepository get() {
        return providesTutorialRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
