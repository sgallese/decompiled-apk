package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ChallengeDetailFragment_MembersInjector implements qa.a<ChallengeDetailFragment> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ChallengeDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<ChallengeRepository> aVar4, cc.a<SocialRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.challengeRepositoryProvider = aVar4;
        this.socialRepositoryProvider = aVar5;
        this.userViewModelProvider = aVar6;
    }

    public static qa.a<ChallengeDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<ChallengeRepository> aVar4, cc.a<SocialRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        return new ChallengeDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectChallengeRepository(ChallengeDetailFragment challengeDetailFragment, ChallengeRepository challengeRepository) {
        challengeDetailFragment.challengeRepository = challengeRepository;
    }

    public static void injectSocialRepository(ChallengeDetailFragment challengeDetailFragment, SocialRepository socialRepository) {
        challengeDetailFragment.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(ChallengeDetailFragment challengeDetailFragment, MainUserViewModel mainUserViewModel) {
        challengeDetailFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ChallengeDetailFragment challengeDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(challengeDetailFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(challengeDetailFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(challengeDetailFragment, this.soundManagerProvider.get());
        injectChallengeRepository(challengeDetailFragment, this.challengeRepositoryProvider.get());
        injectSocialRepository(challengeDetailFragment, this.socialRepositoryProvider.get());
        injectUserViewModel(challengeDetailFragment, this.userViewModelProvider.get());
    }
}
