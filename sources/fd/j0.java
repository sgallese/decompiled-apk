package fd;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) h0.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        Long l10;
        String d10 = h0.d(str);
        if (d10 != null) {
            l10 = yc.u.l(d10);
            if (l10 != null) {
                long longValue = l10.longValue();
                boolean z10 = false;
                if (j11 <= longValue && longValue <= j12) {
                    z10 = true;
                }
                if (z10) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d10 + '\'').toString());
        }
        return j10;
    }

    public static final String c(String str, String str2) {
        String d10 = h0.d(str);
        if (d10 != null) {
            return d10;
        }
        return str2;
    }

    public static final boolean d(String str, boolean z10) {
        String d10 = h0.d(str);
        if (d10 != null) {
            return Boolean.parseBoolean(d10);
        }
        return z10;
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return h0.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return h0.c(str, j10, j13, j12);
    }
}
