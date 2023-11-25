package c1;

import a1.a1;
import a1.b4;
import a1.c4;
import a1.e1;
import a1.e4;
import a1.f4;
import a1.h1;
import a1.o0;
import a1.p1;
import a1.q1;
import a1.q3;
import a1.s4;
import a1.t3;
import a1.t4;
import j2.r;
import kotlin.NoWhenBranchMatchedException;
import qc.q;

/* compiled from: CanvasDrawScope.kt */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: f  reason: collision with root package name */
    private final C0220a f8667f = new C0220a(null, null, null, 0, 15, null);

    /* renamed from: m  reason: collision with root package name */
    private final d f8668m = new b();

    /* renamed from: p  reason: collision with root package name */
    private b4 f8669p;

    /* renamed from: q  reason: collision with root package name */
    private b4 f8670q;

    /* compiled from: CanvasDrawScope.kt */
    /* renamed from: c1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0220a {

        /* renamed from: a  reason: collision with root package name */
        private j2.e f8671a;

        /* renamed from: b  reason: collision with root package name */
        private r f8672b;

        /* renamed from: c  reason: collision with root package name */
        private h1 f8673c;

        /* renamed from: d  reason: collision with root package name */
        private long f8674d;

        public /* synthetic */ C0220a(j2.e eVar, r rVar, h1 h1Var, long j10, qc.h hVar) {
            this(eVar, rVar, h1Var, j10);
        }

        public final j2.e a() {
            return this.f8671a;
        }

        public final r b() {
            return this.f8672b;
        }

        public final h1 c() {
            return this.f8673c;
        }

        public final long d() {
            return this.f8674d;
        }

        public final h1 e() {
            return this.f8673c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0220a)) {
                return false;
            }
            C0220a c0220a = (C0220a) obj;
            if (q.d(this.f8671a, c0220a.f8671a) && this.f8672b == c0220a.f8672b && q.d(this.f8673c, c0220a.f8673c) && z0.l.f(this.f8674d, c0220a.f8674d)) {
                return true;
            }
            return false;
        }

        public final j2.e f() {
            return this.f8671a;
        }

        public final r g() {
            return this.f8672b;
        }

        public final long h() {
            return this.f8674d;
        }

        public int hashCode() {
            return (((((this.f8671a.hashCode() * 31) + this.f8672b.hashCode()) * 31) + this.f8673c.hashCode()) * 31) + z0.l.j(this.f8674d);
        }

        public final void i(h1 h1Var) {
            q.i(h1Var, "<set-?>");
            this.f8673c = h1Var;
        }

        public final void j(j2.e eVar) {
            q.i(eVar, "<set-?>");
            this.f8671a = eVar;
        }

        public final void k(r rVar) {
            q.i(rVar, "<set-?>");
            this.f8672b = rVar;
        }

        public final void l(long j10) {
            this.f8674d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f8671a + ", layoutDirection=" + this.f8672b + ", canvas=" + this.f8673c + ", size=" + ((Object) z0.l.l(this.f8674d)) + ')';
        }

        private C0220a(j2.e eVar, r rVar, h1 h1Var, long j10) {
            q.i(eVar, "density");
            q.i(rVar, "layoutDirection");
            q.i(h1Var, "canvas");
            this.f8671a = eVar;
            this.f8672b = rVar;
            this.f8673c = h1Var;
            this.f8674d = j10;
        }

        public /* synthetic */ C0220a(j2.e eVar, r rVar, h1 h1Var, long j10, int i10, qc.h hVar) {
            this((i10 & 1) != 0 ? c1.b.f8677a : eVar, (i10 & 2) != 0 ? r.Ltr : rVar, (i10 & 4) != 0 ? new j() : h1Var, (i10 & 8) != 0 ? z0.l.f26375b.b() : j10, null);
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    /* loaded from: classes.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        private final i f8675a;

        b() {
            i c10;
            c10 = c1.b.c(this);
            this.f8675a = c10;
        }

        @Override // c1.d
        public i a() {
            return this.f8675a;
        }

        @Override // c1.d
        public long b() {
            return a.this.s().h();
        }

        @Override // c1.d
        public void c(long j10) {
            a.this.s().l(j10);
        }

        @Override // c1.d
        public h1 d() {
            return a.this.s().e();
        }
    }

    private final b4 A(g gVar) {
        boolean z10;
        if (q.d(gVar, k.f8683a)) {
            return w();
        }
        if (gVar instanceof l) {
            b4 y10 = y();
            l lVar = (l) gVar;
            boolean z11 = true;
            if (y10.y() == lVar.f()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                y10.x(lVar.f());
            }
            if (!s4.g(y10.s(), lVar.b())) {
                y10.g(lVar.b());
            }
            if (y10.i() != lVar.d()) {
                z11 = false;
            }
            if (!z11) {
                y10.o(lVar.d());
            }
            if (!t4.g(y10.f(), lVar.c())) {
                y10.t(lVar.c());
            }
            if (!q.d(y10.w(), lVar.e())) {
                y10.j(lVar.e());
            }
            return y10;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final b4 d(long j10, g gVar, float f10, q1 q1Var, int i10, int i11) {
        b4 A = A(gVar);
        long t10 = t(j10, f10);
        if (!p1.q(A.e(), t10)) {
            A.v(t10);
        }
        if (A.n() != null) {
            A.m(null);
        }
        if (!q.d(A.k(), q1Var)) {
            A.q(q1Var);
        }
        if (!a1.G(A.z(), i10)) {
            A.h(i10);
        }
        if (!q3.d(A.r(), i11)) {
            A.p(i11);
        }
        return A;
    }

    static /* synthetic */ b4 f(a aVar, long j10, g gVar, float f10, q1 q1Var, int i10, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 32) != 0) {
            i13 = f.f8679g.b();
        } else {
            i13 = i11;
        }
        return aVar.d(j10, gVar, f10, q1Var, i10, i13);
    }

    private final b4 g(e1 e1Var, g gVar, float f10, q1 q1Var, int i10, int i11) {
        boolean z10;
        b4 A = A(gVar);
        if (e1Var != null) {
            e1Var.a(b(), A, f10);
        } else {
            if (A.d() == f10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                A.c(f10);
            }
        }
        if (!q.d(A.k(), q1Var)) {
            A.q(q1Var);
        }
        if (!a1.G(A.z(), i10)) {
            A.h(i10);
        }
        if (!q3.d(A.r(), i11)) {
            A.p(i11);
        }
        return A;
    }

    static /* synthetic */ b4 j(a aVar, e1 e1Var, g gVar, float f10, q1 q1Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.f8679g.b();
        }
        return aVar.g(e1Var, gVar, f10, q1Var, i10, i11);
    }

    private final b4 n(long j10, float f10, float f11, int i10, int i11, f4 f4Var, float f12, q1 q1Var, int i12, int i13) {
        boolean z10;
        b4 y10 = y();
        long t10 = t(j10, f12);
        if (!p1.q(y10.e(), t10)) {
            y10.v(t10);
        }
        if (y10.n() != null) {
            y10.m(null);
        }
        if (!q.d(y10.k(), q1Var)) {
            y10.q(q1Var);
        }
        if (!a1.G(y10.z(), i12)) {
            y10.h(i12);
        }
        boolean z11 = true;
        if (y10.y() == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            y10.x(f10);
        }
        if (y10.i() != f11) {
            z11 = false;
        }
        if (!z11) {
            y10.o(f11);
        }
        if (!s4.g(y10.s(), i10)) {
            y10.g(i10);
        }
        if (!t4.g(y10.f(), i11)) {
            y10.t(i11);
        }
        if (!q.d(y10.w(), f4Var)) {
            y10.j(f4Var);
        }
        if (!q3.d(y10.r(), i13)) {
            y10.p(i13);
        }
        return y10;
    }

    static /* synthetic */ b4 o(a aVar, long j10, float f10, float f11, int i10, int i11, f4 f4Var, float f12, q1 q1Var, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            i15 = f.f8679g.b();
        } else {
            i15 = i13;
        }
        return aVar.n(j10, f10, f11, i10, i11, f4Var, f12, q1Var, i12, i15);
    }

    private final b4 p(e1 e1Var, float f10, float f11, int i10, int i11, f4 f4Var, float f12, q1 q1Var, int i12, int i13) {
        boolean z10;
        boolean z11;
        b4 y10 = y();
        boolean z12 = true;
        if (e1Var != null) {
            e1Var.a(b(), y10, f12);
        } else {
            if (y10.d() == f12) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                y10.c(f12);
            }
        }
        if (!q.d(y10.k(), q1Var)) {
            y10.q(q1Var);
        }
        if (!a1.G(y10.z(), i12)) {
            y10.h(i12);
        }
        if (y10.y() == f10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            y10.x(f10);
        }
        if (y10.i() != f11) {
            z12 = false;
        }
        if (!z12) {
            y10.o(f11);
        }
        if (!s4.g(y10.s(), i10)) {
            y10.g(i10);
        }
        if (!t4.g(y10.f(), i11)) {
            y10.t(i11);
        }
        if (!q.d(y10.w(), f4Var)) {
            y10.j(f4Var);
        }
        if (!q3.d(y10.r(), i13)) {
            y10.p(i13);
        }
        return y10;
    }

    static /* synthetic */ b4 r(a aVar, e1 e1Var, float f10, float f11, int i10, int i11, f4 f4Var, float f12, q1 q1Var, int i12, int i13, int i14, Object obj) {
        int i15;
        if ((i14 & 512) != 0) {
            i15 = f.f8679g.b();
        } else {
            i15 = i13;
        }
        return aVar.p(e1Var, f10, f11, i10, i11, f4Var, f12, q1Var, i12, i15);
    }

    private final long t(long j10, float f10) {
        boolean z10;
        if (f10 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return p1.o(j10, p1.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j10;
    }

    private final b4 w() {
        b4 b4Var = this.f8669p;
        if (b4Var == null) {
            b4 a10 = o0.a();
            a10.u(c4.f89a.a());
            this.f8669p = a10;
            return a10;
        }
        return b4Var;
    }

    private final b4 y() {
        b4 b4Var = this.f8670q;
        if (b4Var == null) {
            b4 a10 = o0.a();
            a10.u(c4.f89a.b());
            this.f8670q = a10;
            return a10;
        }
        return b4Var;
    }

    @Override // c1.f
    public void D(e1 e1Var, long j10, long j11, float f10, g gVar, q1 q1Var, int i10) {
        q.i(e1Var, "brush");
        q.i(gVar, "style");
        this.f8667f.e().f(z0.f.o(j10), z0.f.p(j10), z0.f.o(j10) + z0.l.i(j11), z0.f.p(j10) + z0.l.g(j11), j(this, e1Var, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // c1.f
    public void F(e1 e1Var, long j10, long j11, float f10, int i10, f4 f4Var, float f11, q1 q1Var, int i11) {
        q.i(e1Var, "brush");
        this.f8667f.e().n(j10, j11, r(this, e1Var, f10, 4.0f, i10, t4.f193b.b(), f4Var, f11, q1Var, i11, 0, 512, null));
    }

    @Override // c1.f
    public void J(e1 e1Var, long j10, long j11, long j12, float f10, g gVar, q1 q1Var, int i10) {
        q.i(e1Var, "brush");
        q.i(gVar, "style");
        this.f8667f.e().g(z0.f.o(j10), z0.f.p(j10), z0.f.o(j10) + z0.l.i(j11), z0.f.p(j10) + z0.l.g(j11), z0.a.d(j12), z0.a.e(j12), j(this, e1Var, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return j2.d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return j2.d.a(this, f10);
    }

    @Override // c1.f
    public void M0(e1 e1Var, float f10, long j10, float f11, g gVar, q1 q1Var, int i10) {
        q.i(e1Var, "brush");
        q.i(gVar, "style");
        this.f8667f.e().s(j10, f10, j(this, e1Var, gVar, f11, q1Var, i10, 0, 32, null));
    }

    @Override // c1.f
    public /* synthetic */ long O0() {
        return e.a(this);
    }

    @Override // c1.f
    public void P(t3 t3Var, long j10, long j11, long j12, long j13, float f10, g gVar, q1 q1Var, int i10, int i11) {
        q.i(t3Var, "image");
        q.i(gVar, "style");
        this.f8667f.e().t(t3Var, j10, j11, j12, j13, g(null, gVar, f10, q1Var, i10, i11));
    }

    @Override // c1.f
    public void Q(e4 e4Var, e1 e1Var, float f10, g gVar, q1 q1Var, int i10) {
        q.i(e4Var, "path");
        q.i(e1Var, "brush");
        q.i(gVar, "style");
        this.f8667f.e().j(e4Var, j(this, e1Var, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // c1.f
    public void R0(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, g gVar, q1 q1Var, int i10) {
        q.i(gVar, "style");
        this.f8667f.e().l(z0.f.o(j11), z0.f.p(j11), z0.f.o(j11) + z0.l.i(j12), z0.f.p(j11) + z0.l.g(j12), f10, f11, z10, f(this, j10, gVar, f12, q1Var, i10, 0, 32, null));
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return j2.d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return j2.d.b(this, j10);
    }

    @Override // c1.f
    public void V(e4 e4Var, long j10, float f10, g gVar, q1 q1Var, int i10) {
        q.i(e4Var, "path");
        q.i(gVar, "style");
        this.f8667f.e().j(e4Var, f(this, j10, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return j2.d.f(this, j10);
    }

    @Override // c1.f
    public void X0(long j10, long j11, long j12, float f10, g gVar, q1 q1Var, int i10) {
        q.i(gVar, "style");
        this.f8667f.e().f(z0.f.o(j11), z0.f.p(j11), z0.f.o(j11) + z0.l.i(j12), z0.f.p(j11) + z0.l.g(j12), f(this, j10, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // c1.f
    public void a1(long j10, long j11, long j12, float f10, int i10, f4 f4Var, float f11, q1 q1Var, int i11) {
        this.f8667f.e().n(j11, j12, o(this, j10, f10, 4.0f, i10, t4.f193b.b(), f4Var, f11, q1Var, i11, 0, 512, null));
    }

    @Override // c1.f
    public /* synthetic */ long b() {
        return e.b(this);
    }

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return j2.d.i(this, f10);
    }

    @Override // j2.e
    public float getDensity() {
        return this.f8667f.f().getDensity();
    }

    @Override // c1.f
    public r getLayoutDirection() {
        return this.f8667f.g();
    }

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return j2.d.d(this, i10);
    }

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return j2.d.c(this, f10);
    }

    @Override // c1.f
    public void k0(t3 t3Var, long j10, float f10, g gVar, q1 q1Var, int i10) {
        q.i(t3Var, "image");
        q.i(gVar, "style");
        this.f8667f.e().r(t3Var, j10, j(this, null, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // j2.e
    public float p0() {
        return this.f8667f.f().p0();
    }

    public final C0220a s() {
        return this.f8667f;
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return j2.d.g(this, f10);
    }

    @Override // c1.f
    public void w0(long j10, long j11, long j12, long j13, g gVar, float f10, q1 q1Var, int i10) {
        q.i(gVar, "style");
        this.f8667f.e().g(z0.f.o(j11), z0.f.p(j11), z0.f.o(j11) + z0.l.i(j12), z0.f.p(j11) + z0.l.g(j12), z0.a.d(j13), z0.a.e(j13), f(this, j10, gVar, f10, q1Var, i10, 0, 32, null));
    }

    @Override // c1.f
    public d y0() {
        return this.f8668m;
    }

    @Override // c1.f
    public void z(long j10, float f10, long j11, float f11, g gVar, q1 q1Var, int i10) {
        q.i(gVar, "style");
        this.f8667f.e().s(j11, f10, f(this, j10, gVar, f11, q1Var, i10, 0, 32, null));
    }
}
