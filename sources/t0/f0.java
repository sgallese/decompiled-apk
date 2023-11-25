package t0;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;

/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
final class f0<T> implements List<T>, rc.d {

    /* renamed from: f  reason: collision with root package name */
    private final r<T> f23291f;

    /* renamed from: m  reason: collision with root package name */
    private final int f23292m;

    /* renamed from: p  reason: collision with root package name */
    private int f23293p;

    /* renamed from: q  reason: collision with root package name */
    private int f23294q;

    /* compiled from: SnapshotStateList.kt */
    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f23295f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f0<T> f23296m;

        a(qc.d0 d0Var, f0<T> f0Var) {
            this.f23295f = d0Var;
            this.f23296m = f0Var;
        }

        @Override // java.util.ListIterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Void add(T t10) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public Void remove() {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public Void set(T t10) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f23295f.f21667f < this.f23296m.size() - 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f23295f.f21667f >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i10 = this.f23295f.f21667f + 1;
            s.e(i10, this.f23296m.size());
            this.f23295f.f21667f = i10;
            return this.f23296m.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23295f.f21667f + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f23295f.f21667f;
            s.e(i10, this.f23296m.size());
            this.f23295f.f21667f = i10 - 1;
            return this.f23296m.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23295f.f21667f;
        }
    }

    public f0(r<T> rVar, int i10, int i11) {
        qc.q.i(rVar, "parentList");
        this.f23291f = rVar;
        this.f23292m = i10;
        this.f23293p = rVar.a();
        this.f23294q = i11 - i10;
    }

    private final void f() {
        if (this.f23291f.a() == this.f23293p) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public int a() {
        return this.f23294q;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        f();
        this.f23291f.add(this.f23292m + size(), t10);
        this.f23294q = size() + 1;
        this.f23293p = this.f23291f.a();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        qc.q.i(collection, "elements");
        f();
        boolean addAll = this.f23291f.addAll(i10 + this.f23292m, collection);
        if (addAll) {
            this.f23294q = size() + collection.size();
            this.f23293p = this.f23291f.a();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            r<T> rVar = this.f23291f;
            int i10 = this.f23292m;
            rVar.m(i10, size() + i10);
            this.f23294q = 0;
            this.f23293p = this.f23291f.a();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public T e(int i10) {
        f();
        T remove = this.f23291f.remove(this.f23292m + i10);
        this.f23294q = size() - 1;
        this.f23293p = this.f23291f.a();
        return remove;
    }

    @Override // java.util.List
    public T get(int i10) {
        f();
        s.e(i10, size());
        return this.f23291f.get(this.f23292m + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        vc.f s10;
        f();
        int i10 = this.f23292m;
        s10 = vc.l.s(i10, size() + i10);
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            int a10 = ((ec.h0) it).a();
            if (qc.q.d(obj, this.f23291f.get(a10))) {
                return a10 - this.f23292m;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        f();
        int size = this.f23292m + size();
        do {
            size--;
            if (size < this.f23292m) {
                return -1;
            }
        } while (!qc.q.d(obj, this.f23291f.get(size)));
        return size - this.f23292m;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return e(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        f();
        r<T> rVar = this.f23291f;
        int i10 = this.f23292m;
        int n10 = rVar.n(collection, i10, size() + i10);
        if (n10 > 0) {
            this.f23293p = this.f23291f.a();
            this.f23294q = size() - n10;
        }
        if (n10 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        s.e(i10, size());
        f();
        T t11 = this.f23291f.set(i10 + this.f23292m, t10);
        this.f23293p = this.f23291f.a();
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || i11 > size()) {
            z11 = false;
        }
        if (z11) {
            f();
            r<T> rVar = this.f23291f;
            int i12 = this.f23292m;
            return new f0(rVar, i10 + i12, i11 + i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        f();
        qc.d0 d0Var = new qc.d0();
        d0Var.f21667f = i10 - 1;
        return new a(d0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        f();
        this.f23291f.add(this.f23292m + i10, t10);
        this.f23294q = size() + 1;
        this.f23293p = this.f23291f.a();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        qc.q.i(collection, "elements");
        return addAll(size(), collection);
    }
}
