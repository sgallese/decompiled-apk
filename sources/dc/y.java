package dc;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UnsignedUtils.kt */
/* loaded from: classes4.dex */
public final class y {
    public static final int a(long j10, long j11) {
        return qc.q.l(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double b(long j10) {
        return ((j10 >>> 11) * ((double) RecyclerView.m.FLAG_MOVED)) + (j10 & 2047);
    }

    public static final String c(long j10) {
        return d(j10, 10);
    }

    public static final String d(long j10, int i10) {
        int a10;
        int a11;
        int a12;
        if (j10 >= 0) {
            a12 = yc.b.a(i10);
            String l10 = Long.toString(j10, a12);
            qc.q.h(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        a10 = yc.b.a(i10);
        String l11 = Long.toString(j12, a10);
        qc.q.h(l11, "toString(this, checkRadix(radix))");
        sb2.append(l11);
        a11 = yc.b.a(i10);
        String l12 = Long.toString(j13, a11);
        qc.q.h(l12, "toString(this, checkRadix(radix))");
        sb2.append(l12);
        return sb2.toString();
    }
}
