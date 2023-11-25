package n0;

import java.util.Map;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        p0.a.a(f());
        m(e() + 2);
        return new b(d()[e() - 2], d()[e() - 1]);
    }
}
