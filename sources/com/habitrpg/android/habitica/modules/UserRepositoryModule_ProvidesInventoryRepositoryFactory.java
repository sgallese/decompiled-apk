package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.local.InventoryLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesInventoryRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<InventoryLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;
    private final a<AppConfigManager> remoteConfigProvider;

    public UserRepositoryModule_ProvidesInventoryRepositoryFactory(UserRepositoryModule userRepositoryModule, a<InventoryLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<AppConfigManager> aVar4) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
        this.remoteConfigProvider = aVar4;
    }

    public static UserRepositoryModule_ProvidesInventoryRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<InventoryLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<AppConfigManager> aVar4) {
        return new UserRepositoryModule_ProvidesInventoryRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3, aVar4);
    }

    public static InventoryRepository providesInventoryRepository(UserRepositoryModule userRepositoryModule, InventoryLocalRepository inventoryLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        return (InventoryRepository) b.d(userRepositoryModule.providesInventoryRepository(inventoryLocalRepository, apiClient, authenticationHandler, appConfigManager));
    }

    @Override // cc.a
    public InventoryRepository get() {
        return providesInventoryRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get(), this.remoteConfigProvider.get());
    }
}
