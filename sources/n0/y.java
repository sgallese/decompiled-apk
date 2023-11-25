package n0;

import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: q  reason: collision with root package name */
    private final i<K, V> f19900q;

    public y(i<K, V> iVar) {
        qc.q.i(iVar, "parentIterator");
        this.f19900q = iVar;
    }

    @Override // java.util.Iterator
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        p0.a.a(f());
        m(e() + 2);
        return new c(this.f19900q, d()[e() - 2], d()[e() - 1]);
    }
}
