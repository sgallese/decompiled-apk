package com.habitrpg.android.habitica.helpers;

import ad.k0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import x5.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$loadInventory$skuDetailsResult$1", f = "PurchaseHandler.kt", l = {246}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$loadInventory$skuDetailsResult$1 extends l implements p<k0, Continuation<? super k>, Object> {
    final /* synthetic */ com.android.billingclient.api.f $params;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$loadInventory$skuDetailsResult$1(PurchaseHandler purchaseHandler, com.android.billingclient.api.f fVar, Continuation<? super PurchaseHandler$loadInventory$skuDetailsResult$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$params = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$loadInventory$skuDetailsResult$1(this.this$0, this.$params, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super k> continuation) {
        return ((PurchaseHandler$loadInventory$skuDetailsResult$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        com.android.billingclient.api.a aVar;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            aVar = this.this$0.billingClient;
            com.android.billingclient.api.f fVar = this.$params;
            this.label = 1;
            obj = x5.d.c(aVar, fVar, this);
            if (obj == d10) {
                return d10;
            }
        }
        return obj;
    }
}
