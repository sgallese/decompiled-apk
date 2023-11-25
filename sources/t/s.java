package t;

import androidx.compose.ui.e;

/* compiled from: FocusedBounds.kt */
/* loaded from: classes.dex */
public final class s extends e.c implements o1.i, p1.u {
    private boolean A;
    private n1.s B;

    private final pc.l<n1.s, dc.w> I1() {
        if (p1()) {
            return (pc.l) o(androidx.compose.foundation.n.a());
        }
        return null;
    }

    private final void J1() {
        pc.l<n1.s, dc.w> I1;
        n1.s sVar = this.B;
        if (sVar != null) {
            qc.q.f(sVar);
            if (sVar.r() && (I1 = I1()) != null) {
                I1.invoke(this.B);
            }
        }
    }

    public final void K1(boolean z10) {
        if (z10 == this.A) {
            return;
        }
        if (!z10) {
            pc.l<n1.s, dc.w> I1 = I1();
            if (I1 != null) {
                I1.invoke(null);
            }
        } else {
            J1();
        }
        this.A = z10;
    }

    @Override // o1.i
    public /* synthetic */ o1.g l0() {
        return o1.h.b(this);
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return o1.h.a(this, cVar);
    }

    @Override // p1.u
    public void w(n1.s sVar) {
        qc.q.i(sVar, "coordinates");
        this.B = sVar;
        if (!this.A) {
            return;
        }
        if (sVar.r()) {
            J1();
            return;
        }
        pc.l<n1.s, dc.w> I1 = I1();
        if (I1 != null) {
            I1.invoke(null);
        }
    }
}
