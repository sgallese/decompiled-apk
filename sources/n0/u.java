package n0;

import java.util.Iterator;

/* compiled from: PersistentHashMapContentIterators.kt */
/* loaded from: classes.dex */
public abstract class u<K, V, T> implements Iterator<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private Object[] f19897f = t.f19889e.a().p();

    /* renamed from: m  reason: collision with root package name */
    private int f19898m;

    /* renamed from: p  reason: collision with root package name */
    private int f19899p;

    public final K a() {
        p0.a.a(f());
        return (K) this.f19897f[this.f19899p];
    }

    public final t<? extends K, ? extends V> c() {
        p0.a.a(h());
        Object obj = this.f19897f[this.f19899p];
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (t) obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object[] d() {
        return this.f19897f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int e() {
        return this.f19899p;
    }

    public final boolean f() {
        if (this.f19899p < this.f19898m) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        boolean z10;
        if (this.f19899p >= this.f19898m) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0.a.a(z10);
        if (this.f19899p < this.f19897f.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return f();
    }

    public final void i() {
        p0.a.a(f());
        this.f19899p += 2;
    }

    public final void j() {
        p0.a.a(h());
        this.f19899p++;
    }

    public final void k(Object[] objArr, int i10) {
        qc.q.i(objArr, "buffer");
        l(objArr, i10, 0);
    }

    public final void l(Object[] objArr, int i10, int i11) {
        qc.q.i(objArr, "buffer");
        this.f19897f = objArr;
        this.f19898m = i10;
        this.f19899p = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(int i10) {
        this.f19899p = i10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
