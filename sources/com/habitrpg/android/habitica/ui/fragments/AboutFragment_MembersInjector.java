package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;

/* loaded from: classes4.dex */
public final class AboutFragment_MembersInjector implements qa.a<AboutFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public AboutFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
    }

    public static qa.a<AboutFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4) {
        return new AboutFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectAppConfigManager(AboutFragment aboutFragment, AppConfigManager appConfigManager) {
        aboutFragment.appConfigManager = appConfigManager;
    }

    public void injectMembers(AboutFragment aboutFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(aboutFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(aboutFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(aboutFragment, this.soundManagerProvider.get());
        injectAppConfigManager(aboutFragment, this.appConfigManagerProvider.get());
    }
}
