package com.habitrpg.android.habitica.extensions;

import ad.k0;
import ad.u0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import zc.d;

/* compiled from: BaseExtensions.kt */
@f(c = "com.habitrpg.android.habitica.extensions.BaseExtensionsKt$runDelayed$1", f = "BaseExtensions.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BaseExtensionsKt$runDelayed$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ pc.a<w> $function;
    final /* synthetic */ long $interval;
    final /* synthetic */ d $timeUnit;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseExtensionsKt$runDelayed$1(long j10, d dVar, pc.a<w> aVar, Continuation<? super BaseExtensionsKt$runDelayed$1> continuation) {
        super(2, continuation);
        this.$interval = j10;
        this.$timeUnit = dVar;
        this.$function = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BaseExtensionsKt$runDelayed$1(this.$interval, this.$timeUnit, this.$function, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BaseExtensionsKt$runDelayed$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            long p10 = zc.c.p(this.$interval, this.$timeUnit);
            this.label = 1;
            if (u0.b(p10, this) == d10) {
                return d10;
            }
        }
        this.$function.invoke();
        return w.f13270a;
    }
}
