package f0;

/* compiled from: SnackbarHost.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f14830a = new m();

    /* renamed from: b  reason: collision with root package name */
    public static pc.q<j1, j0.l, Integer, dc.w> f14831b = q0.c.c(996639038, false, a.f14832f);

    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<j1, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f14832f = new a();

        a() {
            super(3);
        }

        public final void a(j1 j1Var, j0.l lVar, int i10) {
            int i11;
            int i12;
            qc.q.i(j1Var, "it");
            if ((i10 & 14) == 0) {
                if (lVar.Q(j1Var)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i10 | i12;
            } else {
                i11 = i10;
            }
            if ((i11 & 91) == 18 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            o1.d(j1Var, null, false, null, 0L, 0L, 0L, 0.0f, lVar, i11 & 14, 254);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j1 j1Var, j0.l lVar, Integer num) {
            a(j1Var, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    public final pc.q<j1, j0.l, Integer, dc.w> a() {
        return f14831b;
    }
}
