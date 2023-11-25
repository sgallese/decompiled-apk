package n1;

/* compiled from: ScaleFactor.kt */
/* loaded from: classes.dex */
public final class e1 {
    public static final long a(float f10, float f11) {
        return d1.a((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(long j10, long j11) {
        return z0.m.a(z0.l.i(j10) * d1.b(j11), z0.l.g(j10) * d1.c(j11));
    }
}
