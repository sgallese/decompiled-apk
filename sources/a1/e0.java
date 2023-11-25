package a1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: AndroidCanvas.android.kt */
/* loaded from: classes.dex */
public final class e0 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f93a = f0.b();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f94b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private final Rect f95c = new Rect();

    @Override // a1.h1
    public void a(float f10, float f11, float f12, float f13, int i10) {
        this.f93a.clipRect(f10, f11, f12, f13, x(i10));
    }

    @Override // a1.h1
    public void b(float f10, float f11) {
        this.f93a.translate(f10, f11);
    }

    @Override // a1.h1
    public void c(e4 e4Var, int i10) {
        qc.q.i(e4Var, "path");
        Canvas canvas = this.f93a;
        if (e4Var instanceof p0) {
            canvas.clipPath(((p0) e4Var).u(), x(i10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a1.h1
    public void d(float f10, float f11) {
        this.f93a.scale(f10, f11);
    }

    @Override // a1.h1
    public void e(float f10) {
        this.f93a.rotate(f10);
    }

    @Override // a1.h1
    public void f(float f10, float f11, float f12, float f13, b4 b4Var) {
        qc.q.i(b4Var, "paint");
        this.f93a.drawRect(f10, f11, f12, f13, b4Var.l());
    }

    @Override // a1.h1
    public void g(float f10, float f11, float f12, float f13, float f14, float f15, b4 b4Var) {
        qc.q.i(b4Var, "paint");
        this.f93a.drawRoundRect(f10, f11, f12, f13, f14, f15, b4Var.l());
    }

    @Override // a1.h1
    public /* synthetic */ void h(z0.h hVar, b4 b4Var) {
        g1.b(this, hVar, b4Var);
    }

    @Override // a1.h1
    public /* synthetic */ void i(z0.h hVar, int i10) {
        g1.a(this, hVar, i10);
    }

    @Override // a1.h1
    public void j(e4 e4Var, b4 b4Var) {
        qc.q.i(e4Var, "path");
        qc.q.i(b4Var, "paint");
        Canvas canvas = this.f93a;
        if (e4Var instanceof p0) {
            canvas.drawPath(((p0) e4Var).u(), b4Var.l());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a1.h1
    public void k() {
        this.f93a.save();
    }

    @Override // a1.h1
    public void l(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, b4 b4Var) {
        qc.q.i(b4Var, "paint");
        this.f93a.drawArc(f10, f11, f12, f13, f14, f15, z10, b4Var.l());
    }

    @Override // a1.h1
    public void m() {
        k1.f114a.a(this.f93a, false);
    }

    @Override // a1.h1
    public void n(long j10, long j11, b4 b4Var) {
        qc.q.i(b4Var, "paint");
        this.f93a.drawLine(z0.f.o(j10), z0.f.p(j10), z0.f.o(j11), z0.f.p(j11), b4Var.l());
    }

    @Override // a1.h1
    public void o(float[] fArr) {
        qc.q.i(fArr, "matrix");
        if (!y3.a(fArr)) {
            Matrix matrix = new Matrix();
            m0.a(matrix, fArr);
            this.f93a.concat(matrix);
        }
    }

    @Override // a1.h1
    public void p() {
        this.f93a.restore();
    }

    @Override // a1.h1
    public void q(z0.h hVar, b4 b4Var) {
        qc.q.i(hVar, "bounds");
        qc.q.i(b4Var, "paint");
        this.f93a.saveLayer(hVar.i(), hVar.l(), hVar.j(), hVar.e(), b4Var.l(), 31);
    }

    @Override // a1.h1
    public void r(t3 t3Var, long j10, b4 b4Var) {
        qc.q.i(t3Var, "image");
        qc.q.i(b4Var, "paint");
        this.f93a.drawBitmap(l0.b(t3Var), z0.f.o(j10), z0.f.p(j10), b4Var.l());
    }

    @Override // a1.h1
    public void s(long j10, float f10, b4 b4Var) {
        qc.q.i(b4Var, "paint");
        this.f93a.drawCircle(z0.f.o(j10), z0.f.p(j10), f10, b4Var.l());
    }

    @Override // a1.h1
    public void t(t3 t3Var, long j10, long j11, long j12, long j13, b4 b4Var) {
        qc.q.i(t3Var, "image");
        qc.q.i(b4Var, "paint");
        Canvas canvas = this.f93a;
        Bitmap b10 = l0.b(t3Var);
        Rect rect = this.f94b;
        rect.left = j2.l.j(j10);
        rect.top = j2.l.k(j10);
        rect.right = j2.l.j(j10) + j2.p.g(j11);
        rect.bottom = j2.l.k(j10) + j2.p.f(j11);
        dc.w wVar = dc.w.f13270a;
        Rect rect2 = this.f95c;
        rect2.left = j2.l.j(j12);
        rect2.top = j2.l.k(j12);
        rect2.right = j2.l.j(j12) + j2.p.g(j13);
        rect2.bottom = j2.l.k(j12) + j2.p.f(j13);
        canvas.drawBitmap(b10, rect, rect2, b4Var.l());
    }

    @Override // a1.h1
    public void u() {
        k1.f114a.a(this.f93a, true);
    }

    public final Canvas v() {
        return this.f93a;
    }

    public final void w(Canvas canvas) {
        qc.q.i(canvas, "<set-?>");
        this.f93a = canvas;
    }

    public final Region.Op x(int i10) {
        if (o1.d(i10, o1.f133a.a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }
}
