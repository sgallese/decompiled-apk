package n1;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f19999g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final k1 f20000a;

    /* renamed from: b  reason: collision with root package name */
    private b0 f20001b;

    /* renamed from: c  reason: collision with root package name */
    private final pc.p<p1.j0, i1, dc.w> f20002c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.p<p1.j0, j0.p, dc.w> f20003d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.p<p1.j0, pc.p<? super j1, ? super j2.b, ? extends j0>, dc.w> f20004e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.p<p1.j0, pc.p<? super g1, ? super j2.b, ? extends j0>, dc.w> f20005f;

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        void b(int i10, long j10);

        void dispose();
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<p1.j0, j0.p, dc.w> {
        b() {
            super(2);
        }

        public final void a(p1.j0 j0Var, j0.p pVar) {
            qc.q.i(j0Var, "$this$null");
            qc.q.i(pVar, "it");
            i1.this.j().x(pVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(p1.j0 j0Var, j0.p pVar) {
            a(j0Var, pVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.p<p1.j0, pc.p<? super g1, ? super j2.b, ? extends j0>, dc.w> {
        c() {
            super(2);
        }

        public final void a(p1.j0 j0Var, pc.p<? super g1, ? super j2.b, ? extends j0> pVar) {
            qc.q.i(j0Var, "$this$null");
            qc.q.i(pVar, "it");
            i1.this.j().y(pVar);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(p1.j0 j0Var, pc.p<? super g1, ? super j2.b, ? extends j0> pVar) {
            a(j0Var, pVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<p1.j0, pc.p<? super j1, ? super j2.b, ? extends j0>, dc.w> {
        d() {
            super(2);
        }

        public final void a(p1.j0 j0Var, pc.p<? super j1, ? super j2.b, ? extends j0> pVar) {
            qc.q.i(j0Var, "$this$null");
            qc.q.i(pVar, "it");
            j0Var.n(i1.this.j().m(pVar));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(p1.j0 j0Var, pc.p<? super j1, ? super j2.b, ? extends j0> pVar) {
            a(j0Var, pVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.p<p1.j0, i1, dc.w> {
        e() {
            super(2);
        }

        public final void a(p1.j0 j0Var, i1 i1Var) {
            qc.q.i(j0Var, "$this$null");
            qc.q.i(i1Var, "it");
            i1 i1Var2 = i1.this;
            b0 o02 = j0Var.o0();
            if (o02 == null) {
                o02 = new b0(j0Var, i1.this.f20000a);
                j0Var.w1(o02);
            }
            i1Var2.f20001b = o02;
            i1.this.j().t();
            i1.this.j().z(i1.this.f20000a);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(p1.j0 j0Var, i1 i1Var) {
            a(j0Var, i1Var);
            return dc.w.f13270a;
        }
    }

    public i1(k1 k1Var) {
        qc.q.i(k1Var, "slotReusePolicy");
        this.f20000a = k1Var;
        this.f20002c = new e();
        this.f20003d = new b();
        this.f20004e = new d();
        this.f20005f = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b0 j() {
        b0 b0Var = this.f20001b;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void d() {
        j().o();
    }

    public final void e() {
        j().q();
    }

    public final pc.p<p1.j0, j0.p, dc.w> f() {
        return this.f20003d;
    }

    public final pc.p<p1.j0, pc.p<? super g1, ? super j2.b, ? extends j0>, dc.w> g() {
        return this.f20005f;
    }

    public final pc.p<p1.j0, pc.p<? super j1, ? super j2.b, ? extends j0>, dc.w> h() {
        return this.f20004e;
    }

    public final pc.p<p1.j0, i1, dc.w> i() {
        return this.f20002c;
    }

    public final a k(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        return j().w(obj, pVar);
    }

    public i1() {
        this(p0.f20027a);
    }
}
