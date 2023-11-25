package n0;

import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final K f19861f;

    /* renamed from: m  reason: collision with root package name */
    private final V f19862m;

    public b(K k10, V v10) {
        this.f19861f = k10;
        this.f19862m = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !qc.q.d(entry.getKey(), getKey()) || !qc.q.d(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f19861f;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f19862m;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i10;
        K key = getKey();
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        V value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
