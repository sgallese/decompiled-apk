package p1;

import a1.e4;
import a1.f4;
import a1.t3;
import androidx.compose.ui.e;
import c1.a;

/* compiled from: LayoutNodeDrawScope.kt */
/* loaded from: classes.dex */
public final class l0 implements c1.f, c1.c {

    /* renamed from: f  reason: collision with root package name */
    private final c1.a f20849f;

    /* renamed from: m  reason: collision with root package name */
    private r f20850m;

    public l0(c1.a aVar) {
        qc.q.i(aVar, "canvasDrawScope");
        this.f20849f = aVar;
    }

    @Override // c1.f
    public void D(a1.e1 e1Var, long j10, long j11, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(e1Var, "brush");
        qc.q.i(gVar, "style");
        this.f20849f.D(e1Var, j10, j11, f10, gVar, q1Var, i10);
    }

    @Override // c1.f
    public void F(a1.e1 e1Var, long j10, long j11, float f10, int i10, f4 f4Var, float f11, a1.q1 q1Var, int i11) {
        qc.q.i(e1Var, "brush");
        this.f20849f.F(e1Var, j10, j11, f10, i10, f4Var, f11, q1Var, i11);
    }

    @Override // c1.f
    public void J(a1.e1 e1Var, long j10, long j11, long j12, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(e1Var, "brush");
        qc.q.i(gVar, "style");
        this.f20849f.J(e1Var, j10, j11, j12, f10, gVar, q1Var, i10);
    }

    @Override // j2.e
    public long K(long j10) {
        return this.f20849f.K(j10);
    }

    @Override // j2.e
    public int K0(float f10) {
        return this.f20849f.K0(f10);
    }

    @Override // c1.f
    public void M0(a1.e1 e1Var, float f10, long j10, float f11, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(e1Var, "brush");
        qc.q.i(gVar, "style");
        this.f20849f.M0(e1Var, f10, j10, f11, gVar, q1Var, i10);
    }

    @Override // c1.f
    public long O0() {
        return this.f20849f.O0();
    }

    @Override // c1.f
    public void P(t3 t3Var, long j10, long j11, long j12, long j13, float f10, c1.g gVar, a1.q1 q1Var, int i10, int i11) {
        qc.q.i(t3Var, "image");
        qc.q.i(gVar, "style");
        this.f20849f.P(t3Var, j10, j11, j12, j13, f10, gVar, q1Var, i10, i11);
    }

    @Override // c1.f
    public void Q(e4 e4Var, a1.e1 e1Var, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(e4Var, "path");
        qc.q.i(e1Var, "brush");
        qc.q.i(gVar, "style");
        this.f20849f.Q(e4Var, e1Var, f10, gVar, q1Var, i10);
    }

