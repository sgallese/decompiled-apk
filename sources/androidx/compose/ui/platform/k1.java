package androidx.compose.ui.platform;

/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.l<m1, dc.w> f2737a = a.f2739f;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2738b;

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2739f = new a();

        a() {
            super(1);
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    public static final pc.l<m1, dc.w> a() {
        return f2737a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, pc.l<? super m1, dc.w> lVar, androidx.compose.ui.e eVar2) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "inspectorInfo");
        qc.q.i(eVar2, "wrapped");
        j1 j1Var = new j1(lVar);
        return eVar.a(j1Var).a(eVar2).a(j1Var.e());
    }

    public static final boolean c() {
        return f2738b;
    }
}
