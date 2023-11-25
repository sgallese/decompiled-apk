package com.habitrpg.android.habitica.ui.activities;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel;

/* loaded from: classes4.dex */
public final class LoginActivity_MembersInjector implements qa.a<LoginActivity> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SharedPreferences> sharedPrefsProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<AuthenticationViewModel> viewModelProvider;

    public LoginActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<SharedPreferences> aVar4, cc.a<AppConfigManager> aVar5, cc.a<AuthenticationViewModel> aVar6) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.apiClientProvider = aVar3;
        this.sharedPrefsProvider = aVar4;
        this.configManagerProvider = aVar5;
        this.viewModelProvider = aVar6;
    }

    public static qa.a<LoginActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ApiClient> aVar3, cc.a<SharedPreferences> aVar4, cc.a<AppConfigManager> aVar5, cc.a<AuthenticationViewModel> aVar6) {
        return new LoginActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectApiClient(LoginActivity loginActivity, ApiClient apiClient) {
        loginActivity.apiClient = apiClient;
    }

    public static void injectConfigManager(LoginActivity loginActivity, AppConfigManager appConfigManager) {
        loginActivity.configManager = appConfigManager;
    }

    public static void injectSharedPrefs(LoginActivity loginActivity, SharedPreferences sharedPreferences) {
        loginActivity.sharedPrefs = sharedPreferences;
    }

    public static void injectViewModel(LoginActivity loginActivity, AuthenticationViewModel authenticationViewModel) {
        loginActivity.viewModel = authenticationViewModel;
    }

    public void injectMembers(LoginActivity loginActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(loginActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(loginActivity, this.userRepositoryProvider.get());
        injectApiClient(loginActivity, this.apiClientProvider.get());
        injectSharedPrefs(loginActivity, this.sharedPrefsProvider.get());
        injectConfigManager(loginActivity, this.configManagerProvider.get());
        injectViewModel(loginActivity, this.viewModelProvider.get());
    }
}
