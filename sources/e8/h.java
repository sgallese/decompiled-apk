package e8;

/* compiled from: Preconditions.java */
/* loaded from: classes3.dex */
public final class h {
    private static String a(int i10, int i11, String str) {
        if (i10 < 0) {
            return i.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return i.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String b(int i10, int i11, String str) {
        if (i10 < 0) {
            return i.a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return i.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String c(int i10, int i11, int i12) {
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                return i.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            return b(i11, i12, "end index");
        }
        return b(i10, i12, "start index");
    }

    public static void d(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static int e(int i10, int i11) {
        return f(i10, i11, "index");
    }

    public static int f(int i10, int i11, String str) {
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(a(i10, i11, str));
    }

    public static <T> T g(T t10) {
        t10.getClass();
        return t10;
    }

    public static int h(int i10, int i11) {
        return i(i10, i11, "index");
    }

    public static int i(int i10, int i11, String str) {
        if (i10 >= 0 && i10 <= i11) {
            return i10;
        }
        throw new IndexOutOfBoundsException(b(i10, i11, str));
    }

    public static void j(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        throw new IndexOutOfBoundsException(c(i10, i11, i12));
    }

    public static void k(boolean z10, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    public static void l(boolean z10, String str, Object obj) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(i.a(str, obj));
    }
}
