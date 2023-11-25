package fc;

import java.util.Collection;
import java.util.Iterator;
import qc.q;

/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class g<V> extends ec.e<V> {

    /* renamed from: f  reason: collision with root package name */
    private final d<?, V> f15617f;

    public g(d<?, V> dVar) {
        q.i(dVar, "backing");
        this.f15617f = dVar;
    }

    @Override // ec.e
    public int a() {
        return this.f15617f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        q.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f15617f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f15617f.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f15617f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f15617f.O();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f15617f.M(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15617f.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15617f.k();
        return super.retainAll(collection);
    }
}
