package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: f  reason: collision with root package name */
    c<K, V> f19688f;

    /* renamed from: m  reason: collision with root package name */
    private c<K, V> f19689m;

    /* renamed from: p  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f19690p = new WeakHashMap<>();

    /* renamed from: q  reason: collision with root package name */
    private int f19691q = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f19695q;
        }

        @Override // m.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f19694p;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0443b<K, V> extends e<K, V> {
        C0443b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f19694p;
        }

        @Override // m.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f19695q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: f  reason: collision with root package name */
        final K f19692f;

        /* renamed from: m  reason: collision with root package name */
        final V f19693m;

        /* renamed from: p  reason: collision with root package name */
        c<K, V> f19694p;

        /* renamed from: q  reason: collision with root package name */
        c<K, V> f19695q;

        c(K k10, V v10) {
            this.f19692f = k10;
            this.f19693m = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f19692f.equals(cVar.f19692f) && this.f19693m.equals(cVar.f19693m)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f19692f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f19693m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f19692f.hashCode() ^ this.f19693m.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f19692f + "=" + this.f19693m;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        private c<K, V> f19696f;

        /* renamed from: m  reason: collision with root package name */
        private boolean f19697m = true;

        d() {
        }

        @Override // m.b.f
        void a(c<K, V> cVar) {
            boolean z10;
            c<K, V> cVar2 = this.f19696f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f19695q;
                this.f19696f = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f19697m = z10;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f19697m) {
                this.f19697m = false;
                this.f19696f = b.this.f19688f;
            } else {
                c<K, V> cVar2 = this.f19696f;
                if (cVar2 != null) {
                    cVar = cVar2.f19694p;
                } else {
                    cVar = null;
                }
                this.f19696f = cVar;
            }
            return this.f19696f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19697m) {
                if (b.this.f19688f != null) {
                    return true;
                }
                return false;
            }
            c<K, V> cVar = this.f19696f;
            if (cVar != null && cVar.f19694p != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        c<K, V> f19699f;

        /* renamed from: m  reason: collision with root package name */
        c<K, V> f19700m;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f19699f = cVar2;
            this.f19700m = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f19700m;
            c<K, V> cVar2 = this.f19699f;
            if (cVar != cVar2 && cVar2 != null) {
                return d(cVar);
            }
            return null;
        }

        @Override // m.b.f
        public void a(c<K, V> cVar) {
            if (this.f19699f == cVar && cVar == this.f19700m) {
                this.f19700m = null;
                this.f19699f = null;
            }
            c<K, V> cVar2 = this.f19699f;
            if (cVar2 == cVar) {
                this.f19699f = c(cVar2);
            }
            if (this.f19700m == cVar) {
                this.f19700m = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f19700m;
            this.f19700m = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19700m != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f19688f;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0443b c0443b = new C0443b(this.f19689m, this.f19688f);
        this.f19690p.put(c0443b, Boolean.FALSE);
        return c0443b;
    }

    protected c<K, V> e(K k10) {
        c<K, V> cVar = this.f19688f;
        while (cVar != null && !cVar.f19692f.equals(k10)) {
            cVar = cVar.f19694p;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f19690p.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> g() {
        return this.f19689m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<K, V> h(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f19691q++;
        c<K, V> cVar2 = this.f19689m;
        if (cVar2 == null) {
            this.f19688f = cVar;
            this.f19689m = cVar;
            return cVar;
        }
        cVar2.f19694p = cVar;
        cVar.f19695q = cVar2;
        this.f19689m = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().hashCode();
        }
        return i10;
    }

    public V i(K k10, V v10) {
        c<K, V> e10 = e(k10);
        if (e10 != null) {
            return e10.f19693m;
        }
        h(k10, v10);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f19688f, this.f19689m);
        this.f19690p.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k10) {
        c<K, V> e10 = e(k10);
        if (e10 == null) {
            return null;
        }
        this.f19691q--;
        if (!this.f19690p.isEmpty()) {
            Iterator<f<K, V>> it = this.f19690p.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(e10);
            }
        }
        c<K, V> cVar = e10.f19695q;
        if (cVar != null) {
            cVar.f19694p = e10.f19694p;
        } else {
            this.f19688f = e10.f19694p;
        }
        c<K, V> cVar2 = e10.f19694p;
        if (cVar2 != null) {
            cVar2.f19695q = cVar;
        } else {
            this.f19689m = cVar;
        }
        e10.f19694p = null;
        e10.f19695q = null;
        return e10.f19693m;
    }

    public int size() {
        return this.f19691q;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
