package com.habitrpg.android.habitica.ui.fragments.support;

import com.habitrpg.android.habitica.data.FAQRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class FAQOverviewFragment_MembersInjector implements qa.a<FAQOverviewFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<FAQRepository> faqRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public FAQOverviewFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<FAQRepository> aVar6, cc.a<AppConfigManager> aVar7) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.userViewModelProvider = aVar5;
        this.faqRepositoryProvider = aVar6;
        this.configManagerProvider = aVar7;
    }

    public static qa.a<FAQOverviewFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<FAQRepository> aVar6, cc.a<AppConfigManager> aVar7) {
        return new FAQOverviewFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectAppConfigManager(FAQOverviewFragment fAQOverviewFragment, AppConfigManager appConfigManager) {
        fAQOverviewFragment.appConfigManager = appConfigManager;
    }

    public static void injectConfigManager(FAQOverviewFragment fAQOverviewFragment, AppConfigManager appConfigManager) {
        fAQOverviewFragment.configManager = appConfigManager;
    }

    public static void injectFaqRepository(FAQOverviewFragment fAQOverviewFragment, FAQRepository fAQRepository) {
        fAQOverviewFragment.faqRepository = fAQRepository;
    }

    public static void injectUserViewModel(FAQOverviewFragment fAQOverviewFragment, MainUserViewModel mainUserViewModel) {
        fAQOverviewFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(FAQOverviewFragment fAQOverviewFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(fAQOverviewFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(fAQOverviewFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(fAQOverviewFragment, this.soundManagerProvider.get());
        injectAppConfigManager(fAQOverviewFragment, this.appConfigManagerProvider.get());
        injectUserViewModel(fAQOverviewFragment, this.userViewModelProvider.get());
        injectFaqRepository(fAQOverviewFragment, this.faqRepositoryProvider.get());
        injectConfigManager(fAQOverviewFragment, this.configManagerProvider.get());
    }
}
