package v1;

/* compiled from: TextRange.kt */
/* loaded from: classes.dex */
public final class j0 {
    public static final long a(int i10) {
        return b(i10, i10);
    }

    public static final long b(int i10, int i11) {
        return i0.c(d(i10, i11));
    }

    public static final long c(long j10, int i10, int i11) {
        int l10;
        int l11;
        l10 = vc.l.l(i0.n(j10), i10, i11);
        l11 = vc.l.l(i0.i(j10), i10, i11);
        if (l10 == i0.n(j10) && l11 == i0.i(j10)) {
            return j10;
        }
        return b(l10, l11);
    }

    private static final long d(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 < 0) {
                z11 = false;
            }
            if (z11) {
                return (i11 & 4294967295L) | (i10 << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i10 + ", end: " + i11 + ']').toString());
    }
}
