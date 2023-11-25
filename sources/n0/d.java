package n0;

import java.util.Map;
import java.util.Set;
import n0.t;

/* compiled from: PersistentHashMap.kt */
/* loaded from: classes.dex */
public class d<K, V> extends ec.d<K, V> implements l0.g<K, V> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f19865q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final d f19866r = new d(t.f19889e.a(), 0);

    /* renamed from: m  reason: collision with root package name */
    private final t<K, V> f19867m;

    /* renamed from: p  reason: collision with root package name */
    private final int f19868p;

    /* compiled from: PersistentHashMap.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f19866r;
            qc.q.g(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }
    }

    public d(t<K, V> tVar, int i10) {
        qc.q.i(tVar, "node");
        this.f19867m = tVar;
        this.f19868p = i10;
    }

    private final l0.e<Map.Entry<K, V>> m() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(K k10) {
        int i10;
        t<K, V> tVar = this.f19867m;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.k(i10, k10, 0);
    }

    @Override // ec.d
    public final Set<Map.Entry<K, V>> d() {
        return m();
    }

    @Override // ec.d
    public int f() {
        return this.f19868p;
    }

    @Override // java.util.Map
    public V get(K k10) {
        int i10;
        t<K, V> tVar = this.f19867m;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return tVar.o(i10, k10, 0);
    }

    @Override // l0.g
    public f<K, V> l() {
        return new f<>(this);
    }

    @Override // ec.d
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public l0.e<K> e() {
        return new p(this);
    }

    public final t<K, V> o() {
        return this.f19867m;
    }

    @Override // ec.d
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public l0.b<V> h() {
        return new r(this);
    }

    public d<K, V> q(K k10, V v10) {
        int i10;
        t<K, V> tVar = this.f19867m;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        t.b<K, V> P = tVar.P(i10, k10, v10, 0);
        if (P == null) {
            return this;
        }
        return new d<>(P.a(), size() + P.b());
    }

    public d<K, V> r(K k10) {
        int i10;
        t<K, V> tVar = this.f19867m;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        t<K, V> Q = tVar.Q(i10, k10, 0);
        if (this.f19867m == Q) {
            return this;
        }
        if (Q == null) {
            return f19865q.a();
        }
        return new d<>(Q, size() - 1);
    }
}
