package ec;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: SlidingWindow.kt */
/* loaded from: classes4.dex */
final class r0<T> extends c<T> implements RandomAccess {

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f14191m;

    /* renamed from: p  reason: collision with root package name */
    private final int f14192p;

    /* renamed from: q  reason: collision with root package name */
    private int f14193q;

    /* renamed from: r  reason: collision with root package name */
    private int f14194r;

    /* compiled from: SlidingWindow.kt */
    /* loaded from: classes4.dex */
    public static final class a extends b<T> {

        /* renamed from: p  reason: collision with root package name */
        private int f14195p;

        /* renamed from: q  reason: collision with root package name */
        private int f14196q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ r0<T> f14197r;

        a(r0<T> r0Var) {
            this.f14197r = r0Var;
            this.f14195p = r0Var.size();
            this.f14196q = ((r0) r0Var).f14193q;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ec.b
        protected void a() {
            if (this.f14195p == 0) {
                c();
                return;
            }
            d(((r0) this.f14197r).f14191m[this.f14196q]);
            this.f14196q = (this.f14196q + 1) % ((r0) this.f14197r).f14192p;
            this.f14195p--;
        }
    }

    public r0(Object[] objArr, int i10) {
        qc.q.i(objArr, "buffer");
        this.f14191m = objArr;
        if (i10 >= 0) {
            if (i10 <= objArr.length) {
                this.f14192p = objArr.length;
                this.f14194r = i10;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
    }

    @Override // ec.a
    public int a() {
        return this.f14194r;
    }

    @Override // ec.c, java.util.List
    public T get(int i10) {
        c.f14163f.b(i10, size());
        return (T) this.f14191m[(this.f14193q + i10) % this.f14192p];
    }

    public final void i(T t10) {
        if (!k()) {
            this.f14191m[(this.f14193q + size()) % this.f14192p] = t10;
            this.f14194r = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // ec.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r0<T> j(int i10) {
        int h10;
        Object[] array;
        int i11 = this.f14192p;
        h10 = vc.l.h(i11 + (i11 >> 1) + 1, i10);
        if (this.f14193q == 0) {
            array = Arrays.copyOf(this.f14191m, h10);
            qc.q.h(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[h10]);
        }
        return new r0<>(array, size());
    }

    public final boolean k() {
        if (size() == this.f14192p) {
            return true;
        }
        return false;
    }

    public final void l(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 > size()) {
                z11 = false;
            }
            if (z11) {
                if (i10 > 0) {
                    int i11 = this.f14193q;
                    int i12 = (i11 + i10) % this.f14192p;
                    if (i11 > i12) {
                        o.r(this.f14191m, null, i11, this.f14192p);
                        o.r(this.f14191m, null, 0, i12);
                    } else {
                        o.r(this.f14191m, null, i11, i12);
                    }
                    this.f14193q = i12;
                    this.f14194r = size() - i10;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.a, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qc.q.i(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) Arrays.copyOf(tArr, size());
            qc.q.h(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f14193q; i11 < size && i12 < this.f14192p; i12++) {
            tArr[i11] = this.f14191m[i12];
            i11++;
        }
        while (i11 < size) {
            tArr[i11] = this.f14191m[i10];
            i11++;
            i10++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public r0(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ec.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
