package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.a1;
import ad.i2;
import ad.k0;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import dc.w;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GemsPurchaseFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment$loadInventory$1", f = "GemsPurchaseFragment.kt", l = {128, 129}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GemsPurchaseFragment$loadInventory$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ GemsPurchaseFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GemsPurchaseFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment$loadInventory$1$1", f = "GemsPurchaseFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.purchases.GemsPurchaseFragment$loadInventory$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ List<com.android.billingclient.api.e> $skus;
        int label;
        final /* synthetic */ GemsPurchaseFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<com.android.billingclient.api.e> list, GemsPurchaseFragment gemsPurchaseFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$skus = list;
            this.this$0 = gemsPurchaseFragment;
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
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                Iterator<com.android.billingclient.api.e> it = this.$skus.iterator();
                while (it.hasNext()) {
                    this.this$0.updateButtonLabel(it.next());
                }
                return w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GemsPurchaseFragment$loadInventory$1(GemsPurchaseFragment gemsPurchaseFragment, Continuation<? super GemsPurchaseFragment$loadInventory$1> continuation) {
        super(2, continuation);
        this.this$0 = gemsPurchaseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new GemsPurchaseFragment$loadInventory$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((GemsPurchaseFragment$loadInventory$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    dc.n.b(obj);
                    return w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            PurchaseHandler purchaseHandler = this.this$0.getPurchaseHandler();
            this.label = 1;
            obj = purchaseHandler.getAllGemSKUs(this);
            if (obj == d10) {
                return d10;
            }
        }
        i2 c10 = a1.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) obj, this.this$0, null);
        this.label = 2;
        if (ad.g.g(c10, anonymousClass1, this) == d10) {
            return d10;
        }
        return w.f13270a;
    }
}
