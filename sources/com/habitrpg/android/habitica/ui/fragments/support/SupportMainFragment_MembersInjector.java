package com.habitrpg.android.habitica.ui.fragments.support;

import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class SupportMainFragment_MembersInjector implements qa.a<SupportMainFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<FAQRepository> faqRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public SupportMainFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<FAQRepository> aVar4, cc.a<AppConfigManager> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.faqRepositoryProvider = aVar4;
        this.appConfigManagerProvider = aVar5;
    }

    public static qa.a<SupportMainFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<FAQRepository> aVar4, cc.a<AppConfigManager> aVar5) {
        return new SupportMainFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectAppConfigManager(SupportMainFragment supportMainFragment, AppConfigManager appConfigManager) {
        supportMainFragment.appConfigManager = appConfigManager;
    }

    public static void injectFaqRepository(SupportMainFragment supportMainFragment, FAQRepository fAQRepository) {
        supportMainFragment.faqRepository = fAQRepository;
    }

    public void injectMembers(SupportMainFragment supportMainFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(supportMainFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(supportMainFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(supportMainFragment, this.soundManagerProvider.get());
        injectFaqRepository(supportMainFragment, this.faqRepositoryProvider.get());
        injectAppConfigManager(supportMainFragment, this.appConfigManagerProvider.get());
    }
}
