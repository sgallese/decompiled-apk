package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.local.CustomizationLocalRepository;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesCustomizationRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<CustomizationLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesCustomizationRepositoryFactory(UserRepositoryModule userRepositoryModule, a<CustomizationLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
    }

    public static UserRepositoryModule_ProvidesCustomizationRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<CustomizationLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3) {
        return new UserRepositoryModule_ProvidesCustomizationRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3);
    }

    public static CustomizationRepository providesCustomizationRepository(UserRepositoryModule userRepositoryModule, CustomizationLocalRepository customizationLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler) {
        return (CustomizationRepository) b.d(userRepositoryModule.providesCustomizationRepository(customizationLocalRepository, apiClient, authenticationHandler));
    }

    @Override // cc.a
    public CustomizationRepository get() {
        return providesCustomizationRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get());
    }
}
