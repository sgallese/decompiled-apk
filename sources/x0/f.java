package x0;

import androidx.compose.ui.e;
import dc.w;
import p1.r;
import qc.q;

/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class f extends e.c implements r {
    private pc.l<? super c1.f, w> A;

    public f(pc.l<? super c1.f, w> lVar) {
        q.i(lVar, "onDraw");
        this.A = lVar;
    }

    public final void I1(pc.l<? super c1.f, w> lVar) {
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
        cVar.d1();
    }
}
