package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ChallengeFormActivity_MembersInjector implements qa.a<ChallengeFormActivity> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ChallengeFormActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<SocialRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.challengeRepositoryProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<ChallengeFormActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<SocialRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new ChallengeFormActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectChallengeRepository(ChallengeFormActivity challengeFormActivity, ChallengeRepository challengeRepository) {
        challengeFormActivity.challengeRepository = challengeRepository;
    }

    public static void injectSocialRepository(ChallengeFormActivity challengeFormActivity, SocialRepository socialRepository) {
        challengeFormActivity.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(ChallengeFormActivity challengeFormActivity, MainUserViewModel mainUserViewModel) {
        challengeFormActivity.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ChallengeFormActivity challengeFormActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(challengeFormActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(challengeFormActivity, this.userRepositoryProvider.get());
        injectChallengeRepository(challengeFormActivity, this.challengeRepositoryProvider.get());
        injectSocialRepository(challengeFormActivity, this.socialRepositoryProvider.get());
        injectUserViewModel(challengeFormActivity, this.userViewModelProvider.get());
    }
}
