package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.NotificationsManager;

/* loaded from: classes4.dex */
public final class NotificationsActivity_MembersInjector implements qa.a<NotificationsActivity> {
    private final cc.a<InventoryRepository> inventoryRepositoryProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public NotificationsActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<SocialRepository> aVar4) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.inventoryRepositoryProvider = aVar3;
        this.socialRepositoryProvider = aVar4;
    }

    public static qa.a<NotificationsActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<InventoryRepository> aVar3, cc.a<SocialRepository> aVar4) {
        return new NotificationsActivity_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectInventoryRepository(NotificationsActivity notificationsActivity, InventoryRepository inventoryRepository) {
        notificationsActivity.inventoryRepository = inventoryRepository;
    }

    public static void injectSocialRepository(NotificationsActivity notificationsActivity, SocialRepository socialRepository) {
        notificationsActivity.socialRepository = socialRepository;
    }

    public void injectMembers(NotificationsActivity notificationsActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(notificationsActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(notificationsActivity, this.userRepositoryProvider.get());
        injectInventoryRepository(notificationsActivity, this.inventoryRepositoryProvider.get());
        injectSocialRepository(notificationsActivity, this.socialRepositoryProvider.get());
    }
}
