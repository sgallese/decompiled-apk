package ec;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
/* loaded from: classes4.dex */
public class q0<T> extends c<T> {

    /* renamed from: m  reason: collision with root package name */
    private final List<T> f14188m;

    /* compiled from: ReversedViews.kt */
    /* loaded from: classes4.dex */
    public static final class a implements ListIterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private final ListIterator<T> f14189f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ q0<T> f14190m;

        /* JADX WARN: Multi-variable type inference failed */
        a(q0<? extends T> q0Var, int i10) {
            int P;
            this.f14190m = q0Var;
            List list = ((q0) q0Var).f14188m;
            P = z.P(q0Var, i10);
            this.f14189f = list.listIterator(P);
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f14189f.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f14189f.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f14189f.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int O;
            O = z.O(this.f14190m, this.f14189f.previousIndex());
            return O;
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f14189f.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int O;
            O = z.O(this.f14190m, this.f14189f.nextIndex());
            return O;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(List<? extends T> list) {
        qc.q.i(list, "delegate");
        this.f14188m = list;
    }

    @Override // ec.a
    public int a() {
        return this.f14188m.size();
    }

    @Override // ec.c, java.util.List
    public T get(int i10) {
        int N;
        List<T> list = this.f14188m;
        N = z.N(this, i10);
        return list.get(N);
    }

    @Override // ec.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // ec.c, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // ec.c, java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new a(this, i10);
    }
}
