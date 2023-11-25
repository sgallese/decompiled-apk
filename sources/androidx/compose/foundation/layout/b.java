package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import n1.g0;
import n1.j0;
import n1.l0;
import p1.d0;
import p1.e0;
import qc.q;

/* compiled from: AlignmentLine.kt */
/* loaded from: classes.dex */
final class b extends e.c implements e0 {
    private n1.a A;
    private float B;
    private float C;

    public /* synthetic */ b(n1.a aVar, float f10, float f11, qc.h hVar) {
        this(aVar, f10, f11);
    }

    public final void I1(float f10) {
        this.C = f10;
    }

    public final void J1(n1.a aVar) {
        q.i(aVar, "<set-?>");
        this.A = aVar;
    }

    public final void K1(float f10) {
        this.B = f10;
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, g0 g0Var, long j10) {
        j0 c10;
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        c10 = a.c(l0Var, this.A, this.B, this.C, g0Var, j10);
        return c10;
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

    private b(n1.a aVar, float f10, float f11) {
        q.i(aVar, "alignmentLine");
        this.A = aVar;
        this.B = f10;
        this.C = f11;
    }
}
