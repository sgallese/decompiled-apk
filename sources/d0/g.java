package d0;

import a1.s1;
import a2.l;
import dc.w;
import java.util.List;
import n1.j0;
import n1.l0;
import n1.m;
import n1.n;
import n1.s;
import p1.e0;
import p1.h0;
import p1.r;
import p1.u;
import qc.q;
import v1.d;
import v1.g0;
import v1.k0;

/* compiled from: SelectableTextAnnotatedStringNode.kt */
/* loaded from: classes.dex */
public final class g extends p1.l implements e0, r, u {
    private final h C;
    private final k D;

    public /* synthetic */ g(v1.d dVar, k0 k0Var, l.b bVar, pc.l lVar, int i10, boolean z10, int i11, int i12, List list, pc.l lVar2, h hVar, s1 s1Var, qc.h hVar2) {
        this(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var);
    }

    public final void N1(v1.d dVar, k0 k0Var, List<d.b<v1.u>> list, int i10, int i11, boolean z10, l.b bVar, int i12, pc.l<? super g0, w> lVar, pc.l<? super List<z0.h>, w> lVar2, h hVar, s1 s1Var) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        k kVar = this.D;
        kVar.J1(kVar.T1(s1Var, k0Var), this.D.V1(dVar), this.D.U1(k0Var, list, i10, i11, z10, bVar, i12), this.D.S1(lVar, lVar2, hVar));
        h0.b(this);
    }

    @Override // p1.e0
    public j0 d(l0 l0Var, n1.g0 g0Var, long j10) {
        q.i(l0Var, "$this$measure");
        q.i(g0Var, "measurable");
        return this.D.P1(l0Var, g0Var, j10);
    }

    @Override // p1.r
    public /* synthetic */ void d0() {
        p1.q.a(this);
    }

    @Override // p1.e0
    public int f(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return this.D.O1(nVar, mVar, i10);
    }

    @Override // p1.e0
    public int n(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return this.D.Q1(nVar, mVar, i10);
    }

    @Override // p1.e0
    public int r(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return this.D.N1(nVar, mVar, i10);
    }

    @Override // p1.r
    public void s(c1.c cVar) {
        q.i(cVar, "<this>");
        this.D.K1(cVar);
    }

    @Override // p1.e0
    public int t(n nVar, m mVar, int i10) {
        q.i(nVar, "<this>");
        q.i(mVar, "measurable");
        return this.D.R1(nVar, mVar, i10);
    }

    @Override // p1.u
    public void w(s sVar) {
        q.i(sVar, "coordinates");
        h hVar = this.C;
        if (hVar != null) {
            hVar.g(sVar);
        }
    }

    private g(v1.d dVar, k0 k0Var, l.b bVar, pc.l<? super g0, w> lVar, int i10, boolean z10, int i11, int i12, List<d.b<v1.u>> list, pc.l<? super List<z0.h>, w> lVar2, h hVar, s1 s1Var) {
        q.i(dVar, "text");
        q.i(k0Var, "style");
        q.i(bVar, "fontFamilyResolver");
        this.C = hVar;
        this.D = (k) I1(new k(dVar, k0Var, bVar, lVar, i10, z10, i11, i12, list, lVar2, hVar, s1Var, null));
        if (hVar == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null".toString());
        }
    }
}
