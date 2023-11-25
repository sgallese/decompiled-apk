package fc;

import ec.k;
import ec.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import qc.h;
import qc.q;

/* compiled from: ListBuilder.kt */
/* loaded from: classes4.dex */
public final class b<E> extends ec.f<E> implements RandomAccess, Serializable {

    /* renamed from: t  reason: collision with root package name */
    private static final a f15586t = new a(null);

    /* renamed from: u  reason: collision with root package name */
    private static final b f15587u;

    /* renamed from: f  reason: collision with root package name */
    private E[] f15588f;

    /* renamed from: m  reason: collision with root package name */
    private int f15589m;

    /* renamed from: p  reason: collision with root package name */
    private int f15590p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15591q;

    /* renamed from: r  reason: collision with root package name */
    private final b<E> f15592r;

    /* renamed from: s  reason: collision with root package name */
    private final b<E> f15593s;

    /* compiled from: ListBuilder.kt */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: ListBuilder.kt */
    /* renamed from: fc.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0374b<E> implements ListIterator<E>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final b<E> f15594f;

        /* renamed from: m  reason: collision with root package name */
        private int f15595m;

        /* renamed from: p  reason: collision with root package name */
        private int f15596p;

        public C0374b(b<E> bVar, int i10) {
            q.i(bVar, "list");
            this.f15594f = bVar;
            this.f15595m = i10;
            this.f15596p = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b<E> bVar = this.f15594f;
            int i10 = this.f15595m;
            this.f15595m = i10 + 1;
            bVar.add(i10, e10);
            this.f15596p = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f15595m < ((b) this.f15594f).f15590p) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f15595m > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f15595m < ((b) this.f15594f).f15590p) {
                int i10 = this.f15595m;
                this.f15595m = i10 + 1;
                this.f15596p = i10;
                return (E) ((b) this.f15594f).f15588f[((b) this.f15594f).f15589m + this.f15596p];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f15595m;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f15595m;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f15595m = i11;
                this.f15596p = i11;
                return (E) ((b) this.f15594f).f15588f[((b) this.f15594f).f15589m + this.f15596p];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f15595m - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z10;
            int i10 = this.f15596p;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f15594f.remove(i10);
                this.f15595m = this.f15596p;
                this.f15596p = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            boolean z10;
            int i10 = this.f15596p;
            if (i10 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f15594f.set(i10, e10);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.f15591q = true;
        f15587u = bVar;
    }

    private b(E[] eArr, int i10, int i11, boolean z10, b<E> bVar, b<E> bVar2) {
        this.f15588f = eArr;
        this.f15589m = i10;
        this.f15590p = i11;
        this.f15591q = z10;
        this.f15592r = bVar;
        this.f15593s = bVar2;
    }

    private final void j(int i10, Collection<? extends E> collection, int i11) {
        b<E> bVar = this.f15592r;
        if (bVar != null) {
            bVar.j(i10, collection, i11);
            this.f15588f = this.f15592r.f15588f;
            this.f15590p += i11;
            return;
        }
        r(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f15588f[i10 + i12] = it.next();
        }
    }

    private final void k(int i10, E e10) {
        b<E> bVar = this.f15592r;
        if (bVar != null) {
            bVar.k(i10, e10);
            this.f15588f = this.f15592r.f15588f;
            this.f15590p++;
            return;
        }
        r(i10, 1);
        this.f15588f[i10] = e10;
    }

    private final void m() {
        if (!s()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final boolean n(List<?> list) {
        boolean h10;
        h10 = c.h(this.f15588f, this.f15589m, this.f15590p, list);
        return h10;
    }

    private final void o(int i10) {
        if (this.f15592r == null) {
            if (i10 >= 0) {
                E[] eArr = this.f15588f;
                if (i10 > eArr.length) {
                    this.f15588f = (E[]) c.e(this.f15588f, k.f14181q.a(eArr.length, i10));
                    return;
                }
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    private final void p(int i10) {
        o(this.f15590p + i10);
    }

    private final void r(int i10, int i11) {
        p(i11);
        E[] eArr = this.f15588f;
        o.i(eArr, eArr, i10 + i11, i10, this.f15589m + this.f15590p);
        this.f15590p += i11;
    }

    private final boolean s() {
        b<E> bVar;
        if (!this.f15591q && ((bVar = this.f15593s) == null || !bVar.f15591q)) {
            return false;
        }
        return true;
    }

    private final E t(int i10) {
        b<E> bVar = this.f15592r;
        if (bVar != null) {
            this.f15590p--;
            return bVar.t(i10);
        }
        E[] eArr = this.f15588f;
        E e10 = eArr[i10];
        o.i(eArr, eArr, i10, i10 + 1, this.f15589m + this.f15590p);
        c.f(this.f15588f, (this.f15589m + this.f15590p) - 1);
        this.f15590p--;
        return e10;
    }

    private final void u(int i10, int i11) {
        b<E> bVar = this.f15592r;
        if (bVar != null) {
            bVar.u(i10, i11);
        } else {
            E[] eArr = this.f15588f;
            o.i(eArr, eArr, i10, i10 + i11, this.f15590p);
            E[] eArr2 = this.f15588f;
            int i12 = this.f15590p;
            c.g(eArr2, i12 - i11, i12);
        }
        this.f15590p -= i11;
    }

    private final int v(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        b<E> bVar = this.f15592r;
        if (bVar != null) {
            int v10 = bVar.v(i10, i11, collection, z10);
            this.f15590p -= v10;
            return v10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f15588f[i14]) == z10) {
                E[] eArr = this.f15588f;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f15588f;
        o.i(eArr2, eArr2, i10 + i13, i11 + i10, this.f15590p);
        E[] eArr3 = this.f15588f;
        int i16 = this.f15590p;
        c.g(eArr3, i16 - i15, i16);
        this.f15590p -= i15;
        return i15;
    }

    @Override // ec.f
    public int a() {
        return this.f15590p;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m();
        k(this.f15589m + this.f15590p, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        m();
        int size = collection.size();
        j(this.f15589m + this.f15590p, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m();
        u(this.f15589m, this.f15590p);
    }

    @Override // ec.f
    public E e(int i10) {
        m();
        ec.c.f14163f.b(i10, this.f15590p);
        return t(this.f15589m + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof List) || !n((List) obj))) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        ec.c.f14163f.b(i10, this.f15590p);
        return this.f15588f[this.f15589m + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        i10 = c.i(this.f15588f, this.f15589m, this.f15590p);
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f15590p; i10++) {
            if (q.d(this.f15588f[this.f15589m + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (this.f15590p == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0374b(this, 0);
    }

    public final List<E> l() {
        if (this.f15592r == null) {
            m();
            this.f15591q = true;
            if (this.f15590p > 0) {
                return this;
            }
            return f15587u;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f15590p - 1; i10 >= 0; i10--) {
            if (q.d(this.f15588f[this.f15589m + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C0374b(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        m();
        if (v(this.f15589m, this.f15590p, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        m();
        if (v(this.f15589m, this.f15590p, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m();
        ec.c.f14163f.b(i10, this.f15590p);
        E[] eArr = this.f15588f;
        int i11 = this.f15589m;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        b<E> bVar;
        ec.c.f14163f.d(i10, i11, this.f15590p);
        E[] eArr = this.f15588f;
        int i12 = this.f15589m + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f15591q;
        b<E> bVar2 = this.f15593s;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(eArr, i12, i13, z10, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        q.i(tArr, "destination");
        int length = tArr.length;
        int i10 = this.f15590p;
        if (length < i10) {
            E[] eArr = this.f15588f;
            int i11 = this.f15589m;
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, tArr.getClass());
            q.h(tArr2, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr2;
        }
        E[] eArr2 = this.f15588f;
        int i12 = this.f15589m;
        o.i(eArr2, tArr, 0, i12, i10 + i12);
        int length2 = tArr.length;
        int i13 = this.f15590p;
        if (length2 > i13) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j10;
        j10 = c.j(this.f15588f, this.f15589m, this.f15590p);
        return j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        ec.c.f14163f.c(i10, this.f15590p);
        return new C0374b(this, i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        m();
        ec.c.f14163f.c(i10, this.f15590p);
        k(this.f15589m + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        q.i(collection, "elements");
        m();
        ec.c.f14163f.c(i10, this.f15590p);
        int size = collection.size();
        j(this.f15589m + i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] p10;
        E[] eArr = this.f15588f;
        int i10 = this.f15589m;
        p10 = o.p(eArr, i10, this.f15590p + i10);
        return p10;
    }

    public b() {
        this(10);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, null, null);
    }
}
