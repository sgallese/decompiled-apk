package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import dc.w;

/* compiled from: FocusProperties.kt */
/* loaded from: classes.dex */
final class j extends e.c implements y0.k {
    private pc.l<? super g, w> A;

    public j(pc.l<? super g, w> lVar) {
        qc.q.i(lVar, "focusPropertiesScope");
        this.A = lVar;
    }

    public final void I1(pc.l<? super g, w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // y0.k
    public void U(g gVar) {
        qc.q.i(gVar, "focusProperties");
        this.A.invoke(gVar);
    }
}
