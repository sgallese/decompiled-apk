package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import dc.w;

/* compiled from: FocusChangedModifier.kt */
/* loaded from: classes.dex */
final class c extends e.c implements y0.c {
    private pc.l<? super y0.o, w> A;
    private y0.o B;

    public c(pc.l<? super y0.o, w> lVar) {
        qc.q.i(lVar, "onFocusChanged");
        this.A = lVar;
    }

    public final void I1(pc.l<? super y0.o, w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // y0.c
    public void j(y0.o oVar) {
        qc.q.i(oVar, "focusState");
        if (!qc.q.d(this.B, oVar)) {
            this.B = oVar;
            this.A.invoke(oVar);
        }
    }
}
