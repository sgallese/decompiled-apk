package n1;

import androidx.compose.ui.platform.m1;

/* compiled from: OnRemeasuredModifier.kt */
/* loaded from: classes.dex */
public final class t0 {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<m1, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l f20030f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pc.l lVar) {
            super(1);
            this.f20030f = lVar;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("onSizeChanged");
            m1Var.a().c("onSizeChanged", this.f20030f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(m1 m1Var) {
            a(m1Var);
            return dc.w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, pc.l<? super j2.p, dc.w> lVar) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "onSizeChanged");
        if (androidx.compose.ui.platform.k1.c()) {
            a10 = new a(lVar);
        } else {
            a10 = androidx.compose.ui.platform.k1.a();
        }
        return eVar.a(new u0(lVar, a10));
    }
}
