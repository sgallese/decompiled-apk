package k0;

import ec.o;
import ec.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import qc.q;

/* compiled from: MutableVector.kt */
/* loaded from: classes.dex */
public final class f<T> implements RandomAccess {

    /* renamed from: f  reason: collision with root package name */
    private T[] f19136f;

    /* renamed from: m  reason: collision with root package name */
    private List<T> f19137m;

    /* renamed from: p  reason: collision with root package name */
    private int f19138p;

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    private static final class a<T> implements List<T>, rc.d {

        /* renamed from: f  reason: collision with root package name */
        private final f<T> f19139f;

        public a(f<T> fVar) {
            q.i(fVar, "vector");
            this.f19139f = fVar;
        }

        public int a() {
            return this.f19139f.o();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            return this.f19139f.d(t10);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            q.i(collection, "elements");
            return this.f19139f.e(i10, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f19139f.i();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f19139f.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            return this.f19139f.k(collection);
        }

        public T e(int i10) {
            g.c(this, i10);
            return this.f19139f.x(i10);
        }

        @Override // java.util.List
        public T get(int i10) {
            g.c(this, i10);
            return this.f19139f.n()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f19139f.p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f19139f.r();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f19139f.u(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return e(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            return this.f19139f.w(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            return this.f19139f.z(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            g.c(this, i10);
            return this.f19139f.A(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            g.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return qc.g.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f19139f.a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            q.i(collection, "elements");
            return this.f19139f.g(collection);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f19139f.v(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            q.i(tArr, "array");
            return (T[]) qc.g.b(this, tArr);
        }
    }

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    private static final class b<T> implements List<T>, rc.d {

        /* renamed from: f  reason: collision with root package name */
        private final List<T> f19140f;

        /* renamed from: m  reason: collision with root package name */
        private final int f19141m;

        /* renamed from: p  reason: collision with root package name */
        private int f19142p;

        public b(List<T> list, int i10, int i11) {
            q.i(list, "list");
            this.f19140f = list;
            this.f19141m = i10;
            this.f19142p = i11;
        }

        public int a() {
            return this.f19142p - this.f19141m;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f19140f;
            int i10 = this.f19142p;
            this.f19142p = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends T> collection) {
            q.i(collection, "elements");
            this.f19140f.addAll(i10 + this.f19141m, collection);
            this.f19142p += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f19142p - 1;
            int i11 = this.f19141m;
            if (i11 <= i10) {
                while (true) {
                    this.f19140f.remove(i10);
                    if (i10 == i11) {
                        break;
                    }
                    i10--;
                }
            }
            this.f19142p = this.f19141m;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f19142p;
            for (int i11 = this.f19141m; i11 < i10; i11++) {
                if (q.d(this.f19140f.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public T e(int i10) {
            g.c(this, i10);
            this.f19142p--;
            return this.f19140f.remove(i10 + this.f19141m);
        }

        @Override // java.util.List
        public T get(int i10) {
            g.c(this, i10);
            return this.f19140f.get(i10 + this.f19141m);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f19142p;
            for (int i11 = this.f19141m; i11 < i10; i11++) {
                if (q.d(this.f19140f.get(i11), obj)) {
                    return i11 - this.f19141m;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.f19142p == this.f19141m) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f19142p - 1;
            int i11 = this.f19141m;
            if (i11 <= i10) {
                while (!q.d(this.f19140f.get(i10), obj)) {
                    if (i10 != i11) {
                        i10--;
                    } else {
                        return -1;
                    }
                }
                return i10 - this.f19141m;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return e(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            int i10 = this.f19142p;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i10 != this.f19142p) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            q.i(collection, "elements");
            int i10 = this.f19142p;
            int i11 = i10 - 1;
            int i12 = this.f19141m;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f19140f.get(i11))) {
                        this.f19140f.remove(i11);
                        this.f19142p--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            if (i10 != this.f19142p) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            g.c(this, i10);
            return this.f19140f.set(i10 + this.f19141m, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List<T> subList(int i10, int i11) {
            g.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return qc.g.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f19140f.add(i10 + this.f19141m, t10);
            this.f19142p++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f19142p;
            for (int i11 = this.f19141m; i11 < i10; i11++) {
                if (q.d(this.f19140f.get(i11), obj)) {
                    this.f19140f.remove(i11);
                    this.f19142p--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            q.i(tArr, "array");
            return (T[]) qc.g.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            q.i(collection, "elements");
            this.f19140f.addAll(this.f19142p, collection);
            this.f19142p += collection.size();
            return collection.size() > 0;
        }
    }

    /* compiled from: MutableVector.kt */
    /* loaded from: classes.dex */
    private static final class c<T> implements ListIterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final List<T> f19143f;

        /* renamed from: m  reason: collision with root package name */
        private int f19144m;

        public c(List<T> list, int i10) {
            q.i(list, "list");
            this.f19143f = list;
            this.f19144m = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f19143f.add(this.f19144m, t10);
            this.f19144m++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f19144m < this.f19143f.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f19144m > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f19143f;
            int i10 = this.f19144m;
            this.f19144m = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19144m;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f19144m - 1;
            this.f19144m = i10;
            return this.f19143f.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19144m - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f19144m - 1;
            this.f19144m = i10;
            this.f19143f.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f19143f.set(this.f19144m, t10);
        }
    }

    public f(T[] tArr, int i10) {
        q.i(tArr, "content");
        this.f19136f = tArr;
        this.f19138p = i10;
    }

    public final T A(int i10, T t10) {
        T[] tArr = this.f19136f;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void B(Comparator<T> comparator) {
        q.i(comparator, "comparator");
        o.D(this.f19136f, comparator, 0, this.f19138p);
    }

    public final void a(int i10, T t10) {
        l(this.f19138p + 1);
        T[] tArr = this.f19136f;
        int i11 = this.f19138p;
        if (i10 != i11) {
            o.i(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f19138p++;
    }

    public final boolean d(T t10) {
        l(this.f19138p + 1);
        T[] tArr = this.f19136f;
        int i10 = this.f19138p;
        tArr[i10] = t10;
        this.f19138p = i10 + 1;
        return true;
    }

    public final boolean e(int i10, Collection<? extends T> collection) {
        q.i(collection, "elements");
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        l(this.f19138p + collection.size());
        T[] tArr = this.f19136f;
        if (i10 != this.f19138p) {
            o.i(tArr, tArr, collection.size() + i10, i10, this.f19138p);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                t.r();
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f19138p += collection.size();
        return true;
    }

    public final boolean f(int i10, f<T> fVar) {
        q.i(fVar, "elements");
        if (fVar.r()) {
            return false;
        }
        l(this.f19138p + fVar.f19138p);
        T[] tArr = this.f19136f;
        int i11 = this.f19138p;
        if (i10 != i11) {
            o.i(tArr, tArr, fVar.f19138p + i10, i10, i11);
        }
        o.i(fVar.f19136f, tArr, i10, 0, fVar.f19138p);
        this.f19138p += fVar.f19138p;
        return true;
    }

    public final boolean g(Collection<? extends T> collection) {
        q.i(collection, "elements");
        return e(this.f19138p, collection);
    }

    public final List<T> h() {
        List<T> list = this.f19137m;
        if (list == null) {
            a aVar = new a(this);
            this.f19137m = aVar;
            return aVar;
        }
        return list;
    }

    public final void i() {
        T[] tArr = this.f19136f;
        int o10 = o();
        while (true) {
            o10--;
            if (-1 < o10) {
                tArr[o10] = null;
            } else {
                this.f19138p = 0;
                return;
            }
        }
    }

    public final boolean j(T t10) {
        int o10 = o() - 1;
        if (o10 >= 0) {
            for (int i10 = 0; !q.d(n()[i10], t10); i10++) {
                if (i10 != o10) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection<? extends T> collection) {
        q.i(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!j(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void l(int i10) {
        T[] tArr = this.f19136f;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            q.h(tArr2, "copyOf(this, newSize)");
            this.f19136f = tArr2;
        }
    }

    public final T m() {
        if (!r()) {
            return n()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final T[] n() {
        return this.f19136f;
    }

    public final int o() {
        return this.f19138p;
    }

    public final int p(T t10) {
        int i10 = this.f19138p;
        if (i10 > 0) {
            T[] tArr = this.f19136f;
            int i11 = 0;
            while (!q.d(t10, tArr[i11])) {
                i11++;
                if (i11 >= i10) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean r() {
        if (this.f19138p == 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.f19138p != 0) {
            return true;
        }
        return false;
    }

    public final T t() {
        if (!r()) {
            return n()[o() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int u(T t10) {
        int i10 = this.f19138p;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f19136f;
            while (!q.d(t10, tArr[i11])) {
                i11--;
                if (i11 < 0) {
                    return -1;
                }
            }
            return i11;
        }
        return -1;
    }

    public final boolean v(T t10) {
        int p10 = p(t10);
        if (p10 >= 0) {
            x(p10);
            return true;
        }
        return false;
    }

    public final boolean w(Collection<? extends T> collection) {
        q.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f19138p;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
        if (i10 == this.f19138p) {
            return false;
        }
        return true;
    }

    public final T x(int i10) {
        T[] tArr = this.f19136f;
        T t10 = tArr[i10];
        if (i10 != o() - 1) {
            o.i(tArr, tArr, i10, i10 + 1, this.f19138p);
        }
        int i11 = this.f19138p - 1;
        this.f19138p = i11;
        tArr[i11] = null;
        return t10;
    }

    public final void y(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f19138p;
            if (i11 < i12) {
                T[] tArr = this.f19136f;
                o.i(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f19138p - (i11 - i10);
            int o10 = o() - 1;
            if (i13 <= o10) {
                int i14 = i13;
                while (true) {
                    this.f19136f[i14] = null;
                    if (i14 == o10) {
                        break;
                    }
                    i14++;
                }
            }
            this.f19138p = i13;
        }
    }

    public final boolean z(Collection<? extends T> collection) {
        q.i(collection, "elements");
        int i10 = this.f19138p;
        for (int o10 = o() - 1; -1 < o10; o10--) {
            if (!collection.contains(n()[o10])) {
                x(o10);
            }
        }
        if (i10 != this.f19138p) {
            return true;
        }
        return false;
    }
}
