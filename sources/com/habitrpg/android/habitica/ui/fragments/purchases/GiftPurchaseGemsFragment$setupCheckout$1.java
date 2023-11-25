package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.k0;
import com.android.billingclient.api.e;
import dc.w;
import ec.t;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GiftPurchaseGemsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1", f = "GiftPurchaseGemsFragment.kt", l = {56, 57}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GiftPurchaseGemsFragment$setupCheckout$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ GiftPurchaseGemsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiftPurchaseGemsFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1$1", f = "GiftPurchaseGemsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ List<com.android.billingclient.api.e> $skus;
        int label;
        final /* synthetic */ GiftPurchaseGemsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<com.android.billingclient.api.e> list, GiftPurchaseGemsFragment giftPurchaseGemsFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$skus = list;
            this.this$0 = giftPurchaseGemsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$skus, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                List<com.android.billingclient.api.e> list = this.$skus;
                if (list == null) {
                    list = t.i();
                }
                for (com.android.billingclient.api.e eVar : list) {
                    GiftPurchaseGemsFragment giftPurchaseGemsFragment = this.this$0;
                    e.a a10 = eVar.a();
                    if (a10 == null || (str = a10.a()) == null) {
                        str = "";
                    }
                    giftPurchaseGemsFragment.updateButtonLabel(eVar, str);
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftPurchaseGemsFragment$setupCheckout$1(GiftPurchaseGemsFragment giftPurchaseGemsFragment, Continuation<? super GiftPurchaseGemsFragment$setupCheckout$1> continuation) {
        super(2, continuation);
        this.this$0 = giftPurchaseGemsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GiftPurchaseGemsFragment$setupCheckout$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GiftPurchaseGemsFragment$setupCheckout$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r6.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            dc.n.b(r7)
            goto L4b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            dc.n.b(r7)
            goto L33
        L1f:
            dc.n.b(r7)
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment r7 = r6.this$0
            com.habitrpg.android.habitica.helpers.PurchaseHandler r7 = com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment.access$getPurchaseHandler$p(r7)
            if (r7 == 0) goto L36
            r6.label = r4
            java.lang.Object r7 = r7.getAllGemSKUs(r6)
            if (r7 != r0) goto L33
            return r0
        L33:
            java.util.List r7 = (java.util.List) r7
            goto L37
        L36:
            r7 = r2
        L37:
            ad.i2 r1 = ad.a1.c()
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1$1 r4 = new com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1$1
            com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment r5 = r6.this$0
            r4.<init>(r7, r5, r2)
            r6.label = r3
            java.lang.Object r7 = ad.g.g(r1, r4, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            dc.w r7 = dc.w.f13270a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.purchases.GiftPurchaseGemsFragment$setupCheckout$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
