package fc;

import ec.h;
import java.util.Collection;
import java.util.Iterator;
import qc.q;

/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class f<E> extends h<E> {

    /* renamed from: f  reason: collision with root package name */
    private final d<E, ?> f15616f;

    public f(d<E, ?> dVar) {
        q.i(dVar, "backing");
        this.f15616f = dVar;
    }

    @Override // ec.h
    public int a() {
        return this.f15616f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f15616f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f15616f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f15616f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f15616f.C();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f15616f.J(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15616f.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15616f.k();
        return super.retainAll(collection);
    }
}
