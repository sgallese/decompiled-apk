package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TagRepository;
import com.habitrpg.android.habitica.data.local.TagLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTagRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<TagLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesTagRepositoryFactory(UserRepositoryModule userRepositoryModule, a<TagLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesTagRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<TagLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesTagRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static TagRepository providesTagRepository(UserRepositoryModule userRepositoryModule, TagLocalRepository tagLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (TagRepository) b.d(userRepositoryModule.providesTagRepository(tagLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public TagRepository get() {
        return providesTagRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
