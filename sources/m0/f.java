package m0;

import ec.o;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l0.f;
import qc.q;
import qc.r;

/* compiled from: PersistentVectorBuilder.kt */
/* loaded from: classes.dex */
public final class f<E> extends ec.f<E> implements f.a<E> {

    /* renamed from: f  reason: collision with root package name */
    private l0.f<? extends E> f19710f;

    /* renamed from: m  reason: collision with root package name */
    private Object[] f19711m;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f19712p;

    /* renamed from: q  reason: collision with root package name */
    private int f19713q;

    /* renamed from: r  reason: collision with root package name */
    private p0.e f19714r;

    /* renamed from: s  reason: collision with root package name */
    private Object[] f19715s;

    /* renamed from: t  reason: collision with root package name */
    private Object[] f19716t;

    /* renamed from: u  reason: collision with root package name */
    private int f19717u;

    /* compiled from: PersistentVectorBuilder.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.l<E, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Collection<E> f19718f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f19718f = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.l
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(this.f19718f.contains(e10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    public f(l0.f<? extends E> fVar, Object[] objArr, Object[] objArr2, int i10) {
        q.i(fVar, "vector");
        q.i(objArr2, "vectorTail");
        this.f19710f = fVar;
        this.f19711m = objArr;
        this.f19712p = objArr2;
        this.f19713q = i10;
        this.f19714r = new p0.e();
        this.f19715s = this.f19711m;
        this.f19716t = this.f19712p;
        this.f19717u = this.f19710f.size();
    }

    private final Object[] A(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        boolean z10;
        if (it.hasNext()) {
            if (i11 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 == 0) {
                    return it.next();
                }
                Object[] s10 = s(objArr);
                int a10 = l.a(i10, i11);
                int i12 = i11 - 5;
                s10[a10] = A((Object[]) s10[a10], i10, i12, it);
                while (true) {
                    a10++;
                    if (a10 >= 32 || !it.hasNext()) {
                        break;
                    }
                    s10[a10] = A((Object[]) s10[a10], 0, i12, it);
                }
                return s10;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] C(Object[] objArr, int i10, Object[][] objArr2) {
        Object[] s10;
        Iterator<Object[]> a10 = qc.c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f19713q;
        if (i11 < (1 << i12)) {
            s10 = A(objArr, i10, i12, a10);
        } else {
            s10 = s(objArr);
        }
        while (a10.hasNext()) {
            this.f19713q += 5;
            s10 = v(s10);
            int i13 = this.f19713q;
            A(s10, 1 << i13, i13, a10);
        }
        return s10;
    }

    private final void D(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f19713q;
        if (size > (1 << i10)) {
            this.f19715s = E(v(objArr), objArr2, this.f19713q + 5);
            this.f19716t = objArr3;
            this.f19713q += 5;
            this.f19717u = size() + 1;
        } else if (objArr == null) {
            this.f19715s = objArr2;
            this.f19716t = objArr3;
            this.f19717u = size() + 1;
        } else {
            this.f19715s = E(objArr, objArr2, i10);
            this.f19716t = objArr3;
            this.f19717u = size() + 1;
        }
    }

    private final Object[] E(Object[] objArr, Object[] objArr2, int i10) {
        int a10 = l.a(size() - 1, i10);
        Object[] s10 = s(objArr);
        if (i10 == 5) {
            s10[a10] = objArr2;
        } else {
            s10[a10] = E((Object[]) s10[a10], objArr2, i10 - 5);
        }
        return s10;
    }

    private final int F(pc.l<? super E, Boolean> lVar, Object[] objArr, int i10, int i11, d dVar, List<Object[]> list, List<Object[]> list2) {
        Object[] u10;
        if (p(objArr)) {
            list.add(objArr);
        }
        Object a10 = dVar.a();
        q.g(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        Object[] objArr3 = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (!lVar.invoke(obj).booleanValue()) {
                if (i11 == 32) {
                    if ((!list.isEmpty()) != false) {
                        u10 = list.remove(list.size() - 1);
                    } else {
                        u10 = u();
                    }
                    objArr3 = u10;
                    i11 = 0;
                }
                objArr3[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr3);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i11;
    }

    private final int G(pc.l<? super E, Boolean> lVar, Object[] objArr, int i10, d dVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArr2 = s(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr2);
        return i11;
    }

    private final boolean H(pc.l<? super E, Boolean> lVar) {
        Object[] A;
        int S = S();
        d dVar = new d(null);
        if (this.f19715s == null) {
            if (I(lVar, S, dVar) == S) {
                return false;
            }
            return true;
        }
        ListIterator<Object[]> r10 = r(0);
        int i10 = 32;
        while (i10 == 32 && r10.hasNext()) {
            i10 = G(lVar, r10.next(), 32, dVar);
        }
        if (i10 == 32) {
            p0.a.a(!r10.hasNext());
            int I = I(lVar, S, dVar);
            if (I == 0) {
                y(this.f19715s, size(), this.f19713q);
            }
            if (I == S) {
                return false;
            }
            return true;
        }
        int previousIndex = r10.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = i10;
        while (r10.hasNext()) {
            i11 = F(lVar, r10.next(), 32, i11, dVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i12 = previousIndex;
        int F = F(lVar, this.f19716t, S, i11, dVar, arrayList2, arrayList);
        Object a10 = dVar.a();
        q.g(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        o.r(objArr, null, F, 32);
        if (arrayList.isEmpty()) {
            A = this.f19715s;
            q.f(A);
        } else {
            A = A(this.f19715s, i12, this.f19713q, arrayList.iterator());
        }
        int size = i12 + (arrayList.size() << 5);
        this.f19715s = N(A, size);
        this.f19716t = objArr;
        this.f19717u = size + F;
        return true;
    }

    private final int I(pc.l<? super E, Boolean> lVar, int i10, d dVar) {
        boolean z10;
        int G = G(lVar, this.f19716t, i10, dVar);
        if (G == i10) {
            if (dVar.a() == this.f19716t) {
                z10 = true;
            } else {
                z10 = false;
            }
            p0.a.a(z10);
            return i10;
        }
        Object a10 = dVar.a();
        q.g(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        o.r(objArr, null, G, i10);
        this.f19716t = objArr;
        this.f19717u = size() - (i10 - G);
        return G;
    }

    private final Object[] K(Object[] objArr, int i10, int i11, d dVar) {
        Object[] i12;
        int a10 = l.a(i11, i10);
        int i13 = 31;
        if (i10 == 0) {
            Object obj = objArr[a10];
            i12 = o.i(objArr, s(objArr), a10, a10 + 1, 32);
            i12[31] = dVar.a();
            dVar.b(obj);
            return i12;
        }
        if (objArr[31] == null) {
            i13 = l.a(O() - 1, i10);
        }
        Object[] s10 = s(objArr);
        int i14 = i10 - 5;
        int i15 = a10 + 1;
        if (i15 <= i13) {
            while (true) {
                Object obj2 = s10[i13];
                q.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                s10[i13] = K((Object[]) obj2, i14, 0, dVar);
                if (i13 == i15) {
                    break;
                }
                i13--;
            }
        }
        Object obj3 = s10[a10];
        q.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s10[a10] = K((Object[]) obj3, i14, i11, dVar);
        return s10;
    }

    private final Object M(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        Object[] i13;
        int size = size() - i10;
        if (i12 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0.a.a(z10);
        if (size == 1) {
            Object obj = this.f19716t[0];
            y(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f19716t;
        Object obj2 = objArr2[i12];
        i13 = o.i(objArr2, s(objArr2), i12, i12 + 1, size);
        i13[size - 1] = null;
        this.f19715s = objArr;
        this.f19716t = i13;
        this.f19717u = (i10 + size) - 1;
        this.f19713q = i11;
        return obj2;
    }

    private final Object[] N(Object[] objArr, int i10) {
        boolean z10;
        if ((i10 & 31) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                this.f19713q = 0;
                return null;
            }
            int i11 = i10 - 1;
            while (true) {
                int i12 = this.f19713q;
                if ((i11 >> i12) == 0) {
                    this.f19713q = i12 - 5;
                    Object[] objArr2 = objArr[0];
                    q.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr = objArr2;
                } else {
                    return w(objArr, i11, i12);
                }
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final int O() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] P(Object[] objArr, int i10, int i11, E e10, d dVar) {
        int a10 = l.a(i11, i10);
        Object[] s10 = s(objArr);
        if (i10 == 0) {
            if (s10 != objArr) {
                ((AbstractList) this).modCount++;
            }
            dVar.b(s10[a10]);
            s10[a10] = e10;
            return s10;
        }
        Object obj = s10[a10];
        q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s10[a10] = P((Object[]) obj, i10 - 5, i11, e10, dVar);
        return s10;
    }

    private final Object[] Q(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f19715s != null) {
            ListIterator<Object[]> r10 = r(O() >> 5);
            while (r10.previousIndex() != i10) {
                Object[] previous = r10.previous();
                o.i(previous, objArr2, 0, 32 - i11, 32);
                objArr2 = t(previous, i11);
                i12--;
                objArr[i12] = objArr2;
            }
            return r10.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void R(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        boolean z10;
        Object[] u10;
        if (i12 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Object[] s10 = s(objArr);
            objArr2[0] = s10;
            int i13 = i10 & 31;
            int size = ((i10 + collection.size()) - 1) & 31;
            int i14 = (i11 - i13) + size;
            if (i14 < 32) {
                o.i(s10, objArr3, size + 1, i13, i11);
            } else {
                int i15 = (i14 - 32) + 1;
                if (i12 == 1) {
                    u10 = s10;
                } else {
                    u10 = u();
                    i12--;
                    objArr2[i12] = u10;
                }
                int i16 = i11 - i15;
                o.i(s10, objArr3, 0, i16, i11);
                o.i(s10, u10, size + 1, i13, i16);
                objArr3 = u10;
            }
            Iterator<? extends E> it = collection.iterator();
            h(s10, i13, it);
            for (int i17 = 1; i17 < i12; i17++) {
                objArr2[i17] = h(u(), 0, it);
            }
            h(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int S() {
        return U(size());
    }

    private final int U(int i10) {
        if (i10 <= 32) {
            return i10;
        }
        return i10 - l.d(i10);
    }

    private final Object[] f(int i10) {
        if (O() <= i10) {
            return this.f19716t;
        }
        Object[] objArr = this.f19715s;
        q.f(objArr);
        for (int i11 = this.f19713q; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            q.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final void m(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f19715s != null) {
            int i13 = i10 >> 5;
            Object[] Q = Q(i13, i11, objArr, i12, objArr2);
            int O = i12 - (((O() >> 5) - 1) - i13);
            if (O < i12) {
                objArr2 = objArr[O];
                q.f(objArr2);
            }
            R(collection, i10, Q, 32, objArr, O, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] n(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object obj2;
        Object[] i12;
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            i12 = o.i(objArr, s(objArr), a10 + 1, a10, 31);
            i12[a10] = obj;
            return i12;
        }
        Object[] s10 = s(objArr);
        int i13 = i10 - 5;
        Object obj3 = s10[a10];
        q.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s10[a10] = n((Object[]) obj3, i13, i11, obj, dVar);
        while (true) {
            a10++;
            if (a10 >= 32 || (obj2 = s10[a10]) == null) {
                break;
            }
            q.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            s10[a10] = n((Object[]) obj2, i13, 0, dVar.a(), dVar);
        }
        return s10;
    }

    private final void o(Object[] objArr, int i10, E e10) {
        int S = S();
        Object[] s10 = s(this.f19716t);
        if (S < 32) {
            o.i(this.f19716t, s10, i10 + 1, i10, S);
            s10[i10] = e10;
            this.f19715s = objArr;
            this.f19716t = s10;
            this.f19717u = size() + 1;
            return;
        }
        Object[] objArr2 = this.f19716t;
        Object obj = objArr2[31];
        o.i(objArr2, s10, i10 + 1, i10, 31);
        s10[i10] = e10;
        D(objArr, s10, v(obj));
    }

    private final boolean p(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f19714r) {
            return true;
        }
        return false;
    }

    private final ListIterator<Object[]> r(int i10) {
        if (this.f19715s != null) {
            int O = O() >> 5;
            p0.d.b(i10, O);
            int i11 = this.f19713q;
            if (i11 == 0) {
                Object[] objArr = this.f19715s;
                q.f(objArr);
                return new i(objArr, i10);
            }
            Object[] objArr2 = this.f19715s;
            q.f(objArr2);
            return new k(objArr2, i10, O, i11 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] s(Object[] objArr) {
        int h10;
        Object[] m10;
        if (objArr == null) {
            return u();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] u10 = u();
        h10 = vc.l.h(objArr.length, 32);
        m10 = o.m(objArr, u10, 0, 0, h10, 6, null);
        return m10;
    }

    private final Object[] t(Object[] objArr, int i10) {
        Object[] i11;
        Object[] i12;
        if (p(objArr)) {
            i12 = o.i(objArr, objArr, i10, 0, 32 - i10);
            return i12;
        }
        i11 = o.i(objArr, u(), i10, 0, 32 - i10);
        return i11;
    }

    private final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f19714r;
        return objArr;
    }

    private final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f19714r;
        return objArr;
    }

    private final Object[] w(Object[] objArr, int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 == 0) {
                return objArr;
            }
            int a10 = l.a(i10, i11);
            Object obj = objArr[a10];
            q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object w10 = w((Object[]) obj, i10, i11 - 5);
            if (a10 < 31) {
                int i12 = a10 + 1;
                if (objArr[i12] != null) {
                    if (p(objArr)) {
                        o.r(objArr, null, i12, 32);
                    }
                    objArr = o.i(objArr, u(), 0, 0, i12);
                }
            }
            if (w10 != objArr[a10]) {
                Object[] s10 = s(objArr);
                s10[a10] = w10;
                return s10;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] x(Object[] objArr, int i10, int i11, d dVar) {
        Object[] x10;
        int a10 = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            x10 = null;
        } else {
            Object obj = objArr[a10];
            q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            x10 = x((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (x10 == null && a10 == 0) {
            return null;
        }
        Object[] s10 = s(objArr);
        s10[a10] = x10;
        return s10;
    }

    private final void y(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f19715s = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f19716t = objArr;
            this.f19717u = i10;
            this.f19713q = i11;
            return;
        }
        d dVar = new d(null);
        q.f(objArr);
        Object[] x10 = x(objArr, i11, i10, dVar);
        q.f(x10);
        Object a10 = dVar.a();
        q.g(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f19716t = (Object[]) a10;
        this.f19717u = i10;
        if (x10[1] == null) {
            this.f19715s = (Object[]) x10[0];
            this.f19713q = i11 - 5;
            return;
        }
        this.f19715s = x10;
        this.f19713q = i11;
    }

    public final boolean J(pc.l<? super E, Boolean> lVar) {
        q.i(lVar, "predicate");
        boolean H = H(lVar);
        if (H) {
            ((AbstractList) this).modCount++;
        }
        return H;
    }

    @Override // ec.f
    public int a() {
        return this.f19717u;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int S = S();
        if (S < 32) {
            Object[] s10 = s(this.f19716t);
            s10[S] = e10;
            this.f19716t = s10;
            this.f19717u = size() + 1;
        } else {
            D(this.f19715s, this.f19716t, v(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        q.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int S = S();
        Iterator<? extends E> it = collection.iterator();
        if (32 - S >= collection.size()) {
            this.f19716t = h(s(this.f19716t), S, it);
            this.f19717u = size() + collection.size();
        } else {
            int size = ((collection.size() + S) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = h(s(this.f19716t), S, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = h(u(), 0, it);
            }
            this.f19715s = C(this.f19715s, O(), objArr);
            this.f19716t = h(u(), 0, it);
            this.f19717u = size() + collection.size();
        }
        return true;
    }

    @Override // l0.f.a
    public l0.f<E> build() {
        e eVar;
        boolean z10;
        if (this.f19715s == this.f19711m && this.f19716t == this.f19712p) {
            eVar = this.f19710f;
        } else {
            this.f19714r = new p0.e();
            Object[] objArr = this.f19715s;
            this.f19711m = objArr;
            Object[] objArr2 = this.f19716t;
            this.f19712p = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    eVar = l.b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f19716t, size());
                    q.h(copyOf, "copyOf(this, newSize)");
                    eVar = new j(copyOf);
                }
            } else {
                Object[] objArr3 = this.f19715s;
                q.f(objArr3);
                eVar = new e(objArr3, this.f19716t, size(), this.f19713q);
            }
        }
        this.f19710f = eVar;
        return (l0.f<E>) eVar;
    }

    @Override // ec.f
    public E e(int i10) {
        p0.d.a(i10, size());
        ((AbstractList) this).modCount++;
        int O = O();
        if (i10 >= O) {
            return (E) M(this.f19715s, O, this.f19713q, i10 - O);
        }
        d dVar = new d(this.f19716t[0]);
        Object[] objArr = this.f19715s;
        q.f(objArr);
        M(K(objArr, this.f19713q, i10, dVar), O, this.f19713q, 0);
        return (E) dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        p0.d.a(i10, size());
        return (E) f(i10)[i10 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final Object[] j() {
        return this.f19715s;
    }

    public final int k() {
        return this.f19713q;
    }

    public final Object[] l() {
        return this.f19716t;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        return J(new a(collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        p0.d.a(i10, size());
        if (O() <= i10) {
            Object[] s10 = s(this.f19716t);
            if (s10 != this.f19716t) {
                ((AbstractList) this).modCount++;
            }
            int i11 = i10 & 31;
            E e11 = (E) s10[i11];
            s10[i11] = e10;
            this.f19716t = s10;
            return e11;
        }
        d dVar = new d(null);
        Object[] objArr = this.f19715s;
        q.f(objArr);
        this.f19715s = P(objArr, this.f19713q, i10, e10, dVar);
        return (E) dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        p0.d.b(i10, size());
        return new h(this, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        p0.d.b(i10, size());
        if (i10 == size()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int O = O();
        if (i10 >= O) {
            o(this.f19715s, i10 - O, e10);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f19715s;
        q.f(objArr);
        o(n(objArr, this.f19713q, i10, e10, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        Object[] i11;
        Object[] i12;
        q.i(collection, "elements");
        p0.d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i13 = (i10 >> 5) << 5;
        int size = (((size() - i13) + collection.size()) - 1) / 32;
        if (size == 0) {
            p0.a.a(i10 >= O());
            int i14 = i10 & 31;
            int size2 = ((i10 + collection.size()) - 1) & 31;
            Object[] objArr = this.f19716t;
            i12 = o.i(objArr, s(objArr), size2 + 1, i14, S());
            h(i12, i14, collection.iterator());
            this.f19716t = i12;
            this.f19717u = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int S = S();
        int U = U(size() + collection.size());
        if (i10 >= O()) {
            i11 = u();
            R(collection, i10, this.f19716t, S, objArr2, size, i11);
        } else if (U <= S) {
            int i15 = S - U;
            i11 = o.i(this.f19716t, u(), 0, i15, S);
            int i16 = 32 - i15;
            Object[] t10 = t(this.f19716t, i16);
            int i17 = size - 1;
            objArr2[i17] = t10;
            m(collection, i10, i16, objArr2, i17, t10);
        } else {
            int i18 = U - S;
            i11 = t(this.f19716t, i18);
            m(collection, i10, i18, objArr2, size, i11);
        }
        this.f19715s = C(this.f19715s, i13, objArr2);
        this.f19716t = i11;
        this.f19717u = size() + collection.size();
        return true;
    }
}
