package s0;

import dc.w;
import ec.n0;
import j0.e0;
import j0.f0;
import j0.g2;
import j0.h0;
import j0.n;
import j0.u;
import j0.w1;
import j0.z1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class d implements s0.c {

    /* renamed from: d  reason: collision with root package name */
    public static final c f22902d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    private static final i<d, ?> f22903e = j.a(a.f22907f, b.f22908f);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Map<String, List<Object>>> f22904a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Object, C0529d> f22905b;

    /* renamed from: c  reason: collision with root package name */
    private s0.f f22906c;

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements p<k, d, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22907f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Map<Object, Map<String, List<Object>>> invoke(k kVar, d dVar) {
            q.i(kVar, "$this$Saver");
            q.i(dVar, "it");
            return dVar.h();
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements l<Map<Object, Map<String, ? extends List<? extends Object>>>, d> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f22908f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final d invoke(Map<Object, Map<String, List<Object>>> map) {
            q.i(map, "it");
            return new d(map);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final i<d, ?> a() {
            return d.f22903e;
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: s0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0529d {

        /* renamed from: a  reason: collision with root package name */
        private final Object f22909a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f22910b;

        /* renamed from: c  reason: collision with root package name */
        private final s0.f f22911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f22912d;

        /* compiled from: SaveableStateHolder.kt */
        /* renamed from: s0.d$d$a */
        /* loaded from: classes.dex */
        static final class a extends r implements l<Object, Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ d f22913f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar) {
                super(1);
                this.f22913f = dVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.l
            public final Boolean invoke(Object obj) {
                q.i(obj, "it");
                s0.f g10 = this.f22913f.g();
                return Boolean.valueOf(g10 != null ? g10.a(obj) : true);
            }
        }

        public C0529d(d dVar, Object obj) {
            q.i(obj, "key");
            this.f22912d = dVar;
            this.f22909a = obj;
            this.f22910b = true;
            this.f22911c = h.a((Map) dVar.f22904a.get(obj), new a(dVar));
        }

        public final s0.f a() {
            return this.f22911c;
        }

        public final void b(Map<Object, Map<String, List<Object>>> map) {
            q.i(map, "map");
            if (this.f22910b) {
                Map<String, List<Object>> b10 = this.f22911c.b();
                if (b10.isEmpty()) {
                    map.remove(this.f22909a);
                } else {
                    map.put(this.f22909a, b10);
                }
            }
        }

        public final void c(boolean z10) {
            this.f22910b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements l<f0, e0> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f22915m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ C0529d f22916p;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0529d f22917a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f22918b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f22919c;

            public a(C0529d c0529d, d dVar, Object obj) {
                this.f22917a = c0529d;
                this.f22918b = dVar;
                this.f22919c = obj;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22917a.b(this.f22918b.f22904a);
                this.f22918b.f22905b.remove(this.f22919c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, C0529d c0529d) {
            super(1);
            this.f22915m = obj;
            this.f22916p = c0529d;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            boolean z10 = !d.this.f22905b.containsKey(this.f22915m);
            Object obj = this.f22915m;
            if (z10) {
                d.this.f22904a.remove(this.f22915m);
                d.this.f22905b.put(this.f22915m, this.f22916p);
                return new a(this.f22916p, d.this, this.f22915m);
            }
            throw new IllegalArgumentException(("Key " + obj + " was used multiple times ").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class f extends r implements p<j0.l, Integer, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f22921m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<j0.l, Integer, w> f22922p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f22923q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Object obj, p<? super j0.l, ? super Integer, w> pVar, int i10) {
            super(2);
            this.f22921m = obj;
            this.f22922p = pVar;
            this.f22923q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d.this.e(this.f22921m, this.f22922p, lVar, z1.a(this.f22923q | 1));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.d.<init>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> h() {
        Map<Object, Map<String, List<Object>>> t10;
        t10 = n0.t(this.f22904a);
        Iterator<T> it = this.f22905b.values().iterator();
        while (it.hasNext()) {
            ((C0529d) it.next()).b(t10);
        }
        if (t10.isEmpty()) {
            return null;
        }
        return t10;
    }

    @Override // s0.c
    public void e(Object obj, p<? super j0.l, ? super Integer, w> pVar, j0.l lVar, int i10) {
        boolean z10;
        q.i(obj, "key");
        q.i(pVar, "content");
        j0.l q10 = lVar.q(-1198538093);
        if (n.K()) {
            n.V(-1198538093, i10, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:74)");
        }
        q10.e(444418301);
        q10.v(207, obj);
        q10.e(-492369756);
        Object f10 = q10.f();
        if (f10 == j0.l.f18688a.a()) {
            s0.f g10 = g();
            if (g10 != null) {
                z10 = g10.a(obj);
            } else {
                z10 = true;
            }
            if (z10) {
                f10 = new C0529d(this, obj);
                q10.J(f10);
            } else {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
        }
        q10.N();
        C0529d c0529d = (C0529d) f10;
        u.a(new w1[]{h.b().c(c0529d.a())}, pVar, q10, (i10 & 112) | 8);
        h0.b(w.f13270a, new e(obj, c0529d), q10, 6);
        q10.d();
        q10.N();
        if (n.K()) {
            n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new f(obj, pVar, i10));
        }
    }

    @Override // s0.c
    public void f(Object obj) {
        q.i(obj, "key");
        C0529d c0529d = this.f22905b.get(obj);
        if (c0529d != null) {
            c0529d.c(false);
        } else {
            this.f22904a.remove(obj);
        }
    }

    public final s0.f g() {
        return this.f22906c;
    }

    public final void i(s0.f fVar) {
        this.f22906c = fVar;
    }

    public d(Map<Object, Map<String, List<Object>>> map) {
        q.i(map, "savedStates");
        this.f22904a = map;
        this.f22905b = new LinkedHashMap();
    }

    public /* synthetic */ d(Map map, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
