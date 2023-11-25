package j2;

/* compiled from: IntOffset.kt */
/* loaded from: classes.dex */
public final class m {
    public static final long a(int i10, int i11) {
        return l.e((i11 & 4294967295L) | (i10 << 32));
    }

    public static final long b(long j10, long j11) {
        return z0.g.a(z0.f.o(j10) - l.j(j11), z0.f.p(j10) - l.k(j11));
    }

    public static final long c(long j10, long j11) {
        return z0.g.a(z0.f.o(j10) + l.j(j11), z0.f.p(j10) + l.k(j11));
    }
}
