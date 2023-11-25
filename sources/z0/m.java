package z0;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class m {
    public static final long a(float f10, float f11) {
        return l.d((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(long j10) {
        return g.a(l.i(j10) / 2.0f, l.g(j10) / 2.0f);
    }

    public static final h c(long j10) {
        return i.b(f.f26354b.c(), j10);
    }
}
