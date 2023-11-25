package com.habitrpg.android.habitica.ui.viewmodels;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.modules.AuthenticationHandler;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.KeyHelper;

/* loaded from: classes4.dex */
public final class AuthenticationViewModel_Factory implements cc.a {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<AuthenticationHandler> authenticationHandlerProvider;
    private final cc.a<HostConfig> hostConfigProvider;
    private final cc.a<KeyHelper> keyHelperProvider;
    private final cc.a<SharedPreferences> sharedPrefsProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public AuthenticationViewModel_Factory(cc.a<ApiClient> aVar, cc.a<UserRepository> aVar2, cc.a<SharedPreferences> aVar3, cc.a<AuthenticationHandler> aVar4, cc.a<HostConfig> aVar5, cc.a<KeyHelper> aVar6) {
        this.apiClientProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.sharedPrefsProvider = aVar3;
        this.authenticationHandlerProvider = aVar4;
        this.hostConfigProvider = aVar5;
        this.keyHelperProvider = aVar6;
    }

    public static AuthenticationViewModel_Factory create(cc.a<ApiClient> aVar, cc.a<UserRepository> aVar2, cc.a<SharedPreferences> aVar3, cc.a<AuthenticationHandler> aVar4, cc.a<HostConfig> aVar5, cc.a<KeyHelper> aVar6) {
        return new AuthenticationViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static AuthenticationViewModel newInstance(ApiClient apiClient, UserRepository userRepository, SharedPreferences sharedPreferences, AuthenticationHandler authenticationHandler, HostConfig hostConfig, KeyHelper keyHelper) {
        return new AuthenticationViewModel(apiClient, userRepository, sharedPreferences, authenticationHandler, hostConfig, keyHelper);
    }

    @Override // cc.a
    public AuthenticationViewModel get() {
        return newInstance(this.apiClientProvider.get(), this.userRepositoryProvider.get(), this.sharedPrefsProvider.get(), this.authenticationHandlerProvider.get(), this.hostConfigProvider.get(), this.keyHelperProvider.get());
    }
}
