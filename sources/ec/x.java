package ec;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes4.dex */
public class x extends w {
    public static <T extends Comparable<? super T>> void u(List<T> list) {
        qc.q.i(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void v(List<T> list, Comparator<? super T> comparator) {
        qc.q.i(list, "<this>");
        qc.q.i(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
