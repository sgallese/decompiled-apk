package com.habitrpg.android.habitica.ui.fragments.tasks;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: RewardsRecyclerviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.tasks.RewardsRecyclerviewFragment$onCreateView$1", f = "RewardsRecyclerviewFragment.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RewardsRecyclerviewFragment$onCreateView$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ RewardsRecyclerviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsRecyclerviewFragment$onCreateView$1(RewardsRecyclerviewFragment rewardsRecyclerviewFragment, Continuation<? super RewardsRecyclerviewFragment$onCreateView$1> continuation) {
        super(2, continuation);
        this.this$0 = rewardsRecyclerviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new RewardsRecyclerviewFragment$onCreateView$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((RewardsRecyclerviewFragment$onCreateView$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
            this.label = 1;
            if (inventoryRepository.retrieveInAppRewards(this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
