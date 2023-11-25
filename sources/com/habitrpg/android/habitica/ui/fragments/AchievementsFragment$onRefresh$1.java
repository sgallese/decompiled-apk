package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import kotlin.coroutines.Continuation;

/* compiled from: AchievementsFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.AchievementsFragment$onRefresh$1", f = "AchievementsFragment.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AchievementsFragment$onRefresh$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ AchievementsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AchievementsFragment$onRefresh$1(AchievementsFragment achievementsFragment, Continuation<? super AchievementsFragment$onRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = achievementsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new AchievementsFragment$onRefresh$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((AchievementsFragment$onRefresh$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            this.label = 1;
            if (userRepository.retrieveAchievements(this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
