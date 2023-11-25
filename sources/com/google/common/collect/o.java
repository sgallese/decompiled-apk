package com.google.common.collect;

import com.google.common.collect.o.h;
import com.google.common.collect.o.m;
import j$.util.concurrent.ConcurrentMap;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MapMakerInternalMap.java */
/* loaded from: classes3.dex */
public class o<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.ConcurrentMap {

    /* renamed from: w  reason: collision with root package name */
    static final z<Object, Object, d> f11170w = new a();

    /* renamed from: f  reason: collision with root package name */
    final transient int f11171f;

    /* renamed from: m  reason: collision with root package name */
    final transient int f11172m;

    /* renamed from: p  reason: collision with root package name */
    final transient m<K, V, E, S>[] f11173p;

    /* renamed from: q  reason: collision with root package name */
    final int f11174q;

    /* renamed from: r  reason: collision with root package name */
    final e8.b<Object> f11175r;

    /* renamed from: s  reason: collision with root package name */
    final transient i<K, V, E, S> f11176s;

    /* renamed from: t  reason: collision with root package name */
    transient Set<K> f11177t;

    /* renamed from: u  reason: collision with root package name */
    transient Collection<V> f11178u;

    /* renamed from: v  reason: collision with root package name */
    transient Set<Map.Entry<K, V>> f11179v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class a0<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final E f11180a;

