package androidx.collection;

import j$.util.Map;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V>, j$.util.Map {

    /* renamed from: u  reason: collision with root package name */
    a<K, V>.C0017a f1775u;

    /* renamed from: v  reason: collision with root package name */
    a<K, V>.c f1776v;

    /* renamed from: w  reason: collision with root package name */
    a<K, V>.e f1777w;

    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    final class C0017a extends AbstractSet<Map.Entry<K, V>> {
        C0017a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.f1814p;
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    final class b extends androidx.collection.d<K> {
        b() {
            super(a.this.f1814p);
        }

        @Override // androidx.collection.d
        protected K a(int i10) {
            return a.this.j(i10);
        }

        @Override // androidx.collection.d
        protected void c(int i10) {
            a.this.l(i10);
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        int f1781f;

        /* renamed from: m  reason: collision with root package name */
        int f1782m = -1;

        /* renamed from: p  reason: collision with root package name */
        boolean f1783p;

        d() {
            this.f1781f = a.this.f1814p - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f1782m++;
                this.f1783p = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f1783p) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!androidx.collection.c.c(entry.getKey(), a.this.j(this.f1782m)) || !androidx.collection.c.c(entry.getValue(), a.this.n(this.f1782m))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1783p) {
                return a.this.j(this.f1782m);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1783p) {
                return a.this.n(this.f1782m);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1782m < this.f1781f) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.f1783p) {
                K j10 = a.this.j(this.f1782m);
                V n10 = a.this.n(this.f1782m);
                int i10 = 0;
                if (j10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = j10.hashCode();
                }
                if (n10 != null) {
                    i10 = n10.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f1783p) {
                a.this.l(this.f1782m);
                this.f1782m--;
                this.f1781f--;
                this.f1783p = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f1783p) {
                return a.this.m(this.f1782m, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    final class f extends androidx.collection.d<V> {
        f() {
            super(a.this.f1814p);
        }

        @Override // androidx.collection.d
        protected V a(int i10) {
            return a.this.n(i10);
        }

        @Override // androidx.collection.d
        protected void c(int i10) {
            a.this.l(i10);
        }
    }

    public a() {
    }

    static <T> boolean p(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
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
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0017a c0017a = this.f1775u;
        if (c0017a == null) {
            a<K, V>.C0017a c0017a2 = new C0017a();
            this.f1775u = c0017a2;
            return c0017a2;
        }
        return c0017a;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        a<K, V>.c cVar = this.f1776v;
        if (cVar == null) {
            a<K, V>.c cVar2 = new c();
            this.f1776v = cVar2;
            return cVar2;
        }
        return cVar;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public boolean o(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        c(this.f1814p + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection<?> collection) {
        int i10 = this.f1814p;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (i10 != this.f1814p) {
            return true;
        }
        return false;
    }

    public boolean r(Collection<?> collection) {
        int i10 = this.f1814p;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(j(i11))) {
                l(i11);
            }
        }
        if (i10 != this.f1814p) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T[] s(T[] tArr, int i10) {
        int i11 = this.f1814p;
        if (tArr.length < i11) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            tArr[i12] = this.f1813m[(i12 << 1) + i10];
        }
        if (tArr.length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        a<K, V>.e eVar = this.f1777w;
        if (eVar == null) {
            a<K, V>.e eVar2 = new e();
            this.f1777w = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public a(int i10) {
        super(i10);
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.p(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i10 = 0;
            for (int i11 = a.this.f1814p - 1; i11 >= 0; i11--) {
                K j10 = a.this.j(i11);
                if (j10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = j10.hashCode();
                }
                i10 += hashCode;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int f10 = a.this.f(obj);
            if (f10 >= 0) {
                a.this.l(f10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return a.this.q(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return a.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.f1814p;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int i10 = a.this.f1814p;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.j(i11);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.s(tArr, 0);
        }
    }

    /* compiled from: ArrayMap.java */
    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (a.this.i(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int i10 = a.this.i(obj);
            if (i10 >= 0) {
                a.this.l(i10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int i10 = a.this.f1814p;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (collection.contains(a.this.n(i11))) {
                    a.this.l(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int i10 = a.this.f1814p;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (!collection.contains(a.this.n(i11))) {
                    a.this.l(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.f1814p;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int i10 = a.this.f1814p;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = a.this.n(i11);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) a.this.s(tArr, 1);
        }
    }

    public a(g gVar) {
        super(gVar);
    }
}
