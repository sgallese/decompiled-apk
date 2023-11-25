package com.habitrpg.android.habitica.helpers;

import ad.k0;
import com.android.billingclient.api.Purchase;
import dc.n;
import dc.w;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$processPurchases$2", f = "PurchaseHandler.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$processPurchases$2 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ List<Purchase> $purchases;
    Object L$0;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHandler$processPurchases$2(List<? extends Purchase> list, PurchaseHandler purchaseHandler, Continuation<? super PurchaseHandler$processPurchases$2> continuation) {
        super(2, continuation);
        this.$purchases = list;
        this.this$0 = purchaseHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$processPurchases$2(this.$purchases, this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$processPurchases$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Iterator<Purchase> it;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                it = (Iterator) this.L$0;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            it = this.$purchases.iterator();
        }
        while (it.hasNext()) {
            Purchase next = it.next();
            PurchaseHandler purchaseHandler = this.this$0;
            this.L$0 = it;
            this.label = 1;
            if (PurchaseHandler.consume$default(purchaseHandler, next, 0, this, 2, null) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
