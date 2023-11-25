package androidx.compose.ui.node;

import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.b;
import k0.f;
import p1.a1;
import p1.c;
import p1.e0;
import p1.f0;
import p1.j0;
import p1.k;
import p1.o;
import p1.u0;
import p1.v1;
import p1.w0;
import p1.x;
import p1.x0;
import p1.z0;
import qc.q;

/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final j0 f2475a;

    /* renamed from: b */
    private final x f2476b;

    /* renamed from: c */
    private x0 f2477c;

    /* renamed from: d */
    private final e.c f2478d;

    /* renamed from: e */
    private e.c f2479e;

    /* renamed from: f */
    private f<e.b> f2480f;

    /* renamed from: g */
    private f<e.b> f2481g;

    /* renamed from: h */
    private C0035a f2482h;

    /* compiled from: NodeChain.kt */
    /* renamed from: androidx.compose.ui.node.a$a */
    /* loaded from: classes.dex */
    public final class C0035a implements o {

        /* renamed from: a */
        private e.c f2483a;

        /* renamed from: b */
        private int f2484b;

        /* renamed from: c */
        private f<e.b> f2485c;

        /* renamed from: d */
        private f<e.b> f2486d;

        /* renamed from: e */
        private boolean f2487e;

        /* renamed from: f */
        final /* synthetic */ a f2488f;

        public C0035a(a aVar, e.c cVar, int i10, f<e.b> fVar, f<e.b> fVar2, boolean z10) {
            q.i(cVar, "node");
            q.i(fVar, "before");
            q.i(fVar2, "after");
            this.f2488f = aVar;
            this.f2483a = cVar;
            this.f2484b = i10;
            this.f2485c = fVar;
            this.f2486d = fVar2;
            this.f2487e = z10;
        }

        @Override // p1.o
        public void a(int i10, int i11) {
            boolean z10;
            e.c g12 = this.f2483a.g1();
            q.f(g12);
            a.d(this.f2488f);
            if ((z0.a(2) & g12.k1()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                x0 h12 = g12.h1();
                q.f(h12);
                x0 V1 = h12.V1();
                x0 U1 = h12.U1();
                q.f(U1);
                if (V1 != null) {
                    V1.x2(U1);
                }
                U1.y2(V1);
                this.f2488f.v(this.f2483a, U1);
            }
            this.f2483a = this.f2488f.h(g12);
        }

        @Override // p1.o
        public boolean b(int i10, int i11) {
            f<e.b> fVar = this.f2485c;
            e.b bVar = fVar.n()[this.f2484b + i10];
            f<e.b> fVar2 = this.f2486d;
            if (androidx.compose.ui.node.b.d(bVar, fVar2.n()[this.f2484b + i11]) != 0) {
                return true;
            }
            return false;
        }

        @Override // p1.o
        public void c(int i10, int i11) {
            e.c g12 = this.f2483a.g1();
            q.f(g12);
            this.f2483a = g12;
            f<e.b> fVar = this.f2485c;
            e.b bVar = fVar.n()[this.f2484b + i10];
            f<e.b> fVar2 = this.f2486d;
            e.b bVar2 = fVar2.n()[this.f2484b + i11];
            if (!q.d(bVar, bVar2)) {
                this.f2488f.F(bVar, bVar2, this.f2483a);
                a.d(this.f2488f);
                return;
            }
            a.d(this.f2488f);
        }

        @Override // p1.o
        public void d(int i10) {
            int i11 = this.f2484b + i10;
            this.f2483a = this.f2488f.g(this.f2486d.n()[i11], this.f2483a);
            a.d(this.f2488f);
            if (this.f2487e) {
                e.c g12 = this.f2483a.g1();
                q.f(g12);
                x0 h12 = g12.h1();
                q.f(h12);
                e0 d10 = k.d(this.f2483a);
                if (d10 != null) {
                    f0 f0Var = new f0(this.f2488f.m(), d10);
                    this.f2483a.H1(f0Var);
                    this.f2488f.v(this.f2483a, f0Var);
                    f0Var.y2(h12.V1());
                    f0Var.x2(h12);
                    h12.y2(f0Var);
                } else {
                    this.f2483a.H1(h12);
                }
                this.f2483a.q1();
                this.f2483a.w1();
                a1.a(this.f2483a);
                return;
            }
            this.f2483a.B1(true);
        }

        public final void e(f<e.b> fVar) {
            q.i(fVar, "<set-?>");
            this.f2486d = fVar;
        }

        public final void f(f<e.b> fVar) {
            q.i(fVar, "<set-?>");
            this.f2485c = fVar;
        }

        public final void g(e.c cVar) {
            q.i(cVar, "<set-?>");
            this.f2483a = cVar;
        }

        public final void h(int i10) {
            this.f2484b = i10;
        }

        public final void i(boolean z10) {
            this.f2487e = z10;
        }
    }

    /* compiled from: NodeChain.kt */
    /* loaded from: classes.dex */
    public interface b {
    }

    public a(j0 j0Var) {
        q.i(j0Var, "layoutNode");
        this.f2475a = j0Var;
        x xVar = new x(j0Var);
        this.f2476b = xVar;
        this.f2477c = xVar;
        v1 T1 = xVar.T1();
        this.f2478d = T1;
        this.f2479e = T1;
    }

    private final void A(int i10, f<e.b> fVar, f<e.b> fVar2, e.c cVar, boolean z10) {
        w0.e(fVar.o() - i10, fVar2.o() - i10, j(cVar, i10, fVar, fVar2, z10));
        B();
    }

    private final void B() {
        b.a aVar;
        int i10 = 0;
        for (e.c m12 = this.f2478d.m1(); m12 != null; m12 = m12.m1()) {
            aVar = androidx.compose.ui.node.b.f2489a;
            if (m12 != aVar) {
                i10 |= m12.k1();
                m12.y1(i10);
            } else {
                return;
            }
        }
    }

    private final e.c D(e.c cVar) {
        b.a aVar;
        boolean z10;
        b.a aVar2;
        b.a aVar3;
        b.a aVar4;
        b.a aVar5;
        b.a aVar6;
        aVar = androidx.compose.ui.node.b.f2489a;
        boolean z11 = true;
        if (cVar == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            aVar2 = androidx.compose.ui.node.b.f2489a;
            e.c g12 = aVar2.g1();
            if (g12 == null) {
                g12 = this.f2478d;
            }
            g12.E1(null);
            aVar3 = androidx.compose.ui.node.b.f2489a;
            aVar3.A1(null);
            aVar4 = androidx.compose.ui.node.b.f2489a;
            aVar4.y1(-1);
            aVar5 = androidx.compose.ui.node.b.f2489a;
            aVar5.H1(null);
            aVar6 = androidx.compose.ui.node.b.f2489a;
            if (g12 == aVar6) {
                z11 = false;
            }
            if (z11) {
                return g12;
            }
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        throw new IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    public final void F(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof u0) && (bVar2 instanceof u0)) {
            androidx.compose.ui.node.b.f((u0) bVar2, cVar);
            if (cVar.p1()) {
                a1.e(cVar);
            } else {
                cVar.F1(true);
            }
        } else if (cVar instanceof c) {
            ((c) cVar).N1(bVar2);
            if (cVar.p1()) {
                a1.e(cVar);
            } else {
                cVar.F1(true);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public static final /* synthetic */ b d(a aVar) {
        aVar.getClass();
        return null;
    }

    public final e.c g(e.b bVar, e.c cVar) {
        e.c cVar2;
        if (bVar instanceof u0) {
            cVar2 = ((u0) bVar).e();
            cVar2.C1(a1.h(cVar2));
        } else {
            cVar2 = new c(bVar);
        }
        if ((!cVar2.p1()) != false) {
            cVar2.B1(true);
            return r(cVar2, cVar);
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    public final e.c h(e.c cVar) {
        if (cVar.p1()) {
            a1.d(cVar);
            cVar.x1();
            cVar.r1();
        }
        return w(cVar);
    }

    public final int i() {
        return this.f2479e.f1();
    }

    private final C0035a j(e.c cVar, int i10, f<e.b> fVar, f<e.b> fVar2, boolean z10) {
        C0035a c0035a = this.f2482h;
        if (c0035a == null) {
            C0035a c0035a2 = new C0035a(this, cVar, i10, fVar, fVar2, z10);
            this.f2482h = c0035a2;
            return c0035a2;
        }
        c0035a.g(cVar);
        c0035a.h(i10);
        c0035a.f(fVar);
        c0035a.e(fVar2);
        c0035a.i(z10);
        return c0035a;
    }

    private final e.c r(e.c cVar, e.c cVar2) {
        e.c g12 = cVar2.g1();
        if (g12 != null) {
            g12.E1(cVar);
            cVar.A1(g12);
        }
        cVar2.A1(cVar);
        cVar.E1(cVar2);
        return cVar;
    }

    private final e.c u() {
        b.a aVar;
        boolean z10;
        b.a aVar2;
        b.a aVar3;
        b.a aVar4;
        e.c cVar = this.f2479e;
        aVar = androidx.compose.ui.node.b.f2489a;
        if (cVar != aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e.c cVar2 = this.f2479e;
            aVar2 = androidx.compose.ui.node.b.f2489a;
            cVar2.E1(aVar2);
            aVar3 = androidx.compose.ui.node.b.f2489a;
            aVar3.A1(cVar2);
            aVar4 = androidx.compose.ui.node.b.f2489a;
            return aVar4;
        }
        throw new IllegalStateException("padChain called on already padded chain".toString());
    }

    public final void v(e.c cVar, x0 x0Var) {
        b.a aVar;
        x0 x0Var2;
        boolean z10;
        for (e.c m12 = cVar.m1(); m12 != null; m12 = m12.m1()) {
            aVar = androidx.compose.ui.node.b.f2489a;
            if (m12 == aVar) {
                j0 l02 = this.f2475a.l0();
                if (l02 != null) {
                    x0Var2 = l02.O();
                } else {
                    x0Var2 = null;
                }
                x0Var.y2(x0Var2);
                this.f2477c = x0Var;
                return;
            }
            if ((z0.a(2) & m12.k1()) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                m12.H1(x0Var);
            } else {
                return;
            }
        }
    }

    private final e.c w(e.c cVar) {
        e.c g12 = cVar.g1();
        e.c m12 = cVar.m1();
        if (g12 != null) {
            g12.E1(m12);
            cVar.A1(null);
        }
        if (m12 != null) {
            m12.A1(g12);
            cVar.E1(null);
        }
        q.f(m12);
        return m12;
    }

    public final void C() {
        x0 x0Var;
        f0 f0Var;
        x0 x0Var2 = this.f2476b;
        for (e.c m12 = this.f2478d.m1(); m12 != null; m12 = m12.m1()) {
            e0 d10 = k.d(m12);
            if (d10 != null) {
                if (m12.h1() != null) {
                    x0 h12 = m12.h1();
                    q.g(h12, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    f0Var = (f0) h12;
                    e0 L2 = f0Var.L2();
                    f0Var.N2(d10);
                    if (L2 != m12) {
                        f0Var.k2();
                    }
                } else {
                    f0Var = new f0(this.f2475a, d10);
                    m12.H1(f0Var);
                }
                x0Var2.y2(f0Var);
                f0Var.x2(x0Var2);
                x0Var2 = f0Var;
            } else {
                m12.H1(x0Var2);
            }
        }
        j0 l02 = this.f2475a.l0();
        if (l02 != null) {
            x0Var = l02.O();
        } else {
            x0Var = null;
        }
        x0Var2.y2(x0Var);
        this.f2477c = x0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(androidx.compose.ui.e r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.a.E(androidx.compose.ui.e):void");
    }

    public final e.c k() {
        return this.f2479e;
    }

    public final x l() {
        return this.f2476b;
    }

    public final j0 m() {
        return this.f2475a;
    }

    public final x0 n() {
        return this.f2477c;
    }

    public final e.c o() {
        return this.f2478d;
    }

    public final boolean p(int i10) {
        if ((i10 & i()) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i10) {
        if ((i10 & i()) != 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        for (e.c k10 = k(); k10 != null; k10 = k10.g1()) {
            k10.q1();
        }
    }

    public final void t() {
        for (e.c o10 = o(); o10 != null; o10 = o10.m1()) {
            if (o10.p1()) {
                o10.r1();
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f2479e == this.f2478d) {
            sb2.append("]");
        } else {
            e.c k10 = k();
            while (true) {
                if (k10 == null || k10 == o()) {
                    break;
                }
                sb2.append(String.valueOf(k10));
                if (k10.g1() == this.f2478d) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                k10 = k10.g1();
            }
        }
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final void x() {
        int o10;
        for (e.c o11 = o(); o11 != null; o11 = o11.m1()) {
            if (o11.p1()) {
                o11.v1();
            }
        }
        f<e.b> fVar = this.f2480f;
        if (fVar != null && (o10 = fVar.o()) > 0) {
            e.b[] n10 = fVar.n();
            int i10 = 0;
            do {
                e.b bVar = n10[i10];
                if (bVar instanceof SuspendPointerInputElement) {
                    fVar.A(i10, new ForceUpdateElement((u0) bVar));
                }
                i10++;
            } while (i10 < o10);
        }
        z();
        t();
    }

    public final void y() {
        for (e.c k10 = k(); k10 != null; k10 = k10.g1()) {
            k10.w1();
            if (k10.j1()) {
                a1.a(k10);
            }
            if (k10.o1()) {
                a1.e(k10);
            }
            k10.B1(false);
            k10.F1(false);
        }
    }

    public final void z() {
        for (e.c o10 = o(); o10 != null; o10 = o10.m1()) {
            if (o10.p1()) {
                o10.x1();
            }
        }
    }
}
