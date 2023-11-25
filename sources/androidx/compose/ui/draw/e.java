package androidx.compose.ui.draw;

import a1.q1;
import androidx.compose.ui.e;
import dc.w;
import n1.e1;
import n1.f;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.n;
import n1.y0;
import p1.e0;
import p1.r;
import pc.l;
import qc.q;
import z0.m;

/* compiled from: PainterModifier.kt */
/* loaded from: classes.dex */
final class e extends e.c implements e0, r {
    private d1.c A;
    private boolean B;
    private v0.b C;
    private f D;
    private float E;
    private q1 F;

    /* compiled from: PainterModifier.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2334f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f2334f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f2334f, 0, 0, 0.0f, 4, null);
        }
    }

    public e(d1.c cVar, boolean z10, v0.b bVar, f fVar, float f10, q1 q1Var) {
        q.i(cVar, "painter");
        q.i(bVar, "alignment");
        q.i(fVar, "contentScale");
        this.A = cVar;
        this.B = z10;
        this.C = bVar;
        this.D = fVar;
        this.E = f10;
        this.F = q1Var;
    }

    private final long I1(long j10) {
        float i10;
        float g10;
        boolean z10;
        if (L1()) {
            if (!N1(this.A.k())) {
                i10 = z0.l.i(j10);
            } else {
                i10 = z0.l.i(this.A.k());
            }
            if (!M1(this.A.k())) {
                g10 = z0.l.g(j10);
            } else {
                g10 = z0.l.g(this.A.k());
            }
            long a10 = m.a(i10, g10);
            boolean z11 = true;
            if (z0.l.i(j10) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (z0.l.g(j10) != 0.0f) {
                    z11 = false;
                }
                if (!z11) {
                    return e1.b(a10, this.D.a(a10, j10));
                }
            }
            return z0.l.f26375b.b();
        }
        return j10;
    }

    private final boolean L1() {
        boolean z10;
        if (!this.B) {
            return false;
        }
        if (this.A.k() != z0.l.f26375b.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    private final boolean M1(long j10) {
        boolean z10;
        if (z0.l.f(j10, z0.l.f26375b.a())) {
            return false;
        }
        float g10 = z0.l.g(j10);
        if (!Float.isInfinite(g10) && !Float.isNaN(g10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    private final boolean N1(long j10) {
        boolean z10;
        if (z0.l.f(j10, z0.l.f26375b.a())) {
            return false;
        }
        float i10 = z0.l.i(j10);
        if (!Float.isInfinite(i10) && !Float.isNaN(i10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    private final long O1(long j10) {
        boolean z10;
        int p10;
        int o10;
        int d10;
        int d11;
        boolean z11 = true;
        if (j2.b.j(j10) && j2.b.i(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!j2.b.l(j10) || !j2.b.k(j10)) {
            z11 = false;
        }
        if ((!L1() && z10) || z11) {
            return j2.b.e(j10, j2.b.n(j10), 0, j2.b.m(j10), 0, 10, null);
        }
        long k10 = this.A.k();
        if (N1(k10)) {
            p10 = sc.c.d(z0.l.i(k10));
        } else {
            p10 = j2.b.p(j10);
        }
        if (M1(k10)) {
            o10 = sc.c.d(z0.l.g(k10));
        } else {
            o10 = j2.b.o(j10);
        }
        long I1 = I1(m.a(j2.c.g(j10, p10), j2.c.f(j10, o10)));
        d10 = sc.c.d(z0.l.i(I1));
        int g10 = j2.c.g(j10, d10);
        d11 = sc.c.d(z0.l.g(I1));
        return j2.b.e(j10, g10, 0, j2.c.f(j10, d11), 0, 10, null);
    }

    public final d1.c J1() {
        return this.A;
    }

    public final boolean K1() {
        return this.B;
    }

    public final void P1(v0.b bVar) {
        q.i(bVar, "<set-?>");
        this.C = bVar;
    }

    public final void Q1(q1 q1Var) {
        this.F = q1Var;
    }

    public final void R1(f fVar) {
        q.i(fVar, "<set-?>");
        this.D = fVar;
    }

    public final void S1(d1.c cVar) {
        q.i(cVar, "<set-?>");
        this.A = cVar;
    }

    public final void T1(boolean z10) {
        this.B = z10;
    }

    public final void c(float f10) {
        this.E = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(O1(j10));
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.e0
    public int f(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        if (L1()) {
            long O1 = O1(j2.c.b(0, 0, 0, i10, 7, null));
            return Math.max(j2.b.p(O1), mVar.t(i10));
        }
        return mVar.t(i10);
    }

    @Override // p1.e0
    public int n(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        if (L1()) {
            long O1 = O1(j2.c.b(0, i10, 0, 0, 13, null));
            return Math.max(j2.b.o(O1), mVar.a0(i10));
        }
        return mVar.a0(i10);
    }

    @Override // androidx.compose.ui.e.c
    public boolean n1() {
        return false;
    }

    @Override // p1.e0
    public int r(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        if (L1()) {
            long O1 = O1(j2.c.b(0, i10, 0, 0, 13, null));
            return Math.max(j2.b.o(O1), mVar.g(i10));
        }
        return mVar.g(i10);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        float i10;
        float g10;
        boolean z10;
        long b10;
        int d10;
        int d11;
        int d12;
        int d13;
        q.i(cVar, "<this>");
        long k10 = this.A.k();
        if (N1(k10)) {
            i10 = z0.l.i(k10);
        } else {
            i10 = z0.l.i(cVar.b());
        }
        if (M1(k10)) {
            g10 = z0.l.g(k10);
        } else {
            g10 = z0.l.g(cVar.b());
        }
        long a10 = m.a(i10, g10);
        boolean z11 = true;
        if (z0.l.i(cVar.b()) == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (z0.l.g(cVar.b()) != 0.0f) {
                z11 = false;
            }
            if (!z11) {
                b10 = e1.b(a10, this.D.a(a10, cVar.b()));
                long j10 = b10;
                v0.b bVar = this.C;
                d10 = sc.c.d(z0.l.i(j10));
                d11 = sc.c.d(z0.l.g(j10));
                long a11 = j2.q.a(d10, d11);
                d12 = sc.c.d(z0.l.i(cVar.b()));
                d13 = sc.c.d(z0.l.g(cVar.b()));
                long a12 = bVar.a(a11, j2.q.a(d12, d13), cVar.getLayoutDirection());
                float j11 = j2.l.j(a12);
                float k11 = j2.l.k(a12);
                cVar.y0().a().b(j11, k11);
                this.A.j(cVar, j10, this.E, this.F);
                cVar.y0().a().b(-j11, -k11);
                cVar.d1();
            }
        }
        b10 = z0.l.f26375b.b();
        long j102 = b10;
        v0.b bVar2 = this.C;
        d10 = sc.c.d(z0.l.i(j102));
        d11 = sc.c.d(z0.l.g(j102));
        long a112 = j2.q.a(d10, d11);
        d12 = sc.c.d(z0.l.i(cVar.b()));
        d13 = sc.c.d(z0.l.g(cVar.b()));
        long a122 = bVar2.a(a112, j2.q.a(d12, d13), cVar.getLayoutDirection());
        float j112 = j2.l.j(a122);
        float k112 = j2.l.k(a122);
        cVar.y0().a().b(j112, k112);
        this.A.j(cVar, j102, this.E, this.F);
        cVar.y0().a().b(-j112, -k112);
        cVar.d1();
    }

    @Override // p1.e0
    public int t(n nVar, n1.m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        if (L1()) {
            long O1 = O1(j2.c.b(0, 0, 0, i10, 7, null));
            return Math.max(j2.b.p(O1), mVar.s(i10));
        }
        return mVar.s(i10);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.A + ", sizeToIntrinsics=" + this.B + ", alignment=" + this.C + ", alpha=" + this.E + ", colorFilter=" + this.F + ')';
    }
}
