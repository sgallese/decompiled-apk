package ec;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapsJVM.kt */
/* loaded from: classes4.dex */
public class m0 extends l0 {
    public static <K, V> Map<K, V> b(Map<K, V> map) {
        qc.q.i(map, "builder");
        return ((fc.d) map).j();
    }

    public static <K, V> Map<K, V> c() {
        return new fc.d();
    }

    public static int d(int i10) {
        if (i10 >= 0) {
            if (i10 < 3) {
                return i10 + 1;
            }
            if (i10 < 1073741824) {
                return (int) ((i10 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i10;
    }

    public static <K, V> Map<K, V> e(dc.l<? extends K, ? extends V> lVar) {
        qc.q.i(lVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        qc.q.h(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> f(dc.l<? extends K, ? extends V>... lVarArr) {
        qc.q.i(lVarArr, "pairs");
        TreeMap treeMap = new TreeMap();
        n0.o(treeMap, lVarArr);
        return treeMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        qc.q.i(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        qc.q.h(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
