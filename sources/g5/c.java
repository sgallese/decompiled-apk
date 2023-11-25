package g5;

import ec.b0;
import ec.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Collections.kt */
/* loaded from: classes.dex */
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        List<T> i10;
        Object a02;
        int size = list.size();
        if (size == 0) {
            i10 = ec.t.i();
            return i10;
        } else if (size == 1) {
            a02 = b0.a0(list);
            return Collections.singletonList(a02);
        } else {
            return Collections.unmodifiableList(new ArrayList(list));
        }
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        Map<K, V> h10;
        Object Z;
        int size = map.size();
        if (size == 0) {
            h10 = n0.h();
            return h10;
        } else if (size == 1) {
            Z = b0.Z(map.entrySet());
            Map.Entry entry = (Map.Entry) Z;
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        } else {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
    }
}
