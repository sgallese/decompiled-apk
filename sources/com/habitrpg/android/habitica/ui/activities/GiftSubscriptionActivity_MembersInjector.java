package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.NotificationsManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;

/* loaded from: classes4.dex */
public final class GiftSubscriptionActivity_MembersInjector implements qa.a<GiftSubscriptionActivity> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<NotificationsManager> notificationsManagerProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<SocialRepository> socialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GiftSubscriptionActivity_MembersInjector(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<PurchaseHandler> aVar5) {
        this.notificationsManagerProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.socialRepositoryProvider = aVar3;
        this.appConfigManagerProvider = aVar4;
        this.purchaseHandlerProvider = aVar5;
    }

    public static qa.a<GiftSubscriptionActivity> create(cc.a<NotificationsManager> aVar, cc.a<UserRepository> aVar2, cc.a<SocialRepository> aVar3, cc.a<AppConfigManager> aVar4, cc.a<PurchaseHandler> aVar5) {
        return new GiftSubscriptionActivity_MembersInjector(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static void injectAppConfigManager(GiftSubscriptionActivity giftSubscriptionActivity, AppConfigManager appConfigManager) {
        giftSubscriptionActivity.appConfigManager = appConfigManager;
    }

    public static void injectPurchaseHandler(GiftSubscriptionActivity giftSubscriptionActivity, PurchaseHandler purchaseHandler) {
        giftSubscriptionActivity.purchaseHandler = purchaseHandler;
    }

    public static void injectSocialRepository(GiftSubscriptionActivity giftSubscriptionActivity, SocialRepository socialRepository) {
        giftSubscriptionActivity.socialRepository = socialRepository;
    }

    public void injectMembers(GiftSubscriptionActivity giftSubscriptionActivity) {
        BaseActivity_MembersInjector.injectNotificationsManager(giftSubscriptionActivity, this.notificationsManagerProvider.get());
        BaseActivity_MembersInjector.injectUserRepository(giftSubscriptionActivity, this.userRepositoryProvider.get());
        injectSocialRepository(giftSubscriptionActivity, this.socialRepositoryProvider.get());
        injectAppConfigManager(giftSubscriptionActivity, this.appConfigManagerProvider.get());
        injectPurchaseHandler(giftSubscriptionActivity, this.purchaseHandlerProvider.get());
    }
}
