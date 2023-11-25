package ec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Collections.kt */
/* loaded from: classes4.dex */
public class t extends s {
    public static <T> ArrayList<T> e(T... tArr) {
        qc.q.i(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new j(tArr, true));
    }

    public static final <T> Collection<T> f(T[] tArr) {
        qc.q.i(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int g(List<? extends T> list, T t10, int i10, int i11) {
        int d10;
        qc.q.i(list, "<this>");
        p(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            d10 = gc.c.d(list.get(i13), t10);
            if (d10 < 0) {
                i10 = i13 + 1;
            } else if (d10 > 0) {
                i12 = i13 - 1;
            } else {
                return i13;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int h(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return g(list, comparable, i10, i11);
    }

    public static <T> List<T> i() {
        return d0.f14173f;
    }

    public static vc.f j(Collection<?> collection) {
        qc.q.i(collection, "<this>");
        return new vc.f(0, collection.size() - 1);
    }

    public static <T> int k(List<? extends T> list) {
        qc.q.i(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T... tArr) {
        List<T> i10;
        List<T> c10;
        qc.q.i(tArr, "elements");
        if (tArr.length > 0) {
            c10 = o.c(tArr);
            return c10;
        }
        i10 = i();
        return i10;
    }

    public static <T> List<T> m(T... tArr) {
        List<T> J;
        qc.q.i(tArr, "elements");
        J = p.J(tArr);
        return J;
    }

    public static <T> List<T> n(T... tArr) {
        qc.q.i(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new j(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> o(List<? extends T> list) {
        List<T> i10;
        List<T> d10;
        qc.q.i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            i10 = i();
            return i10;
        } else if (size == 1) {
            d10 = s.d(list.get(0));
            return d10;
        } else {
            return list;
        }
    }

    private static final void p(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 >= 0) {
                if (i12 <= i10) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
    }

    public static void q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
