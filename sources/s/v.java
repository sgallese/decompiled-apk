package s;

/* compiled from: ComplexDouble.kt */
/* loaded from: classes.dex */
public final class v {
    public static final u a(double d10) {
        if (d10 < 0.0d) {
            return new u(0.0d, Math.sqrt(Math.abs(d10)));
        }
        return new u(Math.sqrt(d10), 0.0d);
    }
}
