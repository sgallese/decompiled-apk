package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;

/* compiled from: RenderNodeLayer.android.kt */
/* loaded from: classes.dex */
public final class p3 implements p1.g1 {

    /* renamed from: f  reason: collision with root package name */
    private final AndroidComposeView f2787f;

    /* renamed from: m  reason: collision with root package name */
    private pc.l<? super a1.h1, dc.w> f2788m;

    /* renamed from: p  reason: collision with root package name */
    private pc.a<dc.w> f2789p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f2790q;

    /* renamed from: r  reason: collision with root package name */
    private final x1 f2791r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2792s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2793t;

    /* renamed from: u  reason: collision with root package name */
    private a1.b4 f2794u;

    /* renamed from: v  reason: collision with root package name */
    private final q1<b1> f2795v;

    /* renamed from: w  reason: collision with root package name */
    private final a1.i1 f2796w;

    /* renamed from: x  reason: collision with root package name */
    private long f2797x;

    /* renamed from: y  reason: collision with root package name */
    private final b1 f2798y;

    /* renamed from: z  reason: collision with root package name */
    public static final b f2786z = new b(null);
    private static final pc.p<b1, Matrix, dc.w> A = a.f2799f;

    /* compiled from: RenderNodeLayer.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<b1, Matrix, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2799f = new a();

        a() {
            super(2);
        }

        public final void a(b1 b1Var, Matrix matrix) {
            qc.q.i(b1Var, "rn");
            qc.q.i(matrix, "matrix");
            b1Var.I(matrix);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(b1 b1Var, Matrix matrix) {
            a(b1Var, matrix);
            return dc.w.f13270a;
        }
    }

    /* compiled from: RenderNodeLayer.android.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }
    }

    public p3(AndroidComposeView androidComposeView, pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar) {
        b1 y1Var;
        qc.q.i(androidComposeView, "ownerView");
        qc.q.i(lVar, "drawBlock");
        qc.q.i(aVar, "invalidateParentLayer");
        this.f2787f = androidComposeView;
        this.f2788m = lVar;
        this.f2789p = aVar;
        this.f2791r = new x1(androidComposeView.getDensity());
        this.f2795v = new q1<>(A);
        this.f2796w = new a1.i1();
        this.f2797x = androidx.compose.ui.graphics.g.f2458b.a();
        if (Build.VERSION.SDK_INT >= 29) {
            y1Var = new m3(androidComposeView);
        } else {
            y1Var = new y1(androidComposeView);
        }
        y1Var.G(true);
        this.f2798y = y1Var;
    }

    private final void j(a1.h1 h1Var) {
        if (this.f2798y.E() || this.f2798y.B()) {
            this.f2791r.a(h1Var);
        }
    }

    private final void k(boolean z10) {
        if (z10 != this.f2790q) {
            this.f2790q = z10;
            this.f2787f.h0(this, z10);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            y4.f2967a.a(this.f2787f);
        } else {
            this.f2787f.invalidate();
        }
    }

    @Override // p1.g1
    public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, a1.q4 q4Var, boolean z10, a1.l4 l4Var, long j11, long j12, int i10, j2.r rVar, j2.e eVar) {
        pc.a<dc.w> aVar;
        qc.q.i(q4Var, "shape");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(eVar, "density");
        this.f2797x = j10;
        boolean z11 = this.f2798y.E() && !this.f2791r.d();
        this.f2798y.q(f10);
        this.f2798y.k(f11);
        this.f2798y.c(f12);
        this.f2798y.u(f13);
        this.f2798y.i(f14);
        this.f2798y.w(f15);
        this.f2798y.D(a1.r1.k(j11));
        this.f2798y.H(a1.r1.k(j12));
        this.f2798y.h(f18);
        this.f2798y.x(f16);
        this.f2798y.e(f17);
        this.f2798y.v(f19);
        this.f2798y.n(androidx.compose.ui.graphics.g.f(j10) * this.f2798y.getWidth());
        this.f2798y.t(androidx.compose.ui.graphics.g.g(j10) * this.f2798y.getHeight());
        this.f2798y.F(z10 && q4Var != a1.k4.a());
        this.f2798y.o(z10 && q4Var == a1.k4.a());
        this.f2798y.l(l4Var);
        this.f2798y.m(i10);
        boolean g10 = this.f2791r.g(q4Var, this.f2798y.d(), this.f2798y.E(), this.f2798y.J(), rVar, eVar);
        this.f2798y.A(this.f2791r.c());
        boolean z12 = this.f2798y.E() && !this.f2791r.d();
        if (z11 == z12 && (!z12 || !g10)) {
            l();
        } else {
            invalidate();
        }
        if (!this.f2793t && this.f2798y.J() > 0.0f && (aVar = this.f2789p) != null) {
            aVar.invoke();
        }
        this.f2795v.c();
    }

    @Override // p1.g1
    public void b(pc.l<? super a1.h1, dc.w> lVar, pc.a<dc.w> aVar) {
        qc.q.i(lVar, "drawBlock");
        qc.q.i(aVar, "invalidateParentLayer");
        k(false);
        this.f2792s = false;
        this.f2793t = false;
        this.f2797x = androidx.compose.ui.graphics.g.f2458b.a();
        this.f2788m = lVar;
        this.f2789p = aVar;
    }

    @Override // p1.g1
    public void c(z0.d dVar, boolean z10) {
        qc.q.i(dVar, "rect");
        if (z10) {
            float[] a10 = this.f2795v.a(this.f2798y);
            if (a10 == null) {
                dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            } else {
                a1.x3.g(a10, dVar);
                return;
            }
        }
        a1.x3.g(this.f2795v.b(this.f2798y), dVar);
    }

    @Override // p1.g1
    public boolean d(long j10) {
        float o10 = z0.f.o(j10);
        float p10 = z0.f.p(j10);
        if (this.f2798y.B()) {
            if (0.0f <= o10 && o10 < this.f2798y.getWidth() && 0.0f <= p10 && p10 < this.f2798y.getHeight()) {
                return true;
            }
            return false;
        } else if (!this.f2798y.E()) {
            return true;
        } else {
            return this.f2791r.e(j10);
        }
    }

    @Override // p1.g1
    public void destroy() {
        if (this.f2798y.z()) {
            this.f2798y.r();
        }
        this.f2788m = null;
        this.f2789p = null;
        this.f2792s = true;
        k(false);
        this.f2787f.o0();
        this.f2787f.m0(this);
    }

    @Override // p1.g1
    public long e(long j10, boolean z10) {
        if (z10) {
            float[] a10 = this.f2795v.a(this.f2798y);
            if (a10 != null) {
                return a1.x3.f(a10, j10);
            }
            return z0.f.f26354b.a();
        }
        return a1.x3.f(this.f2795v.b(this.f2798y), j10);
    }

    @Override // p1.g1
    public void f(long j10) {
        int g10 = j2.p.g(j10);
        int f10 = j2.p.f(j10);
        float f11 = g10;
        this.f2798y.n(androidx.compose.ui.graphics.g.f(this.f2797x) * f11);
        float f12 = f10;
        this.f2798y.t(androidx.compose.ui.graphics.g.g(this.f2797x) * f12);
        b1 b1Var = this.f2798y;
        if (b1Var.p(b1Var.b(), this.f2798y.C(), this.f2798y.b() + g10, this.f2798y.C() + f10)) {
            this.f2791r.h(z0.m.a(f11, f12));
            this.f2798y.A(this.f2791r.c());
            invalidate();
            this.f2795v.c();
        }
    }

    @Override // p1.g1
    public void g(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        Canvas c10 = a1.f0.c(h1Var);
        boolean z10 = false;
        if (c10.isHardwareAccelerated()) {
            i();
            if (this.f2798y.J() > 0.0f) {
                z10 = true;
            }
            this.f2793t = z10;
            if (z10) {
                h1Var.u();
            }
            this.f2798y.j(c10);
            if (this.f2793t) {
                h1Var.m();
                return;
            }
            return;
        }
        float b10 = this.f2798y.b();
        float C = this.f2798y.C();
        float f10 = this.f2798y.f();
        float g10 = this.f2798y.g();
        if (this.f2798y.d() < 1.0f) {
            a1.b4 b4Var = this.f2794u;
            if (b4Var == null) {
                b4Var = a1.o0.a();
                this.f2794u = b4Var;
            }
            b4Var.c(this.f2798y.d());
            c10.saveLayer(b10, C, f10, g10, b4Var.l());
        } else {
            h1Var.k();
        }
        h1Var.b(b10, C);
        h1Var.o(this.f2795v.b(this.f2798y));
        j(h1Var);
        pc.l<? super a1.h1, dc.w> lVar = this.f2788m;
        if (lVar != null) {
            lVar.invoke(h1Var);
        }
        h1Var.p();
        k(false);
    }

    @Override // p1.g1
    public void h(long j10) {
        int b10 = this.f2798y.b();
        int C = this.f2798y.C();
        int j11 = j2.l.j(j10);
        int k10 = j2.l.k(j10);
        if (b10 != j11 || C != k10) {
            if (b10 != j11) {
                this.f2798y.a(j11 - b10);
            }
            if (C != k10) {
                this.f2798y.y(k10 - C);
            }
            l();
            this.f2795v.c();
        }
    }

    @Override // p1.g1
    public void i() {
        a1.e4 e4Var;
        if (this.f2790q || !this.f2798y.z()) {
            k(false);
            if (this.f2798y.E() && !this.f2791r.d()) {
                e4Var = this.f2791r.b();
            } else {
                e4Var = null;
            }
            pc.l<? super a1.h1, dc.w> lVar = this.f2788m;
            if (lVar != null) {
                this.f2798y.s(this.f2796w, e4Var, lVar);
            }
        }
    }

    @Override // p1.g1
    public void invalidate() {
        if (!this.f2790q && !this.f2792s) {
            this.f2787f.invalidate();
            k(true);
        }
    }
}
