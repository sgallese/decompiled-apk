package com.habitrpg.android.habitica.ui.fragments.support;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class BugFixFragment_MembersInjector implements qa.a<BugFixFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public BugFixFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<BugFixFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new BugFixFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectAppConfigManager(BugFixFragment bugFixFragment, AppConfigManager appConfigManager) {
        bugFixFragment.appConfigManager = appConfigManager;
    }

    public static void injectUserViewModel(BugFixFragment bugFixFragment, MainUserViewModel mainUserViewModel) {
        bugFixFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(BugFixFragment bugFixFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(bugFixFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(bugFixFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(bugFixFragment, this.soundManagerProvider.get());
        injectAppConfigManager(bugFixFragment, this.appConfigManagerProvider.get());
        injectUserViewModel(bugFixFragment, this.userViewModelProvider.get());
    }
}
