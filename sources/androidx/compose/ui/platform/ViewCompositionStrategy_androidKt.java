package androidx.compose.ui.platform;

import androidx.lifecycle.p;

/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f */
        final /* synthetic */ androidx.lifecycle.p f2555f;

        /* renamed from: m */
        final /* synthetic */ androidx.lifecycle.s f2556m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.lifecycle.p pVar, androidx.lifecycle.s sVar) {
            super(0);
            this.f2555f = pVar;
            this.f2556m = sVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            this.f2555f.d(this.f2556m);
        }
    }

    public static final /* synthetic */ pc.a a(androidx.compose.ui.platform.a aVar, androidx.lifecycle.p pVar) {
        return b(aVar, pVar);
    }

    public static final pc.a<dc.w> b(final androidx.compose.ui.platform.a aVar, androidx.lifecycle.p pVar) {
        boolean z10;
        if (pVar.b().compareTo(p.b.DESTROYED) > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.lifecycle.s sVar = new androidx.lifecycle.s() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$observer$1
                @Override // androidx.lifecycle.s
                public final void c(androidx.lifecycle.v vVar, p.a aVar2) {
                    qc.q.i(vVar, "<anonymous parameter 0>");
                    qc.q.i(aVar2, "event");
                    if (aVar2 == p.a.ON_DESTROY) {
                        a.this.e();
                    }
                }
            };
            pVar.a(sVar);
            return new a(pVar, sVar);
        }
        throw new IllegalStateException(("Cannot configure " + aVar + " to disposeComposition at Lifecycle ON_DESTROY: " + pVar + "is already destroyed").toString());
    }
}
