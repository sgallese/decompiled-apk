package com.habitrpg.android.habitica.helpers;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler", f = "PurchaseHandler.kt", l = {369, 371, 372}, m = "acknowledgePurchase")
/* loaded from: classes4.dex */
public final class PurchaseHandler$acknowledgePurchase$1 extends kotlin.coroutines.jvm.internal.d {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$acknowledgePurchase$1(PurchaseHandler purchaseHandler, Continuation<? super PurchaseHandler$acknowledgePurchase$1> continuation) {
        super(continuation);
        this.this$0 = purchaseHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object acknowledgePurchase;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        acknowledgePurchase = this.this$0.acknowledgePurchase(null, 0, this);
        return acknowledgePurchase;
    }
}
