package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: q  reason: collision with root package name */
    static Object[] f1808q;

    /* renamed from: r  reason: collision with root package name */
    static int f1809r;

    /* renamed from: s  reason: collision with root package name */
    static Object[] f1810s;

    /* renamed from: t  reason: collision with root package name */
    static int f1811t;

    /* renamed from: f  reason: collision with root package name */
    int[] f1812f;

    /* renamed from: m  reason: collision with root package name */
    Object[] f1813m;

    /* renamed from: p  reason: collision with root package name */
    int f1814p;

    public g() {
        this.f1812f = c.f1797a;
        this.f1813m = c.f1799c;
        this.f1814p = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f1810s;
                if (objArr != null) {
                    this.f1813m = objArr;
                    f1810s = (Object[]) objArr[0];
                    this.f1812f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1811t--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f1808q;
                if (objArr2 != null) {
                    this.f1813m = objArr2;
                    f1808q = (Object[]) objArr2[0];
                    this.f1812f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1809r--;
                    return;
                }
            }
        }
        this.f1812f = new int[i10];
        this.f1813m = new Object[i10 << 1];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f1811t < 10) {
                    objArr[0] = f1810s;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f1810s = objArr;
                    f1811t++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f1809r < 10) {
                    objArr[0] = f1808q;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f1808q = objArr;
                    f1809r++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f1814p;
        int[] iArr = this.f1812f;
        if (iArr.length < i10) {
            Object[] objArr = this.f1813m;
            a(i10);
            if (this.f1814p > 0) {
                System.arraycopy(iArr, 0, this.f1812f, 0, i11);
                System.arraycopy(objArr, 0, this.f1813m, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f1814p == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i10 = this.f1814p;
        if (i10 > 0) {
            int[] iArr = this.f1812f;
            Object[] objArr = this.f1813m;
            this.f1812f = c.f1797a;
            this.f1813m = c.f1799c;
            this.f1814p = 0;
            d(iArr, objArr, i10);
        }
        if (this.f1814p <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (i(obj) >= 0) {
            return true;
        }
        return false;
    }

    int e(Object obj, int i10) {
        int i11 = this.f1814p;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f1812f, i11, i10);
        if (b10 < 0) {
            return b10;
        }
        if (obj.equals(this.f1813m[b10 << 1])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f1812f[i12] == i10) {
            if (obj.equals(this.f1813m[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = b10 - 1; i13 >= 0 && this.f1812f[i13] == i10; i13--) {
            if (obj.equals(this.f1813m[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f1814p; i10++) {
                K j10 = j(i10);
                V n10 = n(i10);
                Object obj2 = gVar.get(j10);
                if (n10 == null) {
                    if (obj2 != null || !gVar.containsKey(j10)) {
                        return false;
                    }
                } else if (!n10.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f1814p; i11++) {
                K j11 = j(i11);
                V n11 = n(i11);
                Object obj3 = map.get(j11);
                if (n11 == null) {
                    if (obj3 != null || !map.containsKey(j11)) {
                        return false;
                    }
                } else if (!n11.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        if (obj == null) {
            return h();
        }
        return e(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return (V) this.f1813m[(f10 << 1) + 1];
        }
        return v10;
    }

    int h() {
        int i10 = this.f1814p;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f1812f, i10, 0);
        if (b10 < 0) {
            return b10;
        }
        if (this.f1813m[b10 << 1] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f1812f[i11] == 0) {
            if (this.f1813m[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = b10 - 1; i12 >= 0 && this.f1812f[i12] == 0; i12--) {
            if (this.f1813m[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f1812f;
        Object[] objArr = this.f1813m;
        int i10 = this.f1814p;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i13 += hashCode ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(Object obj) {
        int i10 = this.f1814p * 2;
        Object[] objArr = this.f1813m;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        if (this.f1814p <= 0) {
            return true;
        }
        return false;
    }

    public K j(int i10) {
        return (K) this.f1813m[i10 << 1];
    }

    public void k(g<? extends K, ? extends V> gVar) {
        int i10 = gVar.f1814p;
        c(this.f1814p + i10);
        if (this.f1814p == 0) {
            if (i10 > 0) {
                System.arraycopy(gVar.f1812f, 0, this.f1812f, 0, i10);
                System.arraycopy(gVar.f1813m, 0, this.f1813m, 0, i10 << 1);
                this.f1814p = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(gVar.j(i11), gVar.n(i11));
        }
    }

    public V l(int i10) {
        Object[] objArr = this.f1813m;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f1814p;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f1812f;
            int i14 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i14 = i12 + (i12 >> 1);
                }
                a(i14);
                if (i12 == this.f1814p) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f1812f, 0, i10);
                        System.arraycopy(objArr, 0, this.f1813m, 0, i11);
                    }
                    if (i10 < i13) {
                        int i15 = i10 + 1;
                        int i16 = i13 - i10;
                        System.arraycopy(iArr, i15, this.f1812f, i10, i16);
                        System.arraycopy(objArr, i15 << 1, this.f1813m, i11, i16 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i13) {
                    int i17 = i10 + 1;
                    int i18 = i13 - i10;
                    System.arraycopy(iArr, i17, iArr, i10, i18);
                    Object[] objArr2 = this.f1813m;
                    System.arraycopy(objArr2, i17 << 1, objArr2, i11, i18 << 1);
                }
                Object[] objArr3 = this.f1813m;
                int i19 = i13 << 1;
                objArr3[i19] = null;
                objArr3[i19 + 1] = null;
            }
            if (i12 == this.f1814p) {
                this.f1814p = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v10;
    }

    public V m(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f1813m;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public V n(int i10) {
        return (V) this.f1813m[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int e10;
        int i11 = this.f1814p;
        if (k10 == null) {
            e10 = h();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            e10 = e(k10, hashCode);
        }
        if (e10 >= 0) {
            int i12 = (e10 << 1) + 1;
            Object[] objArr = this.f1813m;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~e10;
        int[] iArr = this.f1812f;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f1813m;
            a(i14);
            if (i11 == this.f1814p) {
                int[] iArr2 = this.f1812f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f1813m, 0, objArr2.length);
                }
                d(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f1812f;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f1813m;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f1814p - i13) << 1);
        }
        int i16 = this.f1814p;
        if (i11 == i16) {
            int[] iArr4 = this.f1812f;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f1813m;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f1814p = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        if (v11 == null) {
            return put(k10, v10);
        }
        return v11;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return l(f10);
        }
        return null;
    }

    public V replace(K k10, V v10) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return m(f10, v10);
        }
        return null;
    }

    public int size() {
        return this.f1814p;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1814p * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1814p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K j10 = j(i10);
            if (j10 != this) {
                sb2.append(j10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V n10 = n(i10);
            if (n10 != this) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 >= 0) {
            V n10 = n(f10);
            if (obj2 == n10 || (obj2 != null && obj2.equals(n10))) {
                l(f10);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k10, V v10, V v11) {
        int f10 = f(k10);
        if (f10 >= 0) {
            V n10 = n(f10);
            if (n10 == v10 || (v10 != null && v10.equals(n10))) {
                m(f10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f1812f = c.f1797a;
            this.f1813m = c.f1799c;
        } else {
            a(i10);
        }
        this.f1814p = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            k(gVar);
        }
    }
}
