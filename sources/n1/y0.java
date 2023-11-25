package n1;

/* compiled from: Placeable.kt */
/* loaded from: classes.dex */
public abstract class y0 implements n0 {

    /* renamed from: f  reason: collision with root package name */
    private int f20036f;

    /* renamed from: m  reason: collision with root package name */
    private int f20037m;

    /* renamed from: p  reason: collision with root package name */
    private long f20038p = j2.q.a(0, 0);

    /* renamed from: q  reason: collision with root package name */
    private long f20039q = z0.a();

    /* renamed from: r  reason: collision with root package name */
    private long f20040r = j2.l.f18992b.a();

    /* compiled from: Placeable.kt */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0453a f20041a = new C0453a(null);

        /* renamed from: b  reason: collision with root package name */
        private static j2.r f20042b = j2.r.Ltr;

        /* renamed from: c  reason: collision with root package name */
        private static int f20043c;

        /* renamed from: d  reason: collision with root package name */
        private static s f20044d;

        /* renamed from: e  reason: collision with root package name */
        private static p1.o0 f20045e;

        /* compiled from: Placeable.kt */
        /* renamed from: n1.y0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0453a extends a {
            public /* synthetic */ C0453a(qc.h hVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean D(p1.r0 r0Var) {
                boolean z10 = false;
                if (r0Var == null) {
                    a.f20044d = null;
                    a.f20045e = null;
                    return false;
                }
                boolean k12 = r0Var.k1();
                p1.r0 h12 = r0Var.h1();
                if (h12 != null && h12.k1()) {
                    z10 = true;
                }
                if (z10) {
                    r0Var.n1(true);
                }
                a.f20045e = r0Var.f1().T();
                if (r0Var.k1() || r0Var.l1()) {
                    a.f20044d = null;
                } else {
                    a.f20044d = r0Var.b1();
                }
                return k12;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // n1.y0.a
            public j2.r k() {
                return a.f20042b;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // n1.y0.a
            public int l() {
                return a.f20043c;
            }

            private C0453a() {
            }
        }

        public static /* synthetic */ void n(a aVar, y0 y0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.m(y0Var, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        public static /* synthetic */ void p(a aVar, y0 y0Var, long j10, float f10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f10 = 0.0f;
                }
                aVar.o(y0Var, j10, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void r(a aVar, y0 y0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f10 = 0.0f;
                }
                aVar.q(y0Var, i10, i11, f10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        public static /* synthetic */ void t(a aVar, y0 y0Var, int i10, int i11, float f10, pc.l lVar, int i12, Object obj) {
            float f11;
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                pc.l lVar2 = lVar;
                if ((i12 & 8) != 0) {
                    lVar2 = z0.b();
                }
                aVar.s(y0Var, i10, i11, f11, lVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        public static /* synthetic */ void v(a aVar, y0 y0Var, long j10, float f10, pc.l lVar, int i10, Object obj) {
            float f11;
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                pc.l lVar2 = lVar;
                if ((i10 & 4) != 0) {
                    lVar2 = z0.b();
                }
                aVar.u(y0Var, j10, f11, lVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void x(a aVar, y0 y0Var, int i10, int i11, float f10, pc.l lVar, int i12, Object obj) {
            float f11;
            if (obj == null) {
                if ((i12 & 4) != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                pc.l lVar2 = lVar;
                if ((i12 & 8) != 0) {
                    lVar2 = z0.b();
                }
                aVar.w(y0Var, i10, i11, f11, lVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        public static /* synthetic */ void z(a aVar, y0 y0Var, long j10, float f10, pc.l lVar, int i10, Object obj) {
            float f11;
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                pc.l lVar2 = lVar;
                if ((i10 & 4) != 0) {
                    lVar2 = z0.b();
                }
                aVar.y(y0Var, j10, f11, lVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract j2.r k();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int l();

        public final void m(y0 y0Var, int i10, int i11, float f10) {
            qc.q.i(y0Var, "<this>");
            long a10 = j2.m.a(i10, i11);
            long j10 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(a10) + j2.l.j(j10), j2.l.k(a10) + j2.l.k(j10)), f10, null);
        }

        public final void o(y0 y0Var, long j10, float f10) {
            qc.q.i(y0Var, "$this$place");
            long j11 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(j10) + j2.l.j(j11), j2.l.k(j10) + j2.l.k(j11)), f10, null);
        }

        public final void q(y0 y0Var, int i10, int i11, float f10) {
            qc.q.i(y0Var, "<this>");
            long a10 = j2.m.a(i10, i11);
            if (k() == j2.r.Ltr || l() == 0) {
                long j10 = y0Var.f20040r;
                y0Var.Q0(j2.m.a(j2.l.j(a10) + j2.l.j(j10), j2.l.k(a10) + j2.l.k(j10)), f10, null);
                return;
            }
            long a11 = j2.m.a((l() - y0Var.A0()) - j2.l.j(a10), j2.l.k(a10));
            long j11 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(a11) + j2.l.j(j11), j2.l.k(a11) + j2.l.k(j11)), f10, null);
        }

        public final void s(y0 y0Var, int i10, int i11, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            qc.q.i(y0Var, "<this>");
            qc.q.i(lVar, "layerBlock");
            long a10 = j2.m.a(i10, i11);
            if (k() == j2.r.Ltr || l() == 0) {
                long j10 = y0Var.f20040r;
                y0Var.Q0(j2.m.a(j2.l.j(a10) + j2.l.j(j10), j2.l.k(a10) + j2.l.k(j10)), f10, lVar);
                return;
            }
            long a11 = j2.m.a((l() - y0Var.A0()) - j2.l.j(a10), j2.l.k(a10));
            long j11 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(a11) + j2.l.j(j11), j2.l.k(a11) + j2.l.k(j11)), f10, lVar);
        }

        public final void u(y0 y0Var, long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            qc.q.i(y0Var, "$this$placeRelativeWithLayer");
            qc.q.i(lVar, "layerBlock");
            if (k() == j2.r.Ltr || l() == 0) {
                long j11 = y0Var.f20040r;
                y0Var.Q0(j2.m.a(j2.l.j(j10) + j2.l.j(j11), j2.l.k(j10) + j2.l.k(j11)), f10, lVar);
                return;
            }
            long a10 = j2.m.a((l() - y0Var.A0()) - j2.l.j(j10), j2.l.k(j10));
            long j12 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(a10) + j2.l.j(j12), j2.l.k(a10) + j2.l.k(j12)), f10, lVar);
        }

        public final void w(y0 y0Var, int i10, int i11, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            qc.q.i(y0Var, "<this>");
            qc.q.i(lVar, "layerBlock");
            long a10 = j2.m.a(i10, i11);
            long j10 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(a10) + j2.l.j(j10), j2.l.k(a10) + j2.l.k(j10)), f10, lVar);
        }

        public final void y(y0 y0Var, long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            qc.q.i(y0Var, "$this$placeWithLayer");
            qc.q.i(lVar, "layerBlock");
            long j11 = y0Var.f20040r;
            y0Var.Q0(j2.m.a(j2.l.j(j10) + j2.l.j(j11), j2.l.k(j10) + j2.l.k(j11)), f10, lVar);
        }
    }

    private final void E0() {
        int l10;
        int l11;
        l10 = vc.l.l(j2.p.g(this.f20038p), j2.b.p(this.f20039q), j2.b.n(this.f20039q));
        this.f20036f = l10;
        l11 = vc.l.l(j2.p.f(this.f20038p), j2.b.o(this.f20039q), j2.b.m(this.f20039q));
        this.f20037m = l11;
        this.f20040r = j2.m.a((this.f20036f - j2.p.g(this.f20038p)) / 2, (this.f20037m - j2.p.f(this.f20038p)) / 2);
    }

    public /* synthetic */ Object A() {
        return m0.a(this);
    }

    public final int A0() {
        return this.f20036f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T0(long j10) {
        if (!j2.p.e(this.f20038p, j10)) {
            this.f20038p = j10;
            E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U0(long j10) {
        if (!j2.b.g(this.f20039q, j10)) {
            this.f20039q = j10;
            E0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long g0() {
        return this.f20040r;
    }

    public final int l0() {
        return this.f20037m;
    }

    public int m0() {
        return j2.p.f(this.f20038p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long o0() {
        return this.f20038p;
    }

    public int q0() {
        return j2.p.g(this.f20038p);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long s0() {
        return this.f20039q;
    }
}
