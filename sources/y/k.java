package y;

import java.util.ArrayList;
import java.util.List;
import y.y;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
/* loaded from: classes.dex */
public final class k {
    public static final List<Integer> a(o oVar, y yVar, g gVar) {
        vc.f a10;
        boolean z10;
        boolean z11;
        List<Integer> i10;
        qc.q.i(oVar, "<this>");
        qc.q.i(yVar, "pinnedItemList");
        qc.q.i(gVar, "beyondBoundsInfo");
        if (!gVar.d() && yVar.isEmpty()) {
            i10 = ec.t.i();
            return i10;
        }
        ArrayList arrayList = new ArrayList();
        if (gVar.d()) {
            a10 = new vc.f(gVar.c(), Math.min(gVar.b(), oVar.c() - 1));
        } else {
            a10 = vc.f.f25123r.a();
        }
        int size = yVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            y.a aVar = yVar.get(i11);
            int a11 = p.a(oVar, aVar.getKey(), aVar.getIndex());
            int h10 = a10.h();
            if (a11 <= a10.i() && h10 <= a11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (a11 >= 0 && a11 < oVar.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(Integer.valueOf(a11));
                }
            }
        }
        int h11 = a10.h();
        int i12 = a10.i();
        if (h11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(h11));
                if (h11 == i12) {
                    break;
                }
                h11++;
            }
        }
        return arrayList;
    }
}
