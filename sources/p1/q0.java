package p1;

import java.util.Map;

/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public final class q0 extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b bVar) {
        super(bVar, null);
        qc.q.i(bVar, "alignmentLinesOwner");
    }

    @Override // p1.a
    protected long d(x0 x0Var, long j10) {
        qc.q.i(x0Var, "$this$calculatePositionInParent");
        s0 P1 = x0Var.P1();
        qc.q.f(P1);
        long i12 = P1.i1();
        return z0.f.t(z0.g.a(j2.l.j(i12), j2.l.k(i12)), j10);
    }

    @Override // p1.a
    protected Map<n1.a, Integer> e(x0 x0Var) {
        qc.q.i(x0Var, "<this>");
        s0 P1 = x0Var.P1();
        qc.q.f(P1);
        return P1.g1().d();
    }

    @Override // p1.a
    protected int i(x0 x0Var, n1.a aVar) {
        qc.q.i(x0Var, "<this>");
        qc.q.i(aVar, "alignmentLine");
        s0 P1 = x0Var.P1();
        qc.q.f(P1);
        return P1.G(aVar);
    }
}
