package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class MountDetailRecyclerFragment_MembersInjector implements qa.a<MountDetailRecyclerFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public MountDetailRecyclerFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
    }

    public static qa.a<MountDetailRecyclerFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5) {
        return new MountDetailRecyclerFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectInventoryRepository(MountDetailRecyclerFragment mountDetailRecyclerFragment, InventoryRepository inventoryRepository) {
        mountDetailRecyclerFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserViewModel(MountDetailRecyclerFragment mountDetailRecyclerFragment, MainUserViewModel mainUserViewModel) {
        mountDetailRecyclerFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(MountDetailRecyclerFragment mountDetailRecyclerFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(mountDetailRecyclerFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(mountDetailRecyclerFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(mountDetailRecyclerFragment, this.soundManagerProvider.get());
        injectInventoryRepository(mountDetailRecyclerFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(mountDetailRecyclerFragment, this.userViewModelProvider.get());
    }
}
