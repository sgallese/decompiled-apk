package p1;

import androidx.compose.ui.e;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* compiled from: HitTestResult.kt */
/* loaded from: classes.dex */
public final class v implements List<e.c>, rc.a, j$.util.List {

    /* renamed from: f  reason: collision with root package name */
    private Object[] f20940f = new Object[16];

    /* renamed from: m  reason: collision with root package name */
    private long[] f20941m = new long[16];

    /* renamed from: p  reason: collision with root package name */
    private int f20942p = -1;

    /* renamed from: q  reason: collision with root package name */
    private int f20943q;

    /* compiled from: HitTestResult.kt */
    /* loaded from: classes.dex */
    private final class b implements List<e.c>, rc.a, j$.util.List {

        /* renamed from: f  reason: collision with root package name */
        private final int f20948f;

        /* renamed from: m  reason: collision with root package name */
        private final int f20949m;

        public b(int i10, int i11) {
            this.f20948f = i10;
            this.f20949m = i11;
        }

        public boolean a(e.c cVar) {
            qc.q.i(cVar, "element");
            if (indexOf(cVar) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i10, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof e.c)) {
                return false;
            }
            return a((e.c) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> collection) {
            qc.q.i(collection, "elements");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((e.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        /* renamed from: e  reason: merged with bridge method [inline-methods] */
        public e.c get(int i10) {
            Object obj = v.this.f20940f[i10 + this.f20948f];
            qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        public int f() {
            return this.f20949m - this.f20948f;
        }

        @Override // java.lang.Iterable, j$.util.Collection
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable$CC.$default$forEach(this, consumer);
        }

        public int h(e.c cVar) {
            qc.q.i(cVar, "element");
            int i10 = this.f20948f;
            int i11 = this.f20949m;
            if (i10 <= i11) {
                while (!qc.q.d(v.this.f20940f[i10], cVar)) {
                    if (i10 != i11) {
                        i10++;
                    } else {
                        return -1;
                    }
                }
                return i10 - this.f20948f;
            }
            return -1;
        }

        public int i(e.c cVar) {
            qc.q.i(cVar, "element");
            int i10 = this.f20949m;
            int i11 = this.f20948f;
            if (i11 <= i10) {
                while (!qc.q.d(v.this.f20940f[i10], cVar)) {
                    if (i10 != i11) {
                        i10--;
                    } else {
                        return -1;
                    }
                }
                return i10 - this.f20948f;
            }
            return -1;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            return h((e.c) obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<e.c> iterator() {
            v vVar = v.this;
            int i10 = this.f20948f;
            return new a(i10, i10, this.f20949m);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof e.c)) {
                return -1;
            }
            return i((e.c) obj);
        }

        @Override // java.util.List
        public ListIterator<e.c> listIterator() {
            v vVar = v.this;
            int i10 = this.f20948f;
            return new a(i10, i10, this.f20949m);
        }

        @Override // java.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Stream.Wrapper.convert(parallelStream());
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ e.c remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.List, j$.util.List
        public void replaceAll(UnaryOperator<e.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(java.util.Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ e.c set(int i10, e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List, j$.util.List
        public void sort(Comparator<? super e.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(stream());
        }

        @Override // java.util.List
        public List<e.c> subList(int i10, int i11) {
            v vVar = v.this;
            int i12 = this.f20948f;
            return new b(i10 + i12, i12 + i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return qc.g.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(java.util.Collection<? extends e.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<e.c> listIterator(int i10) {
            v vVar = v.this;
            int i11 = this.f20948f;
            return new a(i10 + i11, i11, this.f20949m);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream parallelStream() {
            j$.util.stream.Stream stream;
            stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
            return stream;
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
        public /* synthetic */ j$.util.Spliterator spliterator() {
            return List.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ j$.util.stream.Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            qc.q.i(tArr, "array");
            return (T[]) qc.g.b(this, tArr);
        }
    }

    private final void j() {
        int i10 = this.f20942p;
        Object[] objArr = this.f20940f;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            qc.q.h(copyOf, "copyOf(this, newSize)");
            this.f20940f = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f20941m, length);
            qc.q.h(copyOf2, "copyOf(this, newSize)");
            this.f20941m = copyOf2;
        }
    }

    private final long k() {
        long a10;
        int k10;
        a10 = w.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f20942p + 1;
        k10 = ec.t.k(this);
        if (i10 <= k10) {
            while (true) {
                long b10 = p.b(this.f20941m[i10]);
                if (p.a(b10, a10) < 0) {
                    a10 = b10;
                }
                if (p.c(a10) < 0.0f && p.d(a10)) {
                    return a10;
                }
                if (i10 == k10) {
                    break;
                }
                i10++;
            }
        }
        return a10;
    }

    private final void u() {
        int k10;
        int i10 = this.f20942p + 1;
        k10 = ec.t.k(this);
        if (i10 <= k10) {
            while (true) {
                this.f20940f[i10] = null;
                if (i10 == k10) {
                    break;
                }
                i10++;
            }
        }
        this.f20943q = this.f20942p + 1;
    }

    public final void a() {
        this.f20942p = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, java.util.Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f20942p = -1;
        u();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof e.c)) {
            return false;
        }
        return i((e.c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((e.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    public boolean i(e.c cVar) {
        qc.q.i(cVar, "element");
        if (indexOf(cVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        return r((e.c) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<e.c> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* renamed from: l  reason: merged with bridge method [inline-methods] */
    public e.c get(int i10) {
        Object obj = this.f20940f[i10];
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (e.c) obj;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof e.c)) {
            return -1;
        }
        return t((e.c) obj);
    }

    @Override // java.util.List
    public ListIterator<e.c> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public int m() {
        return this.f20943q;
    }

    public final boolean n() {
        long k10 = k();
        if (p.c(k10) < 0.0f && p.d(k10)) {
            return true;
        }
        return false;
    }

    public final void o(e.c cVar, boolean z10, pc.a<dc.w> aVar) {
        qc.q.i(cVar, "node");
        qc.q.i(aVar, "childHitTest");
        p(cVar, -1.0f, z10, aVar);
    }

    public final void p(e.c cVar, float f10, boolean z10, pc.a<dc.w> aVar) {
        long a10;
        qc.q.i(cVar, "node");
        qc.q.i(aVar, "childHitTest");
        int i10 = this.f20942p;
        this.f20942p = i10 + 1;
        j();
        Object[] objArr = this.f20940f;
        int i11 = this.f20942p;
        objArr[i11] = cVar;
        long[] jArr = this.f20941m;
        a10 = w.a(f10, z10);
        jArr[i11] = a10;
        u();
        aVar.invoke();
        this.f20942p = i10;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    public int r(e.c cVar) {
        int k10;
        qc.q.i(cVar, "element");
        k10 = ec.t.k(this);
        if (k10 >= 0) {
            int i10 = 0;
            while (!qc.q.d(this.f20940f[i10], cVar)) {
                if (i10 != k10) {
                    i10++;
                } else {
                    return -1;
                }
            }
            return i10;
        }
        return -1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ e.c remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public void replaceAll(UnaryOperator<e.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean s(float f10, boolean z10) {
        int k10;
        long a10;
        int i10 = this.f20942p;
        k10 = ec.t.k(this);
        if (i10 != k10) {
            a10 = w.a(f10, z10);
            if (p.a(k(), a10) > 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ e.c set(int i10, e.c cVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.List, j$.util.List
    public void sort(Comparator<? super e.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List
    public java.util.List<e.c> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    public int t(e.c cVar) {
        int k10;
        qc.q.i(cVar, "element");
        for (k10 = ec.t.k(this); -1 < k10; k10--) {
            if (qc.q.d(this.f20940f[k10], cVar)) {
                return k10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    public final void v(e.c cVar, float f10, boolean z10, pc.a<dc.w> aVar) {
        int k10;
        int k11;
        int k12;
        int k13;
        qc.q.i(cVar, "node");
        qc.q.i(aVar, "childHitTest");
        int i10 = this.f20942p;
        k10 = ec.t.k(this);
        if (i10 == k10) {
            p(cVar, f10, z10, aVar);
            int i11 = this.f20942p + 1;
            k13 = ec.t.k(this);
            if (i11 == k13) {
                u();
                return;
            }
            return;
        }
        long k14 = k();
        int i12 = this.f20942p;
        k11 = ec.t.k(this);
        this.f20942p = k11;
        p(cVar, f10, z10, aVar);
        int i13 = this.f20942p + 1;
        k12 = ec.t.k(this);
        if (i13 < k12 && p.a(k14, k()) > 0) {
            int i14 = this.f20942p + 1;
            int i15 = i12 + 1;
            Object[] objArr = this.f20940f;
            ec.o.i(objArr, objArr, i15, i14, size());
            long[] jArr = this.f20941m;
            ec.o.h(jArr, jArr, i15, i14, size());
            this.f20942p = ((size() + i12) - this.f20942p) - 1;
        }
        u();
        this.f20942p = i12;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends e.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<e.c> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        j$.util.stream.Stream stream;
        stream = StreamSupport.stream(Collection.EL.spliterator(this), true);
        return stream;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }

    /* compiled from: HitTestResult.kt */
    /* loaded from: classes.dex */
    private final class a implements ListIterator<e.c>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f20944f;

        /* renamed from: m  reason: collision with root package name */
        private final int f20945m;

        /* renamed from: p  reason: collision with root package name */
        private final int f20946p;

        public a(int i10, int i11, int i12) {
            this.f20944f = i10;
            this.f20945m = i11;
            this.f20946p = i12;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public e.c next() {
            Object[] objArr = v.this.f20940f;
            int i10 = this.f20944f;
            this.f20944f = i10 + 1;
            Object obj = objArr[i10];
            qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public e.c previous() {
            Object[] objArr = v.this.f20940f;
            int i10 = this.f20944f - 1;
            this.f20944f = i10;
            Object obj = objArr[i10];
            qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (e.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f20944f < this.f20946p) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f20944f > this.f20945m) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f20944f - this.f20945m;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f20944f - this.f20945m) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(e.c cVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(v vVar, int i10, int i11, int i12, int i13, qc.h hVar) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? vVar.size() : i12);
        }
    }
}
