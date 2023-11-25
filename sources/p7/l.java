package p7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: ShapeAppearancePathProvider.java */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f21238a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f21239b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f21240c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f21241d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f21242e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f21243f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f21244g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f21245h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f21246i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f21247j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f21248k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f21249l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final l f21250a = new l();
    }

    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapeAppearancePathProvider.java */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f21251a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f21252b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f21253c;

        /* renamed from: d  reason: collision with root package name */
        public final b f21254d;

        /* renamed from: e  reason: collision with root package name */
        public final float f21255e;

        c(k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f21254d = bVar;
            this.f21251a = kVar;
            this.f21255e = f10;
            this.f21253c = rectF;
            this.f21252b = path;
        }
    }

    public l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f21238a[i10] = new m();
            this.f21239b[i10] = new Matrix();
            this.f21240c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f21245h[0] = this.f21238a[i10].k();
        this.f21245h[1] = this.f21238a[i10].l();
        this.f21239b[i10].mapPoints(this.f21245h);
        if (i10 == 0) {
            Path path = cVar.f21252b;
            float[] fArr = this.f21245h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f21252b;
            float[] fArr2 = this.f21245h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f21238a[i10].d(this.f21239b[i10], cVar.f21252b);
        b bVar = cVar.f21254d;
        if (bVar != null) {
            bVar.a(this.f21238a[i10], this.f21239b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f21245h[0] = this.f21238a[i10].i();
        this.f21245h[1] = this.f21238a[i10].j();
        this.f21239b[i10].mapPoints(this.f21245h);
        this.f21246i[0] = this.f21238a[i11].k();
        this.f21246i[1] = this.f21238a[i11].l();
        this.f21239b[i11].mapPoints(this.f21246i);
        float f10 = this.f21245h[0];
        float[] fArr = this.f21246i;
        float max = Math.max(((float) Math.hypot(f10 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i12 = i(cVar.f21253c, i10);
        this.f21244g.n(0.0f, 0.0f);
        f j10 = j(i10, cVar.f21251a);
        j10.b(max, i12, cVar.f21255e, this.f21244g);
        this.f21247j.reset();
        this.f21244g.d(this.f21240c[i10], this.f21247j);
        if (this.f21249l && (j10.a() || l(this.f21247j, i10) || l(this.f21247j, i11))) {
            Path path = this.f21247j;
            path.op(path, this.f21243f, Path.Op.DIFFERENCE);
            this.f21245h[0] = this.f21244g.k();
            this.f21245h[1] = this.f21244g.l();
            this.f21240c[i10].mapPoints(this.f21245h);
            Path path2 = this.f21242e;
            float[] fArr2 = this.f21245h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f21244g.d(this.f21240c[i10], this.f21242e);
        } else {
            this.f21244g.d(this.f21240c[i10], cVar.f21252b);
        }
        b bVar = cVar.f21254d;
        if (bVar != null) {
            bVar.b(this.f21244g, this.f21240c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    private p7.c g(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.t();
                }
                return kVar.r();
            }
            return kVar.j();
        }
        return kVar.l();
    }

    private d h(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.s();
                }
                return kVar.q();
            }
            return kVar.i();
        }
        return kVar.k();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f21245h;
        m mVar = this.f21238a[i10];
        fArr[0] = mVar.f21258c;
        fArr[1] = mVar.f21259d;
        this.f21239b[i10].mapPoints(fArr);
        if (i10 != 1 && i10 != 3) {
            return Math.abs(rectF.centerY() - this.f21245h[1]);
        }
        return Math.abs(rectF.centerX() - this.f21245h[0]);
    }

    private f j(int i10, k kVar) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return kVar.o();
                }
                return kVar.p();
            }
            return kVar.n();
        }
        return kVar.h();
    }

    public static l k() {
        return a.f21250a;
    }

    private boolean l(Path path, int i10) {
        this.f21248k.reset();
        this.f21238a[i10].d(this.f21239b[i10], this.f21248k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f21248k.computeBounds(rectF, true);
        path.op(this.f21248k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f21251a).b(this.f21238a[i10], 90.0f, cVar.f21255e, cVar.f21253c, g(i10, cVar.f21251a));
        float a10 = a(i10);
        this.f21239b[i10].reset();
        f(i10, cVar.f21253c, this.f21241d);
        Matrix matrix = this.f21239b[i10];
        PointF pointF = this.f21241d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f21239b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f21245h[0] = this.f21238a[i10].i();
        this.f21245h[1] = this.f21238a[i10].j();
        this.f21239b[i10].mapPoints(this.f21245h);
        float a10 = a(i10);
        this.f21240c[i10].reset();
        Matrix matrix = this.f21240c[i10];
        float[] fArr = this.f21245h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f21240c[i10].preRotate(a10);
    }

    public void d(k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, null, path);
    }

    public void e(k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f21242e.rewind();
        this.f21243f.rewind();
        this.f21243f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f21242e.close();
        if (!this.f21242e.isEmpty()) {
            path.op(this.f21242e, Path.Op.UNION);
        }
    }
}
