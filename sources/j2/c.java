package j2;

/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i13 >= i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i10 < 0 || i12 < 0) {
                    z12 = false;
                }
                if (z12) {
                    return b.f18972b.b(i10, i11, i12, i13);
                }
                throw new IllegalArgumentException(("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')').toString());
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int c(int i10, int i11) {
        int d10;
        if (i10 != Integer.MAX_VALUE) {
            d10 = vc.l.d(i10 + i11, 0);
            return d10;
        }
        return i10;
    }

    public static final long d(long j10, long j11) {
        int l10;
        int l11;
        l10 = vc.l.l(p.g(j11), b.p(j10), b.n(j10));
        l11 = vc.l.l(p.f(j11), b.o(j10), b.m(j10));
        return q.a(l10, l11);
    }

    public static final long e(long j10, long j11) {
        int l10;
        int l11;
        int l12;
        int l13;
        l10 = vc.l.l(b.p(j11), b.p(j10), b.n(j10));
        l11 = vc.l.l(b.n(j11), b.p(j10), b.n(j10));
        l12 = vc.l.l(b.o(j11), b.o(j10), b.m(j10));
        l13 = vc.l.l(b.m(j11), b.o(j10), b.m(j10));
        return a(l10, l11, l12, l13);
    }

    public static final int f(long j10, int i10) {
        int l10;
        l10 = vc.l.l(i10, b.o(j10), b.m(j10));
        return l10;
    }

    public static final int g(long j10, int i10) {
        int l10;
        l10 = vc.l.l(i10, b.p(j10), b.n(j10));
        return l10;
    }

    public static final long h(long j10, int i10, int i11) {
        int d10;
        int d11;
        d10 = vc.l.d(b.p(j10) + i10, 0);
        int c10 = c(b.n(j10), i10);
        d11 = vc.l.d(b.o(j10) + i11, 0);
        return a(d10, c10, d11, c(b.m(j10), i11));
    }

    public static /* synthetic */ long i(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return h(j10, i10, i11);
    }
}
