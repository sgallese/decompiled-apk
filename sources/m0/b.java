package m0;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import l0.f;
import qc.q;
import qc.r;

/* compiled from: AbstractPersistentList.kt */
/* loaded from: classes.dex */
public abstract class b<E> extends ec.c<E> implements l0.f<E> {

    /* compiled from: AbstractPersistentList.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<E, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Collection<E> f19703f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f19703f = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.l
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f19703f.contains(e10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    @Override // java.util.Collection, java.util.List, l0.f
    public l0.f<E> addAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        f.a<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.a, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // ec.a, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
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

    @Override // ec.c, java.util.List
    /* renamed from: e  reason: merged with bridge method [inline-methods] */
    public l0.d<E> subList(int i10, int i11) {
        return l0.c.a(this, i10, i11);
    }

    @Override // ec.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // ec.c, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, l0.f
    public l0.f<E> remove(E e10) {
        int indexOf = indexOf(e10);
        if (indexOf != -1) {
            return L(indexOf);
        }
        return this;
    }

    @Override // java.util.Collection, java.util.List, l0.f
    public l0.f<E> removeAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        return z(new a(collection));
    }
}
