package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;

/* loaded from: classes4.dex */
public final class GiftGemsActivity_MembersInjector implements qa.a<GiftGemsActivity> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GiftGemsActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<PurchaseHandler> aVar5) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.purchaseHandlerProvider = aVar5;
    }

    public static qa.a<GiftGemsActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<PurchaseHandler> aVar5) {
        return new GiftGemsActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectAppConfigManager(GiftGemsActivity giftGemsActivity, AppConfigManager appConfigManager) {
        giftGemsActivity.appConfigManager = appConfigManager;
    }

    public static void injectPurchaseHandler(GiftGemsActivity giftGemsActivity, PurchaseHandler purchaseHandler) {
        giftGemsActivity.purchaseHandler = purchaseHandler;
    }

    public static void injectSocialRepository(GiftGemsActivity giftGemsActivity, SocialRepository socialRepository) {
        giftGemsActivity.socialRepository = socialRepository;
    }

    public void injectMembers(GiftGemsActivity giftGemsActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(giftGemsActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(giftGemsActivity, this.userRepositoryProvider.get());
        injectSocialRepository(giftGemsActivity, this.socialRepositoryProvider.get());
        injectAppConfigManager(giftGemsActivity, this.appConfigManagerProvider.get());
        injectPurchaseHandler(giftGemsActivity, this.purchaseHandlerProvider.get());
    }
}
