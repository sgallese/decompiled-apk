package ec;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* loaded from: classes4.dex */
public class u0 extends t0 {
    public static <T> Set<T> b() {
        return f0.f14175f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> c(Set<? extends T> set) {
        Set<T> b10;
        Set<T> a10;
        qc.q.i(set, "<this>");
        int size = set.size();
        if (size == 0) {
            b10 = b();
            return b10;
        } else if (size == 1) {
            a10 = t0.a(set.iterator().next());
            return a10;
        } else {
            return set;
        }
    }

    public static <T> Set<T> d(T... tArr) {
        Set<T> b10;
        qc.q.i(tArr, "elements");
        if (tArr.length <= 0) {
            b10 = b();
            return b10;
        }
        return p.f0(tArr);
    }
}