    @Override // c1.f
    public void R0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(gVar, "style");
        this.f20849f.R0(j10, f10, f11, z10, j11, j12, f12, gVar, q1Var, i10);
    }

    @Override // j2.e
    public long S0(long j10) {
        return this.f20849f.S0(j10);
    }

    @Override // j2.e
    public float T(long j10) {
        return this.f20849f.T(j10);
    }

    @Override // c1.f
    public void V(e4 e4Var, long j10, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(e4Var, "path");
        qc.q.i(gVar, "style");
        this.f20849f.V(e4Var, j10, f10, gVar, q1Var, i10);
    }

    @Override // j2.e
    public float W0(long j10) {
        return this.f20849f.W0(j10);
    }

    @Override // c1.f
    public void X0(long j10, long j11, long j12, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(gVar, "style");
        this.f20849f.X0(j10, j11, j12, f10, gVar, q1Var, i10);
    }

    @Override // c1.f
    public void a1(long j10, long j11, long j12, float f10, int i10, f4 f4Var, float f11, a1.q1 q1Var, int i11) {
        this.f20849f.a1(j10, j11, j12, f10, i10, f4Var, f11, q1Var, i11);
    }

    @Override // c1.f
    public long b() {
        return this.f20849f.b();
    }

    @Override // j2.e
    public long c0(float f10) {
        return this.f20849f.c0(f10);
    }

    public final void d(a1.h1 h1Var, long j10, x0 x0Var, e.c cVar) {
        boolean z10;
        boolean z11;
        qc.q.i(h1Var, "canvas");
        qc.q.i(x0Var, "coordinator");
        qc.q.i(cVar, "drawNode");
        int a10 = z0.a(4);
        k0.f fVar = null;
        while (cVar != null) {
            if (cVar instanceof r) {
                f(h1Var, j10, x0Var, (r) cVar);
            } else {
                if ((cVar.k1() & a10) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && (cVar instanceof l)) {
                    int i10 = 0;
                    for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                        if ((J1.k1() & a10) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            i10++;
                            if (i10 == 1) {
                                cVar = J1;
                            } else {
                                if (fVar == null) {
                                    fVar = new k0.f(new e.c[16], 0);
                                }
                                if (cVar != null) {
                                    fVar.d(cVar);
                                    cVar = null;
                                }
                                fVar.d(J1);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
            }
            cVar = k.g(fVar);
        }
    }

    @Override // c1.c
    public void d1() {
        e.c b10;
        boolean z10;
        boolean z11;
        a1.h1 d10 = y0().d();
        r rVar = this.f20850m;
        qc.q.f(rVar);
        b10 = m0.b(rVar);
        if (b10 != null) {
            int a10 = z0.a(4);
            k0.f fVar = null;
            while (b10 != null) {
                if (b10 instanceof r) {
                    g((r) b10, d10);
                } else {
                    if ((b10.k1() & a10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && (b10 instanceof l)) {
                        int i10 = 0;
                        for (e.c J1 = ((l) b10).J1(); J1 != null; J1 = J1.g1()) {
                            if ((J1.k1() & a10) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i10++;
                                if (i10 == 1) {
                                    b10 = J1;
                                } else {
                                    if (fVar == null) {
                                        fVar = new k0.f(new e.c[16], 0);
                                    }
                                    if (b10 != null) {
                                        fVar.d(b10);
                                        b10 = null;
                                    }
                                    fVar.d(J1);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                b10 = k.g(fVar);
            }
            return;
        }
        x0 h10 = k.h(rVar, z0.a(4));
        if (h10.T1() == rVar.getNode()) {
            h10 = h10.U1();
            qc.q.f(h10);
        }
        h10.q2(d10);
    }

    public final void f(a1.h1 h1Var, long j10, x0 x0Var, r rVar) {
        qc.q.i(h1Var, "canvas");
        qc.q.i(x0Var, "coordinator");
        qc.q.i(rVar, "drawNode");
        r rVar2 = this.f20850m;
        this.f20850m = rVar;
        c1.a aVar = this.f20849f;
        j2.r layoutDirection = x0Var.getLayoutDirection();
        a.C0220a s10 = aVar.s();
        j2.e a10 = s10.a();
        j2.r b10 = s10.b();
        a1.h1 c10 = s10.c();
        long d10 = s10.d();
        a.C0220a s11 = aVar.s();
        s11.j(x0Var);
        s11.k(layoutDirection);
        s11.i(h1Var);
        s11.l(j10);
        h1Var.k();
        rVar.s(this);
        h1Var.p();
        a.C0220a s12 = aVar.s();
        s12.j(a10);
        s12.k(b10);
        s12.i(c10);
        s12.l(d10);
        this.f20850m = rVar2;
    }

    public final void g(r rVar, a1.h1 h1Var) {
        qc.q.i(rVar, "<this>");
        qc.q.i(h1Var, "canvas");
        x0 h10 = k.h(rVar, z0.a(4));
        h10.f1().a0().f(h1Var, j2.q.c(h10.a()), h10, rVar);
    }

    @Override // j2.e
    public float getDensity() {
        return this.f20849f.getDensity();
    }

    @Override // c1.f
    public j2.r getLayoutDirection() {
        return this.f20849f.getLayoutDirection();
    }

    @Override // j2.e
    public float h0(int i10) {
        return this.f20849f.h0(i10);
    }

    @Override // j2.e
    public float j0(float f10) {
        return this.f20849f.j0(f10);
    }

    @Override // c1.f
    public void k0(t3 t3Var, long j10, float f10, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(t3Var, "image");
        qc.q.i(gVar, "style");
        this.f20849f.k0(t3Var, j10, f10, gVar, q1Var, i10);
    }

    @Override // j2.e
    public float p0() {
        return this.f20849f.p0();
    }

    @Override // j2.e
    public float v0(float f10) {
        return this.f20849f.v0(f10);
    }

    @Override // c1.f
    public void w0(long j10, long j11, long j12, long j13, c1.g gVar, float f10, a1.q1 q1Var, int i10) {
        qc.q.i(gVar, "style");
        this.f20849f.w0(j10, j11, j12, j13, gVar, f10, q1Var, i10);
    }

    @Override // c1.f
    public c1.d y0() {
        return this.f20849f.y0();
    }

    @Override // c1.f
    public void z(long j10, float f10, long j11, float f11, c1.g gVar, a1.q1 q1Var, int i10) {
        qc.q.i(gVar, "style");
        this.f20849f.z(j10, f10, j11, f11, gVar, q1Var, i10);
    }

    public /* synthetic */ l0(c1.a aVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? new c1.a() : aVar);
    }
}
