package t;

import android.content.Context;
import android.os.Build;
import n1.y0;

/* compiled from: AndroidOverscroll.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final androidx.compose.ui.e f23115a;

    /* compiled from: AndroidOverscroll.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<n1.l0, n1.g0, j2.b, n1.j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23116f = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidOverscroll.kt */
        /* renamed from: t.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0543a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f23117f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f23118m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0543a(y0 y0Var, int i10) {
                super(1);
                this.f23117f = y0Var;
                this.f23118m = i10;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                y0 y0Var = this.f23117f;
                y0.a.x(aVar, y0Var, ((-this.f23118m) / 2) - ((y0Var.A0() - this.f23117f.q0()) / 2), ((-this.f23118m) / 2) - ((this.f23117f.l0() - this.f23117f.m0()) / 2), 0.0f, null, 12, null);
            }
        }

        a() {
            super(3);
        }

        public final n1.j0 a(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$layout");
            qc.q.i(g0Var, "measurable");
            y0 w10 = g0Var.w(j10);
            int K0 = l0Var.K0(j2.h.j(m.b() * 2));
            return n1.k0.b(l0Var, w10.q0() - K0, w10.m0() - K0, null, new C0543a(w10, K0), 4, null);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ n1.j0 invoke(n1.l0 l0Var, n1.g0 g0Var, j2.b bVar) {
            return a(l0Var, g0Var, bVar.t());
        }
    }

    /* compiled from: AndroidOverscroll.kt */
    /* renamed from: t.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0544b extends qc.r implements pc.q<n1.l0, n1.g0, j2.b, n1.j0> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0544b f23119f = new C0544b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidOverscroll.kt */
        /* renamed from: t.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ y0 f23120f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f23121m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y0 y0Var, int i10) {
                super(1);
                this.f23120f = y0Var;
                this.f23121m = i10;
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
                y0 y0Var = this.f23120f;
                int i10 = this.f23121m;
                y0.a.n(aVar, y0Var, i10 / 2, i10 / 2, 0.0f, 4, null);
            }
        }

        C0544b() {
            super(3);
        }

        public final n1.j0 a(n1.l0 l0Var, n1.g0 g0Var, long j10) {
            qc.q.i(l0Var, "$this$layout");
            qc.q.i(g0Var, "measurable");
            y0 w10 = g0Var.w(j10);
            int K0 = l0Var.K0(j2.h.j(m.b() * 2));
            return n1.k0.b(l0Var, w10.A0() + K0, w10.l0() + K0, null, new a(w10, K0), 4, null);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ n1.j0 invoke(n1.l0 l0Var, n1.g0 g0Var, j2.b bVar) {
            return a(l0Var, g0Var, bVar.t());
        }
    }

    static {
        androidx.compose.ui.e eVar;
        if (Build.VERSION.SDK_INT >= 31) {
            eVar = androidx.compose.ui.layout.b.a(androidx.compose.ui.layout.b.a(androidx.compose.ui.e.f2335a, a.f23116f), C0544b.f23119f);
        } else {
            eVar = androidx.compose.ui.e.f2335a;
        }
        f23115a = eVar;
    }

    public static final i0 b(j0.l lVar, int i10) {
        i0 i0Var;
        lVar.e(-81138291);
        if (j0.n.K()) {
            j0.n.V(-81138291, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.kt:62)");
        }
        Context context = (Context) lVar.C(androidx.compose.ui.platform.j0.g());
        g0 g0Var = (g0) lVar.C(h0.a());
        if (g0Var != null) {
            lVar.e(511388516);
            boolean Q = lVar.Q(context) | lVar.Q(g0Var);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new t.a(context, g0Var);
                lVar.J(f10);
            }
            lVar.N();
            i0Var = (i0) f10;
        } else {
            i0Var = f0.f23173a;
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return i0Var;
    }
}
