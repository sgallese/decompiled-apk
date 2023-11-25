package f0;

/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final j0.v1<Boolean> f14910a;

    /* renamed from: b  reason: collision with root package name */
    private static final j0.v1<Boolean> f14911b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f14912c;

    /* compiled from: InteractiveComponentSize.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14913f = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<androidx.compose.ui.platform.m1, dc.w> {
        public b() {
            super(1);
        }

        public final void a(androidx.compose.ui.platform.m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("minimumInteractiveComponentSize");
            m1Var.a().c("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(androidx.compose.ui.platform.m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InteractiveComponentSize.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f14914f = new c();

        c() {
            super(3);
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            androidx.compose.ui.e eVar2;
            qc.q.i(eVar, "$this$composed");
            lVar.e(1964721376);
            if (j0.n.K()) {
                j0.n.V(1964721376, i10, -1, "androidx.compose.material.minimumInteractiveComponentSize.<anonymous> (InteractiveComponentSize.kt:54)");
            }
            if (((Boolean) lVar.C(o0.b())).booleanValue()) {
                eVar2 = new v0(o0.f14912c, null);
            } else {
                eVar2 = androidx.compose.ui.e.f2335a;
            }
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return eVar2;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    static {
        j0.v1<Boolean> d10 = j0.u.d(a.f14913f);
        f14910a = d10;
        f14911b = d10;
        float f10 = 48;
        f14912c = j2.i.b(j2.h.j(f10), j2.h.j(f10));
    }

    public static final j0.v1<Boolean> b() {
        return f14910a;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        if (androidx.compose.ui.platform.k1.c()) {
            a10 = new b();
        } else {
            a10 = androidx.compose.ui.platform.k1.a();
        }
        return androidx.compose.ui.c.a(eVar, a10, c.f14914f);
    }
}
