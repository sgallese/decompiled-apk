package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class GroupViewModel_Factory implements cc.a {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public GroupViewModel_Factory(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<SocialRepository> aVar4, cc.a<NotificationsManager> aVar5) {
        this.userRepositoryProvider = aVar;
        this.userViewModelProvider = aVar2;
        this.challengeRepositoryProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
        this.notificationsManagerProvider = aVar5;
    }

    public static GroupViewModel_Factory create(cc.a<UserRepository> aVar, cc.a<MainUserViewModel> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<SocialRepository> aVar4, cc.a<NotificationsManager> aVar5) {
        return new GroupViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static GroupViewModel newInstance(UserRepository userRepository, MainUserViewModel mainUserViewModel, ChallengeRepository challengeRepository, SocialRepository socialRepository, NotificationsManager notificationsManager) {
        return new GroupViewModel(userRepository, mainUserViewModel, challengeRepository, socialRepository, notificationsManager);
    }

    @Override // cc.a
    public GroupViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.userViewModelProvider.get(), this.challengeRepositoryProvider.get(), this.socialRepositoryProvider.get(), this.notificationsManagerProvider.get());
    }
}
