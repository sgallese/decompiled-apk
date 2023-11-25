package j2;

/* compiled from: Dp.kt */
/* loaded from: classes.dex */
public final class i {
    public static final long a(float f10, float f11) {
        return j.c((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final long b(float f10, float f11) {
        return k.d((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }
}
