package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;

/* loaded from: classes4.dex */
public final class PromoInfoFragment_MembersInjector implements qa.a<PromoInfoFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public PromoInfoFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.configManagerProvider = aVar4;
    }

    public static qa.a<PromoInfoFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4) {
        return new PromoInfoFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectConfigManager(PromoInfoFragment promoInfoFragment, AppConfigManager appConfigManager) {
        promoInfoFragment.configManager = appConfigManager;
    }

    public void injectMembers(PromoInfoFragment promoInfoFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(promoInfoFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(promoInfoFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(promoInfoFragment, this.soundManagerProvider.get());
        injectConfigManager(promoInfoFragment, this.configManagerProvider.get());
    }
}
