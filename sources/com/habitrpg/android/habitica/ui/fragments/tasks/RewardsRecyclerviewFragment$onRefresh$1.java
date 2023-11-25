package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: RewardsRecyclerviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onRefresh$1", f = "RewardsRecyclerviewFragment.kt", l = {111, 112}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onRefresh$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onRefresh$1(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, Continuation<? super RewardsRecyclerviewFragment$onRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new RewardsRecyclerviewFragment$onRefresh$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((RewardsRecyclerviewFragment$onRefresh$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = ic.b.d()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            dc.n.b(r12)
            goto L45
        L12:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            dc.n.b(r12)
            goto L36
        L1e:
            dc.n.b(r12)
            com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment r12 = r11.this$0
            com.habitrpg.android.habitica.data.UserRepository r4 = r12.getUserRepository()
            r5 = 1
            r6 = 1
            r7 = 0
            r9 = 4
            r10 = 0
            r11.label = r3
            r8 = r11
            java.lang.Object r12 = com.habitrpg.android.habitica.data.UserRepository.DefaultImpls.retrieveUser$default(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L36
            return r0
        L36:
            com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment r12 = r11.this$0
            com.habitrpg.android.habitica.data.InventoryRepository r12 = r12.getInventoryRepository()
            r11.label = r2
            java.lang.Object r12 = r12.retrieveInAppRewards(r11)
            if (r12 != r0) goto L45
            return r0
        L45:
            com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment r12 = r11.this$0
            com.habitrpg.android.habitica.databinding.FragmentRefreshRecyclerviewBinding r12 = r12.getBinding()
            if (r12 == 0) goto L50
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r12 = r12.refreshLayout
            goto L51
        L50:
            r12 = 0
        L51:
            if (r12 != 0) goto L54
            goto L58
        L54:
            r0 = 0
            r12.setRefreshing(r0)
        L58:
            dc.w r12 = dc.w.f13270a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onRefresh$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
