package z0;

/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class g {
    public static final long a(float f10, float f11) {
        return f.g((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final boolean b(long j10) {
        boolean z10;
        boolean z11;
        float o10 = f.o(j10);
        if (!Float.isInfinite(o10) && !Float.isNaN(o10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float p10 = f.p(j10);
            if (!Float.isInfinite(p10) && !Float.isNaN(p10)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(long j10) {
        if (j10 != f.f26354b.b()) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j10) {
        if (j10 == f.f26354b.b()) {
            return true;
        }
        return false;
    }

    public static final long e(long j10, long j11, float f10) {
        return a(k2.a.a(f.o(j10), f.o(j11), f10), k2.a.a(f.p(j10), f.p(j11), f10));
    }
}
