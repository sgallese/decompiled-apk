package fd;

import fd.n0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: ThreadSafeHeap.kt */
/* loaded from: classes4.dex */
public class m0<T extends n0 & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f15651b = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    private T[] f15652a;

    private final T[] f() {
        T[] tArr = this.f15652a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new n0[4];
            this.f15652a = tArr2;
            return tArr2;
        } else if (c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, c() * 2);
            qc.q.h(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((n0[]) copyOf);
            this.f15652a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void j(int i10) {
        f15651b.set(this, i10);
    }

    private final void k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= c()) {
                return;
            }
            T[] tArr = this.f15652a;
            qc.q.f(tArr);
            int i12 = i11 + 1;
            if (i12 < c()) {
                T t10 = tArr[i12];
                qc.q.f(t10);
                T t11 = tArr[i11];
                qc.q.f(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            qc.q.f(t12);
            T t13 = tArr[i11];
            qc.q.f(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f15652a;
            qc.q.f(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            qc.q.f(t10);
            T t11 = tArr[i10];
            qc.q.f(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m(i10, i11);
            i10 = i11;
        }
    }

    private final void m(int i10, int i11) {
        T[] tArr = this.f15652a;
        qc.q.f(tArr);
        T t10 = tArr[i11];
        qc.q.f(t10);
        T t11 = tArr[i10];
        qc.q.f(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }

    public final void a(T t10) {
        t10.f(this);
        T[] f10 = f();
        int c10 = c();
        j(c10 + 1);
        f10[c10] = t10;
        t10.setIndex(c10);
        l(c10);
    }

    public final T b() {
        T[] tArr = this.f15652a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int c() {
        return f15651b.get(this);
    }

    public final boolean d() {
        if (c() == 0) {
            return true;
        }
        return false;
    }

    public final T e() {
        T b10;
        synchronized (this) {
            b10 = b();
        }
        return b10;
    }

    public final boolean g(T t10) {
        boolean z10;
        synchronized (this) {
            if (t10.b() == null) {
                z10 = false;
            } else {
                h(t10.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    public final T h(int i10) {
        T[] tArr = this.f15652a;
        qc.q.f(tArr);
        j(c() - 1);
        if (i10 < c()) {
            m(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                qc.q.f(t10);
                T t11 = tArr[i11];
                qc.q.f(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m(i10, i11);
                    l(i11);
                }
            }
            k(i10);
        }
        T t12 = tArr[c()];
        qc.q.f(t12);
        t12.f(null);
        t12.setIndex(-1);
        tArr[c()] = null;
        return t12;
    }

    public final T i() {
        T t10;
        synchronized (this) {
            if (c() > 0) {
                t10 = h(0);
            } else {
                t10 = null;
            }
        }
        return t10;
    }
}
