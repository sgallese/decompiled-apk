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

/* compiled from: Size.kt */
/* loaded from: classes.dex */
final class f extends e.c implements e0 {
    private w.m A;
    private float B;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2085f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f2085f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f2085f, 0, 0, 0.0f, 4, null);
        }
    }

    public f(w.m mVar, float f10) {
        q.i(mVar, "direction");
        this.A = mVar;
        this.B = f10;
    }

    public final void I1(w.m mVar) {
        q.i(mVar, "<set-?>");
        this.A = mVar;
    }

    public final void J1(float f10) {
        this.B = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        int p10;
        int n10;
        int m10;
        int i10;
        int d10;
        int d11;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        if (j2.b.j(j10) && this.A != w.m.Vertical) {
            d11 = sc.c.d(j2.b.n(j10) * this.B);
            p10 = vc.l.l(d11, j2.b.p(j10), j2.b.n(j10));
            n10 = p10;
        } else {
            p10 = j2.b.p(j10);
            n10 = j2.b.n(j10);
        }
        if (j2.b.i(j10) && this.A != w.m.Horizontal) {
            d10 = sc.c.d(j2.b.m(j10) * this.B);
            i10 = vc.l.l(d10, j2.b.o(j10), j2.b.m(j10));
            m10 = i10;
        } else {
            int o10 = j2.b.o(j10);
            m10 = j2.b.m(j10);
            i10 = o10;
        }
        y0 w10 = g0Var.w(j2.c.a(p10, n10, i10, m10));
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
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
