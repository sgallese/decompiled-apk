package h0;

import a1.f0;
import a1.h1;
import a1.p1;
import ad.k0;
import dc.w;
import j0.d3;
import j0.f2;
import j0.g3;
import j0.j1;

/* compiled from: Ripple.android.kt */
/* loaded from: classes.dex */
public final class a extends m implements f2 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f16328m;

    /* renamed from: p  reason: collision with root package name */
    private final float f16329p;

    /* renamed from: q  reason: collision with root package name */
    private final g3<p1> f16330q;

    /* renamed from: r  reason: collision with root package name */
    private final g3<f> f16331r;

    /* renamed from: s  reason: collision with root package name */
    private final i f16332s;

    /* renamed from: t  reason: collision with root package name */
    private final j1 f16333t;

    /* renamed from: u  reason: collision with root package name */
    private final j1 f16334u;

    /* renamed from: v  reason: collision with root package name */
    private long f16335v;

    /* renamed from: w  reason: collision with root package name */
    private int f16336w;

    /* renamed from: x  reason: collision with root package name */
    private final pc.a<w> f16337x;

    /* compiled from: Ripple.android.kt */
    /* renamed from: h0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0384a extends qc.r implements pc.a<w> {
        C0384a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.o(!r0.l());
        }
    }

    public /* synthetic */ a(boolean z10, float f10, g3 g3Var, g3 g3Var2, i iVar, qc.h hVar) {
        this(z10, f10, g3Var, g3Var2, iVar);
    }

    private final void k() {
        this.f16332s.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.f16334u.getValue()).booleanValue();
    }

    private final l m() {
        return (l) this.f16333t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f16334u.setValue(Boolean.valueOf(z10));
    }

    private final void p(l lVar) {
        this.f16333t.setValue(lVar);
    }

    @Override // t.w
    public void a(c1.c cVar) {
        int K0;
        qc.q.i(cVar, "<this>");
        this.f16335v = cVar.b();
        if (Float.isNaN(this.f16329p)) {
            K0 = sc.c.d(h.a(cVar, this.f16328m, cVar.b()));
        } else {
            K0 = cVar.K0(this.f16329p);
        }
        this.f16336w = K0;
        long y10 = this.f16330q.getValue().y();
        float d10 = this.f16331r.getValue().d();
        cVar.d1();
        f(cVar, this.f16329p, y10);
        h1 d11 = cVar.y0().d();
        l();
        l m10 = m();
        if (m10 != null) {
            m10.f(cVar.b(), this.f16336w, y10, d10);
            m10.draw(f0.c(d11));
        }
    }

    @Override // j0.f2
    public void b() {
        k();
    }

    @Override // j0.f2
    public void c() {
        k();
    }

    @Override // h0.m
    public void e(v.p pVar, k0 k0Var) {
        qc.q.i(pVar, "interaction");
        qc.q.i(k0Var, "scope");
        l b10 = this.f16332s.b(this);
        b10.b(pVar, this.f16328m, this.f16335v, this.f16336w, this.f16330q.getValue().y(), this.f16331r.getValue().d(), this.f16337x);
        p(b10);
    }

    @Override // h0.m
    public void g(v.p pVar) {
        qc.q.i(pVar, "interaction");
        l m10 = m();
        if (m10 != null) {
            m10.e();
        }
    }

    public final void n() {
        p(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a(boolean z10, float f10, g3<p1> g3Var, g3<f> g3Var2, i iVar) {
        super(z10, g3Var2);
        j1 e10;
        j1 e11;
        qc.q.i(g3Var, "color");
        qc.q.i(g3Var2, "rippleAlpha");
        qc.q.i(iVar, "rippleContainer");
        this.f16328m = z10;
        this.f16329p = f10;
        this.f16330q = g3Var;
        this.f16331r = g3Var2;
        this.f16332s = iVar;
        e10 = d3.e(null, null, 2, null);
        this.f16333t = e10;
        e11 = d3.e(Boolean.TRUE, null, 2, null);
        this.f16334u = e11;
        this.f16335v = z0.l.f26375b.b();
        this.f16336w = -1;
        this.f16337x = new C0384a();
    }

    @Override // j0.f2
    public void d() {
    }
}
