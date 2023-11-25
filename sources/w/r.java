package w;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public final class r {
    public static long a(int i10, int i11, int i12, int i13) {
        return b(j2.c.a(i10, i11, i12, i13));
    }

    public static long c(long j10, p pVar) {
        int o10;
        int m10;
        int p10;
        int n10;
        qc.q.i(pVar, "orientation");
        p pVar2 = p.Horizontal;
        if (pVar == pVar2) {
            o10 = j2.b.p(j10);
        } else {
            o10 = j2.b.o(j10);
        }
        if (pVar == pVar2) {
            m10 = j2.b.n(j10);
        } else {
            m10 = j2.b.m(j10);
        }
        if (pVar == pVar2) {
            p10 = j2.b.o(j10);
        } else {
            p10 = j2.b.p(j10);
        }
        if (pVar == pVar2) {
            n10 = j2.b.m(j10);
        } else {
            n10 = j2.b.n(j10);
        }
        return a(o10, m10, p10, n10);
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13);
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = j2.b.p(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = j2.b.n(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = j2.b.o(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = j2.b.m(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static final long f(long j10, p pVar) {
        qc.q.i(pVar, "orientation");
        if (pVar == p.Horizontal) {
            return j2.c.a(j2.b.p(j10), j2.b.n(j10), j2.b.o(j10), j2.b.m(j10));
        }
        return j2.c.a(j2.b.o(j10), j2.b.m(j10), j2.b.p(j10), j2.b.n(j10));
    }

    private static long b(long j10) {
        return j10;
    }
}
