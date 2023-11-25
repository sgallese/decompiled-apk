package n1;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f19961a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static pc.p<j0.l, Integer, dc.w> f19962b = q0.c.c(-1741544742, false, a.f19963f);

    /* compiled from: SubcomposeLayout.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19963f = new a();

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
                j0.n.V(-1741544742, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:679)");
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    public final pc.p<j0.l, Integer, dc.w> a() {
        return f19962b;
    }
}
