package ld;

import okio.x0;
import qc.q;

/* compiled from: -SegmentedByteString.kt */
/* loaded from: classes4.dex */
public final class j {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        q.i(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else if (i15 > i10) {
                i13 = i14 - 1;
            } else {
                return i14;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(x0 x0Var, int i10) {
        q.i(x0Var, "<this>");
        int a10 = a(x0Var.K(), i10 + 1, 0, x0Var.L().length);
        if (a10 < 0) {
            return ~a10;
        }
        return a10;
    }
}
