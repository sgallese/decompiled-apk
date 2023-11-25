package e1;

import a1.e1;
import a1.e4;
import a1.h4;
import a1.t0;
import a1.u0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: b  reason: collision with root package name */
    private String f13787b;

    /* renamed from: c  reason: collision with root package name */
    private e1 f13788c;

    /* renamed from: d  reason: collision with root package name */
    private float f13789d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends i> f13790e;

    /* renamed from: f  reason: collision with root package name */
    private int f13791f;

    /* renamed from: g  reason: collision with root package name */
    private float f13792g;

    /* renamed from: h  reason: collision with root package name */
    private float f13793h;

    /* renamed from: i  reason: collision with root package name */
    private e1 f13794i;

    /* renamed from: j  reason: collision with root package name */
    private int f13795j;

    /* renamed from: k  reason: collision with root package name */
    private int f13796k;

    /* renamed from: l  reason: collision with root package name */
    private float f13797l;

    /* renamed from: m  reason: collision with root package name */
    private float f13798m;

    /* renamed from: n  reason: collision with root package name */
    private float f13799n;

    /* renamed from: o  reason: collision with root package name */
    private float f13800o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13801p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13802q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13803r;

    /* renamed from: s  reason: collision with root package name */
    private c1.l f13804s;

    /* renamed from: t  reason: collision with root package name */
    private final e4 f13805t;

    /* renamed from: u  reason: collision with root package name */
    private e4 f13806u;

    /* renamed from: v  reason: collision with root package name */
    private final dc.f f13807v;

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<h4> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f13808f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final h4 invoke() {
            return t0.a();
        }
    }

    public h() {
        super(null);
        dc.f a10;
        this.f13787b = "";
        this.f13789d = 1.0f;
        this.f13790e = t.e();
        this.f13791f = t.b();
        this.f13792g = 1.0f;
        this.f13795j = t.c();
        this.f13796k = t.d();
        this.f13797l = 4.0f;
        this.f13799n = 1.0f;
        this.f13801p = true;
        this.f13802q = true;
        e4 a11 = u0.a();
        this.f13805t = a11;
        this.f13806u = a11;
        a10 = dc.h.a(dc.j.NONE, a.f13808f);
        this.f13807v = a10;
    }

    private final h4 e() {
        return (h4) this.f13807v.getValue();
    }

    private final void t() {
        l.c(this.f13790e, this.f13805t);
        u();
    }

    private final void u() {
        boolean z10;
        boolean z11;
        if (this.f13798m == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f13799n == 1.0f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f13806u = this.f13805t;
                return;
            }
        }
        if (qc.q.d(this.f13806u, this.f13805t)) {
            this.f13806u = u0.a();
        } else {
            int j10 = this.f13806u.j();
            this.f13806u.n();
            this.f13806u.g(j10);
        }
        e().a(this.f13805t, false);
        float c10 = e().c();
        float f10 = this.f13798m;
        float f11 = this.f13800o;
        float f12 = ((f10 + f11) % 1.0f) * c10;
        float f13 = ((this.f13799n + f11) % 1.0f) * c10;
        if (f12 > f13) {
            e().b(f12, c10, this.f13806u, true);
            e().b(0.0f, f13, this.f13806u, true);
            return;
        }
        e().b(f12, f13, this.f13806u, true);
    }

    @Override // e1.m
    public void a(c1.f fVar) {
        qc.q.i(fVar, "<this>");
        if (this.f13801p) {
            t();
        } else if (this.f13803r) {
            u();
        }
        this.f13801p = false;
        this.f13803r = false;
        e1 e1Var = this.f13788c;
        if (e1Var != null) {
            c1.e.k(fVar, this.f13806u, e1Var, this.f13789d, null, null, 0, 56, null);
        }
        e1 e1Var2 = this.f13794i;
        if (e1Var2 != null) {
            c1.l lVar = this.f13804s;
            if (this.f13802q || lVar == null) {
                lVar = new c1.l(this.f13793h, this.f13797l, this.f13795j, this.f13796k, null, 16, null);
                this.f13804s = lVar;
                this.f13802q = false;
            }
            c1.e.k(fVar, this.f13806u, e1Var2, this.f13792g, lVar, null, 0, 48, null);
        }
    }

    public final void f(e1 e1Var) {
        this.f13788c = e1Var;
        c();
    }

    public final void g(float f10) {
        this.f13789d = f10;
        c();
    }

    public final void h(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13787b = str;
        c();
    }

    public final void i(List<? extends i> list) {
        qc.q.i(list, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f13790e = list;
        this.f13801p = true;
        c();
    }

    public final void j(int i10) {
        this.f13791f = i10;
        this.f13806u.g(i10);
        c();
    }

    public final void k(e1 e1Var) {
        this.f13794i = e1Var;
        c();
    }

    public final void l(float f10) {
        this.f13792g = f10;
        c();
    }

    public final void m(int i10) {
        this.f13795j = i10;
        this.f13802q = true;
        c();
    }

    public final void n(int i10) {
        this.f13796k = i10;
        this.f13802q = true;
        c();
    }

    public final void o(float f10) {
        this.f13797l = f10;
        this.f13802q = true;
        c();
    }

    public final void p(float f10) {
        this.f13793h = f10;
        c();
    }

    public final void q(float f10) {
        boolean z10;
        if (this.f13799n == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13799n = f10;
            this.f13803r = true;
            c();
        }
    }

    public final void r(float f10) {
        boolean z10;
        if (this.f13800o == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13800o = f10;
            this.f13803r = true;
            c();
        }
    }

    public final void s(float f10) {
        boolean z10;
        if (this.f13798m == f10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13798m = f10;
            this.f13803r = true;
            c();
        }
    }

    public String toString() {
        return this.f13805t.toString();
    }
}
