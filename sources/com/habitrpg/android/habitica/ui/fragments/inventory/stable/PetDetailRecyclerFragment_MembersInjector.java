package com.habitrpg.android.habitica.ui.fragments.inventory.stable;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.interactors.FeedPetUseCase;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class PetDetailRecyclerFragment_MembersInjector implements qa.a<PetDetailRecyclerFragment> {
    private final cc.a<FeedPetUseCase> feedPetUseCaseProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public PetDetailRecyclerFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<FeedPetUseCase> aVar5, cc.a<MainUserViewModel> aVar6, cc.a<ReviewManager> aVar7) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.feedPetUseCaseProvider = aVar5;
        this.userViewModelProvider = aVar6;
        this.reviewManagerProvider = aVar7;
    }

    public static qa.a<PetDetailRecyclerFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<FeedPetUseCase> aVar5, cc.a<MainUserViewModel> aVar6, cc.a<ReviewManager> aVar7) {
        return new PetDetailRecyclerFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectFeedPetUseCase(PetDetailRecyclerFragment petDetailRecyclerFragment, FeedPetUseCase feedPetUseCase) {
        petDetailRecyclerFragment.feedPetUseCase = feedPetUseCase;
    }

    public static void injectInventoryRepository(PetDetailRecyclerFragment petDetailRecyclerFragment, InventoryRepository inventoryRepository) {
        petDetailRecyclerFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectReviewManager(PetDetailRecyclerFragment petDetailRecyclerFragment, ReviewManager reviewManager) {
        petDetailRecyclerFragment.reviewManager = reviewManager;
    }

    public static void injectUserViewModel(PetDetailRecyclerFragment petDetailRecyclerFragment, MainUserViewModel mainUserViewModel) {
        petDetailRecyclerFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(PetDetailRecyclerFragment petDetailRecyclerFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(petDetailRecyclerFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(petDetailRecyclerFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(petDetailRecyclerFragment, this.soundManagerProvider.get());
        injectInventoryRepository(petDetailRecyclerFragment, this.inventoryRepositoryProvider.get());
        injectFeedPetUseCase(petDetailRecyclerFragment, this.feedPetUseCaseProvider.get());
        injectUserViewModel(petDetailRecyclerFragment, this.userViewModelProvider.get());
        injectReviewManager(petDetailRecyclerFragment, this.reviewManagerProvider.get());
    }
}
