package com.habitrpg.android.habitica.ui.fragments;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class StatsFragment_MembersInjector implements qa.a<StatsFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public StatsFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<StatsFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new StatsFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectInventoryRepository(StatsFragment statsFragment, InventoryRepository inventoryRepository) {
        statsFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserViewModel(StatsFragment statsFragment, MainUserViewModel mainUserViewModel) {
        statsFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(StatsFragment statsFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(statsFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(statsFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(statsFragment, this.soundManagerProvider.get());
        injectInventoryRepository(statsFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(statsFragment, this.userViewModelProvider.get());
    }
}
