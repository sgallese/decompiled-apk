package e1;

import a1.q1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.d3;
import j0.e0;
import j0.f0;
import j0.g2;
import j0.h0;
import j0.j1;
import j0.z1;

/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class v extends d1.c {

    /* renamed from: t  reason: collision with root package name */
    private final j1 f13955t;

    /* renamed from: u  reason: collision with root package name */
    private final j1 f13956u;

    /* renamed from: v  reason: collision with root package name */
    private final o f13957v;

    /* renamed from: w  reason: collision with root package name */
    private j0.o f13958w;

    /* renamed from: x  reason: collision with root package name */
    private final j1 f13959x;

    /* renamed from: y  reason: collision with root package name */
    private float f13960y;

    /* renamed from: z  reason: collision with root package name */
    private q1 f13961z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<f0, e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0.o f13962f;

        /* compiled from: Effects.kt */
        /* renamed from: e1.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0332a implements e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j0.o f13963a;

            public C0332a(j0.o oVar) {
                this.f13963a = oVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f13963a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0.o oVar) {
            super(1);
            this.f13962f = oVar;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new C0332a(this.f13962f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f13965m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f13966p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f13967q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.r<Float, Float, j0.l, Integer, dc.w> f13968r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f13969s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, float f10, float f11, pc.r<? super Float, ? super Float, ? super j0.l, ? super Integer, dc.w> rVar, int i10) {
            super(2);
            this.f13965m = str;
            this.f13966p = f10;
            this.f13967q = f11;
            this.f13968r = rVar;
            this.f13969s = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            v.this.n(this.f13965m, this.f13966p, this.f13967q, this.f13968r, lVar, z1.a(this.f13969s | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.r<Float, Float, j0.l, Integer, dc.w> f13970f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v f13971m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.r<? super Float, ? super Float, ? super j0.l, ? super Integer, dc.w> rVar, v vVar) {
            super(2);
            this.f13970f = rVar;
            this.f13971m = vVar;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1916507005, i10, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
            }
            this.f13970f.invoke(Float.valueOf(this.f13971m.f13957v.l()), Float.valueOf(this.f13971m.f13957v.k()), lVar, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<dc.w> {
        d() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v.this.v(true);
        }
    }

    public v() {
        j1 e10;
        j1 e11;
        j1 e12;
        e10 = d3.e(z0.l.c(z0.l.f26375b.b()), null, 2, null);
        this.f13955t = e10;
        e11 = d3.e(Boolean.FALSE, null, 2, null);
        this.f13956u = e11;
        o oVar = new o();
        oVar.n(new d());
        this.f13957v = oVar;
        e12 = d3.e(Boolean.TRUE, null, 2, null);
        this.f13959x = e12;
        this.f13960y = 1.0f;
    }

    private final j0.o q(j0.p pVar, pc.r<? super Float, ? super Float, ? super j0.l, ? super Integer, dc.w> rVar) {
        j0.o oVar = this.f13958w;
        if (oVar == null || oVar.k()) {
            oVar = j0.s.a(new n(this.f13957v.j()), pVar);
        }
        this.f13958w = oVar;
        oVar.e(q0.c.c(-1916507005, true, new c(rVar, this)));
        return oVar;
    }

    private final boolean t() {
        return ((Boolean) this.f13959x.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(boolean z10) {
        this.f13959x.setValue(Boolean.valueOf(z10));
    }

    @Override // d1.c
    protected boolean a(float f10) {
        this.f13960y = f10;
        return true;
    }

    @Override // d1.c
    protected boolean e(q1 q1Var) {
        this.f13961z = q1Var;
        return true;
    }

    @Override // d1.c
    public long k() {
        return s();
    }

    @Override // d1.c
    protected void m(c1.f fVar) {
        qc.q.i(fVar, "<this>");
        o oVar = this.f13957v;
        q1 q1Var = this.f13961z;
        if (q1Var == null) {
            q1Var = oVar.h();
        }
        if (r() && fVar.getLayoutDirection() == j2.r.Rtl) {
            long O0 = fVar.O0();
            c1.d y02 = fVar.y0();
            long b10 = y02.b();
            y02.d().k();
            y02.a().e(-1.0f, 1.0f, O0);
            oVar.g(fVar, this.f13960y, q1Var);
            y02.d().p();
            y02.c(b10);
        } else {
            oVar.g(fVar, this.f13960y, q1Var);
        }
        if (t()) {
            v(false);
        }
    }

    public final void n(String str, float f10, float f11, pc.r<? super Float, ? super Float, ? super j0.l, ? super Integer, dc.w> rVar, j0.l lVar, int i10) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(rVar, "content");
        j0.l q10 = lVar.q(1264894527);
        if (j0.n.K()) {
            j0.n.V(1264894527, i10, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        o oVar = this.f13957v;
        oVar.o(str);
        oVar.q(f10);
        oVar.p(f11);
        j0.o q11 = q(j0.j.d(q10, 0), rVar);
        h0.b(q11, new a(q11), q10, 8);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(str, f10, f11, rVar, i10));
        }
    }

    public final boolean r() {
        return ((Boolean) this.f13956u.getValue()).booleanValue();
    }

    public final long s() {
        return ((z0.l) this.f13955t.getValue()).m();
    }

    public final void u(boolean z10) {
        this.f13956u.setValue(Boolean.valueOf(z10));
    }

    public final void w(q1 q1Var) {
        this.f13957v.m(q1Var);
    }

    public final void x(long j10) {
        this.f13955t.setValue(z0.l.c(j10));
    }
}
