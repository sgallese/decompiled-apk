package com.habitrpg.android.habitica.helpers;

import ad.k0;
import com.android.billingclient.api.Purchase;
import com.habitrpg.common.habitica.models.PurchaseValidationRequest;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4", f = "PurchaseHandler.kt", l = {335, 338}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$handle$4 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Purchase $purchase;
    final /* synthetic */ String $sku;
    final /* synthetic */ PurchaseValidationRequest $validationRequest;
    Object L$0;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseHandler.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4$1", f = "PurchaseHandler.kt", l = {339}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4$1  reason: invalid class name */
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
                if (PurchaseHandler.consume$default(purchaseHandler, purchase, 0, this, 2, null) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseHandler$handle$4(PurchaseHandler purchaseHandler, PurchaseValidationRequest purchaseValidationRequest, Purchase purchase, String str, Continuation<? super PurchaseHandler$handle$4> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$validationRequest = purchaseValidationRequest;
        this.$purchase = purchase;
        this.$sku = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$handle$4(this.this$0, this.$validationRequest, this.$purchase, this.$sku, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$handle$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:7:0x0013, B:23:0x0061, B:25:0x0067, B:26:0x006e, B:11:0x001f, B:19:0x0039, B:16:0x0028), top: B:31:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r7.L$0
            dc.q r0 = (dc.q) r0
            dc.n.b(r8)     // Catch: java.lang.Throwable -> L23
            goto L61
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            dc.n.b(r8)     // Catch: java.lang.Throwable -> L23
            goto L39
        L23:
            r8 = move-exception
            goto L72
        L25:
            dc.n.b(r8)
            com.habitrpg.android.habitica.helpers.PurchaseHandler r8 = r7.this$0     // Catch: java.lang.Throwable -> L23
            com.habitrpg.android.habitica.data.ApiClient r8 = com.habitrpg.android.habitica.helpers.PurchaseHandler.access$getApiClient$p(r8)     // Catch: java.lang.Throwable -> L23
            com.habitrpg.common.habitica.models.PurchaseValidationRequest r1 = r7.$validationRequest     // Catch: java.lang.Throwable -> L23
            r7.label = r4     // Catch: java.lang.Throwable -> L23
            java.lang.Object r8 = r8.validateNoRenewSubscription(r1, r7)     // Catch: java.lang.Throwable -> L23
            if (r8 != r0) goto L39
            return r0
        L39:
            com.habitrpg.android.habitica.helpers.PurchaseHandler r8 = r7.this$0     // Catch: java.lang.Throwable -> L23
            com.android.billingclient.api.Purchase r1 = r7.$purchase     // Catch: java.lang.Throwable -> L23
            com.habitrpg.android.habitica.helpers.PurchaseHandler.access$processedPurchase(r8, r1)     // Catch: java.lang.Throwable -> L23
            com.habitrpg.android.habitica.helpers.PurchaseHandler$Companion r8 = com.habitrpg.android.habitica.helpers.PurchaseHandler.Companion     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = r7.$sku     // Catch: java.lang.Throwable -> L23
            dc.q r8 = com.habitrpg.android.habitica.helpers.PurchaseHandler.Companion.access$removeGift(r8, r1)     // Catch: java.lang.Throwable -> L23
            ad.g0 r1 = ad.a1.b()     // Catch: java.lang.Throwable -> L23
            com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4$1 r4 = new com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4$1     // Catch: java.lang.Throwable -> L23
            com.habitrpg.android.habitica.helpers.PurchaseHandler r5 = r7.this$0     // Catch: java.lang.Throwable -> L23
            com.android.billingclient.api.Purchase r6 = r7.$purchase     // Catch: java.lang.Throwable -> L23
            r4.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L23
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L23
            r7.label = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = ad.g.g(r1, r4, r7)     // Catch: java.lang.Throwable -> L23
            if (r1 != r0) goto L60
            return r0
        L60:
            r0 = r8
        L61:
            com.habitrpg.android.habitica.helpers.PurchaseHandler r8 = r7.this$0     // Catch: java.lang.Throwable -> L23
            com.android.billingclient.api.Purchase r1 = r7.$purchase     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r0.f()     // Catch: java.lang.Throwable -> L23
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L23
        L6e:
            com.habitrpg.android.habitica.helpers.PurchaseHandler.access$displayConfirmationDialog(r8, r1, r2)     // Catch: java.lang.Throwable -> L23
            goto L79
        L72:
            com.habitrpg.android.habitica.helpers.PurchaseHandler r0 = r7.this$0
            com.android.billingclient.api.Purchase r1 = r7.$purchase
            com.habitrpg.android.habitica.helpers.PurchaseHandler.access$handleError(r0, r8, r1)
        L79:
            dc.w r8 = dc.w.f13270a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.helpers.PurchaseHandler$handle$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
