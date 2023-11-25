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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class i extends e.c implements e0 {
    private pc.l<? super j2.e, j2.l> A;
    private boolean B;

    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<y0.a, w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l0 f2093m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y0 f2094p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0 l0Var, y0 y0Var) {
            super(1);
            this.f2093m = l0Var;
            this.f2094p = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            long n10 = i.this.I1().invoke(this.f2093m).n();
            if (i.this.J1()) {
                y0.a.t(aVar, this.f2094p, j2.l.j(n10), j2.l.k(n10), 0.0f, null, 12, null);
            } else {
                y0.a.x(aVar, this.f2094p, j2.l.j(n10), j2.l.k(n10), 0.0f, null, 12, null);
            }
        }
    }

    public i(pc.l<? super j2.e, j2.l> lVar, boolean z10) {
        q.i(lVar, "offset");
        this.A = lVar;
        this.B = z10;
    }

    public final pc.l<j2.e, j2.l> I1() {
        return this.A;
    }

    public final boolean J1() {
        return this.B;
    }

    public final void K1(pc.l<? super j2.e, j2.l> lVar) {
        q.i(lVar, "<set-?>");
        this.A = lVar;
    }

    public final void L1(boolean z10) {
        this.B = z10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(l0Var, w10), 4, null);
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
