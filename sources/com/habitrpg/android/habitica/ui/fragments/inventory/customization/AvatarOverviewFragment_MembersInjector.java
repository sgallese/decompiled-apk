package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class AvatarOverviewFragment_MembersInjector implements qa.a<AvatarOverviewFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public AvatarOverviewFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4, cc.a<InventoryRepository> aVar5) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.userViewModelProvider = aVar4;
        this.inventoryRepositoryProvider = aVar5;
    }

    public static qa.a<AvatarOverviewFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<MainUserViewModel> aVar4, cc.a<InventoryRepository> aVar5) {
        return new AvatarOverviewFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectInventoryRepository(AvatarOverviewFragment avatarOverviewFragment, InventoryRepository inventoryRepository) {
        avatarOverviewFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserViewModel(AvatarOverviewFragment avatarOverviewFragment, MainUserViewModel mainUserViewModel) {
        avatarOverviewFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(AvatarOverviewFragment avatarOverviewFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(avatarOverviewFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(avatarOverviewFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(avatarOverviewFragment, this.soundManagerProvider.get());
        injectUserViewModel(avatarOverviewFragment, this.userViewModelProvider.get());
        injectInventoryRepository(avatarOverviewFragment, this.inventoryRepositoryProvider.get());
    }
}
