package com.habitrpg.android.habitica.ui.fragments.support;

import ad.k0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import la.b;
import pc.p;

/* compiled from: FAQOverviewFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.support.FAQOverviewFragment$onViewCreated$1", f = "FAQOverviewFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FAQOverviewFragment$onViewCreated$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ FAQOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQOverviewFragment$onViewCreated$1(FAQOverviewFragment fAQOverviewFragment, Continuation<? super FAQOverviewFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = fAQOverviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new FAQOverviewFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((FAQOverviewFragment$onViewCreated$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            b.d g10 = la.b.g(this.this$0.getContext());
            final FAQOverviewFragment fAQOverviewFragment = this.this$0;
            g10.a(new b.InterfaceC0439b() { // from class: com.habitrpg.android.habitica.ui.fragments.support.f
                @Override // la.b.InterfaceC0439b
                public final void a(b.c cVar, Exception exc) {
                    FAQOverviewFragment.access$setDeviceInfo$p(FAQOverviewFragment.this, cVar);
                }
            });
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
