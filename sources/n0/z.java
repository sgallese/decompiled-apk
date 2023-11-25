package n0;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public final class z<K, V> extends u<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        p0.a.a(f());
        m(e() + 2);
        return (V) d()[e() - 1];
    }
}
