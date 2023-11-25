package m0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractListIterator.kt */
/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private int f19701f;

    /* renamed from: m  reason: collision with root package name */
    private int f19702m;

    public a(int i10, int i11) {
        this.f19701f = i10;
        this.f19702m = i11;
    }

    public final void a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        if (hasPrevious()) {
            return;
        }
        throw new NoSuchElementException();
    }

    public final int d() {
        return this.f19701f;
    }

    public final int e() {
        return this.f19702m;
    }

    public final void f(int i10) {
        this.f19701f = i10;
    }

    public final void h(int i10) {
        this.f19702m = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f19701f < this.f19702m) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f19701f > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f19701f;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f19701f - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
