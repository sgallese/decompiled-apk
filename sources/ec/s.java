package ec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
/* loaded from: classes4.dex */
public class s {
    public static <E> List<E> a(List<E> list) {
        qc.q.i(list, "builder");
        return ((fc.b) list).l();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        qc.q.i(tArr, "<this>");
        if (!z10 || !qc.q.d(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            qc.q.h(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
            return copyOf;
        }
        return tArr;
    }

    public static <E> List<E> c(int i10) {
        return new fc.b(i10);
    }

    public static <T> List<T> d(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        qc.q.h(singletonList, "singletonList(element)");
        return singletonList;
    }
}
