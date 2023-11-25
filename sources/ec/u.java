package ec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* loaded from: classes4.dex */
public class u extends t {
    public static <T> int s(Iterable<? extends T> iterable, int i10) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i10;
    }

    public static <T> List<T> t(Iterable<? extends Iterable<? extends T>> iterable) {
        qc.q.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            r.w(arrayList, it.next());
        }
        return arrayList;
    }
}
