package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.data.CustomizationRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class AvatarCustomizationFragment_MembersInjector implements qa.a<AvatarCustomizationFragment> {
    private final cc.a<CustomizationRepository> customizationRepositoryProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public AvatarCustomizationFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<CustomizationRepository> aVar4, cc.a<InventoryRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.customizationRepositoryProvider = aVar4;
        this.inventoryRepositoryProvider = aVar5;
        this.userViewModelProvider = aVar6;
    }

    public static qa.a<AvatarCustomizationFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<CustomizationRepository> aVar4, cc.a<InventoryRepository> aVar5, cc.a<MainUserViewModel> aVar6) {
        return new AvatarCustomizationFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static void injectCustomizationRepository(AvatarCustomizationFragment avatarCustomizationFragment, CustomizationRepository customizationRepository) {
        avatarCustomizationFragment.customizationRepository = customizationRepository;
    }

    public static void injectInventoryRepository(AvatarCustomizationFragment avatarCustomizationFragment, InventoryRepository inventoryRepository) {
        avatarCustomizationFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserViewModel(AvatarCustomizationFragment avatarCustomizationFragment, MainUserViewModel mainUserViewModel) {
        avatarCustomizationFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(AvatarCustomizationFragment avatarCustomizationFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(avatarCustomizationFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(avatarCustomizationFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(avatarCustomizationFragment, this.soundManagerProvider.get());
        injectCustomizationRepository(avatarCustomizationFragment, this.customizationRepositoryProvider.get());
        injectInventoryRepository(avatarCustomizationFragment, this.inventoryRepositoryProvider.get());
        injectUserViewModel(avatarCustomizationFragment, this.userViewModelProvider.get());
    }
}
