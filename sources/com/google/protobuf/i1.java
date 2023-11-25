package com.google.protobuf;

import com.google.protobuf.t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* loaded from: classes3.dex */
public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private final int f12329f;

    /* renamed from: m  reason: collision with root package name */
    private List<i1<K, V>.e> f12330m;

    /* renamed from: p  reason: collision with root package name */
    private Map<K, V> f12331p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12332q;

    /* renamed from: r  reason: collision with root package name */
    private volatile i1<K, V>.g f12333r;

    /* renamed from: s  reason: collision with root package name */
    private Map<K, V> f12334s;

    /* renamed from: t  reason: collision with root package name */
    private volatile i1<K, V>.c f12335t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    public static class a<FieldDescriptorType> extends i1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.i1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((t.b) obj, obj2);
        }

        @Override // com.google.protobuf.i1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> k10 = k(i10);
                    if (((t.b) k10.getKey()).a()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((t.b) entry.getKey()).a()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    public class c extends i1<K, V>.g {
        private c() {
            super(i1.this, null);
        }

        @Override // com.google.protobuf.i1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i1.this, null);
        }

        /* synthetic */ c(i1 i1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f12340a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f12341b = new b();

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes3.dex */
        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        /* loaded from: classes3.dex */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f12340a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f12341b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    public class e implements Map.Entry<K, V>, Comparable<i1<K, V>.e> {

        /* renamed from: f  reason: collision with root package name */
        private final K f12342f;

        /* renamed from: m  reason: collision with root package name */
        private V f12343m;

        e(i1 i1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean d(Object obj, Object obj2) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public int compareTo(i1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (d(this.f12342f, entry.getKey()) && d(this.f12343m, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f12342f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12343m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k10 = this.f12342f;
            int i10 = 0;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f12343m;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            i1.this.h();
            V v11 = this.f12343m;
            this.f12343m = v10;
            return v11;
        }

        public String toString() {
            return this.f12342f + "=" + this.f12343m;
        }

        e(K k10, V v10) {
            this.f12342f = k10;
            this.f12343m = v10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                i1.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(i1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                i1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i1.this.size();
        }

        /* synthetic */ g(i1 i1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ i1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f12330m.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f12330m.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f12330m.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!this.f12332q) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private void j() {
        h();
        if (this.f12330m.isEmpty() && !(this.f12330m instanceof ArrayList)) {
            this.f12330m = new ArrayList(this.f12329f);
        }
    }

    private SortedMap<K, V> o() {
        h();
        if (this.f12331p.isEmpty() && !(this.f12331p instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12331p = treeMap;
            this.f12334s = treeMap.descendingMap();
        }
        return (SortedMap) this.f12331p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends t.b<FieldDescriptorType>> i1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i10) {
        h();
        V value = this.f12330m.remove(i10).getValue();
        if (!this.f12331p.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f12330m.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f12330m.isEmpty()) {
            this.f12330m.clear();
        }
        if (!this.f12331p.isEmpty()) {
            this.f12331p.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (f(comparable) < 0 && !this.f12331p.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12333r == null) {
            this.f12333r = new g(this, null);
        }
        return this.f12333r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != i1Var.l()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!k(i10).equals(i1Var.k(i10))) {
                return false;
            }
        }
        if (l10 == size) {
            return true;
        }
        return this.f12331p.equals(i1Var.f12331p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return this.f12330m.get(f10).getValue();
        }
        return this.f12331p.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f12330m.get(i11).hashCode();
        }
        if (m() > 0) {
            return i10 + this.f12331p.hashCode();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> i() {
        if (this.f12335t == null) {
            this.f12335t = new c(this, null);
        }
        return this.f12335t;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f12330m.get(i10);
    }

    public int l() {
        return this.f12330m.size();
    }

    public int m() {
        return this.f12331p.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        if (this.f12331p.isEmpty()) {
            return d.b();
        }
        return this.f12331p.entrySet();
    }

    public boolean p() {
        return this.f12332q;
    }

    public void q() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.f12332q) {
            if (this.f12331p.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f12331p);
            }
            this.f12331p = unmodifiableMap;
            if (this.f12334s.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f12334s);
            }
            this.f12334s = unmodifiableMap2;
            this.f12332q = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) t(f10);
        }
        if (this.f12331p.isEmpty()) {
            return null;
        }
        return this.f12331p.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        h();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f12330m.get(f10).setValue(v10);
        }
        j();
        int i10 = -(f10 + 1);
        if (i10 >= this.f12329f) {
            return o().put(k10, v10);
        }
        int size = this.f12330m.size();
        int i11 = this.f12329f;
        if (size == i11) {
            i1<K, V>.e remove = this.f12330m.remove(i11 - 1);
            o().put((K) remove.getKey(), remove.getValue());
        }
        this.f12330m.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12330m.size() + this.f12331p.size();
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        private int f12336f;

        /* renamed from: m  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f12337m;

        private b() {
            this.f12336f = i1.this.f12330m.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f12337m == null) {
                this.f12337m = i1.this.f12334s.entrySet().iterator();
            }
            return this.f12337m;
        }

        @Override // java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = i1.this.f12330m;
                int i10 = this.f12336f - 1;
                this.f12336f = i10;
                return (Map.Entry) list.get(i10);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f12336f;
            if ((i10 > 0 && i10 <= i1.this.f12330m.size()) || a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i1 i1Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: f  reason: collision with root package name */
        private int f12345f;

        /* renamed from: m  reason: collision with root package name */
        private boolean f12346m;

        /* renamed from: p  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f12347p;

        private f() {
            this.f12345f = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f12347p == null) {
                this.f12347p = i1.this.f12331p.entrySet().iterator();
            }
            return this.f12347p;
        }

        @Override // java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f12346m = true;
            int i10 = this.f12345f + 1;
            this.f12345f = i10;
            if (i10 < i1.this.f12330m.size()) {
                return (Map.Entry) i1.this.f12330m.get(this.f12345f);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12345f + 1 < i1.this.f12330m.size()) {
                return true;
            }
            if (!i1.this.f12331p.isEmpty() && a().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f12346m) {
                this.f12346m = false;
                i1.this.h();
                if (this.f12345f < i1.this.f12330m.size()) {
                    i1 i1Var = i1.this;
                    int i10 = this.f12345f;
                    this.f12345f = i10 - 1;
                    i1Var.t(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(i1 i1Var, a aVar) {
            this();
        }
    }

    private i1(int i10) {
        this.f12329f = i10;
        this.f12330m = Collections.emptyList();
        this.f12331p = Collections.emptyMap();
        this.f12334s = Collections.emptyMap();
    }
}
