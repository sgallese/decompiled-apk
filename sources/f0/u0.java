package f0;

/* compiled from: MaterialTheme.android.kt */
/* loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialTheme.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f15098f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f15099m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f15098f = pVar;
            this.f15099m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            u0.a(this.f15098f, lVar, j0.z1.a(this.f15099m | 1));
        }
    }

    public static final void a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(-1322912246);
        if ((i10 & 14) == 0) {
            if (q10.l(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-1322912246, i11, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            pVar.invoke(q10, Integer.valueOf(i11 & 14));
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(pVar, i10));
        }
    }
}
