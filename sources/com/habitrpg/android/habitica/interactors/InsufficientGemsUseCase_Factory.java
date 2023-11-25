package com.habitrpg.android.habitica.interactors;

import cc.a;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;

/* loaded from: classes4.dex */
public final class InsufficientGemsUseCase_Factory implements a {
    private final a<PurchaseHandler> purchaseHandlerProvider;

    public InsufficientGemsUseCase_Factory(a<PurchaseHandler> aVar) {
        this.purchaseHandlerProvider = aVar;
    }

    public static InsufficientGemsUseCase_Factory create(a<PurchaseHandler> aVar) {
        return new InsufficientGemsUseCase_Factory(aVar);
    }

    public static InsufficientGemsUseCase newInstance(PurchaseHandler purchaseHandler) {
        return new InsufficientGemsUseCase(purchaseHandler);
    }

    @Override // cc.a
    public InsufficientGemsUseCase get() {
        return newInstance(this.purchaseHandlerProvider.get());
    }
}
