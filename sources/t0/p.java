package t0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import l0.g;
import t0.t;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
final class p<K, V> extends o<K, V, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t<K, V> tVar) {
        super(tVar);
        qc.q.i(tVar, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return a().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!a().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(V v10) {
        u.b();
        throw new KotlinNothingValueException();
    }

    public Void h(Collection<? extends V> collection) {
        qc.q.i(collection, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: i  reason: merged with bridge method [inline-methods] */
    public b0<K, V> iterator() {
        return new b0<>(a(), ((l0.e) a().d().i().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return a().j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Set H0;
        Object obj;
        l0.g<K, V> i10;
        int j10;
        boolean z10;
        g b10;
        Object obj2;
        qc.q.i(collection, "elements");
        H0 = ec.b0.H0(collection);
        t<K, V> a10 = a();
        boolean z11 = false;
        do {
            obj = u.f23366a;
            synchronized (obj) {
                e0 e10 = a10.e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t.a aVar = (t.a) l.D((t.a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            Iterator<Map.Entry<K, V>> it = a10.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (H0.contains(next.getValue())) {
                    l10.remove(next.getKey());
                    z11 = true;
                }
            }
            dc.w wVar2 = dc.w.f13270a;
            l0.g<K, V> e11 = l10.e();
            if (qc.q.d(e11, i10)) {
                break;
            }
            e0 e12 = a10.e();
            qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            t.a aVar2 = (t.a) e12;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                t.a aVar3 = (t.a) l.f0(aVar2, a10, b10);
                obj2 = u.f23366a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(e11);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, a10);
        } while (!z10);
        return z11;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Set H0;
        Object obj;
        l0.g<K, V> i10;
        int j10;
        boolean z10;
        g b10;
        Object obj2;
        qc.q.i(collection, "elements");
        H0 = ec.b0.H0(collection);
        t<K, V> a10 = a();
        boolean z11 = false;
        do {
            obj = u.f23366a;
            synchronized (obj) {
                e0 e10 = a10.e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t.a aVar = (t.a) l.D((t.a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            Iterator<Map.Entry<K, V>> it = a10.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if ((!H0.contains(next.getValue())) != false) {
                    l10.remove(next.getKey());
                    z11 = true;
                }
            }
            dc.w wVar2 = dc.w.f13270a;
            l0.g<K, V> e11 = l10.e();
            if (qc.q.d(e11, i10)) {
                break;
            }
            e0 e12 = a10.e();
            qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            t.a aVar2 = (t.a) e12;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                t.a aVar3 = (t.a) l.f0(aVar2, a10, b10);
                obj2 = u.f23366a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(e11);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, a10);
        } while (!z10);
        return z11;
    }
}
