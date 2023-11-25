package f0;

import n1.y0;

/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes.dex */
final class v0 implements n1.z {

    /* renamed from: c  reason: collision with root package name */
    private final long f15109c;

    /* compiled from: InteractiveComponentSize.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f15110f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ n1.y0 f15111m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f15112p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, n1.y0 y0Var, int i11) {
            super(1);
            this.f15110f = i10;
            this.f15111m = y0Var;
            this.f15112p = i11;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            int d10;
            int d11;
            qc.q.i(aVar, "$this$layout");
            d10 = sc.c.d((this.f15110f - this.f15111m.A0()) / 2.0f);
            d11 = sc.c.d((this.f15112p - this.f15111m.l0()) / 2.0f);
            y0.a.n(aVar, this.f15111m, d10, d11, 0.0f, 4, null);
        }
    }

    public /* synthetic */ v0(long j10, qc.h hVar) {
        this(j10);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    @Override // n1.z
    public n1.j0 d(n1.l0 l0Var, n1.g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        n1.y0 w10 = g0Var.w(j10);
        int max = Math.max(w10.A0(), l0Var.K0(j2.k.h(this.f15109c)));
        int max2 = Math.max(w10.l0(), l0Var.K0(j2.k.g(this.f15109c)));
        return n1.k0.b(l0Var, max, max2, null, new a(max, w10, max2), 4, null);
    }

    public boolean equals(Object obj) {
        v0 v0Var;
        if (obj instanceof v0) {
            v0Var = (v0) obj;
        } else {
            v0Var = null;
        }
        if (v0Var == null) {
            return false;
        }
        return j2.k.f(this.f15109c, v0Var.f15109c);
    }

    @Override // n1.z
    public /* synthetic */ int f(n1.n nVar, n1.m mVar, int i10) {
        return n1.y.b(this, nVar, mVar, i10);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }

    public int hashCode() {
        return j2.k.i(this.f15109c);
    }

    @Override // n1.z
    public /* synthetic */ int n(n1.n nVar, n1.m mVar, int i10) {
        return n1.y.c(this, nVar, mVar, i10);
    }

    @Override // n1.z
    public /* synthetic */ int r(n1.n nVar, n1.m mVar, int i10) {
        return n1.y.a(this, nVar, mVar, i10);
    }

    @Override // n1.z
    public /* synthetic */ int t(n1.n nVar, n1.m mVar, int i10) {
        return n1.y.d(this, nVar, mVar, i10);
    }

    private v0(long j10) {
        this.f15109c = j10;
    }
}
