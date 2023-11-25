package n0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class n<K, V> extends ec.i<Map.Entry<? extends K, ? extends V>> implements l0.e<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: m  reason: collision with root package name */
    private final d<K, V> f19886m;

    public n(d<K, V> dVar) {
        qc.q.i(dVar, "map");
        this.f19886m = dVar;
    }

    @Override // ec.a
    public int a() {
        return this.f19886m.size();
    }

    @Override // ec.a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return e((Map.Entry) obj);
    }

    public boolean e(Map.Entry<? extends K, ? extends V> entry) {
        qc.q.i(entry, "element");
        V v10 = this.f19886m.get(entry.getKey());
        if (v10 != null) {
            return qc.q.d(v10, entry.getValue());
        }
        if (entry.getValue() == null && this.f19886m.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f19886m.o());
    }
}
