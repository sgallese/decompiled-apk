package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.models.shops.ShopItem;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.tasks.RewardsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.adapter.tasks.TaskRecyclerViewAdapter;
import dc.n;
import dc.w;
import dd.h;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: RewardsRecyclerviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onViewCreated$4", f = "RewardsRecyclerviewFragment.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onViewCreated$4 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onViewCreated$4(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, Continuation<? super RewardsRecyclerviewFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new RewardsRecyclerviewFragment$onViewCreated$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((RewardsRecyclerviewFragment$onViewCreated$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<ShopItem>> inAppRewards = this.this$0.getInventoryRepository().getInAppRewards();
            final RewardsRecyclerviewFragment rewardsRecyclerviewFragment = this.this$0;
            h<? super List<ShopItem>> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onViewCreated$4.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends ShopItem> list, Continuation<? super w> continuation) {
                    Integer d11;
                    SubscriptionPlan plan;
                    User f10 = RewardsRecyclerviewFragment.this.getViewModel().getUser().f();
                    TaskRecyclerViewAdapter recyclerAdapter = RewardsRecyclerviewFragment.this.getRecyclerAdapter();
                    RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter = recyclerAdapter instanceof RewardsRecyclerViewAdapter ? (RewardsRecyclerViewAdapter) recyclerAdapter : null;
                    if (rewardsRecyclerViewAdapter != null) {
                        boolean z10 = false;
                        if (f10 != null && f10.isSubscribed()) {
                            z10 = true;
                        }
                        if (z10) {
                            Purchases purchased = f10.getPurchased();
                            d11 = (purchased == null || (plan = purchased.getPlan()) == null) ? null : kotlin.coroutines.jvm.internal.b.d(plan.getNumberOfGemsLeft());
                        } else {
                            d11 = kotlin.coroutines.jvm.internal.b.d(-1);
                        }
                        rewardsRecyclerViewAdapter.setGoldGemsLeft(d11);
                    }
                    TaskRecyclerViewAdapter recyclerAdapter2 = RewardsRecyclerviewFragment.this.getRecyclerAdapter();
                    RewardsRecyclerViewAdapter rewardsRecyclerViewAdapter2 = recyclerAdapter2 instanceof RewardsRecyclerViewAdapter ? (RewardsRecyclerViewAdapter) recyclerAdapter2 : null;
                    if (rewardsRecyclerViewAdapter2 != null) {
                        rewardsRecyclerViewAdapter2.updateItemRewards(list);
                    }
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (inAppRewards.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
