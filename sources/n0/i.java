package n0;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PersistentHashMapBuilderContentIterators.kt */
/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private final g<K, V, Map.Entry<K, V>> f19883f;

    public i(f<K, V> fVar) {
        qc.q.i(fVar, "builder");
        u[] uVarArr = new u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new y(this);
        }
        this.f19883f = new g<>(fVar, uVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.f19883f.next();
    }

    public final void c(K k10, V v10) {
        this.f19883f.l(k10, v10);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19883f.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f19883f.remove();
    }
}
