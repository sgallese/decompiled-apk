package com.habitrpg.android.habitica.ui.fragments;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ContentRepository;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;

/* loaded from: classes4.dex */
public final class NavigationDrawerFragment_MembersInjector implements qa.a<NavigationDrawerFragment> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<ContentRepository> contentRepositoryProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<SharedPreferences> sharedPreferencesProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;
    private final cc.a<MainUserViewModel> userViewModelProvider;

    public NavigationDrawerFragment_MembersInjector(cc.a<SocialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<ContentRepository> aVar5, cc.a<SharedPreferences> aVar6, cc.a<MainUserViewModel> aVar7) {
        this.socialRepositoryProvider = aVar;
        this.inventoryRepositoryProvider = aVar2;
        this.userRepositoryProvider = aVar3;
        this.configManagerProvider = aVar4;
        this.contentRepositoryProvider = aVar5;
        this.sharedPreferencesProvider = aVar6;
        this.userViewModelProvider = aVar7;
    }

    public static qa.a<NavigationDrawerFragment> create(cc.a<SocialRepository> aVar, cc.a<InventoryRepository> aVar2, cc.a<UserRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<ContentRepository> aVar5, cc.a<SharedPreferences> aVar6, cc.a<MainUserViewModel> aVar7) {
        return new NavigationDrawerFragment_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectConfigManager(NavigationDrawerFragment navigationDrawerFragment, AppConfigManager appConfigManager) {
        navigationDrawerFragment.configManager = appConfigManager;
    }

    public static void injectContentRepository(NavigationDrawerFragment navigationDrawerFragment, ContentRepository contentRepository) {
        navigationDrawerFragment.contentRepository = contentRepository;
    }

    public static void injectInventoryRepository(NavigationDrawerFragment navigationDrawerFragment, InventoryRepository inventoryRepository) {
        navigationDrawerFragment.inventoryRepository = inventoryRepository;
    }

    public static void injectSharedPreferences(NavigationDrawerFragment navigationDrawerFragment, SharedPreferences sharedPreferences) {
        navigationDrawerFragment.sharedPreferences = sharedPreferences;
    }

    public static void injectSocialRepository(NavigationDrawerFragment navigationDrawerFragment, SocialRepository socialRepository) {
        navigationDrawerFragment.socialRepository = socialRepository;
    }

    public static void injectUserRepository(NavigationDrawerFragment navigationDrawerFragment, UserRepository userRepository) {
        navigationDrawerFragment.userRepository = userRepository;
    }

    public static void injectUserViewModel(NavigationDrawerFragment navigationDrawerFragment, MainUserViewModel mainUserViewModel) {
        navigationDrawerFragment.userViewModel = mainUserViewModel;
    }

    public void injectMembers(NavigationDrawerFragment navigationDrawerFragment) {
        injectSocialRepository(navigationDrawerFragment, this.socialRepositoryProvider.get());
        injectInventoryRepository(navigationDrawerFragment, this.inventoryRepositoryProvider.get());
        injectUserRepository(navigationDrawerFragment, this.userRepositoryProvider.get());
        injectConfigManager(navigationDrawerFragment, this.configManagerProvider.get());
        injectContentRepository(navigationDrawerFragment, this.contentRepositoryProvider.get());
        injectSharedPreferences(navigationDrawerFragment, this.sharedPreferencesProvider.get());
        injectUserViewModel(navigationDrawerFragment, this.userViewModelProvider.get());
    }
}
