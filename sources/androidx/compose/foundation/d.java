package androidx.compose.foundation;

import a1.a4;
import a1.e1;
import a1.k4;
import a1.p1;
import a1.q4;
import a1.z3;
import androidx.compose.ui.e;

/* compiled from: Background.kt */
/* loaded from: classes.dex */
final class d extends e.c implements p1.r {
    private long A;
    private e1 B;
    private float C;
    private q4 D;
    private z0.l E;
    private j2.r F;
    private z3 G;
    private q4 H;

    public /* synthetic */ d(long j10, e1 e1Var, float f10, q4 q4Var, qc.h hVar) {
        this(j10, e1Var, f10, q4Var);
    }

    private final void I1(c1.c cVar) {
        z3 a10;
        if (z0.l.e(cVar.b(), this.E) && cVar.getLayoutDirection() == this.F && qc.q.d(this.H, this.D)) {
            a10 = this.G;
            qc.q.f(a10);
        } else {
            a10 = this.D.a(cVar.b(), cVar.getLayoutDirection(), cVar);
        }
        if (!p1.q(this.A, p1.f146b.e())) {
            a4.e(cVar, a10, this.A, 0.0f, null, null, 0, 60, null);
        }
        e1 e1Var = this.B;
        if (e1Var != null) {
            a4.c(cVar, a10, e1Var, this.C, null, null, 0, 56, null);
        }
        this.G = a10;
        this.E = z0.l.c(cVar.b());
        this.F = cVar.getLayoutDirection();
        this.H = this.D;
    }

    private final void J1(c1.c cVar) {
        if (!p1.q(this.A, p1.f146b.e())) {
            c1.e.m(cVar, this.A, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        e1 e1Var = this.B;
        if (e1Var != null) {
            c1.e.l(cVar, e1Var, 0L, 0L, this.C, null, null, 0, 118, null);
        }
    }

    public final void K1(e1 e1Var) {
        this.B = e1Var;
    }

    public final void L1(long j10) {
        this.A = j10;
    }

    public final void c(float f10) {
        this.C = f10;
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        qc.q.i(cVar, "<this>");
        if (this.D == k4.a()) {
            J1(cVar);
        } else {
            I1(cVar);
        }
        cVar.d1();
    }

    public final void z0(q4 q4Var) {
        qc.q.i(q4Var, "<set-?>");
        this.D = q4Var;
    }

    private d(long j10, e1 e1Var, float f10, q4 q4Var) {
        qc.q.i(q4Var, "shape");
        this.A = j10;
        this.B = e1Var;
        this.C = f10;
        this.D = q4Var;
    }
}
