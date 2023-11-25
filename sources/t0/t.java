package t0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l0.g;

/* compiled from: SnapshotStateMap.kt */
/* loaded from: classes.dex */
public final class t<K, V> implements Map<K, V>, d0, rc.e {

    /* renamed from: f  reason: collision with root package name */
    private e0 f23360f = new a(l0.a.a());

    /* renamed from: m  reason: collision with root package name */
    private final Set<Map.Entry<K, V>> f23361m = new m(this);

    /* renamed from: p  reason: collision with root package name */
    private final Set<K> f23362p = new n(this);

    /* renamed from: q  reason: collision with root package name */
    private final Collection<V> f23363q = new p(this);

    /* compiled from: SnapshotStateMap.kt */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends e0 {

        /* renamed from: c  reason: collision with root package name */
        private l0.g<K, ? extends V> f23364c;

        /* renamed from: d  reason: collision with root package name */
        private int f23365d;

        public a(l0.g<K, ? extends V> gVar) {
            qc.q.i(gVar, "map");
            this.f23364c = gVar;
        }

        @Override // t0.e0
        public void c(e0 e0Var) {
            Object obj;
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            a aVar = (a) e0Var;
            obj = u.f23366a;
            synchronized (obj) {
                this.f23364c = aVar.f23364c;
                this.f23365d = aVar.f23365d;
                dc.w wVar = dc.w.f13270a;
            }
        }

        @Override // t0.e0
        public e0 d() {
            return new a(this.f23364c);
        }

        public final l0.g<K, V> i() {
            return (l0.g<K, ? extends V>) this.f23364c;
        }

        public final int j() {
            return this.f23365d;
        }

        public final void k(l0.g<K, ? extends V> gVar) {
            qc.q.i(gVar, "<set-?>");
            this.f23364c = gVar;
        }

        public final void l(int i10) {
            this.f23365d = i10;
        }
    }

    public Set<Map.Entry<K, V>> a() {
        return this.f23361m;
    }

    public Set<K> b() {
        return this.f23362p;
    }

    public final int c() {
        return d().j();
    }

    @Override // java.util.Map
    public void clear() {
        g b10;
        Object obj;
        e0 e10 = e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) l.D((a) e10);
        aVar.i();
        l0.g<K, V> a10 = l0.a.a();
        if (a10 != aVar.i()) {
            e0 e11 = e();
            qc.q.g(e11, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e11;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj = u.f23366a;
                synchronized (obj) {
                    aVar3.k(a10);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            l.O(b10, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return d().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return d().i().containsValue(obj);
    }

    public final a<K, V> d() {
        e0 e10 = e();
        qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) l.V((a) e10, this);
    }

    @Override // t0.d0
    public e0 e() {
        return this.f23360f;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return a();
    }

    @Override // t0.d0
    public /* synthetic */ e0 f(e0 e0Var, e0 e0Var2, e0 e0Var3) {
        return c0.a(this, e0Var, e0Var2, e0Var3);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return d().i().get(obj);
    }

    public int h() {
        return d().i().size();
    }

    public Collection<V> i() {
        return this.f23363q;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return d().i().isEmpty();
    }

    public final boolean j(V v10) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (qc.q.d(((Map.Entry) obj).getValue(), v10)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // t0.d0
    public void k(e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f23360f = (a) e0Var;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return b();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        Object obj;
        l0.g<K, V> i10;
        int j10;
        V put;
        g b10;
        Object obj2;
        boolean z10;
        do {
            obj = u.f23366a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) l.D((a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            put = l10.put(k10, v10);
            l0.g<K, V> e11 = l10.e();
            if (qc.q.d(e11, i10)) {
                break;
            }
            e0 e12 = e();
            qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e12;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj2 = u.f23366a;
                synchronized (obj2) {
                    if (aVar3.j() == j10) {
                        aVar3.k(e11);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Object obj;
        l0.g<K, V> i10;
        int j10;
        g b10;
        Object obj2;
        boolean z10;
        qc.q.i(map, "from");
        do {
            obj = u.f23366a;
            synchronized (obj) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) l.D((a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            l10.putAll(map);
            l0.g<K, V> e11 = l10.e();
            if (!qc.q.d(e11, i10)) {
                e0 e12 = e();
                qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) e12;
                l.H();
                synchronized (l.G()) {
                    b10 = g.f23297e.b();
                    a aVar3 = (a) l.f0(aVar2, this, b10);
                    obj2 = u.f23366a;
                    synchronized (obj2) {
                        if (aVar3.j() == j10) {
                            aVar3.k(e11);
                            z10 = true;
                            aVar3.l(aVar3.j() + 1);
                        } else {
                            z10 = false;
                        }
                    }
                }
                l.O(b10, this);
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        l0.g<K, V> i10;
        int j10;
        V remove;
        g b10;
        Object obj3;
        boolean z10;
        do {
            obj2 = u.f23366a;
            synchronized (obj2) {
                e0 e10 = e();
                qc.q.g(e10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) l.D((a) e10);
                i10 = aVar.i();
                j10 = aVar.j();
                dc.w wVar = dc.w.f13270a;
            }
            qc.q.f(i10);
            g.a<K, V> l10 = i10.l();
            remove = l10.remove(obj);
            l0.g<K, V> e11 = l10.e();
            if (qc.q.d(e11, i10)) {
                break;
            }
            e0 e12 = e();
            qc.q.g(e12, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) e12;
            l.H();
            synchronized (l.G()) {
                b10 = g.f23297e.b();
                a aVar3 = (a) l.f0(aVar2, this, b10);
                obj3 = u.f23366a;
                synchronized (obj3) {
                    if (aVar3.j() == j10) {
                        aVar3.k(e11);
                        z10 = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            l.O(b10, this);
        } while (!z10);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return i();
    }
}
