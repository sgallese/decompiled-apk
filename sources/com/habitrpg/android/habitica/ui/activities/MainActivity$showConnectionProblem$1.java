package com.habitrpg.android.habitica.ui.activities;

import kotlin.coroutines.Continuation;

/* compiled from: MainActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.MainActivity$showConnectionProblem$1", f = "MainActivity.kt", l = {783}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MainActivity$showConnectionProblem$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$showConnectionProblem$1(MainActivity mainActivity, Continuation<? super MainActivity$showConnectionProblem$1> continuation) {
        super(2, continuation);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$showConnectionProblem$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((MainActivity$showConnectionProblem$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            long o10 = zc.c.o(1, zc.d.MINUTES);
            this.label = 1;
            if (ad.u0.b(o10, this) == d10) {
                return d10;
            }
        }
        this.this$0.getBinding().content.connectionIssueView.setVisibility(8);
        return dc.w.f13270a;
    }
}
