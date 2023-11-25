package com.habitrpg.android.habitica.ui.views.shops;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog", f = "PurchaseDialog.kt", l = {518, 519, 527, 530, 542, 547}, m = "remainingPurchaseQuantity")
/* loaded from: classes4.dex */
public final class PurchaseDialog$remainingPurchaseQuantity$1 extends d {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$remainingPurchaseQuantity$1(PurchaseDialog purchaseDialog, Continuation<? super PurchaseDialog$remainingPurchaseQuantity$1> continuation) {
        super(continuation);
        this.this$0 = purchaseDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object remainingPurchaseQuantity;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        remainingPurchaseQuantity = this.this$0.remainingPurchaseQuantity(null, this);
        return remainingPurchaseQuantity;
    }
}
