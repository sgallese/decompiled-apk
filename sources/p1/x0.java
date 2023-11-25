package p1;

import a1.b4;
import a1.q4;
import a1.x3;
import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: NodeCoordinator.kt */
/* loaded from: classes.dex */
public abstract class x0 extends r0 implements n1.g0, n1.s, j1, pc.l<a1.h1, dc.w> {
    public static final e M = new e(null);
    private static final pc.l<x0, dc.w> N = d.f20960f;
    private static final pc.l<x0, dc.w> O = c.f20959f;
    private static final androidx.compose.ui.graphics.e P = new androidx.compose.ui.graphics.e();
    private static final a0 Q = new a0();
    private static final float[] R = x3.c(null, 1, null);
    private static final f S = new a();
    private static final f T = new b();
    private j2.e A;
    private j2.r B;
    private float C;
    private n1.j0 D;
    private Map<n1.a, Integer> E;
    private long F;
    private float G;
    private z0.d H;
    private a0 I;
    private final pc.a<dc.w> J;
    private boolean K;
    private g1 L;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f20953u;

    /* renamed from: v  reason: collision with root package name */
    private x0 f20954v;

    /* renamed from: w  reason: collision with root package name */
    private x0 f20955w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f20956x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f20957y;

    /* renamed from: z  reason: collision with root package name */
    private pc.l<? super androidx.compose.ui.graphics.d, dc.w> f20958z;

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class a implements f {
        a() {
        }

        @Override // p1.x0.f
        public int a() {
            return z0.a(16);
        }

        @Override // p1.x0.f
        public void b(j0 j0Var, long j10, v vVar, boolean z10, boolean z11) {
            qc.q.i(j0Var, "layoutNode");
            qc.q.i(vVar, "hitTestResult");
            j0Var.u0(j10, vVar, z10, z11);
        }

        @Override // p1.x0.f
        public boolean c(e.c cVar) {
            boolean z10;
            boolean z11;
            qc.q.i(cVar, "node");
            int a10 = z0.a(16);
            k0.f fVar = null;
            while (cVar != null) {
                if (cVar instanceof o1) {
                    if (((o1) cVar).g0()) {
                        return true;
                    }
                } else {
                    if ((cVar.k1() & a10) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && (cVar instanceof p1.l)) {
                        int i10 = 0;
                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                            if ((J1.k1() & a10) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                i10++;
                                if (i10 == 1) {
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
                        if (i10 == 1) {
                        }
                    }
                }
                cVar = p1.k.g(fVar);
            }
            return false;
        }

        @Override // p1.x0.f
        public boolean d(j0 j0Var) {
            qc.q.i(j0Var, "parentLayoutNode");
            return true;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class b implements f {
        b() {
        }

        @Override // p1.x0.f
        public int a() {
            return z0.a(8);
        }

        @Override // p1.x0.f
        public void b(j0 j0Var, long j10, v vVar, boolean z10, boolean z11) {
            qc.q.i(j0Var, "layoutNode");
            qc.q.i(vVar, "hitTestResult");
            j0Var.w0(j10, vVar, z10, z11);
        }

        @Override // p1.x0.f
        public boolean c(e.c cVar) {
            qc.q.i(cVar, "node");
            return false;
        }

        @Override // p1.x0.f
        public boolean d(j0 j0Var) {
            qc.q.i(j0Var, "parentLayoutNode");
            t1.l G = j0Var.G();
            boolean z10 = false;
            if (G != null && G.l()) {
                z10 = true;
            }
            return !z10;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<x0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f20959f = new c();

        c() {
            super(1);
        }

        public final void a(x0 x0Var) {
            qc.q.i(x0Var, "coordinator");
            g1 O1 = x0Var.O1();
            if (O1 != null) {
                O1.invalidate();
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(x0 x0Var) {
            a(x0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<x0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f20960f = new d();

        d() {
            super(1);
        }

        public final void a(x0 x0Var) {
            qc.q.i(x0Var, "coordinator");
            if (x0Var.M()) {
                a0 a0Var = x0Var.I;
                if (a0Var == null) {
                    x0.H2(x0Var, false, 1, null);
                    return;
                }
                x0.Q.b(a0Var);
                x0.H2(x0Var, false, 1, null);
                if (!x0.Q.c(a0Var)) {
                    j0 f12 = x0Var.f1();
                    o0 T = f12.T();
                    if (T.r() > 0) {
                        if (T.s() || T.t()) {
                            j0.h1(f12, false, 1, null);
                        }
                        T.D().p1();
                    }
                    i1 k02 = f12.k0();
                    if (k02 != null) {
                        k02.k(f12);
                    }
                }
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(x0 x0Var) {
            a(x0Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(qc.h hVar) {
            this();
        }

        public final f a() {
            return x0.S;
        }

        public final f b() {
            return x0.T;
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public interface f {
        int a();

        void b(j0 j0Var, long j10, v vVar, boolean z10, boolean z11);

        boolean c(e.c cVar);

        boolean d(j0 j0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e.c f20962m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f f20963p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f20964q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v f20965r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f20966s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f20967t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11) {
            super(0);
            this.f20962m = cVar;
            this.f20963p = fVar;
            this.f20964q = j10;
            this.f20965r = vVar;
            this.f20966s = z10;
            this.f20967t = z11;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.a2(y0.a(this.f20962m, this.f20963p.a(), z0.a(2)), this.f20963p, this.f20964q, this.f20965r, this.f20966s, this.f20967t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e.c f20969m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f f20970p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f20971q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v f20972r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f20973s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f20974t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f20975u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f20969m = cVar;
            this.f20970p = fVar;
            this.f20971q = j10;
            this.f20972r = vVar;
            this.f20973s = z10;
            this.f20974t = z11;
            this.f20975u = f10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.b2(y0.a(this.f20969m, this.f20970p.a(), z0.a(2)), this.f20970p, this.f20971q, this.f20972r, this.f20973s, this.f20974t, this.f20975u);
        }
    }

    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    static final class i extends qc.r implements pc.a<dc.w> {
        i() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0 V1 = x0.this.V1();
            if (V1 != null) {
                V1.e2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a1.h1 f20978m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(a1.h1 h1Var) {
            super(0);
            this.f20978m = h1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.G1(this.f20978m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e.c f20980m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f f20981p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f20982q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v f20983r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f20984s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ boolean f20985t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ float f20986u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f20980m = cVar;
            this.f20981p = fVar;
            this.f20982q = j10;
            this.f20983r = vVar;
            this.f20984s = z10;
            this.f20985t = z11;
            this.f20986u = f10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            x0.this.A2(y0.a(this.f20980m, this.f20981p.a(), z0.a(2)), this.f20981p, this.f20982q, this.f20983r, this.f20984s, this.f20985t, this.f20986u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NodeCoordinator.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<androidx.compose.ui.graphics.d, dc.w> f20987f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
            super(0);
            this.f20987f = lVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f20987f.invoke(x0.P);
        }
    }

    public x0(j0 j0Var) {
        qc.q.i(j0Var, "layoutNode");
        this.f20953u = j0Var;
        this.A = f1().I();
        this.B = f1().getLayoutDirection();
        this.C = 0.8f;
        this.F = j2.l.f18992b.a();
        this.J = new i();
    }

    private final void A1(x0 x0Var, z0.d dVar, boolean z10) {
        if (x0Var == this) {
            return;
        }
        x0 x0Var2 = this.f20955w;
        if (x0Var2 != null) {
            x0Var2.A1(x0Var, dVar, z10);
        }
        K1(dVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A2(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            d2(fVar, j10, vVar, z10, z11);
        } else if (fVar.c(cVar)) {
            vVar.v(cVar, f10, z11, new k(cVar, fVar, j10, vVar, z10, z11, f10));
        } else {
            A2(y0.a(cVar, fVar.a(), z0.a(2)), fVar, j10, vVar, z10, z11, f10);
        }
    }

    private final long B1(x0 x0Var, long j10) {
        if (x0Var == this) {
            return j10;
        }
        x0 x0Var2 = this.f20955w;
        if (x0Var2 != null && !qc.q.d(x0Var, x0Var2)) {
            return J1(x0Var2.B1(x0Var, j10));
        }
        return J1(j10);
    }

    private final x0 B2(n1.s sVar) {
        n1.c0 c0Var;
        x0 b10;
        if (sVar instanceof n1.c0) {
            c0Var = (n1.c0) sVar;
        } else {
            c0Var = null;
        }
        if (c0Var == null || (b10 = c0Var.b()) == null) {
            qc.q.g(sVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (x0) sVar;
        }
        return b10;
    }

    public static /* synthetic */ void F2(x0 x0Var, pc.l lVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            x0Var.E2(lVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(a1.h1 h1Var) {
        e.c Y1 = Y1(z0.a(4));
        if (Y1 == null) {
            q2(h1Var);
        } else {
            f1().a0().d(h1Var, j2.q.c(a()), this, Y1);
        }
    }

    private final void G2(boolean z10) {
        boolean z11;
        i1 k02;
        g1 g1Var = this.L;
        if (g1Var != null) {
            pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar = this.f20958z;
            if (lVar != null) {
                androidx.compose.ui.graphics.e eVar = P;
                eVar.s();
                eVar.t(f1().I());
                eVar.w(j2.q.c(a()));
                S1().h(this, N, new l(lVar));
                a0 a0Var = this.I;
                if (a0Var == null) {
                    a0Var = new a0();
                    this.I = a0Var;
                }
                a0Var.a(eVar);
                float B = eVar.B();
                float c12 = eVar.c1();
                float d10 = eVar.d();
                float F0 = eVar.F0();
                float r02 = eVar.r0();
                float o10 = eVar.o();
                long f10 = eVar.f();
                long r10 = eVar.r();
                float I0 = eVar.I0();
                float Z = eVar.Z();
                float f02 = eVar.f0();
                float C0 = eVar.C0();
                long H0 = eVar.H0();
                q4 p10 = eVar.p();
                boolean g10 = eVar.g();
                eVar.n();
                g1Var.a(B, c12, d10, F0, r02, o10, I0, Z, f02, C0, H0, p10, g10, null, f10, r10, eVar.j(), f1().getLayoutDirection(), f1().I());
                this.f20957y = eVar.g();
                this.C = eVar.d();
                if (z10 && (k02 = f1().k0()) != null) {
                    k02.r(f1());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.f20958z == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    static /* synthetic */ void H2(x0 x0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            x0Var.G2(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    private final void K1(z0.d dVar, boolean z10) {
        float j10 = j2.l.j(i1());
        dVar.i(dVar.b() - j10);
        dVar.j(dVar.c() - j10);
        float k10 = j2.l.k(i1());
        dVar.k(dVar.d() - k10);
        dVar.h(dVar.a() - k10);
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.c(dVar, true);
            if (this.f20957y && z10) {
                dVar.e(0.0f, 0.0f, j2.p.g(a()), j2.p.f(a()));
                dVar.f();
            }
        }
    }

    private final k1 S1() {
        return n0.b(f1()).getSnapshotObserver();
    }

    private final boolean X1(int i10) {
        e.c Z1 = Z1(a1.i(i10));
        if (Z1 == null || !p1.k.e(Z1, i10)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c Z1(boolean z10) {
        e.c T1;
        if (f1().j0() == this) {
            return f1().i0().k();
        }
        if (z10) {
            x0 x0Var = this.f20955w;
            if (x0Var != null && (T1 = x0Var.T1()) != null) {
                return T1.g1();
            }
        } else {
            x0 x0Var2 = this.f20955w;
            if (x0Var2 != null) {
                return x0Var2.T1();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11) {
        if (cVar == null) {
            d2(fVar, j10, vVar, z10, z11);
        } else {
            vVar.o(cVar, z11, new g(cVar, fVar, j10, vVar, z10, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(e.c cVar, f fVar, long j10, v vVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            d2(fVar, j10, vVar, z10, z11);
        } else {
            vVar.p(cVar, f10, z11, new h(cVar, fVar, j10, vVar, z10, z11, f10));
        }
    }

    private final long i2(long j10) {
        float q02;
        float m02;
        float o10 = z0.f.o(j10);
        if (o10 < 0.0f) {
            q02 = -o10;
        } else {
            q02 = o10 - q0();
        }
        float max = Math.max(0.0f, q02);
        float p10 = z0.f.p(j10);
        if (p10 < 0.0f) {
            m02 = -p10;
        } else {
            m02 = p10 - m0();
        }
        return z0.g.a(max, Math.max(0.0f, m02));
    }

    private final void r2(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        F2(this, lVar, false, 2, null);
        if (!j2.l.i(i1(), j10)) {
            w2(j10);
            f1().T().D().p1();
            g1 g1Var = this.L;
            if (g1Var != null) {
                g1Var.h(j10);
            } else {
                x0 x0Var = this.f20955w;
                if (x0Var != null) {
                    x0Var.e2();
                }
            }
            j1(this);
            i1 k02 = f1().k0();
            if (k02 != null) {
                k02.r(f1());
            }
        }
        this.G = f10;
    }

    public static /* synthetic */ void u2(x0 x0Var, z0.d dVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            x0Var.t2(dVar, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    @Override // n1.y0, n1.m
    public Object A() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!f1().i0().q(z0.a(64))) {
            return null;
        }
        T1();
        qc.f0 f0Var = new qc.f0();
        for (e.c o10 = f1().i0().o(); o10 != null; o10 = o10.m1()) {
            if ((z0.a(64) & o10.k1()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int a10 = z0.a(64);
                k0.f fVar = null;
                e.c cVar = o10;
                while (cVar != null) {
                    if (cVar instanceof l1) {
                        f0Var.f21676f = ((l1) cVar).y(f1().I(), f0Var.f21676f);
                    } else {
                        if ((cVar.k1() & a10) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 && (cVar instanceof p1.l)) {
                            int i10 = 0;
                            for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                if ((J1.k1() & a10) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    i10++;
                                    if (i10 == 1) {
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
                            if (i10 == 1) {
                            }
                        }
                    }
                    cVar = p1.k.g(fVar);
                }
            }
        }
        return f0Var.f21676f;
    }

    protected final long C1(long j10) {
        return z0.m.a(Math.max(0.0f, (z0.l.i(j10) - q0()) / 2.0f), Math.max(0.0f, (z0.l.g(j10) - m0()) / 2.0f));
    }

    public long C2(long j10) {
        g1 g1Var = this.L;
        if (g1Var != null) {
            j10 = g1Var.e(j10, false);
        }
        return j2.m.c(j10, i1());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float D1(long j10, long j11) {
        if (q0() >= z0.l.i(j11) && m0() >= z0.l.g(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long C1 = C1(j11);
        float i10 = z0.l.i(C1);
        float g10 = z0.l.g(C1);
        long i22 = i2(j10);
        if ((i10 <= 0.0f && g10 <= 0.0f) || z0.f.o(i22) > i10 || z0.f.p(i22) > g10) {
            return Float.POSITIVE_INFINITY;
        }
        return z0.f.n(i22);
    }

    public final z0.h D2() {
        if (!r()) {
            return z0.h.f26359e.a();
        }
        n1.s d10 = n1.t.d(this);
        z0.d R1 = R1();
        long C1 = C1(Q1());
        R1.i(-z0.l.i(C1));
        R1.k(-z0.l.g(C1));
        R1.j(q0() + z0.l.i(C1));
        R1.h(m0() + z0.l.g(C1));
        x0 x0Var = this;
        while (x0Var != d10) {
            x0Var.t2(R1, false, true);
            if (R1.f()) {
                return z0.h.f26359e.a();
            }
            x0Var = x0Var.f20955w;
            qc.q.f(x0Var);
        }
        return z0.e.a(R1);
    }

    public final void E1(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.g(h1Var);
            return;
        }
        float j10 = j2.l.j(i1());
        float k10 = j2.l.k(i1());
        h1Var.b(j10, k10);
        G1(h1Var);
        h1Var.b(-j10, -k10);
    }

    public final void E2(pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar, boolean z10) {
        boolean z11;
        i1 k02;
        j0 f12 = f1();
        if (!z10 && this.f20958z == lVar && qc.q.d(this.A, f12.I()) && this.B == f12.getLayoutDirection()) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f20958z = lVar;
        this.A = f12.I();
        this.B = f12.getLayoutDirection();
        if (r() && lVar != null) {
            if (this.L == null) {
                g1 u10 = n0.b(f12).u(this, this.J);
                u10.f(o0());
                u10.h(i1());
                this.L = u10;
                H2(this, false, 1, null);
                f12.o1(true);
                this.J.invoke();
                return;
            } else if (z11) {
                H2(this, false, 1, null);
                return;
            } else {
                return;
            }
        }
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.destroy();
            f12.o1(true);
            this.J.invoke();
            if (r() && (k02 = f12.k0()) != null) {
                k02.r(f12);
            }
        }
        this.L = null;
        this.K = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F1(a1.h1 h1Var, b4 b4Var) {
        qc.q.i(h1Var, "canvas");
        qc.q.i(b4Var, "paint");
        h1Var.h(new z0.h(0.5f, 0.5f, j2.p.g(o0()) - 0.5f, j2.p.f(o0()) - 0.5f), b4Var);
    }

    @Override // n1.s
    public final n1.s H() {
        if (r()) {
            j2();
            return f1().j0().f20955w;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public abstract void H1();

    public final x0 I1(x0 x0Var) {
        qc.q.i(x0Var, TaskSetupFragment.TYPE_OTHER);
        j0 f12 = x0Var.f1();
        j0 f13 = f1();
        if (f12 == f13) {
            e.c T1 = x0Var.T1();
            e.c T12 = T1();
            int a10 = z0.a(2);
            if (T12.getNode().p1()) {
                for (e.c m12 = T12.getNode().m1(); m12 != null; m12 = m12.m1()) {
                    if ((m12.k1() & a10) != 0 && m12 == T1) {
                        return x0Var;
                    }
                }
                return this;
            }
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        while (f12.J() > f13.J()) {
            f12 = f12.l0();
            qc.q.f(f12);
        }
        while (f13.J() > f12.J()) {
            f13 = f13.l0();
            qc.q.f(f13);
        }
        while (f12 != f13) {
            f12 = f12.l0();
            f13 = f13.l0();
            if (f12 == null || f13 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (f13 == f1()) {
            return this;
        }
        if (f12 != x0Var.f1()) {
            return f12.O();
        }
        return x0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean I2(long j10) {
        if (!z0.g.b(j10)) {
            return false;
        }
        g1 g1Var = this.L;
        if (g1Var != null && this.f20957y && !g1Var.d(j10)) {
            return false;
        }
        return true;
    }

    public long J1(long j10) {
        long b10 = j2.m.b(j10, i1());
        g1 g1Var = this.L;
        if (g1Var != null) {
            return g1Var.e(b10, true);
        }
        return b10;
    }

    @Override // n1.s
    public z0.h L(n1.s sVar, boolean z10) {
        qc.q.i(sVar, "sourceCoordinates");
        if (r()) {
            if (sVar.r()) {
                x0 B2 = B2(sVar);
                B2.j2();
                x0 I1 = I1(B2);
                z0.d R1 = R1();
                R1.i(0.0f);
                R1.k(0.0f);
                R1.j(j2.p.g(sVar.a()));
                R1.h(j2.p.f(sVar.a()));
                while (B2 != I1) {
                    u2(B2, R1, z10, false, 4, null);
                    if (R1.f()) {
                        return z0.h.f26359e.a();
                    }
                    B2 = B2.f20955w;
                    qc.q.f(B2);
                }
                A1(I1, R1, z10);
                return z0.e.a(R1);
            }
            throw new IllegalStateException(("LayoutCoordinates " + sVar + " is not attached!").toString());
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public p1.b L1() {
        return f1().T().q();
    }

    @Override // p1.j1
    public boolean M() {
        if (this.L != null && r()) {
            return true;
        }
        return false;
    }

    public final boolean M1() {
        return this.K;
    }

    public final long N1() {
        return s0();
    }

    @Override // n1.s
    public long O(n1.s sVar, long j10) {
        qc.q.i(sVar, "sourceCoordinates");
        if (sVar instanceof n1.c0) {
            return z0.f.w(sVar.O(this, z0.f.w(j10)));
        }
        x0 B2 = B2(sVar);
        B2.j2();
        x0 I1 = I1(B2);
        while (B2 != I1) {
            j10 = B2.C2(j10);
            B2 = B2.f20955w;
            qc.q.f(B2);
        }
        return B1(I1, j10);
    }

    public final g1 O1() {
        return this.L;
    }

    public abstract s0 P1();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n1.y0
    public void Q0(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        r2(j10, f10, lVar);
    }

    public final long Q1() {
        return this.A.S0(f1().p0().d());
    }

    protected final z0.d R1() {
        z0.d dVar = this.H;
        if (dVar == null) {
            z0.d dVar2 = new z0.d(0.0f, 0.0f, 0.0f, 0.0f);
            this.H = dVar2;
            return dVar2;
        }
        return dVar;
    }

    public abstract e.c T1();

    @Override // n1.s
    public long U(long j10) {
        if (r()) {
            j2();
            for (x0 x0Var = this; x0Var != null; x0Var = x0Var.f20955w) {
                j10 = x0Var.C2(j10);
            }
            return j10;
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final x0 U1() {
        return this.f20954v;
    }

    public final x0 V1() {
        return this.f20955w;
    }

    public final float W1() {
        return this.G;
    }

    public final e.c Y1(int i10) {
        boolean i11 = a1.i(i10);
        e.c T1 = T1();
        if (i11 || (T1 = T1.m1()) != null) {
            for (e.c Z1 = Z1(i11); Z1 != null && (Z1.f1() & i10) != 0; Z1 = Z1.g1()) {
                if ((Z1.k1() & i10) != 0) {
                    return Z1;
                }
                if (Z1 == T1) {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    @Override // p1.r0
    public r0 Z0() {
        return this.f20954v;
    }

    @Override // n1.s
    public final long a() {
        return o0();
    }

    public final void c2(f fVar, long j10, v vVar, boolean z10, boolean z11) {
        float D1;
        qc.q.i(fVar, "hitTestSource");
        qc.q.i(vVar, "hitTestResult");
        e.c Y1 = Y1(fVar.a());
        boolean z12 = true;
        if (!I2(j10)) {
            if (z10) {
                float D12 = D1(j10, Q1());
                if (Float.isInfinite(D12) || Float.isNaN(D12)) {
                    z12 = false;
                }
                if (z12 && vVar.s(D12, false)) {
                    b2(Y1, fVar, j10, vVar, z10, false, D12);
                }
            }
        } else if (Y1 == null) {
            d2(fVar, j10, vVar, z10, z11);
        } else if (g2(j10)) {
            a2(Y1, fVar, j10, vVar, z10, z11);
        } else {
            if (!z10) {
                D1 = Float.POSITIVE_INFINITY;
            } else {
                D1 = D1(j10, Q1());
            }
            if (Float.isInfinite(D1) || Float.isNaN(D1)) {
                z12 = false;
            }
            if (z12 && vVar.s(D1, z11)) {
                b2(Y1, fVar, j10, vVar, z10, z11, D1);
            } else {
                A2(Y1, fVar, j10, vVar, z10, z11, D1);
            }
        }
    }

    public void d2(f fVar, long j10, v vVar, boolean z10, boolean z11) {
        qc.q.i(fVar, "hitTestSource");
        qc.q.i(vVar, "hitTestResult");
        x0 x0Var = this.f20954v;
        if (x0Var != null) {
            x0Var.c2(fVar, x0Var.J1(j10), vVar, z10, z11);
        }
    }

    @Override // p1.r0
    public boolean e1() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    public void e2() {
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.invalidate();
            return;
        }
        x0 x0Var = this.f20955w;
        if (x0Var != null) {
            x0Var.e2();
        }
    }

    @Override // p1.r0
    public j0 f1() {
        return this.f20953u;
    }

    public void f2(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        if (f1().f()) {
            S1().h(this, O, new j(h1Var));
            this.K = false;
            return;
        }
        this.K = true;
    }

    @Override // p1.r0
    public n1.j0 g1() {
        n1.j0 j0Var = this.D;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier".toString());
    }

    protected final boolean g2(long j10) {
        float o10 = z0.f.o(j10);
        float p10 = z0.f.p(j10);
        if (o10 >= 0.0f && p10 >= 0.0f && o10 < q0() && p10 < m0()) {
            return true;
        }
        return false;
    }

    @Override // j2.e
    public float getDensity() {
        return f1().I().getDensity();
    }

    @Override // n1.n
    public j2.r getLayoutDirection() {
        return f1().getLayoutDirection();
    }

    @Override // p1.r0
    public r0 h1() {
        return this.f20955w;
    }

    public final boolean h2() {
        if (this.L != null && this.C <= 0.0f) {
            return true;
        }
        x0 x0Var = this.f20955w;
        if (x0Var != null) {
            return x0Var.h2();
        }
        return false;
    }

    @Override // p1.r0
    public long i1() {
        return this.F;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(a1.h1 h1Var) {
        f2(h1Var);
        return dc.w.f13270a;
    }

    public final void j2() {
        f1().T().O();
    }

    public void k2() {
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.invalidate();
        }
    }

    public final void l2() {
        E2(this.f20958z, true);
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.invalidate();
        }
    }

    @Override // p1.r0
    public void m1() {
        Q0(i1(), this.G, this.f20958z);
    }

    protected void m2(int i10, int i11) {
        boolean z10;
        boolean z11;
        g1 g1Var = this.L;
        if (g1Var != null) {
            g1Var.f(j2.q.a(i10, i11));
        } else {
            x0 x0Var = this.f20955w;
            if (x0Var != null) {
                x0Var.e2();
            }
        }
        T0(j2.q.a(i10, i11));
        G2(false);
        int a10 = z0.a(4);
        boolean i12 = a1.i(a10);
        e.c T1 = T1();
        if (i12 || (T1 = T1.m1()) != null) {
            for (e.c Z1 = Z1(i12); Z1 != null && (Z1.f1() & a10) != 0; Z1 = Z1.g1()) {
                if ((Z1.k1() & a10) != 0) {
                    e.c cVar = Z1;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof r) {
                            ((r) cVar).d0();
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof p1.l)) {
                                int i13 = 0;
                                for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                    if ((J1.k1() & a10) != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
                                }
                            }
                        }
                        cVar = p1.k.g(fVar);
                    }
                }
                if (Z1 == T1) {
                    break;
                }
            }
        }
        i1 k02 = f1().k0();
        if (k02 != null) {
            k02.r(f1());
        }
    }

    @Override // n1.s
    public long n(long j10) {
        return n0.b(f1()).e(U(j10));
    }

    public final void n2() {
        e.c m12;
        boolean z10;
        boolean z11;
        if (X1(z0.a(128))) {
            t0.g a10 = t0.g.f23297e.a();
            try {
                t0.g l10 = a10.l();
                try {
                    int a11 = z0.a(128);
                    boolean i10 = a1.i(a11);
                    if (i10) {
                        m12 = T1();
                    } else {
                        m12 = T1().m1();
                        if (m12 == null) {
                            dc.w wVar = dc.w.f13270a;
                        }
                    }
                    for (e.c Z1 = Z1(i10); Z1 != null && (Z1.f1() & a11) != 0; Z1 = Z1.g1()) {
                        if ((Z1.k1() & a11) != 0) {
                            e.c cVar = Z1;
                            k0.f fVar = null;
                            while (cVar != null) {
                                if (cVar instanceof c0) {
                                    ((c0) cVar).g(o0());
                                } else {
                                    if ((cVar.k1() & a11) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar instanceof p1.l)) {
                                        int i11 = 0;
                                        for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                            if ((J1.k1() & a11) != 0) {
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
                                cVar = p1.k.g(fVar);
                            }
                        }
                        if (Z1 == m12) {
                            break;
                        }
                    }
                    dc.w wVar2 = dc.w.f13270a;
                } finally {
                    a10.s(l10);
                }
            } finally {
                a10.d();
            }
        }
    }

    public final void o2() {
        boolean z10;
        boolean z11;
        int a10 = z0.a(128);
        boolean i10 = a1.i(a10);
        e.c T1 = T1();
        if (i10 || (T1 = T1.m1()) != null) {
            for (e.c Z1 = Z1(i10); Z1 != null && (Z1.f1() & a10) != 0; Z1 = Z1.g1()) {
                if ((Z1.k1() & a10) != 0) {
                    e.c cVar = Z1;
                    k0.f fVar = null;
                    while (cVar != null) {
                        if (cVar instanceof c0) {
                            ((c0) cVar).p(this);
                        } else {
                            if ((cVar.k1() & a10) != 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && (cVar instanceof p1.l)) {
                                int i11 = 0;
                                for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
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
                        cVar = p1.k.g(fVar);
                    }
                }
                if (Z1 == T1) {
                    return;
                }
            }
        }
    }

    @Override // j2.e
    public float p0() {
        return f1().I().p0();
    }

    public final void p2() {
        this.f20956x = true;
        if (this.L != null) {
            F2(this, null, false, 2, null);
        }
    }

    public void q2(a1.h1 h1Var) {
        qc.q.i(h1Var, "canvas");
        x0 x0Var = this.f20954v;
        if (x0Var != null) {
            x0Var.E1(h1Var);
        }
    }

    @Override // n1.s
    public boolean r() {
        if (!this.f20956x && f1().H0()) {
            return true;
        }
        return false;
    }

    public final void s2(long j10, float f10, pc.l<? super androidx.compose.ui.graphics.d, dc.w> lVar) {
        long g02 = g0();
        r2(j2.m.a(j2.l.j(j10) + j2.l.j(g02), j2.l.k(j10) + j2.l.k(g02)), f10, lVar);
    }

    public final void t2(z0.d dVar, boolean z10, boolean z11) {
        qc.q.i(dVar, "bounds");
        g1 g1Var = this.L;
        if (g1Var != null) {
            if (this.f20957y) {
                if (z11) {
                    long Q1 = Q1();
                    float i10 = z0.l.i(Q1) / 2.0f;
                    float g10 = z0.l.g(Q1) / 2.0f;
                    dVar.e(-i10, -g10, j2.p.g(a()) + i10, j2.p.f(a()) + g10);
                } else if (z10) {
                    dVar.e(0.0f, 0.0f, j2.p.g(a()), j2.p.f(a()));
                }
                if (dVar.f()) {
                    return;
                }
            }
            g1Var.c(dVar, false);
        }
        float j10 = j2.l.j(i1());
        dVar.i(dVar.b() + j10);
        dVar.j(dVar.c() + j10);
        float k10 = j2.l.k(i1());
        dVar.k(dVar.d() + k10);
        dVar.h(dVar.a() + k10);
    }

    public void v2(n1.j0 j0Var) {
        boolean z10;
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        n1.j0 j0Var2 = this.D;
        if (j0Var != j0Var2) {
            this.D = j0Var;
            if (j0Var2 == null || j0Var.getWidth() != j0Var2.getWidth() || j0Var.getHeight() != j0Var2.getHeight()) {
                m2(j0Var.getWidth(), j0Var.getHeight());
            }
            Map<n1.a, Integer> map = this.E;
            if (map != null && !map.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((!z10 || (!j0Var.d().isEmpty()) != false) && !qc.q.d(j0Var.d(), this.E)) {
                L1().d().m();
                Map map2 = this.E;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.E = map2;
                }
                map2.clear();
                map2.putAll(j0Var.d());
            }
        }
    }

    protected void w2(long j10) {
        this.F = j10;
    }

    public final void x2(x0 x0Var) {
        this.f20954v = x0Var;
    }

    @Override // n1.s
    public long y(long j10) {
        if (r()) {
            n1.s d10 = n1.t.d(this);
            return O(d10, z0.f.s(n0.b(f1()).f(j10), n1.t.e(d10)));
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    public final void y2(x0 x0Var) {
        this.f20955w = x0Var;
    }

    public final boolean z2() {
        boolean z10;
        boolean z11;
        e.c Z1 = Z1(a1.i(z0.a(16)));
        if (Z1 == null) {
            return false;
        }
        int a10 = z0.a(16);
        if (Z1.getNode().p1()) {
            e.c node = Z1.getNode();
            if ((node.f1() & a10) != 0) {
                for (e.c g12 = node.g1(); g12 != null; g12 = g12.g1()) {
                    if ((g12.k1() & a10) != 0) {
                        e.c cVar = g12;
                        k0.f fVar = null;
                        while (cVar != null) {
                            if (cVar instanceof o1) {
                                if (((o1) cVar).Q0()) {
                                    return true;
                                }
                            } else {
                                if ((cVar.k1() & a10) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && (cVar instanceof p1.l)) {
                                    int i10 = 0;
                                    for (e.c J1 = ((p1.l) cVar).J1(); J1 != null; J1 = J1.g1()) {
                                        if ((J1.k1() & a10) != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                            }
                            cVar = p1.k.g(fVar);
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
    }

    @Override // p1.r0
    public n1.s b1() {
        return this;
    }
}
