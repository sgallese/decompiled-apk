package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.data.local.UserLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesUserRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AppConfigManager> appConfigManagerProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<UserLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;
    private final a<TaskRepository> taskRepositoryProvider;

    public UserRepositoryModule_ProvidesUserRepositoryFactory(UserRepositoryModule userRepositoryModule, a<UserLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<TaskRepository> aVar4, a<AppConfigManager> aVar5) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
        this.taskRepositoryProvider = aVar4;
        this.appConfigManagerProvider = aVar5;
    }

    public static UserRepositoryModule_ProvidesUserRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<UserLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<TaskRepository> aVar4, a<AppConfigManager> aVar5) {
        return new UserRepositoryModule_ProvidesUserRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static UserRepository providesUserRepository(UserRepositoryModule userRepositoryModule, UserLocalRepository userLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, TaskRepository taskRepository, AppConfigManager appConfigManager) {
        return (UserRepository) b.d(userRepositoryModule.providesUserRepository(userLocalRepository, apiClient, authenticationHandler, taskRepository, appConfigManager));
    }

    @Override // cc.a
    public UserRepository get() {
        return providesUserRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get(), this.taskRepositoryProvider.get(), this.appConfigManagerProvider.get());
    }
}
