package l1;

import java.util.List;
import k1.c0;
import k1.h;
import k1.s;
import qc.q;
import z0.f;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class d {
    public static final void c(c cVar, c0 c0Var) {
        q.i(cVar, "<this>");
        q.i(c0Var, "event");
        if (s.b(c0Var)) {
            cVar.e(c0Var.g());
            cVar.d();
        }
        long j10 = c0Var.j();
        List<h> e10 = c0Var.e();
        int size = e10.size();
        int i10 = 0;
        while (i10 < size) {
            h hVar = e10.get(i10);
            long s10 = f.s(hVar.a(), j10);
            long a10 = hVar.a();
            cVar.e(f.t(cVar.c(), s10));
            cVar.a(hVar.b(), cVar.c());
            i10++;
            j10 = a10;
        }
        cVar.e(f.t(cVar.c(), f.s(c0Var.g(), j10)));
        cVar.a(c0Var.n(), cVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float[] fArr, float[] fArr2, int i10, boolean z10) {
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        float f12 = 0.0f;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            if (f13 == f14) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return 0.0f;
            }
            if (z10) {
                f11 = fArr[0];
            } else {
                f11 = fArr[0] - fArr[1];
            }
            return f11 / (f13 - f14);
        }
        int i11 = i10 - 1;
        for (int i12 = i11; i12 > 0; i12--) {
            int i13 = i12 - 1;
            if (fArr2[i12] == fArr2[i13]) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                float signum = Math.signum(f12) * ((float) Math.sqrt(2 * Math.abs(f12)));
                if (z10) {
                    f10 = -fArr[i13];
                } else {
                    f10 = fArr[i12] - fArr[i13];
                }
                float f15 = f10 / (fArr2[i12] - fArr2[i13]);
                f12 += (f15 - signum) * Math.abs(f15);
                if (i12 == i11) {
                    f12 *= 0.5f;
                }
            }
        }
        return Math.signum(f12) * ((float) Math.sqrt(2 * Math.abs(f12)));
    }

    private static final float e(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final float[] f(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        float e10;
        int i12 = i11;
        q.i(fArr, "x");
        q.i(fArr2, "y");
        q.i(fArr3, "coefficients");
        if (i12 >= 1) {
            if (i10 != 0) {
                if (i12 >= i10) {
                    i12 = i10 - 1;
                }
                int i13 = i12 + 1;
                float[][] fArr4 = new float[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    fArr4[i14] = new float[i10];
                }
                for (int i15 = 0; i15 < i10; i15++) {
                    fArr4[0][i15] = 1.0f;
                    for (int i16 = 1; i16 < i13; i16++) {
                        fArr4[i16][i15] = fArr4[i16 - 1][i15] * fArr[i15];
                    }
                }
                float[][] fArr5 = new float[i13];
                for (int i17 = 0; i17 < i13; i17++) {
                    fArr5[i17] = new float[i10];
                }
                float[][] fArr6 = new float[i13];
                for (int i18 = 0; i18 < i13; i18++) {
                    fArr6[i18] = new float[i13];
                }
                for (int i19 = 0; i19 < i13; i19++) {
                    float[] fArr7 = fArr5[i19];
                    float[] fArr8 = fArr4[i19];
                    for (int i20 = 0; i20 < i10; i20++) {
                        fArr7[i20] = fArr8[i20];
                    }
                    for (int i21 = 0; i21 < i19; i21++) {
                        float[] fArr9 = fArr5[i21];
                        float e11 = e(fArr7, fArr9);
                        for (int i22 = 0; i22 < i10; i22++) {
                            fArr7[i22] = fArr7[i22] - (fArr9[i22] * e11);
                        }
                    }
                    float sqrt = (float) Math.sqrt(e(fArr7, fArr7));
                    if (sqrt >= 1.0E-6f) {
                        float f10 = 1.0f / sqrt;
                        for (int i23 = 0; i23 < i10; i23++) {
                            fArr7[i23] = fArr7[i23] * f10;
                        }
                        float[] fArr10 = fArr6[i19];
                        for (int i24 = 0; i24 < i13; i24++) {
                            if (i24 < i19) {
                                e10 = 0.0f;
                            } else {
                                e10 = e(fArr7, fArr4[i24]);
                            }
                            fArr10[i24] = e10;
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                int i25 = i13 - 1;
                for (int i26 = i25; -1 < i26; i26--) {
                    fArr3[i26] = e(fArr5[i26], fArr2);
                    int i27 = i26 + 1;
                    if (i27 <= i25) {
                        int i28 = i25;
                        while (true) {
                            fArr3[i26] = fArr3[i26] - (fArr6[i26][i28] * fArr3[i28]);
                            if (i28 != i27) {
                                i28--;
                            }
                        }
                    }
                    fArr3[i26] = fArr3[i26] / fArr6[i26][i26];
                }
                return fArr3;
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("The degree must be at positive integer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
            return;
        }
        aVar.d(j10);
        aVar.c(f10);
    }
}
