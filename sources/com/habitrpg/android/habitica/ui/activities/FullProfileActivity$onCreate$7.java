package com.habitrpg.android.habitica.ui.activities;

import kotlin.coroutines.Continuation;

/* compiled from: FullProfileActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.FullProfileActivity$onCreate$7", f = "FullProfileActivity.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FullProfileActivity$onCreate$7 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ FullProfileActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullProfileActivity$onCreate$7(FullProfileActivity fullProfileActivity, Continuation<? super FullProfileActivity$onCreate$7> continuation) {
        super(2, continuation);
        this.this$0 = fullProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new FullProfileActivity$onCreate$7(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((FullProfileActivity$onCreate$7) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Object refresh;
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
            FullProfileActivity fullProfileActivity = this.this$0;
            this.label = 1;
            refresh = fullProfileActivity.refresh(false, this);
            if (refresh == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
