package c0;

/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8265a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> f8266b = q0.c.c(671295101, false, a.f8267f);

    /* compiled from: CoreTextField.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<pc.p<? super j0.l, ? super Integer, ? extends dc.w>, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8267f = new a();

        a() {
            super(3);
        }

        public final void a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
            int i11;
            qc.q.i(pVar, "innerTextField");
            if ((i10 & 14) == 0) {
                if (lVar.l(pVar)) {
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
                j0.n.V(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:203)");
            }
            pVar.invoke(lVar, Integer.valueOf(i10 & 14));
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(pc.p<? super j0.l, ? super Integer, ? extends dc.w> pVar, j0.l lVar, Integer num) {
            a(pVar, lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    public final pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> a() {
        return f8266b;
    }
}
