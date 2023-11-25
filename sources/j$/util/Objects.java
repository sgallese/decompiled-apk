package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Objects {
    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> T requireNonNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T requireNonNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static Object requireNonNullElse(Object obj, Object obj2) {
        return obj != null ? obj : requireNonNull(obj2, "defaultObj");
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
