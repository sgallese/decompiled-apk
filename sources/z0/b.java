package z0;

/* compiled from: CornerRadius.kt */
/* loaded from: classes.dex */
public final class b {
    public static final long a(float f10, float f11) {
        return a.b((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static /* synthetic */ long b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        return a(f10, f11);
    }
}
