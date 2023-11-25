package com.google.common.collect;

import com.google.common.collect.j;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* compiled from: RegularImmutableMap.java */
/* loaded from: classes3.dex */
final class v<K, V> extends j<K, V> {

    /* renamed from: u  reason: collision with root package name */
    static final j<Object, Object> f11222u = new v(null, new Object[0], 0);

    /* renamed from: r  reason: collision with root package name */
    private final transient Object f11223r;

    /* renamed from: s  reason: collision with root package name */
    final transient Object[] f11224s;

    /* renamed from: t  reason: collision with root package name */
    private final transient int f11225t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    public static class a<K, V> extends k<Map.Entry<K, V>> {

        /* renamed from: p  reason: collision with root package name */
        private final transient j<K, V> f11226p;

        /* renamed from: q  reason: collision with root package name */
        private final transient Object[] f11227q;

        /* renamed from: r  reason: collision with root package name */
        private final transient int f11228r;

        /* renamed from: s  reason: collision with root package name */
        private final transient int f11229s;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0245a extends i<Map.Entry<K, V>> {
            C0245a() {
            }

            @Override // java.util.List
            /* renamed from: p  reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                e8.h.e(i10, a.this.f11229s);
                int i11 = i10 * 2;
                Object obj = a.this.f11227q[a.this.f11228r + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f11227q[i11 + (a.this.f11228r ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f11229s;
            }
        }

        a(j<K, V> jVar, Object[] objArr, int i10, int i11) {
            this.f11226p = jVar;
            this.f11227q = objArr;
            this.f11228r = i10;
            this.f11229s = i11;
        }

        @Override // com.google.common.collect.h
        int a(Object[] objArr, int i10) {
            return i().a(objArr, i10);
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f11226p.get(key))) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public a0<Map.Entry<K, V>> iterator() {
            return i().iterator();
        }

        @Override // com.google.common.collect.k
        i<Map.Entry<K, V>> l() {
            return new C0245a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11229s;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    static final class b<K> extends k<K> {

        /* renamed from: p  reason: collision with root package name */
        private final transient j<K, ?> f11231p;

        /* renamed from: q  reason: collision with root package name */
        private final transient i<K> f11232q;

        b(j<K, ?> jVar, i<K> iVar) {
            this.f11231p = jVar;
            this.f11232q = iVar;
        }

        @Override // com.google.common.collect.h
        int a(Object[] objArr, int i10) {
            return i().a(objArr, i10);
        }

        @Override // com.google.common.collect.h, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (this.f11231p.get(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: h */
        public a0<K> iterator() {
            return i().iterator();
        }

        @Override // com.google.common.collect.k
        public i<K> i() {
            return this.f11232q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11231p.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    /* loaded from: classes3.dex */
    static final class c extends i<Object> {

        /* renamed from: p  reason: collision with root package name */
        private final transient Object[] f11233p;

        /* renamed from: q  reason: collision with root package name */
        private final transient int f11234q;

        /* renamed from: r  reason: collision with root package name */
        private final transient int f11235r;

        c(Object[] objArr, int i10, int i11) {
            this.f11233p = objArr;
            this.f11234q = i10;
            this.f11235r = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            e8.h.e(i10, this.f11235r);
            Object obj = this.f11233p[(i10 * 2) + this.f11234q];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11235r;
        }
    }

    private v(Object obj, Object[] objArr, int i10) {
        this.f11223r = obj;
        this.f11224s = objArr;
        this.f11225t = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> v<K, V> i(int i10, Object[] objArr, j.a<K, V> aVar) {
        if (i10 == 0) {
            return (v) f11222u;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return new v<>(null, objArr, 1);
        }
        e8.h.h(i10, objArr.length >> 1);
        Object j10 = j(objArr, i10, k.j(i10), 0);
        if (j10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) j10;
            j.a.C0242a c0242a = (j.a.C0242a) objArr2[2];
            if (aVar != null) {
                aVar.f11157e = c0242a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                j10 = obj3;
                i10 = intValue;
            } else {
                throw c0242a.a();
            }
        }
        return new v<>(j10, objArr, i10);
    }

    private static Object j(Object[] objArr, int i10, int i11, int i12) {
        j.a.C0242a c0242a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            d.a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                d.a(obj3, obj4);
                int a10 = g.a(obj3.hashCode());
                while (true) {
                    int i19 = a10 & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else if (obj3.equals(objArr[i20])) {
                        int i21 = i20 ^ 1;
                        Object obj5 = objArr[i21];
                        Objects.requireNonNull(obj5);
                        c0242a = new j.a.C0242a(obj3, obj4, obj5);
                        objArr[i21] = obj4;
                        break;
                    } else {
                        a10 = i19 + 1;
                    }
                }
            }
            if (i15 != i10) {
                return new Object[]{bArr, Integer.valueOf(i15), c0242a};
            }
            return bArr;
        } else if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                d.a(obj6, obj7);
                int a11 = g.a(obj6.hashCode());
                while (true) {
                    int i26 = a11 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else if (obj6.equals(objArr[i27])) {
                        int i28 = i27 ^ 1;
                        Object obj8 = objArr[i28];
                        Objects.requireNonNull(obj8);
                        c0242a = new j.a.C0242a(obj6, obj7, obj8);
                        objArr[i28] = obj7;
                        break;
                    } else {
                        a11 = i26 + 1;
                    }
                }
            }
            if (i22 != i10) {
                return new Object[]{sArr, Integer.valueOf(i22), c0242a};
            }
            return sArr;
        } else {
            int[] iArr = new int[i11];
            Arrays.fill(iArr, -1);
            int i29 = 0;
            int i30 = 0;
            while (i29 < i10) {
                int i31 = (i29 * 2) + i12;
                int i32 = (i30 * 2) + i12;
                Object obj9 = objArr[i31];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i31 ^ 1];
                Objects.requireNonNull(obj10);
                d.a(obj9, obj10);
                int a12 = g.a(obj9.hashCode());
                while (true) {
                    int i33 = a12 & i13;
                    int i34 = iArr[i33];
                    if (i34 == i14) {
                        iArr[i33] = i32;
                        if (i30 < i29) {
                            objArr[i32] = obj9;
                            objArr[i32 ^ 1] = obj10;
                        }
                        i30++;
                    } else if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c0242a = new j.a.C0242a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    } else {
                        a12 = i33 + 1;
                        i14 = -1;
                    }
                }
                i29++;
                i14 = -1;
            }
            if (i30 != i10) {
                return new Object[]{iArr, Integer.valueOf(i30), c0242a};
            }
            return iArr;
        }
    }

    static Object k(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a10 = g.a(obj2.hashCode());
                while (true) {
                    int i12 = a10 & length;
                    int i13 = bArr[i12] & 255;
                    if (i13 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i13])) {
                        return objArr[i13 ^ 1];
                    }
                    a10 = i12 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a11 = g.a(obj2.hashCode());
                while (true) {
                    int i14 = a11 & length2;
                    int i15 = sArr[i14] & 65535;
                    if (i15 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i15])) {
                        return objArr[i15 ^ 1];
                    }
                    a11 = i14 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a12 = g.a(obj2.hashCode());
                while (true) {
                    int i16 = a12 & length3;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i17])) {
                        return objArr[i17 ^ 1];
                    }
                    a12 = i16 + 1;
                }
            }
        }
    }

    @Override // com.google.common.collect.j
    k<Map.Entry<K, V>> b() {
        return new a(this, this.f11224s, 0, this.f11225t);
    }

    @Override // com.google.common.collect.j
    k<K> c() {
        return new b(this, new c(this.f11224s, 0, this.f11225t));
    }

    @Override // com.google.common.collect.j
    h<V> d() {
        return new c(this.f11224s, 1, this.f11225t);
    }

    @Override // com.google.common.collect.j, java.util.Map
    public V get(Object obj) {
        V v10 = (V) k(this.f11223r, this.f11224s, this.f11225t, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.Map
    public int size() {
        return this.f11225t;
    }
}
