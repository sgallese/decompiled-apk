package ec;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapWithDefault.kt */
/* loaded from: classes4.dex */
public class l0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        qc.q.i(map, "<this>");
        if (map instanceof j0) {
            return (V) ((j0) map).g(k10);
        }
        V v10 = map.get(k10);
        if (v10 == null && !map.containsKey(k10)) {
            throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
        }
        return v10;
    }
}
