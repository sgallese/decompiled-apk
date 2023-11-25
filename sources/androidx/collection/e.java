package androidx.collection;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f1803r = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1804f;

    /* renamed from: m  reason: collision with root package name */
    private long[] f1805m;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f1806p;

    /* renamed from: q  reason: collision with root package name */
    private int f1807q;

    public e() {
        this(10);
    }

    private void e() {
        int i10 = this.f1807q;
        long[] jArr = this.f1805m;
        Object[] objArr = this.f1806p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1803r) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1804f = false;
        this.f1807q = i11;
    }

    public void a(long j10, E e10) {
        int i10 = this.f1807q;
        if (i10 != 0 && j10 <= this.f1805m[i10 - 1]) {
            k(j10, e10);
            return;
        }
        if (this.f1804f && i10 >= this.f1805m.length) {
            e();
        }
        int i11 = this.f1807q;
        if (i11 >= this.f1805m.length) {
            int f10 = c.f(i11 + 1);
            long[] jArr = new long[f10];
            Object[] objArr = new Object[f10];
            long[] jArr2 = this.f1805m;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1806p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1805m = jArr;
            this.f1806p = objArr;
        }
        this.f1805m[i11] = j10;
        this.f1806p[i11] = e10;
        this.f1807q = i11 + 1;
    }

    public void b() {
        int i10 = this.f1807q;
        Object[] objArr = this.f1806p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1807q = 0;
        this.f1804f = false;
    }

    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1805m = (long[]) this.f1805m.clone();
            eVar.f1806p = (Object[]) this.f1806p.clone();
            return eVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(long j10) {
        if (h(j10) >= 0) {
            return true;
        }
        return false;
    }

    public E f(long j10) {
        return g(j10, null);
    }

    public E g(long j10, E e10) {
        E e11;
        int b10 = c.b(this.f1805m, this.f1807q, j10);
        if (b10 >= 0 && (e11 = (E) this.f1806p[b10]) != f1803r) {
            return e11;
        }
        return e10;
    }

    public int h(long j10) {
        if (this.f1804f) {
            e();
        }
        return c.b(this.f1805m, this.f1807q, j10);
    }

    public boolean i() {
        if (o() == 0) {
            return true;
        }
        return false;
    }

    public long j(int i10) {
        if (this.f1804f) {
            e();
        }
        return this.f1805m[i10];
    }

    public void k(long j10, E e10) {
        int b10 = c.b(this.f1805m, this.f1807q, j10);
        if (b10 >= 0) {
            this.f1806p[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f1807q;
        if (i10 < i11) {
            Object[] objArr = this.f1806p;
            if (objArr[i10] == f1803r) {
                this.f1805m[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f1804f && i11 >= this.f1805m.length) {
            e();
            i10 = ~c.b(this.f1805m, this.f1807q, j10);
        }
        int i12 = this.f1807q;
        if (i12 >= this.f1805m.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f1805m;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1806p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1805m = jArr;
            this.f1806p = objArr2;
        }
        int i13 = this.f1807q;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f1805m;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f1806p;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f1807q - i10);
        }
        this.f1805m[i10] = j10;
        this.f1806p[i10] = e10;
        this.f1807q++;
    }

    public void l(long j10) {
        int b10 = c.b(this.f1805m, this.f1807q, j10);
        if (b10 >= 0) {
            Object[] objArr = this.f1806p;
            Object obj = objArr[b10];
            Object obj2 = f1803r;
            if (obj != obj2) {
                objArr[b10] = obj2;
                this.f1804f = true;
            }
        }
    }

    public void n(int i10) {
        Object[] objArr = this.f1806p;
        Object obj = objArr[i10];
        Object obj2 = f1803r;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1804f = true;
        }
    }

    public int o() {
        if (this.f1804f) {
            e();
        }
        return this.f1807q;
    }

    public E p(int i10) {
        if (this.f1804f) {
            e();
        }
        return (E) this.f1806p[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1807q * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1807q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            E p10 = p(i10);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public e(int i10) {
        this.f1804f = false;
        if (i10 == 0) {
            this.f1805m = c.f1798b;
            this.f1806p = c.f1799c;
            return;
        }
        int f10 = c.f(i10);
        this.f1805m = new long[f10];
        this.f1806p = new Object[f10];
    }
}
