package t0;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public abstract class o<K, V, E> implements Set<E>, rc.f {

    /* renamed from: f  reason: collision with root package name */
    private final t<K, V> f23352f;

    public o(t<K, V> tVar) {
        qc.q.i(tVar, "map");
        this.f23352f = tVar;
    }

    public final t<K, V> a() {
        return this.f23352f;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f23352f.clear();
    }

    public int e() {
        return this.f23352f.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f23352f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }
}
