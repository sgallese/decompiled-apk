package d0;

import c0.e0;
import g2.u;

/* compiled from: LayoutUtils.kt */
/* loaded from: classes.dex */
public final class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return j2.c.b(0, c(j10, z10, i10, f10), 0, j2.b.m(j10), 5, null);
    }

    public static final int b(boolean z10, int i10, int i11) {
        boolean z11;
        int d10;
        if (!z10 && u.e(i10, u.f16099a.b())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return 1;
        }
        d10 = vc.l.d(i11, 1);
        return d10;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        boolean z11;
        int i11;
        int l10;
        if (!z10 && !u.e(i10, u.f16099a.b())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && j2.b.j(j10)) {
            i11 = j2.b.n(j10);
        } else {
            i11 = Integer.MAX_VALUE;
        }
        if (j2.b.p(j10) != i11) {
            l10 = vc.l.l(e0.a(f10), j2.b.p(j10), i11);
            return l10;
        }
        return i11;
    }
}
