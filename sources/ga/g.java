package ga;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes3.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: u  reason: collision with root package name */
    private static final Comparator<Comparable> f16292u = new a();

    /* renamed from: f  reason: collision with root package name */
    Comparator<? super K> f16293f;

    /* renamed from: m  reason: collision with root package name */
    e<K, V> f16294m;

    /* renamed from: p  reason: collision with root package name */
    int f16295p;

    /* renamed from: q  reason: collision with root package name */
    int f16296q;

    /* renamed from: r  reason: collision with root package name */
    final e<K, V> f16297r;

    /* renamed from: s  reason: collision with root package name */
    private g<K, V>.b f16298s;

    /* renamed from: t  reason: collision with root package name */
    private g<K, V>.c f16299t;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    static class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c10;
            if (!(obj instanceof Map.Entry) || (c10 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f16295p;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap.java */
        /* loaded from: classes3.dex */
        class a extends g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f16313s;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (g.this.h(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f16295p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f16304f;

        /* renamed from: m  reason: collision with root package name */
        e<K, V> f16305m = null;

        /* renamed from: p  reason: collision with root package name */
        int f16306p;

        d() {
            this.f16304f = g.this.f16297r.f16311q;
            this.f16306p = g.this.f16296q;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f16304f;
            g gVar = g.this;
            if (eVar != gVar.f16297r) {
                if (gVar.f16296q == this.f16306p) {
                    this.f16304f = eVar.f16311q;
                    this.f16305m = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f16304f != g.this.f16297r) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f16305m;
            if (eVar != null) {
                g.this.f(eVar, true);
                this.f16305m = null;
                this.f16306p = g.this.f16296q;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f16292u);
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    private void e(e<K, V> eVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f16309m;
            e<K, V> eVar3 = eVar.f16310p;
            int i14 = 0;
            if (eVar2 != null) {
                i10 = eVar2.f16315u;
            } else {
                i10 = 0;
            }
            if (eVar3 != null) {
                i11 = eVar3.f16315u;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                e<K, V> eVar4 = eVar3.f16309m;
                e<K, V> eVar5 = eVar3.f16310p;
                if (eVar5 != null) {
                    i13 = eVar5.f16315u;
                } else {
                    i13 = 0;
                }
                if (eVar4 != null) {
                    i14 = eVar4.f16315u;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    k(eVar3);
                    j(eVar);
                } else {
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                e<K, V> eVar6 = eVar2.f16309m;
                e<K, V> eVar7 = eVar2.f16310p;
                if (eVar7 != null) {
                    i12 = eVar7.f16315u;
                } else {
                    i12 = 0;
                }
                if (eVar6 != null) {
                    i14 = eVar6.f16315u;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    j(eVar2);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                eVar.f16315u = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f16315u = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f16308f;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f16308f;
        eVar.f16308f = null;
        if (eVar2 != null) {
            eVar2.f16308f = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f16309m == eVar) {
                eVar3.f16309m = eVar2;
                return;
            } else {
                eVar3.f16310p = eVar2;
                return;
            }
        }
        this.f16294m = eVar2;
    }

    private void j(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f16309m;
        e<K, V> eVar3 = eVar.f16310p;
        e<K, V> eVar4 = eVar3.f16309m;
        e<K, V> eVar5 = eVar3.f16310p;
        eVar.f16310p = eVar4;
        if (eVar4 != null) {
            eVar4.f16308f = eVar;
        }
        i(eVar, eVar3);
        eVar3.f16309m = eVar;
        eVar.f16308f = eVar3;
        int i12 = 0;
        if (eVar2 != null) {
            i10 = eVar2.f16315u;
        } else {
            i10 = 0;
        }
        if (eVar4 != null) {
            i11 = eVar4.f16315u;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f16315u = max;
        if (eVar5 != null) {
            i12 = eVar5.f16315u;
        }
        eVar3.f16315u = Math.max(max, i12) + 1;
    }

    private void k(e<K, V> eVar) {
        int i10;
        int i11;
        e<K, V> eVar2 = eVar.f16309m;
        e<K, V> eVar3 = eVar.f16310p;
        e<K, V> eVar4 = eVar2.f16309m;
        e<K, V> eVar5 = eVar2.f16310p;
        eVar.f16309m = eVar5;
        if (eVar5 != null) {
            eVar5.f16308f = eVar;
        }
        i(eVar, eVar2);
        eVar2.f16310p = eVar;
        eVar.f16308f = eVar2;
        int i12 = 0;
        if (eVar3 != null) {
            i10 = eVar3.f16315u;
        } else {
            i10 = 0;
        }
        if (eVar5 != null) {
            i11 = eVar5.f16315u;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        eVar.f16315u = max;
        if (eVar4 != null) {
            i12 = eVar4.f16315u;
        }
        eVar2.f16315u = Math.max(max, i12) + 1;
    }

    e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparable comparable;
        e<K, V> eVar2;
        Comparator<? super K> comparator = this.f16293f;
        e<K, V> eVar3 = this.f16294m;
        if (eVar3 != null) {
            if (comparator == f16292u) {
                comparable = (Comparable) k10;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar3.f16313s);
                } else {
                    i10 = comparator.compare(k10, (K) eVar3.f16313s);
                }
                if (i10 == 0) {
                    return eVar3;
                }
                if (i10 < 0) {
                    eVar2 = eVar3.f16309m;
                } else {
                    eVar2 = eVar3.f16310p;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f16297r;
        if (eVar3 == null) {
            if (comparator == f16292u && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar3, k10, eVar4, eVar4.f16312r);
            this.f16294m = eVar;
        } else {
            eVar = new e<>(eVar3, k10, eVar4, eVar4.f16312r);
            if (i10 < 0) {
                eVar3.f16309m = eVar;
            } else {
                eVar3.f16310p = eVar;
            }
            e(eVar3, true);
        }
        this.f16295p++;
        this.f16296q++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        boolean z10;
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f16314t, entry.getValue())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return null;
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f16294m = null;
        this.f16295p = 0;
        this.f16296q++;
        e<K, V> eVar = this.f16297r;
        eVar.f16312r = eVar;
        eVar.f16311q = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (d(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f16298s;
        if (bVar == null) {
            g<K, V>.b bVar2 = new b();
            this.f16298s = bVar2;
            return bVar2;
        }
        return bVar;
    }

    void f(e<K, V> eVar, boolean z10) {
        e<K, V> a10;
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f16312r;
            eVar2.f16311q = eVar.f16311q;
            eVar.f16311q.f16312r = eVar2;
        }
        e<K, V> eVar3 = eVar.f16309m;
        e<K, V> eVar4 = eVar.f16310p;
        e<K, V> eVar5 = eVar.f16308f;
        int i11 = 0;
        if (eVar3 != null && eVar4 != null) {
            if (eVar3.f16315u > eVar4.f16315u) {
                a10 = eVar3.b();
            } else {
                a10 = eVar4.a();
            }
            f(a10, false);
            e<K, V> eVar6 = eVar.f16309m;
            if (eVar6 != null) {
                i10 = eVar6.f16315u;
                a10.f16309m = eVar6;
                eVar6.f16308f = a10;
                eVar.f16309m = null;
            } else {
                i10 = 0;
            }
            e<K, V> eVar7 = eVar.f16310p;
            if (eVar7 != null) {
                i11 = eVar7.f16315u;
                a10.f16310p = eVar7;
                eVar7.f16308f = a10;
                eVar.f16310p = null;
            }
            a10.f16315u = Math.max(i10, i11) + 1;
            i(eVar, a10);
            return;
        }
        if (eVar3 != null) {
            i(eVar, eVar3);
            eVar.f16309m = null;
        } else if (eVar4 != null) {
            i(eVar, eVar4);
            eVar.f16310p = null;
        } else {
            i(eVar, null);
        }
        e(eVar5, false);
        this.f16295p--;
        this.f16296q++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            return d10.f16314t;
        }
        return null;
    }

    e<K, V> h(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f16299t;
        if (cVar == null) {
            g<K, V>.c cVar2 = new c();
            this.f16299t = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 != null) {
            e<K, V> b10 = b(k10, true);
            V v11 = b10.f16314t;
            b10.f16314t = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> h10 = h(obj);
        if (h10 != null) {
            return h10.f16314t;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16295p;
    }

    public g(Comparator<? super K> comparator) {
        this.f16295p = 0;
        this.f16296q = 0;
        this.f16297r = new e<>();
        this.f16293f = comparator == null ? f16292u : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes3.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f16308f;

        /* renamed from: m  reason: collision with root package name */
        e<K, V> f16309m;

        /* renamed from: p  reason: collision with root package name */
        e<K, V> f16310p;

        /* renamed from: q  reason: collision with root package name */
        e<K, V> f16311q;

        /* renamed from: r  reason: collision with root package name */
        e<K, V> f16312r;

        /* renamed from: s  reason: collision with root package name */
        final K f16313s;

        /* renamed from: t  reason: collision with root package name */
        V f16314t;

        /* renamed from: u  reason: collision with root package name */
        int f16315u;

        e() {
            this.f16313s = null;
            this.f16312r = this;
            this.f16311q = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16309m; eVar2 != null; eVar2 = eVar2.f16309m) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16310p; eVar2 != null; eVar2 = eVar2.f16310p) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f16313s;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f16314t;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16313s;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16314t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k10 = this.f16313s;
            int i10 = 0;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f16314t;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f16314t;
            this.f16314t = v10;
            return v11;
        }

        public String toString() {
            return this.f16313s + "=" + this.f16314t;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f16308f = eVar;
            this.f16313s = k10;
            this.f16315u = 1;
            this.f16311q = eVar2;
            this.f16312r = eVar3;
            eVar3.f16311q = this;
            eVar2.f16312r = this;
        }
    }
}
