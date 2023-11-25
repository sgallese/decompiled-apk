package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class StableRecyclerFragment_MembersInjector implements qa.a<StableRecyclerFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public StableRecyclerFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.inventoryRepositoryProvider = aVar2;
        this.userRepositoryProvider = aVar3;
        this.configManagerProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<StableRecyclerFragment> create(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new StableRecyclerFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectConfigManager(StableRecyclerFragment stableRecyclerFragment, AppConfigManager appConfigManager) {
        stableRecyclerFragment.configManager = appConfigManager;
    }

    public static void injectInventoryRepository(StableRecyclerFragment stableRecyclerFragment, InventoryRepository inventoryRepository) {
        stableRecyclerFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserRepository(StableRecyclerFragment stableRecyclerFragment, UserRepository userRepository) {
        stableRecyclerFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(StableRecyclerFragment stableRecyclerFragment, MainUserViewModel mainUserViewModel) {
        stableRecyclerFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(StableRecyclerFragment stableRecyclerFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(stableRecyclerFragment, this.tutorialRepositoryProvider.get());
        injectInventoryRepository(stableRecyclerFragment, this.inventoryRepositoryProvider.get());
        injectUserRepository(stableRecyclerFragment, this.userRepositoryProvider.get());
        injectConfigManager(stableRecyclerFragment, this.configManagerProvider.get());
        injectUserViewModel(stableRecyclerFragment, this.userViewModelProvider.get());
    }
}
