package androidx.collection;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f1815r = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f1816f;

    /* renamed from: m  reason: collision with root package name */
    private int[] f1817m;

    /* renamed from: p  reason: collision with root package name */
    private Object[] f1818p;

    /* renamed from: q  reason: collision with root package name */
    private int f1819q;

    public h() {
        this(10);
    }

    private void f() {
        int i10 = this.f1819q;
        int[] iArr = this.f1817m;
        Object[] objArr = this.f1818p;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f1815r) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f1816f = false;
        this.f1819q = i11;
    }

    public void a(int i10, E e10) {
        int i11 = this.f1819q;
        if (i11 != 0 && i10 <= this.f1817m[i11 - 1]) {
            n(i10, e10);
            return;
        }
        if (this.f1816f && i11 >= this.f1817m.length) {
            f();
        }
        int i12 = this.f1819q;
        if (i12 >= this.f1817m.length) {
            int e11 = c.e(i12 + 1);
            int[] iArr = new int[e11];
            Object[] objArr = new Object[e11];
            int[] iArr2 = this.f1817m;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1818p;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1817m = iArr;
            this.f1818p = objArr;
        }
        this.f1817m[i12] = i10;
        this.f1818p[i12] = e10;
        this.f1819q = i12 + 1;
    }

    public void b() {
        int i10 = this.f1819q;
        Object[] objArr = this.f1818p;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f1819q = 0;
        this.f1816f = false;
    }

    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f1817m = (int[]) this.f1817m.clone();
            hVar.f1818p = (Object[]) this.f1818p.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean d(int i10) {
        if (i(i10) >= 0) {
            return true;
        }
        return false;
    }

    public boolean e(E e10) {
        if (j(e10) >= 0) {
            return true;
        }
        return false;
    }

    public E g(int i10) {
        return h(i10, null);
    }

    public E h(int i10, E e10) {
        E e11;
        int a10 = c.a(this.f1817m, this.f1819q, i10);
        if (a10 >= 0 && (e11 = (E) this.f1818p[a10]) != f1815r) {
            return e11;
        }
        return e10;
    }

    public int i(int i10) {
        if (this.f1816f) {
            f();
        }
        return c.a(this.f1817m, this.f1819q, i10);
    }

    public int j(E e10) {
        if (this.f1816f) {
            f();
        }
        for (int i10 = 0; i10 < this.f1819q; i10++) {
            if (this.f1818p[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public boolean k() {
        if (q() == 0) {
            return true;
        }
        return false;
    }

    public int l(int i10) {
        if (this.f1816f) {
            f();
        }
        return this.f1817m[i10];
    }

    public void n(int i10, E e10) {
        int a10 = c.a(this.f1817m, this.f1819q, i10);
        if (a10 >= 0) {
            this.f1818p[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f1819q;
        if (i11 < i12) {
            Object[] objArr = this.f1818p;
            if (objArr[i11] == f1815r) {
                this.f1817m[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f1816f && i12 >= this.f1817m.length) {
            f();
            i11 = ~c.a(this.f1817m, this.f1819q, i10);
        }
        int i13 = this.f1819q;
        if (i13 >= this.f1817m.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f1817m;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1818p;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1817m = iArr;
            this.f1818p = objArr2;
        }
        int i14 = this.f1819q;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f1817m;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f1818p;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f1819q - i11);
        }
        this.f1817m[i11] = i10;
        this.f1818p[i11] = e10;
        this.f1819q++;
    }

    public void o(int i10) {
        Object[] objArr = this.f1818p;
        Object obj = objArr[i10];
        Object obj2 = f1815r;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f1816f = true;
        }
    }

    public E p(int i10, E e10) {
        int i11 = i(i10);
        if (i11 >= 0) {
            Object[] objArr = this.f1818p;
            E e11 = (E) objArr[i11];
            objArr[i11] = e10;
            return e11;
        }
        return null;
    }

    public int q() {
        if (this.f1816f) {
            f();
        }
        return this.f1819q;
    }

    public E r(int i10) {
        if (this.f1816f) {
            f();
        }
        return (E) this.f1818p[i10];
    }

    public String toString() {
        if (q() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f1819q * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f1819q; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(l(i10));
            sb2.append('=');
            E r10 = r(i10);
            if (r10 != this) {
                sb2.append(r10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public h(int i10) {
        this.f1816f = false;
        if (i10 == 0) {
            this.f1817m = c.f1797a;
            this.f1818p = c.f1799c;
            return;
        }
        int e10 = c.e(i10);
        this.f1817m = new int[e10];
        this.f1818p = new Object[e10];
    }
}
