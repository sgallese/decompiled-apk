package ga;

/* compiled from: $Gson$Preconditions.java */
/* loaded from: classes3.dex */
public final class a {
    public static void a(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T b(T t10) {
        t10.getClass();
        return t10;
    }
}
