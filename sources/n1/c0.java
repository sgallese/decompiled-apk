package n1;

import z0.f;

/* compiled from: LookaheadLayoutCoordinates.kt */
/* loaded from: classes.dex */
public final class c0 implements s {

    /* renamed from: f  reason: collision with root package name */
    private final p1.s0 f19952f;

    public c0(p1.s0 s0Var) {
        qc.q.i(s0Var, "lookaheadDelegate");
        this.f19952f = s0Var;
    }

    private final long c() {
        p1.s0 a10 = d0.a(this.f19952f);
        s b12 = a10.b1();
        f.a aVar = z0.f.f26354b;
        return z0.f.s(O(b12, aVar.c()), b().O(a10.u1(), aVar.c()));
    }

    @Override // n1.s
    public s H() {
        p1.s0 P1;
        if (r()) {
            p1.x0 V1 = b().f1().j0().V1();
            if (V1 == null || (P1 = V1.P1()) == null) {
                return null;
            }
            return P1.b1();
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // n1.s
    public z0.h L(s sVar, boolean z10) {
        qc.q.i(sVar, "sourceCoordinates");
        return b().L(sVar, z10);
    }

    @Override // n1.s
    public long O(s sVar, long j10) {
        int d10;
        int d11;
        int d12;
        int d13;
        qc.q.i(sVar, "sourceCoordinates");
        if (sVar instanceof c0) {
            p1.s0 s0Var = ((c0) sVar).f19952f;
            s0Var.u1().j2();
            p1.s0 P1 = b().I1(s0Var.u1()).P1();
            if (P1 != null) {
                long x12 = s0Var.x1(P1);
                d12 = sc.c.d(z0.f.o(j10));
                d13 = sc.c.d(z0.f.p(j10));
                long a10 = j2.m.a(d12, d13);
                long a11 = j2.m.a(j2.l.j(x12) + j2.l.j(a10), j2.l.k(x12) + j2.l.k(a10));
                long x13 = this.f19952f.x1(P1);
                long a12 = j2.m.a(j2.l.j(a11) - j2.l.j(x13), j2.l.k(a11) - j2.l.k(x13));
                return z0.g.a(j2.l.j(a12), j2.l.k(a12));
            }
            p1.s0 a13 = d0.a(s0Var);
            long x14 = s0Var.x1(a13);
            long i12 = a13.i1();
            long a14 = j2.m.a(j2.l.j(x14) + j2.l.j(i12), j2.l.k(x14) + j2.l.k(i12));
            d10 = sc.c.d(z0.f.o(j10));
            d11 = sc.c.d(z0.f.p(j10));
            long a15 = j2.m.a(d10, d11);
            long a16 = j2.m.a(j2.l.j(a14) + j2.l.j(a15), j2.l.k(a14) + j2.l.k(a15));
            p1.s0 s0Var2 = this.f19952f;
            long x15 = s0Var2.x1(d0.a(s0Var2));
            long i13 = d0.a(s0Var2).i1();
            long a17 = j2.m.a(j2.l.j(x15) + j2.l.j(i13), j2.l.k(x15) + j2.l.k(i13));
            long a18 = j2.m.a(j2.l.j(a16) - j2.l.j(a17), j2.l.k(a16) - j2.l.k(a17));
            p1.x0 V1 = d0.a(this.f19952f).u1().V1();
            qc.q.f(V1);
            p1.x0 V12 = a13.u1().V1();
            qc.q.f(V12);
            return V1.O(V12, z0.g.a(j2.l.j(a18), j2.l.k(a18)));
        }
        p1.s0 a19 = d0.a(this.f19952f);
        return z0.f.t(O(a19.v1(), j10), a19.u1().b1().O(sVar, z0.f.f26354b.c()));
    }

    @Override // n1.s
    public long U(long j10) {
        return b().U(z0.f.t(j10, c()));
    }

    @Override // n1.s
    public long a() {
        p1.s0 s0Var = this.f19952f;
        return j2.q.a(s0Var.A0(), s0Var.l0());
    }

    public final p1.x0 b() {
        return this.f19952f.u1();
    }

    @Override // n1.s
    public long n(long j10) {
        return b().n(z0.f.t(j10, c()));
    }

    @Override // n1.s
    public boolean r() {
        return b().r();
    }

    @Override // n1.s
    public long y(long j10) {
        return z0.f.t(b().y(j10), c());
    }
}
