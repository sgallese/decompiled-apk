package com.habitrpg.android.habitica.modules;

import bb.b;
import cc.a;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.local.TaskLocalRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;

/* loaded from: classes4.dex */
public final class UserRepositoryModule_ProvidesTaskRepositoryFactory implements a {
    private final a<ApiClient> apiClientProvider;
    private final a<AppConfigManager> appConfigManagerProvider;
    private final a<AuthenticationHandler> authenticationHandlerProvider;
    private final a<TaskLocalRepository> localRepositoryProvider;
    private final UserRepositoryModule module;

    public UserRepositoryModule_ProvidesTaskRepositoryFactory(UserRepositoryModule userRepositoryModule, a<TaskLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<AppConfigManager> aVar4) {
        this.module = userRepositoryModule;
        this.localRepositoryProvider = aVar;
        this.apiClientProvider = aVar2;
        this.authenticationHandlerProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
    }

    public static UserRepositoryModule_ProvidesTaskRepositoryFactory create(UserRepositoryModule userRepositoryModule, a<TaskLocalRepository> aVar, a<ApiClient> aVar2, a<AuthenticationHandler> aVar3, a<AppConfigManager> aVar4) {
        return new UserRepositoryModule_ProvidesTaskRepositoryFactory(userRepositoryModule, aVar, aVar2, aVar3, aVar4);
    }

    public static TaskRepository providesTaskRepository(UserRepositoryModule userRepositoryModule, TaskLocalRepository taskLocalRepository, ApiClient apiClient, AuthenticationHandler authenticationHandler, AppConfigManager appConfigManager) {
        return (TaskRepository) b.d(userRepositoryModule.providesTaskRepository(taskLocalRepository, apiClient, authenticationHandler, appConfigManager));
    }

    @Override // cc.a
    public TaskRepository get() {
        return providesTaskRepository(this.module, this.localRepositoryProvider.get(), this.apiClientProvider.get(), this.authenticationHandlerProvider.get(), this.appConfigManagerProvider.get());
    }
}
