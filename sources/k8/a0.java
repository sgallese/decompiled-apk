package k8;

/* compiled from: Preconditions.java */
/* loaded from: classes3.dex */
public final class a0 {
    public static void a(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T c(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static void d(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(str);
    }
}
