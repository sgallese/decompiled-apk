package com.habitrpg.android.habitica.ui.fragments.inventory.shops;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.SoundManager;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.fragments.BaseMainFragment_MembersInjector;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class ShopFragment_MembersInjector implements qa.a<ShopFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<SoundManager> soundManagerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public ShopFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<SocialRepository> aVar5, cc.a<AppConfigManager> aVar6, cc.a<MainUserViewModel> aVar7) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.soundManagerProvider = aVar3;
        this.inventoryRepositoryProvider = aVar4;
        this.socialRepositoryProvider = aVar5;
        this.configManagerProvider = aVar6;
        this.userViewModelProvider = aVar7;
    }

    public static qa.a<ShopFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<SoundManager> aVar3, cc.a<InventoryRepository> aVar4, cc.a<SocialRepository> aVar5, cc.a<AppConfigManager> aVar6, cc.a<MainUserViewModel> aVar7) {
        return new ShopFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectConfigManager(ShopFragment shopFragment, AppConfigManager appConfigManager) {
        shopFragment.configManager = appConfigManager;
    }

    public static void injectInventoryRepository(ShopFragment shopFragment, InventoryRepository inventoryRepository) {
        shopFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(ShopFragment shopFragment, SocialRepository socialRepository) {
        shopFragment.socialRepository = socialRepository;
    }

    public static void injectUserViewModel(ShopFragment shopFragment, MainUserViewModel mainUserViewModel) {
        shopFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(ShopFragment shopFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(shopFragment, this.tutorialRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectUserRepository(shopFragment, this.userRepositoryProvider.get());
        BaseMainFragment_MembersInjector.injectSoundManager(shopFragment, this.soundManagerProvider.get());
        injectInventoryRepository(shopFragment, this.inventoryRepositoryProvider.get());
        injectSocialRepository(shopFragment, this.socialRepositoryProvider.get());
        injectConfigManager(shopFragment, this.configManagerProvider.get());
        injectUserViewModel(shopFragment, this.userViewModelProvider.get());
    }
}
