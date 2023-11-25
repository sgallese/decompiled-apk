package c0;

import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldScroll.kt */
/* loaded from: classes.dex */
public final class f1 implements n1.z {

    /* renamed from: c  reason: collision with root package name */
    private final q0 f8257c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8258d;

    /* renamed from: e  reason: collision with root package name */
    private final b2.s0 f8259e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.a<v0> f8260f;

    /* compiled from: TextFieldScroll.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n1.l0 f8261f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f1 f8262m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n1.y0 f8263p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f8264q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n1.l0 l0Var, f1 f1Var, n1.y0 y0Var, int i10) {
            super(1);
            this.f8261f = l0Var;
            this.f8262m = f1Var;
            this.f8263p = y0Var;
            this.f8264q = i10;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            z0.h b10;
            int d10;
            qc.q.i(aVar, "$this$layout");
            n1.l0 l0Var = this.f8261f;
            int e10 = this.f8262m.e();
            b2.s0 x10 = this.f8262m.x();
            v0 invoke = this.f8262m.v().invoke();
            b10 = p0.b(l0Var, e10, x10, invoke != null ? invoke.i() : null, false, this.f8263p.A0());
            this.f8262m.m().j(u.o.Vertical, b10, this.f8264q, this.f8263p.l0());
            float f10 = -this.f8262m.m().d();
            n1.y0 y0Var = this.f8263p;
            d10 = sc.c.d(f10);
            y0.a.r(aVar, y0Var, 0, d10, 0.0f, 4, null);
        }
    }

    public f1(q0 q0Var, int i10, b2.s0 s0Var, pc.a<v0> aVar) {
        qc.q.i(q0Var, "scrollerPosition");
        qc.q.i(s0Var, "transformedText");
        qc.q.i(aVar, "textLayoutResultProvider");
        this.f8257c = q0Var;
        this.f8258d = i10;
        this.f8259e = s0Var;
        this.f8260f = aVar;
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
        n1.y0 w10 = g0Var.w(j2.b.e(j10, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(w10.l0(), j2.b.m(j10));
        return n1.k0.b(l0Var, w10.A0(), min, null, new a(l0Var, this, w10, min), 4, null);
    }

    public final int e() {
        return this.f8258d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (qc.q.d(this.f8257c, f1Var.f8257c) && this.f8258d == f1Var.f8258d && qc.q.d(this.f8259e, f1Var.f8259e) && qc.q.d(this.f8260f, f1Var.f8260f)) {
            return true;
        }
        return false;
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
        return (((((this.f8257c.hashCode() * 31) + this.f8258d) * 31) + this.f8259e.hashCode()) * 31) + this.f8260f.hashCode();
    }

    public final q0 m() {
        return this.f8257c;
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

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f8257c + ", cursorOffset=" + this.f8258d + ", transformedText=" + this.f8259e + ", textLayoutResultProvider=" + this.f8260f + ')';
    }

    public final pc.a<v0> v() {
        return this.f8260f;
    }

    public final b2.s0 x() {
        return this.f8259e;
    }
}
