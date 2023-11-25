package e0;

import androidx.compose.ui.platform.a4;
import androidx.compose.ui.platform.w3;
import androidx.compose.ui.platform.x0;
import b2.j0;
import b2.k0;
import c0.a1;
import c0.e1;
import c0.f0;
import c0.t0;
import c0.v0;
import j0.d3;
import j0.j1;
import v1.g0;
import v1.i0;
import z0.f;

/* compiled from: TextFieldSelectionManager.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final a1 f13682a;

    /* renamed from: b  reason: collision with root package name */
    private b2.x f13683b;

    /* renamed from: c  reason: collision with root package name */
    private pc.l<? super j0, dc.w> f13684c;

    /* renamed from: d  reason: collision with root package name */
    private t0 f13685d;

    /* renamed from: e  reason: collision with root package name */
    private final j1 f13686e;

    /* renamed from: f  reason: collision with root package name */
    private b2.t0 f13687f;

    /* renamed from: g  reason: collision with root package name */
    private x0 f13688g;

    /* renamed from: h  reason: collision with root package name */
    private w3 f13689h;

    /* renamed from: i  reason: collision with root package name */
    private g1.a f13690i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.compose.ui.focus.k f13691j;

    /* renamed from: k  reason: collision with root package name */
    private final j1 f13692k;

    /* renamed from: l  reason: collision with root package name */
    private long f13693l;

    /* renamed from: m  reason: collision with root package name */
    private Integer f13694m;

    /* renamed from: n  reason: collision with root package name */
    private long f13695n;

    /* renamed from: o  reason: collision with root package name */
    private final j1 f13696o;

    /* renamed from: p  reason: collision with root package name */
    private final j1 f13697p;

    /* renamed from: q  reason: collision with root package name */
    private j0 f13698q;

    /* renamed from: r  reason: collision with root package name */
    private final f0 f13699r;

    /* renamed from: s  reason: collision with root package name */
    private final e0.g f13700s;

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class c implements e0.g {
        c() {
        }

        @Override // e0.g
        public boolean a(long j10, k kVar) {
            boolean z10;
            t0 E;
            v0 g10;
            qc.q.i(kVar, "adjustment");
            if (v.this.H().h().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || (E = v.this.E()) == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            int g11 = g10.g(j10, false);
            j0 H = vVar.H();
            Integer num = vVar.f13694m;
            qc.q.f(num);
            vVar.b0(H, num.intValue(), g11, false, kVar);
            return true;
        }

        @Override // e0.g
        public boolean b(long j10) {
            boolean z10;
            t0 E;
            v0 g10;
            if (v.this.H().h().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || (E = v.this.E()) == null || (g10 = E.g()) == null) {
                return false;
            }
            v vVar = v.this;
            vVar.b0(vVar.H(), vVar.C().b(i0.n(vVar.H().g())), g10.g(j10, false), false, k.f13641a.e());
            return true;
        }

        @Override // e0.g
        public boolean c(long j10, k kVar) {
            v0 g10;
            qc.q.i(kVar, "adjustment");
            androidx.compose.ui.focus.k y10 = v.this.y();
            if (y10 != null) {
                y10.e();
            }
            v.this.f13693l = j10;
            t0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null) {
                v vVar = v.this;
                vVar.f13694m = Integer.valueOf(v0.h(g10, j10, false, 2, null));
                int h10 = v0.h(g10, vVar.f13693l, false, 2, null);
                vVar.b0(vVar.H(), h10, h10, false, kVar);
                return true;
            }
            return false;
        }

        @Override // e0.g
        public boolean d(long j10) {
            v0 g10;
            t0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null) {
                v vVar = v.this;
                vVar.b0(vVar.H(), vVar.C().b(i0.n(vVar.H().g())), v0.h(g10, j10, false, 2, null), false, k.f13641a.e());
                return true;
            }
            return false;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<j0, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f13705f = new d();

        d() {
            super(1);
        }

        public final void a(j0 j0Var) {
            qc.q.i(j0Var, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(j0 j0Var) {
            a(j0Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.a<dc.w> {
        e() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v.l(v.this, false, 1, null);
            v.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.a<dc.w> {
        f() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v.this.o();
            v.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<dc.w> {
        g() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v.this.L();
            v.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<dc.w> {
        h() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            v.this.M();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [c0.a1, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.v.<init>():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(z0.f fVar) {
        this.f13697p.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(c0.l lVar) {
        this.f13696o.setValue(lVar);
    }

    private final void S(c0.m mVar) {
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            t0Var.u(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(j0 j0Var, int i10, int i11, boolean z10, k kVar) {
        g0 g0Var;
        v0 g10;
        long b10 = v1.j0.b(this.f13683b.b(i0.n(j0Var.g())), this.f13683b.b(i0.i(j0Var.g())));
        t0 t0Var = this.f13685d;
        i0 i0Var = null;
        if (t0Var != null && (g10 = t0Var.g()) != null) {
            g0Var = g10.i();
        } else {
            g0Var = null;
        }
        if (!i0.h(b10)) {
            i0Var = i0.b(b10);
        }
        long a10 = u.a(g0Var, i10, i11, i0Var, z10, kVar);
        long b11 = v1.j0.b(this.f13683b.a(i0.n(a10)), this.f13683b.a(i0.i(a10)));
        if (i0.g(b11, j0Var.g())) {
            return;
        }
        g1.a aVar = this.f13690i;
        if (aVar != null) {
            aVar.a(g1.b.f16006a.b());
        }
        this.f13684c.invoke(m(j0Var.e(), b11));
        t0 t0Var2 = this.f13685d;
        if (t0Var2 != null) {
            t0Var2.D(w.c(this, true));
        }
        t0 t0Var3 = this.f13685d;
        if (t0Var3 != null) {
            t0Var3.C(w.c(this, false));
        }
    }

    public static /* synthetic */ void l(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        vVar.k(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0 m(v1.d dVar, long j10) {
        return new j0(dVar, j10, (i0) null, 4, (qc.h) null);
    }

    public static /* synthetic */ void q(v vVar, z0.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = null;
        }
        vVar.p(fVar);
    }

    private final z0.h t() {
        long c10;
        long c11;
        float f10;
        n1.s f11;
        float f12;
        g0 i10;
        z0.h d10;
        n1.s f13;
        float f14;
        g0 i11;
        z0.h d11;
        n1.s f15;
        n1.s f16;
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            if ((!t0Var.t()) == false) {
                t0Var = null;
            }
            if (t0Var != null) {
                int b10 = this.f13683b.b(i0.n(H().g()));
                int b11 = this.f13683b.b(i0.i(H().g()));
                t0 t0Var2 = this.f13685d;
                if (t0Var2 != null && (f16 = t0Var2.f()) != null) {
                    c10 = f16.U(z(true));
                } else {
                    c10 = z0.f.f26354b.c();
                }
                t0 t0Var3 = this.f13685d;
                if (t0Var3 != null && (f15 = t0Var3.f()) != null) {
                    c11 = f15.U(z(false));
                } else {
                    c11 = z0.f.f26354b.c();
                }
                t0 t0Var4 = this.f13685d;
                float f17 = 0.0f;
                if (t0Var4 != null && (f13 = t0Var4.f()) != null) {
                    v0 g10 = t0Var.g();
                    if (g10 != null && (i11 = g10.i()) != null && (d11 = i11.d(b10)) != null) {
                        f14 = d11.l();
                    } else {
                        f14 = 0.0f;
                    }
                    f10 = z0.f.p(f13.U(z0.g.a(0.0f, f14)));
                } else {
                    f10 = 0.0f;
                }
                t0 t0Var5 = this.f13685d;
                if (t0Var5 != null && (f11 = t0Var5.f()) != null) {
                    v0 g11 = t0Var.g();
                    if (g11 != null && (i10 = g11.i()) != null && (d10 = i10.d(b11)) != null) {
                        f12 = d10.l();
                    } else {
                        f12 = 0.0f;
                    }
                    f17 = z0.f.p(f11.U(z0.g.a(0.0f, f12)));
                }
                return new z0.h(Math.min(z0.f.o(c10), z0.f.o(c11)), Math.min(f10, f17), Math.max(z0.f.o(c10), z0.f.o(c11)), Math.max(z0.f.p(c10), z0.f.p(c11)) + (j2.h.j(25) * t0Var.r().a().getDensity()));
            }
        }
        return z0.h.f26359e.a();
    }

    public final g1.a A() {
        return this.f13690i;
    }

    public final e0.g B() {
        return this.f13700s;
    }

    public final b2.x C() {
        return this.f13683b;
    }

    public final pc.l<j0, dc.w> D() {
        return this.f13684c;
    }

    public final t0 E() {
        return this.f13685d;
    }

    public final w3 F() {
        return this.f13689h;
    }

    public final f0 G() {
        return this.f13699r;
    }

    public final j0 H() {
        return (j0) this.f13686e.getValue();
    }

    public final f0 I(boolean z10) {
        return new b(z10);
    }

    public final void J() {
        a4 a4Var;
        w3 w3Var;
        w3 w3Var2 = this.f13689h;
        if (w3Var2 != null) {
            a4Var = w3Var2.getStatus();
        } else {
            a4Var = null;
        }
        if (a4Var == a4.Shown && (w3Var = this.f13689h) != null) {
            w3Var.b();
        }
    }

    public final boolean K() {
        return !qc.q.d(this.f13698q.h(), H().h());
    }

    public final void L() {
        v1.d text;
        x0 x0Var = this.f13688g;
        if (x0Var != null && (text = x0Var.getText()) != null) {
            v1.d m10 = k0.c(H(), H().h().length()).m(text).m(k0.b(H(), H().h().length()));
            int l10 = i0.l(H().g()) + text.length();
            this.f13684c.invoke(m(m10, v1.j0.b(l10, l10)));
            S(c0.m.None);
            a1 a1Var = this.f13682a;
            if (a1Var != null) {
                a1Var.a();
            }
        }
    }

    public final void M() {
        j0 m10 = m(H().e(), v1.j0.b(0, H().h().length()));
        this.f13684c.invoke(m10);
        this.f13698q = j0.d(this.f13698q, null, m10.g(), null, 5, null);
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            t0Var.B(true);
        }
    }

    public final void N(x0 x0Var) {
        this.f13688g = x0Var;
    }

    public final void Q(boolean z10) {
        this.f13692k.setValue(Boolean.valueOf(z10));
    }

    public final void R(androidx.compose.ui.focus.k kVar) {
        this.f13691j = kVar;
    }

    public final void T(g1.a aVar) {
        this.f13690i = aVar;
    }

    public final void U(b2.x xVar) {
        qc.q.i(xVar, "<set-?>");
        this.f13683b = xVar;
    }

    public final void V(pc.l<? super j0, dc.w> lVar) {
        qc.q.i(lVar, "<set-?>");
        this.f13684c = lVar;
    }

    public final void W(t0 t0Var) {
        this.f13685d = t0Var;
    }

    public final void X(w3 w3Var) {
        this.f13689h = w3Var;
    }

    public final void Y(j0 j0Var) {
        qc.q.i(j0Var, "<set-?>");
        this.f13686e.setValue(j0Var);
    }

    public final void Z(b2.t0 t0Var) {
        qc.q.i(t0Var, "<set-?>");
        this.f13687f = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0() {
        /*
            r8 = this;
            b2.j0 r0 = r8.H()
            long r0 = r0.g()
            boolean r0 = v1.i0.h(r0)
            r1 = 0
            if (r0 != 0) goto L16
            e0.v$e r0 = new e0.v$e
            r0.<init>()
            r4 = r0
            goto L17
        L16:
            r4 = r1
        L17:
            b2.j0 r0 = r8.H()
            long r2 = r0.g()
            boolean r0 = v1.i0.h(r2)
            if (r0 != 0) goto L32
            boolean r0 = r8.x()
            if (r0 == 0) goto L32
            e0.v$f r0 = new e0.v$f
            r0.<init>()
            r6 = r0
            goto L33
        L32:
            r6 = r1
        L33:
            boolean r0 = r8.x()
            if (r0 == 0) goto L4f
            androidx.compose.ui.platform.x0 r0 = r8.f13688g
            r2 = 0
            if (r0 == 0) goto L46
            boolean r0 = r0.a()
            r3 = 1
            if (r0 != r3) goto L46
            r2 = 1
        L46:
            if (r2 == 0) goto L4f
            e0.v$g r0 = new e0.v$g
            r0.<init>()
            r5 = r0
            goto L50
        L4f:
            r5 = r1
        L50:
            b2.j0 r0 = r8.H()
            long r2 = r0.g()
            int r0 = v1.i0.j(r2)
            b2.j0 r2 = r8.H()
            java.lang.String r2 = r2.h()
            int r2 = r2.length()
            if (r0 == r2) goto L6f
            e0.v$h r1 = new e0.v$h
            r1.<init>()
        L6f:
            r7 = r1
            androidx.compose.ui.platform.w3 r2 = r8.f13689h
            if (r2 == 0) goto L7b
            z0.h r3 = r8.t()
            r2.a(r3, r4, r5, r6, r7)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.v.a0():void");
    }

    public final void k(boolean z10) {
        if (i0.h(H().g())) {
            return;
        }
        x0 x0Var = this.f13688g;
        if (x0Var != null) {
            x0Var.b(k0.a(H()));
        }
        if (!z10) {
            return;
        }
        int k10 = i0.k(H().g());
        this.f13684c.invoke(m(H().e(), v1.j0.b(k10, k10)));
        S(c0.m.None);
    }

    public final f0 n() {
        return new a();
    }

    public final void o() {
        if (i0.h(H().g())) {
            return;
        }
        x0 x0Var = this.f13688g;
        if (x0Var != null) {
            x0Var.b(k0.a(H()));
        }
        v1.d m10 = k0.c(H(), H().h().length()).m(k0.b(H(), H().h().length()));
        int l10 = i0.l(H().g());
        this.f13684c.invoke(m(m10, v1.j0.b(l10, l10)));
        S(c0.m.None);
        a1 a1Var = this.f13682a;
        if (a1Var != null) {
            a1Var.a();
        }
    }

    public final void p(z0.f fVar) {
        c0.m mVar;
        boolean z10;
        v0 v0Var;
        int k10;
        if (!i0.h(H().g())) {
            t0 t0Var = this.f13685d;
            if (t0Var != null) {
                v0Var = t0Var.g();
            } else {
                v0Var = null;
            }
            v0 v0Var2 = v0Var;
            if (fVar != null && v0Var2 != null) {
                k10 = this.f13683b.a(v0.h(v0Var2, fVar.x(), false, 2, null));
            } else {
                k10 = i0.k(H().g());
            }
            this.f13684c.invoke(j0.d(H(), null, v1.j0.a(k10), null, 5, null));
        }
        if (fVar != null) {
            if (H().h().length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                mVar = c0.m.Cursor;
                S(mVar);
                J();
            }
        }
        mVar = c0.m.None;
        S(mVar);
        J();
    }

    public final void r() {
        androidx.compose.ui.focus.k kVar;
        t0 t0Var = this.f13685d;
        boolean z10 = false;
        if (t0Var != null && !t0Var.d()) {
            z10 = true;
        }
        if (z10 && (kVar = this.f13691j) != null) {
            kVar.e();
        }
        this.f13698q = H();
        t0 t0Var2 = this.f13685d;
        if (t0Var2 != null) {
            t0Var2.B(true);
        }
        S(c0.m.Selection);
    }

    public final void s() {
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            t0Var.B(false);
        }
        S(c0.m.None);
    }

    public final z0.f u() {
        return (z0.f) this.f13697p.getValue();
    }

    public final long v(j2.e eVar) {
        v0 v0Var;
        int l10;
        qc.q.i(eVar, "density");
        int b10 = this.f13683b.b(i0.n(H().g()));
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            v0Var = t0Var.g();
        } else {
            v0Var = null;
        }
        qc.q.f(v0Var);
        g0 i10 = v0Var.i();
        l10 = vc.l.l(b10, 0, i10.k().j().length());
        z0.h d10 = i10.d(l10);
        return z0.g.a(d10.i() + (eVar.v0(c0.g0.c()) / 2), d10.e());
    }

    public final c0.l w() {
        return (c0.l) this.f13696o.getValue();
    }

    public final boolean x() {
        return ((Boolean) this.f13692k.getValue()).booleanValue();
    }

    public final androidx.compose.ui.focus.k y() {
        return this.f13691j;
    }

    public final long z(boolean z10) {
        int i10;
        v0 v0Var;
        long g10 = H().g();
        if (z10) {
            i10 = i0.n(g10);
        } else {
            i10 = i0.i(g10);
        }
        t0 t0Var = this.f13685d;
        if (t0Var != null) {
            v0Var = t0Var.g();
        } else {
            v0Var = null;
        }
        qc.q.f(v0Var);
        return b0.b(v0Var.i(), this.f13683b.b(i10), z10, i0.m(H().g()));
    }

    public v(a1 a1Var) {
        j1 e10;
        j1 e11;
        j1 e12;
        j1 e13;
        this.f13682a = a1Var;
        this.f13683b = e1.b();
        this.f13684c = d.f13705f;
        i0 i0Var = null;
        int i10 = 7;
        qc.h hVar = null;
        e10 = d3.e(new j0((String) null, 0L, i0Var, i10, hVar), null, 2, null);
        this.f13686e = e10;
        this.f13687f = b2.t0.f7844a.a();
        e11 = d3.e(Boolean.TRUE, null, 2, null);
        this.f13692k = e11;
        f.a aVar = z0.f.f26354b;
        this.f13693l = aVar.c();
        this.f13695n = aVar.c();
        e12 = d3.e(null, null, 2, null);
        this.f13696o = e12;
        e13 = d3.e(null, null, 2, null);
        this.f13697p = e13;
        this.f13698q = new j0((String) null, 0L, i0Var, i10, hVar);
        this.f13699r = new i();
        this.f13700s = new c();
    }

    public /* synthetic */ v(a1 a1Var, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : a1Var);
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class a implements f0 {
        a() {
        }

        @Override // c0.f0
        public void b(long j10) {
            v.this.P(c0.l.Cursor);
            v vVar = v.this;
            vVar.O(z0.f.d(n.a(vVar.z(true))));
        }

        @Override // c0.f0
        public void c(long j10) {
            v vVar = v.this;
            vVar.f13693l = n.a(vVar.z(true));
            v vVar2 = v.this;
            vVar2.O(z0.f.d(vVar2.f13693l));
            v.this.f13695n = z0.f.f26354b.c();
            v.this.P(c0.l.Cursor);
        }

        @Override // c0.f0
        public void d() {
            v.this.P(null);
            v.this.O(null);
        }

        @Override // c0.f0
        public void e(long j10) {
            v0 g10;
            g0 i10;
            v vVar = v.this;
            vVar.f13695n = z0.f.t(vVar.f13695n, j10);
            t0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null && (i10 = g10.i()) != null) {
                v vVar2 = v.this;
                vVar2.O(z0.f.d(z0.f.t(vVar2.f13693l, vVar2.f13695n)));
                b2.x C = vVar2.C();
                z0.f u10 = vVar2.u();
                qc.q.f(u10);
                int a10 = C.a(i10.w(u10.x()));
                long b10 = v1.j0.b(a10, a10);
                if (i0.g(b10, vVar2.H().g())) {
                    return;
                }
                g1.a A = vVar2.A();
                if (A != null) {
                    A.a(g1.b.f16006a.b());
                }
                vVar2.D().invoke(vVar2.m(vVar2.H().e(), b10));
            }
        }

        @Override // c0.f0
        public void onStop() {
            v.this.P(null);
            v.this.O(null);
        }

        @Override // c0.f0
        public void a() {
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class b implements f0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13703b;

        b(boolean z10) {
            this.f13703b = z10;
        }

        @Override // c0.f0
        public void b(long j10) {
            c0.l lVar;
            v vVar = v.this;
            if (this.f13703b) {
                lVar = c0.l.SelectionStart;
            } else {
                lVar = c0.l.SelectionEnd;
            }
            vVar.P(lVar);
            v vVar2 = v.this;
            vVar2.O(z0.f.d(n.a(vVar2.z(this.f13703b))));
        }

        @Override // c0.f0
        public void c(long j10) {
            c0.l lVar;
            v vVar = v.this;
            vVar.f13693l = n.a(vVar.z(this.f13703b));
            v vVar2 = v.this;
            vVar2.O(z0.f.d(vVar2.f13693l));
            v.this.f13695n = z0.f.f26354b.c();
            v vVar3 = v.this;
            if (this.f13703b) {
                lVar = c0.l.SelectionStart;
            } else {
                lVar = c0.l.SelectionEnd;
            }
            vVar3.P(lVar);
            t0 E = v.this.E();
            if (E != null) {
                E.B(false);
            }
        }

        @Override // c0.f0
        public void d() {
            v.this.P(null);
            v.this.O(null);
        }

        @Override // c0.f0
        public void e(long j10) {
            v0 g10;
            g0 i10;
            int b10;
            int w10;
            v vVar = v.this;
            vVar.f13695n = z0.f.t(vVar.f13695n, j10);
            t0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null && (i10 = g10.i()) != null) {
                v vVar2 = v.this;
                boolean z10 = this.f13703b;
                vVar2.O(z0.f.d(z0.f.t(vVar2.f13693l, vVar2.f13695n)));
                if (z10) {
                    z0.f u10 = vVar2.u();
                    qc.q.f(u10);
                    b10 = i10.w(u10.x());
                } else {
                    b10 = vVar2.C().b(i0.n(vVar2.H().g()));
                }
                int i11 = b10;
                if (z10) {
                    w10 = vVar2.C().b(i0.i(vVar2.H().g()));
                } else {
                    z0.f u11 = vVar2.u();
                    qc.q.f(u11);
                    w10 = i10.w(u11.x());
                }
                vVar2.b0(vVar2.H(), i11, w10, z10, k.f13641a.c());
            }
            t0 E2 = v.this.E();
            if (E2 != null) {
                E2.B(false);
            }
        }

        @Override // c0.f0
        public void onStop() {
            a4 a4Var = null;
            v.this.P(null);
            v.this.O(null);
            t0 E = v.this.E();
            if (E != null) {
                E.B(true);
            }
            w3 F = v.this.F();
            if (F != null) {
                a4Var = F.getStatus();
            }
            if (a4Var == a4.Hidden) {
                v.this.a0();
            }
        }

        @Override // c0.f0
        public void a() {
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    /* loaded from: classes.dex */
    public static final class i implements f0 {
        i() {
        }

        @Override // c0.f0
        public void c(long j10) {
            boolean z10;
            v0 g10;
            t0 E;
            v0 g11;
            v0 g12;
            if (v.this.w() == null) {
                v.this.P(c0.l.SelectionEnd);
                v.this.J();
                t0 E2 = v.this.E();
                boolean z11 = true;
                if (E2 != null && (g12 = E2.g()) != null && g12.j(j10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && (E = v.this.E()) != null && (g11 = E.g()) != null) {
                    v vVar = v.this;
                    int a10 = vVar.C().a(v0.e(g11, g11.f(z0.f.p(j10)), false, 2, null));
                    g1.a A = vVar.A();
                    if (A != null) {
                        A.a(g1.b.f16006a.b());
                    }
                    j0 m10 = vVar.m(vVar.H().e(), v1.j0.b(a10, a10));
                    vVar.r();
                    vVar.D().invoke(m10);
                    return;
                }
                if (v.this.H().h().length() != 0) {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
                v.this.r();
                t0 E3 = v.this.E();
                if (E3 != null && (g10 = E3.g()) != null) {
                    v vVar2 = v.this;
                    int h10 = v0.h(g10, j10, false, 2, null);
                    vVar2.b0(vVar2.H(), h10, h10, false, k.f13641a.g());
                    vVar2.f13694m = Integer.valueOf(h10);
                }
                v.this.f13693l = j10;
                v vVar3 = v.this;
                vVar3.O(z0.f.d(vVar3.f13693l));
                v.this.f13695n = z0.f.f26354b.c();
            }
        }

        @Override // c0.f0
        public void e(long j10) {
            boolean z10;
            v0 g10;
            int g11;
            if (v.this.H().h().length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            v vVar = v.this;
            vVar.f13695n = z0.f.t(vVar.f13695n, j10);
            t0 E = v.this.E();
            if (E != null && (g10 = E.g()) != null) {
                v vVar2 = v.this;
                vVar2.O(z0.f.d(z0.f.t(vVar2.f13693l, vVar2.f13695n)));
                Integer num = vVar2.f13694m;
                if (num != null) {
                    g11 = num.intValue();
                } else {
                    g11 = g10.g(vVar2.f13693l, false);
                }
                int i10 = g11;
                z0.f u10 = vVar2.u();
                qc.q.f(u10);
                vVar2.b0(vVar2.H(), i10, g10.g(u10.x(), false), false, k.f13641a.g());
            }
            t0 E2 = v.this.E();
            if (E2 != null) {
                E2.B(false);
            }
        }

        @Override // c0.f0
        public void onStop() {
            a4 a4Var;
            v.this.P(null);
            v.this.O(null);
            t0 E = v.this.E();
            if (E != null) {
                E.B(true);
            }
            w3 F = v.this.F();
            if (F != null) {
                a4Var = F.getStatus();
            } else {
                a4Var = null;
            }
            if (a4Var == a4.Hidden) {
                v.this.a0();
            }
            v.this.f13694m = null;
        }

        @Override // c0.f0
        public void a() {
        }

        @Override // c0.f0
        public void d() {
        }

        @Override // c0.f0
        public void b(long j10) {
        }
    }
}
