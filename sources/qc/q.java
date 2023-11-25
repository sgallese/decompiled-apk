package qc;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* compiled from: Intrinsics.java */
/* loaded from: classes4.dex */
public class q {

    /* compiled from: Intrinsics.java */
    /* loaded from: classes4.dex */
    public static class a {
        private a() {
        }
    }

    private q() {
    }

    public static boolean a(float f10, Float f11) {
        if (f11 != null && f10 == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean b(Double d10, double d11) {
        if (d10 != null && d10.doubleValue() == d11) {
            return true;
        }
        return false;
    }

    public static boolean c(Float f10, float f11) {
        if (f10 != null && f10.floatValue() == f11) {
            return true;
        }
        return false;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) o(new IllegalStateException(str + " must not be null")));
    }

    public static void f(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) o(new NullPointerException(str + " must not be null")));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            v(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static int k(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        if (i10 == i11) {
            return 0;
        }
        return 1;
    }

    public static int l(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        if (j10 == j11) {
            return 0;
        }
        return 1;
    }

    private static String m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = q.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void n(int i10, String str) {
        w();
    }

    private static <T extends Throwable> T o(T t10) {
        return (T) p(t10, q.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T p(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static void r() {
        throw ((NullPointerException) o(new NullPointerException()));
    }

    public static void s(String str) {
        throw ((NullPointerException) o(new NullPointerException(str)));
    }

    public static void t() {
        throw ((KotlinNullPointerException) o(new KotlinNullPointerException()));
    }

    private static void u(String str) {
        throw ((IllegalArgumentException) o(new IllegalArgumentException(m(str))));
    }

    private static void v(String str) {
        throw ((NullPointerException) o(new NullPointerException(m(str))));
    }

    public static void w() {
        x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void x(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void y(String str) {
        throw ((UninitializedPropertyAccessException) o(new UninitializedPropertyAccessException(str)));
    }

    public static void z(String str) {
        y("lateinit property " + str + " has not been initialized");
    }
}
