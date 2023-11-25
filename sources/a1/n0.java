package a1;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: AndroidPaint.android.kt */
/* loaded from: classes.dex */
public final class n0 implements b4 {

    /* renamed from: a  reason: collision with root package name */
    private Paint f123a;

    /* renamed from: b  reason: collision with root package name */
    private int f124b;

    /* renamed from: c  reason: collision with root package name */
    private Shader f125c;

    /* renamed from: d  reason: collision with root package name */
    private q1 f126d;

    /* renamed from: e  reason: collision with root package name */
    private f4 f127e;

    public n0(Paint paint) {
        qc.q.i(paint, "internalPaint");
        this.f123a = paint;
        this.f124b = a1.f62b.B();
    }

    @Override // a1.b4
    public void c(float f10) {
        o0.k(this.f123a, f10);
    }

    @Override // a1.b4
    public float d() {
        return o0.c(this.f123a);
    }

    @Override // a1.b4
    public long e() {
        return o0.d(this.f123a);
    }

    @Override // a1.b4
    public int f() {
        return o0.g(this.f123a);
    }

    @Override // a1.b4
    public void g(int i10) {
        o0.r(this.f123a, i10);
    }

    @Override // a1.b4
    public void h(int i10) {
        if (!a1.G(this.f124b, i10)) {
            this.f124b = i10;
            o0.l(this.f123a, i10);
        }
    }

    @Override // a1.b4
    public float i() {
        return o0.h(this.f123a);
    }

    @Override // a1.b4
    public void j(f4 f4Var) {
        o0.p(this.f123a, f4Var);
        this.f127e = f4Var;
    }

    @Override // a1.b4
    public q1 k() {
        return this.f126d;
    }

    @Override // a1.b4
    public Paint l() {
        return this.f123a;
    }

    @Override // a1.b4
    public void m(Shader shader) {
        this.f125c = shader;
        o0.q(this.f123a, shader);
    }

    @Override // a1.b4
    public Shader n() {
        return this.f125c;
    }

    @Override // a1.b4
    public void o(float f10) {
        o0.t(this.f123a, f10);
    }

    @Override // a1.b4
    public void p(int i10) {
        o0.o(this.f123a, i10);
    }

    @Override // a1.b4
    public void q(q1 q1Var) {
        this.f126d = q1Var;
        o0.n(this.f123a, q1Var);
    }

    @Override // a1.b4
    public int r() {
        return o0.e(this.f123a);
    }

    @Override // a1.b4
    public int s() {
        return o0.f(this.f123a);
    }

    @Override // a1.b4
    public void t(int i10) {
        o0.s(this.f123a, i10);
    }

    @Override // a1.b4
    public void u(int i10) {
        o0.v(this.f123a, i10);
    }

    @Override // a1.b4
    public void v(long j10) {
        o0.m(this.f123a, j10);
    }

    @Override // a1.b4
    public f4 w() {
        return this.f127e;
    }

    @Override // a1.b4
    public void x(float f10) {
        o0.u(this.f123a, f10);
    }

    @Override // a1.b4
    public float y() {
        return o0.i(this.f123a);
    }

    @Override // a1.b4
    public int z() {
        return this.f124b;
    }

    public n0() {
        this(o0.j());
    }
}
