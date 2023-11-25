package n0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: f  reason: collision with root package name */
    private final f<K, V> f19882f;

    public h(f<K, V> fVar) {
        qc.q.i(fVar, "builder");
        this.f19882f = fVar;
    }

    @Override // ec.h
    public int a() {
        return this.f19882f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f19882f.clear();
    }

    @Override // n0.a
    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        qc.q.i(entry, "element");
        V v10 = this.f19882f.get(entry.getKey());
        if (v10 != null) {
            return qc.q.d(v10, entry.getValue());
        }
        if (entry.getValue() == null && this.f19882f.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }

    @Override // n0.a
    public boolean i(Map.Entry<? extends K, ? extends V> entry) {
        qc.q.i(entry, "element");
        return this.f19882f.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f19882f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        qc.q.i(entry, "element");
        throw new UnsupportedOperationException();
    }
}
