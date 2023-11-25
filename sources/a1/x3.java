package a1;

import java.util.Arrays;

/* compiled from: Matrix.kt */
/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: b */
    public static final a f218b = new a(null);

    /* renamed from: a */
    private final float[] f219a;

    /* compiled from: Matrix.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    private /* synthetic */ x3(float[] fArr) {
        this.f219a = fArr;
    }

    public static final /* synthetic */ x3 a(float[] fArr) {
        return new x3(fArr);
    }

    public static float[] b(float[] fArr) {
        qc.q.i(fArr, "values");
        return fArr;
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, qc.h hVar) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        if (!(obj instanceof x3) || !qc.q.d(fArr, ((x3) obj).n())) {
            return false;
        }
        return true;
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        boolean z10;
        float o10 = z0.f.o(j10);
        float p10 = z0.f.p(j10);
        float f10 = 1 / (((fArr[3] * o10) + (fArr[7] * p10)) + fArr[15]);
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        return z0.g.a(((fArr[0] * o10) + (fArr[4] * p10) + fArr[12]) * f10, f10 * ((fArr[1] * o10) + (fArr[5] * p10) + fArr[13]));
    }

    public static final void g(float[] fArr, z0.d dVar) {
        qc.q.i(dVar, "rect");
        long f10 = f(fArr, z0.g.a(dVar.b(), dVar.d()));
        long f11 = f(fArr, z0.g.a(dVar.b(), dVar.a()));
        long f12 = f(fArr, z0.g.a(dVar.c(), dVar.d()));
        long f13 = f(fArr, z0.g.a(dVar.c(), dVar.a()));
        dVar.i(Math.min(Math.min(z0.f.o(f10), z0.f.o(f11)), Math.min(z0.f.o(f12), z0.f.o(f13))));
        dVar.k(Math.min(Math.min(z0.f.p(f10), z0.f.p(f11)), Math.min(z0.f.p(f12), z0.f.p(f13))));
        dVar.j(Math.max(Math.max(z0.f.o(f10), z0.f.o(f11)), Math.max(z0.f.o(f12), z0.f.o(f13))));
        dVar.h(Math.max(Math.max(z0.f.p(f10), z0.f.p(f11)), Math.max(z0.f.p(f12), z0.f.p(f13))));
    }

    public static final void h(float[] fArr) {
        float f10;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[(i11 * 4) + i10] = f10;
            }
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (f10 * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -sin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (cos * f11) + (sin * f12);
        fArr[1] = (cos * f14) + (sin * f15);
        fArr[2] = (cos * f16) + (sin * f17);
        fArr[3] = (cos * f18) + (sin * f19);
        fArr[4] = (f11 * f13) + (f12 * cos);
        fArr[5] = (f14 * f13) + (f15 * cos);
        fArr[6] = (f16 * f13) + (f17 * cos);
        fArr[7] = (f13 * f18) + (cos * f19);
    }

    public static final void j(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static String k(float[] fArr) {
        String f10;
        f10 = yc.o.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
        return f10;
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        float f16 = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = f16;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f219a, obj);
    }

    public int hashCode() {
        return e(this.f219a);
    }

    public final /* synthetic */ float[] n() {
        return this.f219a;
    }

    public String toString() {
        return k(this.f219a);
    }
}
