package v1;

import a2.l;
import java.util.List;
import v1.d;

/* compiled from: ParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class q {
    public static final p a(String str, k0 k0Var, List<d.b<b0>> list, List<d.b<u>> list2, j2.e eVar, l.b bVar) {
        qc.q.i(str, "text");
        qc.q.i(k0Var, "style");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        return d2.e.a(str, k0Var, list, list2, eVar, bVar);
    }

    public static /* synthetic */ p b(String str, k0 k0Var, List list, List list2, j2.e eVar, l.b bVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = ec.t.i();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = ec.t.i();
        }
        return a(str, k0Var, list3, list2, eVar, bVar);
    }
}
