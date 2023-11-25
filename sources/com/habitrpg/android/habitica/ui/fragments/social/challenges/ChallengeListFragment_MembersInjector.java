package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ChallengeListFragment_MembersInjector implements qa.a<ChallengeListFragment> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ChallengeListFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<ChallengeRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.challengeRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.userRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<ChallengeListFragment> create(cc.a<TutorialRepository> aVar, cc.a<ChallengeRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new ChallengeListFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectChallengeRepository(ChallengeListFragment challengeListFragment, ChallengeRepository challengeRepository) {
        challengeListFragment.challengeRepository = challengeRepository;
    }

    public static void injectSocialRepository(ChallengeListFragment challengeListFragment, SocialRepository socialRepository) {
        challengeListFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(ChallengeListFragment challengeListFragment, UserRepository userRepository) {
        challengeListFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(ChallengeListFragment challengeListFragment, MainUserViewModel mainUserViewModel) {
        challengeListFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ChallengeListFragment challengeListFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(challengeListFragment, this.tutorialRepositoryProvider.get());
        injectChallengeRepository(challengeListFragment, this.challengeRepositoryProvider.get());
        injectSocialRepository(challengeListFragment, this.socialRepositoryProvider.get());
        injectUserRepository(challengeListFragment, this.userRepositoryProvider.get());
        injectUserViewModel(challengeListFragment, this.userViewModelProvider.get());
    }
}
