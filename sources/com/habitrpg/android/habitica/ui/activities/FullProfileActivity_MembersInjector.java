package com.habitrpg.android.habitica.ui.activities;

import android.content.SharedPreferences;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.ReviewManager;

/* loaded from: classes4.dex */
public final class FullProfileActivity_MembersInjector implements qa.a<FullProfileActivity> {
    private final cc.a<ApiClient> apiClientProvider;
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<ReviewManager> reviewManagerProvider;
    private final cc.a<SharedPreferences> sharedPrefsProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public FullProfileActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<ApiClient> aVar4, cc.a<SocialRepository> aVar5, cc.a<SharedPreferences> aVar6, cc.a<ReviewManager> aVar7) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.apiClientProvider = aVar4;
        this.socialRepositoryProvider = aVar5;
        this.sharedPrefsProvider = aVar6;
        this.reviewManagerProvider = aVar7;
    }

    public static qa.a<FullProfileActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<ApiClient> aVar4, cc.a<SocialRepository> aVar5, cc.a<SharedPreferences> aVar6, cc.a<ReviewManager> aVar7) {
        return new FullProfileActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static void injectApiClient(FullProfileActivity fullProfileActivity, ApiClient apiClient) {
        fullProfileActivity.apiClient = apiClient;
    }

    public static void injectInventoryRepository(FullProfileActivity fullProfileActivity, InventoryRepository inventoryRepository) {
        fullProfileActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectReviewManager(FullProfileActivity fullProfileActivity, ReviewManager reviewManager) {
        fullProfileActivity.reviewManager = reviewManager;
    }

    public static void injectSharedPrefs(FullProfileActivity fullProfileActivity, SharedPreferences sharedPreferences) {
        fullProfileActivity.sharedPrefs = sharedPreferences;
    }

    public static void injectSocialRepository(FullProfileActivity fullProfileActivity, SocialRepository socialRepository) {
        fullProfileActivity.socialRepository = socialRepository;
    }

    public void injectMembers(FullProfileActivity fullProfileActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(fullProfileActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(fullProfileActivity, this.userRepositoryProvider.get());
        injectInventoryRepository(fullProfileActivity, this.inventoryRepositoryProvider.get());
        injectApiClient(fullProfileActivity, this.apiClientProvider.get());
        injectSocialRepository(fullProfileActivity, this.socialRepositoryProvider.get());
        injectSharedPrefs(fullProfileActivity, this.sharedPrefsProvider.get());
        injectReviewManager(fullProfileActivity, this.reviewManagerProvider.get());
    }
}
