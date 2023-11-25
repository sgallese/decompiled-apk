package n1;

import androidx.compose.ui.e;

/* compiled from: LayoutModifier.kt */
/* loaded from: classes.dex */
public final class a0 extends e.c implements p1.e0 {
    private pc.q<? super l0, ? super g0, ? super j2.b, ? extends j0> A;

    public a0(pc.q<? super l0, ? super g0, ? super j2.b, ? extends j0> qVar) {
        qc.q.i(qVar, "measureBlock");
        this.A = qVar;
    }

    public final void I1(pc.q<? super l0, ? super g0, ? super j2.b, ? extends j0> qVar) {
        qc.q.i(qVar, "<set-?>");
        this.A = qVar;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(g0Var, "measurable");
        return this.A.invoke(l0Var, g0Var, j2.b.b(j10));
    }

    @Override // p1.e0
    public /* synthetic */ int f(n nVar, m mVar, int i10) {
        return p1.d0.b(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int n(n nVar, m mVar, int i10) {
        return p1.d0.c(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int r(n nVar, m mVar, int i10) {
        return p1.d0.a(this, nVar, mVar, i10);
    }

    @Override // p1.e0
    public /* synthetic */ int t(n nVar, m mVar, int i10) {
        return p1.d0.d(this, nVar, mVar, i10);
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.A + ')';
    }
}
