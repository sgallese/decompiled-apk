package t0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class b0<K, V> extends z<K, V> implements Iterator<V>, rc.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(t<K, V> tVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(tVar, it);
        qc.q.i(tVar, "map");
        qc.q.i(it, "iterator");
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> h10 = h();
        if (h10 != null) {
            d();
            return h10.getValue();
        }
        throw new IllegalStateException();
    }
}
