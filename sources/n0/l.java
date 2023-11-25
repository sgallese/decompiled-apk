package n0;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class l<K, V> extends ec.e<V> {

    /* renamed from: f  reason: collision with root package name */
    private final f<K, V> f19885f;

    public l(f<K, V> fVar) {
        qc.q.i(fVar, "builder");
        this.f19885f = fVar;
    }

    @Override // ec.e
    public int a() {
        return this.f19885f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f19885f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f19885f.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new m(this.f19885f);
    }
}
