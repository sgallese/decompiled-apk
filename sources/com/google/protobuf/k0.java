package com.google.protobuf;

import com.google.protobuf.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* loaded from: classes3.dex */
public final class k0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: m  reason: collision with root package name */
    private static final k0 f12369m;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12370f;

    static {
        k0 k0Var = new k0();
        f12369m = k0Var;
        k0Var.j();
    }

    private k0() {
        this.f12370f = true;
    }

    static <K, V> int a(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i10;
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return z.d((byte[]) obj);
        }
        if (!(obj instanceof z.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            z.a(obj);
            z.a(map.get(obj));
        }
    }

    public static <K, V> k0<K, V> d() {
        return f12369m;
    }

    private void e() {
        if (i()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static boolean f(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    static <K, V> boolean h(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && h(this, (Map) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean i() {
        return this.f12370f;
    }

    public void j() {
        this.f12370f = false;
    }

    public void k(k0<K, V> k0Var) {
        e();
        if (!k0Var.isEmpty()) {
            putAll(k0Var);
        }
    }

    public k0<K, V> l() {
        if (isEmpty()) {
            return new k0<>();
        }
        return new k0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        e();
        z.a(k10);
        z.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        e();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e();
        return (V) super.remove(obj);
    }

    private k0(Map<K, V> map) {
        super(map);
        this.f12370f = true;
    }
}
