package androidx.compose.ui.platform;

import android.graphics.Matrix;

/* compiled from: LayerMatrixCache.android.kt */
/* loaded from: classes.dex */
public final class q1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final pc.p<T, Matrix, dc.w> f2802a;

    /* renamed from: b  reason: collision with root package name */
    private Matrix f2803b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f2804c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f2805d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f2806e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2807f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2808g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2809h;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(pc.p<? super T, ? super Matrix, dc.w> pVar) {
        qc.q.i(pVar, "getMatrix");
        this.f2802a = pVar;
        this.f2807f = true;
        this.f2808g = true;
        this.f2809h = true;
    }

    public final float[] a(T t10) {
        float[] fArr = this.f2806e;
        if (fArr == null) {
            fArr = a1.x3.c(null, 1, null);
            this.f2806e = fArr;
        }
        if (this.f2808g) {
            this.f2809h = o1.a(b(t10), fArr);
            this.f2808g = false;
        }
        if (!this.f2809h) {
            return null;
        }
        return fArr;
    }

    public final float[] b(T t10) {
        float[] fArr = this.f2805d;
        if (fArr == null) {
            fArr = a1.x3.c(null, 1, null);
            this.f2805d = fArr;
        }
        if (!this.f2807f) {
            return fArr;
        }
        Matrix matrix = this.f2803b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f2803b = matrix;
        }
        this.f2802a.invoke(t10, matrix);
        Matrix matrix2 = this.f2804c;
        if (matrix2 == null || !qc.q.d(matrix, matrix2)) {
            a1.m0.b(fArr, matrix);
            this.f2803b = matrix2;
            this.f2804c = matrix;
        }
        this.f2807f = false;
        return fArr;
    }

    public final void c() {
        this.f2807f = true;
        this.f2808g = true;
    }
}
