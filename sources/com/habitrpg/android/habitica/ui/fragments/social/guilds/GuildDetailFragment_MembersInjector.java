package com.habitrpg.android.habitica.ui.fragments.social.guilds;

import com.habitrpg.android.habitica.data.ChallengeRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class GuildDetailFragment_MembersInjector implements qa.a<GuildDetailFragment> {
    private final cc.a<ChallengeRepository> challengeRepositoryProvider;
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GuildDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<UserRepository> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.configManagerProvider = aVar2;
        this.challengeRepositoryProvider = aVar3;
        this.userRepositoryProvider = aVar4;
    }

    public static qa.a<GuildDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<AppConfigManager> aVar2, cc.a<ChallengeRepository> aVar3, cc.a<UserRepository> aVar4) {
        return new GuildDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectChallengeRepository(GuildDetailFragment guildDetailFragment, ChallengeRepository challengeRepository) {
        guildDetailFragment.challengeRepository = challengeRepository;
    }

    public static void injectConfigManager(GuildDetailFragment guildDetailFragment, AppConfigManager appConfigManager) {
        guildDetailFragment.configManager = appConfigManager;
    }

    public static void injectUserRepository(GuildDetailFragment guildDetailFragment, UserRepository userRepository) {
        guildDetailFragment.userRepository = userRepository;
    }

    public void injectMembers(GuildDetailFragment guildDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(guildDetailFragment, this.tutorialRepositoryProvider.get());
        injectConfigManager(guildDetailFragment, this.configManagerProvider.get());
        injectChallengeRepository(guildDetailFragment, this.challengeRepositoryProvider.get());
        injectUserRepository(guildDetailFragment, this.userRepositoryProvider.get());
    }
}
