package n0;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentViews.kt */
/* loaded from: classes.dex */
public final class r<K, V> extends ec.a<V> implements l0.b<V> {

    /* renamed from: f  reason: collision with root package name */
    private final d<K, V> f19888f;

    public r(d<K, V> dVar) {
        qc.q.i(dVar, "map");
        this.f19888f = dVar;
    }

    @Override // ec.a
    public int a() {
        return this.f19888f.size();
    }

    @Override // ec.a, java.util.Collection
    public boolean contains(Object obj) {
        return this.f19888f.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new s(this.f19888f.o());
    }
}
