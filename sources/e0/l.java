package e0;

import v1.j0;

/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes.dex */
public final class l {
    public static final long a(String str, int i10, int i11, boolean z10, boolean z11) {
        qc.q.i(str, "text");
        if (i11 == 0) {
            return j0.b(i10, i10);
        }
        if (i10 == 0) {
            if (z10) {
                return j0.b(c0.b0.a(str, 0), 0);
            }
            return j0.b(0, c0.b0.a(str, 0));
        } else if (i10 == i11) {
            if (z10) {
                return j0.b(c0.b0.b(str, i11), i11);
            }
            return j0.b(i11, c0.b0.b(str, i11));
        } else if (z10) {
            if (!z11) {
                return j0.b(c0.b0.b(str, i10), i10);
            }
            return j0.b(c0.b0.a(str, i10), i10);
        } else if (!z11) {
            return j0.b(i10, c0.b0.a(str, i10));
        } else {
            return j0.b(i10, c0.b0.b(str, i10));
        }
    }
}
