package d2;

import a2.l;
import java.util.List;
import v1.b0;
import v1.d;
import v1.k0;

/* compiled from: ActualParagraph.android.kt.kt */
/* loaded from: classes.dex */
public final class f {
    public static final v1.m a(v1.p pVar, int i10, boolean z10, long j10) {
        qc.q.i(pVar, "paragraphIntrinsics");
        return new v1.a((d) pVar, i10, z10, j10, null);
    }

    public static final v1.m b(String str, k0 k0Var, List<d.b<b0>> list, List<d.b<v1.u>> list2, int i10, boolean z10, long j10, j2.e eVar, l.b bVar) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        return new v1.a(new d(str, k0Var, list, list2, bVar, eVar), i10, z10, j10, null);
    }
}
