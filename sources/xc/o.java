package xc;

import ec.t;
import ec.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: _Sequences.kt */
/* loaded from: classes4.dex */
public class o extends n {

    /* compiled from: Iterables.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Iterable<T>, rc.a {

        /* renamed from: f */
        final /* synthetic */ g f25968f;

        public a(g gVar) {
            this.f25968f = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f25968f.iterator();
        }
    }

    /* compiled from: _Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> extends qc.r implements pc.l<Integer, T> {

        /* renamed from: f */
        final /* synthetic */ int f25969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f25969f = i10;
        }

        public final T invoke(int i10) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f25969f + '.');
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* compiled from: _Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class c<T> extends qc.r implements pc.l<T, Boolean> {

        /* renamed from: f */
        public static final c f25970f = new c();

        c() {
            super(1);
        }

        @Override // pc.l
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((c<T>) obj);
        }
    }

    /* compiled from: _Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class d<T> implements g<T> {

        /* renamed from: a */
        final /* synthetic */ g<T> f25971a;

        /* renamed from: b */
        final /* synthetic */ Comparator<? super T> f25972b;

        /* JADX WARN: Multi-variable type inference failed */
        d(g<? extends T> gVar, Comparator<? super T> comparator) {
            this.f25971a = gVar;
            this.f25972b = comparator;
        }

        @Override // xc.g
        public Iterator<T> iterator() {
            List E;
            E = o.E(this.f25971a);
            x.v(E, this.f25972b);
            return E.iterator();
        }
    }

    public static <T> g<T> A(g<? extends T> gVar, int i10) {
        boolean z10;
        g<T> e10;
        qc.q.i(gVar, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                e10 = m.e();
                return e10;
            } else if (gVar instanceof xc.c) {
                return ((xc.c) gVar).a(i10);
            } else {
                return new q(gVar, i10);
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> g<T> B(g<? extends T> gVar, pc.l<? super T, Boolean> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "predicate");
        return new r(gVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C C(g<? extends T> gVar, C c10) {
        qc.q.i(gVar, "<this>");
        qc.q.i(c10, "destination");
        Iterator<? extends T> it = gVar.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static <T> List<T> D(g<? extends T> gVar) {
        List<T> d10;
        List<T> i10;
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            i10 = t.i();
            return i10;
        }
        T next = it.next();
        if (!it.hasNext()) {
            d10 = ec.s.d(next);
            return d10;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static <T> List<T> E(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        return (List) C(gVar, new ArrayList());
    }

    public static <T> Iterable<T> h(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        return new a(gVar);
    }

    public static <T> int i(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
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

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> g<T> j(g<? extends T> gVar, int i10) {
        boolean z10;
        qc.q.i(gVar, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 != 0) {
                if (gVar instanceof xc.c) {
                    return ((xc.c) gVar).b(i10);
                }
                return new xc.b(gVar, i10);
            }
            return gVar;
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static <T> T k(g<? extends T> gVar, int i10) {
        qc.q.i(gVar, "<this>");
        return (T) l(gVar, i10, new b(i10));
    }

    public static final <T> T l(g<? extends T> gVar, int i10, pc.l<? super Integer, ? extends T> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "defaultValue");
        if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : gVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return lVar.invoke(Integer.valueOf(i10));
    }

    public static <T> g<T> m(g<? extends T> gVar, pc.l<? super T, Boolean> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "predicate");
        return new e(gVar, true, lVar);
    }

    public static final <T> g<T> n(g<? extends T> gVar, pc.l<? super T, Boolean> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "predicate");
        return new e(gVar, false, lVar);
    }

    public static <T> g<T> o(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        g<T> n10 = n(gVar, c.f25970f);
        qc.q.g(n10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return n10;
    }

    public static <T> T p(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static <T> int q(g<? extends T> gVar, T t10) {
        qc.q.i(gVar, "<this>");
        int i10 = 0;
        for (T t11 : gVar) {
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

    public static final <T, A extends Appendable> A r(g<? extends T> gVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(a10, "buffer");
        qc.q.i(charSequence, "separator");
        qc.q.i(charSequence2, "prefix");
        qc.q.i(charSequence3, "postfix");
        qc.q.i(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : gVar) {
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

    public static final <T> String s(g<? extends T> gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l<? super T, ? extends CharSequence> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(charSequence, "separator");
        qc.q.i(charSequence2, "prefix");
        qc.q.i(charSequence3, "postfix");
        qc.q.i(charSequence4, "truncated");
        String sb2 = ((StringBuilder) r(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qc.q.h(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String t(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pc.l lVar, int i11, Object obj) {
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
        return s(gVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static <T> T u(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static <T> T v(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T, R> g<R> w(g<? extends T> gVar, pc.l<? super T, ? extends R> lVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "transform");
        return new s(gVar, lVar);
    }

    public static <T, R> g<R> x(g<? extends T> gVar, pc.l<? super T, ? extends R> lVar) {
        g<R> o10;
        qc.q.i(gVar, "<this>");
        qc.q.i(lVar, "transform");
        o10 = o(new s(gVar, lVar));
        return o10;
    }

    public static <T extends Comparable<? super T>> T y(g<? extends T> gVar) {
        qc.q.i(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
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

    public static <T> g<T> z(g<? extends T> gVar, Comparator<? super T> comparator) {
        qc.q.i(gVar, "<this>");
        qc.q.i(comparator, "comparator");
        return new d(gVar, comparator);
    }
}
