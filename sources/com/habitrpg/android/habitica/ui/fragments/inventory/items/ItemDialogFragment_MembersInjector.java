package com.habitrpg.android.habitica.ui.fragments.inventory.items;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.interactors.HatchPetUseCase;
import com.habitrpg.android.habitica.ui.fragments.BaseDialogFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ItemDialogFragment_MembersInjector implements qa.a<ItemDialogFragment> {
    private final cc.a<FeedPetUseCase> feedPetUseCaseProvider;
    private final cc.a<HatchPetUseCase> hatchPetUseCaseProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ItemDialogFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<HatchPetUseCase> aVar5, cc.a<FeedPetUseCase> aVar6, cc.a<MainUserViewModel> aVar7) {
        this.tutorialRepositoryProvider = aVar;
        this.inventoryRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.userRepositoryProvider = aVar4;
        this.hatchPetUseCaseProvider = aVar5;
        this.feedPetUseCaseProvider = aVar6;
        this.userViewModelProvider = aVar7;
    }

    public static qa.a<ItemDialogFragment> create(cc.a<TutorialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<UserRepository> aVar4, cc.a<HatchPetUseCase> aVar5, cc.a<FeedPetUseCase> aVar6, cc.a<MainUserViewModel> aVar7) {
        return new ItemDialogFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectFeedPetUseCase(ItemDialogFragment itemDialogFragment, FeedPetUseCase feedPetUseCase) {
        itemDialogFragment.feedPetUseCase = feedPetUseCase;
    }

    public static void injectHatchPetUseCase(ItemDialogFragment itemDialogFragment, HatchPetUseCase hatchPetUseCase) {
        itemDialogFragment.hatchPetUseCase = hatchPetUseCase;
    }

    public static void injectInventoryRepository(ItemDialogFragment itemDialogFragment, InventoryRepository inventoryRepository) {
        itemDialogFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(ItemDialogFragment itemDialogFragment, SocialRepository socialRepository) {
        itemDialogFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(ItemDialogFragment itemDialogFragment, UserRepository userRepository) {
        itemDialogFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(ItemDialogFragment itemDialogFragment, MainUserViewModel mainUserViewModel) {
        itemDialogFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ItemDialogFragment itemDialogFragment) {
        BaseDialogFragment_MembersInjector.injectTutorialRepository(itemDialogFragment, this.tutorialRepositoryProvider.get());
        injectInventoryRepository(itemDialogFragment, this.inventoryRepositoryProvider.get());
        injectSocialRepository(itemDialogFragment, this.socialRepositoryProvider.get());
        injectUserRepository(itemDialogFragment, this.userRepositoryProvider.get());
        injectHatchPetUseCase(itemDialogFragment, this.hatchPetUseCaseProvider.get());
        injectFeedPetUseCase(itemDialogFragment, this.feedPetUseCaseProvider.get());
        injectUserViewModel(itemDialogFragment, this.userViewModelProvider.get());
    }
}
