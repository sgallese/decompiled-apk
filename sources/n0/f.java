package n0;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import l0.g;

/* compiled from: PersistentHashMapBuilder.kt */
/* loaded from: classes.dex */
public class f<K, V> extends ec.g<K, V> implements g.a<K, V>, Map {

    /* renamed from: f  reason: collision with root package name */
    private d<K, V> f19872f;

    /* renamed from: m  reason: collision with root package name */
    private p0.e f19873m;

    /* renamed from: p  reason: collision with root package name */
    private t<K, V> f19874p;

    /* renamed from: q  reason: collision with root package name */
    private V f19875q;

    /* renamed from: r  reason: collision with root package name */
    private int f19876r;

    /* renamed from: s  reason: collision with root package name */
    private int f19877s;

    public f(d<K, V> dVar) {
        qc.q.i(dVar, "map");
        this.f19872f = dVar;
        this.f19873m = new p0.e();
        this.f19874p = this.f19872f.o();
        this.f19877s = this.f19872f.size();
    }

    @Override // ec.g
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // ec.g
    public Set<K> b() {
        return new j(this);
    }

    @Override // ec.g
    public int c() {
        return this.f19877s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t<K, V> a10 = t.f19889e.a();
        qc.q.g(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f19874p = a10;
        m(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k10) {
        int i10;
        t<K, V> tVar = this.f19874p;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.k(i10, k10, 0);
    }

    @Override // ec.g
    public Collection<V> d() {
        return new l(this);
    }

    @Override // l0.g.a
    public d<K, V> e() {
        d<K, V> dVar;
        if (this.f19874p == this.f19872f.o()) {
            dVar = this.f19872f;
        } else {
            this.f19873m = new p0.e();
            dVar = new d<>(this.f19874p, size());
        }
        this.f19872f = dVar;
        return dVar;
    }

    public final int f() {
        return this.f19876r;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k10) {
        int i10;
        t<K, V> tVar = this.f19874p;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.o(i10, k10, 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final t<K, V> h() {
        return this.f19874p;
    }

    public final p0.e i() {
        return this.f19873m;
    }

    public final void j(int i10) {
        this.f19876r = i10;
    }

    public final void k(V v10) {
        this.f19875q = v10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(p0.e eVar) {
        qc.q.i(eVar, "<set-?>");
        this.f19873m = eVar;
    }

    public void m(int i10) {
        this.f19877s = i10;
        this.f19876r++;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int i10;
        this.f19875q = null;
        t<K, V> tVar = this.f19874p;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        this.f19874p = tVar.D(i10, k10, v10, 0, this);
        return this.f19875q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        d<K, V> dVar;
        f fVar;
        qc.q.i(map, "from");
        qc.h hVar = null;
        if (map instanceof d) {
            dVar = (d) map;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            if (map instanceof f) {
                fVar = (f) map;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                dVar = fVar.e();
            } else {
                dVar = null;
            }
        }
        if (dVar != null) {
            p0.b bVar = new p0.b(0, 1, hVar);
            int size = size();
            t<K, V> tVar = this.f19874p;
            t<K, V> o10 = dVar.o();
            qc.q.g(o10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f19874p = tVar.E(o10, 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.a();
            if (size != size2) {
                m(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k10) {
        this.f19875q = null;
        t G = this.f19874p.G(k10 != null ? k10.hashCode() : 0, k10, 0, this);
        if (G == null) {
            G = t.f19889e.a();
            qc.q.g(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f19874p = G;
        return this.f19875q;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t H = this.f19874p.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = t.f19889e.a();
            qc.q.g(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f19874p = H;
        return size != size();
    }
}