        a0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f11180a = e10;
        }

        @Override // com.google.common.collect.o.z
        public E a() {
            return this.f11180a;
        }

        @Override // com.google.common.collect.o.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new a0(referenceQueue, get(), e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final K f11181a;

        /* renamed from: b  reason: collision with root package name */
        final int f11182b;

        /* renamed from: c  reason: collision with root package name */
        final E f11183c;

        b(K k10, int i10, E e10) {
            this.f11181a = k10;
            this.f11182b = i10;
            this.f11183c = e10;
        }

        @Override // com.google.common.collect.o.h
        public int b() {
            return this.f11182b;
        }

        @Override // com.google.common.collect.o.h
        public E c() {
            return this.f11183c;
        }

        @Override // com.google.common.collect.o.h
        public K getKey() {
            return this.f11181a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public final class b0 extends com.google.common.collect.b<K, V> {

        /* renamed from: f  reason: collision with root package name */
        final K f11184f;

        /* renamed from: m  reason: collision with root package name */
        V f11185m;

        b0(K k10, V v10) {
            this.f11184f = k10;
            this.f11185m = v10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.f11184f.equals(entry.getKey()) || !this.f11185m.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public K getKey() {
            return this.f11184f;
        }

        @Override // com.google.common.collect.b, java.util.Map.Entry
        public V getValue() {
            return this.f11185m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f11184f.hashCode() ^ this.f11185m.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) o.this.put(this.f11184f, v10);
            this.f11185m = v10;
            return v11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        final int f11187a;

        /* renamed from: b  reason: collision with root package name */
        final E f11188b;

        c(ReferenceQueue<K> referenceQueue, K k10, int i10, E e10) {
            super(k10, referenceQueue);
            this.f11187a = i10;
            this.f11188b = e10;
        }

        @Override // com.google.common.collect.o.h
        public int b() {
            return this.f11187a;
        }

        @Override // com.google.common.collect.o.h
        public E c() {
            return this.f11188b;
        }

        @Override // com.google.common.collect.o.h
        public K getKey() {
            return get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class d implements h<Object, Object, d> {
        private d() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o.h
        public int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o.h
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public d c() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class e extends o<K, V, E, S>.g<Map.Entry<K, V>> {
        e(o oVar) {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g  reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class f extends l<Map.Entry<K, V>> {
        f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = o.this.get(key)) == null || !o.this.n().d(entry.getValue(), obj2)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || !o.this.remove(key, entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public abstract class g<T> implements Iterator<T> {

        /* renamed from: f  reason: collision with root package name */
        int f11190f;

        /* renamed from: m  reason: collision with root package name */
        int f11191m = -1;

        /* renamed from: p  reason: collision with root package name */
        m<K, V, E, S> f11192p;

        /* renamed from: q  reason: collision with root package name */
        AtomicReferenceArray<E> f11193q;

        /* renamed from: r  reason: collision with root package name */
        E f11194r;

        /* renamed from: s  reason: collision with root package name */
        o<K, V, E, S>.b0 f11195s;

        /* renamed from: t  reason: collision with root package name */
        o<K, V, E, S>.b0 f11196t;

        g() {
            this.f11190f = o.this.f11173p.length - 1;
            a();
        }

        final void a() {
            this.f11195s = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f11190f;
                if (i10 >= 0) {
                    m<K, V, E, S>[] mVarArr = o.this.f11173p;
                    this.f11190f = i10 - 1;
                    m<K, V, E, S> mVar = mVarArr[i10];
                    this.f11192p = mVar;
                    if (mVar.f11200m != 0) {
                        this.f11193q = this.f11192p.f11203r;
                        this.f11191m = r0.length() - 1;
                        if (f()) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        boolean c(E e10) {
            try {
                Object key = e10.getKey();
                Object d10 = o.this.d(e10);
                if (d10 != null) {
                    this.f11195s = new b0(key, d10);
                    this.f11192p.r();
                    return true;
                }
                this.f11192p.r();
                return false;
            } catch (Throwable th) {
                this.f11192p.r();
                throw th;
            }
        }

        o<K, V, E, S>.b0 d() {
            o<K, V, E, S>.b0 b0Var = this.f11195s;
            if (b0Var != null) {
                this.f11196t = b0Var;
                a();
                return this.f11196t;
            }
            throw new NoSuchElementException();
        }

        boolean e() {
            E e10 = this.f11194r;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.f11194r = (E) e10.c();
                E e11 = this.f11194r;
                if (e11 != null) {
                    if (c(e11)) {
                        return true;
                    }
                    e10 = this.f11194r;
                } else {
                    return false;
                }
            }
        }

        boolean f() {
            while (true) {
                int i10 = this.f11191m;
                if (i10 >= 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11193q;
                    this.f11191m = i10 - 1;
                    E e10 = atomicReferenceArray.get(i10);
                    this.f11194r = e10;
                    if (e10 != null && (c(e10) || e())) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11195s != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z10;
            if (this.f11196t != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            com.google.common.collect.d.c(z10);
            o.this.remove(this.f11196t.getKey());
            this.f11196t = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public interface h<K, V, E extends h<K, V, E>> {
        int b();

        E c();

        K getKey();

        V getValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> {
        E a(S s10, E e10, E e11);

        n b();

        void c(S s10, E e10, V v10);

        S d(o<K, V, E, S> oVar, int i10, int i11);

        E e(S s10, K k10, int i10, E e10);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class j extends o<K, V, E, S>.g<K> {
        j(o oVar) {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class k extends l<K> {
        k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return o.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j(o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (o.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o.this.size();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    private static abstract class l<E> extends AbstractSet<E> {
        private l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return o.l(this).toArray();
        }

        /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.l(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static abstract class n {
        public static final n STRONG = new a("STRONG", 0);
        public static final n WEAK = new b("WEAK", 1);
        private static final /* synthetic */ n[] $VALUES = $values();

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes3.dex */
        enum a extends n {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o.n
            e8.b<Object> defaultEquivalence() {
                return e8.b.c();
            }
        }

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes3.dex */
        enum b extends n {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.common.collect.o.n
            e8.b<Object> defaultEquivalence() {
                return e8.b.f();
            }
        }

        private static /* synthetic */ n[] $values() {
            return new n[]{STRONG, WEAK};
        }

        private n(String str, int i10) {
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) $VALUES.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract e8.b<Object> defaultEquivalence();

        /* synthetic */ n(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* renamed from: com.google.common.collect.o$o  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0243o<K, V> extends b<K, V, C0243o<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile V f11206d;

        /* compiled from: MapMakerInternalMap.java */
        /* renamed from: com.google.common.collect.o$o$a */
        /* loaded from: classes3.dex */
        static final class a<K, V> implements i<K, V, C0243o<K, V>, p<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f11207a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f11207a;
            }

            @Override // com.google.common.collect.o.i
            public n b() {
                return n.STRONG;
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: f  reason: merged with bridge method [inline-methods] */
            public C0243o<K, V> a(p<K, V> pVar, C0243o<K, V> c0243o, C0243o<K, V> c0243o2) {
                return c0243o.d(c0243o2);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: h  reason: merged with bridge method [inline-methods] */
            public C0243o<K, V> e(p<K, V> pVar, K k10, int i10, C0243o<K, V> c0243o) {
                return new C0243o<>(k10, i10, c0243o);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: i  reason: merged with bridge method [inline-methods] */
            public p<K, V> d(o<K, V, C0243o<K, V>, p<K, V>> oVar, int i10, int i11) {
                return new p<>(oVar, i10, i11);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: j  reason: merged with bridge method [inline-methods] */
            public void c(p<K, V> pVar, C0243o<K, V> c0243o, V v10) {
                c0243o.e(v10);
            }
        }

        C0243o(K k10, int i10, C0243o<K, V> c0243o) {
            super(k10, i10, c0243o);
            this.f11206d = null;
        }

        C0243o<K, V> d(C0243o<K, V> c0243o) {
            C0243o<K, V> c0243o2 = new C0243o<>(this.f11181a, this.f11182b, c0243o);
            c0243o2.f11206d = this.f11206d;
            return c0243o2;
        }

        void e(V v10) {
            this.f11206d = v10;
        }

        @Override // com.google.common.collect.o.h
        public V getValue() {
            return this.f11206d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class q<K, V> extends b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        private volatile z<K, V, q<K, V>> f11208d;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes3.dex */
        static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f11209a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f11209a;
            }

            @Override // com.google.common.collect.o.i
            public n b() {
                return n.WEAK;
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: f  reason: merged with bridge method [inline-methods] */
            public q<K, V> a(r<K, V> rVar, q<K, V> qVar, q<K, V> qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                return qVar.d(((r) rVar).f11210u, qVar2);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: h  reason: merged with bridge method [inline-methods] */
            public q<K, V> e(r<K, V> rVar, K k10, int i10, q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: i  reason: merged with bridge method [inline-methods] */
            public r<K, V> d(o<K, V, q<K, V>, r<K, V>> oVar, int i10, int i11) {
                return new r<>(oVar, i10, i11);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: j  reason: merged with bridge method [inline-methods] */
            public void c(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.e(v10, ((r) rVar).f11210u);
            }
        }

        q(K k10, int i10, q<K, V> qVar) {
            super(k10, i10, qVar);
            this.f11208d = o.m();
        }

        @Override // com.google.common.collect.o.y
        public z<K, V, q<K, V>> a() {
            return this.f11208d;
        }

        q<K, V> d(ReferenceQueue<V> referenceQueue, q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f11181a, this.f11182b, qVar);
            qVar2.f11208d = this.f11208d.b(referenceQueue, qVar2);
            return qVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, q<K, V>> zVar = this.f11208d;
            this.f11208d = new a0(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // com.google.common.collect.o.h
        public V getValue() {
            return this.f11208d.get();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class s extends o<K, V, E, S>.g<V> {
        s(o oVar) {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    final class t extends AbstractCollection<V> {
        t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            o.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return o.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return o.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new s(o.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return o.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return o.l(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) o.l(this).toArray(tArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class u<K, V> extends c<K, V, u<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile V f11212c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes3.dex */
        static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f11213a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f11213a;
            }

            @Override // com.google.common.collect.o.i
            public n b() {
                return n.STRONG;
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: f  reason: merged with bridge method [inline-methods] */
            public u<K, V> a(v<K, V> vVar, u<K, V> uVar, u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.d(((v) vVar).f11214u, uVar2);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: h  reason: merged with bridge method [inline-methods] */
            public u<K, V> e(v<K, V> vVar, K k10, int i10, u<K, V> uVar) {
                return new u<>(((v) vVar).f11214u, k10, i10, uVar);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: i  reason: merged with bridge method [inline-methods] */
            public v<K, V> d(o<K, V, u<K, V>, v<K, V>> oVar, int i10, int i11) {
                return new v<>(oVar, i10, i11);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: j  reason: merged with bridge method [inline-methods] */
            public void c(v<K, V> vVar, u<K, V> uVar, V v10) {
                uVar.e(v10);
            }
        }

        u(ReferenceQueue<K> referenceQueue, K k10, int i10, u<K, V> uVar) {
            super(referenceQueue, k10, i10, uVar);
            this.f11212c = null;
        }

        u<K, V> d(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f11187a, uVar);
            uVar2.e(this.f11212c);
            return uVar2;
        }

        void e(V v10) {
            this.f11212c = v10;
        }

        @Override // com.google.common.collect.o.h
        public V getValue() {
            return this.f11212c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private volatile z<K, V, w<K, V>> f11215c;

        /* compiled from: MapMakerInternalMap.java */
        /* loaded from: classes3.dex */
        static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            private static final a<?, ?> f11216a = new a<>();

            a() {
            }

            static <K, V> a<K, V> g() {
                return (a<K, V>) f11216a;
            }

            @Override // com.google.common.collect.o.i
            public n b() {
                return n.WEAK;
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: f  reason: merged with bridge method [inline-methods] */
            public w<K, V> a(x<K, V> xVar, w<K, V> wVar, w<K, V> wVar2) {
                if (wVar.getKey() == null || m.n(wVar)) {
                    return null;
                }
                return wVar.d(((x) xVar).f11217u, ((x) xVar).f11218v, wVar2);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: h  reason: merged with bridge method [inline-methods] */
            public w<K, V> e(x<K, V> xVar, K k10, int i10, w<K, V> wVar) {
                return new w<>(((x) xVar).f11217u, k10, i10, wVar);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: i  reason: merged with bridge method [inline-methods] */
            public x<K, V> d(o<K, V, w<K, V>, x<K, V>> oVar, int i10, int i11) {
                return new x<>(oVar, i10, i11);
            }

            @Override // com.google.common.collect.o.i
            /* renamed from: j  reason: merged with bridge method [inline-methods] */
            public void c(x<K, V> xVar, w<K, V> wVar, V v10) {
                wVar.e(v10, ((x) xVar).f11218v);
            }
        }

        w(ReferenceQueue<K> referenceQueue, K k10, int i10, w<K, V> wVar) {
            super(referenceQueue, k10, i10, wVar);
            this.f11215c = o.m();
        }

        @Override // com.google.common.collect.o.y
        public z<K, V, w<K, V>> a() {
            return this.f11215c;
        }

        w<K, V> d(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f11187a, wVar);
            wVar2.f11215c = this.f11215c.b(referenceQueue2, wVar2);
            return wVar2;
        }

        void e(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, w<K, V>> zVar = this.f11215c;
            this.f11215c = new a0(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // com.google.common.collect.o.h
        public V getValue() {
            return this.f11215c.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public interface y<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        z<K, V, E> a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public interface z<K, V, E extends h<K, V, E>> {
        E a();

        z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        V get();
    }

    private o(com.google.common.collect.n nVar, i<K, V, E, S> iVar) {
        this.f11174q = Math.min(nVar.a(), 65536);
        this.f11175r = nVar.c();
        this.f11176s = iVar;
        int min = Math.min(nVar.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i12 < this.f11174q) {
            i13++;
            i12 <<= 1;
        }
        this.f11172m = 32 - i13;
        this.f11171f = i12 - 1;
        this.f11173p = f(i12);
        int i14 = min / i12;
        while (i11 < (i12 * i14 < min ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f11173p;
            if (i10 < mVarArr.length) {
                mVarArr[i10] = c(i11, -1);
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> o<K, V, ? extends h<K, V, ?>, ?> b(com.google.common.collect.n nVar) {
        n d10 = nVar.d();
        n nVar2 = n.STRONG;
        if (d10 == nVar2 && nVar.e() == nVar2) {
            return new o<>(nVar, C0243o.a.g());
        }
        if (nVar.d() == nVar2 && nVar.e() == n.WEAK) {
            return new o<>(nVar, q.a.g());
        }
        n d11 = nVar.d();
        n nVar3 = n.WEAK;
        if (d11 == nVar3 && nVar.e() == nVar2) {
            return new o<>(nVar, u.a.g());
        }
        if (nVar.d() == nVar3 && nVar.e() == nVar3) {
            return new o<>(nVar, w.a.g());
        }
        throw new AssertionError();
    }

    static int j(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ArrayList<E> l(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        com.google.common.collect.l.a(arrayList, collection.iterator());
        return arrayList;
    }

    static <K, V, E extends h<K, V, E>> z<K, V, E> m() {
        return (z<K, V, E>) f11170w;
    }

    m<K, V, E, S> c(int i10, int i11) {
        return (S) this.f11176s.d(this, i10, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f11173p) {
            mVar.a();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int e10 = e(obj);
        return k(e10).c(obj, e10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        m<K, V, E, S>[] mVarArr = this.f11173p;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            for (x xVar : mVarArr) {
                int i11 = xVar.f11200m;
                AtomicReferenceArray<E> atomicReferenceArray = xVar.f11203r;
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    for (E e10 = atomicReferenceArray.get(i12); e10 != null; e10 = e10.c()) {
                        Object l10 = xVar.l(e10);
                        if (l10 != null && n().d(obj, l10)) {
                            return true;
                        }
                    }
                }
                j11 += xVar.f11201p;
            }
            if (j11 != j10) {
                i10++;
                j10 = j11;
            } else {
                return false;
            }
        }
        return false;
    }

    V d(E e10) {
        if (e10.getKey() == null) {
            return null;
        }
        return (V) e10.getValue();
    }

    int e(Object obj) {
        return j(this.f11175r.e(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11179v;
        if (set == null) {
            f fVar = new f();
            this.f11179v = fVar;
            return fVar;
        }
        return set;
    }

    final m<K, V, E, S>[] f(int i10) {
        return new m[i10];
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int e10 = e(obj);
        return k(e10).h(obj, e10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return ConcurrentMap.CC.$default$getOrDefault(this, obj, obj2);
    }

    void h(E e10) {
        int b10 = e10.b();
        k(b10).u(e10, b10);
    }

    void i(z<K, V, E> zVar) {
        E a10 = zVar.a();
        int b10 = a10.b();
        k(b10).v((K) a10.getKey(), b10, zVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f11173p;
        long j10 = 0;
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].f11200m != 0) {
                return false;
            }
            j10 += mVarArr[i10].f11201p;
        }
        if (j10 == 0) {
            return true;
        }
        for (int i11 = 0; i11 < mVarArr.length; i11++) {
            if (mVarArr[i11].f11200m != 0) {
                return false;
            }
            j10 -= mVarArr[i11].f11201p;
        }
        if (j10 != 0) {
            return false;
        }
        return true;
    }

    m<K, V, E, S> k(int i10) {
        return this.f11173p[(i10 >>> this.f11172m) & this.f11171f];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f11177t;
        if (set == null) {
            k kVar = new k();
            this.f11177t = kVar;
            return kVar;
        }
        return set;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    e8.b<Object> n() {
        return this.f11176s.b().defaultEquivalence();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        e8.h.g(k10);
        e8.h.g(v10);
        int e10 = e(k10);
        return k(e10).t(k10, e10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        e8.h.g(k10);
        e8.h.g(v10);
        int e10 = e(k10);
        return k(e10).t(k10, e10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int e10 = e(obj);
        return k(e10).w(obj, e10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(K k10, V v10, V v11) {
        e8.h.g(k10);
        e8.h.g(v11);
        if (v10 == null) {
            return false;
        }
        int e10 = e(k10);
        return k(e10).A(k10, e10, v10, v11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (int i10 = 0; i10 < this.f11173p.length; i10++) {
            j10 += r0[i10].f11200m;
        }
        return f8.a.a(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f11178u;
        if (collection == null) {
            t tVar = new t();
            this.f11178u = tVar;
            return tVar;
        }
        return collection;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int e10 = e(obj);
        return k(e10).x(obj, e10, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V replace(K k10, V v10) {
        e8.h.g(k10);
        e8.h.g(v10);
        int e10 = e(k10);
        return k(e10).z(k10, e10, v10);
    }

    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    class a implements z<Object, Object, d> {
        a() {
        }

        @Override // com.google.common.collect.o.z
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public d a() {
            return null;
        }

        @Override // com.google.common.collect.o.z
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.o.z
        public void clear() {
        }

        @Override // com.google.common.collect.o.z
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {

        /* renamed from: f  reason: collision with root package name */
        final o<K, V, E, S> f11199f;

        /* renamed from: m  reason: collision with root package name */
        volatile int f11200m;

        /* renamed from: p  reason: collision with root package name */
        int f11201p;

        /* renamed from: q  reason: collision with root package name */
        int f11202q;

        /* renamed from: r  reason: collision with root package name */
        volatile AtomicReferenceArray<E> f11203r;

        /* renamed from: s  reason: collision with root package name */
        final int f11204s;

        /* renamed from: t  reason: collision with root package name */
        final AtomicInteger f11205t = new AtomicInteger();

        m(o<K, V, E, S> oVar, int i10, int i11) {
            this.f11199f = oVar;
            this.f11204s = i11;
            m(q(i10));
        }

        static <K, V, E extends h<K, V, E>> boolean n(E e10) {
            if (e10.getValue() == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean A(K k10, int i10, V v10, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f11199f.f11175r.d(k10, key)) {
                        Object value = hVar.getValue();
                        if (value == null) {
                            if (n(hVar)) {
                                this.f11201p++;
                                E y10 = y(e10, hVar);
                                int i11 = this.f11200m - 1;
                                atomicReferenceArray.set(length, y10);
                                this.f11200m = i11;
                            }
                            return false;
                        } else if (!this.f11199f.n().d(v10, value)) {
                            return false;
                        } else {
                            this.f11201p++;
                            E(hVar, v11);
                            return true;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        void B() {
            C();
        }

        void C() {
            if (tryLock()) {
                try {
                    p();
                    this.f11205t.set(0);
                } finally {
                    unlock();
                }
            }
        }

        abstract S D();

        void E(E e10, V v10) {
            this.f11199f.f11176s.c(D(), e10, v10);
        }

        void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        void a() {
            if (this.f11200m != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.f11205t.set(0);
                    this.f11201p++;
                    this.f11200m = 0;
                } finally {
                    unlock();
                }
            }
        }

        <T> void b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        boolean c(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f11200m == 0) {
                    return false;
                }
                E k10 = k(obj, i10);
                if (k10 != null) {
                    if (k10.getValue() != null) {
                        z10 = true;
                    }
                }
                return z10;
            } finally {
                r();
            }
        }

        E d(E e10, E e11) {
            return this.f11199f.f11176s.a(D(), e10, e11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f11199f.h((h) poll);
                    i10++;
                } else {
                    return;
                }
            } while (i10 != 16);
        }

        void f(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll != null) {
                    this.f11199f.i((z) poll);
                    i10++;
                } else {
                    return;
                }
            } while (i10 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f11200m;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) q(length << 1);
            this.f11202q = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E e10 = atomicReferenceArray.get(i11);
                if (e10 != null) {
                    h c10 = e10.c();
                    int b10 = e10.b() & length2;
                    if (c10 == null) {
                        atomicReferenceArray2.set(b10, e10);
                    } else {
                        h hVar = e10;
                        while (c10 != null) {
                            int b11 = c10.b() & length2;
                            if (b11 != b10) {
                                hVar = c10;
                                b10 = b11;
                            }
                            c10 = c10.c();
                        }
                        atomicReferenceArray2.set(b10, hVar);
                        while (e10 != hVar) {
                            int b12 = e10.b() & length2;
                            h d10 = d(e10, (h) atomicReferenceArray2.get(b12));
                            if (d10 != null) {
                                atomicReferenceArray2.set(b12, d10);
                            } else {
                                i10--;
                            }
                            e10 = e10.c();
                        }
                    }
                }
            }
            this.f11203r = atomicReferenceArray2;
            this.f11200m = i10;
        }

        V h(Object obj, int i10) {
            try {
                E k10 = k(obj, i10);
                if (k10 == null) {
                    r();
                    return null;
                }
                V v10 = (V) k10.getValue();
                if (v10 == null) {
                    F();
                }
                return v10;
            } finally {
                r();
            }
        }

        E i(Object obj, int i10) {
            if (this.f11200m != 0) {
                for (E j10 = j(i10); j10 != null; j10 = (E) j10.c()) {
                    if (j10.b() == i10) {
                        Object key = j10.getKey();
                        if (key == null) {
                            F();
                        } else if (this.f11199f.f11175r.d(obj, key)) {
                            return j10;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        E j(int i10) {
            return this.f11203r.get(i10 & (r0.length() - 1));
        }

        E k(Object obj, int i10) {
            return i(obj, i10);
        }

        V l(E e10) {
            if (e10.getKey() == null) {
                F();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 == null) {
                F();
                return null;
            }
            return v10;
        }

        void m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f11202q = length;
            if (length == this.f11204s) {
                this.f11202q = length + 1;
            }
            this.f11203r = atomicReferenceArray;
        }

        AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        void r() {
            if ((this.f11205t.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        void s() {
            C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f11200m + 1;
                if (i11 > this.f11202q) {
                    g();
                    i11 = this.f11200m + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f11199f.f11175r.d(k10, key)) {
                        V v11 = (V) hVar.getValue();
                        if (v11 == null) {
                            this.f11201p++;
                            E(hVar, v10);
                            this.f11200m = this.f11200m;
                            return null;
                        } else if (z10) {
                            return v11;
                        } else {
                            this.f11201p++;
                            E(hVar, v10);
                            return v11;
                        }
                    }
                }
                this.f11201p++;
                E e11 = this.f11199f.f11176s.e(D(), k10, i10, e10);
                E(e11, v10);
                atomicReferenceArray.set(length, e11);
                this.f11200m = i11;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean u(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.c()) {
                    if (hVar == e10) {
                        this.f11201p++;
                        E y10 = y(e11, hVar);
                        int i11 = this.f11200m - 1;
                        atomicReferenceArray.set(length, y10);
                        this.f11200m = i11;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        boolean v(K k10, int i10, z<K, V, E> zVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f11199f.f11175r.d(k10, key)) {
                        if (((y) hVar).a() != zVar) {
                            return false;
                        }
                        this.f11201p++;
                        E y10 = y(e10, hVar);
                        int i11 = this.f11200m - 1;
                        atomicReferenceArray.set(length, y10);
                        this.f11200m = i11;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        V w(Object obj, int i10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f11199f.f11175r.d(obj, key)) {
                        V v10 = (V) hVar.getValue();
                        if (v10 == null && !n(hVar)) {
                            return null;
                        }
                        this.f11201p++;
                        E y10 = y(e10, hVar);
                        int i11 = this.f11200m - 1;
                        atomicReferenceArray.set(length, y10);
                        this.f11200m = i11;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        
            if (r8.f11199f.n().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (n(r4) == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            r8.f11201p++;
            r9 = y(r3, r4);
            r10 = r8.f11200m - 1;
            r0.set(r1, r9);
            r8.f11200m = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
        
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.o$h<K, V, E>> r0 = r8.f11203r     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o$h r3 = (com.google.common.collect.o.h) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                com.google.common.collect.o<K, V, E extends com.google.common.collect.o$h<K, V, E>, S extends com.google.common.collect.o$m<K, V, E, S>> r7 = r8.f11199f     // Catch: java.lang.Throwable -> L69
                e8.b<java.lang.Object> r7 = r7.f11175r     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o<K, V, E extends com.google.common.collect.o$h<K, V, E>, S extends com.google.common.collect.o$m<K, V, E, S>> r10 = r8.f11199f     // Catch: java.lang.Throwable -> L69
                e8.b r10 = r10.n()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = 1
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.f11201p     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.f11201p = r9     // Catch: java.lang.Throwable -> L69
                com.google.common.collect.o$h r9 = r8.y(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.f11200m     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.f11200m = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                com.google.common.collect.o$h r4 = r4.c()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.o.m.x(java.lang.Object, int, java.lang.Object):boolean");
        }

        E y(E e10, E e11) {
            int i10 = this.f11200m;
            E e12 = (E) e11.c();
            while (e10 != e11) {
                E d10 = d(e10, e12);
                if (d10 != null) {
                    e12 = d10;
                } else {
                    i10--;
                }
                e10 = (E) e10.c();
            }
            this.f11200m = i10;
            return e12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        V z(K k10, int i10, V v10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.f11203r;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.c()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f11199f.f11175r.d(k10, key)) {
                        V v11 = (V) hVar.getValue();
                        if (v11 == null) {
                            if (n(hVar)) {
                                this.f11201p++;
                                E y10 = y(e10, hVar);
                                int i11 = this.f11200m - 1;
                                atomicReferenceArray.set(length, y10);
                                this.f11200m = i11;
                            }
                            return null;
                        }
                        this.f11201p++;
                        E(hVar, v10);
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        void o() {
        }

        void p() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class p<K, V> extends m<K, V, C0243o<K, V>, p<K, V>> {
        p(o<K, V, C0243o<K, V>, p<K, V>> oVar, int i10, int i11) {
            super(oVar, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o.m
        /* renamed from: G  reason: merged with bridge method [inline-methods] */
        public p<K, V> D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {

        /* renamed from: u  reason: collision with root package name */
        private final ReferenceQueue<V> f11210u;

        r(o<K, V, q<K, V>, r<K, V>> oVar, int i10, int i11) {
            super(oVar, i10, i11);
            this.f11210u = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o.m
        void o() {
            b((ReferenceQueue<V>) this.f11210u);
        }

        @Override // com.google.common.collect.o.m
        void p() {
            f(this.f11210u);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o.m
        /* renamed from: H  reason: merged with bridge method [inline-methods] */
        public r<K, V> D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {

        /* renamed from: u  reason: collision with root package name */
        private final ReferenceQueue<K> f11214u;

        v(o<K, V, u<K, V>, v<K, V>> oVar, int i10, int i11) {
            super(oVar, i10, i11);
            this.f11214u = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o.m
        void o() {
            b((ReferenceQueue<K>) this.f11214u);
        }

        @Override // com.google.common.collect.o.m
        void p() {
            e(this.f11214u);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o.m
        /* renamed from: H  reason: merged with bridge method [inline-methods] */
        public v<K, V> D() {
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapMakerInternalMap.java */
    /* loaded from: classes3.dex */
    public static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {

        /* renamed from: u  reason: collision with root package name */
        private final ReferenceQueue<K> f11217u;

        /* renamed from: v  reason: collision with root package name */
        private final ReferenceQueue<V> f11218v;

        x(o<K, V, w<K, V>, x<K, V>> oVar, int i10, int i11) {
            super(oVar, i10, i11);
            this.f11217u = new ReferenceQueue<>();
            this.f11218v = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o.m
        void o() {
            b((ReferenceQueue<K>) this.f11217u);
        }

        @Override // com.google.common.collect.o.m
        void p() {
            e(this.f11217u);
            f(this.f11218v);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.o.m
        /* renamed from: I  reason: merged with bridge method [inline-methods] */
        public x<K, V> D() {
            return this;
        }
    }
}
