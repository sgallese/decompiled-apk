package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import kotlin.coroutines.Continuation;

/* compiled from: StatsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.StatsFragment$allocatePoint$1", f = "StatsFragment.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class StatsFragment$allocatePoint$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ Attribute $stat;
    int label;
    final /* synthetic */ StatsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsFragment$allocatePoint$1(StatsFragment statsFragment, Attribute attribute, Continuation<? super StatsFragment$allocatePoint$1> continuation) {
        super(2, continuation);
        this.this$0 = statsFragment;
        this.$stat = attribute;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new StatsFragment$allocatePoint$1(this.this$0, this.$stat, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((StatsFragment$allocatePoint$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            UserRepository userRepository = this.this$0.getUserRepository();
            Attribute attribute = this.$stat;
            this.label = 1;
            if (userRepository.allocatePoint(attribute, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
