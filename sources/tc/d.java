package tc;

import qc.q;

/* compiled from: Random.kt */
/* loaded from: classes4.dex */
public final class d {
    public static final String a(Object obj, Object obj2) {
        q.i(obj, "from");
        q.i(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(double d10, double d11) {
        boolean z10;
        if (d11 > d10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(a(Double.valueOf(d10), Double.valueOf(d11)).toString());
    }

    public static final void c(int i10, int i11) {
        boolean z10;
        if (i11 > i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(a(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
    }

    public static final int d(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int e(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
