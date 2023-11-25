package n0;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class p<K, V> extends ec.i<K> implements l0.e<K> {

    /* renamed from: m  reason: collision with root package name */
    private final d<K, V> f19887m;

    public p(d<K, V> dVar) {
        qc.q.i(dVar, "map");
        this.f19887m = dVar;
    }

    @Override // ec.a
    public int a() {
        return this.f19887m.size();
    }

    @Override // ec.a, java.util.Collection
    public boolean contains(Object obj) {
        return this.f19887m.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new q(this.f19887m.o());
    }
}
