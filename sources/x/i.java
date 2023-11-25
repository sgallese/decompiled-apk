package x;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: LazyListHeaders.kt */
/* loaded from: classes.dex */
public final class i {
    public static final u a(List<u> list, v vVar, List<Integer> list2, int i10, int i11, int i12) {
        Object a02;
        int i13;
        Integer num;
        int k10;
        qc.q.i(list, "composedVisibleItems");
        qc.q.i(vVar, "itemProvider");
        qc.q.i(list2, "headerIndexes");
        a02 = ec.b0.a0(list);
        int index = ((u) a02).getIndex();
        int size = list2.size();
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (i14 < size && list2.get(i14).intValue() <= index) {
            i15 = list2.get(i14).intValue();
            i14++;
            if (i14 >= 0) {
                k10 = ec.t.k(list2);
                if (i14 <= k10) {
                    num = list2.get(i14);
                    i16 = num.intValue();
                }
            }
            num = -1;
            i16 = num.intValue();
        }
        int size2 = list.size();
        int i17 = RecyclerView.UNDEFINED_DURATION;
        int i18 = RecyclerView.UNDEFINED_DURATION;
        int i19 = -1;
        for (int i20 = 0; i20 < size2; i20++) {
            u uVar = list.get(i20);
            if (uVar.getIndex() == i15) {
                i17 = uVar.e();
                i19 = i20;
            } else if (uVar.getIndex() == i16) {
                i18 = uVar.e();
            }
        }
        if (i15 == -1) {
            return null;
        }
        u b10 = vVar.b(i15);
        if (i17 != Integer.MIN_VALUE) {
            i13 = Math.max(-i10, i17);
        } else {
            i13 = -i10;
        }
        if (i18 != Integer.MIN_VALUE) {
            i13 = Math.min(i13, i18 - b10.i());
        }
        b10.m(i13, i11, i12);
        if (i19 != -1) {
            list.set(i19, b10);
        } else {
            list.add(0, b10);
        }
        return b10;
    }
}
