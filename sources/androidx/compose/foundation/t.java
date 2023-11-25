package androidx.compose.foundation;

import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class t extends e.c implements e0 {
    private s A;
    private boolean B;
    private boolean C;

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f2241m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y0 f2242p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, y0 y0Var) {
            super(1);
            this.f2241m = i10;
            this.f2242p = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            int l10;
            qc.q.i(aVar, "$this$layout");
            l10 = vc.l.l(t.this.I1().l(), 0, this.f2241m);
            int i10 = t.this.J1() ? l10 - this.f2241m : -l10;
            y0.a.t(aVar, this.f2242p, t.this.K1() ? 0 : i10, t.this.K1() ? i10 : 0, 0.0f, null, 12, null);
        }
    }

    public t(s sVar, boolean z10, boolean z11) {
        qc.q.i(sVar, "scrollerState");
        this.A = sVar;
        this.B = z10;
        this.C = z11;
    }

    public final s I1() {
        return this.A;
    }

    public final boolean J1() {
        return this.B;
    }

    public final boolean K1() {
        return this.C;
    }

    public final void L1(boolean z10) {
        this.B = z10;
    }

    public final void M1(s sVar) {
        qc.q.i(sVar, "<set-?>");
        this.A = sVar;
    }

    public final void N1(boolean z10) {
        this.C = z10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        u.o oVar;
        int m10;
        int i10;
        int h10;
        int h11;
        int i11;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        if (this.C) {
            oVar = u.o.Vertical;
        } else {
            oVar = u.o.Horizontal;
        }
        t.j.a(j10, oVar);
        if (this.C) {
            m10 = Integer.MAX_VALUE;
        } else {
            m10 = j2.b.m(j10);
        }
        if (this.C) {
            i10 = j2.b.n(j10);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        y0 w10 = g0Var.w(j2.b.e(j10, 0, i10, 0, m10, 5, null));
        h10 = vc.l.h(w10.A0(), j2.b.n(j10));
        h11 = vc.l.h(w10.l0(), j2.b.m(j10));
        int l02 = w10.l0() - h11;
        int A0 = w10.A0() - h10;
        if (!this.C) {
            l02 = A0;
        }
        this.A.m(l02);
        s sVar = this.A;
        if (this.C) {
            i11 = h11;
        } else {
            i11 = h10;
        }
        sVar.o(i11);
        return k0.b(l0Var, h10, h11, null, new a(l02, w10), 4, null);
    }

    @Override // p1.e0
    public int f(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        if (this.C) {
            return mVar.t(Integer.MAX_VALUE);
        }
        return mVar.t(i10);
    }

    @Override // p1.e0
    public int n(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        if (this.C) {
            return mVar.a0(i10);
        }
        return mVar.a0(Integer.MAX_VALUE);
    }

    @Override // p1.e0
    public int r(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        if (this.C) {
            return mVar.g(i10);
        }
        return mVar.g(Integer.MAX_VALUE);
    }

    @Override // p1.e0
    public int t(n1.n nVar, n1.m mVar, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(mVar, "measurable");
        if (this.C) {
            return mVar.s(Integer.MAX_VALUE);
        }
        return mVar.s(i10);
    }
}
