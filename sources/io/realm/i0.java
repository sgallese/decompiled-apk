package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OrderedRealmCollectionImpl.java */
/* loaded from: classes4.dex */
public abstract class i0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: f  reason: collision with root package name */
    public final io.realm.a f17618f;

    /* renamed from: m  reason: collision with root package name */
    final Class<E> f17619m;

    /* renamed from: p  reason: collision with root package name */
    final String f17620p;

    /* renamed from: q  reason: collision with root package name */
    final OsResults f17621q;

    /* renamed from: r  reason: collision with root package name */
    final b<E> f17622r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class a extends e<Byte> {
        a(io.realm.a aVar, OsResults osResults, Class<Byte> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Byte c(int i10) {
            return Byte.valueOf(((Long) this.f17624b.m(i10)).byteValue());
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Byte d(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.m(i10);
            if (l10 == null) {
                return null;
            }
            return Byte.valueOf(l10.byteValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        protected final io.realm.a f17623a;

        /* renamed from: b  reason: collision with root package name */
        protected final OsResults f17624b;

        /* renamed from: c  reason: collision with root package name */
        protected final Class<T> f17625c;

        /* renamed from: d  reason: collision with root package name */
        protected final String f17626d;

        b(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            this.f17623a = aVar;
            this.f17624b = osResults;
            this.f17625c = cls;
            this.f17626d = str;
        }

        protected T a(UncheckedRow uncheckedRow, boolean z10, T t10) {
            if (uncheckedRow != null) {
                return (T) this.f17623a.I(this.f17625c, this.f17626d, uncheckedRow);
            }
            if (!z10) {
                return t10;
            }
            throw new IndexOutOfBoundsException("No results were found.");
        }

        public abstract T b(boolean z10, T t10);

        public abstract T c(int i10);

        public abstract T d(int i10, OsResults osResults);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class c extends e<Integer> {
        c(io.realm.a aVar, OsResults osResults, Class<Integer> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Integer c(int i10) {
            return Integer.valueOf(((Long) this.f17624b.m(i10)).intValue());
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Integer d(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.m(i10);
            if (l10 == null) {
                return null;
            }
            return Integer.valueOf(l10.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class d<T> extends b<T> {
        d(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.b
        public T b(boolean z10, T t10) {
            return a(this.f17624b.h(), z10, t10);
        }

        @Override // io.realm.i0.b
        public T c(int i10) {
            return (T) this.f17623a.I(this.f17625c, this.f17626d, this.f17624b.l(i10));
        }

        @Override // io.realm.i0.b
        public T d(int i10, OsResults osResults) {
            return e(osResults.l(i10));
        }

        public T e(UncheckedRow uncheckedRow) {
            return (T) this.f17623a.I(this.f17625c, this.f17626d, uncheckedRow);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class e<T> extends b<T> {
        e(io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.b
        public T b(boolean z10, T t10) {
            if (this.f17624b.s() != 0) {
                return (T) this.f17624b.m(0);
            }
            return t10;
        }

        @Override // io.realm.i0.b
        public T c(int i10) {
            return (T) this.f17624b.m(i10);
        }

        @Override // io.realm.i0.b
        public T d(int i10, OsResults osResults) {
            return (T) osResults.m(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class f extends e<p0> {
        f(io.realm.a aVar, OsResults osResults, Class<p0> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public p0 c(int i10) {
            return new p0(s0.b(this.f17623a, (NativeRealmAny) this.f17624b.m(i10)));
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public p0 d(int i10, OsResults osResults) {
            return new p0(s0.b(this.f17623a, (NativeRealmAny) osResults.m(i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public class g extends OsResults.a<E> {
        g() {
            super(i0.this.f17621q);
        }

        @Override // io.realm.internal.OsResults.a
        protected E e(int i10, OsResults osResults) {
            return i0.this.f17622r.d(i10, osResults);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public class h extends OsResults.b<E> {
        h(int i10) {
            super(i0.this.f17621q, i10);
        }

        @Override // io.realm.internal.OsResults.a
        protected E e(int i10, OsResults osResults) {
            return i0.this.f17622r.d(i10, osResults);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderedRealmCollectionImpl.java */
    /* loaded from: classes4.dex */
    public static class i extends e<Short> {
        i(io.realm.a aVar, OsResults osResults, Class<Short> cls, String str) {
            super(aVar, osResults, cls, str);
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public Short c(int i10) {
            return Short.valueOf(((Long) this.f17624b.m(i10)).shortValue());
        }

        @Override // io.realm.i0.e, io.realm.i0.b
        /* renamed from: f  reason: merged with bridge method [inline-methods] */
        public Short d(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.m(i10);
            if (l10 == null) {
                return null;
            }
            return Short.valueOf(l10.shortValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(io.realm.a aVar, OsResults osResults, Class<E> cls) {
        this(aVar, osResults, cls, null, g(false, aVar, osResults, cls, null));
    }

    private E f(boolean z10, E e10) {
        return this.f17622r.b(z10, e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> b<T> g(boolean z10, io.realm.a aVar, OsResults osResults, Class<T> cls, String str) {
        if (z10) {
            if (cls == Integer.class) {
                return new c(aVar, osResults, Integer.class, str);
            }
            if (cls == Short.class) {
                return new i(aVar, osResults, Short.class, str);
            }
            if (cls == Byte.class) {
                return new a(aVar, osResults, Byte.class, str);
            }
            if (cls == p0.class) {
                return new f(aVar, osResults, p0.class, str);
            }
            return new e(aVar, osResults, cls, str);
        }
        return new d(aVar, osResults, cls, str);
    }

    public j0<E> a() {
        String str = this.f17620p;
        if (str != null) {
            return new j0<>(this.f17618f, this.f17621q, str);
        }
        return new j0<>(this.f17618f, this.f17621q, this.f17619m);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof io.realm.internal.o) && ((io.realm.internal.o) obj).b().g() == io.realm.internal.f.INSTANCE)) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            E next = it.next();
            if ((next instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) next, (byte[]) obj)) {
                    return true;
                }
            } else if (next != null && next.equals(obj)) {
                return true;
            } else {
                if (next == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean e() {
        this.f17618f.e();
        if (size() > 0) {
            this.f17621q.e();
            return true;
        }
        return false;
    }

    public E first() {
        return f(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        this.f17618f.e();
        return this.f17622r.c(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsResults h() {
        return this.f17621q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Table i() {
        return this.f17621q.k();
    }

    public boolean isValid() {
        return this.f17621q.o();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new g();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new h(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (isLoaded()) {
            long s10 = this.f17621q.s();
            if (s10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) s10;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(io.realm.a aVar, OsResults osResults, Class<E> cls, b<E> bVar) {
        this(aVar, osResults, cls, null, bVar);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new h(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(io.realm.a aVar, OsResults osResults, String str) {
        this(aVar, osResults, null, str, g(false, aVar, osResults, null, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(io.realm.a aVar, OsResults osResults, String str, b<E> bVar) {
        this(aVar, osResults, null, str, bVar);
    }

    private i0(io.realm.a aVar, OsResults osResults, Class<E> cls, String str, b<E> bVar) {
        this.f17618f = aVar;
        this.f17621q = osResults;
        this.f17619m = cls;
        this.f17620p = str;
        this.f17622r = bVar;
    }
}
