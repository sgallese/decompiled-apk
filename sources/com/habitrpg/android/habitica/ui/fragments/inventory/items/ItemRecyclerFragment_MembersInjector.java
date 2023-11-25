package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ItemRecyclerFragment_MembersInjector implements qa.a<ItemRecyclerFragment> {
    private final cc.a<HatchPetUseCase> hatchPetUseCaseProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ItemRecyclerFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<HatchPetUseCase> aVar5, cc.a<MainUserViewModel> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.inventoryRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.userRepositoryProvider = aVar4;
        this.hatchPetUseCaseProvider = aVar5;
        this.userViewModelProvider = aVar6;
    }

    public static qa.a<ItemRecyclerFragment> create(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<HatchPetUseCase> aVar5, cc.a<MainUserViewModel> aVar6) {
        return new ItemRecyclerFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectHatchPetUseCase(ItemRecyclerFragment itemRecyclerFragment, HatchPetUseCase hatchPetUseCase) {
        itemRecyclerFragment.hatchPetUseCase = hatchPetUseCase;
    }

    public static void injectInventoryRepository(ItemRecyclerFragment itemRecyclerFragment, InventoryRepository inventoryRepository) {
        itemRecyclerFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(ItemRecyclerFragment itemRecyclerFragment, SocialRepository socialRepository) {
        itemRecyclerFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(ItemRecyclerFragment itemRecyclerFragment, UserRepository userRepository) {
        itemRecyclerFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(ItemRecyclerFragment itemRecyclerFragment, MainUserViewModel mainUserViewModel) {
        itemRecyclerFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ItemRecyclerFragment itemRecyclerFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(itemRecyclerFragment, this.tutorialRepositoryProvider.get());
        injectInventoryRepository(itemRecyclerFragment, this.inventoryRepositoryProvider.get());
        injectSocialRepository(itemRecyclerFragment, this.socialRepositoryProvider.get());
        injectUserRepository(itemRecyclerFragment, this.userRepositoryProvider.get());
        injectHatchPetUseCase(itemRecyclerFragment, this.hatchPetUseCaseProvider.get());
        injectUserViewModel(itemRecyclerFragment, this.userViewModelProvider.get());
    }
}
