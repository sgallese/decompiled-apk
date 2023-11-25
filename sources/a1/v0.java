package a1;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;

/* compiled from: AndroidShader.android.kt */
/* loaded from: classes.dex */
public final class v0 {
    public static final Shader a(t3 t3Var, int i10, int i11) {
        qc.q.i(t3Var, "image");
        return new BitmapShader(l0.b(t3Var), w0.a(i10), w0.a(i11));
    }

    public static final Shader b(long j10, long j11, List<p1> list, List<Float> list2, int i10) {
        qc.q.i(list, "colors");
        g(list, list2);
        int d10 = d(list);
        return new LinearGradient(z0.f.o(j10), z0.f.p(j10), z0.f.o(j11), z0.f.p(j11), e(list, d10), f(list2, list, d10), w0.a(i10));
    }

    public static final Shader c(long j10, List<p1> list, List<Float> list2) {
        qc.q.i(list, "colors");
        g(list, list2);
        int d10 = d(list);
        return new SweepGradient(z0.f.o(j10), z0.f.p(j10), e(list, d10), f(list2, list, d10));
    }

    public static final int d(List<p1> list) {
        int k10;
        boolean z10;
        qc.q.i(list, "colors");
        if (Build.VERSION.SDK_INT < 26) {
            k10 = ec.t.k(list);
            int i10 = 0;
            for (int i11 = 1; i11 < k10; i11++) {
                if (p1.r(list.get(i11).y()) == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10++;
                }
            }
            return i10;
        }
        return 0;
    }

    public static final int[] e(List<p1> list, int i10) {
        int k10;
        boolean z10;
        int i11;
        qc.q.i(list, "colors");
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = r1.k(list.get(i12).y());
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i10];
        k10 = ec.t.k(list);
        int size2 = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            long y10 = list.get(i14).y();
            if (p1.r(y10) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i14 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = r1.k(p1.o(list.get(1).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i14 == k10) {
                    i11 = i13 + 1;
                    iArr2[i13] = r1.k(p1.o(list.get(i14 - 1).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i15 = i13 + 1;
                    iArr2[i13] = r1.k(p1.o(list.get(i14 - 1).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 = i15 + 1;
                    iArr2[i15] = r1.k(p1.o(list.get(i14 + 1).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = r1.k(y10);
                i13++;
            }
        }
        return iArr2;
    }

    public static final float[] f(List<Float> list, List<p1> list2, int i10) {
        float f10;
        int k10;
        float f11;
        int k11;
        int k12;
        float f12;
        boolean z10;
        float[] A0;
        qc.q.i(list2, "colors");
        if (i10 == 0) {
            if (list != null) {
                A0 = ec.b0.A0(list);
                return A0;
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i10];
        if (list != null) {
            f10 = list.get(0).floatValue();
        } else {
            f10 = 0.0f;
        }
        fArr[0] = f10;
        k10 = ec.t.k(list2);
        int i11 = 1;
        for (int i12 = 1; i12 < k10; i12++) {
            long y10 = list2.get(i12).y();
            if (list == null) {
                k12 = ec.t.k(list2);
                f12 = i12 / k12;
            } else {
                f12 = list.get(i12).floatValue();
            }
            int i13 = i11 + 1;
            fArr[i11] = f12;
            if (p1.r(y10) == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = i13 + 1;
                fArr[i13] = f12;
            } else {
                i11 = i13;
            }
        }
        if (list != null) {
            k11 = ec.t.k(list2);
            f11 = list.get(k11).floatValue();
        } else {
            f11 = 1.0f;
        }
        fArr[i11] = f11;
        return fArr;
    }

    private static final void g(List<p1> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
