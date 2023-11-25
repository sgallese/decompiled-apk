package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: q  reason: collision with root package name */
    private static Object[] f1787q;

    /* renamed from: r  reason: collision with root package name */
    private static int f1788r;

    /* renamed from: s  reason: collision with root package name */
    private static Object[] f1789s;

    /* renamed from: t  reason: collision with root package name */
    private static int f1790t;

    /* renamed from: u  reason: collision with root package name */
    private static final Object f1791u = new Object();

    /* renamed from: v  reason: collision with root package name */
    private static final Object f1792v = new Object();

    /* renamed from: f  reason: collision with root package name */
    private int[] f1793f;

    /* renamed from: m  reason: collision with root package name */
    Object[] f1794m;

    /* renamed from: p  reason: collision with root package name */
    int f1795p;

    /* compiled from: ArraySet.java */
    /* loaded from: classes.dex */
    private class a extends d<E> {
        a() {
            super(b.this.f1795p);
        }

        @Override // androidx.collection.d
        protected E a(int i10) {
            return (E) b.this.l(i10);
        }

        @Override // androidx.collection.d
        protected void c(int i10) {
            b.this.k(i10);
        }
    }

    public b() {
        this(0);
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (f1792v) {
                Object[] objArr = f1789s;
                if (objArr != null) {
                    try {
                        this.f1794m = objArr;
                        f1789s = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f1793f = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f1790t--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f1789s = null;
                    f1790t = 0;
                }
            }
        } else if (i10 == 4) {
            synchronized (f1791u) {
                Object[] objArr2 = f1787q;
                if (objArr2 != null) {
                    try {
                        this.f1794m = objArr2;
                        f1787q = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f1793f = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f1788r--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f1787q = null;
                    f1788r = 0;
                }
            }
        }
        this.f1793f = new int[i10];
        this.f1794m = new Object[i10];
    }

    private int e(int i10) {
        try {
            return c.a(this.f1793f, this.f1795p, i10);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void g(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (f1792v) {
                if (f1790t < 10) {
                    objArr[0] = f1789s;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1789s = objArr;
                    f1790t++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f1791u) {
                if (f1788r < 10) {
                    objArr[0] = f1787q;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1787q = objArr;
                    f1788r++;
                }
            }
        }
    }

    private int h(Object obj, int i10) {
        int i11 = this.f1795p;
        if (i11 == 0) {
            return -1;
        }
        int e10 = e(i10);
        if (e10 < 0) {
            return e10;
        }
        if (obj.equals(this.f1794m[e10])) {
            return e10;
        }
        int i12 = e10 + 1;
        while (i12 < i11 && this.f1793f[i12] == i10) {
            if (obj.equals(this.f1794m[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = e10 - 1; i13 >= 0 && this.f1793f[i13] == i10; i13--) {
            if (obj.equals(this.f1794m[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private int i() {
        int i10 = this.f1795p;
        if (i10 == 0) {
            return -1;
        }
        int e10 = e(0);
        if (e10 < 0) {
            return e10;
        }
        if (this.f1794m[e10] == null) {
            return e10;
        }
        int i11 = e10 + 1;
        while (i11 < i10 && this.f1793f[i11] == 0) {
            if (this.f1794m[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = e10 - 1; i12 >= 0 && this.f1793f[i12] == 0; i12--) {
            if (this.f1794m[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int h10;
        int i11 = this.f1795p;
        if (e10 == null) {
            h10 = i();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            h10 = h(e10, hashCode);
        }
        if (h10 >= 0) {
            return false;
        }
        int i12 = ~h10;
        int[] iArr = this.f1793f;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f1794m;
            a(i13);
            if (i11 == this.f1795p) {
                int[] iArr2 = this.f1793f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f1794m, 0, objArr.length);
                }
                g(iArr, objArr, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f1793f;
            int i14 = i12 + 1;
            int i15 = i11 - i12;
            System.arraycopy(iArr3, i12, iArr3, i14, i15);
            Object[] objArr2 = this.f1794m;
            System.arraycopy(objArr2, i12, objArr2, i14, i15);
        }
        int i16 = this.f1795p;
        if (i11 == i16) {
            int[] iArr4 = this.f1793f;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f1794m[i12] = e10;
                this.f1795p = i16 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        f(this.f1795p + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f1795p;
        if (i10 != 0) {
            int[] iArr = this.f1793f;
            Object[] objArr = this.f1794m;
            this.f1793f = c.f1797a;
            this.f1794m = c.f1799c;
            this.f1795p = 0;
            g(iArr, objArr, i10);
        }
        if (this.f1795p == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1795p; i10++) {
                try {
                    if (!set.contains(l(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i10) {
        int i11 = this.f1795p;
        int[] iArr = this.f1793f;
        if (iArr.length < i10) {
            Object[] objArr = this.f1794m;
            a(i10);
            int i12 = this.f1795p;
            if (i12 > 0) {
                System.arraycopy(iArr, 0, this.f1793f, 0, i12);
                System.arraycopy(objArr, 0, this.f1794m, 0, this.f1795p);
            }
            g(iArr, objArr, this.f1795p);
        }
        if (this.f1795p == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1793f;
        int i10 = this.f1795p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return i();
        }
        return h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.f1795p <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    public boolean j(b<? extends E> bVar) {
        int i10 = bVar.f1795p;
        int i11 = this.f1795p;
        for (int i12 = 0; i12 < i10; i12++) {
            remove(bVar.l(i12));
        }
        if (i11 == this.f1795p) {
            return false;
        }
        return true;
    }

    public E k(int i10) {
        int i11 = this.f1795p;
        Object[] objArr = this.f1794m;
        E e10 = (E) objArr[i10];
        if (i11 <= 1) {
            clear();
        } else {
            int i12 = i11 - 1;
            int[] iArr = this.f1793f;
            int i13 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i13 = i11 + (i11 >> 1);
                }
                a(i13);
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f1793f, 0, i10);
                    System.arraycopy(objArr, 0, this.f1794m, 0, i10);
                }
                if (i10 < i12) {
                    int i14 = i10 + 1;
                    int i15 = i12 - i10;
                    System.arraycopy(iArr, i14, this.f1793f, i10, i15);
                    System.arraycopy(objArr, i14, this.f1794m, i10, i15);
                }
            } else {
                if (i10 < i12) {
                    int i16 = i10 + 1;
                    int i17 = i12 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr2 = this.f1794m;
                    System.arraycopy(objArr2, i16, objArr2, i10, i17);
                }
                this.f1794m[i12] = null;
            }
            if (i11 == this.f1795p) {
                this.f1795p = i12;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e10;
    }

    public E l(int i10) {
        return (E) this.f1794m[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            k(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f1795p - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f1794m[i10])) {
                k(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1795p;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f1795p;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f1794m, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1795p * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1795p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f1793f = c.f1797a;
            this.f1794m = c.f1799c;
        } else {
            a(i10);
        }
        this.f1795p = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1795p) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1795p));
        }
        System.arraycopy(this.f1794m, 0, tArr, 0, this.f1795p);
        int length = tArr.length;
        int i10 = this.f1795p;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
