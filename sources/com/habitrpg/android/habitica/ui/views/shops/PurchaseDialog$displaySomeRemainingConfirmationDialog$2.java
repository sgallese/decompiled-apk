package com.habitrpg.android.habitica.ui.views.shops;

import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import dc.w;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
/* loaded from: classes4.dex */
public final class PurchaseDialog$displaySomeRemainingConfirmationDialog$2 extends r implements p<HabiticaAlertDialog, Integer, w> {
    final /* synthetic */ int $quantity;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$displaySomeRemainingConfirmationDialog$2(PurchaseDialog purchaseDialog, int i10) {
        super(2);
        this.this$0 = purchaseDialog;
        this.$quantity = i10;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(HabiticaAlertDialog habiticaAlertDialog, Integer num) {
        invoke(habiticaAlertDialog, num.intValue());
        return w.f13270a;
    }

    public final void invoke(HabiticaAlertDialog habiticaAlertDialog, int i10) {
        q.i(habiticaAlertDialog, "<anonymous parameter 0>");
        this.this$0.buyItem(this.$quantity);
    }
}
