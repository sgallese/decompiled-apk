package n1;

import androidx.compose.ui.platform.b5;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.d3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n1.i1;
import n1.k1;
import n1.y0;
import p1.j0;
import p1.o0;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final p1.j0 f19907a;

    /* renamed from: b  reason: collision with root package name */
    private j0.p f19908b;

    /* renamed from: c  reason: collision with root package name */
    private k1 f19909c;

    /* renamed from: d  reason: collision with root package name */
    private int f19910d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<p1.j0, b> f19911e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Object, p1.j0> f19912f;

    /* renamed from: g  reason: collision with root package name */
    private final c f19913g;

    /* renamed from: h  reason: collision with root package name */
    private final a f19914h;

    /* renamed from: i  reason: collision with root package name */
    private pc.p<? super g1, ? super j2.b, ? extends j0> f19915i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Object, p1.j0> f19916j;

    /* renamed from: k  reason: collision with root package name */
    private final k1.a f19917k;

    /* renamed from: l  reason: collision with root package name */
    private int f19918l;

    /* renamed from: m  reason: collision with root package name */
    private int f19919m;

    /* renamed from: n  reason: collision with root package name */
    private final String f19920n;

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    private final class a implements g1, l0 {

        /* renamed from: f  reason: collision with root package name */
        private final /* synthetic */ c f19921f;

        /* renamed from: p  reason: collision with root package name */
        public pc.p<? super j1, ? super j2.b, ? extends j0> f19923p;

        /* renamed from: m  reason: collision with root package name */
        private long f19922m = j2.p.f19001b.a();

        /* renamed from: q  reason: collision with root package name */
        private long f19924q = j2.c.b(0, 0, 0, 0, 15, null);

        public a() {
            this.f19921f = b0.this.f19913g;
        }

        @Override // n1.g1
        public List<g0> J0(Object obj) {
            List<g0> i10;
            List<g0> E;
            p1.j0 j0Var = (p1.j0) b0.this.f19912f.get(obj);
            if (j0Var == null || (E = j0Var.E()) == null) {
                i10 = ec.t.i();
                return i10;
            }
            return E;
        }

        @Override // j2.e
        public long K(long j10) {
            return this.f19921f.K(j10);
        }

        @Override // j2.e
        public int K0(float f10) {
            return this.f19921f.K0(f10);
        }

        @Override // j2.e
        public long S0(long j10) {
            return this.f19921f.S0(j10);
        }

        @Override // j2.e
        public float T(long j10) {
            return this.f19921f.T(j10);
        }

        @Override // j2.e
        public float W0(long j10) {
            return this.f19921f.W0(j10);
        }

        @Override // j2.e
        public long c0(float f10) {
            return this.f19921f.c0(f10);
        }

        public void d(long j10) {
            this.f19924q = j10;
        }

        @Override // n1.l0
        public j0 e0(int i10, int i11, Map<n1.a, Integer> map, pc.l<? super y0.a, dc.w> lVar) {
            qc.q.i(map, "alignmentLines");
            qc.q.i(lVar, "placementBlock");
            return this.f19921f.e0(i10, i11, map, lVar);
        }

        public void f(pc.p<? super j1, ? super j2.b, ? extends j0> pVar) {
            qc.q.i(pVar, "<set-?>");
            this.f19923p = pVar;
        }

        public void g(long j10) {
            this.f19922m = j10;
        }

        @Override // j2.e
        public float getDensity() {
            return this.f19921f.getDensity();
        }

        @Override // n1.n
        public j2.r getLayoutDirection() {
            return this.f19921f.getLayoutDirection();
        }

        @Override // j2.e
        public float h0(int i10) {
            return this.f19921f.h0(i10);
        }

        @Override // j2.e
        public float j0(float f10) {
            return this.f19921f.j0(f10);
        }

        @Override // n1.g1
        public pc.p<j1, j2.b, j0> n0() {
            pc.p pVar = this.f19923p;
            if (pVar != null) {
                return pVar;
            }
            qc.q.z("lookaheadMeasurePolicy");
            return null;
        }

        @Override // j2.e
        public float p0() {
            return this.f19921f.p0();
        }

        @Override // n1.j1
        public /* synthetic */ List u0(Object obj, pc.p pVar) {
            return f1.a(this, obj, pVar);
        }

        @Override // j2.e
        public float v0(float f10) {
            return this.f19921f.v0(f10);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    private final class c implements j1 {

        /* renamed from: f  reason: collision with root package name */
        private j2.r f19931f = j2.r.Rtl;

        /* renamed from: m  reason: collision with root package name */
        private float f19932m;

        /* renamed from: p  reason: collision with root package name */
        private float f19933p;

        public c() {
        }

        @Override // j2.e
        public /* synthetic */ long K(long j10) {
            return j2.d.e(this, j10);
        }

        @Override // j2.e
        public /* synthetic */ int K0(float f10) {
            return j2.d.a(this, f10);
        }

        @Override // j2.e
        public /* synthetic */ long S0(long j10) {
            return j2.d.h(this, j10);
        }

        @Override // j2.e
        public /* synthetic */ float T(long j10) {
            return j2.d.b(this, j10);
        }

        @Override // j2.e
        public /* synthetic */ float W0(long j10) {
            return j2.d.f(this, j10);
        }

        @Override // j2.e
        public /* synthetic */ long c0(float f10) {
            return j2.d.i(this, f10);
        }

        public void d(float f10) {
            this.f19932m = f10;
        }

        @Override // n1.l0
        public /* synthetic */ j0 e0(int i10, int i11, Map map, pc.l lVar) {
            return k0.a(this, i10, i11, map, lVar);
        }

        public void f(float f10) {
            this.f19933p = f10;
        }

        public void g(j2.r rVar) {
            qc.q.i(rVar, "<set-?>");
            this.f19931f = rVar;
        }

        @Override // j2.e
        public float getDensity() {
            return this.f19932m;
        }

        @Override // n1.n
        public j2.r getLayoutDirection() {
            return this.f19931f;
        }

        @Override // j2.e
        public /* synthetic */ float h0(int i10) {
            return j2.d.d(this, i10);
        }

        @Override // j2.e
        public /* synthetic */ float j0(float f10) {
            return j2.d.c(this, f10);
        }

        @Override // j2.e
        public float p0() {
            return this.f19933p;
        }

        @Override // n1.j1
        public List<g0> u0(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            qc.q.i(pVar, "content");
            return b0.this.A(obj, pVar);
        }

        @Override // j2.e
        public /* synthetic */ float v0(float f10) {
            return j2.d.g(this, f10);
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class d extends j0.f {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ pc.p<j1, j2.b, j0> f19936c;

        /* compiled from: SubcomposeLayout.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j0 f19937a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b0 f19938b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f19939c;

            a(j0 j0Var, b0 b0Var, int i10) {
                this.f19937a = j0Var;
                this.f19938b = b0Var;
                this.f19939c = i10;
            }

            @Override // n1.j0
            public Map<n1.a, Integer> d() {
                return this.f19937a.d();
            }

            @Override // n1.j0
            public void e() {
                this.f19938b.f19910d = this.f19939c;
                this.f19937a.e();
                b0 b0Var = this.f19938b;
                b0Var.p(b0Var.f19910d);
            }

            @Override // n1.j0
            public int getHeight() {
                return this.f19937a.getHeight();
            }

            @Override // n1.j0
            public int getWidth() {
                return this.f19937a.getWidth();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.p<? super j1, ? super j2.b, ? extends j0> pVar, String str) {
            super(str);
            this.f19936c = pVar;
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            boolean z10;
            qc.q.i(l0Var, "$this$measure");
            qc.q.i(list, "measurables");
            b0.this.f19913g.g(l0Var.getLayoutDirection());
            b0.this.f19913g.d(l0Var.getDensity());
            b0.this.f19913g.f(l0Var.p0());
            if ((b0.this.f19907a.V() == j0.e.Measuring || b0.this.f19907a.V() == j0.e.LayingOut) && b0.this.f19907a.Z() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                b0.this.f19910d = 0;
                b0.this.f19914h.d(j10);
                j0 invoke = this.f19936c.invoke(b0.this.f19913g, j2.b.b(j10));
                int i10 = b0.this.f19910d;
                b0.this.f19914h.g(j2.q.a(invoke.getWidth(), invoke.getHeight()));
                return new a(invoke, b0.this, i10);
            }
            return b0.this.r().invoke(b0.this.f19914h, j2.b.b(j10));
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<g1, j2.b, j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f19940f = new e();

        e() {
            super(2);
        }

        public final j0 a(g1 g1Var, long j10) {
            qc.q.i(g1Var, "$this$null");
            return g1Var.n0().invoke(g1Var, j2.b.b(j10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ j0 invoke(g1 g1Var, j2.b bVar) {
            return a(g1Var, bVar.t());
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class f implements i1.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f19942b;

        f(Object obj) {
            this.f19942b = obj;
        }

        @Override // n1.i1.a
        public int a() {
            List<p1.j0> F;
            p1.j0 j0Var = (p1.j0) b0.this.f19916j.get(this.f19942b);
            if (j0Var != null && (F = j0Var.F()) != null) {
                return F.size();
            }
            return 0;
        }

        @Override // n1.i1.a
        public void b(int i10, long j10) {
            p1.j0 j0Var = (p1.j0) b0.this.f19916j.get(this.f19942b);
            if (j0Var != null && j0Var.H0()) {
                int size = j0Var.F().size();
                if (i10 >= 0 && i10 < size) {
                    if ((!j0Var.f()) != false) {
                        p1.j0 j0Var2 = b0.this.f19907a;
                        j0Var2.A = true;
                        p1.n0.b(j0Var).j(j0Var.F().get(i10), j10);
                        j0Var2.A = false;
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + size + ')');
            }
        }

        @Override // n1.i1.a
        public void dispose() {
            boolean z10;
            b0.this.t();
            p1.j0 j0Var = (p1.j0) b0.this.f19916j.remove(this.f19942b);
            if (j0Var != null) {
                boolean z11 = false;
                if (b0.this.f19919m > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int indexOf = b0.this.f19907a.K().indexOf(j0Var);
                    if (indexOf >= b0.this.f19907a.K().size() - b0.this.f19919m) {
                        z11 = true;
                    }
                    if (z11) {
                        b0.this.f19918l++;
                        b0 b0Var = b0.this;
                        b0Var.f19919m--;
                        int size = (b0.this.f19907a.K().size() - b0.this.f19919m) - b0.this.f19918l;
                        b0.this.u(indexOf, size, 1);
                        b0.this.p(size);
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f19943f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f19944m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(b bVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            super(2);
            this.f19943f = bVar;
            this.f19944m = pVar;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-34810602, i10, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:700)");
            }
            boolean a10 = this.f19943f.a();
            pc.p<j0.l, Integer, dc.w> pVar = this.f19944m;
            lVar.v(207, Boolean.valueOf(a10));
            boolean c10 = lVar.c(a10);
            if (a10) {
                pVar.invoke(lVar, 0);
            } else {
                lVar.o(c10);
            }
            lVar.d();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [qc.h, java.util.Set] */
    public b0(p1.j0 j0Var, k1 k1Var) {
        qc.q.i(j0Var, "root");
        qc.q.i(k1Var, "slotReusePolicy");
        this.f19907a = j0Var;
        this.f19909c = k1Var;
        this.f19911e = new LinkedHashMap();
        this.f19912f = new LinkedHashMap();
        this.f19913g = new c();
        this.f19914h = new a();
        this.f19915i = e.f19940f;
        this.f19916j = new LinkedHashMap();
        ?? r32 = 0;
        this.f19917k = new k1.a(r32, 1, r32);
        this.f19920n = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    private final void B(p1.j0 j0Var, Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        boolean z10;
        Map<p1.j0, b> map = this.f19911e;
        b bVar = map.get(j0Var);
        if (bVar == null) {
            bVar = new b(obj, n1.e.f19961a.a(), null, 4, null);
            map.put(j0Var, bVar);
        }
        b bVar2 = bVar;
        j0.o b10 = bVar2.b();
        if (b10 != null) {
            z10 = b10.r();
        } else {
            z10 = true;
        }
        if (bVar2.c() != pVar || z10 || bVar2.d()) {
            bVar2.h(pVar);
            C(j0Var, bVar2);
            bVar2.i(false);
        }
    }

    private final void C(p1.j0 j0Var, b bVar) {
        t0.g a10 = t0.g.f23297e.a();
        try {
            t0.g l10 = a10.l();
            try {
                p1.j0 j0Var2 = this.f19907a;
                j0Var2.A = true;
                pc.p<j0.l, Integer, dc.w> c10 = bVar.c();
                j0.o b10 = bVar.b();
                j0.p pVar = this.f19908b;
                if (pVar != null) {
                    bVar.g(D(b10, j0Var, pVar, q0.c.c(-34810602, true, new g(bVar, c10))));
                    j0Var2.A = false;
                    dc.w wVar = dc.w.f13270a;
                    return;
                }
                throw new IllegalStateException("parent composition reference not set".toString());
            } finally {
                a10.s(l10);
            }
        } finally {
            a10.d();
        }
    }

    private final j0.o D(j0.o oVar, p1.j0 j0Var, j0.p pVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar2) {
        if (oVar == null || oVar.k()) {
            oVar = b5.a(j0Var, pVar);
        }
        oVar.e(pVar2);
        return oVar;
    }

    private final p1.j0 E(Object obj) {
        int i10;
        if (this.f19918l == 0) {
            return null;
        }
        int size = this.f19907a.K().size() - this.f19919m;
        int i11 = size - this.f19918l;
        int i12 = size - 1;
        int i13 = i12;
        while (true) {
            if (i13 >= i11) {
                if (qc.q.d(s(i13), obj)) {
                    i10 = i13;
                    break;
                }
                i13--;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            while (true) {
                if (i12 >= i11) {
                    b bVar = this.f19911e.get(this.f19907a.K().get(i12));
                    qc.q.f(bVar);
                    b bVar2 = bVar;
                    if (this.f19909c.a(obj, bVar2.e())) {
                        bVar2.j(obj);
                        i13 = i12;
                        i10 = i13;
                        break;
                    }
                    i12--;
                } else {
                    i13 = i12;
                    break;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        if (i13 != i11) {
            u(i13, i11, 1);
        }
        this.f19918l--;
        p1.j0 j0Var = this.f19907a.K().get(i11);
        b bVar3 = this.f19911e.get(j0Var);
        qc.q.f(bVar3);
        b bVar4 = bVar3;
        bVar4.f(true);
        bVar4.i(true);
        t0.g.f23297e.g();
        return j0Var;
    }

    private final p1.j0 n(int i10) {
        p1.j0 j0Var = new p1.j0(true, 0, 2, null);
        p1.j0 j0Var2 = this.f19907a;
        j0Var2.A = true;
        this.f19907a.y0(i10, j0Var);
        j0Var2.A = false;
        return j0Var;
    }

    private final Object s(int i10) {
        b bVar = this.f19911e.get(this.f19907a.K().get(i10));
        qc.q.f(bVar);
        return bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10, int i11, int i12) {
        p1.j0 j0Var = this.f19907a;
        j0Var.A = true;
        this.f19907a.R0(i10, i11, i12);
        j0Var.A = false;
    }

    static /* synthetic */ void v(b0 b0Var, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 1;
        }
        b0Var.u(i10, i11, i12);
    }

    public final List<g0> A(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        boolean z10;
        boolean z11;
        qc.q.i(pVar, "content");
        t();
        j0.e V = this.f19907a.V();
        j0.e eVar = j0.e.Measuring;
        boolean z12 = false;
        if (V != eVar && V != j0.e.LayingOut && V != j0.e.LookaheadMeasuring && V != j0.e.LookaheadLayingOut) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            Map<Object, p1.j0> map = this.f19912f;
            p1.j0 j0Var = map.get(obj);
            if (j0Var == null) {
                j0Var = this.f19916j.remove(obj);
                if (j0Var != null) {
                    int i10 = this.f19919m;
                    if (i10 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.f19919m = i10 - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    j0Var = E(obj);
                    if (j0Var == null) {
                        j0Var = n(this.f19910d);
                    }
                }
                map.put(obj, j0Var);
            }
            p1.j0 j0Var2 = j0Var;
            int indexOf = this.f19907a.K().indexOf(j0Var2);
            int i11 = this.f19910d;
            if (indexOf >= i11) {
                z12 = true;
            }
            if (z12) {
                if (i11 != indexOf) {
                    v(this, indexOf, i11, 0, 4, null);
                }
                this.f19910d++;
                B(j0Var2, obj, pVar);
                if (V != eVar && V != j0.e.LayingOut) {
                    return j0Var2.D();
                }
                return j0Var2.E();
            }
            throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    public final i0 m(pc.p<? super j1, ? super j2.b, ? extends j0> pVar) {
        qc.q.i(pVar, "block");
        this.f19914h.f(pVar);
        return new d(pVar, this.f19920n);
    }

    public final void o() {
        p1.j0 j0Var = this.f19907a;
        j0Var.A = true;
        Iterator<T> it = this.f19911e.values().iterator();
        while (it.hasNext()) {
            j0.o b10 = ((b) it.next()).b();
            if (b10 != null) {
                b10.dispose();
            }
        }
        this.f19907a.Z0();
        j0Var.A = false;
        this.f19911e.clear();
        this.f19912f.clear();
        this.f19919m = 0;
        this.f19918l = 0;
        this.f19916j.clear();
        t();
    }

    public final void p(int i10) {
        boolean z10 = false;
        this.f19918l = 0;
        int size = (this.f19907a.K().size() - this.f19919m) - 1;
        if (i10 <= size) {
            this.f19917k.clear();
            if (i10 <= size) {
                int i11 = i10;
                while (true) {
                    this.f19917k.add(s(i11));
                    if (i11 == size) {
                        break;
                    }
                    i11++;
                }
            }
            this.f19909c.b(this.f19917k);
            t0.g a10 = t0.g.f23297e.a();
            try {
                t0.g l10 = a10.l();
                boolean z11 = false;
                while (size >= i10) {
                    try {
                        p1.j0 j0Var = this.f19907a.K().get(size);
                        b bVar = this.f19911e.get(j0Var);
                        qc.q.f(bVar);
                        b bVar2 = bVar;
                        Object e10 = bVar2.e();
                        if (this.f19917k.contains(e10)) {
                            o0.b b02 = j0Var.b0();
                            j0.g gVar = j0.g.NotUsed;
                            b02.y1(gVar);
                            o0.a Y = j0Var.Y();
                            if (Y != null) {
                                Y.w1(gVar);
                            }
                            this.f19918l++;
                            if (bVar2.a()) {
                                bVar2.f(false);
                                z11 = true;
                            }
                        } else {
                            p1.j0 j0Var2 = this.f19907a;
                            j0Var2.A = true;
                            this.f19911e.remove(j0Var);
                            j0.o b10 = bVar2.b();
                            if (b10 != null) {
                                b10.dispose();
                            }
                            this.f19907a.a1(size, 1);
                            j0Var2.A = false;
                        }
                        this.f19912f.remove(e10);
                        size--;
                    } finally {
                        a10.s(l10);
                    }
                }
                dc.w wVar = dc.w.f13270a;
                a10.d();
                z10 = z11;
            } catch (Throwable th) {
                a10.d();
                throw th;
            }
        }
        if (z10) {
            t0.g.f23297e.g();
        }
        t();
    }

    public final void q() {
        Iterator<Map.Entry<p1.j0, b>> it = this.f19911e.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().i(true);
        }
        if (!this.f19907a.c0()) {
            p1.j0.j1(this.f19907a, false, false, 3, null);
        }
    }

    public final pc.p<g1, j2.b, j0> r() {
        return this.f19915i;
    }

    public final void t() {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (this.f19911e.size() == this.f19907a.K().size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((this.f19907a.K().size() - this.f19918l) - this.f19919m >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.f19916j.size() != this.f19919m) {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
                throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f19919m + ". Map size " + this.f19916j.size()).toString());
            }
            throw new IllegalArgumentException(("Incorrect state. Total children " + this.f19907a.K().size() + ". Reusable children " + this.f19918l + ". Precomposed children " + this.f19919m).toString());
        }
        throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + this.f19911e.size() + ") and the children count on the SubcomposeLayout (" + this.f19907a.K().size() + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
    }

    public final i1.a w(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        t();
        if (!this.f19912f.containsKey(obj)) {
            Map<Object, p1.j0> map = this.f19916j;
            p1.j0 j0Var = map.get(obj);
            if (j0Var == null) {
                j0Var = E(obj);
                if (j0Var != null) {
                    u(this.f19907a.K().indexOf(j0Var), this.f19907a.K().size(), 1);
                    this.f19919m++;
                } else {
                    j0Var = n(this.f19907a.K().size());
                    this.f19919m++;
                }
                map.put(obj, j0Var);
            }
            B(j0Var, obj, pVar);
        }
        return new f(obj);
    }

    public final void x(j0.p pVar) {
        this.f19908b = pVar;
    }

    public final void y(pc.p<? super g1, ? super j2.b, ? extends j0> pVar) {
        qc.q.i(pVar, "<set-?>");
        this.f19915i = pVar;
    }

    public final void z(k1 k1Var) {
        qc.q.i(k1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.f19909c != k1Var) {
            this.f19909c = k1Var;
            p(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Object f19926a;

        /* renamed from: b  reason: collision with root package name */
        private pc.p<? super j0.l, ? super Integer, dc.w> f19927b;

        /* renamed from: c  reason: collision with root package name */
        private j0.o f19928c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f19929d;

        /* renamed from: e  reason: collision with root package name */
        private final j0.j1 f19930e;

        public b(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.o oVar) {
            j0.j1 e10;
            qc.q.i(pVar, "content");
            this.f19926a = obj;
            this.f19927b = pVar;
            this.f19928c = oVar;
            e10 = d3.e(Boolean.TRUE, null, 2, null);
            this.f19930e = e10;
        }

        public final boolean a() {
            return ((Boolean) this.f19930e.getValue()).booleanValue();
        }

        public final j0.o b() {
            return this.f19928c;
        }

        public final pc.p<j0.l, Integer, dc.w> c() {
            return this.f19927b;
        }

        public final boolean d() {
            return this.f19929d;
        }

        public final Object e() {
            return this.f19926a;
        }

        public final void f(boolean z10) {
            this.f19930e.setValue(Boolean.valueOf(z10));
        }

        public final void g(j0.o oVar) {
            this.f19928c = oVar;
        }

        public final void h(pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            qc.q.i(pVar, "<set-?>");
            this.f19927b = pVar;
        }

        public final void i(boolean z10) {
            this.f19929d = z10;
        }

        public final void j(Object obj) {
            this.f19926a = obj;
        }

        public /* synthetic */ b(Object obj, pc.p pVar, j0.o oVar, int i10, qc.h hVar) {
            this(obj, pVar, (i10 & 4) != 0 ? null : oVar);
        }
    }
}
