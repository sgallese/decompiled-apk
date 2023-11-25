package androidx.compose.ui.platform;

import a1.z3;
import android.graphics.Outline;
import android.os.Build;
import z0.l;

/* compiled from: OutlineResolver.android.kt */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a  reason: collision with root package name */
    private j2.e f2933a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2934b;

    /* renamed from: c  reason: collision with root package name */
    private final Outline f2935c;

    /* renamed from: d  reason: collision with root package name */
    private long f2936d;

    /* renamed from: e  reason: collision with root package name */
    private a1.q4 f2937e;

    /* renamed from: f  reason: collision with root package name */
    private a1.e4 f2938f;

    /* renamed from: g  reason: collision with root package name */
    private a1.e4 f2939g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2940h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2941i;

    /* renamed from: j  reason: collision with root package name */
    private a1.e4 f2942j;

    /* renamed from: k  reason: collision with root package name */
    private z0.j f2943k;

    /* renamed from: l  reason: collision with root package name */
    private float f2944l;

    /* renamed from: m  reason: collision with root package name */
    private long f2945m;

    /* renamed from: n  reason: collision with root package name */
    private long f2946n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2947o;

    /* renamed from: p  reason: collision with root package name */
    private j2.r f2948p;

    /* renamed from: q  reason: collision with root package name */
    private a1.e4 f2949q;

    /* renamed from: r  reason: collision with root package name */
    private a1.e4 f2950r;

    /* renamed from: s  reason: collision with root package name */
    private a1.z3 f2951s;

    public x1(j2.e eVar) {
        qc.q.i(eVar, "density");
        this.f2933a = eVar;
        this.f2934b = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f2935c = outline;
        l.a aVar = z0.l.f26375b;
        this.f2936d = aVar.b();
        this.f2937e = a1.k4.a();
        this.f2945m = z0.f.f26354b.c();
        this.f2946n = aVar.b();
        this.f2948p = j2.r.Ltr;
    }

    private final boolean f(z0.j jVar, long j10, long j11, float f10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (jVar == null || !z0.k.d(jVar)) {
            return false;
        }
        if (jVar.e() == z0.f.o(j10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (jVar.g() == z0.f.p(j10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        if (jVar.f() == z0.f.o(j10) + z0.l.i(j11)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        if (jVar.a() == z0.f.p(j10) + z0.l.g(j11)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            return false;
        }
        if (z0.a.d(jVar.h()) == f10) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (!z14) {
            return false;
        }
        return true;
    }

    private final void i() {
        if (this.f2940h) {
            this.f2945m = z0.f.f26354b.c();
            long j10 = this.f2936d;
            this.f2946n = j10;
            this.f2944l = 0.0f;
            this.f2939g = null;
            this.f2940h = false;
            this.f2941i = false;
            if (this.f2947o && z0.l.i(j10) > 0.0f && z0.l.g(this.f2936d) > 0.0f) {
                this.f2934b = true;
                a1.z3 a10 = this.f2937e.a(this.f2936d, this.f2948p, this.f2933a);
                this.f2951s = a10;
                if (a10 instanceof z3.b) {
                    k(((z3.b) a10).a());
                    return;
                } else if (a10 instanceof z3.c) {
                    l(((z3.c) a10).a());
                    return;
                } else if (a10 instanceof z3.a) {
                    j(((z3.a) a10).a());
                    return;
                } else {
                    return;
                }
            }
            this.f2935c.setEmpty();
        }
    }

    private final void j(a1.e4 e4Var) {
        if (Build.VERSION.SDK_INT <= 28 && !e4Var.a()) {
            this.f2934b = false;
            this.f2935c.setEmpty();
            this.f2941i = true;
        } else {
            Outline outline = this.f2935c;
            if (e4Var instanceof a1.p0) {
                outline.setConvexPath(((a1.p0) e4Var).u());
                this.f2941i = !this.f2935c.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.f2939g = e4Var;
    }

    private final void k(z0.h hVar) {
        int d10;
        int d11;
        int d12;
        int d13;
        this.f2945m = z0.g.a(hVar.i(), hVar.l());
        this.f2946n = z0.m.a(hVar.n(), hVar.h());
        Outline outline = this.f2935c;
        d10 = sc.c.d(hVar.i());
        d11 = sc.c.d(hVar.l());
        d12 = sc.c.d(hVar.j());
        d13 = sc.c.d(hVar.e());
        outline.setRect(d10, d11, d12, d13);
    }

    private final void l(z0.j jVar) {
        int d10;
        int d11;
        int d12;
        int d13;
        float d14 = z0.a.d(jVar.h());
        this.f2945m = z0.g.a(jVar.e(), jVar.g());
        this.f2946n = z0.m.a(jVar.j(), jVar.d());
        if (z0.k.d(jVar)) {
            Outline outline = this.f2935c;
            d10 = sc.c.d(jVar.e());
            d11 = sc.c.d(jVar.g());
            d12 = sc.c.d(jVar.f());
            d13 = sc.c.d(jVar.a());
            outline.setRoundRect(d10, d11, d12, d13, d14);
            this.f2944l = d14;
            return;
        }
        a1.e4 e4Var = this.f2938f;
        if (e4Var == null) {
            e4Var = a1.u0.a();
            this.f2938f = e4Var;
        }
        e4Var.s();
        e4Var.i(jVar);
        j(e4Var);
    }

    public final void a(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        a1.e4 b10 = b();
        if (b10 != null) {
            a1.g1.c(h1Var, b10, 0, 2, null);
            return;
        }
        float f10 = this.f2944l;
        if (f10 > 0.0f) {
            a1.e4 e4Var = this.f2942j;
            z0.j jVar = this.f2943k;
            if (e4Var == null || !f(jVar, this.f2945m, this.f2946n, f10)) {
                z0.j c10 = z0.k.c(z0.f.o(this.f2945m), z0.f.p(this.f2945m), z0.f.o(this.f2945m) + z0.l.i(this.f2946n), z0.f.p(this.f2945m) + z0.l.g(this.f2946n), z0.b.b(this.f2944l, 0.0f, 2, null));
                if (e4Var == null) {
                    e4Var = a1.u0.a();
                } else {
                    e4Var.s();
                }
                e4Var.i(c10);
                this.f2943k = c10;
                this.f2942j = e4Var;
            }
            a1.g1.c(h1Var, e4Var, 0, 2, null);
            return;
        }
        a1.g1.d(h1Var, z0.f.o(this.f2945m), z0.f.p(this.f2945m), z0.f.o(this.f2945m) + z0.l.i(this.f2946n), z0.f.p(this.f2945m) + z0.l.g(this.f2946n), 0, 16, null);
    }

    public final a1.e4 b() {
        i();
        return this.f2939g;
    }

    public final Outline c() {
        i();
        if (this.f2947o && this.f2934b) {
            return this.f2935c;
        }
        return null;
    }

    public final boolean d() {
        return !this.f2941i;
    }

    public final boolean e(long j10) {
        a1.z3 z3Var;
        if (!this.f2947o || (z3Var = this.f2951s) == null) {
            return true;
        }
        return v3.b(z3Var, z0.f.o(j10), z0.f.p(j10), this.f2949q, this.f2950r);
    }

    public final boolean g(a1.q4 q4Var, float f10, boolean z10, float f11, j2.r rVar, j2.e eVar) {
        boolean z11;
        qc.q.i(q4Var, "shape");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(eVar, "density");
        this.f2935c.setAlpha(f10);
        boolean z12 = !qc.q.d(this.f2937e, q4Var);
        if (z12) {
            this.f2937e = q4Var;
            this.f2940h = true;
        }
        if (!z10 && f11 <= 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (this.f2947o != z11) {
            this.f2947o = z11;
            this.f2940h = true;
        }
        if (this.f2948p != rVar) {
            this.f2948p = rVar;
            this.f2940h = true;
        }
        if (!qc.q.d(this.f2933a, eVar)) {
            this.f2933a = eVar;
            this.f2940h = true;
        }
        return z12;
    }

    public final void h(long j10) {
        if (!z0.l.f(this.f2936d, j10)) {
            this.f2936d = j10;
            this.f2940h = true;
        }
    }
}
