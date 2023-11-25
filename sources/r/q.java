package r;

import a1.y4;
import j0.d3;
import j0.e1;
import j0.g3;
import j0.j1;
import j0.l;
import j0.q1;
import s.e1;
import s.g1;
import s.i1;
import s.k1;
import s.z0;
import s.z1;
import v0.b;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private static final i1<androidx.compose.ui.graphics.g, s.o> f21979a = k1.a(a.f21984f, b.f21986f);

    /* renamed from: b */
    private static final e1 f21980b = q1.a(1.0f);

    /* renamed from: c */
    private static final z0<Float> f21981c = s.k.g(0.0f, 400.0f, null, 5, null);

    /* renamed from: d */
    private static final z0<j2.l> f21982d = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);

    /* renamed from: e */
    private static final z0<j2.p> f21983e = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<androidx.compose.ui.graphics.g, s.o> {

        /* renamed from: f */
        public static final a f21984f = new a();

        a() {
            super(1);
        }

        public final s.o a(long j10) {
            return new s.o(androidx.compose.ui.graphics.g.f(j10), androidx.compose.ui.graphics.g.g(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s.o invoke(androidx.compose.ui.graphics.g gVar) {
            return a(gVar.j());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class a0 extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final a0 f21985f = new a0();

        a0() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<s.o, androidx.compose.ui.graphics.g> {

        /* renamed from: f */
        public static final b f21986f = new b();

        b() {
            super(1);
        }

        public final long a(s.o oVar) {
            qc.q.i(oVar, "it");
            return y4.a(oVar.f(), oVar.g());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.g invoke(s.o oVar) {
            return androidx.compose.ui.graphics.g.b(a(oVar));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends qc.r implements pc.l<j2.p, j2.l> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f21987f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b0(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f21987f = lVar;
        }

        public final long a(long j10) {
            return j2.m.a(0, this.f21987f.invoke(Integer.valueOf(j2.p.f(j10))).intValue());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar) {
            return j2.l.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21988a;

        static {
            int[] iArr = new int[r.p.values().length];
            try {
                iArr[r.p.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.p.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.p.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21988a = iArr;
        }
    }

    /* compiled from: Transition.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.q<e1.b<r.p>, j0.l, Integer, z0<androidx.compose.ui.graphics.g>> {

        /* renamed from: f */
        public static final d f21989f = new d();

        public d() {
            super(3);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ z0<androidx.compose.ui.graphics.g> invoke(e1.b<r.p> bVar, j0.l lVar, Integer num) {
            return invoke(bVar, lVar, num.intValue());
        }

        public final z0<androidx.compose.ui.graphics.g> invoke(e1.b<r.p> bVar, j0.l lVar, int i10) {
            qc.q.i(bVar, "$this$null");
            lVar.e(-895531546);
            if (j0.n.K()) {
                j0.n.V(-895531546, i10, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:852)");
            }
            z0<androidx.compose.ui.graphics.g> g10 = s.k.g(0.0f, 0.0f, null, 7, null);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return g10;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.l<androidx.compose.ui.graphics.d, dc.w> {

        /* renamed from: f */
        final /* synthetic */ g3<Float> f21990f;

        /* renamed from: m */
        final /* synthetic */ g3<Float> f21991m;

        /* renamed from: p */
        final /* synthetic */ g3<androidx.compose.ui.graphics.g> f21992p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(g3<Float> g3Var, g3<Float> g3Var2, g3<androidx.compose.ui.graphics.g> g3Var3) {
            super(1);
            this.f21990f = g3Var;
            this.f21991m = g3Var2;
            this.f21992p = g3Var3;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            qc.q.i(dVar, "$this$graphicsLayer");
            dVar.c(q.n(this.f21990f));
            dVar.q(q.i(this.f21991m));
            dVar.k(q.i(this.f21991m));
            dVar.L0(q.j(this.f21992p));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<androidx.compose.ui.graphics.d, dc.w> {

        /* renamed from: f */
        final /* synthetic */ g3<Float> f21993f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g3<Float> g3Var) {
            super(1);
            this.f21993f = g3Var;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            qc.q.i(dVar, "$this$graphicsLayer");
            dVar.c(q.n(this.f21993f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.q<e1.b<r.p>, j0.l, Integer, s.e0<Float>> {

        /* renamed from: f */
        final /* synthetic */ r.r f21994f;

        /* renamed from: m */
        final /* synthetic */ r.t f21995m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(r.r rVar, r.t tVar) {
            super(3);
            this.f21994f = rVar;
            this.f21995m = tVar;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ s.e0<Float> invoke(e1.b<r.p> bVar, j0.l lVar, Integer num) {
            return invoke(bVar, lVar, num.intValue());
        }

        public final s.e0<Float> invoke(e1.b<r.p> bVar, j0.l lVar, int i10) {
            s.e0<Float> e0Var;
            qc.q.i(bVar, "$this$animateFloat");
            lVar.e(-57153604);
            if (j0.n.K()) {
                j0.n.V(-57153604, i10, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:860)");
            }
            r.p pVar = r.p.PreEnter;
            r.p pVar2 = r.p.Visible;
            if (bVar.b(pVar, pVar2)) {
                r.w b10 = this.f21994f.a().b();
                if (b10 == null || (e0Var = b10.b()) == null) {
                    e0Var = q.f21981c;
                }
            } else if (!bVar.b(pVar2, r.p.PostExit)) {
                e0Var = q.f21981c;
            } else {
                r.w b11 = this.f21995m.b().b();
                if (b11 == null || (e0Var = b11.b()) == null) {
                    e0Var = q.f21981c;
                }
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return e0Var;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.q<e1.b<r.p>, j0.l, Integer, s.e0<Float>> {

        /* renamed from: f */
        final /* synthetic */ r.r f21996f;

        /* renamed from: m */
        final /* synthetic */ r.t f21997m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(r.r rVar, r.t tVar) {
            super(3);
            this.f21996f = rVar;
            this.f21997m = tVar;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ s.e0<Float> invoke(e1.b<r.p> bVar, j0.l lVar, Integer num) {
            return invoke(bVar, lVar, num.intValue());
        }

        public final s.e0<Float> invoke(e1.b<r.p> bVar, j0.l lVar, int i10) {
            s.e0<Float> e0Var;
            qc.q.i(bVar, "$this$animateFloat");
            lVar.e(-53984035);
            if (j0.n.K()) {
                j0.n.V(-53984035, i10, -1, "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:883)");
            }
            r.p pVar = r.p.PreEnter;
            r.p pVar2 = r.p.Visible;
            if (bVar.b(pVar, pVar2)) {
                r.b0 c10 = this.f21996f.a().c();
                if (c10 == null || (e0Var = c10.a()) == null) {
                    e0Var = q.f21981c;
                }
            } else if (!bVar.b(pVar2, r.p.PostExit)) {
                e0Var = q.f21981c;
            } else {
                r.b0 c11 = this.f21997m.b().c();
                if (c11 == null || (e0Var = c11.a()) == null) {
                    e0Var = q.f21981c;
                }
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return e0Var;
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final i f21998f = new i();

        i() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f21999f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f21999f = lVar;
        }

        public final long a(long j10) {
            return j2.q.a(this.f21999f.invoke(Integer.valueOf(j2.p.g(j10))).intValue(), j2.p.f(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        public static final k f22000f = new k();

        k() {
            super(1);
        }

        public final long a(long j10) {
            return j2.q.a(0, 0);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final l f22001f = new l();

        l() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class m extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22002f = lVar;
        }

        public final long a(long j10) {
            return j2.q.a(j2.p.g(j10), this.f22002f.invoke(Integer.valueOf(j2.p.f(j10))).intValue());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class n extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f */
        final /* synthetic */ s.e1<r.p> f22003f;

        /* renamed from: m */
        final /* synthetic */ g3<r.m> f22004m;

        /* renamed from: p */
        final /* synthetic */ g3<r.m> f22005p;

        /* renamed from: q */
        final /* synthetic */ String f22006q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(s.e1<r.p> e1Var, g3<r.m> g3Var, g3<r.m> g3Var2, String str) {
            super(3);
            this.f22003f = e1Var;
            this.f22004m = g3Var;
            this.f22005p = g3Var2;
            this.f22006q = str;
        }

        private static final boolean b(j1<Boolean> j1Var) {
            return j1Var.getValue().booleanValue();
        }

        private static final void c(j1<Boolean> j1Var, boolean z10) {
            j1Var.setValue(Boolean.valueOf(z10));
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x01a5  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x01ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.e a(androidx.compose.ui.e r21, j0.l r22, int r23) {
            /*
                Method dump skipped, instructions count: 518
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r.q.n.a(androidx.compose.ui.e, j0.l, int):androidx.compose.ui.e");
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class o extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final o f22007f = new o();

        o() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class p extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22008f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22008f = lVar;
        }

        public final long a(long j10) {
            return j2.q.a(this.f22008f.invoke(Integer.valueOf(j2.p.g(j10))).intValue(), j2.p.f(j10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* renamed from: r.q$q */
    /* loaded from: classes.dex */
    public static final class C0494q extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        public static final C0494q f22009f = new C0494q();

        C0494q() {
            super(1);
        }

        public final long a(long j10) {
            return j2.q.a(0, 0);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class r extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final r f22010f = new r();

        r() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class s extends qc.r implements pc.l<j2.p, j2.p> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22011f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22011f = lVar;
        }

        public final long a(long j10) {
            return j2.q.a(j2.p.g(j10), this.f22011f.invoke(Integer.valueOf(j2.p.f(j10))).intValue());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.p invoke(j2.p pVar) {
            return j2.p.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class t extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final t f22012f = new t();

        t() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class u extends qc.r implements pc.l<j2.p, j2.l> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22013f = lVar;
        }

        public final long a(long j10) {
            return j2.m.a(this.f22013f.invoke(Integer.valueOf(j2.p.g(j10))).intValue(), 0);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar) {
            return j2.l.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class v extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f */
        final /* synthetic */ s.e1<r.p> f22014f;

        /* renamed from: m */
        final /* synthetic */ g3<g0> f22015m;

        /* renamed from: p */
        final /* synthetic */ g3<g0> f22016p;

        /* renamed from: q */
        final /* synthetic */ String f22017q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(s.e1<r.p> e1Var, g3<g0> g3Var, g3<g0> g3Var2, String str) {
            super(3);
            this.f22014f = e1Var;
            this.f22015m = g3Var;
            this.f22016p = g3Var2;
            this.f22017q = str;
        }

        private static final boolean b(j1<Boolean> j1Var) {
            return j1Var.getValue().booleanValue();
        }

        private static final void c(j1<Boolean> j1Var, boolean z10) {
            j1Var.setValue(Boolean.valueOf(z10));
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(158379472);
            if (j0.n.K()) {
                j0.n.V(158379472, i10, -1, "androidx.compose.animation.slideInOut.<anonymous> (EnterExitTransition.kt:949)");
            }
            s.e1<r.p> e1Var = this.f22014f;
            lVar.e(1157296644);
            boolean Q = lVar.Q(e1Var);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = d3.e(Boolean.FALSE, null, 2, null);
                lVar.J(f10);
            }
            lVar.N();
            j1 j1Var = (j1) f10;
            if (this.f22014f.g() == this.f22014f.m() && !this.f22014f.q()) {
                c(j1Var, false);
            } else if (this.f22015m.getValue() != null || this.f22016p.getValue() != null) {
                c(j1Var, true);
            }
            if (b(j1Var)) {
                s.e1<r.p> e1Var2 = this.f22014f;
                i1<j2.l, s.o> d10 = k1.d(j2.l.f18992b);
                String str = this.f22017q;
                lVar.e(-492369756);
                Object f11 = lVar.f();
                l.a aVar = j0.l.f18688a;
                if (f11 == aVar.a()) {
                    f11 = str + " slide";
                    lVar.J(f11);
                }
                lVar.N();
                e1.a b10 = g1.b(e1Var2, d10, (String) f11, lVar, 448, 0);
                s.e1<r.p> e1Var3 = this.f22014f;
                g3<g0> g3Var = this.f22015m;
                g3<g0> g3Var2 = this.f22016p;
                lVar.e(1157296644);
                boolean Q2 = lVar.Q(e1Var3);
                Object f12 = lVar.f();
                if (Q2 || f12 == aVar.a()) {
                    f12 = new h0(b10, g3Var, g3Var2);
                    lVar.J(f12);
                }
                lVar.N();
                eVar = eVar.a((h0) f12);
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return eVar;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class w extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final w f22018f = new w();

        w() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class x extends qc.r implements pc.l<j2.p, j2.l> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22019f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22019f = lVar;
        }

        public final long a(long j10) {
            return j2.m.a(0, this.f22019f.invoke(Integer.valueOf(j2.p.f(j10))).intValue());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar) {
            return j2.l.b(a(pVar.j()));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class y extends qc.r implements pc.l<Integer, Integer> {

        /* renamed from: f */
        public static final y f22020f = new y();

        y() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: EnterExitTransition.kt */
    /* loaded from: classes.dex */
    public static final class z extends qc.r implements pc.l<j2.p, j2.l> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Integer, Integer> f22021f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        z(pc.l<? super Integer, Integer> lVar) {
            super(1);
            this.f22021f = lVar;
        }

        public final long a(long j10) {
            return j2.m.a(this.f22021f.invoke(Integer.valueOf(j2.p.g(j10))).intValue(), 0);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(j2.p pVar) {
            return j2.l.b(a(pVar.j()));
        }
    }

    public static final r.t A(s.e0<Float> e0Var, float f10, long j10) {
        qc.q.i(e0Var, "animationSpec");
        return new r.u(new l0(null, null, null, new r.b0(f10, j10, e0Var, null), 7, null));
    }

    public static /* synthetic */ r.t B(s.e0 e0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.g.f2458b.a();
        }
        return A(e0Var, f10, j10);
    }

    private static final androidx.compose.ui.e C(androidx.compose.ui.e eVar, s.e1<r.p> e1Var, g3<r.m> g3Var, g3<r.m> g3Var2, String str) {
        return androidx.compose.ui.c.b(eVar, null, new n(e1Var, g3Var, g3Var2, str), 1, null);
    }

    public static final r.t D(s.e0<j2.p> e0Var, b.InterfaceC0571b interfaceC0571b, boolean z10, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(interfaceC0571b, "shrinkTowards");
        qc.q.i(lVar, "targetWidth");
        return F(e0Var, U(interfaceC0571b), z10, new p(lVar));
    }

    public static /* synthetic */ r.t E(s.e0 e0Var, b.InterfaceC0571b interfaceC0571b, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0571b = v0.b.f24258a.i();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = o.f22007f;
        }
        return D(e0Var, interfaceC0571b, z10, lVar);
    }

    public static final r.t F(s.e0<j2.p> e0Var, v0.b bVar, boolean z10, pc.l<? super j2.p, j2.p> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(bVar, "shrinkTowards");
        qc.q.i(lVar, "targetSize");
        return new r.u(new l0(null, null, new r.m(bVar, lVar, e0Var, z10), null, 11, null));
    }

    public static /* synthetic */ r.t G(s.e0 e0Var, v0.b bVar, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = v0.b.f24258a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = C0494q.f22009f;
        }
        return F(e0Var, bVar, z10, lVar);
    }

    public static final r.t H(s.e0<j2.p> e0Var, b.c cVar, boolean z10, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(cVar, "shrinkTowards");
        qc.q.i(lVar, "targetHeight");
        return F(e0Var, V(cVar), z10, new s(lVar));
    }

    public static /* synthetic */ r.t I(s.e0 e0Var, b.c cVar, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = v0.b.f24258a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = r.f22010f;
        }
        return H(e0Var, cVar, z10, lVar);
    }

    public static final r.r J(s.e0<j2.l> e0Var, pc.l<? super j2.p, j2.l> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "initialOffset");
        return new r.s(new l0(null, new g0(lVar, e0Var), null, null, 13, null));
    }

    public static final r.r K(s.e0<j2.l> e0Var, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "initialOffsetX");
        return J(e0Var, new u(lVar));
    }

    public static /* synthetic */ r.r L(s.e0 e0Var, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = t.f22012f;
        }
        return K(e0Var, lVar);
    }

    private static final androidx.compose.ui.e M(androidx.compose.ui.e eVar, s.e1<r.p> e1Var, g3<g0> g3Var, g3<g0> g3Var2, String str) {
        return androidx.compose.ui.c.b(eVar, null, new v(e1Var, g3Var, g3Var2, str), 1, null);
    }

    public static final r.r N(s.e0<j2.l> e0Var, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "initialOffsetY");
        return J(e0Var, new x(lVar));
    }

    public static /* synthetic */ r.r O(s.e0 e0Var, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = w.f22018f;
        }
        return N(e0Var, lVar);
    }

    public static final r.t P(s.e0<j2.l> e0Var, pc.l<? super j2.p, j2.l> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "targetOffset");
        return new r.u(new l0(null, new g0(lVar, e0Var), null, null, 13, null));
    }

    public static final r.t Q(s.e0<j2.l> e0Var, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "targetOffsetX");
        return P(e0Var, new z(lVar));
    }

    public static /* synthetic */ r.t R(s.e0 e0Var, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = y.f22020f;
        }
        return Q(e0Var, lVar);
    }

    public static final r.t S(s.e0<j2.l> e0Var, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(lVar, "targetOffsetY");
        return P(e0Var, new b0(lVar));
    }

    public static /* synthetic */ r.t T(s.e0 e0Var, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.l.b(z1.c(j2.l.f18992b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            lVar = a0.f21985f;
        }
        return S(e0Var, lVar);
    }

    private static final v0.b U(b.InterfaceC0571b interfaceC0571b) {
        b.a aVar = v0.b.f24258a;
        if (qc.q.d(interfaceC0571b, aVar.j())) {
            return aVar.g();
        }
        if (qc.q.d(interfaceC0571b, aVar.i())) {
            return aVar.e();
        }
        return aVar.d();
    }

    private static final v0.b V(b.c cVar) {
        b.a aVar = v0.b.f24258a;
        if (qc.q.d(cVar, aVar.k())) {
            return aVar.l();
        }
        if (qc.q.d(cVar, aVar.a())) {
            return aVar.b();
        }
        return aVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0582  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [j0.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.e g(s.e1<r.p> r27, r.r r28, r.t r29, java.lang.String r30, j0.l r31, int r32) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.q.g(s.e1, r.r, r.t, java.lang.String, j0.l, int):androidx.compose.ui.e");
    }

    private static final boolean h(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    public static final float i(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    public static final long j(g3<androidx.compose.ui.graphics.g> g3Var) {
        return g3Var.getValue().j();
    }

    private static final void k(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    private static final boolean l(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    private static final void m(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    public static final float n(g3<Float> g3Var) {
        return g3Var.getValue().floatValue();
    }

    public static final r.r o(s.e0<j2.p> e0Var, b.InterfaceC0571b interfaceC0571b, boolean z10, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(interfaceC0571b, "expandFrom");
        qc.q.i(lVar, "initialWidth");
        return q(e0Var, U(interfaceC0571b), z10, new j(lVar));
    }

    public static /* synthetic */ r.r p(s.e0 e0Var, b.InterfaceC0571b interfaceC0571b, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            interfaceC0571b = v0.b.f24258a.i();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = i.f21998f;
        }
        return o(e0Var, interfaceC0571b, z10, lVar);
    }

    public static final r.r q(s.e0<j2.p> e0Var, v0.b bVar, boolean z10, pc.l<? super j2.p, j2.p> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(bVar, "expandFrom");
        qc.q.i(lVar, "initialSize");
        return new r.s(new l0(null, null, new r.m(bVar, lVar, e0Var, z10), null, 11, null));
    }

    public static /* synthetic */ r.r r(s.e0 e0Var, v0.b bVar, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = v0.b.f24258a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = k.f22000f;
        }
        return q(e0Var, bVar, z10, lVar);
    }

    public static final r.r s(s.e0<j2.p> e0Var, b.c cVar, boolean z10, pc.l<? super Integer, Integer> lVar) {
        qc.q.i(e0Var, "animationSpec");
        qc.q.i(cVar, "expandFrom");
        qc.q.i(lVar, "initialHeight");
        return q(e0Var, V(cVar), z10, new m(lVar));
    }

    public static /* synthetic */ r.r t(s.e0 e0Var, b.c cVar, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, j2.p.b(z1.d(j2.p.f19001b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = v0.b.f24258a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            lVar = l.f22001f;
        }
        return s(e0Var, cVar, z10, lVar);
    }

    public static final r.r u(s.e0<Float> e0Var, float f10) {
        qc.q.i(e0Var, "animationSpec");
        return new r.s(new l0(new r.w(f10, e0Var), null, null, null, 14, null));
    }

    public static /* synthetic */ r.r v(s.e0 e0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return u(e0Var, f10);
    }

    public static final r.t w(s.e0<Float> e0Var, float f10) {
        qc.q.i(e0Var, "animationSpec");
        return new r.u(new l0(new r.w(f10, e0Var), null, null, null, 14, null));
    }

    public static /* synthetic */ r.t x(s.e0 e0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return w(e0Var, f10);
    }

    public static final r.r y(s.e0<Float> e0Var, float f10, long j10) {
        qc.q.i(e0Var, "animationSpec");
        return new r.s(new l0(null, null, null, new r.b0(f10, j10, e0Var, null), 7, null));
    }

    public static /* synthetic */ r.r z(s.e0 e0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            e0Var = s.k.g(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.g.f2458b.a();
        }
        return y(e0Var, f10, j10);
    }
}
