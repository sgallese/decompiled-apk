package b2;

/* compiled from: EditingBuffer.kt */
/* loaded from: classes.dex */
public final class j {
    public static final long a(long j10, long j11) {
        int j12;
        int l10 = v1.i0.l(j10);
        int k10 = v1.i0.k(j10);
        if (v1.i0.p(j11, j10)) {
            if (v1.i0.d(j11, j10)) {
                l10 = v1.i0.l(j11);
                k10 = l10;
            } else {
                if (v1.i0.d(j10, j11)) {
                    j12 = v1.i0.j(j11);
                } else if (v1.i0.e(j11, l10)) {
                    l10 = v1.i0.l(j11);
                    j12 = v1.i0.j(j11);
                } else {
                    k10 = v1.i0.l(j11);
                }
                k10 -= j12;
            }
        } else if (k10 > v1.i0.l(j11)) {
            l10 -= v1.i0.j(j11);
            j12 = v1.i0.j(j11);
            k10 -= j12;
        }
        return v1.j0.b(l10, k10);
    }
}
