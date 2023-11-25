package t0;

import ec.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import l0.g;
import qc.k0;
import t0.t;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
final class m<K, V> extends o<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t<K, V> tVar) {
        super(tVar);
        qc.q.i(tVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) f((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) h(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!k0.l(obj)) {
            return false;
        }
        return i((Map.Entry) obj);
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
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void f(Map.Entry<K, V> entry) {
        qc.q.i(entry, "element");
        u.b();
        throw new KotlinNothingValueException();
    }

    public Void h(Collection<? extends Map.Entry<K, V>> collection) {
        qc.q.i(collection, "elements");
        u.b();
        throw new KotlinNothingValueException();
    }

    public boolean i(Map.Entry<K, V> entry) {
        qc.q.i(entry, "element");
        return qc.q.d(a().get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new y(a(), ((l0.e) a().d().i().entrySet()).iterator());
    }

    public boolean j(Map.Entry<K, V> entry) {
        qc.q.i(entry, "element");
        if (a().remove(entry.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!k0.l(obj)) {
            return false;
        }
        return j((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        qc.q.i(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (a().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        int s10;
        int d10;
        int d11;
        Object obj;
        l0.g<K, V> i10;
        int j10;
        boolean z10;
        g b10;
        Object obj2;
        boolean z11;
        qc.q.i(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        s10 = ec.u.s(collection2, 10);
        d10 = m0.d(s10);
        d11 = vc.l.d(d10, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            dc.l a10 = dc.r.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a10.c(), a10.d());
        }
        t<K, V> a11 = a();
        boolean z12 = false;
        do {
            obj = u.f23366a;
            synchronized (obj) {
                e0 e10 = a11.e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                t.a aVar = (t.a) l.D((t.a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            Iterator<Map.Entry<K, V>> it2 = a11.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (linkedHashMap.containsKey(next.getKey()) && qc.q.d(linkedHashMap.get(next.getKey()), next.getValue())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    l10.remove(next.getKey());
                    z12 = true;
                }
            }
            dc.w wVar2 = dc.w.f13270a;
            l0.g<K, V> e11 = l10.e();
            if (qc.q.d(e11, i10)) {
                break;
            }
            e0 e12 = a11.e();
            qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            t.a aVar2 = (t.a) e12;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                t.a aVar3 = (t.a) l.f0(aVar2, a11, b10);
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
            l.O(b10, a11);
        } while (!z10);
        return z12;
    }
}
