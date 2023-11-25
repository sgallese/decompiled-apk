package ec;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: AbstractCollection.kt */
/* loaded from: classes4.dex */
public abstract class a<E> implements Collection<E>, rc.a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: ec.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0336a extends qc.r implements pc.l<E, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<E> f14158f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0336a(a<? extends E> aVar) {
            super(1);
            this.f14158f = aVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            if (e10 == this.f14158f) {
                return "(this Collection)";
            }
            return String.valueOf(e10);
        }
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (qc.q.d(it.next(), e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    public String toString() {
        String k02;
        k02 = b0.k0(this, ", ", "[", "]", 0, null, new C0336a(this), 24, null);
        return k02;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }
}
