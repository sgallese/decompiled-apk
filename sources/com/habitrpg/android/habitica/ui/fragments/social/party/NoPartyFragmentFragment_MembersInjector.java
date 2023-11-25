package com.habitrpg.android.habitica.ui.fragments.social.party;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class NoPartyFragmentFragment_MembersInjector implements qa.a<NoPartyFragmentFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public NoPartyFragmentFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<AppConfigManager> aVar5, cc.a<MainUserViewModel> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
        this.configManagerProvider = aVar5;
        this.userViewModelProvider = aVar6;
    }

    public static qa.a<NoPartyFragmentFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<AppConfigManager> aVar5, cc.a<MainUserViewModel> aVar6) {
        return new NoPartyFragmentFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectConfigManager(NoPartyFragmentFragment noPartyFragmentFragment, AppConfigManager appConfigManager) {
        noPartyFragmentFragment.configManager = appConfigManager;
    }

    public static void injectSocialRepository(NoPartyFragmentFragment noPartyFragmentFragment, SocialRepository socialRepository) {
        noPartyFragmentFragment.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(NoPartyFragmentFragment noPartyFragmentFragment, MainUserViewModel mainUserViewModel) {
        noPartyFragmentFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(NoPartyFragmentFragment noPartyFragmentFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(noPartyFragmentFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(noPartyFragmentFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(noPartyFragmentFragment, this.soundManagerProvider.get());
        injectSocialRepository(noPartyFragmentFragment, this.socialRepositoryProvider.get());
        injectConfigManager(noPartyFragmentFragment, this.configManagerProvider.get());
        injectUserViewModel(noPartyFragmentFragment, this.userViewModelProvider.get());
    }
}
