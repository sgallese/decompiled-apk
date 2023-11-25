package androidx.compose.foundation;

import androidx.compose.ui.e;
import dc.w;

/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
final class o extends e.c implements o1.i, pc.l<n1.s, w> {
    private pc.l<? super n1.s, w> A;
    private final o1.g B;

    public o(pc.l<? super n1.s, w> lVar) {
        qc.q.i(lVar, "onPositioned");
        this.A = lVar;
        this.B = o1.j.b(dc.r.a(n.a(), this));
    }

    private final pc.l<n1.s, w> I1() {
        if (p1()) {
            return (pc.l) o(n.a());
        }
        return null;
    }

    public void J1(n1.s sVar) {
        if (!p1()) {
            return;
        }
        this.A.invoke(sVar);
        pc.l<n1.s, w> I1 = I1();
        if (I1 != null) {
            I1.invoke(sVar);
        }
    }

    public final void K1(pc.l<? super n1.s, w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(n1.s sVar) {
        J1(sVar);
        return w.f13270a;
    }

    @Override // o1.i
    public o1.g l0() {
        return this.B;
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return o1.h.a(this, cVar);
    }
}
