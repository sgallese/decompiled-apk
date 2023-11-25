package ec;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: _Collections.kt */
/* loaded from: classes4.dex */
public class b0 extends a0 {

    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements xc.g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f14162a;

        public a(Iterable iterable) {
            this.f14162a = iterable;
        }

        @Override // xc.g
        public Iterator<T> iterator() {
            return this.f14162a.iterator();
        }
    }

    public static float[] A0(Collection<Float> collection) {
        qc.q.i(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static int[] B0(Collection<Integer> collection) {
        qc.q.i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> C0(Iterable<? extends T> iterable) {
        List<T> i10;
        Object next;
        List<T> d10;
        List<T> F0;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                i10 = t.i();
                return i10;
            } else if (size != 1) {
                F0 = F0(collection);
                return F0;
            } else {
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                d10 = s.d(next);
                return d10;
            }
        }
        return t.o(E0(iterable));
    }

    public static long[] D0(Collection<Long> collection) {
        qc.q.i(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> List<T> E0(Iterable<? extends T> iterable) {
        List<T> F0;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            F0 = F0((Collection) iterable);
            return F0;
        }
        return (List) z0(iterable, new ArrayList());
    }

    public static <T> List<T> F0(Collection<? extends T> collection) {
        qc.q.i(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> G0(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) z0(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> H0(Iterable<? extends T> iterable) {
        Set<T> b10;
        Object next;
        Set<T> a10;
        int d10;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b10 = u0.b();
                return b10;
            } else if (size != 1) {
                d10 = m0.d(collection.size());
                return (Set) z0(iterable, new LinkedHashSet(d10));
            } else {
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                a10 = t0.a(next);
                return a10;
            }
        }
        return u0.c((Set) z0(iterable, new LinkedHashSet()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0031, code lost:
    
        r5 = vc.l.h(r10, r0 - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.List<java.util.List<T>> I0(java.lang.Iterable<? extends T> r9, int r10, int r11, boolean r12) {
        /*
            java.lang.String r0 = "<this>"
            qc.q.i(r9, r0)
            ec.w0.a(r10, r11)
            boolean r0 = r9 instanceof java.util.RandomAccess
            r1 = 0
            if (r0 == 0) goto L55
            boolean r0 = r9 instanceof java.util.List
            if (r0 == 0) goto L55
            java.util.List r9 = (java.util.List) r9
            int r0 = r9.size()
            int r2 = r0 / r11
            int r3 = r0 % r11
            r4 = 1
            if (r3 != 0) goto L20
            r3 = 0
            goto L21
        L20:
            r3 = 1
        L21:
            int r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r2 = 0
        L28:
            if (r2 < 0) goto L2e
            if (r2 >= r0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 == 0) goto L54
            int r5 = r0 - r2
            int r5 = vc.j.h(r10, r5)
            if (r5 >= r10) goto L3b
            if (r12 == 0) goto L54
        L3b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            r7 = 0
        L41:
            if (r7 >= r5) goto L4f
            int r8 = r7 + r2
            java.lang.Object r8 = r9.get(r8)
            r6.add(r8)
            int r7 = r7 + 1
            goto L41
        L4f:
            r3.add(r6)
            int r2 = r2 + r11
            goto L28
        L54:
            return r3
        L55:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            java.util.Iterator r9 = ec.w0.b(r9, r10, r11, r12, r1)
        L62:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L72
            java.lang.Object r10 = r9.next()
            java.util.List r10 = (java.util.List) r10
            r0.add(r10)
            goto L62
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.b0.I0(java.lang.Iterable, int, int, boolean):java.util.List");
    }

    public static <T, R> List<dc.l<T, R>> J0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        int s10;
        int s11;
        qc.q.i(iterable, "<this>");
        qc.q.i(iterable2, TaskSetupFragment.TYPE_OTHER);
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        s10 = u.s(iterable, 10);
        s11 = u.s(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(s10, s11));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(dc.r.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> xc.g<T> R(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<List<T>> S(Iterable<? extends T> iterable, int i10) {
        List<List<T>> I0;
        qc.q.i(iterable, "<this>");
        I0 = I0(iterable, i10, i10, true);
        return I0;
    }

    public static <T> boolean T(Iterable<? extends T> iterable, T t10) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        if (e0(iterable, t10) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> int U(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                t.q();
            }
        }
        return i10;
    }

    public static <T> List<T> V(Iterable<? extends T> iterable, int i10) {
        boolean z10;
        ArrayList arrayList;
        List<T> d10;
        List<T> i11;
        List<T> C0;
        qc.q.i(iterable, "<this>");
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                C0 = C0(iterable);
                return C0;
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    i11 = t.i();
                    return i11;
                } else if (size == 1) {
                    d10 = s.d(l0(iterable));
                    return d10;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i10 < size2) {
                                arrayList.add(((List) iterable).get(i10));
                                i10++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i10);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t10 : iterable) {
                if (i12 >= i10) {
                    arrayList.add(t10);
                } else {
                    i12++;
                }
            }
            return t.o(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> W(List<? extends T> list, int i10) {
        boolean z10;
        int d10;
        List<T> y02;
        qc.q.i(list, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            List<? extends T> list2 = list;
            d10 = vc.l.d(list.size() - i10, 0);
            y02 = y0(list2, d10);
            return y02;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> List<T> X(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        return (List) Y(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C Y(Iterable<? extends T> iterable, C c10) {
        qc.q.i(iterable, "<this>");
        qc.q.i(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static <T> T Z(Iterable<? extends T> iterable) {
        Object a02;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof List) {
            a02 = a0((List) iterable);
            return (T) a02;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T a0(List<? extends T> list) {
        qc.q.i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T b0(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> T c0(List<? extends T> list) {
        qc.q.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> T d0(List<? extends T> list, int i10) {
        int k10;
        qc.q.i(list, "<this>");
        if (i10 >= 0) {
            k10 = t.k(list);
            if (i10 <= k10) {
                return list.get(i10);
            }
        }
        return null;
    }

    public static final <T> int e0(Iterable<? extends T> iterable, T t10) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                t.r();
            }
            if (qc.q.d(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static <T> int f0(List<? extends T> list, T t10) {
        qc.q.i(list, "<this>");
        return list.indexOf(t10);
    }

    public static <T> Set<T> g0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> G0;
        qc.q.i(iterable, "<this>");
        qc.q.i(iterable2, TaskSetupFragment.TYPE_OTHER);
        G0 = G0(iterable);
        y.I(G0, iterable2);
        return G0;
    }

    public static final <T, A extends Appendable> A h0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        qc.q.i(iterable, "<this>");
        qc.q.i(a10, "buffer");
        qc.q.i(charSequence, "separator");
        qc.q.i(charSequence2, "prefix");
        qc.q.i(charSequence3, "postfix");
        qc.q.i(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            yc.n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static /* synthetic */ Appendable i0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i12;
        CharSequence charSequence7;
        pc.l lVar2;
        if ((i11 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i11 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i11 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i11 & 16) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i11 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return h0(iterable, appendable, charSequence5, charSequence6, charSequence8, i12, charSequence7, lVar2);
    }

    public static final <T> String j0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        qc.q.i(iterable, "<this>");
        qc.q.i(charSequence, "separator");
        qc.q.i(charSequence2, "prefix");
        qc.q.i(charSequence3, "postfix");
        qc.q.i(charSequence4, "truncated");
        String sb2 = ((StringBuilder) h0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qc.q.h(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String k0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l lVar, int i11, Object obj) {
        CharSequence charSequence5;
        int i12;
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i11 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i11 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i11 & 8) != 0) {
            i12 = -1;
        } else {
            i12 = i10;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return j0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T l0(Iterable<? extends T> iterable) {
        Object m02;
        qc.q.i(iterable, "<this>");
        if (iterable instanceof List) {
            m02 = m0((List) iterable);
            return (T) m02;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T m0(List<? extends T> list) {
        int k10;
        qc.q.i(list, "<this>");
        if (!list.isEmpty()) {
            k10 = t.k(list);
            return list.get(k10);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T n0(List<? extends T> list) {
        qc.q.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T o0(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T p0(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> q0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        List<T> C0;
        qc.q.i(iterable, "<this>");
        qc.q.i(iterable2, "elements");
        Collection y10 = y.y(iterable2);
        if (y10.isEmpty()) {
            C0 = C0(iterable);
            return C0;
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!y10.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> r0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        qc.q.i(collection, "<this>");
        qc.q.i(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        y.w(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> s0(Collection<? extends T> collection, T t10) {
        qc.q.i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> List<T> t0(Iterable<? extends T> iterable) {
        List<T> C0;
        qc.q.i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            C0 = C0(iterable);
            return C0;
        }
        List<T> E0 = E0(iterable);
        a0.Q(E0);
        return E0;
    }

    public static <T> T u0(Iterable<? extends T> iterable) {
        qc.q.i(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) v0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T v0(List<? extends T> list) {
        qc.q.i(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T w0(List<? extends T> list) {
        qc.q.i(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> x0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> c10;
        List<T> C0;
        qc.q.i(iterable, "<this>");
        qc.q.i(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                C0 = C0(iterable);
                return C0;
            }
            Object[] array = collection.toArray(new Object[0]);
            o.C(array, comparator);
            c10 = o.c(array);
            return c10;
        }
        List<T> E0 = E0(iterable);
        x.v(E0, comparator);
        return E0;
    }

    public static <T> List<T> y0(Iterable<? extends T> iterable, int i10) {
        boolean z10;
        Object Z;
        List<T> d10;
        List<T> C0;
        List<T> i11;
        qc.q.i(iterable, "<this>");
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                i11 = t.i();
                return i11;
            }
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    C0 = C0(iterable);
                    return C0;
                } else if (i10 == 1) {
                    Z = Z(iterable);
                    d10 = s.d(Z);
                    return d10;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
                i12++;
                if (i12 == i10) {
                    break;
                }
            }
            return t.o(arrayList);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T, C extends Collection<? super T>> C z0(Iterable<? extends T> iterable, C c10) {
        qc.q.i(iterable, "<this>");
        qc.q.i(c10, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }
}
