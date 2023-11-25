package e8;

import java.util.Arrays;

/* compiled from: Objects.java */
/* loaded from: classes3.dex */
public final class f extends c {
    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
