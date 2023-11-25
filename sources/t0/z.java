package t0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
abstract class z<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private final t<K, V> f23401f;

    /* renamed from: m  reason: collision with root package name */
    private final Iterator<Map.Entry<K, V>> f23402m;

    /* renamed from: p  reason: collision with root package name */
    private int f23403p;

    /* renamed from: q  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f23404q;

    /* renamed from: r  reason: collision with root package name */
    private Map.Entry<? extends K, ? extends V> f23405r;

    /* JADX WARN: Multi-variable type inference failed */
    public z(t<K, V> tVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        qc.q.i(tVar, "map");
        qc.q.i(it, "iterator");
        this.f23401f = tVar;
        this.f23402m = it;
        this.f23403p = tVar.c();
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        Map.Entry<K, V> entry;
        this.f23404q = this.f23405r;
        if (this.f23402m.hasNext()) {
            entry = this.f23402m.next();
        } else {
            entry = null;
        }
        this.f23405r = entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> e() {
        return (Map.Entry<? extends K, ? extends V>) this.f23404q;
    }

    public final t<K, V> f() {
        return this.f23401f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> h() {
        return (Map.Entry<? extends K, ? extends V>) this.f23405r;
    }

    public final boolean hasNext() {
        if (this.f23405r != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (f().c() == this.f23403p) {
            Map.Entry<? extends K, ? extends V> entry = this.f23404q;
            if (entry != null) {
                this.f23401f.remove(entry.getKey());
                this.f23404q = null;
                dc.w wVar = dc.w.f13270a;
                this.f23403p = f().c();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
