package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.AuthenticationViewModel;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.common.habitica.api.HostConfig;

/* loaded from: classes4.dex */
public final class AccountPreferenceFragment_MembersInjector implements qa.a<AccountPreferenceFragment> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<HostConfig> hostConfigProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;
    private final cc.a<AuthenticationViewModel> viewModelProvider;

    public AccountPreferenceFragment_MembersInjector(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<HostConfig> aVar3, cc.a<ApiClient> aVar4, cc.a<AuthenticationViewModel> aVar5) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.hostConfigProvider = aVar3;
        this.apiClientProvider = aVar4;
        this.viewModelProvider = aVar5;
    }

    public static qa.a<AccountPreferenceFragment> create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<HostConfig> aVar3, cc.a<ApiClient> aVar4, cc.a<AuthenticationViewModel> aVar5) {
        return new AccountPreferenceFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectApiClient(AccountPreferenceFragment accountPreferenceFragment, ApiClient apiClient) {
        accountPreferenceFragment.apiClient = apiClient;
    }

    public static void injectHostConfig(AccountPreferenceFragment accountPreferenceFragment, HostConfig hostConfig) {
        accountPreferenceFragment.hostConfig = hostConfig;
    }

    public static void injectViewModel(AccountPreferenceFragment accountPreferenceFragment, AuthenticationViewModel authenticationViewModel) {
        accountPreferenceFragment.viewModel = authenticationViewModel;
    }

    public void injectMembers(AccountPreferenceFragment accountPreferenceFragment) {
        BasePreferencesFragment_MembersInjector.injectUserRepository(accountPreferenceFragment, this.userRepositoryProvider.get());
        BasePreferencesFragment_MembersInjector.injectUserViewModel(accountPreferenceFragment, this.userViewModelProvider.get());
        injectHostConfig(accountPreferenceFragment, this.hostConfigProvider.get());
        injectApiClient(accountPreferenceFragment, this.apiClientProvider.get());
        injectViewModel(accountPreferenceFragment, this.viewModelProvider.get());
    }
}
