package com.habitrpg.android.habitica.ui.fragments.social;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class QuestDetailFragment_MembersInjector implements qa.a<QuestDetailFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public QuestDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<InventoryRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
        this.inventoryRepositoryProvider = aVar5;
        this.userViewModelProvider = aVar6;
    }

    public static qa.a<QuestDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<SocialRepository> aVar4, cc.a<InventoryRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        return new QuestDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectInventoryRepository(QuestDetailFragment questDetailFragment, InventoryRepository inventoryRepository) {
        questDetailFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(QuestDetailFragment questDetailFragment, SocialRepository socialRepository) {
        questDetailFragment.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(QuestDetailFragment questDetailFragment, MainUserViewModel mainUserViewModel) {
        questDetailFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(QuestDetailFragment questDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(questDetailFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(questDetailFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(questDetailFragment, this.soundManagerProvider.get());
        injectSocialRepository(questDetailFragment, this.socialRepositoryProvider.get());
        injectInventoryRepository(questDetailFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(questDetailFragment, this.userViewModelProvider.get());
    }
}
