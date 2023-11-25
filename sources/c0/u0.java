package c0;

import a2.l;
import java.util.List;
import v1.d;

/* compiled from: TextLayoutHelper.kt */
/* loaded from: classes.dex */
public final class u0 {
    public static final boolean a(v1.g0 g0Var, v1.d dVar, v1.k0 k0Var, List<d.b<v1.u>> list, int i10, boolean z10, int i11, j2.e eVar, j2.r rVar, l.b bVar, long j10) {
        qc.q.i(g0Var, "$this$canReuse");
        qc.q.i(dVar, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(bVar, "fontFamilyResolver");
        v1.f0 k10 = g0Var.k();
        if (g0Var.v().i().b() || !qc.q.d(k10.j(), dVar) || !k10.i().G(k0Var) || !qc.q.d(k10.g(), list) || k10.e() != i10 || k10.h() != z10 || !g2.u.e(k10.f(), i11) || !qc.q.d(k10.b(), eVar) || k10.d() != rVar || !qc.q.d(k10.c(), bVar) || j2.b.p(j10) != j2.b.p(k10.a())) {
            return false;
        }
        if (!z10 && !g2.u.e(i11, g2.u.f16099a.b())) {
            return true;
        }
        if (j2.b.n(j10) != j2.b.n(k10.a()) || j2.b.m(j10) != j2.b.m(k10.a())) {
            return false;
        }
        return true;
    }
}
