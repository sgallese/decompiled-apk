package com.habitrpg.android.habitica.helpers;

import ad.k0;
import androidx.lifecycle.m;
import com.android.billingclient.api.Purchase;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import dc.n;
import dc.w;
import dd.i;
import ec.b0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PurchaseHandler.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.helpers.PurchaseHandler$processPurchases$1", f = "PurchaseHandler.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class PurchaseHandler$processPurchases$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ Purchase $mostRecentSub;
    final /* synthetic */ List<Purchase> $purchases;
    int label;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHandler$processPurchases$1(PurchaseHandler purchaseHandler, List<? extends Purchase> list, Purchase purchase, Continuation<? super PurchaseHandler$processPurchases$1> continuation) {
        super(2, continuation);
        this.this$0 = purchaseHandler;
        this.$purchases = list;
        this.$mostRecentSub = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PurchaseHandler$processPurchases$1(this.this$0, this.$purchases, this.$mostRecentSub, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PurchaseHandler$processPurchases$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        MainUserViewModel mainUserViewModel;
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
            mainUserViewModel = this.this$0.userViewModel;
            dd.g P = i.P(i.u(m.a(mainUserViewModel.getUser())), 1);
            final List<Purchase> list = this.$purchases;
            final Purchase purchase = this.$mostRecentSub;
            final PurchaseHandler purchaseHandler = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.helpers.PurchaseHandler$processPurchases$1.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((User) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(User user, Continuation<? super w> continuation) {
                    Object c02;
                    boolean T;
                    Purchases purchased = user.getPurchased();
                    q.f(purchased);
                    SubscriptionPlan plan = purchased.getPlan();
                    for (Purchase purchase2 : list) {
                        if (plan != null && plan.isActive()) {
                            List<String> allSubscriptionTypes = PurchaseTypes.INSTANCE.getAllSubscriptionTypes();
                            List<String> c10 = purchase2.c();
                            q.h(c10, "getProducts(...)");
                            c02 = b0.c0(c10);
                            T = b0.T(allSubscriptionTypes, c02);
                            if (T) {
                                if ((plan.realmGet$dateTerminated() != null) != purchase2.i()) {
                                    Purchase purchase3 = purchase;
                                    if (q.d(purchase3 != null ? purchase3.a() : null, purchase2.a()) && !q.d(purchase2.f(), plan.getCustomerId())) {
                                    }
                                }
                            }
                        }
                        purchaseHandler.handle(purchase2);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (P.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
