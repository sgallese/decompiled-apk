package androidx.compose.ui.graphics;

import a1.k4;
import a1.l4;
import a1.q4;
import a1.s3;
import qc.q;
import z0.l;

/* compiled from: GraphicsLayerScope.kt */
/* loaded from: classes.dex */
public final class e implements d {
    private boolean B;

    /* renamed from: q  reason: collision with root package name */
    private float f2445q;

    /* renamed from: r  reason: collision with root package name */
    private float f2446r;

    /* renamed from: s  reason: collision with root package name */
    private float f2447s;

    /* renamed from: v  reason: collision with root package name */
    private float f2450v;

    /* renamed from: w  reason: collision with root package name */
    private float f2451w;

    /* renamed from: x  reason: collision with root package name */
    private float f2452x;

    /* renamed from: f  reason: collision with root package name */
    private float f2442f = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f2443m = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    private float f2444p = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    private long f2448t = s3.a();

    /* renamed from: u  reason: collision with root package name */
    private long f2449u = s3.a();

    /* renamed from: y  reason: collision with root package name */
    private float f2453y = 8.0f;

    /* renamed from: z  reason: collision with root package name */
    private long f2454z = g.f2458b.a();
    private q4 A = k4.a();
    private int C = b.f2438a.a();
    private long D = l.f26375b.a();
    private j2.e E = j2.g.b(1.0f, 0.0f, 2, null);

    @Override // androidx.compose.ui.graphics.d
    public float B() {
        return this.f2442f;
    }

    @Override // androidx.compose.ui.graphics.d
    public void C(float f10) {
        this.f2447s = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public float C0() {
        return this.f2453y;
    }

    @Override // androidx.compose.ui.graphics.d
    public float F0() {
        return this.f2445q;
    }

    @Override // androidx.compose.ui.graphics.d
    public void G0(boolean z10) {
        this.B = z10;
    }

    @Override // androidx.compose.ui.graphics.d
    public long H0() {
        return this.f2454z;
    }

    @Override // androidx.compose.ui.graphics.d
    public float I0() {
        return this.f2450v;
    }

    @Override // j2.e
    public /* synthetic */ long K(long j10) {
        return j2.d.e(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ int K0(float f10) {
        return j2.d.a(this, f10);
    }

    @Override // androidx.compose.ui.graphics.d
    public void L0(long j10) {
        this.f2454z = j10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void N0(long j10) {
        this.f2449u = j10;
    }

    @Override // j2.e
    public /* synthetic */ long S0(long j10) {
        return j2.d.h(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float T(long j10) {
        return j2.d.b(this, j10);
    }

    @Override // j2.e
    public /* synthetic */ float W0(long j10) {
        return j2.d.f(this, j10);
    }

    @Override // androidx.compose.ui.graphics.d
    public float Z() {
        return this.f2451w;
    }

    @Override // androidx.compose.ui.graphics.d
    public long b() {
        return this.D;
    }

    @Override // androidx.compose.ui.graphics.d
    public void c(float f10) {
        this.f2444p = f10;
    }

    @Override // j2.e
    public /* synthetic */ long c0(float f10) {
        return j2.d.i(this, f10);
    }

    @Override // androidx.compose.ui.graphics.d
    public float c1() {
        return this.f2443m;
    }

    public float d() {
        return this.f2444p;
    }

    @Override // androidx.compose.ui.graphics.d
    public void e(float f10) {
        this.f2451w = f10;
    }

    public long f() {
        return this.f2448t;
    }

    @Override // androidx.compose.ui.graphics.d
    public float f0() {
        return this.f2452x;
    }

    public boolean g() {
        return this.B;
    }

    @Override // j2.e
    public float getDensity() {
        return this.E.getDensity();
    }

    @Override // androidx.compose.ui.graphics.d
    public void h(float f10) {
        this.f2452x = f10;
    }

    @Override // j2.e
    public /* synthetic */ float h0(int i10) {
        return j2.d.d(this, i10);
    }

    @Override // androidx.compose.ui.graphics.d
    public void i(float f10) {
        this.f2446r = f10;
    }

    public int j() {
        return this.C;
    }

    @Override // j2.e
    public /* synthetic */ float j0(float f10) {
        return j2.d.c(this, f10);
    }

    @Override // androidx.compose.ui.graphics.d
    public void k(float f10) {
        this.f2443m = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void m(int i10) {
        this.C = i10;
    }

    public l4 n() {
        return null;
    }

    public float o() {
        return this.f2447s;
    }

    public q4 p() {
        return this.A;
    }

    @Override // j2.e
    public float p0() {
        return this.E.p0();
    }

    @Override // androidx.compose.ui.graphics.d
    public void q(float f10) {
        this.f2442f = f10;
    }

    public long r() {
        return this.f2449u;
    }

    @Override // androidx.compose.ui.graphics.d
    public float r0() {
        return this.f2446r;
    }

    public final void s() {
        q(1.0f);
        k(1.0f);
        c(1.0f);
        u(0.0f);
        i(0.0f);
        C(0.0f);
        x0(s3.a());
        N0(s3.a());
        x(0.0f);
        e(0.0f);
        h(0.0f);
        v(8.0f);
        L0(g.f2458b.a());
        z0(k4.a());
        G0(false);
        l(null);
        m(b.f2438a.a());
        w(l.f26375b.a());
    }

    public final void t(j2.e eVar) {
        q.i(eVar, "<set-?>");
        this.E = eVar;
    }

    @Override // androidx.compose.ui.graphics.d
    public void u(float f10) {
        this.f2445q = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void v(float f10) {
        this.f2453y = f10;
    }

    @Override // j2.e
    public /* synthetic */ float v0(float f10) {
        return j2.d.g(this, f10);
    }

    public void w(long j10) {
        this.D = j10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void x(float f10) {
        this.f2450v = f10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void x0(long j10) {
        this.f2448t = j10;
    }

    @Override // androidx.compose.ui.graphics.d
    public void z0(q4 q4Var) {
        q.i(q4Var, "<set-?>");
        this.A = q4Var;
    }

    @Override // androidx.compose.ui.graphics.d
    public void l(l4 l4Var) {
    }
}
