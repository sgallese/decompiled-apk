package com.habitrpg.android.habitica.ui.views.shops;

import dc.w;
import pc.l;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialog$shopItem$3 extends r implements l<Double, w> {
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$shopItem$3(PurchaseDialog purchaseDialog) {
        super(1);
        this.this$0 = purchaseDialog;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Double d10) {
        invoke(d10.doubleValue());
        return w.f13270a;
    }

    public final void invoke(double d10) {
        this.this$0.purchaseQuantity = (int) d10;
        this.this$0.updatePurchaseTotal();
    }
}
