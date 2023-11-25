package m0;

/* compiled from: AbstractListIterator.kt */
/* loaded from: classes.dex */
public final class i<E> extends a<E> {

    /* renamed from: p  reason: collision with root package name */
    private final E f19725p;

    public i(E e10, int i10) {
        super(i10, 1);
        this.f19725p = e10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        a();
        f(d() + 1);
        return this.f19725p;
    }

    @Override // java.util.ListIterator
    public E previous() {
        c();
        f(d() - 1);
        return this.f19725p;
    }
}
