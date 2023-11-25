package r;

import j0.d3;
import j0.g3;
import j0.j1;
import j0.y2;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.v0;
import n1.y0;
import s.e1;
import s.f1;
import s.g1;
import s.k1;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
public final class g<S> implements f<S> {

    /* renamed from: a  reason: collision with root package name */
    private final e1<S> f21872a;

    /* renamed from: b  reason: collision with root package name */
    private v0.b f21873b;

    /* renamed from: c  reason: collision with root package name */
    private j2.r f21874c;

    /* renamed from: d  reason: collision with root package name */
    private final j1 f21875d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<S, g3<j2.p>> f21876e;

    /* renamed from: f  reason: collision with root package name */
    private g3<j2.p> f21877f;

    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public static final class a implements v0 {

        /* renamed from: c  reason: collision with root package name */
        private boolean f21878c;

        public a(boolean z10) {
            this.f21878c = z10;
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
            return v0.d.a(this, eVar);
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ Object b(Object obj, pc.p pVar) {
            return v0.e.b(this, obj, pVar);
        }

        public final boolean e() {
            return this.f21878c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f21878c == ((a) obj).f21878c) {
                return true;
            }
            return false;
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ boolean h(pc.l lVar) {
            return v0.e.a(this, lVar);
        }

        public int hashCode() {
            boolean z10 = this.f21878c;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final void m(boolean z10) {
            this.f21878c = z10;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f21878c + ')';
        }

        @Override // n1.v0
        public Object y(j2.e eVar, Object obj) {
            qc.q.i(eVar, "<this>");
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedContent.kt */
    /* loaded from: classes.dex */
    public final class b extends a0 {

        /* renamed from: c  reason: collision with root package name */
        private final e1<S>.a<j2.p, s.o> f21879c;

        /* renamed from: d  reason: collision with root package name */
        private final g3<e0> f21880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g<S> f21881e;

        /* compiled from: AnimatedContent.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f21882f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f21883m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, long j10) {
                super(1);
                this.f21882f = y0Var;
                this.f21883m = j10;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                y0.a.p(aVar, this.f21882f, this.f21883m, 0.0f, 2, null);
            }
        }

        /* compiled from: AnimatedContent.kt */
        /* renamed from: r.g$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0490b extends qc.r implements pc.l<e1.b<S>, s.e0<j2.p>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g<S> f21884f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g<S>.b f21885m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0490b(g<S> gVar, g<S>.b bVar) {
                super(1);
                this.f21884f = gVar;
                this.f21885m = bVar;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final s.e0<j2.p> invoke(e1.b<S> bVar) {
                long a10;
                long a11;
                s.e0<j2.p> b10;
                qc.q.i(bVar, "$this$animate");
                g3<j2.p> g3Var = this.f21884f.h().get(bVar.a());
                if (g3Var != null) {
                    a10 = g3Var.getValue().j();
                } else {
                    a10 = j2.p.f19001b.a();
                }
                g3<j2.p> g3Var2 = this.f21884f.h().get(bVar.c());
                if (g3Var2 != null) {
                    a11 = g3Var2.getValue().j();
                } else {
                    a11 = j2.p.f19001b.a();
                }
                e0 value = this.f21885m.e().getValue();
                if (value == null || (b10 = value.b(a10, a11)) == null) {
                    return s.k.g(0.0f, 0.0f, null, 7, null);
                }
                return b10;
            }
        }

        /* compiled from: AnimatedContent.kt */
        /* loaded from: classes.dex */
        static final class c extends qc.r implements pc.l<S, j2.p> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g<S> f21886f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(g<S> gVar) {
                super(1);
                this.f21886f = gVar;
            }

            public final long a(S s10) {
                g3<j2.p> g3Var = this.f21886f.h().get(s10);
                if (g3Var != null) {
                    return g3Var.getValue().j();
                }
                return j2.p.f19001b.a();
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ j2.p invoke(Object obj) {
                return j2.p.b(a(obj));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(g gVar, e1<S>.a<j2.p, s.o> aVar, g3<? extends e0> g3Var) {
            qc.q.i(aVar, "sizeAnimation");
            qc.q.i(g3Var, "sizeTransform");
            this.f21881e = gVar;
            this.f21879c = aVar;
            this.f21880d = g3Var;
        }

        @Override // n1.z
        public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$measure");
            qc.q.i(g0Var, "measurable");
            y0 w10 = g0Var.w(j10);
            g3<j2.p> a10 = this.f21879c.a(new C0490b(this.f21881e, this), new c(this.f21881e));
            this.f21881e.i(a10);
            return n1.k0.b(l0Var, j2.p.g(a10.getValue().j()), j2.p.f(a10.getValue().j()), null, new a(w10, this.f21881e.g().a(j2.q.a(w10.A0(), w10.l0()), a10.getValue().j(), j2.r.Ltr)), 4, null);
        }

        public final g3<e0> e() {
            return this.f21880d;
        }
    }

    public g(e1<S> e1Var, v0.b bVar, j2.r rVar) {
        j1 e10;
        qc.q.i(e1Var, "transition");
        qc.q.i(bVar, "contentAlignment");
        qc.q.i(rVar, "layoutDirection");
        this.f21872a = e1Var;
        this.f21873b = bVar;
        this.f21874c = rVar;
        e10 = d3.e(j2.p.b(j2.p.f19001b.a()), null, 2, null);
        this.f21875d = e10;
        this.f21876e = new LinkedHashMap();
    }

    private static final boolean e(j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    private static final void f(j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    @Override // s.e1.b
    public S a() {
        return this.f21872a.k().a();
    }

    @Override // s.e1.b
    public /* synthetic */ boolean b(Object obj, Object obj2) {
        return f1.a(this, obj, obj2);
    }

    @Override // s.e1.b
    public S c() {
        return this.f21872a.k().c();
    }

    public final androidx.compose.ui.e d(o oVar, j0.l lVar, int i10) {
        androidx.compose.ui.e eVar;
        qc.q.i(oVar, "contentTransform");
        lVar.e(93755870);
        if (j0.n.K()) {
            j0.n.V(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:554)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(this);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = d3.e(Boolean.FALSE, null, 2, null);
            lVar.J(f10);
        }
        lVar.N();
        j1 j1Var = (j1) f10;
        boolean z10 = false;
        g3 m10 = y2.m(oVar.b(), lVar, 0);
        if (qc.q.d(this.f21872a.g(), this.f21872a.m())) {
            f(j1Var, false);
        } else if (m10.getValue() != null) {
            f(j1Var, true);
        }
        if (e(j1Var)) {
            e1.a b10 = g1.b(this.f21872a, k1.e(j2.p.f19001b), null, lVar, 64, 2);
            lVar.e(1157296644);
            boolean Q2 = lVar.Q(b10);
            Object f11 = lVar.f();
            if (Q2 || f11 == j0.l.f18688a.a()) {
                e0 e0Var = (e0) m10.getValue();
                if (e0Var != null && !e0Var.a()) {
                    z10 = true;
                }
                androidx.compose.ui.e eVar2 = androidx.compose.ui.e.f2335a;
                if (!z10) {
                    eVar2 = x0.e.b(eVar2);
                }
                f11 = eVar2.a(new b(this, b10, m10));
                lVar.J(f11);
            }
            lVar.N();
            eVar = (androidx.compose.ui.e) f11;
        } else {
            this.f21877f = null;
            eVar = androidx.compose.ui.e.f2335a;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return eVar;
    }

    public final v0.b g() {
        return this.f21873b;
    }

    public final Map<S, g3<j2.p>> h() {
        return this.f21876e;
    }

    public final void i(g3<j2.p> g3Var) {
        this.f21877f = g3Var;
    }

    public final void j(v0.b bVar) {
        qc.q.i(bVar, "<set-?>");
        this.f21873b = bVar;
    }

    public final void k(j2.r rVar) {
        qc.q.i(rVar, "<set-?>");
        this.f21874c = rVar;
    }

    public final void l(long j10) {
        this.f21875d.setValue(j2.p.b(j10));
    }
}
