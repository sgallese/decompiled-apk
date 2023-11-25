package ec;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
/* loaded from: classes4.dex */
public class v0 extends u0 {
    public static <T> Set<T> e(Set<? extends T> set, Iterable<? extends T> iterable) {
        Set<T> H0;
        qc.q.i(set, "<this>");
        qc.q.i(iterable, "elements");
        Collection<?> y10 = y.y(iterable);
        if (y10.isEmpty()) {
            H0 = b0.H0(set);
            return H0;
        } else if (y10 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t10 : set) {
                if (!y10.contains(t10)) {
                    linkedHashSet.add(t10);
                }
            }
            return linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
            linkedHashSet2.removeAll(y10);
            return linkedHashSet2;
        }
    }

    public static <T> Set<T> f(Set<? extends T> set, T t10) {
        int d10;
        qc.q.i(set, "<this>");
        d10 = m0.d(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(d10);
        boolean z10 = false;
        for (T t11 : set) {
            boolean z11 = true;
            if (!z10 && qc.q.d(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> g(Set<? extends T> set, T t10) {
        int d10;
        qc.q.i(set, "<this>");
        d10 = m0.d(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(d10);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t10);
        return linkedHashSet;
    }
}
