package k0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.b0;
import ec.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: IdentityArraySet.kt */
/* loaded from: classes.dex */
public final class c<T> implements Set<T>, rc.a {

    /* renamed from: f  reason: collision with root package name */
    private int f19126f;

    /* renamed from: m  reason: collision with root package name */
    private Object[] f19127m = new Object[16];

    /* compiled from: IdentityArraySet.kt */
    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f19128f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c<T> f19129m;

        a(c<T> cVar) {
            this.f19129m = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19128f < this.f19129m.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] j10 = this.f19129m.j();
            int i10 = this.f19128f;
            this.f19128f = i10 + 1;
            T t10 = (T) j10[i10];
            q.g(t10, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: IdentityArraySet.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements l<T, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f19130f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(T t10) {
            q.i(t10, "it");
            return t10.toString();
        }
    }

    private final int f(Object obj) {
        int size = size() - 1;
        int a10 = j0.c.a(obj);
        Object[] objArr = this.f19127m;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            Object obj2 = objArr[i11];
            int a11 = j0.c.a(obj2);
            if (a11 < a10) {
                i10 = i11 + 1;
            } else if (a11 > a10) {
                size = i11 - 1;
            } else if (obj2 == obj) {
                return i11;
            } else {
                return h(i11, obj, a10);
            }
        }
        return -(i10 + 1);
    }

    private final int h(int i10, Object obj, int i11) {
        Object obj2;
        Object[] objArr = this.f19127m;
        int size = size();
        for (int i12 = i10 - 1; -1 < i12; i12--) {
            Object obj3 = objArr[i12];
            if (obj3 == obj) {
                return i12;
            }
            if (j0.c.a(obj3) != i11) {
                break;
            }
        }
        do {
            i10++;
            if (i10 < size) {
                obj2 = objArr[i10];
                if (obj2 == obj) {
                    return i10;
                }
            } else {
                return -(size + 1);
            }
        } while (j0.c.a(obj2) == i11);
        return -(i10 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t10) {
        int i10;
        q.i(t10, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        int size = size();
        Object[] objArr = this.f19127m;
        if (size > 0) {
            i10 = f(t10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i11 = -(i10 + 1);
        if (size != objArr.length) {
            o.i(objArr, objArr, i11 + 1, i11, size);
        } else {
            Object[] objArr2 = new Object[objArr.length * 2];
            o.i(objArr, objArr2, i11 + 1, i11, size);
            o.m(objArr, objArr2, 0, 0, i11, 6, null);
            this.f19127m = objArr2;
        }
        this.f19127m[i11] = t10;
        this.f19126f = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        o.t(this.f19127m, null, 0, 0, 6, null);
        this.f19126f = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null || f(obj) < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        q.i(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void e(Collection<? extends T> collection) {
        boolean z10;
        boolean z11;
        Object[] objArr;
        int i10;
        Object obj;
        boolean z12;
        int i11;
        q.i(collection, "collection");
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof c)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.f19127m;
        c cVar = (c) collection;
        Object[] objArr3 = cVar.f19127m;
        int size = size();
        int size2 = cVar.size();
        int i12 = size + size2;
        if (this.f19127m.length < i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (size != 0 && j0.c.a(objArr2[size - 1]) >= j0.c.a(objArr3[0])) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && z11) {
            o.i(objArr3, objArr2, size, 0, size2);
            this.f19126f = size() + size2;
            return;
        }
        if (z10) {
            if (size > size2) {
                i11 = size * 2;
            } else {
                i11 = size2 * 2;
            }
            objArr = new Object[i11];
        } else {
            objArr = objArr2;
        }
        int i13 = size - 1;
        int i14 = size2 - 1;
        int i15 = i12 - 1;
        while (true) {
            if (i13 < 0 && i14 < 0) {
                break;
            }
            if (i13 < 0) {
                i10 = i14 - 1;
                obj = objArr3[i14];
            } else if (i14 < 0) {
                i10 = i14;
                obj = objArr2[i13];
                i13--;
            } else {
                Object obj2 = objArr2[i13];
                Object obj3 = objArr3[i14];
                int a10 = j0.c.a(obj2);
                int a11 = j0.c.a(obj3);
                if (a10 > a11) {
                    i13--;
                } else {
                    if (a10 >= a11) {
                        if (obj2 == obj3) {
                            i13--;
                            i14--;
                        } else {
                            int i16 = i13 - 1;
                            while (i16 >= 0) {
                                int i17 = i16 - 1;
                                Object obj4 = objArr2[i16];
                                if (j0.c.a(obj4) != a11) {
                                    break;
                                } else if (obj3 == obj4) {
                                    z12 = true;
                                    break;
                                } else {
                                    i16 = i17;
                                }
                            }
                            z12 = false;
                            if (z12) {
                                i14--;
                            }
                        }
                    }
                    i10 = i14 - 1;
                    obj = obj3;
                }
                i10 = i14;
                obj = obj2;
            }
            objArr[i15] = obj;
            i14 = i10;
            i15--;
        }
        if (i15 >= 0) {
            o.i(objArr, objArr, 0, i15 + 1, i12);
        }
        int i18 = i12 - (i15 + 1);
        o.r(objArr, null, i18, i12);
        this.f19127m = objArr;
        this.f19126f = i18;
    }

    public int i() {
        return this.f19126f;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final Object[] j() {
        return this.f19127m;
    }

    public final boolean k() {
        if (size() > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t10) {
        if (t10 == null) {
            return false;
        }
        int f10 = f(t10);
        Object[] objArr = this.f19127m;
        int size = size();
        if (f10 < 0) {
            return false;
        }
        int i10 = size - 1;
        if (f10 < i10) {
            o.i(objArr, objArr, f10, f10 + 1, size);
        }
        objArr[i10] = null;
        this.f19126f = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return i();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return qc.g.a(this);
    }

    public String toString() {
        String k02;
        k02 = b0.k0(this, null, "[", "]", 0, null, b.f19130f, 25, null);
        return k02;
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        q.i(tArr, "array");
        return (T[]) qc.g.b(this, tArr);
    }
}
