package ec;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes4.dex */
public final class k<E> extends f<E> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f14181q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    private static final Object[] f14182r = new Object[0];

    /* renamed from: f  reason: collision with root package name */
    private int f14183f;

    /* renamed from: m  reason: collision with root package name */
    private Object[] f14184m;

    /* renamed from: p  reason: collision with root package name */
    private int f14185p;

    /* compiled from: ArrayDeque.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                if (i11 > 2147483639) {
                    return Integer.MAX_VALUE;
                }
                return 2147483639;
            }
            return i12;
        }
    }

    public k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f14182r;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f14184m = objArr;
    }

    private final void i(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f14184m.length;
        while (i10 < length && it.hasNext()) {
            this.f14184m[i10] = it.next();
            i10++;
        }
        int i11 = this.f14183f;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f14184m[i12] = it.next();
        }
        this.f14185p = size() + collection.size();
    }

    private final void j(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f14184m;
        o.i(objArr2, objArr, 0, this.f14183f, objArr2.length);
        Object[] objArr3 = this.f14184m;
        int length = objArr3.length;
        int i11 = this.f14183f;
        o.i(objArr3, objArr, length - i11, 0, i11);
        this.f14183f = 0;
        this.f14184m = objArr;
    }

    private final int k(int i10) {
        int P;
        if (i10 == 0) {
            P = p.P(this.f14184m);
            return P;
        }
        return i10 - 1;
    }

    private final void l(int i10) {
        int d10;
        if (i10 >= 0) {
            Object[] objArr = this.f14184m;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f14182r) {
                d10 = vc.l.d(i10, 10);
                this.f14184m = new Object[d10];
                return;
            }
            j(f14181q.a(objArr.length, i10));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int n(int i10) {
        int P;
        P = p.P(this.f14184m);
        if (i10 == P) {
            return 0;
        }
        return i10 + 1;
    }

    private final int p(int i10) {
        if (i10 < 0) {
            return i10 + this.f14184m.length;
        }
        return i10;
    }

    private final int r(int i10) {
        Object[] objArr = this.f14184m;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override // ec.f
    public int a() {
        return this.f14185p;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        h(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        qc.q.i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        l(size() + collection.size());
        i(r(this.f14183f + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int r10 = r(this.f14183f + size());
        int i10 = this.f14183f;
        if (i10 < r10) {
            o.r(this.f14184m, null, i10, r10);
        } else if ((!isEmpty()) != false) {
            Object[] objArr = this.f14184m;
            o.r(objArr, null, this.f14183f, objArr.length);
            o.r(this.f14184m, null, 0, r10);
        }
        this.f14183f = 0;
        this.f14185p = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // ec.f
    public E e(int i10) {
        int k10;
        int k11;
        c.f14163f.b(i10, size());
        k10 = t.k(this);
        if (i10 == k10) {
            return u();
        }
        if (i10 == 0) {
            return s();
        }
        int r10 = r(this.f14183f + i10);
        E e10 = (E) this.f14184m[r10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f14183f;
            if (r10 >= i11) {
                Object[] objArr = this.f14184m;
                o.i(objArr, objArr, i11 + 1, i11, r10);
            } else {
                Object[] objArr2 = this.f14184m;
                o.i(objArr2, objArr2, 1, 0, r10);
                Object[] objArr3 = this.f14184m;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f14183f;
                o.i(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f14184m;
            int i13 = this.f14183f;
            objArr4[i13] = null;
            this.f14183f = n(i13);
        } else {
            int i14 = this.f14183f;
            k11 = t.k(this);
            int r11 = r(i14 + k11);
            if (r10 <= r11) {
                Object[] objArr5 = this.f14184m;
                o.i(objArr5, objArr5, r10, r10 + 1, r11 + 1);
            } else {
                Object[] objArr6 = this.f14184m;
                o.i(objArr6, objArr6, r10, r10 + 1, objArr6.length);
                Object[] objArr7 = this.f14184m;
                objArr7[objArr7.length - 1] = objArr7[0];
                o.i(objArr7, objArr7, 0, 1, r11 + 1);
            }
            this.f14184m[r11] = null;
        }
        this.f14185p = size() - 1;
        return e10;
    }

    public final void f(E e10) {
        l(size() + 1);
        int k10 = k(this.f14183f);
        this.f14183f = k10;
        this.f14184m[k10] = e10;
        this.f14185p = size() + 1;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.f14184m[this.f14183f];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f14163f.b(i10, size());
        return (E) this.f14184m[r(this.f14183f + i10)];
    }

    public final void h(E e10) {
        l(size() + 1);
        this.f14184m[r(this.f14183f + size())] = e10;
        this.f14185p = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int r10 = r(this.f14183f + size());
        int i11 = this.f14183f;
        if (i11 < r10) {
            while (i11 < r10) {
                if (qc.q.d(obj, this.f14184m[i11])) {
                    i10 = this.f14183f;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= r10) {
            int length = this.f14184m.length;
            while (true) {
                if (i11 < length) {
                    if (qc.q.d(obj, this.f14184m[i11])) {
                        i10 = this.f14183f;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < r10; i12++) {
                        if (qc.q.d(obj, this.f14184m[i12])) {
                            i11 = i12 + this.f14184m.length;
                            i10 = this.f14183f;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final E last() {
        int k10;
        if (!isEmpty()) {
            Object[] objArr = this.f14184m;
            int i10 = this.f14183f;
            k10 = t.k(this);
            return (E) objArr[r(i10 + k10)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int P;
        int i10;
        int r10 = r(this.f14183f + size());
        int i11 = this.f14183f;
        if (i11 < r10) {
            P = r10 - 1;
            if (i11 <= P) {
                while (!qc.q.d(obj, this.f14184m[P])) {
                    if (P != i11) {
                        P--;
                    }
                }
                i10 = this.f14183f;
                return P - i10;
            }
            return -1;
        }
        if (i11 > r10) {
            int i12 = r10 - 1;
            while (true) {
                if (-1 >= i12) {
                    P = p.P(this.f14184m);
                    int i13 = this.f14183f;
                    if (i13 <= P) {
                        while (!qc.q.d(obj, this.f14184m[P])) {
                            if (P != i13) {
                                P--;
                            }
                        }
                        i10 = this.f14183f;
                    }
                } else if (qc.q.d(obj, this.f14184m[i12])) {
                    P = i12 + this.f14184m.length;
                    i10 = this.f14183f;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
    }

    public final E m() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f14184m[this.f14183f];
    }

    public final E o() {
        int k10;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.f14184m;
        int i10 = this.f14183f;
        k10 = t.k(this);
        return (E) objArr[r(i10 + k10)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        boolean z10;
        int r10;
        qc.q.i(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f14184m.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int r11 = r(this.f14183f + size());
                int i10 = this.f14183f;
                if (i10 < r11) {
                    r10 = i10;
                    while (i10 < r11) {
                        Object obj = this.f14184m[i10];
                        if ((!collection.contains(obj)) != false) {
                            this.f14184m[r10] = obj;
                            r10++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    o.r(this.f14184m, null, r10, r11);
                } else {
                    int length = this.f14184m.length;
                    int i11 = i10;
                    boolean z12 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f14184m;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if ((!collection.contains(obj2)) != false) {
                            this.f14184m[i11] = obj2;
                            i11++;
                        } else {
                            z12 = true;
                        }
                        i10++;
                    }
                    r10 = r(i11);
                    for (int i12 = 0; i12 < r11; i12++) {
                        Object[] objArr2 = this.f14184m;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if ((!collection.contains(obj3)) != false) {
                            this.f14184m[r10] = obj3;
                            r10 = n(r10);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    this.f14185p = p(r10 - this.f14183f);
                }
            }
        }
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        boolean z10;
        int r10;
        qc.q.i(collection, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if (this.f14184m.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int r11 = r(this.f14183f + size());
                int i10 = this.f14183f;
                if (i10 < r11) {
                    r10 = i10;
                    while (i10 < r11) {
                        Object obj = this.f14184m[i10];
                        if (collection.contains(obj)) {
                            this.f14184m[r10] = obj;
                            r10++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    o.r(this.f14184m, null, r10, r11);
                } else {
                    int length = this.f14184m.length;
                    int i11 = i10;
                    boolean z12 = false;
                    while (i10 < length) {
                        Object[] objArr = this.f14184m;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f14184m[i11] = obj2;
                            i11++;
                        } else {
                            z12 = true;
                        }
                        i10++;
                    }
                    r10 = r(i11);
                    for (int i12 = 0; i12 < r11; i12++) {
                        Object[] objArr2 = this.f14184m;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f14184m[r10] = obj3;
                            r10 = n(r10);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    this.f14185p = p(r10 - this.f14183f);
                }
            }
        }
        return z11;
    }

    public final E s() {
        if (!isEmpty()) {
            Object[] objArr = this.f14184m;
            int i10 = this.f14183f;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f14183f = n(i10);
            this.f14185p = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f14163f.b(i10, size());
        int r10 = r(this.f14183f + i10);
        Object[] objArr = this.f14184m;
        E e11 = (E) objArr[r10];
        objArr[r10] = e10;
        return e11;
    }

    public final E t() {
        if (isEmpty()) {
            return null;
        }
        return s();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) m.a(tArr, size());
        }
        int r10 = r(this.f14183f + size());
        int i10 = this.f14183f;
        if (i10 < r10) {
            o.m(this.f14184m, tArr, 0, i10, r10, 2, null);
        } else if ((!isEmpty()) != false) {
            Object[] objArr = this.f14184m;
            o.i(objArr, tArr, 0, this.f14183f, objArr.length);
            Object[] objArr2 = this.f14184m;
            o.i(objArr2, tArr, objArr2.length - this.f14183f, 0, r10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final E u() {
        int k10;
        if (!isEmpty()) {
            int i10 = this.f14183f;
            k10 = t.k(this);
            int r10 = r(i10 + k10);
            Object[] objArr = this.f14184m;
            E e10 = (E) objArr[r10];
            objArr[r10] = null;
            this.f14185p = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f14163f.c(i10, size());
        if (i10 == size()) {
            h(e10);
        } else if (i10 == 0) {
            f(e10);
        } else {
            l(size() + 1);
            int r10 = r(this.f14183f + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int k10 = k(r10);
                int k11 = k(this.f14183f);
                int i11 = this.f14183f;
                if (k10 >= i11) {
                    Object[] objArr = this.f14184m;
                    objArr[k11] = objArr[i11];
                    o.i(objArr, objArr, i11, i11 + 1, k10 + 1);
                } else {
                    Object[] objArr2 = this.f14184m;
                    o.i(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f14184m;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    o.i(objArr3, objArr3, 0, 1, k10 + 1);
                }
                this.f14184m[k10] = e10;
                this.f14183f = k11;
            } else {
                int r11 = r(this.f14183f + size());
                if (r10 < r11) {
                    Object[] objArr4 = this.f14184m;
                    o.i(objArr4, objArr4, r10 + 1, r10, r11);
                } else {
                    Object[] objArr5 = this.f14184m;
                    o.i(objArr5, objArr5, 1, 0, r11);
                    Object[] objArr6 = this.f14184m;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    o.i(objArr6, objArr6, r10 + 1, r10, objArr6.length - 1);
                }
                this.f14184m[r10] = e10;
            }
            this.f14185p = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        qc.q.i(collection, "elements");
        c.f14163f.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        l(size() + collection.size());
        int r10 = r(this.f14183f + size());
        int r11 = r(this.f14183f + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f14183f;
            int i12 = i11 - size;
            if (r11 < i11) {
                Object[] objArr = this.f14184m;
                o.i(objArr, objArr, i12, i11, objArr.length);
                if (size >= r11) {
                    Object[] objArr2 = this.f14184m;
                    o.i(objArr2, objArr2, objArr2.length - size, 0, r11);
                } else {
                    Object[] objArr3 = this.f14184m;
                    o.i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f14184m;
                    o.i(objArr4, objArr4, 0, size, r11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f14184m;
                o.i(objArr5, objArr5, i12, i11, r11);
            } else {
                Object[] objArr6 = this.f14184m;
                i12 += objArr6.length;
                int i13 = r11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    o.i(objArr6, objArr6, i12, i11, r11);
                } else {
                    o.i(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f14184m;
                    o.i(objArr7, objArr7, 0, this.f14183f + length, r11);
                }
            }
            this.f14183f = i12;
            i(p(r11 - size), collection);
        } else {
            int i14 = r11 + size;
            if (r11 < r10) {
                int i15 = size + r10;
                Object[] objArr8 = this.f14184m;
                if (i15 <= objArr8.length) {
                    o.i(objArr8, objArr8, i14, r11, r10);
                } else if (i14 >= objArr8.length) {
                    o.i(objArr8, objArr8, i14 - objArr8.length, r11, r10);
                } else {
                    int length2 = r10 - (i15 - objArr8.length);
                    o.i(objArr8, objArr8, 0, length2, r10);
                    Object[] objArr9 = this.f14184m;
                    o.i(objArr9, objArr9, i14, r11, length2);
                }
            } else {
                Object[] objArr10 = this.f14184m;
                o.i(objArr10, objArr10, size, 0, r10);
                Object[] objArr11 = this.f14184m;
                if (i14 >= objArr11.length) {
                    o.i(objArr11, objArr11, i14 - objArr11.length, r11, objArr11.length);
                } else {
                    o.i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f14184m;
                    o.i(objArr12, objArr12, i14, r11, objArr12.length - size);
                }
            }
            i(r11, collection);
        }
        return true;
    }

    public k() {
        this.f14184m = f14182r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
