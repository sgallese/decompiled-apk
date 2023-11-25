package p1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* compiled from: LookaheadDelegate.kt */
/* loaded from: classes.dex */
public abstract class r0 extends n1.y0 implements n1.l0 {

    /* renamed from: s  reason: collision with root package name */
    private boolean f20917s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f20918t;

    @Override // n1.n0
    public final int G(n1.a aVar) {
        int Y0;
        qc.q.i(aVar, "alignmentLine");
        if (!e1() || (Y0 = Y0(aVar)) == Integer.MIN_VALUE) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return Y0 + j2.l.k(g0());
    }

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return j2.d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return j2.d.a(this, f10);
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return j2.d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return j2.d.b(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return j2.d.f(this, j10);
    }

    public abstract int Y0(n1.a aVar);

    public abstract r0 Z0();

    public abstract n1.s b1();

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return j2.d.i(this, f10);
    }

    @Override // n1.l0
    public /* synthetic */ n1.j0 e0(int i10, int i11, Map map, pc.l lVar) {
        return n1.k0.a(this, i10, i11, map, lVar);
    }

    public abstract boolean e1();

    public abstract j0 f1();

    public abstract n1.j0 g1();

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return j2.d.d(this, i10);
    }

    public abstract r0 h1();

    public abstract long i1();

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return j2.d.c(this, f10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j1(x0 x0Var) {
        j0 j0Var;
        a d10;
        qc.q.i(x0Var, "<this>");
        x0 U1 = x0Var.U1();
        if (U1 != null) {
            j0Var = U1.f1();
        } else {
            j0Var = null;
        }
        if (!qc.q.d(j0Var, x0Var.f1())) {
            x0Var.L1().d().m();
            return;
        }
        b p10 = x0Var.L1().p();
        if (p10 != null && (d10 = p10.d()) != null) {
            d10.m();
        }
    }

    public final boolean k1() {
        return this.f20918t;
    }

    public final boolean l1() {
        return this.f20917s;
    }

    public abstract void m1();

    public final void n1(boolean z10) {
        this.f20918t = z10;
    }

    public final void o1(boolean z10) {
        this.f20917s = z10;
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return j2.d.g(this, f10);
    }
}
