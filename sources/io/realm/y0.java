package io.realm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: RealmMap.java */
/* loaded from: classes4.dex */
public abstract class y0<K, V> implements Map<K, V> {

    /* renamed from: f  reason: collision with root package name */
    protected final b<K, V> f18420f = new c();

    /* compiled from: RealmMap.java */
    /* loaded from: classes4.dex */
    static abstract class b<K, V> implements Map<K, V> {
        b() {
        }

        protected void a(K k10) {
            if (k10 != null) {
                if (k10.getClass() == String.class) {
                    String str = (String) k10;
                    if (str.contains(".") || str.contains("$")) {
                        throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("Null keys are not allowed.");
        }

        abstract V b(K k10, V v10);

        @Override // java.util.Map
        public V put(K k10, V v10) {
            a(k10);
            return b(k10, v10);
        }
    }

    /* compiled from: RealmMap.java */
    /* loaded from: classes4.dex */
    private static class c<K, V> extends b<K, V> {

        /* renamed from: f  reason: collision with root package name */
        private final Map<K, V> f18421f;

        private c() {
            this.f18421f = new HashMap();
        }

        @Override // io.realm.y0.b
        protected V b(K k10, V v10) {
            return this.f18421f.put(k10, v10);
        }

        @Override // java.util.Map
        public void clear() {
            this.f18421f.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f18421f.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f18421f.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f18421f.entrySet();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f18421f.get(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f18421f.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return this.f18421f.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f18421f.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            return this.f18421f.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f18421f.size();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return this.f18421f.values();
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.f18420f.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f18420f.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f18420f.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f18420f.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f18420f.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f18420f.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f18420f.keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return this.f18420f.put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.f18420f.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.f18420f.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f18420f.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f18420f.values();
    }
}
