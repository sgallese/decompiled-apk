package com.habitrpg.android.habitica.ui.fragments.purchases;

import ad.k0;
import androidx.recyclerview.widget.m;
import com.android.billingclient.api.Purchase;
import com.habitrpg.android.habitica.helpers.PurchaseHandler;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.w;
import java.util.Date;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubscriptionFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment$checkIfNeedsCancellation$1", f = "SubscriptionFragment.kt", l = {m.e.DEFAULT_SWIPE_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SubscriptionFragment$checkIfNeedsCancellation$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ SubscriptionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment$checkIfNeedsCancellation$1$1", f = "SubscriptionFragment.kt", l = {257}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.purchases.SubscriptionFragment$checkIfNeedsCancellation$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {
        int label;
        final /* synthetic */ SubscriptionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubscriptionFragment subscriptionFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = subscriptionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                PurchaseHandler purchaseHandler = this.this$0.getPurchaseHandler();
                this.label = 1;
                if (purchaseHandler.cancelSubscription(this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionFragment$checkIfNeedsCancellation$1(SubscriptionFragment subscriptionFragment, Continuation<? super SubscriptionFragment$checkIfNeedsCancellation$1> continuation) {
        super(2, continuation);
        this.this$0 = subscriptionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new SubscriptionFragment$checkIfNeedsCancellation$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((SubscriptionFragment$checkIfNeedsCancellation$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        User user;
        String str;
        User user2;
        boolean z10;
        User user3;
        Date date;
        Purchases purchased;
        SubscriptionPlan plan;
        Purchases purchased2;
        SubscriptionPlan plan2;
        Purchases purchased3;
        SubscriptionPlan plan3;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            PurchaseHandler purchaseHandler = this.this$0.getPurchaseHandler();
            this.label = 1;
            obj = purchaseHandler.checkForSubscription(this);
            if (obj == d10) {
                return d10;
            }
        }
        Purchase purchase = (Purchase) obj;
        user = this.this$0.user;
        if (user != null && (purchased3 = user.getPurchased()) != null && (plan3 = purchased3.getPlan()) != null) {
            str = plan3.getPaymentMethod();
        } else {
            str = null;
        }
        if (qc.q.d(str, "Google")) {
            user2 = this.this$0.user;
            boolean z11 = false;
            if (user2 != null && (purchased2 = user2.getPurchased()) != null && (plan2 = purchased2.getPlan()) != null && plan2.isActive()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                user3 = this.this$0.user;
                if (user3 != null && (purchased = user3.getPurchased()) != null && (plan = purchased.getPlan()) != null) {
                    date = plan.realmGet$dateTerminated();
                } else {
                    date = null;
                }
                if (date == null) {
                    if (purchase != null && purchase.i()) {
                        z11 = true;
                    }
                    if (!z11) {
                        ad.i.d(androidx.lifecycle.w.a(this.this$0), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new AnonymousClass1(this.this$0, null), 2, null);
                    }
                }
            }
        }
        return w.f13270a;
    }
}
