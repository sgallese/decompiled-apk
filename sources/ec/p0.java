package ec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Maps.kt */
/* loaded from: classes4.dex */
public class p0 extends o0 {
    public static <K, V> xc.g<Map.Entry<K, V>> u(Map<? extends K, ? extends V> map) {
        qc.q.i(map, "<this>");
        return r.R(map.entrySet());
    }

    public static <K, V> List<dc.l<K, V>> v(Map<? extends K, ? extends V> map) {
        qc.q.i(map, "<this>");
        if (map.size() == 0) {
            return r.i();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return r.i();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return r.d(new dc.l(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new dc.l(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new dc.l(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
