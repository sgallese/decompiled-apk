package q0;

import j$.util.Map;
import j0.g3;
import j0.p1;
import j0.t;
import j0.w;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import qc.h;
import qc.q;

/* compiled from: PersistentCompositionLocalMap.kt */
/* loaded from: classes.dex */
public final class d extends n0.d<t<Object>, g3<? extends Object>> implements p1, Map {

    /* renamed from: s  reason: collision with root package name */
    public static final b f21332s = new b(null);

    /* renamed from: t  reason: collision with root package name */
    private static final d f21333t;

    /* compiled from: PersistentCompositionLocalMap.kt */
    /* loaded from: classes.dex */
    public static final class a extends n0.f<t<Object>, g3<? extends Object>> implements p1.a {

        /* renamed from: t  reason: collision with root package name */
        private d f21334t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(dVar);
            q.i(dVar, "map");
            this.f21334t = dVar;
        }

        @Override // n0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof t)) {
                return false;
            }
            return o((t) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof g3)) {
                return false;
            }
            return p((g3) obj);
        }

        @Override // n0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof t)) {
                return null;
            }
            return q((t) obj);
        }

        @Override // n0.f, java.util.Map, j$.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof t)) {
                return obj2;
            }
            return r((t) obj, (g3) obj2);
        }

        @Override // n0.f
        /* renamed from: n  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public d e() {
            d dVar;
            if (h() == this.f21334t.o()) {
                dVar = this.f21334t;
            } else {
                l(new p0.e());
                dVar = new d(h(), size());
            }
            this.f21334t = dVar;
            return dVar;
        }

        public /* bridge */ boolean o(t<Object> tVar) {
            return super.containsKey(tVar);
        }

        public /* bridge */ boolean p(g3<? extends Object> g3Var) {
            return super.containsValue(g3Var);
        }

        public /* bridge */ g3<Object> q(t<Object> tVar) {
            return (g3) super.get(tVar);
        }

        public /* bridge */ g3<Object> r(t<Object> tVar, g3<? extends Object> g3Var) {
            return (g3) Map.CC.$default$getOrDefault(this, tVar, g3Var);
        }

        @Override // n0.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof t)) {
                return null;
            }
            return s((t) obj);
        }

        public /* bridge */ g3<Object> s(t<Object> tVar) {
            return (g3) super.remove(tVar);
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final d a() {
            return d.f21333t;
        }
    }

    static {
        n0.t a10 = n0.t.f19889e.a();
        q.g(a10, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f21333t = new d(a10, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n0.t<t<Object>, g3<Object>> tVar, int i10) {
        super(tVar, i10);
        q.i(tVar, "node");
    }

    @Override // j0.v
    public <T> T a(t<T> tVar) {
        q.i(tVar, "key");
        return (T) w.d(this, tVar);
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

    @Override // n0.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        return u((t) obj);
    }

    @Override // ec.d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof g3)) {
            return false;
        }
        return v((g3) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // n0.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof t)) {
            return null;
        }
        return w((t) obj);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof t)) {
            return obj2;
        }
        return x((t) obj, (g3) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // n0.d
    /* renamed from: t  reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a l() {
        return new a(this);
    }

    public /* bridge */ boolean u(t<Object> tVar) {
        return super.containsKey(tVar);
    }

    public /* bridge */ boolean v(g3<? extends Object> g3Var) {
        return super.containsValue(g3Var);
    }

    public /* bridge */ g3<Object> w(t<Object> tVar) {
        return (g3) super.get(tVar);
    }

    public /* bridge */ g3<Object> x(t<Object> tVar, g3<? extends Object> g3Var) {
        return (g3) Map.CC.$default$getOrDefault(this, tVar, g3Var);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
