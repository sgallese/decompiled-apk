package md;

/* compiled from: Assertions.java */
/* loaded from: classes4.dex */
public final class a {
    public static <T> T a(String str, T t10, boolean z10) {
        if (z10) {
            return t10;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static void b(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("state should be: " + str);
    }

    public static <T> T c(String str, T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(str + " can not be null");
    }
}
