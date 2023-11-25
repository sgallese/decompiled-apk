package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.databinding.ActivityDeathBinding;
import com.habitrpg.common.habitica.helpers.Animations;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeathActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.DeathActivity$onCreate$5$2", f = "DeathActivity.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DeathActivity$onCreate$5$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ DeathActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeathActivity$onCreate$5$2(DeathActivity deathActivity, Continuation<? super DeathActivity$onCreate$5$2> continuation) {
        super(2, continuation);
        this.this$0 = deathActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new DeathActivity$onCreate$5$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((DeathActivity$onCreate$5$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        ActivityDeathBinding activityDeathBinding;
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
            this.label = 1;
            if (ad.u0.a(300L, this) == d10) {
                return d10;
            }
        }
        activityDeathBinding = this.this$0.binding;
        if (activityDeathBinding == null) {
            qc.q.z("binding");
            activityDeathBinding = null;
        }
        activityDeathBinding.reviveSubscriberWrapper.startAnimation(Animations.INSTANCE.fadeOutAnimation());
        return dc.w.f13270a;
    }
}
