package com.habitrpg.android.habitica.helpers;

import ad.k0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$startListening$1$onBillingSetupFinished$1", f = "PurchaseHandler.kt", l = {156}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PurchaseHandler$startListening$1$onBillingSetupFinished$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$startListening$1$onBillingSetupFinished$1(PurchaseHandler purchaseHandler, Continuation<? super PurchaseHandler$startListening$1$onBillingSetupFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$startListening$1$onBillingSetupFinished$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$startListening$1$onBillingSetupFinished$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
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
            PurchaseHandler purchaseHandler = this.this$0;
            this.label = 1;
            if (purchaseHandler.queryPurchases(this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
