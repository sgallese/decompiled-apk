package com.habitrpg.android.habitica.ui.fragments.social.challenges;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class ChallengesOverviewFragment_MembersInjector implements qa.a<ChallengesOverviewFragment> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public ChallengesOverviewFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<ChallengeRepository> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.challengeRepositoryProvider = aVar4;
    }

    public static qa.a<ChallengesOverviewFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<ChallengeRepository> aVar4) {
        return new ChallengesOverviewFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectChallengeRepository(ChallengesOverviewFragment challengesOverviewFragment, ChallengeRepository challengeRepository) {
        challengesOverviewFragment.challengeRepository = challengeRepository;
    }

    public void injectMembers(ChallengesOverviewFragment challengesOverviewFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(challengesOverviewFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(challengesOverviewFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(challengesOverviewFragment, this.soundManagerProvider.get());
        injectChallengeRepository(challengesOverviewFragment, this.challengeRepositoryProvider.get());
    }
}
