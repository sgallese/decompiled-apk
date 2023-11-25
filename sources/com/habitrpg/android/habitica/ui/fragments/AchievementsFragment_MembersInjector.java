package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class AchievementsFragment_MembersInjector implements qa.a<AchievementsFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public AchievementsFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<AchievementsFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new AchievementsFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectInventoryRepository(AchievementsFragment achievementsFragment, InventoryRepository inventoryRepository) {
        achievementsFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserViewModel(AchievementsFragment achievementsFragment, MainUserViewModel mainUserViewModel) {
        achievementsFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(AchievementsFragment achievementsFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(achievementsFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(achievementsFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(achievementsFragment, this.soundManagerProvider.get());
        injectInventoryRepository(achievementsFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(achievementsFragment, this.userViewModelProvider.get());
    }
}
