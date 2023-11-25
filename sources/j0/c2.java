package j0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Recomposer.kt */
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f18627a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f18628b = new Object();

    public static final <K, V> boolean a(Map<K, List<V>> map, K k10, V v10) {
        qc.q.i(map, "<this>");
        List<V> list = map.get(k10);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k10, list);
        }
        return list.add(v10);
    }

    public static final <K, V> V b(Map<K, List<V>> map, K k10) {
        Object D;
        qc.q.i(map, "<this>");
        List<V> list = map.get(k10);
        if (list != null) {
            D = ec.y.D(list);
            V v10 = (V) D;
            if (list.isEmpty()) {
                map.remove(k10);
                return v10;
            }
            return v10;
        }
        return null;
    }
}
