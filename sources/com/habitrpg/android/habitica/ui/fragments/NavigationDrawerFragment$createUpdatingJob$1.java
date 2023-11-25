package com.habitrpg.android.habitica.ui.fragments;

import ad.k0;
import ad.u0;
import kotlin.coroutines.Continuation;

/* compiled from: NavigationDrawerFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment$createUpdatingJob$1", f = "NavigationDrawerFragment.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NavigationDrawerFragment$createUpdatingJob$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {
    final /* synthetic */ pc.a<zc.a> $delayFunc;
    final /* synthetic */ pc.a<Boolean> $endingCondition;
    final /* synthetic */ pc.a<dc.w> $function;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerFragment$createUpdatingJob$1(pc.a<Boolean> aVar, pc.a<dc.w> aVar2, pc.a<zc.a> aVar3, Continuation<? super NavigationDrawerFragment$createUpdatingJob$1> continuation) {
        super(2, continuation);
        this.$endingCondition = aVar;
        this.$function = aVar2;
        this.$delayFunc = aVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new NavigationDrawerFragment$createUpdatingJob$1(this.$endingCondition, this.$function, this.$delayFunc, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((NavigationDrawerFragment$createUpdatingJob$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dc.n.b(obj);
        while (this.$endingCondition.invoke().booleanValue()) {
            this.$function.invoke();
            long K = this.$delayFunc.invoke().K();
            this.label = 1;
            if (u0.b(K, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
