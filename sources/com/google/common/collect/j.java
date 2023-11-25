package com.google.common.collect;

import com.google.common.collect.h;
import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: ImmutableMap.java */
/* loaded from: classes3.dex */
public abstract class j<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: q  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f11149q = new Map.Entry[0];

    /* renamed from: f  reason: collision with root package name */
    private transient k<Map.Entry<K, V>> f11150f;

    /* renamed from: m  reason: collision with root package name */
    private transient k<K> f11151m;

    /* renamed from: p  reason: collision with root package name */
    private transient h<V> f11152p;

    /* compiled from: ImmutableMap.java */
    /* loaded from: classes3.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f11153a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f11154b;

        /* renamed from: c  reason: collision with root package name */
        int f11155c = 0;

        /* renamed from: d  reason: collision with root package name */
        boolean f11156d = false;

        /* renamed from: e  reason: collision with root package name */
        C0242a f11157e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ImmutableMap.java */
        /* renamed from: com.google.common.collect.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0242a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f11158a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f11159b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f11160c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C0242a(Object obj, Object obj2, Object obj3) {
                this.f11158a = obj;
                this.f11159b = obj2;
                this.f11160c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f11158a);
                String valueOf2 = String.valueOf(this.f11159b);
                String valueOf3 = String.valueOf(this.f11158a);
                String valueOf4 = String.valueOf(this.f11160c);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        a(int i10) {
            this.f11154b = new Object[i10 * 2];
        }

        private j<K, V> b(boolean z10) {
            Object[] objArr;
            C0242a c0242a;
            C0242a c0242a2;
            if (z10 && (c0242a2 = this.f11157e) != null) {
                throw c0242a2.a();
            }
            int i10 = this.f11155c;
            if (this.f11153a == null) {
                objArr = this.f11154b;
            } else {
                if (this.f11156d) {
                    this.f11154b = Arrays.copyOf(this.f11154b, i10 * 2);
                }
                objArr = this.f11154b;
                if (!z10) {
                    objArr = e(objArr, this.f11155c);
                    if (objArr.length < this.f11154b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                g(objArr, i10, this.f11153a);
            }
            this.f11156d = true;
            v i11 = v.i(i10, objArr, this);
            if (z10 && (c0242a = this.f11157e) != null) {
                throw c0242a.a();
            }
            return i11;
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f11154b;
            if (i11 > objArr.length) {
                this.f11154b = Arrays.copyOf(objArr, h.a.a(objArr.length, i11));
                this.f11156d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void g(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, s.a(comparator).b(q.c()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public j<K, V> a() {
            return c();
        }

        public j<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f11155c + 1);
            d.a(k10, v10);
            Object[] objArr = this.f11154b;
            int i10 = this.f11155c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f11155c = i10 + 1;
            return this;
        }
    }

    public static <K, V> a<K, V> a(int i10) {
        d.b(i10, "expectedSize");
        return new a<>(i10);
    }

    abstract k<Map.Entry<K, V>> b();

    abstract k<K> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract h<V> d();

    @Override // java.util.Map
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public k<Map.Entry<K, V>> entrySet() {
        k<Map.Entry<K, V>> kVar = this.f11150f;
        if (kVar == null) {
            k<Map.Entry<K, V>> b10 = b();
            this.f11150f = b10;
            return b10;
        }
        return kVar;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return q.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f  reason: merged with bridge method [inline-methods] */
    public k<K> keySet() {
        k<K> kVar = this.f11151m;
        if (kVar == null) {
            k<K> c10 = c();
            this.f11151m = c10;
            return c10;
        }
        return kVar;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        if (v11 != null) {
            return v11;
        }
        return v10;
    }

    @Override // java.util.Map
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public h<V> values() {
        h<V> hVar = this.f11152p;
        if (hVar == null) {
            h<V> d10 = d();
            this.f11152p = d10;
            return d10;
        }
        return hVar;
    }

    @Override // java.util.Map
    public int hashCode() {
        return x.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return q.b(this);
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
