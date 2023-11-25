package androidx.core.util;

import j$.util.Objects;

/* compiled from: ObjectsCompat.java */
/* loaded from: classes.dex */
public class c {

    /* compiled from: ObjectsCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    public static <T> T c(T t10) {
        t10.getClass();
        return t10;
    }

    public static <T> T d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static String e(Object obj, String str) {
        if (obj != null) {
            return obj.toString();
        }
        return str;
    }
}
