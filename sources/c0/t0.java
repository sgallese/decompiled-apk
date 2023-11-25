package c0;

import a1.b4;
import a2.l;
import j0.d3;
import j0.j1;
import j0.x1;
import java.util.List;

/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private d0 f8572a;

    /* renamed from: b  reason: collision with root package name */
    private final x1 f8573b;

    /* renamed from: c  reason: collision with root package name */
    private final b2.h f8574c;

    /* renamed from: d  reason: collision with root package name */
    private b2.r0 f8575d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f8576e;

    /* renamed from: f  reason: collision with root package name */
    private final j1 f8577f;

    /* renamed from: g  reason: collision with root package name */
    private n1.s f8578g;

    /* renamed from: h  reason: collision with root package name */
    private final j1<v0> f8579h;

    /* renamed from: i  reason: collision with root package name */
    private v1.d f8580i;

    /* renamed from: j  reason: collision with root package name */
    private final j1 f8581j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8582k;

    /* renamed from: l  reason: collision with root package name */
    private final j1 f8583l;

    /* renamed from: m  reason: collision with root package name */
    private final j1 f8584m;

    /* renamed from: n  reason: collision with root package name */
    private final j1 f8585n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f8586o;

    /* renamed from: p  reason: collision with root package name */
    private final v f8587p;

    /* renamed from: q  reason: collision with root package name */
    private pc.l<? super b2.j0, dc.w> f8588q;

    /* renamed from: r  reason: collision with root package name */
    private final pc.l<b2.j0, dc.w> f8589r;

    /* renamed from: s  reason: collision with root package name */
    private final pc.l<b2.o, dc.w> f8590s;

    /* renamed from: t  reason: collision with root package name */
    private final b4 f8591t;

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<b2.o, dc.w> {
        a() {
            super(1);
        }

        public final void a(int i10) {
            t0.this.f8587p.d(i10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b2.o oVar) {
            a(oVar.o());
            return dc.w.f13270a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<b2.j0, dc.w> {
        b() {
            super(1);
        }

        public final void a(b2.j0 j0Var) {
            String str;
            qc.q.i(j0Var, "it");
            String h10 = j0Var.h();
            v1.d s10 = t0.this.s();
            if (s10 != null) {
                str = s10.i();
            } else {
                str = null;
            }
            if (!qc.q.d(h10, str)) {
                t0.this.u(m.None);
            }
            t0.this.f8588q.invoke(j0Var);
            t0.this.l().invalidate();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b2.j0 j0Var) {
            a(j0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<b2.j0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f8594f = new c();

        c() {
            super(1);
        }

        public final void a(b2.j0 j0Var) {
            qc.q.i(j0Var, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(b2.j0 j0Var) {
            a(j0Var);
            return dc.w.f13270a;
        }
    }

    public t0(d0 d0Var, x1 x1Var) {
        j1 e10;
        j1 e11;
        j1<v0> e12;
        j1 e13;
        j1 e14;
        j1 e15;
        j1 e16;
        qc.q.i(d0Var, "textDelegate");
        qc.q.i(x1Var, "recomposeScope");
        this.f8572a = d0Var;
        this.f8573b = x1Var;
        this.f8574c = new b2.h();
        Boolean bool = Boolean.FALSE;
        e10 = d3.e(bool, null, 2, null);
        this.f8576e = e10;
        e11 = d3.e(j2.h.f(j2.h.j(0)), null, 2, null);
        this.f8577f = e11;
        e12 = d3.e(null, null, 2, null);
        this.f8579h = e12;
        e13 = d3.e(m.None, null, 2, null);
        this.f8581j = e13;
        e14 = d3.e(bool, null, 2, null);
        this.f8583l = e14;
        e15 = d3.e(bool, null, 2, null);
        this.f8584m = e15;
        e16 = d3.e(bool, null, 2, null);
        this.f8585n = e16;
        this.f8586o = true;
        this.f8587p = new v();
        this.f8588q = c.f8594f;
        this.f8589r = new b();
        this.f8590s = new a();
        this.f8591t = a1.o0.a();
    }

    public final void A(boolean z10) {
        this.f8585n.setValue(Boolean.valueOf(z10));
    }

    public final void B(boolean z10) {
        this.f8582k = z10;
    }

    public final void C(boolean z10) {
        this.f8584m.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f8583l.setValue(Boolean.valueOf(z10));
    }

    public final void E(v1.d dVar, v1.d dVar2, v1.k0 k0Var, boolean z10, j2.e eVar, l.b bVar, pc.l<? super b2.j0, dc.w> lVar, w wVar, y0.g gVar, long j10) {
        List i10;
        qc.q.i(dVar, "untransformedText");
        qc.q.i(dVar2, "visualText");
        qc.q.i(k0Var, "textStyle");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(lVar, "onValueChange");
        qc.q.i(wVar, "keyboardActions");
        qc.q.i(gVar, "focusManager");
        this.f8588q = lVar;
        this.f8591t.v(j10);
        v vVar = this.f8587p;
        vVar.g(wVar);
        vVar.e(gVar);
        vVar.f(this.f8575d);
        this.f8580i = dVar;
        d0 d0Var = this.f8572a;
        i10 = ec.t.i();
        d0 c10 = e0.c(d0Var, dVar2, k0Var, eVar, bVar, z10, 0, 0, 0, i10, 448, null);
        if (this.f8572a != c10) {
            this.f8586o = true;
        }
        this.f8572a = c10;
    }

    public final m c() {
        return (m) this.f8581j.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f8576e.getValue()).booleanValue();
    }

    public final b2.r0 e() {
        return this.f8575d;
    }

    public final n1.s f() {
        return this.f8578g;
    }

    public final v0 g() {
        return this.f8579h.getValue();
    }

    public final float h() {
        return ((j2.h) this.f8577f.getValue()).o();
    }

    public final pc.l<b2.o, dc.w> i() {
        return this.f8590s;
    }

    public final pc.l<b2.j0, dc.w> j() {
        return this.f8589r;
    }

    public final b2.h k() {
        return this.f8574c;
    }

    public final x1 l() {
        return this.f8573b;
    }

    public final b4 m() {
        return this.f8591t;
    }

    public final boolean n() {
        return ((Boolean) this.f8585n.getValue()).booleanValue();
    }

    public final boolean o() {
        return this.f8582k;
    }

    public final boolean p() {
        return ((Boolean) this.f8584m.getValue()).booleanValue();
    }

    public final boolean q() {
        return ((Boolean) this.f8583l.getValue()).booleanValue();
    }

    public final d0 r() {
        return this.f8572a;
    }

    public final v1.d s() {
        return this.f8580i;
    }

    public final boolean t() {
        return this.f8586o;
    }

    public final void u(m mVar) {
        qc.q.i(mVar, "<set-?>");
        this.f8581j.setValue(mVar);
    }

    public final void v(boolean z10) {
        this.f8576e.setValue(Boolean.valueOf(z10));
    }

    public final void w(b2.r0 r0Var) {
        this.f8575d = r0Var;
    }

    public final void x(n1.s sVar) {
        this.f8578g = sVar;
    }

    public final void y(v0 v0Var) {
        this.f8579h.setValue(v0Var);
        this.f8586o = false;
    }

    public final void z(float f10) {
        this.f8577f.setValue(j2.h.f(f10));
    }
}
