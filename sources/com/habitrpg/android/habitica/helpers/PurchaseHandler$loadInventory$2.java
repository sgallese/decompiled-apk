package com.habitrpg.android.habitica.helpers;

import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$loadInventory$2", f = "PurchaseHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$loadInventory$2 extends l implements pc.l<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$loadInventory$2(PurchaseHandler purchaseHandler, Continuation<? super PurchaseHandler$loadInventory$2> continuation) {
        super(1, continuation);
        this.this$0 = purchaseHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Continuation<?> continuation) {
        return new PurchaseHandler$loadInventory$2(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PurchaseHandler.BillingClientState billingClientState;
        PurchaseHandler.BillingClientState billingClientState2;
        boolean z10;
        com.android.billingclient.api.a aVar;
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            billingClientState = this.this$0.billingClientState;
            if (billingClientState == PurchaseHandler.BillingClientState.DISCONNECTED) {
                this.this$0.startListening();
            }
            billingClientState2 = this.this$0.billingClientState;
            if (billingClientState2.getCanMaybePurchase()) {
                aVar = this.this$0.billingClient;
                if (aVar.e()) {
                    z10 = true;
                    return kotlin.coroutines.jvm.internal.b.a(z10);
                }
            }
            z10 = false;
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // pc.l
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((PurchaseHandler$loadInventory$2) create(continuation)).invokeSuspend(w.f13270a);
    }
}
