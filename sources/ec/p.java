package ec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Arrays.kt */
/* loaded from: classes4.dex */
public class p extends o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Iterable<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object[] f14186f;

        public a(Object[] objArr) {
            this.f14186f = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return qc.c.a(this.f14186f);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements xc.g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object[] f14187a;

        public b(Object[] objArr) {
            this.f14187a = objArr;
        }

        @Override // xc.g
        public Iterator<T> iterator() {
            return qc.c.a(this.f14187a);
        }
    }

    public static <T> Iterable<T> E(T[] tArr) {
        boolean z10;
        List i10;
        qc.q.i(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = t.i();
            return i10;
        }
        return new a(tArr);
    }

    public static <T> xc.g<T> F(T[] tArr) {
        boolean z10;
        xc.g<T> e10;
        qc.q.i(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            e10 = xc.m.e();
            return e10;
        }
        return new b(tArr);
    }

    public static boolean G(char[] cArr, char c10) {
        qc.q.i(cArr, "<this>");
        if (R(cArr, c10) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean H(T[] tArr, T t10) {
        int S;
        qc.q.i(tArr, "<this>");
        S = S(tArr, t10);
        if (S >= 0) {
            return true;
        }
        return false;
    }

    public static <T> List<T> I(T[] tArr, int i10) {
        boolean z10;
        int d10;
        qc.q.i(tArr, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d10 = vc.l.d(tArr.length - i10, 0);
            return Y(tArr, d10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> J(T[] tArr) {
        qc.q.i(tArr, "<this>");
        return (List) K(tArr, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C K(T[] tArr, C c10) {
        qc.q.i(tArr, "<this>");
        qc.q.i(c10, "destination");
        for (T t10 : tArr) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T L(T[] tArr) {
        boolean z10;
        qc.q.i(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T M(T[] tArr) {
        boolean z10;
        qc.q.i(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return tArr[0];
    }

    public static vc.f N(int[] iArr) {
        int O;
        qc.q.i(iArr, "<this>");
        O = O(iArr);
        return new vc.f(0, O);
    }

    public static int O(int[] iArr) {
        qc.q.i(iArr, "<this>");
        return iArr.length - 1;
    }

    public static <T> int P(T[] tArr) {
        qc.q.i(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T Q(T[] tArr, int i10) {
        int P;
        qc.q.i(tArr, "<this>");
        if (i10 >= 0) {
            P = P(tArr);
            if (i10 <= P) {
                return tArr[i10];
            }
        }
        return null;
    }

    public static final int R(char[] cArr, char c10) {
        qc.q.i(cArr, "<this>");
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    public static <T> int S(T[] tArr, T t10) {
        qc.q.i(tArr, "<this>");
        int i10 = 0;
        if (t10 == null) {
            int length = tArr.length;
            while (i10 < length) {
                if (tArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i10 < length2) {
            if (qc.q.d(t10, tArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> int T(T[] tArr, T t10) {
        qc.q.i(tArr, "<this>");
        if (t10 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (qc.q.d(t10, tArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    public static Integer U(int[] iArr) {
        boolean z10;
        int O;
        qc.q.i(iArr, "<this>");
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        int i10 = iArr[0];
        O = O(iArr);
        h0 it = new vc.f(1, O).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.a()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    public static Integer V(int[] iArr) {
        boolean z10;
        int O;
        qc.q.i(iArr, "<this>");
        if (iArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        int i10 = iArr[0];
        O = O(iArr);
        h0 it = new vc.f(1, O).iterator();
        while (it.hasNext()) {
            int i11 = iArr[it.a()];
            if (i10 > i11) {
                i10 = i11;
            }
        }
        return Integer.valueOf(i10);
    }

    public static char W(char[] cArr) {
        qc.q.i(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T X(T[] tArr) {
        qc.q.i(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final <T> List<T> Y(T[] tArr, int i10) {
        boolean z10;
        List<T> d10;
        List<T> b02;
        List<T> i11;
        qc.q.i(tArr, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                i11 = t.i();
                return i11;
            } else if (i10 >= tArr.length) {
                b02 = b0(tArr);
                return b02;
            } else if (i10 == 1) {
                d10 = s.d(tArr[0]);
                return d10;
            } else {
                ArrayList arrayList = new ArrayList(i10);
                int i12 = 0;
                for (T t10 : tArr) {
                    arrayList.add(t10);
                    i12++;
                    if (i12 == i10) {
                        break;
                    }
                }
                return arrayList;
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <C extends Collection<? super Integer>> C Z(int[] iArr, C c10) {
        qc.q.i(iArr, "<this>");
        qc.q.i(c10, "destination");
        for (int i10 : iArr) {
            c10.add(Integer.valueOf(i10));
        }
        return c10;
    }

    public static final <T, C extends Collection<? super T>> C a0(T[] tArr, C c10) {
        qc.q.i(tArr, "<this>");
        qc.q.i(c10, "destination");
        for (T t10 : tArr) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> b0(T[] tArr) {
        List<T> i10;
        List<T> d10;
        List<T> d02;
        qc.q.i(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            i10 = t.i();
            return i10;
        } else if (length != 1) {
            d02 = d0(tArr);
            return d02;
        } else {
            d10 = s.d(tArr[0]);
            return d10;
        }
    }

    public static List<Integer> c0(int[] iArr) {
        qc.q.i(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static <T> List<T> d0(T[] tArr) {
        qc.q.i(tArr, "<this>");
        return new ArrayList(t.f(tArr));
    }

    public static Set<Integer> e0(int[] iArr) {
        Set<Integer> b10;
        Set<Integer> a10;
        int d10;
        qc.q.i(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            b10 = u0.b();
            return b10;
        } else if (length != 1) {
            d10 = m0.d(iArr.length);
            return (Set) Z(iArr, new LinkedHashSet(d10));
        } else {
            a10 = t0.a(Integer.valueOf(iArr[0]));
            return a10;
        }
    }

    public static final <T> Set<T> f0(T[] tArr) {
        Set<T> b10;
        Set<T> a10;
        int d10;
        qc.q.i(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            b10 = u0.b();
            return b10;
        } else if (length != 1) {
            d10 = m0.d(tArr.length);
            return (Set) a0(tArr, new LinkedHashSet(d10));
        } else {
            a10 = t0.a(tArr[0]);
            return a10;
        }
    }
}
