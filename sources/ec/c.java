package ec;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* loaded from: classes4.dex */
public abstract class c<E> extends ec.a<E> implements List<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f14163f = new a(null);

    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 <= i11) {
                    return;
                }
                throw new IllegalArgumentException("startIndex: " + i10 + " > endIndex: " + i11);
            }
            throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
        }

        public final void b(int i10, int i11) {
            if (i10 >= 0 && i10 < i11) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }

        public final void c(int i10, int i11) {
            if (i10 >= 0 && i10 <= i11) {
                return;
            }
            throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 >= 0 && i11 <= i12) {
                if (i10 <= i11) {
                    return;
                }
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
            throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
        }

        public final boolean e(Collection<?> collection, Collection<?> collection2) {
            qc.q.i(collection, "c");
            qc.q.i(collection2, TaskSetupFragment.TYPE_OTHER);
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!qc.q.d(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection<?> collection) {
            int i10;
            qc.q.i(collection, "c");
            int i11 = 1;
            for (Object obj : collection) {
                int i12 = i11 * 31;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i11 = i12 + i10;
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    public class b implements Iterator<E>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f14164f;

        public b() {
        }

        protected final int a() {
            return this.f14164f;
        }

        protected final void c(int i10) {
            this.f14164f = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14164f < c.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i10 = this.f14164f;
                this.f14164f = i10 + 1;
                return cVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: ec.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private class C0337c extends c<E>.b implements ListIterator<E> {
        public C0337c(int i10) {
            super();
            c.f14163f.c(i10, c.this.size());
            c(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (a() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                c(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes4.dex */
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: m  reason: collision with root package name */
        private final c<E> f14167m;

        /* renamed from: p  reason: collision with root package name */
        private final int f14168p;

        /* renamed from: q  reason: collision with root package name */
        private int f14169q;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> cVar, int i10, int i11) {
            qc.q.i(cVar, "list");
            this.f14167m = cVar;
            this.f14168p = i10;
            c.f14163f.d(i10, i11, cVar.size());
            this.f14169q = i11 - i10;
        }

        @Override // ec.a
        public int a() {
            return this.f14169q;
        }

        @Override // ec.c, java.util.List
        public E get(int i10) {
            c.f14163f.b(i10, this.f14169q);
            return this.f14167m.get(this.f14168p + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f14163f.e(this, (Collection) obj);
    }

    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f14163f.f(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!qc.q.d(it.next(), e10)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (qc.q.d(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C0337c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new C0337c(i10);
    }
}
