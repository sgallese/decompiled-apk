package androidx.compose.ui;

import androidx.compose.ui.e;
import dc.w;
import n1.g0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.m;
import n1.n;
import n1.y0;
import p1.d0;
import p1.e0;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: ZIndexModifier.kt */
/* loaded from: classes.dex */
public final class g extends e.c implements e0 {
    private float A;

    /* compiled from: ZIndexModifier.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements l<y0.a, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f2417f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f2418m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0 y0Var, g gVar) {
            super(1);
            this.f2417f = y0Var;
            this.f2418m = gVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
            invoke2(aVar);
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            q.i(aVar, "$this$layout");
            aVar.m(this.f2417f, 0, 0, this.f2418m.I1());
        }
    }

    public g(float f10) {
        this.A = f10;
    }

    public final float I1() {
        return this.A;
    }

    public final void J1(float f10) {
        this.A = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        y0 w10 = g0Var.w(j10);
        return k0.b(l0Var, w10.A0(), w10.l0(), null, new a(w10, this), 4, null);
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return d0.d(this, nVar, mVar, i10);
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.A + ')';
    }
}
