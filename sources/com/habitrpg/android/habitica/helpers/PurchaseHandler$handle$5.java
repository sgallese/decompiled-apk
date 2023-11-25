package com.habitrpg.android.habitica.helpers;

import ad.a1;
import ad.i;
import ad.k0;
import ad.l0;
import com.android.billingclient.api.Purchase;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$5", f = "PurchaseHandler.kt", l = {352}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$handle$5 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ PurchaseValidationRequest $validationRequest;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$5$1", f = "PurchaseHandler.kt", l = {355}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$5$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Purchase $purchase;
        int label;
        final /* synthetic */ PurchaseHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PurchaseHandler purchaseHandler, Purchase purchase, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = purchaseHandler;
            this.$purchase = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$purchase, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
                Purchase purchase = this.$purchase;
                this.label = 1;
                if (PurchaseHandler.acknowledgePurchase$default(purchaseHandler, purchase, 0, this, 2, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$handle$5(PurchaseHandler purchaseHandler, PurchaseValidationRequest purchaseValidationRequest, Purchase purchase, Continuation<? super PurchaseHandler$handle$5> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$validationRequest = purchaseValidationRequest;
        this.$purchase = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$handle$5(this.this$0, this.$validationRequest, this.$purchase, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$handle$5) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ApiClient apiClient;
        d10 = ic.d.d();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                n.b(obj);
                apiClient = this.this$0.apiClient;
                PurchaseValidationRequest purchaseValidationRequest = this.$validationRequest;
                this.label = 1;
                if (apiClient.validateSubscription(purchaseValidationRequest, this) == d10) {
                    return d10;
                }
            }
            this.this$0.processedPurchase(this.$purchase);
            i.d(l0.a(a1.b()), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, this.$purchase, null), 2, null);
            PurchaseHandler.displayConfirmationDialog$default(this.this$0, this.$purchase, null, 2, null);
        } catch (Throwable th) {
            this.this$0.handleError(th, this.$purchase);
        }
        return w.f13270a;
    }
}
