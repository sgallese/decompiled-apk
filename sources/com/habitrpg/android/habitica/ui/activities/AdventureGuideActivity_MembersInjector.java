package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class AdventureGuideActivity_MembersInjector implements qa.a<AdventureGuideActivity> {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public AdventureGuideActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.userViewModelProvider = aVar3;
    }

    public static qa.a<AdventureGuideActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<MainUserViewModel> aVar3) {
        return new AdventureGuideActivity_MembersInjector(aVar, aVar2, aVar3);
    }

    public static void injectUserViewModel(AdventureGuideActivity adventureGuideActivity, MainUserViewModel mainUserViewModel) {
        adventureGuideActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(AdventureGuideActivity adventureGuideActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(adventureGuideActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(adventureGuideActivity, this.userRepositoryProvider.get());
        injectUserViewModel(adventureGuideActivity, this.userViewModelProvider.get());
    }
}
