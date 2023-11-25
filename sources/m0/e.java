package m0;

import ec.o;
import java.util.Arrays;
import java.util.ListIterator;
import qc.q;

/* compiled from: PersistentVector.kt */
/* loaded from: classes.dex */
public final class e<E> extends b<E> {

    /* renamed from: m  reason: collision with root package name */
    private final Object[] f19706m;

    /* renamed from: p  reason: collision with root package name */
    private final Object[] f19707p;

    /* renamed from: q  reason: collision with root package name */
    private final int f19708q;

    /* renamed from: r  reason: collision with root package name */
    private final int f19709r;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        boolean z10;
        int h10;
        q.i(objArr, "root");
        q.i(objArr2, "tail");
        this.f19706m = objArr;
        this.f19707p = objArr2;
        this.f19708q = i10;
        this.f19709r = i11;
        if (size() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int size = size() - l.d(size());
            h10 = vc.l.h(objArr2.length, 32);
            p0.a.a(size <= h10);
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
    }

    private final Object[] f(int i10) {
        if (r() <= i10) {
            return this.f19707p;
        }
        Object[] objArr = this.f19706m;
        for (int i11 = this.f19709r; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            q.g(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] i(Object[] objArr, int i10, int i11, Object obj, d dVar) {
        Object[] copyOf;
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                q.h(copyOf, "copyOf(this, newSize)");
            }
            o.i(objArr, copyOf, a10 + 1, a10, 31);
            dVar.b(objArr[31]);
            copyOf[a10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        q.h(copyOf2, "copyOf(this, newSize)");
        int i12 = i10 - 5;
        Object obj2 = objArr[a10];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        q.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a10] = i((Object[]) obj2, i12, i11, obj, dVar);
        int i13 = a10 + 1;
        while (i13 < 32 && copyOf2[i13] != null) {
            Object obj3 = objArr[i13];
            q.g(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i13] = i((Object[]) obj3, i12, 0, dVar.a(), dVar);
            i13++;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    private final e<E> j(Object[] objArr, int i10, Object obj) {
        int size = size() - r();
        Object[] copyOf = Arrays.copyOf(this.f19707p, 32);
        q.h(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            o.i(this.f19707p, copyOf, i10 + 1, i10, size);
            copyOf[i10] = obj;
            return new e<>(objArr, copyOf, size() + 1, this.f19709r);
        }
        Object[] objArr2 = this.f19707p;
        Object obj2 = objArr2[31];
        o.i(objArr2, copyOf, i10 + 1, i10, size - 1);
        copyOf[i10] = obj;
        return m(objArr, copyOf, l.c(obj2));
    }

    private final Object[] k(Object[] objArr, int i10, int i11, d dVar) {
        Object[] k10;
        int a10 = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            k10 = null;
        } else {
            Object obj = objArr[a10];
            q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            k10 = k((Object[]) obj, i10 - 5, i11, dVar);
        }
        if (k10 == null && a10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        q.h(copyOf, "copyOf(this, newSize)");
        copyOf[a10] = k10;
        return copyOf;
    }

    private final l0.f<E> l(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                q.h(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] k10 = k(objArr, i11, i10 - 1, dVar);
        q.f(k10);
        Object a10 = dVar.a();
        q.g(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        if (k10[1] == null) {
            Object obj = k10[0];
            q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new e((Object[]) obj, objArr2, i10, i11 - 5);
        }
        return new e(k10, objArr2, i10, i11);
    }

    private final e<E> m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f19709r;
        if (size > (1 << i10)) {
            Object[] c10 = l.c(objArr);
            int i11 = this.f19709r + 5;
            return new e<>(n(c10, i11, objArr2), objArr3, size() + 1, i11);
        }
        return new e<>(n(objArr, i10, objArr2), objArr3, size() + 1, this.f19709r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] n(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
            int r0 = m0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            qc.q.h(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.n(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.n(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] o(Object[] objArr, int i10, int i11, d dVar) {
        Object[] copyOf;
        int a10 = l.a(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            if (a10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                q.h(copyOf, "copyOf(this, newSize)");
            }
            o.i(objArr, copyOf, a10, a10 + 1, 32);
            copyOf[31] = dVar.a();
            dVar.b(objArr[a10]);
            return copyOf;
        }
        if (objArr[31] == null) {
            i12 = l.a(r() - 1, i10);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        q.h(copyOf2, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj = copyOf2[i12];
                q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i12] = o((Object[]) obj, i13, 0, dVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf2[a10];
        q.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a10] = o((Object[]) obj2, i13, i11, dVar);
        return copyOf2;
    }

    private final l0.f<E> p(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int size = size() - i10;
        if (i12 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        p0.a.a(z10);
        if (size == 1) {
            return l(objArr, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(this.f19707p, 32);
        q.h(copyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            o.i(this.f19707p, copyOf, i12, i12 + 1, size);
        }
        copyOf[i13] = null;
        return new e(objArr, copyOf, (i10 + size) - 1, i11);
    }

    private final int r() {
        return l.d(size());
    }

    private final Object[] s(Object[] objArr, int i10, int i11, Object obj) {
        int a10 = l.a(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        q.h(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[a10] = obj;
        } else {
            Object obj2 = copyOf[a10];
            q.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a10] = s((Object[]) obj2, i10 - 5, i11, obj);
        }
        return copyOf;
    }

    @Override // l0.f
    public l0.f<E> L(int i10) {
        p0.d.a(i10, size());
        int r10 = r();
        if (i10 >= r10) {
            return p(this.f19706m, r10, this.f19709r, i10 - r10);
        }
        return p(o(this.f19706m, this.f19709r, i10, new d(this.f19707p[0])), r10, this.f19709r, 0);
    }

    @Override // ec.a
    public int a() {
        return this.f19708q;
    }

    @Override // java.util.Collection, java.util.List, l0.f
    public l0.f<E> add(E e10) {
        int size = size() - r();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f19707p, 32);
            q.h(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e10;
            return new e(this.f19706m, copyOf, size() + 1, this.f19709r);
        }
        return m(this.f19706m, this.f19707p, l.c(e10));
    }

    @Override // ec.c, java.util.List
    public E get(int i10) {
        p0.d.a(i10, size());
        return (E) f(i10)[i10 & 31];
    }

    @Override // l0.f
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public f<E> builder() {
        return new f<>(this, this.f19706m, this.f19707p, this.f19709r);
    }

    @Override // ec.c, java.util.List
    public ListIterator<E> listIterator(int i10) {
        p0.d.b(i10, size());
        return new g(this.f19706m, this.f19707p, i10, size(), (this.f19709r / 5) + 1);
    }

    @Override // ec.c, java.util.List
    public l0.f<E> set(int i10, E e10) {
        p0.d.a(i10, size());
        if (r() <= i10) {
            Object[] copyOf = Arrays.copyOf(this.f19707p, 32);
            q.h(copyOf, "copyOf(this, newSize)");
            copyOf[i10 & 31] = e10;
            return new e(this.f19706m, copyOf, size(), this.f19709r);
        }
        return new e(s(this.f19706m, this.f19709r, i10, e10), this.f19707p, size(), this.f19709r);
    }

    @Override // l0.f
    public l0.f<E> z(pc.l<? super E, Boolean> lVar) {
        q.i(lVar, "predicate");
        f<E> builder = builder();
        builder.J(lVar);
        return builder.build();
    }

    @Override // java.util.List, l0.f
    public l0.f<E> add(int i10, E e10) {
        p0.d.b(i10, size());
        if (i10 == size()) {
            return add((e<E>) e10);
        }
        int r10 = r();
        if (i10 >= r10) {
            return j(this.f19706m, i10 - r10, e10);
        }
        d dVar = new d(null);
        return j(i(this.f19706m, this.f19709r, i10, e10, dVar), 0, dVar.a());
    }
}
