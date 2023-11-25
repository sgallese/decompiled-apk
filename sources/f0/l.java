package f0;

/* compiled from: Scaffold.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f14821a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static pc.p<j0.l, Integer, dc.w> f14822b = q0.c.c(2069405901, false, a.f14826f);

    /* renamed from: c  reason: collision with root package name */
    public static pc.p<j0.l, Integer, dc.w> f14823c = q0.c.c(-231850563, false, b.f14827f);

    /* renamed from: d  reason: collision with root package name */
    public static pc.q<n1, j0.l, Integer, dc.w> f14824d = q0.c.c(-147687984, false, c.f14828f);

    /* renamed from: e  reason: collision with root package name */
    public static pc.p<j0.l, Integer, dc.w> f14825e = q0.c.c(-900670499, false, d.f14829f);

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14826f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(2069405901, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-1.<anonymous> (Scaffold.kt:161)");
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f14827f = new b();

        b() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-231850563, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-2.<anonymous> (Scaffold.kt:162)");
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.q<n1, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f14828f = new c();

        c() {
            super(3);
        }

        public final void a(n1 n1Var, j0.l lVar, int i10) {
            int i11;
            qc.q.i(n1Var, "it");
            if ((i10 & 14) == 0) {
                if (lVar.Q(n1Var)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if ((i10 & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-147687984, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:163)");
            }
            m1.b(n1Var, null, null, lVar, i10 & 14, 6);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(n1 n1Var, j0.l lVar, Integer num) {
            a(n1Var, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    /* compiled from: Scaffold.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f14829f = new d();

        d() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-900670499, i10, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-4.<anonymous> (Scaffold.kt:164)");
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    public final pc.p<j0.l, Integer, dc.w> a() {
        return f14822b;
    }

    public final pc.p<j0.l, Integer, dc.w> b() {
        return f14823c;
    }

    public final pc.q<n1, j0.l, Integer, dc.w> c() {
        return f14824d;
    }

    public final pc.p<j0.l, Integer, dc.w> d() {
        return f14825e;
    }
}
