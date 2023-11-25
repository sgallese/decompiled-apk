package ec;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: classes4.dex */
public class n0 extends m0 {
    public static <K, V> Map<K, V> h() {
        e0 e0Var = e0.f14174f;
        qc.q.g(e0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return e0Var;
    }

    public static <K, V> V i(Map<K, ? extends V> map, K k10) {
        qc.q.i(map, "<this>");
        return (V) l0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> j(dc.l<? extends K, ? extends V>... lVarArr) {
        int d10;
        qc.q.i(lVarArr, "pairs");
        d10 = m0.d(lVarArr.length);
        HashMap<K, V> hashMap = new HashMap<>(d10);
        o(hashMap, lVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> k(dc.l<? extends K, ? extends V>... lVarArr) {
        Map<K, V> h10;
        int d10;
        qc.q.i(lVarArr, "pairs");
        if (lVarArr.length > 0) {
            d10 = m0.d(lVarArr.length);
            return s(lVarArr, new LinkedHashMap(d10));
        }
        h10 = h();
        return h10;
    }

    public static <K, V> Map<K, V> l(dc.l<? extends K, ? extends V>... lVarArr) {
        int d10;
        qc.q.i(lVarArr, "pairs");
        d10 = m0.d(lVarArr.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        o(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> m(Map<K, ? extends V> map) {
        Map<K, V> h10;
        qc.q.i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h10 = h();
            return h10;
        } else if (size == 1) {
            return m0.g(map);
        } else {
            return map;
        }
    }

    public static final <K, V> void n(Map<? super K, ? super V> map, Iterable<? extends dc.l<? extends K, ? extends V>> iterable) {
        qc.q.i(map, "<this>");
        qc.q.i(iterable, "pairs");
        for (dc.l<? extends K, ? extends V> lVar : iterable) {
            map.put((K) lVar.a(), (V) lVar.b());
        }
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, dc.l<? extends K, ? extends V>[] lVarArr) {
        qc.q.i(map, "<this>");
        qc.q.i(lVarArr, "pairs");
        for (dc.l<? extends K, ? extends V> lVar : lVarArr) {
            map.put((K) lVar.a(), (V) lVar.b());
        }
    }

    public static <K, V> Map<K, V> p(Iterable<? extends dc.l<? extends K, ? extends V>> iterable) {
        Map<K, V> h10;
        dc.l<? extends K, ? extends V> next;
        Map<K, V> e10;
        int d10;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                h10 = h();
                return h10;
            } else if (size != 1) {
                d10 = m0.d(collection.size());
                return q(iterable, new LinkedHashMap(d10));
            } else {
                if (iterable instanceof List) {
                    next = (dc.l<? extends K, ? extends V>) ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                e10 = m0.e(next);
                return e10;
            }
        }
        return m(q(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(Iterable<? extends dc.l<? extends K, ? extends V>> iterable, M m10) {
        qc.q.i(iterable, "<this>");
        qc.q.i(m10, "destination");
        n(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map) {
        Map<K, V> h10;
        Map<K, V> t10;
        qc.q.i(map, "<this>");
        int size = map.size();
        if (size == 0) {
            h10 = h();
            return h10;
        } else if (size != 1) {
            t10 = t(map);
            return t10;
        } else {
            return m0.g(map);
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(dc.l<? extends K, ? extends V>[] lVarArr, M m10) {
        qc.q.i(lVarArr, "<this>");
        qc.q.i(m10, "destination");
        o(m10, lVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        qc.q.i(map, "<this>");
        return new LinkedHashMap(map);
    }
}
