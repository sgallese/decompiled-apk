package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class NotificationsViewModel_Factory implements cc.a {
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public NotificationsViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<NotificationsManager> aVar3, cc.a<SocialRepository> aVar4) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.notificationsManagerProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
    }

    public static NotificationsViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<NotificationsManager> aVar3, cc.a<SocialRepository> aVar4) {
        return new NotificationsViewModel_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static NotificationsViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, NotificationsManager notificationsManager, SocialRepository socialRepository) {
        return new NotificationsViewModel(userRepository, mainUserViewModel, notificationsManager, socialRepository);
    }

    @Override // cc.a
    public NotificationsViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.notificationsManagerProvider.get(), this.socialRepositoryProvider.get());
    }
}
