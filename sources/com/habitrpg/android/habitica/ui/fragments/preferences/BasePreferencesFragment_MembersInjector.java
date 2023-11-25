package com.habitrpg.android.habitica.ui.fragments.preferences;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class BasePreferencesFragment_MembersInjector implements qa.a<BasePreferencesFragment> {
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public BasePreferencesFragment_MembersInjector(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
    }

    public static qa.a<BasePreferencesFragment> create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2) {
        return new BasePreferencesFragment_MembersInjector(aVar, aVar2);
    }

    public static void injectUserRepository(BasePreferencesFragment basePreferencesFragment, UserRepository userRepository) {
        basePreferencesFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(BasePreferencesFragment basePreferencesFragment, MainUserViewModel mainUserViewModel) {
        basePreferencesFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(BasePreferencesFragment basePreferencesFragment) {
        injectUserRepository(basePreferencesFragment, this.userRepositoryProvider.get());
        injectUserViewModel(basePreferencesFragment, this.userViewModelProvider.get());
    }
}
