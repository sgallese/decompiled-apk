package com.habitrpg.android.habitica.ui.fragments.purchases;

import com.habitrpg.android.habitica.data.TutorialRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.ui.fragments.BaseFragment_MembersInjector;

/* loaded from: classes4.dex */
public final class GemsPurchaseFragment_MembersInjector implements qa.a<GemsPurchaseFragment> {
    private final cc.a<AppConfigManager> appConfigManagerProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;
    private final cc.a<TutorialRepository> tutorialRepositoryProvider;
    private final cc.a<UserRepository> userRepositoryProvider;

    public GemsPurchaseFragment_MembersInjector(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<AppConfigManager> aVar3, cc.a<PurchaseHandler> aVar4) {
        this.tutorialRepositoryProvider = aVar;
        this.userRepositoryProvider = aVar2;
        this.appConfigManagerProvider = aVar3;
        this.purchaseHandlerProvider = aVar4;
    }

    public static qa.a<GemsPurchaseFragment> create(cc.a<TutorialRepository> aVar, cc.a<UserRepository> aVar2, cc.a<AppConfigManager> aVar3, cc.a<PurchaseHandler> aVar4) {
        return new GemsPurchaseFragment_MembersInjector(aVar, aVar2, aVar3, aVar4);
    }

    public static void injectAppConfigManager(GemsPurchaseFragment gemsPurchaseFragment, AppConfigManager appConfigManager) {
        gemsPurchaseFragment.appConfigManager = appConfigManager;
    }

    public static void injectPurchaseHandler(GemsPurchaseFragment gemsPurchaseFragment, PurchaseHandler purchaseHandler) {
        gemsPurchaseFragment.purchaseHandler = purchaseHandler;
    }

    public static void injectUserRepository(GemsPurchaseFragment gemsPurchaseFragment, UserRepository userRepository) {
        gemsPurchaseFragment.userRepository = userRepository;
    }

    public void injectMembers(GemsPurchaseFragment gemsPurchaseFragment) {
        BaseFragment_MembersInjector.injectTutorialRepository(gemsPurchaseFragment, this.tutorialRepositoryProvider.get());
        injectUserRepository(gemsPurchaseFragment, this.userRepositoryProvider.get());
        injectAppConfigManager(gemsPurchaseFragment, this.appConfigManagerProvider.get());
        injectPurchaseHandler(gemsPurchaseFragment, this.purchaseHandlerProvider.get());
    }
}
