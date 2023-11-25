package com.habitrpg.android.habitica.ui.fragments.inventory.equipment;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class EquipmentDetailFragment_MembersInjector implements qa.a<EquipmentDetailFragment> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public EquipmentDetailFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<ReviewManager> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.userViewModelProvider = aVar5;
        this.reviewManagerProvider = aVar6;
    }

    public static qa.a<EquipmentDetailFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<MainUserViewModel> aVar5, cc.a<ReviewManager> aVar6) {
        return new EquipmentDetailFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectInventoryRepository(EquipmentDetailFragment equipmentDetailFragment, InventoryRepository inventoryRepository) {
        equipmentDetailFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectReviewManager(EquipmentDetailFragment equipmentDetailFragment, ReviewManager reviewManager) {
        equipmentDetailFragment.reviewManager = reviewManager;
    }

    public static void injectUserViewModel(EquipmentDetailFragment equipmentDetailFragment, MainUserViewModel mainUserViewModel) {
        equipmentDetailFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(EquipmentDetailFragment equipmentDetailFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(equipmentDetailFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(equipmentDetailFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(equipmentDetailFragment, this.soundManagerProvider.get());
        injectInventoryRepository(equipmentDetailFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(equipmentDetailFragment, this.userViewModelProvider.get());
        injectReviewManager(equipmentDetailFragment, this.reviewManagerProvider.get());
    }
}
