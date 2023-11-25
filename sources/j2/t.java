package j2;

/* compiled from: TextUnit.kt */
/* loaded from: classes.dex */
public final class t {
    public static final long a(float f10, long j10) {
        return j(j10, f10);
    }

    public static final void b(long j10, long j11) {
        boolean z10;
        if (!h(j10) && !h(j11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (u.g(s.g(j10), s.g(j11))) {
                return;
            }
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) u.i(s.g(j10))) + " and " + ((Object) u.i(s.g(j11)))).toString());
        }
        throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
    }

    public static final long c(float f10) {
        return j(8589934592L, f10);
    }

    public static final long d(int i10) {
        return j(8589934592L, i10);
    }

    public static final long e(double d10) {
        return j(4294967296L, (float) d10);
    }

    public static final long f(float f10) {
        return j(4294967296L, f10);
    }

    public static final long g(int i10) {
        return j(4294967296L, i10);
    }

    public static final boolean h(long j10) {
        if (s.f(j10) == 0) {
            return true;
        }
        return false;
    }

    public static final long i(long j10, long j11, float f10) {
        b(j10, j11);
        return j(s.f(j10), k2.a.a(s.h(j10), s.h(j11), f10));
    }

    public static final long j(long j10, float f10) {
        return s.c(j10 | (Float.floatToIntBits(f10) & 4294967295L));
    }
}
