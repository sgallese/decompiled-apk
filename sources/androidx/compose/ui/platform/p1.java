package androidx.compose.ui.platform;

import java.util.Arrays;

/* compiled from: JvmActuals.jvm.kt */
/* loaded from: classes.dex */
public final class p1 {
    public static final String a(Object obj, String str) {
        qc.q.i(obj, "obj");
        if (str == null) {
            if (obj.getClass().isAnonymousClass()) {
                str = obj.getClass().getName();
            } else {
                str = obj.getClass().getSimpleName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        qc.j0 j0Var = qc.j0.f21683a;
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        qc.q.h(format, "format(format, *args)");
        sb2.append(format);
        return sb2.toString();
    }
}
