package j0;

/* compiled from: Composition.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f18651a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static pc.p<l, Integer, dc.w> f18652b = q0.c.c(954879418, false, a.f18654f);

    /* renamed from: c  reason: collision with root package name */
    public static pc.p<l, Integer, dc.w> f18653c = q0.c.c(1918065384, false, b.f18655f);

    /* compiled from: Composition.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f18654f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:506)");
            }
            if (n.K()) {
                n.U();
            }
        }
    }

    /* compiled from: Composition.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f18655f = new b();

        b() {
            super(2);
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:597)");
            }
            if (n.K()) {
                n.U();
            }
        }
    }

    public final pc.p<l, Integer, dc.w> a() {
        return f18652b;
    }

    public final pc.p<l, Integer, dc.w> b() {
        return f18653c;
    }
}
