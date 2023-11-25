package n0;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        p0.a.a(f());
        m(e() + 2);
        return (K) d()[e() - 2];
    }
}
