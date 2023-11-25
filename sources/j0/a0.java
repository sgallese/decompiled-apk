package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.b0;
import t0.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
/* loaded from: classes.dex */
public final class a0<T> implements t0.d0, b0<T> {

    /* renamed from: f  reason: collision with root package name */
    private final pc.a<T> f18513f;

    /* renamed from: m  reason: collision with root package name */
    private final x2<T> f18514m;

    /* renamed from: p  reason: collision with root package name */
    private a<T> f18515p;

    /* compiled from: DerivedState.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends t0.e0 implements b0.a<T> {

        /* renamed from: h  reason: collision with root package name */
        public static final C0417a f18516h = new C0417a(null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f18517i = 8;

        /* renamed from: j  reason: collision with root package name */
        private static final Object f18518j = new Object();

        /* renamed from: c  reason: collision with root package name */
        private int f18519c;

        /* renamed from: d  reason: collision with root package name */
        private int f18520d;

        /* renamed from: e  reason: collision with root package name */
        private k0.b<t0.d0, Integer> f18521e;

        /* renamed from: f  reason: collision with root package name */
        private Object f18522f = f18518j;

        /* renamed from: g  reason: collision with root package name */
        private int f18523g;

        /* compiled from: DerivedState.kt */
        /* renamed from: j0.a0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0417a {
            private C0417a() {
            }

            public /* synthetic */ C0417a(qc.h hVar) {
                this();
            }

            public final Object a() {
                return a.f18518j;
            }
        }

        @Override // j0.b0.a
        public T a() {
            return (T) this.f18522f;
        }

        @Override // j0.b0.a
        public Object[] b() {
            Object[] g10;
            k0.b<t0.d0, Integer> bVar = this.f18521e;
            if (bVar == null || (g10 = bVar.g()) == null) {
                return new Object[0];
            }
            return g10;
        }

        @Override // t0.e0
        public void c(t0.e0 e0Var) {
            qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            a aVar = (a) e0Var;
            this.f18521e = aVar.f18521e;
            this.f18522f = aVar.f18522f;
            this.f18523g = aVar.f18523g;
        }

        @Override // t0.e0
        public t0.e0 d() {
            return new a();
        }

        public final Object j() {
            return this.f18522f;
        }

        public final k0.b<t0.d0, Integer> k() {
            return this.f18521e;
        }

        public final boolean l(b0<?> b0Var, t0.g gVar) {
            boolean z10;
            boolean z11;
            qc.q.i(b0Var, "derivedState");
            qc.q.i(gVar, "snapshot");
            synchronized (t0.l.G()) {
                z10 = false;
                if (this.f18519c == gVar.f()) {
                    if (this.f18520d == gVar.j()) {
                        z11 = false;
                    }
                }
                z11 = true;
            }
            if (this.f18522f != f18518j && (!z11 || this.f18523g == m(b0Var, gVar))) {
                z10 = true;
            }
            if (z10 && z11) {
                synchronized (t0.l.G()) {
                    this.f18519c = gVar.f();
                    this.f18520d = gVar.j();
                    dc.w wVar = dc.w.f13270a;
                }
            }
            return z10;
        }

        public final int m(b0<?> b0Var, t0.g gVar) {
            k0.b<t0.d0, Integer> bVar;
            t0.e0 E;
            qc.q.i(b0Var, "derivedState");
            qc.q.i(gVar, "snapshot");
            synchronized (t0.l.G()) {
                bVar = this.f18521e;
            }
            int i10 = 7;
            if (bVar != null) {
                k0.f<c0> b10 = y2.b();
                int o10 = b10.o();
                int i11 = 0;
                if (o10 > 0) {
                    c0[] n10 = b10.n();
                    int i12 = 0;
                    do {
                        n10[i12].b(b0Var);
                        i12++;
                    } while (i12 < o10);
                }
                try {
                    int h10 = bVar.h();
                    for (int i13 = 0; i13 < h10; i13++) {
                        Object obj = bVar.g()[i13];
                        qc.q.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        t0.d0 d0Var = (t0.d0) obj;
                        if (((Number) bVar.i()[i13]).intValue() == 1) {
                            if (d0Var instanceof a0) {
                                E = ((a0) d0Var).j(gVar);
                            } else {
                                E = t0.l.E(d0Var.e(), gVar);
                            }
                            i10 = (((i10 * 31) + c.a(E)) * 31) + E.f();
                        }
                    }
                    dc.w wVar = dc.w.f13270a;
                    int o11 = b10.o();
                    if (o11 > 0) {
                        c0[] n11 = b10.n();
                        do {
                            n11[i11].a(b0Var);
                            i11++;
                        } while (i11 < o11);
                    }
                } catch (Throwable th) {
                    int o12 = b10.o();
                    if (o12 > 0) {
                        c0[] n12 = b10.n();
                        do {
                            n12[i11].a(b0Var);
                            i11++;
                        } while (i11 < o12);
                    }
                    throw th;
                }
            }
            return i10;
        }

