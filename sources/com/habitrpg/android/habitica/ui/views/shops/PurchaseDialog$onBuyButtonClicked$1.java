package com.habitrpg.android.habitica.ui.views.shops;

import ad.k0;
import dc.n;
import dc.w;
import ic.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseDialog.kt */
@f(c = "com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$onBuyButtonClicked$1", f = "PurchaseDialog.kt", l = {349}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseDialog$onBuyButtonClicked$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ PurchaseDialog this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseDialog.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.views.shops.PurchaseDialog$onBuyButtonClicked$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements pc.l<Integer, w> {
        final /* synthetic */ PurchaseDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchaseDialog purchaseDialog) {
            super(1);
            this.this$0 = purchaseDialog;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(Integer num) {
            invoke(num.intValue());
            return w.f13270a;
        }

        public final void invoke(int i10) {
            int i11;
            int i12;
            if (i10 >= 0) {
                i12 = this.this$0.purchaseQuantity;
                if (i10 < i12) {
                    this.this$0.displayPurchaseConfirmationDialog(i10);
                    this.this$0.dismiss();
                    return;
                }
            }
            PurchaseDialog purchaseDialog = this.this$0;
            i11 = purchaseDialog.purchaseQuantity;
            purchaseDialog.buyItem(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDialog$onBuyButtonClicked$1(PurchaseDialog purchaseDialog, Continuation<? super PurchaseDialog$onBuyButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseDialog$onBuyButtonClicked$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseDialog$onBuyButtonClicked$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object remainingPurchaseQuantity;
        d10 = d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            PurchaseDialog purchaseDialog = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(purchaseDialog);
            this.label = 1;
            remainingPurchaseQuantity = purchaseDialog.remainingPurchaseQuantity(anonymousClass1, this);
            if (remainingPurchaseQuantity == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
