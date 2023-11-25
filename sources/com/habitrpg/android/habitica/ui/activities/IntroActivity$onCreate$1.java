package com.habitrpg.android.habitica.ui.activities;

import com.habitrpg.android.habitica.data.ContentRepository;
import kotlin.coroutines.Continuation;

/* compiled from: IntroActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.IntroActivity$onCreate$1", f = "IntroActivity.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IntroActivity$onCreate$1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ IntroActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroActivity$onCreate$1(IntroActivity introActivity, Continuation<? super IntroActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = introActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new IntroActivity$onCreate$1(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((IntroActivity$onCreate$1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
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
            ContentRepository contentRepository = this.this$0.getContentRepository();
            this.label = 1;
            if (ContentRepository.DefaultImpls.retrieveContent$default(contentRepository, false, this, 1, null) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
