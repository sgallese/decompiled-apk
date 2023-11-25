package com.habitrpg.android.habitica.ui.views.insufficientCurrency;

import com.habitrpg.android.habitica.helpers.AppConfigManager;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;

/* loaded from: classes4.dex */
public final class InsufficientGemsDialog_MembersInjector implements qa.a<InsufficientGemsDialog> {
    private final cc.a<AppConfigManager> configManagerProvider;
    private final cc.a<PurchaseHandler> purchaseHandlerProvider;

    public InsufficientGemsDialog_MembersInjector(cc.a<AppConfigManager> aVar, cc.a<PurchaseHandler> aVar2) {
        this.configManagerProvider = aVar;
        this.purchaseHandlerProvider = aVar2;
    }

    public static qa.a<InsufficientGemsDialog> create(cc.a<AppConfigManager> aVar, cc.a<PurchaseHandler> aVar2) {
        return new InsufficientGemsDialog_MembersInjector(aVar, aVar2);
    }

    public static void injectConfigManager(InsufficientGemsDialog insufficientGemsDialog, AppConfigManager appConfigManager) {
        insufficientGemsDialog.configManager = appConfigManager;
    }

    public static void injectPurchaseHandler(InsufficientGemsDialog insufficientGemsDialog, PurchaseHandler purchaseHandler) {
        insufficientGemsDialog.purchaseHandler = purchaseHandler;
    }

    public void injectMembers(InsufficientGemsDialog insufficientGemsDialog) {
        injectConfigManager(insufficientGemsDialog, this.configManagerProvider.get());
        injectPurchaseHandler(insufficientGemsDialog, this.purchaseHandlerProvider.get());
    }
}
