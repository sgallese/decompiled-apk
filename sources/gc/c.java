package gc;

import java.util.Comparator;
import pc.l;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public class c {
    public static <T> Comparator<T> b(final l<? super T, ? extends Comparable<?>>... lVarArr) {
        boolean z10;
        q.i(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Comparator() { // from class: gc.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int c10;
                    c10 = c.c(lVarArr, obj, obj2);
                    return c10;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(l[] lVarArr, Object obj, Object obj2) {
        q.i(lVarArr, "$selectors");
        return e(obj, obj2, lVarArr);
    }

    public static <T extends Comparable<?>> int d(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    private static final <T> int e(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int d10 = a.d(lVar.invoke(t10), lVar.invoke(t11));
            if (d10 != 0) {
                return d10;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> f() {
        f fVar = f.f16326f;
        q.g(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return fVar;
    }
}
