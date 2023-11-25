package a1;

import a1.i4;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: AndroidPath.android.kt */
/* loaded from: classes.dex */
public final class p0 implements e4 {

    /* renamed from: b  reason: collision with root package name */
    private final Path f142b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f143c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f144d;

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f145e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.Path, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p0() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.p0.<init>():void");
    }

    private final boolean t(z0.h hVar) {
        if ((!Float.isNaN(hVar.i())) != false) {
            if ((!Float.isNaN(hVar.l())) != false) {
                if ((!Float.isNaN(hVar.j())) != false) {
                    if ((!Float.isNaN(hVar.e())) != false) {
                        return true;
                    }
                    throw new IllegalStateException("Rect.bottom is NaN".toString());
                }
                throw new IllegalStateException("Rect.right is NaN".toString());
            }
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        throw new IllegalStateException("Rect.left is NaN".toString());
    }

    @Override // a1.e4
    public boolean a() {
        return this.f142b.isConvex();
    }

    @Override // a1.e4
    public z0.h b() {
        this.f142b.computeBounds(this.f143c, true);
        RectF rectF = this.f143c;
        return new z0.h(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // a1.e4
    public void c(float f10, float f11) {
        this.f142b.rMoveTo(f10, f11);
    }

    @Override // a1.e4
    public void close() {
        this.f142b.close();
    }

    @Override // a1.e4
    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f142b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // a1.e4
    public void e(float f10, float f11, float f12, float f13) {
        this.f142b.quadTo(f10, f11, f12, f13);
    }

    @Override // a1.e4
    public void f(float f10, float f11, float f12, float f13) {
        this.f142b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // a1.e4
    public void g(int i10) {
        Path.FillType fillType;
        Path path = this.f142b;
        if (g4.f(i10, g4.f102b.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    @Override // a1.e4
    public void h(e4 e4Var, long j10) {
        qc.q.i(e4Var, "path");
        Path path = this.f142b;
        if (e4Var instanceof p0) {
            path.addPath(((p0) e4Var).u(), z0.f.o(j10), z0.f.p(j10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a1.e4
    public void i(z0.j jVar) {
        qc.q.i(jVar, "roundRect");
        this.f143c.set(jVar.e(), jVar.g(), jVar.f(), jVar.a());
        this.f144d[0] = z0.a.d(jVar.h());
        this.f144d[1] = z0.a.e(jVar.h());
        this.f144d[2] = z0.a.d(jVar.i());
        this.f144d[3] = z0.a.e(jVar.i());
        this.f144d[4] = z0.a.d(jVar.c());
        this.f144d[5] = z0.a.e(jVar.c());
        this.f144d[6] = z0.a.d(jVar.b());
        this.f144d[7] = z0.a.e(jVar.b());
        this.f142b.addRoundRect(this.f143c, this.f144d, Path.Direction.CCW);
    }

    @Override // a1.e4
    public boolean isEmpty() {
        return this.f142b.isEmpty();
    }

    @Override // a1.e4
    public int j() {
        if (this.f142b.getFillType() == Path.FillType.EVEN_ODD) {
            return g4.f102b.a();
        }
        return g4.f102b.b();
    }

    @Override // a1.e4
    public boolean k(e4 e4Var, e4 e4Var2, int i10) {
        Path.Op op;
        qc.q.i(e4Var, "path1");
        qc.q.i(e4Var2, "path2");
        i4.a aVar = i4.f108a;
        if (i4.f(i10, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (i4.f(i10, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (i4.f(i10, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i4.f(i10, aVar.d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f142b;
        if (e4Var instanceof p0) {
            Path u10 = ((p0) e4Var).u();
            if (e4Var2 instanceof p0) {
                return path.op(u10, ((p0) e4Var2).u(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // a1.e4
    public void l(float f10, float f11) {
        this.f142b.moveTo(f10, f11);
    }

    @Override // a1.e4
    public void m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f142b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // a1.e4
    public void n() {
        this.f142b.rewind();
    }

    @Override // a1.e4
    public void o(z0.h hVar) {
        qc.q.i(hVar, "rect");
        if (t(hVar)) {
            this.f143c.set(hVar.i(), hVar.l(), hVar.j(), hVar.e());
            this.f142b.addRect(this.f143c, Path.Direction.CCW);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // a1.e4
    public void p(long j10) {
        this.f145e.reset();
        this.f145e.setTranslate(z0.f.o(j10), z0.f.p(j10));
        this.f142b.transform(this.f145e);
    }

    @Override // a1.e4
    public void q(float f10, float f11) {
        this.f142b.rLineTo(f10, f11);
    }

    @Override // a1.e4
    public void r(float f10, float f11) {
        this.f142b.lineTo(f10, f11);
    }

    @Override // a1.e4
    public void s() {
        this.f142b.reset();
    }

    public final Path u() {
        return this.f142b;
    }

    public p0(Path path) {
        qc.q.i(path, "internalPath");
        this.f142b = path;
        this.f143c = new RectF();
        this.f144d = new float[8];
        this.f145e = new Matrix();
    }

    public /* synthetic */ p0(Path path, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
