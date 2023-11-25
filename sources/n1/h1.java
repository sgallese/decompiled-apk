package n1;

import j0.g2;
import j0.g3;
import j0.l3;
import j0.y2;
import j0.z1;
import p1.g;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class h1 {

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<p1.j0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f19977f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc.a aVar) {
            super(0);
            this.f19977f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.j0, java.lang.Object] */
        @Override // pc.a
        public final p1.j0 invoke() {
            return this.f19977f.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f19978f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i1 i1Var) {
            super(0);
            this.f19978f = i1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f19978f.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<i1> f19979f;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g3 f19980a;

            public a(g3 g3Var) {
                this.f19980a = g3Var;
            }

            @Override // j0.e0
            public void dispose() {
                ((i1) this.f19980a.getValue()).d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g3<i1> g3Var) {
            super(1);
            this.f19979f = g3Var;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            return new a(this.f19979f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f19981f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f19982m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<g1, j2.b, j0> f19983p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<j1, j2.b, j0> f19984q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f19985r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ int f19986s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(i1 i1Var, androidx.compose.ui.e eVar, pc.p<? super g1, ? super j2.b, ? extends j0> pVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar2, int i10, int i11) {
            super(2);
            this.f19981f = i1Var;
            this.f19982m = eVar;
            this.f19983p = pVar;
            this.f19984q = pVar2;
            this.f19985r = i10;
            this.f19986s = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h1.c(this.f19981f, this.f19982m, this.f19983p, this.f19984q, lVar, z1.a(this.f19985r | 1), this.f19986s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f19987f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.p<j1, j2.b, j0> f19988m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f19989p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f19990q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.e eVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar, int i10, int i11) {
            super(2);
            this.f19987f = eVar;
            this.f19988m = pVar;
            this.f19989p = i10;
            this.f19990q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h1.a(this.f19987f, this.f19988m, lVar, z1.a(this.f19989p | 1), this.f19990q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.p<g1, j2.b, j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f19991f = new f();

        f() {
            super(2);
        }

        public final j0 a(g1 g1Var, long j10) {
            qc.q.i(g1Var, "$this$SubcomposeLayout");
            return g1Var.n0().invoke(g1Var, j2.b.b(j10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ j0 invoke(g1 g1Var, j2.b bVar) {
            return a(g1Var, bVar.t());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i1 f19992f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f19993m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j1, j2.b, j0> f19994p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f19995q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ int f19996r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(i1 i1Var, androidx.compose.ui.e eVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar, int i10, int i11) {
            super(2);
            this.f19992f = i1Var;
            this.f19993m = eVar;
            this.f19994p = pVar;
            this.f19995q = i10;
            this.f19996r = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            h1.b(this.f19992f, this.f19993m, this.f19994p, lVar, z1.a(this.f19995q | 1), this.f19996r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.p<g1, j2.b, j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final h f19997f = new h();

        h() {
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

    public static final void a(androidx.compose.ui.e eVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        qc.q.i(pVar, "measurePolicy");
        j0.l q10 = lVar.q(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.l(pVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f2335a;
            }
            if (j0.n.K()) {
                j0.n.V(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:72)");
            }
            q10.e(-492369756);
            Object f10 = q10.f();
            if (f10 == j0.l.f18688a.a()) {
                f10 = new i1();
                q10.J(f10);
            }
            q10.N();
            i1 i1Var = (i1) f10;
            int i16 = i12 << 3;
            b(i1Var, eVar, pVar, q10, (i16 & 112) | 8 | (i16 & 896), 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new e(eVar, pVar, i10, i11));
        }
    }

    public static final void b(i1 i1Var, androidx.compose.ui.e eVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar, j0.l lVar, int i10, int i11) {
        qc.q.i(i1Var, "state");
        qc.q.i(pVar, "measurePolicy");
        j0.l q10 = lVar.q(-511989831);
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f2335a;
        }
        if (j0.n.K()) {
            j0.n.V(-511989831, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:254)");
        }
        c(i1Var, eVar, f.f19991f, pVar, q10, (i10 & 112) | 392 | ((i10 << 3) & 7168), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new g(i1Var, eVar, pVar, i10, i11));
        }
    }

    public static final void c(i1 i1Var, androidx.compose.ui.e eVar, pc.p<? super g1, ? super j2.b, ? extends j0> pVar, pc.p<? super j1, ? super j2.b, ? extends j0> pVar2, j0.l lVar, int i10, int i11) {
        qc.q.i(i1Var, "state");
        qc.q.i(pVar2, "measurePolicy");
        j0.l q10 = lVar.q(2129414763);
        if ((i11 & 2) != 0) {
            eVar = androidx.compose.ui.e.f2335a;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if ((i11 & 4) != 0) {
            pVar = h.f19997f;
        }
        pc.p<? super g1, ? super j2.b, ? extends j0> pVar3 = pVar;
        if (j0.n.K()) {
            j0.n.V(2129414763, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:310)");
        }
        int a10 = j0.j.a(q10, 0);
        j0.p d10 = j0.j.d(q10, 0);
        androidx.compose.ui.e d11 = androidx.compose.ui.c.d(q10, eVar2);
        j0.v F = q10.F();
        pc.a<p1.j0> a11 = p1.j0.X.a();
        q10.e(1886828752);
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.x();
        if (q10.n()) {
            q10.B(new a(a11));
        } else {
            q10.H();
        }
        j0.l a12 = l3.a(q10);
        l3.b(a12, i1Var, i1Var.i());
        l3.b(a12, d10, i1Var.f());
        l3.b(a12, pVar2, i1Var.h());
        l3.b(a12, pVar3, i1Var.g());
        g.a aVar = p1.g.f20790l;
        l3.b(a12, F, aVar.g());
        l3.b(a12, d11, aVar.f());
        pc.p<p1.g, Integer, dc.w> b10 = aVar.b();
        if (a12.n() || !qc.q.d(a12.f(), Integer.valueOf(a10))) {
            a12.J(Integer.valueOf(a10));
            a12.I(Integer.valueOf(a10), b10);
        }
        q10.O();
        q10.N();
        q10.e(-607836798);
        if (!q10.t()) {
            j0.h0.f(new b(i1Var), q10, 0);
        }
        q10.N();
        g3 m10 = y2.m(i1Var, q10, 8);
        dc.w wVar = dc.w.f13270a;
        q10.e(1157296644);
        boolean Q = q10.Q(m10);
        Object f10 = q10.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new c(m10);
            q10.J(f10);
        }
        q10.N();
        j0.h0.b(wVar, (pc.l) f10, q10, 6);
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new d(i1Var, eVar2, pVar3, pVar2, i10, i11));
        }
    }
}
