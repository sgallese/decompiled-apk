package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import dc.w;
import j2.r;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;
import p1.d0;
import p1.e0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class p extends e.c implements e0 {
    private w.m A;
    private boolean B;
    private pc.p<? super j2.p, ? super r, j2.l> C;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f2138m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y0 f2139p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f2140q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ l0 f2141r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, y0 y0Var, int i11, l0 l0Var) {
            super(1);
            this.f2138m = i10;
            this.f2139p = y0Var;
            this.f2140q = i11;
            this.f2141r = l0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            y0.a.p(aVar, this.f2139p, p.this.I1().invoke(j2.p.b(j2.q.a(this.f2138m - this.f2139p.A0(), this.f2140q - this.f2139p.l0())), this.f2141r.getLayoutDirection()).n(), 0.0f, 2, null);
        }
    }

    public p(w.m mVar, boolean z10, pc.p<? super j2.p, ? super r, j2.l> pVar) {
        q.i(mVar, "direction");
        q.i(pVar, "alignmentCallback");
        this.A = mVar;
        this.B = z10;
        this.C = pVar;
    }

    public final pc.p<j2.p, r, j2.l> I1() {
        return this.C;
    }

    public final void J1(pc.p<? super j2.p, ? super r, j2.l> pVar) {
        q.i(pVar, "<set-?>");
        this.C = pVar;
    }

    public final void K1(w.m mVar) {
        q.i(mVar, "<set-?>");
        this.A = mVar;
    }

    public final void L1(boolean z10) {
        this.B = z10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        int p10;
        int n10;
        int l10;
        int l11;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        w.m mVar = this.A;
        w.m mVar2 = w.m.Vertical;
        int i10 = 0;
        if (mVar != mVar2) {
            p10 = 0;
        } else {
            p10 = j2.b.p(j10);
        }
        w.m mVar3 = this.A;
        w.m mVar4 = w.m.Horizontal;
        if (mVar3 == mVar4) {
            i10 = j2.b.o(j10);
        }
        int i11 = Integer.MAX_VALUE;
        if (this.A != mVar2 && this.B) {
            n10 = Integer.MAX_VALUE;
        } else {
            n10 = j2.b.n(j10);
        }
        if (this.A == mVar4 || !this.B) {
            i11 = j2.b.m(j10);
        }
        y0 w10 = g0Var.w(j2.c.a(p10, n10, i10, i11));
        l10 = vc.l.l(w10.A0(), j2.b.p(j10), j2.b.n(j10));
        l11 = vc.l.l(w10.l0(), j2.b.o(j10), j2.b.m(j10));
        return k0.b(l0Var, l10, l11, null, new a(l10, w10, l11, l0Var), 4, null);
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
