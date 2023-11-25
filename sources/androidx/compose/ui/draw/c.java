package androidx.compose.ui.draw;

import androidx.compose.ui.e;
import dc.w;
import p1.r;
import pc.l;
import qc.q;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
final class c extends e.c implements r {
    private l<? super c1.c, w> A;

    public c(l<? super c1.c, w> lVar) {
        q.i(lVar, "onDraw");
        this.A = lVar;
    }

    public final void I1(l<? super c1.c, w> lVar) {
        q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        q.i(cVar, "<this>");
        this.A.invoke(cVar);
    }
}
