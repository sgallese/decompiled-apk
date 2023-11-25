package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: r  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f19687r = new HashMap<>();

    public boolean contains(K k10) {
        return this.f19687r.containsKey(k10);
    }

    @Override // m.b
    protected b.c<K, V> e(K k10) {
        return this.f19687r.get(k10);
    }

    @Override // m.b
    public V i(K k10, V v10) {
        b.c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f19693m;
        }
        this.f19687r.put(k10, h(k10, v10));
        return null;
    }

    @Override // m.b
    public V j(K k10) {
        V v10 = (V) super.j(k10);
        this.f19687r.remove(k10);
        return v10;
    }

    public Map.Entry<K, V> k(K k10) {
        if (contains(k10)) {
            return this.f19687r.get(k10).f19695q;
        }
        return null;
    }
}
