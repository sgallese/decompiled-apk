package p1;

import java.util.List;
import java.util.Map;
import n1.y0;
import p1.j0;

/* compiled from: LayoutNodeLayoutDelegate.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final j0 f20859a;

    /* renamed from: b  reason: collision with root package name */
    private j0.e f20860b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20861c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20862d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20863e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20864f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20865g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20866h;

    /* renamed from: i  reason: collision with root package name */
    private int f20867i;

    /* renamed from: j  reason: collision with root package name */
    private int f20868j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20869k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20870l;

    /* renamed from: m  reason: collision with root package name */
    private int f20871m;

    /* renamed from: n  reason: collision with root package name */
    private final b f20872n;

    /* renamed from: o  reason: collision with root package name */
    private a f20873o;

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public final class a extends n1.y0 implements n1.g0, p1.b {
        private float B;
        private pc.l<? super androidx.compose.ui.graphics.d, dc.w> C;
        private boolean D;
        private boolean H;

        /* renamed from: s  reason: collision with root package name */
        private boolean f20874s;

        /* renamed from: w  reason: collision with root package name */
        private boolean f20878w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f20879x;

        /* renamed from: y  reason: collision with root package name */
        private boolean f20880y;

        /* renamed from: z  reason: collision with root package name */
        private j2.b f20881z;

        /* renamed from: t  reason: collision with root package name */
        private int f20875t = Integer.MAX_VALUE;

        /* renamed from: u  reason: collision with root package name */
        private int f20876u = Integer.MAX_VALUE;

        /* renamed from: v  reason: collision with root package name */
        private j0.g f20877v = j0.g.NotUsed;
        private long A = j2.l.f18992b.a();
        private final p1.a E = new q0(this);
        private final k0.f<a> F = new k0.f<>(new a[16], 0);
        private boolean G = true;
        private boolean I = true;
        private Object J = i1().A();

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* renamed from: p1.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0469a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20882a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f20883b;

            static {
                int[] iArr = new int[j0.e.values().length];
                try {
                    iArr[j0.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j0.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j0.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[j0.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f20882a = iArr;
                int[] iArr2 = new int[j0.g.values().length];
                try {
                    iArr2[j0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[j0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f20883b = iArr2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.a<dc.w> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ s0 f20885m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            /* renamed from: p1.o0$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0470a extends qc.r implements pc.l<p1.b, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                public static final C0470a f20886f = new C0470a();

                C0470a() {
                    super(1);
                }

                public final void a(p1.b bVar) {
                    qc.q.i(bVar, "child");
                    bVar.d().t(false);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                    a(bVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            /* renamed from: p1.o0$a$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0471b extends qc.r implements pc.l<p1.b, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                public static final C0471b f20887f = new C0471b();

                C0471b() {
                    super(1);
                }

                public final void a(p1.b bVar) {
                    qc.q.i(bVar, "child");
                    bVar.d().q(bVar.d().l());
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                    a(bVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(s0 s0Var) {
                super(0);
                this.f20885m = s0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a.this.e1();
                a.this.I(C0470a.f20886f);
                this.f20885m.g1().e();
                a.this.b1();
                a.this.I(C0471b.f20887f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ o0 f20888f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f20889m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(o0 o0Var, long j10) {
                super(0);
                this.f20888f = o0Var;
                this.f20889m = j10;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                y0.a.C0453a c0453a = y0.a.f20041a;
                o0 o0Var = this.f20888f;
                long j10 = this.f20889m;
                s0 P1 = o0Var.F().P1();
                qc.q.f(P1);
                y0.a.p(c0453a, P1, j10, 0.0f, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<p1.b, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final d f20890f = new d();

            d() {
                super(1);
            }

            public final void a(p1.b bVar) {
                qc.q.i(bVar, "it");
                bVar.d().u(false);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                a(bVar);
                return dc.w.f13270a;
            }
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b1() {
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    a C = n10[i10].T().C();
                    qc.q.f(C);
                    int i11 = C.f20875t;
                    int i12 = C.f20876u;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        C.n1();
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e1() {
            int i10 = 0;
            o0.this.f20867i = 0;
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                do {
                    a C = n10[i10].T().C();
                    qc.q.f(C);
                    C.f20875t = C.f20876u;
                    C.f20876u = Integer.MAX_VALUE;
                    if (C.f20877v == j0.g.InLayoutBlock) {
                        C.f20877v = j0.g.NotUsed;
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void m1() {
            boolean f10 = f();
            y1(true);
            int i10 = 0;
            if (!f10 && o0.this.B()) {
                j0.f1(o0.this.f20859a, true, false, 2, null);
            }
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                do {
                    j0 j0Var = n10[i10];
                    if (j0Var.m0() != Integer.MAX_VALUE) {
                        a Y = j0Var.Y();
                        qc.q.f(Y);
                        Y.m1();
                        j0Var.k1(j0Var);
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void n1() {
            if (f()) {
                int i10 = 0;
                y1(false);
                k0.f<j0> t02 = o0.this.f20859a.t0();
                int o10 = t02.o();
                if (o10 > 0) {
                    j0[] n10 = t02.n();
                    do {
                        a C = n10[i10].T().C();
                        qc.q.f(C);
                        C.n1();
                        i10++;
                    } while (i10 < o10);
                }
            }
        }

        private final void p1() {
            j0 j0Var = o0.this.f20859a;
            o0 o0Var = o0.this;
            k0.f<j0> t02 = j0Var.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    j0 j0Var2 = n10[i10];
                    if (j0Var2.X() && j0Var2.f0() == j0.g.InMeasureBlock) {
                        a C = j0Var2.T().C();
                        qc.q.f(C);
                        j2.b g12 = g1();
                        qc.q.f(g12);
                        if (C.t1(g12.t())) {
                            j0.f1(o0Var.f20859a, false, false, 3, null);
                        }
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void q1() {
            j0.g gVar;
            j0.f1(o0.this.f20859a, false, false, 3, null);
            j0 l02 = o0.this.f20859a.l0();
            if (l02 != null && o0.this.f20859a.S() == j0.g.NotUsed) {
                j0 j0Var = o0.this.f20859a;
                int i10 = C0469a.f20882a[l02.V().ordinal()];
                if (i10 != 2) {
                    if (i10 != 3) {
                        gVar = l02.S();
                    } else {
                        gVar = j0.g.InLayoutBlock;
                    }
                } else {
                    gVar = j0.g.InMeasureBlock;
                }
                j0Var.q1(gVar);
            }
        }

        private final void z1(j0 j0Var) {
            boolean z10;
            j0.g gVar;
            j0 l02 = j0Var.l0();
            if (l02 != null) {
                if (this.f20877v != j0.g.NotUsed && !j0Var.C()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i10 = C0469a.f20882a[l02.V().ordinal()];
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3 && i10 != 4) {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l02.V());
                        }
                        gVar = j0.g.InLayoutBlock;
                    } else {
                        gVar = j0.g.InMeasureBlock;
                    }
                    this.f20877v = gVar;
                    return;
                }
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            this.f20877v = j0.g.NotUsed;
        }

        @Override // n1.y0, n1.m
        public Object A() {
            return this.J;
        }

        public final boolean A1() {
            if (A() == null) {
                s0 P1 = o0.this.F().P1();
                qc.q.f(P1);
                if (P1.A() == null) {
                    return false;
                }
            }
            if (!this.I) {
                return false;
            }
            this.I = false;
            s0 P12 = o0.this.F().P1();
            qc.q.f(P12);
            this.J = P12.A();
            return true;
        }

        @Override // n1.n0
        public int G(n1.a aVar) {
            j0.e eVar;
            qc.q.i(aVar, "alignmentLine");
            j0 l02 = o0.this.f20859a.l0();
            j0.e eVar2 = null;
            if (l02 != null) {
                eVar = l02.V();
            } else {
                eVar = null;
            }
            if (eVar == j0.e.LookaheadMeasuring) {
                d().u(true);
            } else {
                j0 l03 = o0.this.f20859a.l0();
                if (l03 != null) {
                    eVar2 = l03.V();
                }
                if (eVar2 == j0.e.LookaheadLayingOut) {
                    d().t(true);
                }
            }
            this.f20878w = true;
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            int G = P1.G(aVar);
            this.f20878w = false;
            return G;
        }

        @Override // p1.b
        public void I(pc.l<? super p1.b, dc.w> lVar) {
            qc.q.i(lVar, "block");
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    p1.b z10 = n10[i10].T().z();
                    qc.q.f(z10);
                    lVar.invoke(z10);
                    i10++;
                } while (i10 < o10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n1.y0
        public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            o0.this.f20860b = j0.e.LookaheadLayingOut;
            this.f20879x = true;
            if (!j2.l.i(j10, this.A)) {
                if (o0.this.s() || o0.this.t()) {
                    o0.this.f20865g = true;
                }
                o1();
            }
            i1 b10 = n0.b(o0.this.f20859a);
            if (!o0.this.A() && f()) {
                s1();
            } else {
                o0.this.T(false);
                d().r(false);
                k1.c(b10.getSnapshotObserver(), o0.this.f20859a, false, new c(o0.this, j10), 2, null);
            }
            this.A = j10;
            this.B = f10;
            this.C = lVar;
            o0.this.f20860b = j0.e.Idle;
        }

        @Override // p1.b
        public void R() {
            this.H = true;
            d().o();
            if (o0.this.A()) {
                p1();
            }
            s0 P1 = o().P1();
            qc.q.f(P1);
            if (o0.this.f20866h || (!this.f20878w && !P1.k1() && o0.this.A())) {
                o0.this.f20865g = false;
                j0.e y10 = o0.this.y();
                o0.this.f20860b = j0.e.LookaheadLayingOut;
                i1 b10 = n0.b(o0.this.f20859a);
                o0.this.U(false);
                k1.e(b10.getSnapshotObserver(), o0.this.f20859a, false, new b(P1), 2, null);
                o0.this.f20860b = y10;
                if (o0.this.t() && P1.k1()) {
                    requestLayout();
                }
                o0.this.f20866h = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.H = false;
        }

        @Override // p1.b
        public void Y() {
            j0.f1(o0.this.f20859a, false, false, 3, null);
        }

        @Override // n1.m
        public int a0(int i10) {
            q1();
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.a0(i10);
        }

        @Override // p1.b
        public p1.a d() {
            return this.E;
        }

        @Override // p1.b
        public boolean f() {
            return this.D;
        }

        public final List<a> f1() {
            o0.this.f20859a.F();
            if (this.G) {
                j0 j0Var = o0.this.f20859a;
                k0.f<a> fVar = this.F;
                k0.f<j0> t02 = j0Var.t0();
                int o10 = t02.o();
                if (o10 > 0) {
                    j0[] n10 = t02.n();
                    int i10 = 0;
                    do {
                        j0 j0Var2 = n10[i10];
                        if (fVar.o() <= i10) {
                            a C = j0Var2.T().C();
                            qc.q.f(C);
                            fVar.d(C);
                        } else {
                            a C2 = j0Var2.T().C();
                            qc.q.f(C2);
                            fVar.A(i10, C2);
                        }
                        i10++;
                    } while (i10 < o10);
                }
                fVar.y(j0Var.F().size(), fVar.o());
                this.G = false;
                return this.F.h();
            }
            return this.F.h();
        }

        @Override // n1.m
        public int g(int i10) {
            q1();
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.g(i10);
        }

        public final j2.b g1() {
            return this.f20881z;
        }

        public final boolean h1() {
            return this.H;
        }

        public final b i1() {
            return o0.this.D();
        }

        @Override // p1.b
        public Map<n1.a, Integer> j() {
            if (!this.f20878w) {
                if (o0.this.y() == j0.e.LookaheadMeasuring) {
                    d().s(true);
                    if (d().g()) {
                        o0.this.L();
                    }
                } else {
                    d().r(true);
                }
            }
            s0 P1 = o().P1();
            if (P1 != null) {
                P1.n1(true);
            }
            R();
            s0 P12 = o().P1();
            if (P12 != null) {
                P12.n1(false);
            }
            return d().h();
        }

        public final j0.g j1() {
            return this.f20877v;
        }

        public final void k1(boolean z10) {
            j0 l02;
            j0 l03 = o0.this.f20859a.l0();
            j0.g S = o0.this.f20859a.S();
            if (l03 != null && S != j0.g.NotUsed) {
                while (l03.S() == S && (l02 = l03.l0()) != null) {
                    l03 = l02;
                }
                int i10 = C0469a.f20883b[S.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (l03.Z() != null) {
                            l03.c1(z10);
                            return;
                        } else {
                            l03.g1(z10);
                            return;
                        }
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                } else if (l03.Z() != null) {
                    j0.f1(l03, z10, false, 2, null);
                } else {
                    j0.j1(l03, z10, false, 2, null);
                }
            }
        }

        public final void l1() {
            this.I = true;
        }

        @Override // n1.y0
        public int m0() {
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.m0();
        }

        @Override // p1.b
        public x0 o() {
            return o0.this.f20859a.O();
        }

        public final void o1() {
            k0.f<j0> t02;
            int o10;
            boolean z10;
            if (o0.this.r() > 0 && (o10 = (t02 = o0.this.f20859a.t0()).o()) > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    j0 j0Var = n10[i10];
                    o0 T = j0Var.T();
                    if (!T.t() && !T.s()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && !T.x()) {
                        j0.d1(j0Var, false, 1, null);
                    }
                    a C = T.C();
                    if (C != null) {
                        C.o1();
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        @Override // p1.b
        public p1.b p() {
            o0 T;
            j0 l02 = o0.this.f20859a.l0();
            if (l02 != null && (T = l02.T()) != null) {
                return T.z();
            }
            return null;
        }

        @Override // n1.y0
        public int q0() {
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.q0();
        }

        public final void r1() {
            this.f20876u = Integer.MAX_VALUE;
            this.f20875t = Integer.MAX_VALUE;
            y1(false);
        }

        @Override // p1.b
        public void requestLayout() {
            j0.d1(o0.this.f20859a, false, 1, null);
        }

        @Override // n1.m
        public int s(int i10) {
            q1();
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.s(i10);
        }

        public final void s1() {
            j0 l02 = o0.this.f20859a.l0();
            if (!f()) {
                m1();
            }
            boolean z10 = false;
            if (l02 != null) {
                if (!this.f20874s && (l02.V() == j0.e.LayingOut || l02.V() == j0.e.LookaheadLayingOut)) {
                    if (this.f20876u == Integer.MAX_VALUE) {
                        z10 = true;
                    }
                    if (z10) {
                        this.f20876u = l02.T().f20867i;
                        l02.T().f20867i++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.f20876u = 0;
            }
            R();
        }

        @Override // n1.m
        public int t(int i10) {
            q1();
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            return P1.t(i10);
        }

        public final boolean t1(long j10) {
            boolean z10;
            boolean z11;
            boolean g10;
            j0 l02 = o0.this.f20859a.l0();
            j0 j0Var = o0.this.f20859a;
            if (!o0.this.f20859a.C() && (l02 == null || !l02.C())) {
                z10 = false;
            } else {
                z10 = true;
            }
            j0Var.n1(z10);
            if (!o0.this.f20859a.X()) {
                j2.b bVar = this.f20881z;
                if (bVar == null) {
                    g10 = false;
                } else {
                    g10 = j2.b.g(bVar.t(), j10);
                }
                if (g10) {
                    i1 k02 = o0.this.f20859a.k0();
                    if (k02 != null) {
                        k02.b(o0.this.f20859a, true);
                    }
                    o0.this.f20859a.m1();
                    return false;
                }
            }
            this.f20881z = j2.b.b(j10);
            d().s(false);
            I(d.f20890f);
            this.f20880y = true;
            s0 P1 = o0.this.F().P1();
            if (P1 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long a10 = j2.q.a(P1.A0(), P1.l0());
                o0.this.P(j10);
                T0(j2.q.a(P1.A0(), P1.l0()));
                if (j2.p.g(a10) != P1.A0() || j2.p.f(a10) != P1.l0()) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null".toString());
        }

        public final void u1() {
            try {
                this.f20874s = true;
                if (this.f20879x) {
                    Q0(this.A, 0.0f, null);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f20874s = false;
            }
        }

        public final void v1(boolean z10) {
            this.G = z10;
        }

        @Override // n1.g0
        public n1.y0 w(long j10) {
            z1(o0.this.f20859a);
            if (o0.this.f20859a.S() == j0.g.NotUsed) {
                o0.this.f20859a.u();
            }
            t1(j10);
            return this;
        }

        public final void w1(j0.g gVar) {
            qc.q.i(gVar, "<set-?>");
            this.f20877v = gVar;
        }

        public final void x1(int i10) {
            this.f20876u = i10;
        }

        public void y1(boolean z10) {
            this.D = z10;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public final class b extends n1.y0 implements n1.g0, p1.b {
        private pc.l<? super androidx.compose.ui.graphics.d, dc.w> A;
        private float B;
        private Object D;
        private boolean E;
        private boolean I;
        private float J;

        /* renamed from: s  reason: collision with root package name */
        private boolean f20891s;

        /* renamed from: v  reason: collision with root package name */
        private boolean f20894v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f20895w;

        /* renamed from: y  reason: collision with root package name */
        private boolean f20897y;

        /* renamed from: t  reason: collision with root package name */
        private int f20892t = Integer.MAX_VALUE;

        /* renamed from: u  reason: collision with root package name */
        private int f20893u = Integer.MAX_VALUE;

        /* renamed from: x  reason: collision with root package name */
        private j0.g f20896x = j0.g.NotUsed;

        /* renamed from: z  reason: collision with root package name */
        private long f20898z = j2.l.f18992b.a();
        private boolean C = true;
        private final p1.a F = new k0(this);
        private final k0.f<b> G = new k0.f<>(new b[16], 0);
        private boolean H = true;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20899a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f20900b;

            static {
                int[] iArr = new int[j0.e.values().length];
                try {
                    iArr[j0.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j0.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20899a = iArr;
                int[] iArr2 = new int[j0.g.values().length];
                try {
                    iArr2[j0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[j0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f20900b = iArr2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* renamed from: p1.o0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0472b extends qc.r implements pc.a<dc.w> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ j0 f20902m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            /* renamed from: p1.o0$b$b$a */
            /* loaded from: classes.dex */
            public static final class a extends qc.r implements pc.l<p1.b, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                public static final a f20903f = new a();

                a() {
                    super(1);
                }

                public final void a(p1.b bVar) {
                    qc.q.i(bVar, "it");
                    bVar.d().t(false);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                    a(bVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LayoutNodeLayoutDelegate.kt */
            /* renamed from: p1.o0$b$b$b  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0473b extends qc.r implements pc.l<p1.b, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                public static final C0473b f20904f = new C0473b();

                C0473b() {
                    super(1);
                }

                public final void a(p1.b bVar) {
                    qc.q.i(bVar, "it");
                    bVar.d().q(bVar.d().l());
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                    a(bVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0472b(j0 j0Var) {
                super(0);
                this.f20902m = j0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                b.this.e1();
                b.this.I(a.f20903f);
                this.f20902m.O().g1().e();
                b.this.b1();
                b.this.I(C0473b.f20904f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class c extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ pc.l<androidx.compose.ui.graphics.d, dc.w> f20905f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ o0 f20906m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ long f20907p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ float f20908q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar, o0 o0Var, long j10, float f10) {
                super(0);
                this.f20905f = lVar;
                this.f20906m = o0Var;
                this.f20907p = j10;
                this.f20908q = f10;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                y0.a.C0453a c0453a = y0.a.f20041a;
                pc.l<androidx.compose.ui.graphics.d, dc.w> lVar = this.f20905f;
                o0 o0Var = this.f20906m;
                long j10 = this.f20907p;
                float f10 = this.f20908q;
                if (lVar == null) {
                    c0453a.o(o0Var.F(), j10, f10);
                } else {
                    c0453a.y(o0Var.F(), j10, f10, lVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LayoutNodeLayoutDelegate.kt */
        /* loaded from: classes.dex */
        public static final class d extends qc.r implements pc.l<p1.b, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final d f20909f = new d();

            d() {
                super(1);
            }

            public final void a(p1.b bVar) {
                qc.q.i(bVar, "it");
                bVar.d().u(false);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(p1.b bVar) {
                a(bVar);
                return dc.w.f13270a;
            }
        }

        public b() {
        }

        private final void A1(j0 j0Var) {
            boolean z10;
            j0.g gVar;
            j0 l02 = j0Var.l0();
            if (l02 != null) {
                if (this.f20896x != j0.g.NotUsed && !j0Var.C()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    int i10 = a.f20899a[l02.V().ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            gVar = j0.g.InLayoutBlock;
                        } else {
                            throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + l02.V());
                        }
                    } else {
                        gVar = j0.g.InMeasureBlock;
                    }
                    this.f20896x = gVar;
                    return;
                }
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()".toString());
            }
            this.f20896x = j0.g.NotUsed;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b1() {
            j0 j0Var = o0.this.f20859a;
            k0.f<j0> t02 = j0Var.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    j0 j0Var2 = n10[i10];
                    if (j0Var2.b0().f20892t != j0Var2.m0()) {
                        j0Var.U0();
                        j0Var.B0();
                        if (j0Var2.m0() == Integer.MAX_VALUE) {
                            j0Var2.b0().o1();
                        }
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e1() {
            int i10 = 0;
            o0.this.f20868j = 0;
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                do {
                    b b02 = n10[i10].b0();
                    b02.f20892t = b02.f20893u;
                    b02.f20893u = Integer.MAX_VALUE;
                    if (b02.f20896x == j0.g.InLayoutBlock) {
                        b02.f20896x = j0.g.NotUsed;
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void n1() {
            boolean f10 = f();
            z1(true);
            j0 j0Var = o0.this.f20859a;
            int i10 = 0;
            if (!f10) {
                if (j0Var.c0()) {
                    j0.j1(j0Var, true, false, 2, null);
                } else if (j0Var.X()) {
                    j0.f1(j0Var, true, false, 2, null);
                }
            }
            x0 U1 = j0Var.O().U1();
            for (x0 j02 = j0Var.j0(); !qc.q.d(j02, U1) && j02 != null; j02 = j02.U1()) {
                if (j02.M1()) {
                    j02.e2();
                }
            }
            k0.f<j0> t02 = j0Var.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                do {
                    j0 j0Var2 = n10[i10];
                    if (j0Var2.m0() != Integer.MAX_VALUE) {
                        j0Var2.b0().n1();
                        j0Var.k1(j0Var2);
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void o1() {
            if (f()) {
                int i10 = 0;
                z1(false);
                k0.f<j0> t02 = o0.this.f20859a.t0();
                int o10 = t02.o();
                if (o10 > 0) {
                    j0[] n10 = t02.n();
                    do {
                        n10[i10].b0().o1();
                        i10++;
                    } while (i10 < o10);
                }
            }
        }

        private final void q1() {
            j0 j0Var = o0.this.f20859a;
            o0 o0Var = o0.this;
            k0.f<j0> t02 = j0Var.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    j0 j0Var2 = n10[i10];
                    if (j0Var2.c0() && j0Var2.e0() == j0.g.InMeasureBlock && j0.Y0(j0Var2, null, 1, null)) {
                        j0.j1(o0Var.f20859a, false, false, 3, null);
                    }
                    i10++;
                } while (i10 < o10);
            }
        }

        private final void r1() {
            j0.g gVar;
            j0.j1(o0.this.f20859a, false, false, 3, null);
            j0 l02 = o0.this.f20859a.l0();
            if (l02 != null && o0.this.f20859a.S() == j0.g.NotUsed) {
                j0 j0Var = o0.this.f20859a;
                int i10 = a.f20899a[l02.V().ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        gVar = l02.S();
                    } else {
                        gVar = j0.g.InLayoutBlock;
                    }
                } else {
                    gVar = j0.g.InMeasureBlock;
                }
                j0Var.q1(gVar);
            }
        }

        private final void u1(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            o0.this.f20860b = j0.e.LayingOut;
            this.f20898z = j10;
            this.B = f10;
            this.A = lVar;
            this.f20895w = true;
            i1 b10 = n0.b(o0.this.f20859a);
            if (!o0.this.x() && f()) {
                o0.this.F().s2(j10, f10, lVar);
                t1();
            } else {
                d().r(false);
                o0.this.T(false);
                b10.getSnapshotObserver().b(o0.this.f20859a, false, new c(lVar, o0.this, j10, f10));
            }
            o0.this.f20860b = j0.e.Idle;
        }

        @Override // n1.y0, n1.m
        public Object A() {
            return this.D;
        }

        public final boolean B1() {
            if ((A() == null && o0.this.F().A() == null) || !this.C) {
                return false;
            }
            this.C = false;
            this.D = o0.this.F().A();
            return true;
        }

        @Override // n1.n0
        public int G(n1.a aVar) {
            j0.e eVar;
            qc.q.i(aVar, "alignmentLine");
            j0 l02 = o0.this.f20859a.l0();
            j0.e eVar2 = null;
            if (l02 != null) {
                eVar = l02.V();
            } else {
                eVar = null;
            }
            if (eVar == j0.e.Measuring) {
                d().u(true);
            } else {
                j0 l03 = o0.this.f20859a.l0();
                if (l03 != null) {
                    eVar2 = l03.V();
                }
                if (eVar2 == j0.e.LayingOut) {
                    d().t(true);
                }
            }
            this.f20897y = true;
            int G = o0.this.F().G(aVar);
            this.f20897y = false;
            return G;
        }

        @Override // p1.b
        public void I(pc.l<? super p1.b, dc.w> lVar) {
            qc.q.i(lVar, "block");
            k0.f<j0> t02 = o0.this.f20859a.t0();
            int o10 = t02.o();
            if (o10 > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    lVar.invoke(n10[i10].T().q());
                    i10++;
                } while (i10 < o10);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // n1.y0
        public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            if (!j2.l.i(j10, this.f20898z)) {
                if (o0.this.s() || o0.this.t()) {
                    o0.this.f20862d = true;
                }
                p1();
            }
            o0 o0Var = o0.this;
            if (o0Var.I(o0Var.f20859a)) {
                y0.a.C0453a c0453a = y0.a.f20041a;
                o0 o0Var2 = o0.this;
                a C = o0Var2.C();
                qc.q.f(C);
                j0 l02 = o0Var2.f20859a.l0();
                if (l02 != null) {
                    l02.T().f20867i = 0;
                }
                C.x1(Integer.MAX_VALUE);
                y0.a.n(c0453a, C, j2.l.j(j10), j2.l.k(j10), 0.0f, 4, null);
            }
            u1(j10, f10, lVar);
        }

        @Override // p1.b
        public void R() {
            this.I = true;
            d().o();
            if (o0.this.x()) {
                q1();
            }
            if (o0.this.f20863e || (!this.f20897y && !o().k1() && o0.this.x())) {
                o0.this.f20862d = false;
                j0.e y10 = o0.this.y();
                o0.this.f20860b = j0.e.LayingOut;
                o0.this.U(false);
                j0 j0Var = o0.this.f20859a;
                n0.b(j0Var).getSnapshotObserver().d(j0Var, false, new C0472b(j0Var));
                o0.this.f20860b = y10;
                if (o().k1() && o0.this.t()) {
                    requestLayout();
                }
                o0.this.f20863e = false;
            }
            if (d().l()) {
                d().q(true);
            }
            if (d().g() && d().k()) {
                d().n();
            }
            this.I = false;
        }

        @Override // p1.b
        public void Y() {
            j0.j1(o0.this.f20859a, false, false, 3, null);
        }

        @Override // n1.m
        public int a0(int i10) {
            r1();
            return o0.this.F().a0(i10);
        }

        @Override // p1.b
        public p1.a d() {
            return this.F;
        }

        @Override // p1.b
        public boolean f() {
            return this.E;
        }

        public final List<b> f1() {
            o0.this.f20859a.x1();
            if (this.H) {
                j0 j0Var = o0.this.f20859a;
                k0.f<b> fVar = this.G;
                k0.f<j0> t02 = j0Var.t0();
                int o10 = t02.o();
                if (o10 > 0) {
                    j0[] n10 = t02.n();
                    int i10 = 0;
                    do {
                        j0 j0Var2 = n10[i10];
                        if (fVar.o() <= i10) {
                            fVar.d(j0Var2.T().D());
                        } else {
                            fVar.A(i10, j0Var2.T().D());
                        }
                        i10++;
                    } while (i10 < o10);
                }
                fVar.y(j0Var.F().size(), fVar.o());
                this.H = false;
                return this.G.h();
            }
            return this.G.h();
        }

        @Override // n1.m
        public int g(int i10) {
            r1();
            return o0.this.F().g(i10);
        }

        public final j2.b g1() {
            if (this.f20894v) {
                return j2.b.b(s0());
            }
            return null;
        }

        public final boolean h1() {
            return this.I;
        }

        public final j0.g i1() {
            return this.f20896x;
        }

        @Override // p1.b
        public Map<n1.a, Integer> j() {
            if (!this.f20897y) {
                if (o0.this.y() == j0.e.Measuring) {
                    d().s(true);
                    if (d().g()) {
                        o0.this.K();
                    }
                } else {
                    d().r(true);
                }
            }
            o().n1(true);
            R();
            o().n1(false);
            return d().h();
        }

        public final int j1() {
            return this.f20893u;
        }

        public final float k1() {
            return this.J;
        }

        public final void l1(boolean z10) {
            j0 l02;
            j0 l03 = o0.this.f20859a.l0();
            j0.g S = o0.this.f20859a.S();
            if (l03 != null && S != j0.g.NotUsed) {
                while (l03.S() == S && (l02 = l03.l0()) != null) {
                    l03 = l02;
                }
                int i10 = a.f20900b[S.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        l03.g1(z10);
                        return;
                    }
                    throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
                }
                j0.j1(l03, z10, false, 2, null);
            }
        }

        @Override // n1.y0
        public int m0() {
            return o0.this.F().m0();
        }

        public final void m1() {
            this.C = true;
        }

        @Override // p1.b
        public x0 o() {
            return o0.this.f20859a.O();
        }

        @Override // p1.b
        public p1.b p() {
            o0 T;
            j0 l02 = o0.this.f20859a.l0();
            if (l02 != null && (T = l02.T()) != null) {
                return T.q();
            }
            return null;
        }

        public final void p1() {
            k0.f<j0> t02;
            int o10;
            boolean z10;
            if (o0.this.r() > 0 && (o10 = (t02 = o0.this.f20859a.t0()).o()) > 0) {
                j0[] n10 = t02.n();
                int i10 = 0;
                do {
                    j0 j0Var = n10[i10];
                    o0 T = j0Var.T();
                    if (!T.t() && !T.s()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && !T.x()) {
                        j0.h1(j0Var, false, 1, null);
                    }
                    T.D().p1();
                    i10++;
                } while (i10 < o10);
            }
        }

        @Override // n1.y0
        public int q0() {
            return o0.this.F().q0();
        }

        @Override // p1.b
        public void requestLayout() {
            j0.h1(o0.this.f20859a, false, 1, null);
        }

        @Override // n1.m
        public int s(int i10) {
            r1();
            return o0.this.F().s(i10);
        }

        public final void s1() {
            this.f20893u = Integer.MAX_VALUE;
            this.f20892t = Integer.MAX_VALUE;
            z1(false);
        }

        @Override // n1.m
        public int t(int i10) {
            r1();
            return o0.this.F().t(i10);
        }

        public final void t1() {
            boolean z10;
            j0 l02 = o0.this.f20859a.l0();
            float W1 = o().W1();
            j0 j0Var = o0.this.f20859a;
            x0 j02 = j0Var.j0();
            x0 O = j0Var.O();
            while (j02 != O) {
                qc.q.g(j02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                f0 f0Var = (f0) j02;
                W1 += f0Var.W1();
                j02 = f0Var.U1();
            }
            boolean z11 = false;
            if (W1 == this.J) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.J = W1;
                if (l02 != null) {
                    l02.U0();
                }
                if (l02 != null) {
                    l02.B0();
                }
            }
            if (!f()) {
                if (l02 != null) {
                    l02.B0();
                }
                n1();
            }
            if (l02 != null) {
                if (!this.f20891s && l02.V() == j0.e.LayingOut) {
                    if (this.f20893u == Integer.MAX_VALUE) {
                        z11 = true;
                    }
                    if (z11) {
                        this.f20893u = l02.T().f20868j;
                        l02.T().f20868j++;
                    } else {
                        throw new IllegalStateException("Place was called on a node which was placed already".toString());
                    }
                }
            } else {
                this.f20893u = 0;
            }
            R();
        }

        public final boolean v1(long j10) {
            boolean z10;
            i1 b10 = n0.b(o0.this.f20859a);
            j0 l02 = o0.this.f20859a.l0();
            j0 j0Var = o0.this.f20859a;
            boolean z11 = true;
            if (!o0.this.f20859a.C() && (l02 == null || !l02.C())) {
                z10 = false;
            } else {
                z10 = true;
            }
            j0Var.n1(z10);
            if (!o0.this.f20859a.c0() && j2.b.g(s0(), j10)) {
                h1.a(b10, o0.this.f20859a, false, 2, null);
                o0.this.f20859a.m1();
                return false;
            }
            d().s(false);
            I(d.f20909f);
            this.f20894v = true;
            long a10 = o0.this.F().a();
            U0(j10);
            o0.this.Q(j10);
            if (j2.p.e(o0.this.F().a(), a10) && o0.this.F().A0() == A0() && o0.this.F().l0() == l0()) {
                z11 = false;
            }
            T0(j2.q.a(o0.this.F().A0(), o0.this.F().l0()));
            return z11;
        }

        @Override // n1.g0
        public n1.y0 w(long j10) {
            j0.g S = o0.this.f20859a.S();
            j0.g gVar = j0.g.NotUsed;
            if (S == gVar) {
                o0.this.f20859a.u();
            }
            o0 o0Var = o0.this;
            if (o0Var.I(o0Var.f20859a)) {
                this.f20894v = true;
                U0(j10);
                a C = o0.this.C();
                qc.q.f(C);
                C.w1(gVar);
                C.w(j10);
            }
            A1(o0.this.f20859a);
            v1(j10);
            return this;
        }

        public final void w1() {
            try {
                this.f20891s = true;
                if (this.f20895w) {
                    u1(this.f20898z, this.B, this.A);
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } finally {
                this.f20891s = false;
            }
        }

        public final void x1(boolean z10) {
            this.H = z10;
        }

        public final void y1(j0.g gVar) {
            qc.q.i(gVar, "<set-?>");
            this.f20896x = gVar;
        }

        public void z1(boolean z10) {
            this.E = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f20911m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10) {
            super(0);
            this.f20911m = j10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            s0 P1 = o0.this.F().P1();
            qc.q.f(P1);
            P1.w(this.f20911m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNodeLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f20913m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10) {
            super(0);
            this.f20913m = j10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            o0.this.F().w(this.f20913m);
        }
    }

    public o0(j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.f20859a = j0Var;
        this.f20860b = j0.e.Idle;
        this.f20872n = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean I(j0 j0Var) {
        j0 j0Var2;
        if (j0Var.Z() != null) {
            j0 l02 = j0Var.l0();
            if (l02 != null) {
                j0Var2 = l02.Z();
            } else {
                j0Var2 = null;
            }
            if (j0Var2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(long j10) {
        this.f20860b = j0.e.LookaheadMeasuring;
        this.f20864f = false;
        k1.g(n0.b(this.f20859a).getSnapshotObserver(), this.f20859a, false, new c(j10), 2, null);
        L();
        if (I(this.f20859a)) {
            K();
        } else {
            N();
        }
        this.f20860b = j0.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(long j10) {
        boolean z10;
        j0.e eVar = this.f20860b;
        j0.e eVar2 = j0.e.Idle;
        if (eVar == eVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j0.e eVar3 = j0.e.Measuring;
            this.f20860b = eVar3;
            this.f20861c = false;
            n0.b(this.f20859a).getSnapshotObserver().f(this.f20859a, false, new d(j10));
            if (this.f20860b == eVar3) {
                K();
                this.f20860b = eVar2;
                return;
            }
            return;
        }
        throw new IllegalStateException("layout state is not idle before measure starts".toString());
    }

    public final boolean A() {
        return this.f20865g;
    }

    public final boolean B() {
        return this.f20864f;
    }

    public final a C() {
        return this.f20873o;
    }

    public final b D() {
        return this.f20872n;
    }

    public final boolean E() {
        return this.f20861c;
    }

    public final x0 F() {
        return this.f20859a.i0().n();
    }

    public final int G() {
        return this.f20872n.A0();
    }

    public final void H() {
        this.f20872n.m1();
        a aVar = this.f20873o;
        if (aVar != null) {
            aVar.l1();
        }
    }

    public final void J() {
        this.f20872n.x1(true);
        a aVar = this.f20873o;
        if (aVar != null) {
            aVar.v1(true);
        }
    }

    public final void K() {
        this.f20862d = true;
        this.f20863e = true;
    }

    public final void L() {
        this.f20865g = true;
        this.f20866h = true;
    }

    public final void M() {
        this.f20864f = true;
    }

    public final void N() {
        this.f20861c = true;
    }

    public final void O() {
        j0.e V = this.f20859a.V();
        if (V == j0.e.LayingOut || V == j0.e.LookaheadLayingOut) {
            if (this.f20872n.h1()) {
                U(true);
            } else {
                T(true);
            }
        }
        if (V == j0.e.LookaheadLayingOut) {
            a aVar = this.f20873o;
            boolean z10 = false;
            if (aVar != null && aVar.h1()) {
                z10 = true;
            }
            if (z10) {
                U(true);
            } else {
                T(true);
            }
        }
    }

    public final void R() {
        p1.a d10;
        this.f20872n.d().p();
        a aVar = this.f20873o;
        if (aVar != null && (d10 = aVar.d()) != null) {
            d10.p();
        }
    }

    public final void S(int i10) {
        boolean z10;
        o0 o0Var;
        int i11 = this.f20871m;
        this.f20871m = i10;
        boolean z11 = false;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            j0 l02 = this.f20859a.l0();
            if (l02 != null) {
                o0Var = l02.T();
            } else {
                o0Var = null;
            }
            if (o0Var != null) {
                if (i10 == 0) {
                    o0Var.S(o0Var.f20871m - 1);
                } else {
                    o0Var.S(o0Var.f20871m + 1);
                }
            }
        }
    }

    public final void T(boolean z10) {
        if (this.f20870l != z10) {
            this.f20870l = z10;
            if (z10 && !this.f20869k) {
                S(this.f20871m + 1);
            } else if (!z10 && !this.f20869k) {
                S(this.f20871m - 1);
            }
        }
    }

    public final void U(boolean z10) {
        if (this.f20869k != z10) {
            this.f20869k = z10;
            if (z10 && !this.f20870l) {
                S(this.f20871m + 1);
            } else if (!z10 && !this.f20870l) {
                S(this.f20871m - 1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.A1() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V() {
        /*
            r5 = this;
            p1.o0$b r0 = r5.f20872n
            boolean r0 = r0.B1()
            r1 = 0
            r2 = 3
            r3 = 0
            if (r0 == 0) goto L16
            p1.j0 r0 = r5.f20859a
            p1.j0 r0 = r0.l0()
            if (r0 == 0) goto L16
            p1.j0.j1(r0, r3, r3, r2, r1)
        L16:
            p1.o0$a r0 = r5.f20873o
            if (r0 == 0) goto L22
            boolean r0 = r0.A1()
            r4 = 1
            if (r0 != r4) goto L22
            goto L23
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L44
            p1.j0 r0 = r5.f20859a
            boolean r0 = r5.I(r0)
            if (r0 == 0) goto L39
            p1.j0 r0 = r5.f20859a
            p1.j0 r0 = r0.l0()
            if (r0 == 0) goto L44
            p1.j0.j1(r0, r3, r3, r2, r1)
            goto L44
        L39:
            p1.j0 r0 = r5.f20859a
            p1.j0 r0 = r0.l0()
            if (r0 == 0) goto L44
            p1.j0.f1(r0, r3, r3, r2, r1)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o0.V():void");
    }

    public final void p() {
        if (this.f20873o == null) {
            this.f20873o = new a();
        }
    }

    public final p1.b q() {
        return this.f20872n;
    }

    public final int r() {
        return this.f20871m;
    }

    public final boolean s() {
        return this.f20870l;
    }

    public final boolean t() {
        return this.f20869k;
    }

    public final int u() {
        return this.f20872n.l0();
    }

    public final j2.b v() {
        return this.f20872n.g1();
    }

    public final j2.b w() {
        a aVar = this.f20873o;
        if (aVar != null) {
            return aVar.g1();
        }
        return null;
    }

    public final boolean x() {
        return this.f20862d;
    }

    public final j0.e y() {
        return this.f20860b;
    }

    public final p1.b z() {
        return this.f20873o;
    }
}
