package g0;

import ad.k0;
import androidx.compose.ui.platform.z0;
import dc.w;
import hc.g;
import j0.g3;
import j0.h0;
import j0.l;
import j0.n;
import j0.x;
import j0.y2;
import j2.h;
import qc.c0;
import qc.q;
import qc.r;

/* compiled from: PullRefreshState.kt */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: PullRefreshState.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f16002f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f16003m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c0 f16004p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c0 f16005q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, boolean z10, c0 c0Var, c0 c0Var2) {
            super(0);
            this.f16002f = eVar;
            this.f16003m = z10;
            this.f16004p = c0Var;
            this.f16005q = c0Var2;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f16002f.t(this.f16003m);
            this.f16002f.v(this.f16004p.f21658f);
            this.f16002f.u(this.f16005q.f21658f);
        }
    }

    public static final e a(boolean z10, pc.a<w> aVar, float f10, float f11, l lVar, int i10, int i11) {
        boolean z11;
        q.i(aVar, "onRefresh");
        lVar.e(-174977512);
        if ((i11 & 4) != 0) {
            f10 = g0.a.f15964a.a();
        }
        if ((i11 & 8) != 0) {
            f11 = g0.a.f15964a.b();
        }
        if (n.K()) {
            n.V(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:56)");
        }
        if (h.i(f10, h.j(0)) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar.e(773894976);
            lVar.e(-492369756);
            Object f12 = lVar.f();
            l.a aVar2 = l.f18688a;
            if (f12 == aVar2.a()) {
                Object xVar = new x(h0.h(g.f16601f, lVar));
                lVar.J(xVar);
                f12 = xVar;
            }
            lVar.N();
            k0 a10 = ((x) f12).a();
            lVar.N();
            g3 m10 = y2.m(aVar, lVar, (i10 >> 3) & 14);
            c0 c0Var = new c0();
            c0 c0Var2 = new c0();
            j2.e eVar = (j2.e) lVar.C(z0.e());
            c0Var.f21658f = eVar.v0(f10);
            c0Var2.f21658f = eVar.v0(f11);
            lVar.e(1157296644);
            boolean Q = lVar.Q(a10);
            Object f13 = lVar.f();
            if (Q || f13 == aVar2.a()) {
                f13 = new e(a10, m10, c0Var2.f21658f, c0Var.f21658f);
                lVar.J(f13);
            }
            lVar.N();
            e eVar2 = (e) f13;
            h0.f(new a(eVar2, z10, c0Var, c0Var2), lVar, 0);
            if (n.K()) {
                n.U();
            }
            lVar.N();
            return eVar2;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }
}
