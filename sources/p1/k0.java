package p1;

import java.util.Map;

/* compiled from: LayoutNodeAlignmentLines.kt */
/* loaded from: classes.dex */
public final class k0 extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(b bVar) {
        super(bVar, null);
        qc.q.i(bVar, "alignmentLinesOwner");
    }

    @Override // p1.a
    protected long d(x0 x0Var, long j10) {
        qc.q.i(x0Var, "$this$calculatePositionInParent");
        return x0Var.C2(j10);
    }

    @Override // p1.a
    protected Map<n1.a, Integer> e(x0 x0Var) {
        qc.q.i(x0Var, "<this>");
        return x0Var.g1().d();
    }

    @Override // p1.a
    protected int i(x0 x0Var, n1.a aVar) {
        qc.q.i(x0Var, "<this>");
        qc.q.i(aVar, "alignmentLine");
        return x0Var.G(aVar);
    }
}
