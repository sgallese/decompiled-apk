package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import dc.w;
import j2.h;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.e0;
import qc.q;
import qc.r;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
final class o extends e.c implements e0 {
    private float A;
    private float B;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2136f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var) {
            super(1);
            this.f2136f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.r(aVar, this.f2136f, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ o(float f10, float f11, qc.h hVar) {
        this(f10, f11);
    }

    public final void I1(float f10) {
        this.B = f10;
    }

    public final void J1(float f10) {
        this.A = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        int p10;
        int o10;
        int h10;
        int h11;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        float f10 = this.A;
        h.a aVar = j2.h.f18979m;
        if (!j2.h.l(f10, aVar.b()) && j2.b.p(j10) == 0) {
            h11 = vc.l.h(l0Var.K0(this.A), j2.b.n(j10));
            p10 = vc.l.d(h11, 0);
        } else {
            p10 = j2.b.p(j10);
        }
        int n10 = j2.b.n(j10);
        if (!j2.h.l(this.B, aVar.b()) && j2.b.o(j10) == 0) {
            h10 = vc.l.h(l0Var.K0(this.B), j2.b.m(j10));
            o10 = vc.l.d(h10, 0);
        } else {
            o10 = j2.b.o(j10);
        }
        y0 w10 = g0Var.w(j2.c.a(p10, n10, o10, j2.b.m(j10)));
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10), 4, null);
    }

    @Override // p1.e0
    public int f(n1.n nVar, n1.m mVar, int i10) {
        int i11;
        int d10;
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        int t10 = mVar.t(i10);
        if (!j2.h.l(this.A, j2.h.f18979m.b())) {
            i11 = nVar.K0(this.A);
        } else {
            i11 = 0;
        }
        d10 = vc.l.d(t10, i11);
        return d10;
    }

    @Override // p1.e0
    public int n(n1.n nVar, n1.m mVar, int i10) {
        int i11;
        int d10;
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        int a02 = mVar.a0(i10);
        if (!j2.h.l(this.B, j2.h.f18979m.b())) {
            i11 = nVar.K0(this.B);
        } else {
            i11 = 0;
        }
        d10 = vc.l.d(a02, i11);
        return d10;
    }

    @Override // p1.e0
    public int r(n1.n nVar, n1.m mVar, int i10) {
        int i11;
        int d10;
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        int g10 = mVar.g(i10);
        if (!j2.h.l(this.B, j2.h.f18979m.b())) {
            i11 = nVar.K0(this.B);
        } else {
            i11 = 0;
        }
        d10 = vc.l.d(g10, i11);
        return d10;
    }

    @Override // p1.e0
    public int t(n1.n nVar, n1.m mVar, int i10) {
        int i11;
        int d10;
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        int s10 = mVar.s(i10);
        if (!j2.h.l(this.A, j2.h.f18979m.b())) {
            i11 = nVar.K0(this.A);
        } else {
            i11 = 0;
        }
        d10 = vc.l.d(s10, i11);
        return d10;
    }

    private o(float f10, float f11) {
        this.A = f10;
        this.B = f11;
    }
}
