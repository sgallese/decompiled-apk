package com.habitrpg.android.habitica.ui.activities;

import com.android.billingclient.api.e;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: GiftSubscriptionActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity$onStart$1", f = "GiftSubscriptionActivity.kt", l = {93, 95}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GiftSubscriptionActivity$onStart$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ GiftSubscriptionActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GiftSubscriptionActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity$onStart$1$1", f = "GiftSubscriptionActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.GiftSubscriptionActivity$onStart$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        int label;
        final /* synthetic */ GiftSubscriptionActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GiftSubscriptionActivity giftSubscriptionActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = giftSubscriptionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            List list2;
            long j10;
            long j11;
            Object obj2;
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                list = this.this$0.skus;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.this$0.updateButtonLabel((com.android.billingclient.api.e) it.next());
                }
                list2 = this.this$0.skus;
                Iterator it2 = list2.iterator();
                if (!it2.hasNext()) {
                    obj2 = null;
                } else {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        e.a a10 = ((com.android.billingclient.api.e) next).a();
                        if (a10 != null) {
                            j10 = a10.b();
                        } else {
                            j10 = 0;
                        }
                        do {
                            Object next2 = it2.next();
                            e.a a11 = ((com.android.billingclient.api.e) next2).a();
                            if (a11 != null) {
                                j11 = a11.b();
                            } else {
                                j11 = 0;
                            }
                            if (j10 > j11) {
                                next = next2;
                                j10 = j11;
                            }
                        } while (it2.hasNext());
                    }
                    obj2 = next;
                }
                com.android.billingclient.api.e eVar = (com.android.billingclient.api.e) obj2;
                if (eVar != null) {
                    this.this$0.selectSubscription(eVar);
                }
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftSubscriptionActivity$onStart$1(GiftSubscriptionActivity giftSubscriptionActivity, Continuation<? super GiftSubscriptionActivity$onStart$1> continuation) {
        super(2, continuation);
        this.this$0 = giftSubscriptionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new GiftSubscriptionActivity$onStart$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((GiftSubscriptionActivity$onStart$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
        } else {
            dc.n.b(obj);
            PurchaseHandler purchaseHandler = this.this$0.getPurchaseHandler();
            this.label = 1;
            obj = purchaseHandler.getAllGiftSubscriptionProducts(this);
            if (obj == d10) {
                return d10;
            }
        }
        this.this$0.skus = (List) obj;
        ad.i2 c10 = ad.a1.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (ad.g.g(c10, anonymousClass1, this) == d10) {
            return d10;
        }
        return dc.w.f13270a;
    }
}