        public final void n(Object obj) {
            this.f18522f = obj;
        }

        public final void o(int i10) {
            this.f18523g = i10;
        }

        public final void p(int i10) {
            this.f18519c = i10;
        }

        public final void q(int i10) {
            this.f18520d = i10;
        }

        public final void r(k0.b<t0.d0, Integer> bVar) {
            this.f18521e = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DerivedState.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a0<T> f18524f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k0.b<t0.d0, Integer> f18525m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f18526p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a0<T> a0Var, k0.b<t0.d0, Integer> bVar, int i10) {
            super(1);
            this.f18524f = a0Var;
            this.f18525m = bVar;
            this.f18526p = i10;
        }

        public final void a(Object obj) {
            e3 e3Var;
            int i10;
            qc.q.i(obj, "it");
            if (obj != this.f18524f) {
                if (obj instanceof t0.d0) {
                    e3Var = z2.f18942a;
                    Object a10 = e3Var.a();
                    qc.q.f(a10);
                    int intValue = ((Number) a10).intValue();
                    k0.b<t0.d0, Integer> bVar = this.f18525m;
                    int i11 = intValue - this.f18526p;
                    Integer f10 = bVar.f(obj);
                    if (f10 != null) {
                        i10 = f10.intValue();
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    bVar.l(obj, Integer.valueOf(Math.min(i11, i10)));
                    return;
                }
                return;
            }
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(pc.a<? extends T> aVar, x2<T> x2Var) {
        qc.q.i(aVar, "calculation");
        this.f18513f = aVar;
        this.f18514m = x2Var;
        this.f18515p = new a<>();
    }

    private final a<T> m(a<T> aVar, t0.g gVar, boolean z10, pc.a<? extends T> aVar2) {
        e3 e3Var;
        int i10;
        e3 e3Var2;
        e3 e3Var3;
        g.a aVar3;
        e3 e3Var4;
        int i11;
        e3 e3Var5;
        e3 e3Var6;
        int i12 = 1;
        int i13 = 0;
        if (!aVar.l(this, gVar)) {
            e3Var = z2.f18942a;
            Integer num = (Integer) e3Var.a();
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            k0.b<t0.d0, Integer> bVar = new k0.b<>(i13, i12, null);
            k0.f<c0> b10 = y2.b();
            int o10 = b10.o();
            if (o10 > 0) {
                c0[] n10 = b10.n();
                int i14 = 0;
                do {
                    n10[i14].b(this);
                    i14++;
                } while (i14 < o10);
            }
            try {
                e3Var2 = z2.f18942a;
                e3Var2.b(Integer.valueOf(i10 + 1));
                T t10 = (T) t0.g.f23297e.d(new b(this, bVar, i10), null, aVar2);
                e3Var3 = z2.f18942a;
                e3Var3.b(Integer.valueOf(i10));
                int o11 = b10.o();
                if (o11 > 0) {
                    c0[] n11 = b10.n();
                    int i15 = 0;
                    do {
                        n11[i15].a(this);
                        i15++;
                    } while (i15 < o11);
                }
                synchronized (t0.l.G()) {
                    aVar3 = t0.g.f23297e;
                    t0.g b11 = aVar3.b();
                    if (aVar.j() != a.f18516h.a()) {
                        x2<T> c10 = c();
                        if (c10 == null || !c10.a(t10, (T) aVar.j())) {
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            aVar.r(bVar);
                            aVar.o(aVar.m(this, b11));
                            aVar.p(gVar.f());
                            aVar.q(gVar.j());
                        }
                    }
                    aVar = (a) t0.l.M(this.f18515p, this, b11);
                    aVar.r(bVar);
                    aVar.o(aVar.m(this, b11));
                    aVar.p(gVar.f());
                    aVar.q(gVar.j());
                    aVar.n(t10);
                }
                if (i10 == 0) {
                    aVar3.c();
                }
                return aVar;
            } finally {
                int o12 = b10.o();
                if (o12 > 0) {
                    c0[] n12 = b10.n();
                    do {
                        n12[i13].a(this);
                        i13++;
                    } while (i13 < o12);
                }
            }
        }
        if (z10) {
            k0.f<c0> b12 = y2.b();
            int o13 = b12.o();
            if (o13 > 0) {
                c0[] n13 = b12.n();
                int i16 = 0;
                do {
                    n13[i16].b(this);
                    i16++;
                } while (i16 < o13);
            }
            try {
                k0.b<t0.d0, Integer> k10 = aVar.k();
                e3Var4 = z2.f18942a;
                Integer num2 = (Integer) e3Var4.a();
                if (num2 != null) {
                    i11 = num2.intValue();
                } else {
                    i11 = 0;
                }
                if (k10 != null) {
                    int h10 = k10.h();
                    for (int i17 = 0; i17 < h10; i17++) {
                        Object obj = k10.g()[i17];
                        qc.q.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        int intValue = ((Number) k10.i()[i17]).intValue();
                        t0.d0 d0Var = (t0.d0) obj;
                        e3Var6 = z2.f18942a;
                        e3Var6.b(Integer.valueOf(intValue + i11));
                        pc.l<Object, dc.w> h11 = gVar.h();
                        if (h11 != null) {
                            h11.invoke(d0Var);
                        }
                    }
                }
                e3Var5 = z2.f18942a;
                e3Var5.b(Integer.valueOf(i11));
                dc.w wVar = dc.w.f13270a;
                int o14 = b12.o();
                if (o14 > 0) {
                    c0[] n14 = b12.n();
                    do {
                        n14[i13].a(this);
                        i13++;
                    } while (i13 < o14);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private final String r() {
        a aVar = (a) t0.l.D(this.f18515p);
        if (aVar.l(this, t0.g.f23297e.b())) {
            return String.valueOf(aVar.j());
        }
        return "<Not calculated>";
    }

    @Override // j0.b0
    public x2<T> c() {
        return this.f18514m;
    }

    @Override // t0.d0
    public t0.e0 e() {
        return this.f18515p;
    }

    @Override // t0.d0
    public /* synthetic */ t0.e0 f(t0.e0 e0Var, t0.e0 e0Var2, t0.e0 e0Var3) {
        return t0.c0.a(this, e0Var, e0Var2, e0Var3);
    }

    @Override // j0.g3
    public T getValue() {
        g.a aVar = t0.g.f23297e;
        pc.l<Object, dc.w> h10 = aVar.b().h();
        if (h10 != null) {
            h10.invoke(this);
        }
        return (T) m((a) t0.l.D(this.f18515p), aVar.b(), true, this.f18513f).j();
    }

    public final t0.e0 j(t0.g gVar) {
        qc.q.i(gVar, "snapshot");
        return m((a) t0.l.E(this.f18515p, gVar), gVar, false, this.f18513f);
    }

    @Override // t0.d0
    public void k(t0.e0 e0Var) {
        qc.q.i(e0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f18515p = (a) e0Var;
    }

    @Override // j0.b0
    public b0.a<T> q() {
        return m((a) t0.l.D(this.f18515p), t0.g.f23297e.b(), false, this.f18513f);
    }

    public String toString() {
        a aVar = (a) t0.l.D(this.f18515p);
        return "DerivedState(value=" + r() + ")@" + hashCode();
    }
}
