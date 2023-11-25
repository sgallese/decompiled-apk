package com.habitrpg.android.habitica.ui.fragments.setup;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SetupCustomizationRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class AvatarSetupFragment_MembersInjector implements qa.a<AvatarSetupFragment> {
    private final cc.a<SetupCustomizationRepository> customizationRepositoryProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public AvatarSetupFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<SetupCustomizationRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<InventoryRepository> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.customizationRepositoryProvider = aVar2;
        this.userRepositoryProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
    }

    public static qa.a<AvatarSetupFragment> create(cc.a<TutorialRepository> aVar, cc.a<SetupCustomizationRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<InventoryRepository> aVar4) {
        return new AvatarSetupFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectCustomizationRepository(AvatarSetupFragment avatarSetupFragment, SetupCustomizationRepository setupCustomizationRepository) {
        avatarSetupFragment.customizationRepository = setupCustomizationRepository;
    }

    public static void injectInventoryRepository(AvatarSetupFragment avatarSetupFragment, InventoryRepository inventoryRepository) {
        avatarSetupFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectUserRepository(AvatarSetupFragment avatarSetupFragment, UserRepository userRepository) {
        avatarSetupFragment.userRepository = userRepository;
    }

    public void injectMembers(AvatarSetupFragment avatarSetupFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(avatarSetupFragment, this.tutorialRepositoryProvider.get());
        injectCustomizationRepository(avatarSetupFragment, this.customizationRepositoryProvider.get());
        injectUserRepository(avatarSetupFragment, this.userRepositoryProvider.get());
        injectInventoryRepository(avatarSetupFragment, this.inventoryRepositoryProvider.get());
    }
}
