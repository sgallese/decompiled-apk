package ec;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReversedViews.kt */
/* loaded from: classes4.dex */
public class z extends y {
    public static <T> List<T> M(List<? extends T> list) {
        qc.q.i(list, "<this>");
        return new q0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int N(List<?> list, int i10) {
        int k10;
        int k11;
        int k12;
        k10 = t.k(list);
        if (new vc.f(0, k10).m(i10)) {
            k12 = t.k(list);
            return k12 - i10;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Element index ");
        sb2.append(i10);
        sb2.append(" must be in range [");
        k11 = t.k(list);
        sb2.append(new vc.f(0, k11));
        sb2.append("].");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(List<?> list, int i10) {
        int k10;
        k10 = t.k(list);
        return k10 - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int P(List<?> list, int i10) {
        if (new vc.f(0, list.size()).m(i10)) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new vc.f(0, list.size()) + "].");
    }
}
