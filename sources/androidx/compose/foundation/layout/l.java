package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.d0;
import p1.e0;
import qc.q;
import qc.r;
import w.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class l extends e.c implements e0 {
    private s A;

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2106f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l0 f2107m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ l f2108p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, l0 l0Var, l lVar) {
            super(1);
            this.f2106f = y0Var;
            this.f2107m = l0Var;
            this.f2108p = lVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.n(aVar, this.f2106f, this.f2107m.K0(this.f2108p.I1().c(this.f2107m.getLayoutDirection())), this.f2107m.K0(this.f2108p.I1().d()), 0.0f, 4, null);
        }
    }

    public l(s sVar) {
        q.i(sVar, "paddingValues");
        this.A = sVar;
    }

    public final s I1() {
        return this.A;
    }

    public final void J1(s sVar) {
        q.i(sVar, "<set-?>");
        this.A = sVar;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        boolean z10 = false;
        float f10 = 0;
        if (j2.h.i(this.A.c(l0Var.getLayoutDirection()), j2.h.j(f10)) >= 0 && j2.h.i(this.A.d(), j2.h.j(f10)) >= 0 && j2.h.i(this.A.b(l0Var.getLayoutDirection()), j2.h.j(f10)) >= 0 && j2.h.i(this.A.a(), j2.h.j(f10)) >= 0) {
            z10 = true;
        }
        if (z10) {
            int K0 = l0Var.K0(this.A.c(l0Var.getLayoutDirection())) + l0Var.K0(this.A.b(l0Var.getLayoutDirection()));
            int K02 = l0Var.K0(this.A.d()) + l0Var.K0(this.A.a());
            y0 w10 = g0Var.w(j2.c.h(j10, -K0, -K02));
            return k0.b(l0Var, j2.c.g(j10, w10.A0() + K0), j2.c.f(j10, w10.l0() + K02), null, new a(w10, l0Var, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // p1.e0
    public /* synthetic */ int f(n1.n nVar, n1.m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n1.n nVar, n1.m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n1.n nVar, n1.m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n1.n nVar, n1.m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }
}
