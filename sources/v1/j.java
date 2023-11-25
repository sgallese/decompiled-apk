package v1;

import java.util.ArrayList;
import java.util.List;
import v1.d;

/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.b<u>> b(List<d.b<u>> list, int i10, int i11) {
        boolean z10;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<u> bVar = list.get(i12);
            d.b<u> bVar2 = bVar;
            if (e.l(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            if (i10 <= bVar3.f() && bVar3.d() <= i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList2.add(new d.b(bVar3.e(), bVar3.f() - i10, bVar3.d() - i10));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
