package androidx.compose.ui.platform;

import android.content.res.Configuration;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class i0 {
    private static final float c(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 0] * fArr2[0 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 3] * fArr2[12 + i11]);
    }

    public static final j2.r d(Configuration configuration) {
        qc.q.i(configuration, "<this>");
        return e(configuration.getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j2.r e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return j2.r.Ltr;
            }
            return j2.r.Rtl;
        }
        return j2.r.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(float[] fArr, float[] fArr2) {
        float c10 = c(fArr2, 0, fArr, 0);
        float c11 = c(fArr2, 0, fArr, 1);
        float c12 = c(fArr2, 0, fArr, 2);
        float c13 = c(fArr2, 0, fArr, 3);
        float c14 = c(fArr2, 1, fArr, 0);
        float c15 = c(fArr2, 1, fArr, 1);
        float c16 = c(fArr2, 1, fArr, 2);
        float c17 = c(fArr2, 1, fArr, 3);
        float c18 = c(fArr2, 2, fArr, 0);
        float c19 = c(fArr2, 2, fArr, 1);
        float c20 = c(fArr2, 2, fArr, 2);
        float c21 = c(fArr2, 2, fArr, 3);
        float c22 = c(fArr2, 3, fArr, 0);
        float c23 = c(fArr2, 3, fArr, 1);
        float c24 = c(fArr2, 3, fArr, 2);
        float c25 = c(fArr2, 3, fArr, 3);
        fArr[0] = c10;
        fArr[1] = c11;
        fArr[2] = c12;
        fArr[3] = c13;
        fArr[4] = c14;
        fArr[5] = c15;
        fArr[6] = c16;
        fArr[7] = c17;
        fArr[8] = c18;
        fArr[9] = c19;
        fArr[10] = c20;
        fArr[11] = c21;
        fArr[12] = c22;
        fArr[13] = c23;
        fArr[14] = c24;
        fArr[15] = c25;
    }
}
