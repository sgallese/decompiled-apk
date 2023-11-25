package com.habitrpg.android.habitica.ui.fragments.support;

import ad.k0;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import la.b;
import pc.p;

/* compiled from: BugFixFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.support.BugFixFragment$onViewCreated$1", f = "BugFixFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class BugFixFragment$onViewCreated$1 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ BugFixFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugFixFragment$onViewCreated$1(BugFixFragment bugFixFragment, Continuation<? super BugFixFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = bugFixFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new BugFixFragment$onViewCreated$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((BugFixFragment$onViewCreated$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ic.d.d();
        if (this.label == 0) {
            n.b(obj);
            b.d g10 = la.b.g(this.this$0.getContext());
            final BugFixFragment bugFixFragment = this.this$0;
            g10.a(new b.InterfaceC0439b() { // from class: com.habitrpg.android.habitica.ui.fragments.support.c
                @Override // la.b.InterfaceC0439b
                public final void a(b.c cVar, Exception exc) {
                    BugFixFragment.access$setDeviceInfo$p(BugFixFragment.this, cVar);
                }
            });
            return w.f13270a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
