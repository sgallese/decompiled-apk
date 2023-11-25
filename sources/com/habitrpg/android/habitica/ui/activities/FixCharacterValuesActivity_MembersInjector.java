package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class FixCharacterValuesActivity_MembersInjector implements qa.a<FixCharacterValuesActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public FixCharacterValuesActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
    }

    public static qa.a<FixCharacterValuesActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        return new FixCharacterValuesActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectUserViewModel(FixCharacterValuesActivity fixCharacterValuesActivity, MainUserViewModel mainUserViewModel) {
        fixCharacterValuesActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(FixCharacterValuesActivity fixCharacterValuesActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(fixCharacterValuesActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(fixCharacterValuesActivity, this.userRepositoryProvider.get());
        injectUserViewModel(fixCharacterValuesActivity, this.userViewModelProvider.get());
    }
}
