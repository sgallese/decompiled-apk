package p1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.NoWhenBranchMatchedException;
import p1.i1;
import p1.j0;

/* compiled from: MeasureAndLayoutDelegate.kt */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a */
    private final j0 f20926a;

    /* renamed from: b */
    private final n f20927b;

    /* renamed from: c */
    private boolean f20928c;

    /* renamed from: d */
    private final f1 f20929d;

    /* renamed from: e */
    private final k0.f<i1.b> f20930e;

    /* renamed from: f */
    private long f20931f;

    /* renamed from: g */
    private final k0.f<a> f20932g;

    /* renamed from: h */
    private j2.b f20933h;

    /* renamed from: i */
    private final p0 f20934i;

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final j0 f20935a;

        /* renamed from: b */
        private final boolean f20936b;

        /* renamed from: c */
        private final boolean f20937c;

        public a(j0 j0Var, boolean z10, boolean z11) {
            qc.q.i(j0Var, "node");
            this.f20935a = j0Var;
            this.f20936b = z10;
            this.f20937c = z11;
        }

        public final j0 a() {
            return this.f20935a;
        }

        public final boolean b() {
            return this.f20937c;
        }

        public final boolean c() {
            return this.f20936b;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20938a;

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
                iArr[j0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20938a = iArr;
        }
    }

    /* compiled from: MeasureAndLayoutDelegate.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<j0, Boolean> {

        /* renamed from: f */
        final /* synthetic */ boolean f20939f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10) {
            super(1);
            this.f20939f = z10;
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(j0 j0Var) {
            boolean c02;
            qc.q.i(j0Var, "it");
            if (this.f20939f) {
                c02 = j0Var.X();
            } else {
                c02 = j0Var.c0();
            }
            return Boolean.valueOf(c02);
        }
    }

    public t0(j0 j0Var) {
        p0 p0Var;
        qc.q.i(j0Var, "root");
        this.f20926a = j0Var;
        i1.a aVar = i1.f20809n;
        n nVar = new n(aVar.a());
        this.f20927b = nVar;
        this.f20929d = new f1();
        this.f20930e = new k0.f<>(new i1.b[16], 0);
        this.f20931f = 1L;
        k0.f<a> fVar = new k0.f<>(new a[16], 0);
        this.f20932g = fVar;
        if (aVar.a()) {
            p0Var = new p0(j0Var, nVar, fVar.h());
        } else {
            p0Var = null;
        }
        this.f20934i = p0Var;
    }

    public static /* synthetic */ boolean A(t0 t0Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.z(j0Var, z10);
    }

    public static /* synthetic */ boolean D(t0 t0Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.C(j0Var, z10);
    }

    public static /* synthetic */ boolean F(t0 t0Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.E(j0Var, z10);
    }

    private final void c() {
        k0.f<i1.b> fVar = this.f20930e;
        int o10 = fVar.o();
        if (o10 > 0) {
            i1.b[] n10 = fVar.n();
            int i10 = 0;
            do {
                n10[i10].c();
                i10++;
            } while (i10 < o10);
        }
        this.f20930e.i();
    }

    public static /* synthetic */ void e(t0 t0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        t0Var.d(z10);
    }

    private final boolean f(j0 j0Var, j2.b bVar) {
        boolean L0;
        if (j0Var.Z() == null) {
            return false;
        }
        if (bVar != null) {
            L0 = j0Var.K0(bVar);
        } else {
            L0 = j0.L0(j0Var, null, 1, null);
        }
        j0 l02 = j0Var.l0();
        if (L0 && l02 != null) {
            if (l02.Z() == null) {
                F(this, l02, false, 2, null);
            } else if (j0Var.f0() == j0.g.InMeasureBlock) {
                A(this, l02, false, 2, null);
            } else if (j0Var.f0() == j0.g.InLayoutBlock) {
                y(this, l02, false, 2, null);
            }
        }
        return L0;
    }

    private final boolean g(j0 j0Var, j2.b bVar) {
        boolean Y0;
        if (bVar != null) {
            Y0 = j0Var.X0(bVar);
        } else {
            Y0 = j0.Y0(j0Var, null, 1, null);
        }
        j0 l02 = j0Var.l0();
        if (Y0 && l02 != null) {
            if (j0Var.e0() == j0.g.InMeasureBlock) {
                F(this, l02, false, 2, null);
            } else if (j0Var.e0() == j0.g.InLayoutBlock) {
                D(this, l02, false, 2, null);
            }
        }
        return Y0;
    }

    private final boolean i(j0 j0Var) {
        if (j0Var.c0() && m(j0Var)) {
            return true;
        }
        return false;
    }

    private final boolean j(j0 j0Var) {
        boolean z10;
        p1.a d10;
        if (!j0Var.X()) {
            return false;
        }
        if (j0Var.f0() != j0.g.InMeasureBlock) {
            p1.b z11 = j0Var.T().z();
            if (z11 != null && (d10 = z11.d()) != null && d10.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    private final boolean m(j0 j0Var) {
        if (j0Var.e0() != j0.g.InMeasureBlock && !j0Var.T().q().d().k()) {
            return false;
        }
        return true;
    }

    private final void s(j0 j0Var) {
        w(j0Var);
        k0.f<j0> t02 = j0Var.t0();
        int o10 = t02.o();
        if (o10 > 0) {
            j0[] n10 = t02.n();
            int i10 = 0;
            do {
                j0 j0Var2 = n10[i10];
                if (m(j0Var2)) {
                    s(j0Var2);
                }
                i10++;
            } while (i10 < o10);
        }
        w(j0Var);
    }

    public final boolean u(j0 j0Var, boolean z10) {
        j2.b bVar;
        boolean z11;
        boolean g10;
        int i10 = 0;
        if (!j0Var.f() && !i(j0Var) && !qc.q.d(j0Var.I0(), Boolean.TRUE) && !j(j0Var) && !j0Var.B()) {
            return false;
        }
        if (!j0Var.X() && !j0Var.c0()) {
            g10 = false;
            z11 = false;
        } else {
            if (j0Var == this.f20926a) {
                bVar = this.f20933h;
                qc.q.f(bVar);
            } else {
                bVar = null;
            }
            if (j0Var.X() && z10) {
                z11 = f(j0Var, bVar);
            } else {
                z11 = false;
            }
            g10 = g(j0Var, bVar);
        }
        if ((z11 || j0Var.W()) && qc.q.d(j0Var.I0(), Boolean.TRUE) && z10) {
            j0Var.M0();
        }
        if (j0Var.U() && j0Var.f()) {
            if (j0Var == this.f20926a) {
                j0Var.V0(0, 0);
            } else {
                j0Var.b1();
            }
            this.f20929d.d(j0Var);
            p0 p0Var = this.f20934i;
            if (p0Var != null) {
                p0Var.a();
            }
        }
        if (this.f20932g.s()) {
            k0.f<a> fVar = this.f20932g;
            int o10 = fVar.o();
            if (o10 > 0) {
                a[] n10 = fVar.n();
                do {
                    a aVar = n10[i10];
                    if (aVar.a().H0()) {
                        if (!aVar.c()) {
                            E(aVar.a(), aVar.b());
                        } else {
                            z(aVar.a(), aVar.b());
                        }
                    }
                    i10++;
                } while (i10 < o10);
            }
            this.f20932g.i();
        }
        return g10;
    }

    static /* synthetic */ boolean v(t0 t0Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return t0Var.u(j0Var, z10);
    }

    private final void w(j0 j0Var) {
        j2.b bVar;
        if (!j0Var.c0() && !j0Var.X()) {
            return;
        }
        if (j0Var == this.f20926a) {
            bVar = this.f20933h;
            qc.q.f(bVar);
        } else {
            bVar = null;
        }
        if (j0Var.X()) {
            f(j0Var, bVar);
        }
        g(j0Var, bVar);
    }

    public static /* synthetic */ boolean y(t0 t0Var, j0 j0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t0Var.x(j0Var, z10);
    }

    public final void B(j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.f20929d.d(j0Var);
    }

    public final boolean C(j0 j0Var, boolean z10) {
        boolean z11;
        boolean z12;
        qc.q.i(j0Var, "layoutNode");
        int i10 = b.f20938a[j0Var.V().ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (i10 == 5) {
                if (!z10 && (j0Var.c0() || j0Var.U())) {
                    p0 p0Var = this.f20934i;
                    if (p0Var != null) {
                        p0Var.a();
                    }
                } else {
                    j0Var.N0();
                    if (j0Var.f()) {
                        j0 l02 = j0Var.l0();
                        if (l02 != null && l02.U()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (l02 != null && l02.c0()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                this.f20927b.c(j0Var, false);
                            }
                        }
                    }
                    if (!this.f20928c) {
                        return true;
                    }
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            p0 p0Var2 = this.f20934i;
            if (p0Var2 != null) {
                p0Var2.a();
            }
        }
        return false;
    }

    public final boolean E(j0 j0Var, boolean z10) {
        boolean z11;
        qc.q.i(j0Var, "layoutNode");
        int i10 = b.f20938a[j0Var.V().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 == 5) {
                    if (!j0Var.c0() || z10) {
                        j0Var.Q0();
                        if (j0Var.f() || i(j0Var)) {
                            j0 l02 = j0Var.l0();
                            if (l02 != null && l02.c0()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                this.f20927b.c(j0Var, false);
                            }
                        }
                        if (!this.f20928c) {
                            return true;
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.f20932g.d(new a(j0Var, false, z10));
                p0 p0Var = this.f20934i;
                if (p0Var != null) {
                    p0Var.a();
                }
            }
        }
        return false;
    }

    public final void G(long j10) {
        boolean g10;
        j2.b bVar = this.f20933h;
        boolean z10 = false;
        if (bVar == null) {
            g10 = false;
        } else {
            g10 = j2.b.g(bVar.t(), j10);
        }
        if (!g10) {
            if ((!this.f20928c) != false) {
                this.f20933h = j2.b.b(j10);
                if (this.f20926a.Z() != null) {
                    this.f20926a.P0();
                }
                this.f20926a.Q0();
                n nVar = this.f20927b;
                j0 j0Var = this.f20926a;
                if (j0Var.Z() != null) {
                    z10 = true;
                }
                nVar.c(j0Var, z10);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void d(boolean z10) {
        if (z10) {
            this.f20929d.e(this.f20926a);
        }
        this.f20929d.a();
    }

    public final void h(j0 j0Var, boolean z10) {
        qc.q.i(j0Var, "layoutNode");
        if (this.f20927b.f()) {
            return;
        }
        if (this.f20928c) {
            c cVar = new c(z10);
            if ((!cVar.invoke(j0Var).booleanValue()) != false) {
                k0.f<j0> t02 = j0Var.t0();
                int o10 = t02.o();
                if (o10 > 0) {
                    j0[] n10 = t02.n();
                    int i10 = 0;
                    do {
                        j0 j0Var2 = n10[i10];
                        if (cVar.invoke(j0Var2).booleanValue() && this.f20927b.i(j0Var2, z10)) {
                            u(j0Var2, z10);
                        }
                        if (!cVar.invoke(j0Var2).booleanValue()) {
                            h(j0Var2, z10);
                        }
                        i10++;
                    } while (i10 < o10);
                }
                if (cVar.invoke(j0Var).booleanValue() && this.f20927b.i(j0Var, z10)) {
                    v(this, j0Var, false, 2, null);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean k() {
        return this.f20927b.g();
    }

    public final boolean l() {
        return this.f20929d.c();
    }

    public final long n() {
        if (this.f20928c) {
            return this.f20931f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public final boolean o(pc.a<dc.w> aVar) {
        boolean z10;
        m mVar;
        if (this.f20926a.H0()) {
            if (this.f20926a.f()) {
                if ((!this.f20928c) != false) {
                    boolean z11 = false;
                    if (this.f20933h != null) {
                        this.f20928c = true;
                        try {
                            if (this.f20927b.g()) {
                                n nVar = this.f20927b;
                                z10 = false;
                                while (nVar.g()) {
                                    mVar = nVar.f20856a;
                                    boolean z12 = !mVar.d();
                                    j0 e10 = (z12 ? nVar.f20856a : nVar.f20857b).e();
                                    boolean u10 = u(e10, z12);
                                    if (e10 == this.f20926a && u10) {
                                        z10 = true;
                                    }
                                }
                                if (aVar != null) {
                                    aVar.invoke();
                                }
                            } else {
                                z10 = false;
                            }
                            this.f20928c = false;
                            p0 p0Var = this.f20934i;
                            if (p0Var != null) {
                                p0Var.a();
                            }
                            z11 = z10;
                        } catch (Throwable th) {
                            this.f20928c = false;
                            throw th;
                        }
                    }
                    c();
                    return z11;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void p(j0 j0Var, long j10) {
        qc.q.i(j0Var, "layoutNode");
        if ((!qc.q.d(j0Var, this.f20926a)) != false) {
            if (this.f20926a.H0()) {
                if (this.f20926a.f()) {
                    if ((!this.f20928c) != false) {
                        if (this.f20933h != null) {
                            this.f20928c = true;
                            try {
                                this.f20927b.h(j0Var);
                                boolean f10 = f(j0Var, j2.b.b(j10));
                                g(j0Var, j2.b.b(j10));
                                if ((f10 || j0Var.W()) && qc.q.d(j0Var.I0(), Boolean.TRUE)) {
                                    j0Var.M0();
                                }
                                if (j0Var.U() && j0Var.f()) {
                                    j0Var.b1();
                                    this.f20929d.d(j0Var);
                                }
                                this.f20928c = false;
                                p0 p0Var = this.f20934i;
                                if (p0Var != null) {
                                    p0Var.a();
                                }
                            } catch (Throwable th) {
                                this.f20928c = false;
                                throw th;
                            }
                        }
                        c();
                        return;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void q() {
        if (this.f20926a.H0()) {
            if (this.f20926a.f()) {
                if ((!this.f20928c) != false) {
                    if (this.f20933h != null) {
                        this.f20928c = true;
                        try {
                            s(this.f20926a);
                            this.f20928c = false;
                            p0 p0Var = this.f20934i;
                            if (p0Var != null) {
                                p0Var.a();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            this.f20928c = false;
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void r(j0 j0Var) {
        qc.q.i(j0Var, "node");
        this.f20927b.h(j0Var);
    }

    public final void t(i1.b bVar) {
        qc.q.i(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f20930e.d(bVar);
    }

    public final boolean x(j0 j0Var, boolean z10) {
        boolean z11;
        boolean z12;
        qc.q.i(j0Var, "layoutNode");
        int i10 = b.f20938a[j0Var.V().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            if ((j0Var.X() || j0Var.W()) && !z10) {
                p0 p0Var = this.f20934i;
                if (p0Var == null) {
                    return false;
                }
                p0Var.a();
                return false;
            }
            j0Var.O0();
            j0Var.N0();
            if (qc.q.d(j0Var.I0(), Boolean.TRUE)) {
                j0 l02 = j0Var.l0();
                if (l02 != null && l02.X()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    if (l02 != null && l02.W()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        this.f20927b.c(j0Var, true);
                    }
                }
            }
            if (this.f20928c) {
                return false;
            }
            return true;
        }
        p0 p0Var2 = this.f20934i;
        if (p0Var2 == null) {
            return false;
        }
        p0Var2.a();
        return false;
    }

    public final boolean z(j0 j0Var, boolean z10) {
        boolean z11;
        boolean z12;
        qc.q.i(j0Var, "layoutNode");
        if (j0Var.Z() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            int i10 = b.f20938a[j0Var.V().ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3 && i10 != 4) {
                    if (i10 == 5) {
                        if (!j0Var.X() || z10) {
                            j0Var.P0();
                            j0Var.Q0();
                            if (qc.q.d(j0Var.I0(), Boolean.TRUE) || j(j0Var)) {
                                j0 l02 = j0Var.l0();
                                if (l02 != null && l02.X()) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    this.f20927b.c(j0Var, true);
                                }
                            }
                            if (!this.f20928c) {
                                return true;
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    this.f20932g.d(new a(j0Var, true, z10));
                    p0 p0Var = this.f20934i;
                    if (p0Var != null) {
                        p0Var.a();
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadLayout".toString());
    }
}
