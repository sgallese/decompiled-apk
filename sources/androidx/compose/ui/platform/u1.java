package androidx.compose.ui.platform;

/* compiled from: NestedScrollInteropConnection.kt */
/* loaded from: classes.dex */
public final class u1 {
    private static final float a(float f10) {
        double floor;
        if (f10 >= 0.0f) {
            floor = Math.ceil(f10);
        } else {
            floor = Math.floor(f10);
        }
        return (float) floor;
    }

    public static final int b(float f10) {
        return ((int) a(f10)) * (-1);
    }
}
