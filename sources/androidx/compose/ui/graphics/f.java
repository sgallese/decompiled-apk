package androidx.compose.ui.graphics;

import a1.l4;
import a1.p1;
import a1.q4;
import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.m;
import n1.n;
import n1.y0;
import p1.d0;
import p1.e0;
import p1.k;
import p1.x0;
import p1.z0;
import pc.l;
import qc.h;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
public final class f extends e.c implements e0 {
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private long K;
    private q4 L;
    private boolean M;
    private long N;
    private long O;
    private int P;
    private l<? super d, w> Q;

    /* compiled from: GraphicsLayerModifier.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<d, w> {
        a() {
            super(1);
        }

        public final void a(d dVar) {
            q.i(dVar, "$this$null");
            dVar.q(f.this.B());
            dVar.k(f.this.c1());
            dVar.c(f.this.J1());
            dVar.u(f.this.F0());
            dVar.i(f.this.r0());
            dVar.C(f.this.O1());
            dVar.x(f.this.I0());
            dVar.e(f.this.Z());
            dVar.h(f.this.f0());
            dVar.v(f.this.C0());
            dVar.L0(f.this.H0());
            dVar.z0(f.this.P1());
            dVar.G0(f.this.L1());
            f.this.N1();
            dVar.l(null);
            dVar.x0(f.this.K1());
            dVar.N0(f.this.Q1());
            dVar.m(f.this.M1());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(d dVar) {
            a(dVar);
            return w.f13270a;
        }
    }

    /* compiled from: GraphicsLayerModifier.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2456f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f f2457m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var, f fVar) {
            super(1);
            this.f2456f = y0Var;
            this.f2457m = fVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.x(aVar, this.f2456f, 0, 0, 0.0f, this.f2457m.Q, 4, null);
        }
    }

    public /* synthetic */ f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q4 q4Var, boolean z10, l4 l4Var, long j11, long j12, int i10, h hVar) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, q4Var, z10, l4Var, j11, j12, i10);
    }

    public final float B() {
        return this.A;
    }

    public final void C(float f10) {
        this.F = f10;
    }

    public final float C0() {
        return this.J;
    }

    public final float F0() {
        return this.D;
    }

    public final void G0(boolean z10) {
        this.M = z10;
    }

    public final long H0() {
        return this.K;
    }

    public final float I0() {
        return this.G;
    }

    public final float J1() {
        return this.C;
    }

    public final long K1() {
        return this.N;
    }

    public final void L0(long j10) {
        this.K = j10;
    }

    public final boolean L1() {
        return this.M;
    }

    public final int M1() {
        return this.P;
    }

    public final void N0(long j10) {
        this.O = j10;
    }

    public final l4 N1() {
        return null;
    }

    public final float O1() {
        return this.F;
    }

    public final q4 P1() {
        return this.L;
    }

    public final long Q1() {
        return this.O;
    }

    public final void R1() {
        x0 U1 = k.h(this, z0.a(2)).U1();
        if (U1 != null) {
            U1.E2(this.Q, true);
        }
    }

    public final float Z() {
        return this.H;
    }

    public final void c(float f10) {
        this.C = f10;
    }

    public final float c1() {
        return this.B;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new b(w10, this), 4, null);
    }

    public final void e(float f10) {
        this.H = f10;
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    public final float f0() {
        return this.I;
    }

    public final void h(float f10) {
        this.I = f10;
    }

    public final void i(float f10) {
        this.E = f10;
    }

    public final void k(float f10) {
        this.B = f10;
    }

    public final void m(int i10) {
        this.P = i10;
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e.c
    public boolean n1() {
        return false;
    }

    public final void q(float f10) {
        this.A = f10;
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    public final float r0() {
        return this.E;
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.A + ", scaleY=" + this.B + ", alpha = " + this.C + ", translationX=" + this.D + ", translationY=" + this.E + ", shadowElevation=" + this.F + ", rotationX=" + this.G + ", rotationY=" + this.H + ", rotationZ=" + this.I + ", cameraDistance=" + this.J + ", transformOrigin=" + ((Object) g.i(this.K)) + ", shape=" + this.L + ", clip=" + this.M + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) p1.x(this.N)) + ", spotShadowColor=" + ((Object) p1.x(this.O)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.b.g(this.P)) + ')';
    }

    public final void u(float f10) {
        this.D = f10;
    }

    public final void v(float f10) {
        this.J = f10;
    }

    public final void x(float f10) {
        this.G = f10;
    }

    public final void x0(long j10) {
        this.N = j10;
    }

    public final void z0(q4 q4Var) {
        q.i(q4Var, "<set-?>");
        this.L = q4Var;
    }

    private f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, q4 q4Var, boolean z10, l4 l4Var, long j11, long j12, int i10) {
        q.i(q4Var, "shape");
        this.A = f10;
        this.B = f11;
        this.C = f12;
        this.D = f13;
        this.E = f14;
        this.F = f15;
        this.G = f16;
        this.H = f17;
        this.I = f18;
        this.J = f19;
        this.K = j10;
        this.L = q4Var;
        this.M = z10;
        this.N = j11;
        this.O = j12;
        this.P = i10;
        this.Q = new a();
    }

    public final void l(l4 l4Var) {
    }
}
