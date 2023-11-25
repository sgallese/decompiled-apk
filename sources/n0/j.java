package n0;

import java.util.Iterator;

/* compiled from: PersistentHashMapBuilderContentViews.kt */
/* loaded from: classes.dex */
public final class j<K, V> extends ec.h<K> {

    /* renamed from: f  reason: collision with root package name */
    private final f<K, V> f19884f;

    public j(f<K, V> fVar) {
        qc.q.i(fVar, "builder");
        this.f19884f = fVar;
    }

    @Override // ec.h
    public int a() {
        return this.f19884f.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f19884f.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f19884f.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new k(this.f19884f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f19884f.containsKey(obj)) {
            this.f19884f.remove(obj);
            return true;
        }
        return false;
    }
}
