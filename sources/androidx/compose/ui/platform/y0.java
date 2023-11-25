package androidx.compose.ui.platform;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f2953a = new y0();

    /* renamed from: b  reason: collision with root package name */
    public static pc.p<j0.l, Integer, dc.w> f2954b = q0.c.c(-1759434350, false, a.f2955f);

    /* compiled from: Wrapper.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2955f = new a();

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
                j0.n.V(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:129)");
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    public final pc.p<j0.l, Integer, dc.w> a() {
        return f2954b;
    }
}
