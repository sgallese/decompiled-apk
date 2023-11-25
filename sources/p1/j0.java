package p1;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.g4;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Comparator;
import java.util.List;
import n1.y0;
import p1.i1;
import p1.o0;

/* compiled from: LayoutNode.kt */
/* loaded from: classes.dex */
public final class j0 implements j0.k, n1.a1, j1, n1.w, p1.g, i1.b {
    public static final d X = new d(null);
    private static final f Y = new c();
    private static final pc.a<j0> Z = a.f20827f;

    /* renamed from: a0 */
    private static final g4 f20812a0 = new b();

    /* renamed from: b0 */
    private static final Comparator<j0> f20813b0 = new Comparator() { // from class: p1.i0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int p10;
            p10 = j0.p((j0) obj, (j0) obj2);
            return p10;
        }
    };
    private boolean A;
    private t1.l B;
    private final k0.f<j0> C;
    private boolean D;
    private n1.i0 E;
    private final z F;
    private j2.e G;
    private j2.r H;
    private g4 I;
    private j0.v J;
    private g K;
    private g L;
    private boolean M;
    private final androidx.compose.ui.node.a N;
    private final o0 O;
    private n1.b0 P;
    private x0 Q;
    private boolean R;
    private androidx.compose.ui.e S;
    private pc.l<? super i1, dc.w> T;
    private pc.l<? super i1, dc.w> U;
    private boolean V;
    private boolean W;

    /* renamed from: f */
    private final boolean f20814f;

    /* renamed from: m */
    private int f20815m;

    /* renamed from: p */
    private int f20816p;

    /* renamed from: q */
    private boolean f20817q;

    /* renamed from: r */
    private j0 f20818r;

    /* renamed from: s */
    private int f20819s;

    /* renamed from: t */
    private final v0<j0> f20820t;

    /* renamed from: u */
    private k0.f<j0> f20821u;

    /* renamed from: v */
    private boolean f20822v;

    /* renamed from: w */
    private j0 f20823w;

    /* renamed from: x */
    private i1 f20824x;

    /* renamed from: y */
    private androidx.compose.ui.viewinterop.a f20825y;

    /* renamed from: z */
    private int f20826z;

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<j0> {

        /* renamed from: f */
        public static final a f20827f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a */
        public final j0 invoke() {
            boolean z10 = false;
            return new j0(z10, z10 ? 1 : 0, 3, null);
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class b implements g4 {
        b() {
        }

        @Override // androidx.compose.ui.platform.g4
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.g4
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.g4
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.g4
        public long d() {
            return j2.k.f18988b.b();
        }

        @Override // androidx.compose.ui.platform.g4
        public float e() {
            return 16.0f;
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        public Void e(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
            qc.q.i(l0Var, "$this$measure");
            qc.q.i(list, "measurables");
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List list, long j10) {
            return (n1.j0) e(l0Var, list, j10);
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(qc.h hVar) {
            this();
        }

        public final pc.a<j0> a() {
            return j0.Z;
        }

        public final Comparator<j0> b() {
            return j0.f20813b0;
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static abstract class f implements n1.i0 {

        /* renamed from: a */
        private final String f20828a;

        public f(String str) {
            qc.q.i(str, "error");
            this.f20828a = str;
        }

        public Void a(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            throw new IllegalStateException(this.f20828a.toString());
        }

        public Void b(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            throw new IllegalStateException(this.f20828a.toString());
        }

        public Void c(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            throw new IllegalStateException(this.f20828a.toString());
        }

        public Void d(n1.n nVar, List<? extends n1.m> list, int i10) {
            qc.q.i(nVar, "<this>");
            qc.q.i(list, "measurables");
            throw new IllegalStateException(this.f20828a.toString());
        }

        @Override // n1.i0
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return ((Number) a(nVar, list, i10)).intValue();
        }

        @Override // n1.i0
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return ((Number) b(nVar, list, i10)).intValue();
        }

        @Override // n1.i0
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return ((Number) c(nVar, list, i10)).intValue();
        }

        @Override // n1.i0
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return ((Number) d(nVar, list, i10)).intValue();
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20829a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f20829a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.a<dc.w> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            j0.this = r1;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            j0.this.T().J();
        }
    }

    /* compiled from: LayoutNode.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.a<dc.w> {

        /* renamed from: m */
        final /* synthetic */ qc.f0<t1.l> f20832m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(qc.f0<t1.l> f0Var) {
            super(0);
            j0.this = r1;
            this.f20832m = f0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* JADX WARN: Type inference failed for: r6v7, types: [T, t1.l] */
        /* renamed from: invoke */
        public final void invoke2() {
            int i10;
            androidx.compose.ui.node.a i02 = j0.this.i0();
            int a10 = z0.a(8);
            qc.f0<t1.l> f0Var = this.f20832m;
            i10 = i02.i();
            if ((i10 & a10) != 0) {
                for (e.c o10 = i02.o(); o10 != null; o10 = o10.m1()) {
                    if ((o10.k1() & a10) != 0) {
                        e.c cVar = o10;
                        k0.f fVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s1) {
                                s1 s1Var = (s1) cVar;
                                if (s1Var.b0()) {
                                    ?? lVar = new t1.l();
                                    f0Var.f21676f = lVar;
                                    lVar.o(true);
                                }
                                if (s1Var.b1()) {
                                    f0Var.f21676f.p(true);
                                }
                                s1Var.Z0(f0Var.f21676f);
                            } else if (((cVar.k1() & a10) != 0) && (cVar instanceof l)) {
                                int i11 = 0;
                                for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J1;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new k0.f(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                fVar.d(cVar);
                                                cVar = null;
                                            }
                                            fVar.d(J1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar = k.g(fVar);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j0.<init>():void");
    }

    private final void A0() {
        int i10;
        boolean z10;
        boolean z11;
        androidx.compose.ui.node.a aVar = this.N;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
        i10 = aVar.i();
        if ((i10 & a10) != 0) {
            for (e.c o10 = aVar.o(); o10 != null; o10 = o10.m1()) {
                if ((o10.k1() & a10) != 0) {
                    e.c cVar = o10;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                            if (focusTargetNode.O1().isFocused()) {
                                n0.b(this).getFocusOwner().g(true, false);
                                focusTargetNode.Q1();
                            }
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof l)) {
                                int i11 = 0;
                                for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J1;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new k0.f(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                fVar.d(cVar);
                                                cVar = null;
                                            }
                                            fVar.d(J1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                        }
                        cVar = k.g(fVar);
                    }
                }
            }
        }
    }

    private final void G0() {
        j0 j0Var;
        if (this.f20819s > 0) {
            this.f20822v = true;
        }
        if (this.f20814f && (j0Var = this.f20823w) != null) {
            j0Var.G0();
        }
    }

    public static /* synthetic */ boolean L0(j0 j0Var, j2.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = j0Var.O.w();
        }
        return j0Var.K0(bVar);
    }

    private final x0 P() {
        g1 g1Var;
        if (this.R) {
            x0 O = O();
            x0 V1 = j0().V1();
            this.Q = null;
            while (true) {
                if (qc.q.d(O, V1)) {
                    break;
                }
                if (O != null) {
                    g1Var = O.O1();
                } else {
                    g1Var = null;
                }
                if (g1Var != null) {
                    this.Q = O;
                    break;
                } else if (O != null) {
                    O = O.V1();
                } else {
                    O = null;
                }
            }
        }
        x0 x0Var = this.Q;
        if (x0Var != null && x0Var.O1() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return x0Var;
    }

    private final void S0(j0 j0Var) {
        if (j0Var.O.r() > 0) {
            this.O.S(r0.r() - 1);
        }
        if (this.f20824x != null) {
            j0Var.y();
        }
        j0Var.f20823w = null;
        j0Var.j0().y2(null);
        if (j0Var.f20814f) {
            this.f20819s--;
            k0.f<j0> f10 = j0Var.f20820t.f();
            int o10 = f10.o();
            if (o10 > 0) {
                j0[] n10 = f10.n();
                int i10 = 0;
                do {
                    n10[i10].j0().y2(null);
                    i10++;
                } while (i10 < o10);
            }
        }
        G0();
        U0();
    }

    private final void T0() {
        D0();
        j0 l02 = l0();
        if (l02 != null) {
            l02.B0();
        }
        C0();
    }

    private final void W0() {
        if (this.f20822v) {
            int i10 = 0;
            this.f20822v = false;
            k0.f<j0> fVar = this.f20821u;
            if (fVar == null) {
                fVar = new k0.f<>(new j0[16], 0);
                this.f20821u = fVar;
            }
            fVar.i();
            k0.f<j0> f10 = this.f20820t.f();
            int o10 = f10.o();
            if (o10 > 0) {
                j0[] n10 = f10.n();
                do {
                    j0 j0Var = n10[i10];
                    if (j0Var.f20814f) {
                        fVar.f(fVar.o(), j0Var.t0());
                    } else {
                        fVar.d(j0Var);
                    }
                    i10++;
                } while (i10 < o10);
            }
            this.O.J();
        }
    }

    public static /* synthetic */ boolean Y0(j0 j0Var, j2.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = j0Var.O.v();
        }
        return j0Var.X0(bVar);
    }

    public static /* synthetic */ void d1(j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j0Var.c1(z10);
    }

    public static /* synthetic */ void f1(j0 j0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        j0Var.e1(z10, z11);
    }

    public static /* synthetic */ void h1(j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        j0Var.g1(z10);
    }

    public static /* synthetic */ void j1(j0 j0Var, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        j0Var.i1(z10, z11);
    }

    private final void l1() {
        this.N.x();
    }

    public static final int p(j0 j0Var, j0 j0Var2) {
        boolean z10;
        if (j0Var.r0() == j0Var2.r0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return qc.q.k(j0Var.m0(), j0Var2.m0());
        }
        return Float.compare(j0Var.r0(), j0Var2.r0());
    }

    private final float r0() {
        return b0().k1();
    }

    private final void r1(j0 j0Var) {
        if (!qc.q.d(j0Var, this.f20818r)) {
            this.f20818r = j0Var;
            if (j0Var != null) {
                this.O.p();
                x0 U1 = O().U1();
                for (x0 j02 = j0(); !qc.q.d(j02, U1) && j02 != null; j02 = j02.U1()) {
                    j02.H1();
                }
            }
            D0();
        }
    }

    private final void v() {
        this.L = this.K;
        this.K = g.NotUsed;
        k0.f<j0> t02 = t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i10 = 0;
            do {
                j0 j0Var = n10[i10];
                if (j0Var.K == g.InLayoutBlock) {
                    j0Var.v();
                }
                i10++;
            } while (i10 < o10);
        }
    }

    public static /* synthetic */ void v0(j0 j0Var, long j10, v vVar, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12;
        boolean z13;
        if ((i10 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        j0Var.u0(j10, vVar, z12, z13);
    }

    private final String w(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        k0.f<j0> t02 = t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i12 = 0;
            do {
                sb2.append(n10[i12].w(i10 + 1));
                i12++;
            } while (i12 < o10);
        }
        String sb3 = sb2.toString();
        qc.q.h(sb3, "tree.toString()");
        if (i10 == 0) {
            String substring = sb3.substring(0, sb3.length() - 1);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return sb3;
    }

    static /* synthetic */ String x(j0 j0Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return j0Var.w(i10);
    }

    public static /* synthetic */ void x0(j0 j0Var, long j10, v vVar, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12;
        boolean z13;
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        j0Var.w0(j10, vVar, z12, z13);
    }

    private final void z0() {
        boolean z10;
        boolean z11;
        if (this.N.p(z0.a(UserVerificationMethods.USER_VERIFY_ALL) | z0.a(RecyclerView.m.FLAG_MOVED) | z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT))) {
            for (e.c k10 = this.N.k(); k10 != null; k10 = k10.g1()) {
                boolean z12 = true;
                if ((z0.a(UserVerificationMethods.USER_VERIFY_ALL) & k10.k1()) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((z0.a(RecyclerView.m.FLAG_MOVED) & k10.k1()) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                if ((z0.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) & k10.k1()) == 0) {
                    z12 = false;
                }
                if (z13 | z12) {
                    a1.a(k10);
                }
            }
        }
    }

    public final void A(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        j0().E1(h1Var);
    }

    public final boolean B() {
        boolean z10;
        p1.a d10;
        o0 o0Var = this.O;
        if (o0Var.q().d().k()) {
            return true;
        }
        p1.b z11 = o0Var.z();
        if (z11 != null && (d10 = z11.d()) != null && d10.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final void B0() {
        x0 P = P();
        if (P != null) {
            P.e2();
            return;
        }
        j0 l02 = l0();
        if (l02 != null) {
            l02.B0();
        }
    }

    public final boolean C() {
        return this.M;
    }

    public final void C0() {
        x0 j02 = j0();
        x0 O = O();
        while (j02 != O) {
            qc.q.g(j02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            f0 f0Var = (f0) j02;
            g1 O1 = f0Var.O1();
            if (O1 != null) {
                O1.invalidate();
            }
            j02 = f0Var.U1();
        }
        g1 O12 = O().O1();
        if (O12 != null) {
            O12.invalidate();
        }
    }

    public final List<n1.g0> D() {
        o0.a Y2 = Y();
        qc.q.f(Y2);
        return Y2.f1();
    }

    public final void D0() {
        if (this.f20818r != null) {
            f1(this, false, false, 3, null);
        } else {
            j1(this, false, false, 3, null);
        }
    }

    public final List<n1.g0> E() {
        return b0().f1();
    }

    public final void E0() {
        this.O.H();
    }

    public final List<j0> F() {
        return t0().h();
    }

    public final void F0() {
        this.B = null;
        n0.b(this).q();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, t1.l] */
    public final t1.l G() {
        if (this.N.q(z0.a(8)) && this.B == null) {
            qc.f0 f0Var = new qc.f0();
            f0Var.f21676f = new t1.l();
            n0.b(this).getSnapshotObserver().i(this, new j(f0Var));
            T t10 = f0Var.f21676f;
            this.B = (t1.l) t10;
            return (t1.l) t10;
        }
        return this.B;
    }

    public j0.v H() {
        return this.J;
    }

    public boolean H0() {
        if (this.f20824x != null) {
            return true;
        }
        return false;
    }

    public j2.e I() {
        return this.G;
    }

    public final Boolean I0() {
        o0.a Y2 = Y();
        if (Y2 != null) {
            return Boolean.valueOf(Y2.f());
        }
        return null;
    }

    public final int J() {
        return this.f20826z;
    }

    public final boolean J0() {
        return this.f20817q;
    }

    public final List<j0> K() {
        return this.f20820t.b();
    }

    public final boolean K0(j2.b bVar) {
        if (bVar != null && this.f20818r != null) {
            o0.a Y2 = Y();
            qc.q.f(Y2);
            return Y2.t1(bVar.t());
        }
        return false;
    }

    public final boolean L() {
        long N1 = O().N1();
        if (j2.b.l(N1) && j2.b.k(N1)) {
            return true;
        }
        return false;
    }

    @Override // p1.j1
    public boolean M() {
        return H0();
    }

    public final void M0() {
        if (this.K == g.NotUsed) {
            v();
        }
        o0.a Y2 = Y();
        qc.q.f(Y2);
        Y2.u1();
    }

    public int N() {
        return this.O.u();
    }

    public final void N0() {
        this.O.K();
    }

    public final x0 O() {
        return this.N.l();
    }

    public final void O0() {
        this.O.L();
    }

    public final void P0() {
        this.O.M();
    }

    public final androidx.compose.ui.viewinterop.a Q() {
        return this.f20825y;
    }

    public final void Q0() {
        this.O.N();
    }

    public final z R() {
        return this.F;
    }

    public final void R0(int i10, int i11, int i12) {
        int i13;
        if (i10 == i11) {
            return;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            if (i10 > i11) {
                i13 = i10 + i14;
            } else {
                i13 = i10;
            }
            this.f20820t.a(i10 > i11 ? i11 + i14 : (i11 + i12) - 2, this.f20820t.g(i13));
        }
        U0();
        G0();
        D0();
    }

    public final g S() {
        return this.K;
    }

    public final o0 T() {
        return this.O;
    }

    public final boolean U() {
        return this.O.x();
    }

    public final void U0() {
        if (this.f20814f) {
            j0 l02 = l0();
            if (l02 != null) {
                l02.U0();
                return;
            }
            return;
        }
        this.D = true;
    }

    public final e V() {
        return this.O.y();
    }

    public final void V0(int i10, int i11) {
        x0 x0Var;
        n1.s sVar;
        int l10;
        j2.r k10;
        o0 o0Var;
        boolean D;
        if (this.K == g.NotUsed) {
            v();
        }
        o0.b b02 = b0();
        y0.a.C0453a c0453a = y0.a.f20041a;
        int q02 = b02.q0();
        j2.r layoutDirection = getLayoutDirection();
        j0 l02 = l0();
        if (l02 != null) {
            x0Var = l02.O();
        } else {
            x0Var = null;
        }
        x0 x0Var2 = x0Var;
        sVar = y0.a.f20044d;
        l10 = c0453a.l();
        k10 = c0453a.k();
        o0Var = y0.a.f20045e;
        y0.a.f20043c = q02;
        y0.a.f20042b = layoutDirection;
        D = c0453a.D(x0Var2);
        y0.a.r(c0453a, b02, i10, i11, 0.0f, 4, null);
        if (x0Var2 != null) {
            x0Var2.n1(D);
        }
        y0.a.f20043c = l10;
        y0.a.f20042b = k10;
        y0.a.f20044d = sVar;
        y0.a.f20045e = o0Var;
    }

    public final boolean W() {
        return this.O.A();
    }

    public final boolean X() {
        return this.O.B();
    }

    public final boolean X0(j2.b bVar) {
        if (bVar != null) {
            if (this.K == g.NotUsed) {
                u();
            }
            return b0().v1(bVar.t());
        }
        return false;
    }

    public final o0.a Y() {
        return this.O.C();
    }

    public final j0 Z() {
        return this.f20818r;
    }

    public final void Z0() {
        int e10 = this.f20820t.e();
        while (true) {
            e10--;
            if (-1 < e10) {
                S0(this.f20820t.d(e10));
            } else {
                this.f20820t.c();
                return;
            }
        }
    }

    @Override // p1.g
    public void a(j2.r rVar) {
        qc.q.i(rVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.H != rVar) {
            this.H = rVar;
            T0();
        }
    }

    public final l0 a0() {
        return n0.b(this).getSharedDrawScope();
    }

    public final void a1(int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i12 = (i11 + i10) - 1;
            if (i10 > i12) {
                return;
            }
            while (true) {
                S0(this.f20820t.g(i12));
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i11 + ") must be greater than 0").toString());
        }
    }

    @Override // j0.k
    public void b() {
        androidx.compose.ui.viewinterop.a aVar = this.f20825y;
        if (aVar != null) {
            aVar.b();
        }
        x0 U1 = O().U1();
        for (x0 j02 = j0(); !qc.q.d(j02, U1) && j02 != null; j02 = j02.U1()) {
            j02.p2();
        }
    }

    public final o0.b b0() {
        return this.O.D();
    }

    public final void b1() {
        if (this.K == g.NotUsed) {
            v();
        }
        b0().w1();
    }

    @Override // p1.i1.b
    public void c() {
        boolean z10;
        boolean z11;
        x0 O = O();
        int a10 = z0.a(128);
        boolean i10 = a1.i(a10);
        e.c T1 = O.T1();
        if (i10 || (T1 = T1.m1()) != null) {
            for (e.c Z1 = O.Z1(i10); Z1 != null && (Z1.f1() & a10) != 0; Z1 = Z1.g1()) {
                if ((Z1.k1() & a10) != 0) {
                    e.c cVar = Z1;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof c0) {
                            ((c0) cVar).p(O());
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof l)) {
                                int i11 = 0;
                                for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J1;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new k0.f(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                fVar.d(cVar);
                                                cVar = null;
                                            }
                                            fVar.d(J1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                        }
                        cVar = k.g(fVar);
                    }
                }
                if (Z1 == T1) {
                    return;
                }
            }
        }
    }

    public final boolean c0() {
        return this.O.E();
    }

    public final void c1(boolean z10) {
        i1 i1Var;
        if (!this.f20814f && (i1Var = this.f20824x) != null) {
            i1Var.g(this, true, z10);
        }
    }

    @Override // p1.g
    public void d(int i10) {
        this.f20816p = i10;
    }

    public n1.i0 d0() {
        return this.E;
    }

    @Override // p1.g
    public void e(androidx.compose.ui.e eVar) {
        boolean z10;
        qc.q.i(eVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.f20814f && g0() != androidx.compose.ui.e.f2335a) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.S = eVar;
            this.N.E(eVar);
            this.O.V();
            if (this.N.q(z0.a(512)) && this.f20818r == null) {
                r1(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    public final g e0() {
        return b0().i1();
    }

    public final void e1(boolean z10, boolean z11) {
        boolean z12;
        if (this.f20818r != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i1 i1Var = this.f20824x;
            if (i1Var != null && !this.A && !this.f20814f) {
                i1Var.m(this, true, z10, z11);
                o0.a Y2 = Y();
                qc.q.f(Y2);
                Y2.k1(z10);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    @Override // n1.w
    public boolean f() {
        return b0().f();
    }

    public final g f0() {
        g j12;
        o0.a Y2 = Y();
        if (Y2 == null || (j12 = Y2.j1()) == null) {
            return g.NotUsed;
        }
        return j12;
    }

    @Override // n1.w
    public n1.s g() {
        return O();
    }

    public androidx.compose.ui.e g0() {
        return this.S;
    }

    public final void g1(boolean z10) {
        i1 i1Var;
        if (!this.f20814f && (i1Var = this.f20824x) != null) {
            h1.d(i1Var, this, false, z10, 2, null);
        }
    }

    @Override // n1.w
    public j2.r getLayoutDirection() {
        return this.H;
    }

    @Override // p1.g
    public void h(j0.v vVar) {
        int i10;
        boolean z10;
        boolean z11;
        qc.q.i(vVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.J = vVar;
        m((j2.e) vVar.a(androidx.compose.ui.platform.z0.e()));
        a((j2.r) vVar.a(androidx.compose.ui.platform.z0.j()));
        k((g4) vVar.a(androidx.compose.ui.platform.z0.n()));
        androidx.compose.ui.node.a aVar = this.N;
        int a10 = z0.a(32768);
        i10 = aVar.i();
        if ((i10 & a10) != 0) {
            for (e.c k10 = aVar.k(); k10 != null; k10 = k10.g1()) {
                if ((k10.k1() & a10) != 0) {
                    e.c cVar = k10;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof p1.h) {
                            e.c node = ((p1.h) cVar).getNode();
                            if (node.p1()) {
                                a1.e(node);
                            } else {
                                node.F1(true);
                            }
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof l)) {
                                int i11 = 0;
                                for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J1;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new k0.f(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                fVar.d(cVar);
                                                cVar = null;
                                            }
                                            fVar.d(J1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                        }
                        cVar = k.g(fVar);
                    }
                }
                if ((k10.f1() & a10) == 0) {
                    return;
                }
            }
        }
    }

    public final boolean h0() {
        return this.V;
    }

    @Override // j0.k
    public void i() {
        androidx.compose.ui.viewinterop.a aVar = this.f20825y;
        if (aVar != null) {
            aVar.i();
        }
        this.W = true;
        l1();
    }

    public final androidx.compose.ui.node.a i0() {
        return this.N;
    }

    public final void i1(boolean z10, boolean z11) {
        i1 i1Var;
        if (this.A || this.f20814f || (i1Var = this.f20824x) == null) {
            return;
        }
        h1.c(i1Var, this, false, z10, z11, 2, null);
        b0().l1(z10);
    }

    @Override // n1.a1
    public void j() {
        if (this.f20818r != null) {
            f1(this, false, false, 1, null);
        } else {
            j1(this, false, false, 1, null);
        }
        j2.b v10 = this.O.v();
        if (v10 != null) {
            i1 i1Var = this.f20824x;
            if (i1Var != null) {
                i1Var.j(this, v10.t());
                return;
            }
            return;
        }
        i1 i1Var2 = this.f20824x;
        if (i1Var2 != null) {
            h1.b(i1Var2, false, 1, null);
        }
    }

    public final x0 j0() {
        return this.N.n();
    }

    @Override // p1.g
    public void k(g4 g4Var) {
        int i10;
        boolean z10;
        boolean z11;
        qc.q.i(g4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!qc.q.d(this.I, g4Var)) {
            this.I = g4Var;
            androidx.compose.ui.node.a aVar = this.N;
            int a10 = z0.a(16);
            i10 = aVar.i();
            if ((i10 & a10) != 0) {
                for (e.c k10 = aVar.k(); k10 != null; k10 = k10.g1()) {
                    if ((k10.k1() & a10) != 0) {
                        e.c cVar = k10;
                        k0.f fVar = null;
                        while (cVar != null) {
                            if (cVar instanceof o1) {
                                ((o1) cVar).U0();
                            } else {
                                if ((cVar.k1() & a10) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (cVar instanceof l)) {
                                    int i11 = 0;
                                    for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                        if ((J1.k1() & a10) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = J1;
                                            } else {
                                                if (fVar == null) {
                                                    fVar = new k0.f(new e.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    fVar.d(cVar);
                                                    cVar = null;
                                                }
                                                fVar.d(J1);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                            }
                            cVar = k.g(fVar);
                        }
                    }
                    if ((k10.f1() & a10) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final i1 k0() {
        return this.f20824x;
    }

    public final void k1(j0 j0Var) {
        qc.q.i(j0Var, "it");
        if (h.f20829a[j0Var.V().ordinal()] == 1) {
            if (j0Var.c0()) {
                j1(j0Var, true, false, 2, null);
                return;
            } else if (j0Var.U()) {
                j0Var.g1(true);
                return;
            } else if (j0Var.X()) {
                f1(j0Var, true, false, 2, null);
                return;
            } else if (j0Var.W()) {
                j0Var.c1(true);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Unexpected state " + j0Var.V());
    }

    @Override // j0.k
    public void l() {
        if (H0()) {
            androidx.compose.ui.viewinterop.a aVar = this.f20825y;
            if (aVar != null) {
                aVar.l();
            }
            if (this.W) {
                this.W = false;
            } else {
                l1();
            }
            v1(t1.o.a());
            this.N.s();
            this.N.y();
            return;
        }
        throw new IllegalArgumentException("onReuse is only expected on attached node".toString());
    }

    public final j0 l0() {
        j0 j0Var = this.f20823w;
        while (true) {
            boolean z10 = false;
            if (j0Var != null && j0Var.f20814f) {
                z10 = true;
            }
            if (z10) {
                j0Var = j0Var.f20823w;
            } else {
                return j0Var;
            }
        }
    }

    @Override // p1.g
    public void m(j2.e eVar) {
        int i10;
        boolean z10;
        boolean z11;
        qc.q.i(eVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!qc.q.d(this.G, eVar)) {
            this.G = eVar;
            T0();
            androidx.compose.ui.node.a aVar = this.N;
            int a10 = z0.a(16);
            i10 = aVar.i();
            if ((i10 & a10) != 0) {
                for (e.c k10 = aVar.k(); k10 != null; k10 = k10.g1()) {
                    if ((k10.k1() & a10) != 0) {
                        e.c cVar = k10;
                        k0.f fVar = null;
                        while (cVar != null) {
                            if (cVar instanceof o1) {
                                ((o1) cVar).m0();
                            } else {
                                if ((cVar.k1() & a10) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (cVar instanceof l)) {
                                    int i11 = 0;
                                    for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                        if ((J1.k1() & a10) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = J1;
                                            } else {
                                                if (fVar == null) {
                                                    fVar = new k0.f(new e.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    fVar.d(cVar);
                                                    cVar = null;
                                                }
                                                fVar.d(J1);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                            }
                            cVar = k.g(fVar);
                        }
                    }
                    if ((k10.f1() & a10) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final int m0() {
        return b0().j1();
    }

    public final void m1() {
        k0.f<j0> t02 = t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i10 = 0;
            do {
                j0 j0Var = n10[i10];
                g gVar = j0Var.L;
                j0Var.K = gVar;
                if (gVar != g.NotUsed) {
                    j0Var.m1();
                }
                i10++;
            } while (i10 < o10);
        }
    }

    @Override // p1.g
    public void n(n1.i0 i0Var) {
        qc.q.i(i0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!qc.q.d(this.E, i0Var)) {
            this.E = i0Var;
            this.F.l(d0());
            D0();
        }
    }

    public int n0() {
        return this.f20815m;
    }

    public final void n1(boolean z10) {
        this.M = z10;
    }

    public final n1.b0 o0() {
        return this.P;
    }

    public final void o1(boolean z10) {
        this.R = z10;
    }

    public g4 p0() {
        return this.I;
    }

    public final void p1(androidx.compose.ui.viewinterop.a aVar) {
        this.f20825y = aVar;
    }

    public int q0() {
        return this.O.G();
    }

    public final void q1(g gVar) {
        qc.q.i(gVar, "<set-?>");
        this.K = gVar;
    }

    public final k0.f<j0> s0() {
        if (this.D) {
            this.C.i();
            k0.f<j0> fVar = this.C;
            fVar.f(fVar.o(), t0());
            this.C.B(f20813b0);
            this.D = false;
        }
        return this.C;
    }

    public final void s1(boolean z10) {
        this.V = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(p1.i1 r7) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j0.t(p1.i1):void");
    }

    public final k0.f<j0> t0() {
        x1();
        if (this.f20819s == 0) {
            return this.f20820t.f();
        }
        k0.f<j0> fVar = this.f20821u;
        qc.q.f(fVar);
        return fVar;
    }

    public final void t1(pc.l<? super i1, dc.w> lVar) {
        this.T = lVar;
    }

    public String toString() {
        return androidx.compose.ui.platform.p1.a(this, null) + " children: " + F().size() + " measurePolicy: " + d0();
    }

    public final void u() {
        this.L = this.K;
        this.K = g.NotUsed;
        k0.f<j0> t02 = t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i10 = 0;
            do {
                j0 j0Var = n10[i10];
                if (j0Var.K != g.NotUsed) {
                    j0Var.u();
                }
                i10++;
            } while (i10 < o10);
        }
    }

    public final void u0(long j10, v vVar, boolean z10, boolean z11) {
        qc.q.i(vVar, "hitTestResult");
        j0().c2(x0.M.a(), j0().J1(j10), vVar, z10, z11);
    }

    public final void u1(pc.l<? super i1, dc.w> lVar) {
        this.U = lVar;
    }

    public void v1(int i10) {
        this.f20815m = i10;
    }

    public final void w0(long j10, v vVar, boolean z10, boolean z11) {
        qc.q.i(vVar, "hitSemanticsEntities");
        j0().c2(x0.M.b(), j0().J1(j10), vVar, true, z11);
    }

    public final void w1(n1.b0 b0Var) {
        this.P = b0Var;
    }

    public final void x1() {
        if (this.f20819s > 0) {
            W0();
        }
    }

    public final void y() {
        i1 i1Var = this.f20824x;
        String str = null;
        if (i1Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            j0 l02 = l0();
            if (l02 != null) {
                str = x(l02, 0, 1, null);
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString().toString());
        }
        A0();
        j0 l03 = l0();
        if (l03 != null) {
            l03.B0();
            l03.D0();
            o0.b b02 = b0();
            g gVar = g.NotUsed;
            b02.y1(gVar);
            o0.a Y2 = Y();
            if (Y2 != null) {
                Y2.w1(gVar);
            }
        }
        this.O.R();
        pc.l<? super i1, dc.w> lVar = this.U;
        if (lVar != null) {
            lVar.invoke(i1Var);
        }
        if (this.N.q(z0.a(8))) {
            F0();
        }
        this.N.z();
        this.A = true;
        k0.f<j0> f10 = this.f20820t.f();
        int o10 = f10.o();
        if (o10 > 0) {
            j0[] n10 = f10.n();
            int i10 = 0;
            do {
                n10[i10].y();
                i10++;
            } while (i10 < o10);
        }
        this.A = false;
        this.N.t();
        i1Var.i(this);
        this.f20824x = null;
        r1(null);
        this.f20826z = 0;
        b0().s1();
        o0.a Y3 = Y();
        if (Y3 != null) {
            Y3.r1();
        }
    }

    public final void y0(int i10, j0 j0Var) {
        boolean z10;
        boolean z11;
        qc.q.i(j0Var, "instance");
        if (j0Var.f20823w == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = null;
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(j0Var);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(x(this, 0, 1, null));
            sb2.append(" Other tree: ");
            j0 j0Var2 = j0Var.f20823w;
            if (j0Var2 != null) {
                str = x(j0Var2, 0, 1, null);
            }
            sb2.append(str);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (j0Var.f20824x == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            j0Var.f20823w = this;
            this.f20820t.a(i10, j0Var);
            U0();
            if (j0Var.f20814f) {
                this.f20819s++;
            }
            G0();
            i1 i1Var = this.f20824x;
            if (i1Var != null) {
                j0Var.t(i1Var);
            }
            if (j0Var.O.r() > 0) {
                o0 o0Var = this.O;
                o0Var.S(o0Var.r() + 1);
                return;
            }
            return;
        }
        throw new IllegalStateException(("Cannot insert " + j0Var + " because it already has an owner. This tree: " + x(this, 0, 1, null) + " Other tree: " + x(j0Var, 0, 1, null)).toString());
    }

    public final void z() {
        int i10;
        boolean z10;
        boolean z11;
        if (V() != e.Idle || U() || c0() || !f()) {
            return;
        }
        androidx.compose.ui.node.a aVar = this.N;
        int a10 = z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT);
        i10 = aVar.i();
        if ((i10 & a10) != 0) {
            for (e.c k10 = aVar.k(); k10 != null; k10 = k10.g1()) {
                if ((k10.k1() & a10) != 0) {
                    e.c cVar = k10;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof u) {
                            u uVar = (u) cVar;
                            uVar.w(k.h(uVar, z0.a(UserVerificationMethods.USER_VERIFY_HANDPRINT)));
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof l)) {
                                int i11 = 0;
                                for (e.c J1 = ((l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar = J1;
                                        } else {
                                            if (fVar == null) {
                                                fVar = new k0.f(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                fVar.d(cVar);
                                                cVar = null;
                                            }
                                            fVar.d(J1);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                        }
                        cVar = k.g(fVar);
                    }
                }
                if ((k10.f1() & a10) == 0) {
                    return;
                }
            }
        }
    }

    public j0(boolean z10, int i10) {
        j2.e eVar;
        this.f20814f = z10;
        this.f20815m = i10;
        this.f20820t = new v0<>(new k0.f(new j0[16], 0), new i());
        this.C = new k0.f<>(new j0[16], 0);
        this.D = true;
        this.E = Y;
        this.F = new z(this);
        eVar = n0.f20858a;
        this.G = eVar;
        this.H = j2.r.Ltr;
        this.I = f20812a0;
        this.J = j0.v.f18913j.a();
        g gVar = g.NotUsed;
        this.K = gVar;
        this.L = gVar;
        this.N = new androidx.compose.ui.node.a(this);
        this.O = new o0(this);
        this.R = true;
        this.S = androidx.compose.ui.e.f2335a;
    }

    public /* synthetic */ j0(boolean z10, int i10, int i11, qc.h hVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? t1.o.a() : i10);
    }
}
