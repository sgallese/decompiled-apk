package fc;

import ec.h0;
import ec.o;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import qc.h;
import qc.q;
import rc.e;
import vc.l;

/* compiled from: MapBuilder.kt */
/* loaded from: classes4.dex */
public final class d<K, V> implements Map<K, V>, Serializable, rc.e {
    private static final d A;

    /* renamed from: z  reason: collision with root package name */
    public static final a f15597z = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private K[] f15598f;

    /* renamed from: m  reason: collision with root package name */
    private V[] f15599m;

    /* renamed from: p  reason: collision with root package name */
    private int[] f15600p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f15601q;

    /* renamed from: r  reason: collision with root package name */
    private int f15602r;

    /* renamed from: s  reason: collision with root package name */
    private int f15603s;

    /* renamed from: t  reason: collision with root package name */
    private int f15604t;

    /* renamed from: u  reason: collision with root package name */
    private int f15605u;

    /* renamed from: v  reason: collision with root package name */
    private fc.f<K> f15606v;

    /* renamed from: w  reason: collision with root package name */
    private g<V> f15607w;

    /* renamed from: x  reason: collision with root package name */
    private fc.e<K, V> f15608x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f15609y;

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            int d10;
            d10 = l.d(i10, 1);
            return Integer.highestOneBit(d10 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class b<K, V> extends C0375d<K, V> implements Iterator<Map.Entry<K, V>>, rc.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> dVar) {
            super(dVar);
            q.i(dVar, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i  reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (a() < ((d) d()).f15603s) {
                int a10 = a();
                f(a10 + 1);
                h(a10);
                c<K, V> cVar = new c<>(d(), c());
                e();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(StringBuilder sb2) {
            q.i(sb2, "sb");
            if (a() < ((d) d()).f15603s) {
                int a10 = a();
                f(a10 + 1);
                h(a10);
                Object obj = ((d) d()).f15598f[c()];
                if (q.d(obj, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj);
                }
                sb2.append('=');
                Object[] objArr = ((d) d()).f15599m;
                q.f(objArr);
                Object obj2 = objArr[c()];
                if (q.d(obj2, d())) {
                    sb2.append("(this Map)");
                } else {
                    sb2.append(obj2);
                }
                e();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int k() {
            int i10;
            if (a() < ((d) d()).f15603s) {
                int a10 = a();
                f(a10 + 1);
                h(a10);
                Object obj = ((d) d()).f15598f[c()];
                int i11 = 0;
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                Object[] objArr = ((d) d()).f15599m;
                q.f(objArr);
                Object obj2 = objArr[c()];
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                int i12 = i10 ^ i11;
                e();
                return i12;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, e.a {

        /* renamed from: f  reason: collision with root package name */
        private final d<K, V> f15610f;

        /* renamed from: m  reason: collision with root package name */
        private final int f15611m;

        public c(d<K, V> dVar, int i10) {
            q.i(dVar, "map");
            this.f15610f = dVar;
            this.f15611m = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (q.d(entry.getKey(), getKey()) && q.d(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f15610f).f15598f[this.f15611m];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f15610f).f15599m;
            q.f(objArr);
            return (V) objArr[this.f15611m];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i10;
            K key = getKey();
            int i11 = 0;
            if (key != null) {
                i10 = key.hashCode();
            } else {
                i10 = 0;
            }
            V value = getValue();
            if (value != null) {
                i11 = value.hashCode();
            }
            return i10 ^ i11;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f15610f.k();
            Object[] i10 = this.f15610f.i();
            int i11 = this.f15611m;
            V v11 = (V) i10[i11];
            i10[i11] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* renamed from: fc.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0375d<K, V> {

        /* renamed from: f  reason: collision with root package name */
        private final d<K, V> f15612f;

        /* renamed from: m  reason: collision with root package name */
        private int f15613m;

        /* renamed from: p  reason: collision with root package name */
        private int f15614p;

        public C0375d(d<K, V> dVar) {
            q.i(dVar, "map");
            this.f15612f = dVar;
            this.f15614p = -1;
            e();
        }

        public final int a() {
            return this.f15613m;
        }

        public final int c() {
            return this.f15614p;
        }

        public final d<K, V> d() {
            return this.f15612f;
        }

        public final void e() {
            while (this.f15613m < ((d) this.f15612f).f15603s) {
                int[] iArr = ((d) this.f15612f).f15600p;
                int i10 = this.f15613m;
                if (iArr[i10] < 0) {
                    this.f15613m = i10 + 1;
                } else {
                    return;
                }
            }
        }

        public final void f(int i10) {
            this.f15613m = i10;
        }

        public final void h(int i10) {
            this.f15614p = i10;
        }

        public final boolean hasNext() {
            if (this.f15613m < ((d) this.f15612f).f15603s) {
                return true;
            }
            return false;
        }

        public final void remove() {
            boolean z10;
            if (this.f15614p != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f15612f.k();
                this.f15612f.K(this.f15614p);
                this.f15614p = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class e<K, V> extends C0375d<K, V> implements Iterator<K>, rc.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> dVar) {
            super(dVar);
            q.i(dVar, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() < ((d) d()).f15603s) {
                int a10 = a();
                f(a10 + 1);
                h(a10);
                K k10 = (K) ((d) d()).f15598f[c()];
                e();
                return k10;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    /* loaded from: classes4.dex */
    public static final class f<K, V> extends C0375d<K, V> implements Iterator<V>, rc.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> dVar) {
            super(dVar);
            q.i(dVar, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() < ((d) d()).f15603s) {
                int a10 = a();
                f(a10 + 1);
                h(a10);
                Object[] objArr = ((d) d()).f15599m;
                q.f(objArr);
                V v10 = (V) objArr[c()];
                e();
                return v10;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        d dVar = new d(0);
        dVar.f15609y = true;
        A = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f15598f = kArr;
        this.f15599m = vArr;
        this.f15600p = iArr;
        this.f15601q = iArr2;
        this.f15602r = i10;
        this.f15603s = i11;
        this.f15604t = f15597z.d(w());
    }

    private final int B(K k10) {
        int i10;
        if (k10 != null) {
            i10 = k10.hashCode();
        } else {
            i10 = 0;
        }
        return (i10 * (-1640531527)) >>> this.f15604t;
    }

    private final boolean D(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        q(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (E(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean E(Map.Entry<? extends K, ? extends V> entry) {
        int h10 = h(entry.getKey());
        V[] i10 = i();
        if (h10 >= 0) {
            i10[h10] = entry.getValue();
            return true;
        }
        int i11 = (-h10) - 1;
        if (!q.d(entry.getValue(), i10[i11])) {
            i10[i11] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean F(int i10) {
        int B = B(this.f15598f[i10]);
        int i11 = this.f15602r;
        while (true) {
            int[] iArr = this.f15601q;
            if (iArr[B] == 0) {
                iArr[B] = i10 + 1;
                this.f15600p[i10] = B;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            int i12 = B - 1;
            if (B == 0) {
                B = w() - 1;
            } else {
                B = i12;
            }
        }
    }

    private final void G(int i10) {
        if (this.f15603s > size()) {
            l();
        }
        int i11 = 0;
        if (i10 == w()) {
            o.q(this.f15601q, 0, 0, w());
        } else {
            this.f15601q = new int[i10];
            this.f15604t = f15597z.d(i10);
        }
        while (i11 < this.f15603s) {
            int i12 = i11 + 1;
            if (F(i11)) {
                i11 = i12;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final void I(int i10) {
        int h10;
        h10 = l.h(this.f15602r * 2, w() / 2);
        int i11 = h10;
        int i12 = 0;
        int i13 = i10;
        do {
            int i14 = i10 - 1;
            if (i10 == 0) {
                i10 = w() - 1;
            } else {
                i10 = i14;
            }
            i12++;
            if (i12 > this.f15602r) {
                this.f15601q[i13] = 0;
                return;
            }
            int[] iArr = this.f15601q;
            int i15 = iArr[i10];
            if (i15 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i15 < 0) {
                iArr[i13] = -1;
            } else {
                int i16 = i15 - 1;
                if (((B(this.f15598f[i16]) - i10) & (w() - 1)) >= i12) {
                    this.f15601q[i13] = i15;
                    this.f15600p[i16] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f15601q[i13] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i10) {
        fc.c.f(this.f15598f, i10);
        I(this.f15600p[i10]);
        this.f15600p[i10] = -1;
        this.f15605u = size() - 1;
    }

    private final boolean N(int i10) {
        int u10 = u();
        int i11 = this.f15603s;
        int i12 = u10 - i11;
        int size = i11 - size();
        if (i12 < i10 && i12 + size >= i10 && size >= u() / 4) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] i() {
        V[] vArr = this.f15599m;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) fc.c.d(u());
        this.f15599m = vArr2;
        return vArr2;
    }

    private final void l() {
        int i10;
        V[] vArr = this.f15599m;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f15603s;
            if (i11 >= i10) {
                break;
            }
            if (this.f15600p[i11] >= 0) {
                K[] kArr = this.f15598f;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        fc.c.g(this.f15598f, i12, i10);
        if (vArr != null) {
            fc.c.g(vArr, i12, this.f15603s);
        }
        this.f15603s = i12;
    }

    private final boolean o(Map<?, ?> map) {
        if (size() == map.size() && m(map.entrySet())) {
            return true;
        }
        return false;
    }

    private final void p(int i10) {
        V[] vArr;
        if (i10 >= 0) {
            if (i10 > u()) {
                int u10 = (u() * 3) / 2;
                if (i10 <= u10) {
                    i10 = u10;
                }
                this.f15598f = (K[]) fc.c.e(this.f15598f, i10);
                V[] vArr2 = this.f15599m;
                if (vArr2 != null) {
                    vArr = (V[]) fc.c.e(vArr2, i10);
                } else {
                    vArr = null;
                }
                this.f15599m = vArr;
                int[] copyOf = Arrays.copyOf(this.f15600p, i10);
                q.h(copyOf, "copyOf(this, newSize)");
                this.f15600p = copyOf;
                int c10 = f15597z.c(i10);
                if (c10 > w()) {
                    G(c10);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void q(int i10) {
        if (N(i10)) {
            G(w());
        } else {
            p(this.f15603s + i10);
        }
    }

    private final int s(K k10) {
        int B = B(k10);
        int i10 = this.f15602r;
        while (true) {
            int i11 = this.f15601q[B];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (q.d(this.f15598f[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            int i13 = B - 1;
            if (B == 0) {
                B = w() - 1;
            } else {
                B = i13;
            }
        }
    }

    private final int t(V v10) {
        int i10 = this.f15603s;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f15600p[i10] >= 0) {
                V[] vArr = this.f15599m;
                q.f(vArr);
                if (q.d(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final int w() {
        return this.f15601q.length;
    }

    public Collection<V> A() {
        g<V> gVar = this.f15607w;
        if (gVar == null) {
            g<V> gVar2 = new g<>(this);
            this.f15607w = gVar2;
            return gVar2;
        }
        return gVar;
    }

    public final e<K, V> C() {
        return new e<>(this);
    }

    public final boolean H(Map.Entry<? extends K, ? extends V> entry) {
        q.i(entry, "entry");
        k();
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f15599m;
        q.f(vArr);
        if (!q.d(vArr[s10], entry.getValue())) {
            return false;
        }
        K(s10);
        return true;
    }

    public final int J(K k10) {
        k();
        int s10 = s(k10);
        if (s10 < 0) {
            return -1;
        }
        K(s10);
        return s10;
    }

    public final boolean M(V v10) {
        k();
        int t10 = t(v10);
        if (t10 < 0) {
            return false;
        }
        K(t10);
        return true;
    }

    public final f<K, V> O() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        k();
        h0 it = new vc.f(0, this.f15603s - 1).iterator();
        while (it.hasNext()) {
            int a10 = it.a();
            int[] iArr = this.f15600p;
            int i10 = iArr[a10];
            if (i10 >= 0) {
                this.f15601q[i10] = 0;
                iArr[a10] = -1;
            }
        }
        fc.c.g(this.f15598f, 0, this.f15603s);
        V[] vArr = this.f15599m;
        if (vArr != null) {
            fc.c.g(vArr, 0, this.f15603s);
        }
        this.f15605u = 0;
        this.f15603s = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (s(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (t(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return v();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !o((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int s10 = s(obj);
        if (s10 < 0) {
            return null;
        }
        V[] vArr = this.f15599m;
        q.f(vArr);
        return vArr[s10];
    }

    public final int h(K k10) {
        int h10;
        k();
        while (true) {
            int B = B(k10);
            h10 = l.h(this.f15602r * 2, w() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f15601q[B];
                if (i11 <= 0) {
                    if (this.f15603s >= u()) {
                        q(1);
                    } else {
                        int i12 = this.f15603s;
                        int i13 = i12 + 1;
                        this.f15603s = i13;
                        this.f15598f[i12] = k10;
                        this.f15600p[i12] = B;
                        this.f15601q[B] = i13;
                        this.f15605u = size() + 1;
                        if (i10 > this.f15602r) {
                            this.f15602r = i10;
                        }
                        return i12;
                    }
                } else if (q.d(this.f15598f[i11 - 1], k10)) {
                    return -i11;
                } else {
                    i10++;
                    if (i10 > h10) {
                        G(w() * 2);
                        break;
                    }
                    int i14 = B - 1;
                    if (B == 0) {
                        B = w() - 1;
                    } else {
                        B = i14;
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            i10 += r10.k();
        }
        return i10;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Map<K, V> j() {
        k();
        this.f15609y = true;
        if (size() > 0) {
            return this;
        }
        d dVar = A;
        q.g(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void k() {
        if (!this.f15609y) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return x();
    }

    public final boolean m(Collection<?> collection) {
        q.i(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!n((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean n(Map.Entry<? extends K, ? extends V> entry) {
        q.i(entry, "entry");
        int s10 = s(entry.getKey());
        if (s10 < 0) {
            return false;
        }
        V[] vArr = this.f15599m;
        q.f(vArr);
        return q.d(vArr[s10], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        k();
        int h10 = h(k10);
        V[] i10 = i();
        if (h10 < 0) {
            int i11 = (-h10) - 1;
            V v11 = i10[i11];
            i10[i11] = v10;
            return v11;
        }
        i10[h10] = v10;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        q.i(map, "from");
        k();
        D(map.entrySet());
    }

    public final b<K, V> r() {
        return new b<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int J = J(obj);
        if (J < 0) {
            return null;
        }
        V[] vArr = this.f15599m;
        q.f(vArr);
        V v10 = vArr[J];
        fc.c.f(vArr, J);
        return v10;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return y();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> r10 = r();
        int i10 = 0;
        while (r10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            r10.j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        q.h(sb3, "sb.toString()");
        return sb3;
    }

    public final int u() {
        return this.f15598f.length;
    }

    public Set<Map.Entry<K, V>> v() {
        fc.e<K, V> eVar = this.f15608x;
        if (eVar == null) {
            fc.e<K, V> eVar2 = new fc.e<>(this);
            this.f15608x = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return A();
    }

    public Set<K> x() {
        fc.f<K> fVar = this.f15606v;
        if (fVar == null) {
            fc.f<K> fVar2 = new fc.f<>(this);
            this.f15606v = fVar2;
            return fVar2;
        }
        return fVar;
    }

    public int y() {
        return this.f15605u;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(fc.c.d(i10), null, new int[i10], new int[f15597z.c(i10)], 2, 0);
    }
}
