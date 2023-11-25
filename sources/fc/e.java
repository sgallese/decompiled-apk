package fc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import qc.q;

/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: f  reason: collision with root package name */
    private final d<K, V> f15615f;

    public e(d<K, V> dVar) {
        q.i(dVar, "backing");
        this.f15615f = dVar;
    }

    @Override // ec.h
    public int a() {
        return this.f15615f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        q.i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f15615f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        return this.f15615f.m(collection);
    }

    @Override // fc.a
    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        q.i(entry, "element");
        return this.f15615f.n(entry);
    }

    @Override // fc.a
    public boolean h(Map.Entry entry) {
        q.i(entry, "element");
        return this.f15615f.H(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        q.i(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f15615f.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f15615f.r();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15615f.k();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        this.f15615f.k();
        return super.retainAll(collection);
    }
}
