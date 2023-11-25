package com.habitrpg.android.habitica.ui.views;

import dc.w;
import pc.q;
import qc.r;
import r.o;
import s.d0;
import w.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingButton.kt */
/* loaded from: classes4.dex */
public final class LoadingButtonKt$LoadingButton$2$1$1$1 extends r implements pc.l<r.f<LoadingButtonState>, o> {
    final /* synthetic */ q<a0, j0.l, Integer, w> $successContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoadingButtonKt$LoadingButton$2$1$1$1(q<? super a0, ? super j0.l, ? super Integer, w> qVar) {
        super(1);
        this.$successContent = qVar;
    }

    @Override // pc.l
    public final o invoke(r.f<LoadingButtonState> fVar) {
        qc.q.i(fVar, "$this$AnimatedContent");
        LoadingButtonState a10 = fVar.a();
        LoadingButtonState loadingButtonState = LoadingButtonState.CONTENT;
        boolean z10 = true;
        boolean z11 = a10 == loadingButtonState || fVar.a() == LoadingButtonState.DISABLED || (fVar.a() == LoadingButtonState.SUCCESS && this.$successContent == null);
        if (fVar.c() != loadingButtonState && fVar.c() != LoadingButtonState.DISABLED && (fVar.c() != LoadingButtonState.SUCCESS || this.$successContent != null)) {
            z10 = false;
        }
        if (fVar.c() == LoadingButtonState.FAILED) {
            return r.b.f(r.q.v(s.k.i(220, 90, null, 4, null), 0.0f, 2, null).b(r.q.L(s.k.g(0.2f, 400.0f, null, 4, null), null, 2, null)), r.q.x(s.k.i(90, 0, null, 6, null), 0.0f, 2, null));
        }
        if (z11 && z10) {
            return r.b.f(r.q.v(null, 0.0f, 3, null), r.q.x(null, 0.0f, 3, null));
        }
        return r.b.f(r.q.v(s.k.i(220, 90, null, 4, null), 0.0f, 2, null).b(r.q.z(s.k.h(220, 90, d0.b()), 0.92f, 0L, 4, null)), r.q.x(s.k.i(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
