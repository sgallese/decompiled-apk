package n0;

import rc.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements e.a {

    /* renamed from: p  reason: collision with root package name */
    private final i<K, V> f19863p;

    /* renamed from: q  reason: collision with root package name */
    private V f19864q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        qc.q.i(iVar, "parentIterator");
        this.f19863p = iVar;
        this.f19864q = v10;
    }

    public void a(V v10) {
        this.f19864q = v10;
    }

    @Override // n0.b, java.util.Map.Entry
    public V getValue() {
        return this.f19864q;
    }

    @Override // n0.b, java.util.Map.Entry
    public V setValue(V v10) {
        V value = getValue();
        a(v10);
        this.f19863p.c(getKey(), v10);
        return value;
    }
}
