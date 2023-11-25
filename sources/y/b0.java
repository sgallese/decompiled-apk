package y;

import android.view.View;
import androidx.compose.ui.platform.j0;
import j0.g2;
import j0.z1;
import n1.i1;

/* compiled from: LazyLayoutPrefetcher.android.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z f26018f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f26019m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ i1 f26020p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f26021q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar, m mVar, i1 i1Var, int i10) {
            super(2);
            this.f26018f = zVar;
            this.f26019m = mVar;
            this.f26020p = i1Var;
            this.f26021q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            b0.a(this.f26018f, this.f26019m, this.f26020p, lVar, z1.a(this.f26021q | 1));
        }
    }

    public static final void a(z zVar, m mVar, i1 i1Var, j0.l lVar, int i10) {
        qc.q.i(zVar, "prefetchState");
        qc.q.i(mVar, "itemContentFactory");
        qc.q.i(i1Var, "subcomposeLayoutState");
        j0.l q10 = lVar.q(1113453182);
        if (j0.n.K()) {
            j0.n.V(1113453182, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view = (View) q10.C(j0.k());
        int i11 = i1.f19999g;
        q10.e(1618982084);
        boolean Q = q10.Q(i1Var) | q10.Q(zVar) | q10.Q(view);
        Object f10 = q10.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            q10.J(new a0(zVar, i1Var, mVar, view));
        }
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(zVar, mVar, i1Var, i10));
        }
    }
}
