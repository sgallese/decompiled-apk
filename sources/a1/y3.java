package a1;

/* compiled from: Matrix.kt */
/* loaded from: classes.dex */
public final class y3 {
    public static final boolean a(float[] fArr) {
        float f10;
        boolean z10;
        qc.q.i(fArr, "$this$isIdentity");
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (fArr[(i10 * 4) + i11] == f10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }
}
