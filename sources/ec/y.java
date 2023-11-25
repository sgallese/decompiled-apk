package ec;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollections.kt */
/* loaded from: classes4.dex */
public class y extends x {
    private static final <T> boolean A(List<T> list, pc.l<? super T, Boolean> lVar, boolean z10) {
        int k10;
        int k11;
        if (list instanceof RandomAccess) {
            k10 = t.k(list);
            h0 it = new vc.f(0, k10).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int a10 = it.a();
                T t10 = list.get(a10);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != a10) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
            }
            if (i10 < list.size()) {
                k11 = t.k(list);
                if (i10 > k11) {
                    return true;
                }
                while (true) {
                    list.remove(k11);
                    if (k11 != i10) {
                        k11--;
                    } else {
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            qc.q.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return z(qc.k0.b(list), lVar, z10);
        }
    }

    public static <T> boolean B(Iterable<? extends T> iterable, pc.l<? super T, Boolean> lVar) {
        qc.q.i(iterable, "<this>");
        qc.q.i(lVar, "predicate");
        return z(iterable, lVar, true);
    }

    public static <T> boolean C(List<T> list, pc.l<? super T, Boolean> lVar) {
        qc.q.i(list, "<this>");
        qc.q.i(lVar, "predicate");
        return A(list, lVar, true);
    }

    public static <T> T D(List<T> list) {
        qc.q.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T E(List<T> list) {
        qc.q.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T F(List<T> list) {
        int k10;
        qc.q.i(list, "<this>");
        if (!list.isEmpty()) {
            k10 = t.k(list);
            return list.remove(k10);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T G(List<T> list) {
        int k10;
        qc.q.i(list, "<this>");
        if (!list.isEmpty()) {
            k10 = t.k(list);
            return list.remove(k10);
        }
        return null;
    }

    public static <T> boolean H(Iterable<? extends T> iterable, pc.l<? super T, Boolean> lVar) {
        qc.q.i(iterable, "<this>");
        qc.q.i(lVar, "predicate");
        return z(iterable, lVar, false);
    }

    public static final <T> boolean I(Collection<? super T> collection, Iterable<? extends T> iterable) {
        qc.q.i(collection, "<this>");
        qc.q.i(iterable, "elements");
        return collection.retainAll(y(iterable));
    }

    public static <T> boolean w(Collection<? super T> collection, Iterable<? extends T> iterable) {
        qc.q.i(collection, "<this>");
        qc.q.i(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add((T) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean x(Collection<? super T> collection, T[] tArr) {
        List c10;
        qc.q.i(collection, "<this>");
        qc.q.i(tArr, "elements");
        c10 = o.c(tArr);
        return collection.addAll(c10);
    }

    public static final <T> Collection<T> y(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = b0.C0(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean z(Iterable<? extends T> iterable, pc.l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke((T) it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }
}
