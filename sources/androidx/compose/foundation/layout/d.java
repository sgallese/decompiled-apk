package androidx.compose.foundation.layout;

import dc.w;
import j0.g2;
import j0.i2;
import j0.l3;
import j0.v;
import j0.z1;
import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.x;
import n1.y0;
import p1.g;
import qc.d0;
import qc.q;
import qc.r;

/* compiled from: Box.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final i0 f2062a = d(v0.b.f24258a.n(), false);

    /* renamed from: b  reason: collision with root package name */
    private static final i0 f2063b = b.f2066a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.p<j0.l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f2064f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f2065m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f2064f = eVar;
            this.f2065m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            d.a(this.f2064f, lVar, z1.a(this.f2065m | 1));
        }
    }

    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    static final class b implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2066a = new b();

        /* compiled from: Box.kt */
        /* loaded from: classes.dex */
        static final class a extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f2067f = new a();

            a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }
        }

        b() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            q.i(l0Var, "$this$MeasurePolicy");
            q.i(list, "<anonymous parameter 0>");
            return k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, a.f2067f, 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.d(this, nVar, list, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Box.kt */
    /* loaded from: classes.dex */
    public static final class c implements i0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f2068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v0.b f2069b;

        /* compiled from: Box.kt */
        /* loaded from: classes.dex */
        static final class a extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f2070f = new a();

            a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }
        }

        /* compiled from: Box.kt */
        /* loaded from: classes.dex */
        static final class b extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f2071f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g0 f2072m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ l0 f2073p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ int f2074q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ int f2075r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ v0.b f2076s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(y0 y0Var, g0 g0Var, l0 l0Var, int i10, int i11, v0.b bVar) {
                super(1);
                this.f2071f = y0Var;
                this.f2072m = g0Var;
                this.f2073p = l0Var;
                this.f2074q = i10;
                this.f2075r = i11;
                this.f2076s = bVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
                d.g(aVar, this.f2071f, this.f2072m, this.f2073p.getLayoutDirection(), this.f2074q, this.f2075r, this.f2076s);
            }
        }

        /* compiled from: Box.kt */
        /* renamed from: androidx.compose.foundation.layout.d$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0025c extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0[] f2077f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ List<g0> f2078m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ l0 f2079p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ d0 f2080q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ d0 f2081r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ v0.b f2082s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0025c(y0[] y0VarArr, List<? extends g0> list, l0 l0Var, d0 d0Var, d0 d0Var2, v0.b bVar) {
                super(1);
                this.f2077f = y0VarArr;
                this.f2078m = list;
                this.f2079p = l0Var;
                this.f2080q = d0Var;
                this.f2081r = d0Var2;
                this.f2082s = bVar;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                q.i(aVar, "$this$layout");
                y0[] y0VarArr = this.f2077f;
                List<g0> list = this.f2078m;
                l0 l0Var = this.f2079p;
                d0 d0Var = this.f2080q;
                d0 d0Var2 = this.f2081r;
                v0.b bVar = this.f2082s;
                int length = y0VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    y0 y0Var = y0VarArr[i11];
                    q.g(y0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    d.g(aVar, y0Var, list.get(i10), l0Var.getLayoutDirection(), d0Var.f21667f, d0Var2.f21667f, bVar);
                    i11++;
                    i10++;
                }
            }
        }

        c(boolean z10, v0.b bVar) {
            this.f2068a = z10;
            this.f2069b = bVar;
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            long e10;
            int i10;
            int i11;
            int p10;
            y0 w10;
            int i12;
            q.i(l0Var, "$this$MeasurePolicy");
            q.i(list, "measurables");
            if (list.isEmpty()) {
                return k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, a.f2070f, 4, null);
            }
            if (this.f2068a) {
                e10 = j10;
            } else {
                e10 = j2.b.e(j10, 0, 0, 0, 0, 10, null);
            }
            if (list.size() == 1) {
                g0 g0Var = list.get(0);
                if (!d.f(g0Var)) {
                    y0 w11 = g0Var.w(e10);
                    int max = Math.max(j2.b.p(j10), w11.A0());
                    i12 = Math.max(j2.b.o(j10), w11.l0());
                    w10 = w11;
                    p10 = max;
                } else {
                    p10 = j2.b.p(j10);
                    int o10 = j2.b.o(j10);
                    w10 = g0Var.w(j2.b.f18972b.c(j2.b.p(j10), j2.b.o(j10)));
                    i12 = o10;
                }
                return k0.b(l0Var, p10, i12, null, new b(w10, g0Var, l0Var, p10, i12, this.f2069b), 4, null);
            }
            y0[] y0VarArr = new y0[list.size()];
            d0 d0Var = new d0();
            d0Var.f21667f = j2.b.p(j10);
            d0 d0Var2 = new d0();
            d0Var2.f21667f = j2.b.o(j10);
            int size = list.size();
            boolean z10 = false;
            for (int i13 = 0; i13 < size; i13++) {
                g0 g0Var2 = list.get(i13);
                if (!d.f(g0Var2)) {
                    y0 w12 = g0Var2.w(e10);
                    y0VarArr[i13] = w12;
                    d0Var.f21667f = Math.max(d0Var.f21667f, w12.A0());
                    d0Var2.f21667f = Math.max(d0Var2.f21667f, w12.l0());
                } else {
                    z10 = true;
                }
            }
            if (z10) {
                int i14 = d0Var.f21667f;
                if (i14 != Integer.MAX_VALUE) {
                    i10 = i14;
                } else {
                    i10 = 0;
                }
                int i15 = d0Var2.f21667f;
                if (i15 != Integer.MAX_VALUE) {
                    i11 = i15;
                } else {
                    i11 = 0;
                }
                long a10 = j2.c.a(i10, i14, i11, i15);
                int size2 = list.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    g0 g0Var3 = list.get(i16);
                    if (d.f(g0Var3)) {
                        y0VarArr[i16] = g0Var3.w(a10);
                    }
                }
            }
            return k0.b(l0Var, d0Var.f21667f, d0Var2.f21667f, null, new C0025c(y0VarArr, list, l0Var, d0Var, d0Var2, this.f2069b), 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return h0.d(this, nVar, list, i10);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        q.i(eVar, "modifier");
        j0.l q10 = lVar.q(-211209833);
        if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:198)");
            }
            i0 i0Var = f2063b;
            q10.e(-1323940314);
            int a10 = j0.j.a(q10, 0);
            v F = q10.F();
            g.a aVar = p1.g.f20790l;
            pc.a<p1.g> a11 = aVar.a();
            pc.q<i2<p1.g>, j0.l, Integer, w> a12 = x.a(eVar);
            int i13 = (((((i11 << 3) & 112) | 384) << 9) & 7168) | 6;
            if (!(q10.u() instanceof j0.f)) {
                j0.j.c();
            }
            q10.s();
            if (q10.n()) {
                q10.B(a11);
            } else {
                q10.H();
            }
            j0.l a13 = l3.a(q10);
            l3.b(a13, i0Var, aVar.e());
            l3.b(a13, F, aVar.g());
            pc.p<p1.g, Integer, w> b10 = aVar.b();
            if (a13.n() || !q.d(a13.f(), Integer.valueOf(a10))) {
                a13.J(Integer.valueOf(a10));
                a13.I(Integer.valueOf(a10), b10);
            }
            a12.invoke(i2.a(i2.b(q10)), q10, Integer.valueOf((i13 >> 3) & 112));
            q10.e(2058660585);
            q10.N();
            q10.O();
            q10.N();
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(eVar, i10));
        }
    }

    public static final i0 d(v0.b bVar, boolean z10) {
        q.i(bVar, "alignment");
        return new c(z10, bVar);
    }

    private static final androidx.compose.foundation.layout.c e(g0 g0Var) {
        Object A = g0Var.A();
        if (A instanceof androidx.compose.foundation.layout.c) {
            return (androidx.compose.foundation.layout.c) A;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(g0 g0Var) {
        androidx.compose.foundation.layout.c e10 = e(g0Var);
        if (e10 != null) {
            return e10.J1();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(y0.a aVar, y0 y0Var, g0 g0Var, j2.r rVar, int i10, int i11, v0.b bVar) {
        v0.b bVar2;
        v0.b I1;
        androidx.compose.foundation.layout.c e10 = e(g0Var);
        if (e10 != null && (I1 = e10.I1()) != null) {
            bVar2 = I1;
        } else {
            bVar2 = bVar;
        }
        y0.a.p(aVar, y0Var, bVar2.a(j2.q.a(y0Var.A0(), y0Var.l0()), j2.q.a(i10, i11), rVar), 0.0f, 2, null);
    }

    public static final i0 h(v0.b bVar, boolean z10, j0.l lVar, int i10) {
        i0 i0Var;
        q.i(bVar, "alignment");
        lVar.e(56522820);
        if (j0.n.K()) {
            j0.n.V(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:79)");
        }
        if (q.d(bVar, v0.b.f24258a.n()) && !z10) {
            i0Var = f2062a;
        } else {
            Boolean valueOf = Boolean.valueOf(z10);
            lVar.e(511388516);
            boolean Q = lVar.Q(valueOf) | lVar.Q(bVar);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = d(bVar, z10);
                lVar.J(f10);
            }
            lVar.N();
            i0Var = (i0) f10;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return i0Var;
    }
}
